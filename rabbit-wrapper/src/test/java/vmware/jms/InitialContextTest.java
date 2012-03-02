package vmware.jms;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.Properties;

import javax.jms.DeliveryMode;
import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueReceiver;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.Test;

import vmware.jms.context.RMQContext;

public class InitialContextTest {

    private static final String FAKE_JNDI_BROKER_NAME_FOR_TEST = "local-broker";

    @Test
    public void testSimpleSend() {
        Context ctx;
        Queue queue = null;
        // lookup the queue connection factory
        QueueConnectionFactory connFactory = null;
        Properties env = createProperties();
        try {
            // we will ignore most of the properties because we we are wired to the underlying AMQP impl
            // some folks connect with no properties because they use jndi.properties
            // The ctx will delegate to our RMQContext via the factory configured above
            ctx = new InitialContext(env);
            // lookup the queue object
            queue = (Queue) ctx.lookup("queue0");
            connFactory = (QueueConnectionFactory) ctx.lookup(FAKE_JNDI_BROKER_NAME_FOR_TEST);
        } catch (NamingException e) {
            e.printStackTrace();
            fail(e.getLocalizedMessage());
        }

        try {
            // create a queue connection
            QueueConnection queueConn;
            queueConn = connFactory.createQueueConnection();

            // create a queue session
            QueueSession queueSession = queueConn.createQueueSession(false, Session.DUPS_OK_ACKNOWLEDGE);

            // create a queue sender
            QueueSender queueSender = queueSession.createSender(queue);
            queueSender.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

            // create a simple message to say "Hello"
            TextMessage message = queueSession.createTextMessage("Hello");

            // send the message
            queueSender.send(message);

            // print what we did
            System.out.println("sent: " + message.getText());

            // close the queue connection
            queueConn.close();

        } catch (JMSException e) {
            e.printStackTrace();
            fail(e.getLocalizedMessage());
        }
    }

    private Properties createProperties() {
        // could fill in JNDI provider specific properties
        Properties env = new Properties();
        // plug in our RMQContextFactory that generates RMQContext
        env.put(Context.INITIAL_CONTEXT_FACTORY, "vmware.jms.context.RMQContextFactory");
        // could be in properties. use the AMQP binding string isthead of JMS
        env.put(RMQContext.CONNECTIONFACTORY_PREFIX + FAKE_JNDI_BROKER_NAME_FOR_TEST,
                "amqp://guest:guest@localhost/testpath");
        env.put(RMQContext.CONNECTIONFACTORY_PREFIX + FAKE_JNDI_BROKER_NAME_FOR_TEST, "amqp://localhost");
        // this is a queue , not a topic
        env.put(RMQContext.QUEUE_PREFIX + "queue0", "my-queue-0");
        return env;
    }

    @Test
    public void testSimpleSynchronousReceive() {
        Context ctx;
        Queue queue = null;
        // lookup the queue connection factory
        QueueConnectionFactory connFactory = null;
        Properties env = createProperties();

        try {
            // get the initial context
            ctx = new InitialContext(env);
            // lookup the queue object
            queue = (Queue) ctx.lookup("queue0");
            // lookup the queue connection factory
            connFactory = (QueueConnectionFactory) ctx.lookup(FAKE_JNDI_BROKER_NAME_FOR_TEST);
        } catch (NamingException e) {
            e.printStackTrace();
            fail(e.getLocalizedMessage());
        }

        try {
            // create a queue connection
            QueueConnection queueConn = connFactory.createQueueConnection();

            // create a queue session
            QueueSession queueSession = queueConn.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);

            // create a queue receiver
            QueueReceiver queueReceiver = queueSession.createReceiver(queue);

            // start the connection
            queueConn.start();

            // receive a message
            TextMessage message = (TextMessage) queueReceiver.receive();

            // print the message
            System.out.println("received: " + message.getText());

            // close the queue connection
            queueConn.close();

            assertNotNull(message.getText());

        } catch (JMSException e) {
            e.printStackTrace();
            fail(e.getLocalizedMessage());
        }

    }
}
