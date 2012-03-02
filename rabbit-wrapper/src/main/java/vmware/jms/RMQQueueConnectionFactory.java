package vmware.jms;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import com.rabbitmq.client.ConnectionFactory;

public class RMQQueueConnectionFactory implements QueueConnectionFactory {

    String amqpUrl;

    public RMQQueueConnectionFactory(String amqpUrl) {
        this.amqpUrl = amqpUrl;
    }

    @Override
    public Connection createConnection() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public Connection createConnection(String arg0, String arg1) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public QueueConnection createQueueConnection() throws JMSException {
        ConnectionFactory factory = new ConnectionFactory();
        try {
            factory.setUri(amqpUrl);
        } catch (KeyManagementException e) {
            e.printStackTrace();
            throw new JMSException("failed to set amqp factory uri " + amqpUrl + " -" + e.getMessage());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            throw new JMSException("failed to set amqp factory uri " + amqpUrl + " -" + e.getMessage());
        } catch (URISyntaxException e) {
            e.printStackTrace();
            throw new JMSException("failed to set amqp factory uri " + amqpUrl + " -" + e.getMessage());
        }
        try {
            com.rabbitmq.client.Connection conn = factory.newConnection();
            return new RMQQueueConnection(conn);
        } catch (IOException e) {
            e.printStackTrace();
            throw new JMSException("failed to creat amqp connection uri " + amqpUrl + " -" + e.getMessage());
        }
    }

    @Override
    public QueueConnection createQueueConnection(String arg0, String arg1) throws JMSException {
        throw new NotImplementedException();
    }

}
