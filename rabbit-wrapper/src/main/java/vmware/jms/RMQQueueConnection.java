package vmware.jms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.jms.ConnectionConsumer;
import javax.jms.ConnectionMetaData;
import javax.jms.Destination;
import javax.jms.ExceptionListener;
import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueSession;
import javax.jms.ServerSessionPool;
import javax.jms.Session;
import javax.jms.Topic;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Corresponds to a rabbitmq Connection
 * 
 * @author freemanj
 * 
 */
public class RMQQueueConnection implements QueueConnection {

    private final com.rabbitmq.client.Connection rabbitConnection;
    private final List<RMQQueueSession> allSessions = new ArrayList<RMQQueueSession>();

    public RMQQueueConnection(com.rabbitmq.client.Connection conn) {
        this.rabbitConnection = conn;
    }

    @Override
    public void close() throws JMSException {
        for (RMQQueueSession oneSession : allSessions) {
            oneSession.close();
        }
        // this is dangerous because it was passed in via the constructor and we don't know if the creator is going to
        // release
        try {
            rabbitConnection.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ConnectionConsumer createConnectionConsumer(Destination arg0, String arg1, ServerSessionPool arg2, int arg3)
            throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public ConnectionConsumer createDurableConnectionConsumer(Topic arg0, String arg1, String arg2,
            ServerSessionPool arg3, int arg4) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public Session createSession(boolean arg0, int arg1) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public String getClientID() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public ExceptionListener getExceptionListener() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public ConnectionMetaData getMetaData() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void setClientID(String arg0) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void setExceptionListener(ExceptionListener arg0) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void start() throws JMSException {
        // no-op nothng to start
    }

    @Override
    public void stop() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public ConnectionConsumer createConnectionConsumer(Queue arg0, String arg1, ServerSessionPool arg2, int arg3)
            throws JMSException {
        throw new NotImplementedException();
    }

    /**
     * Ignores the arguments
     */
    @Override
    public QueueSession createQueueSession(boolean arg0, int arg1) throws JMSException {
        // totally ignoring the arguments because we assume brokers configured correctly externally
        com.rabbitmq.client.Channel channel;
        try {
            channel = rabbitConnection.createChannel();
            RMQQueueSession session = new RMQQueueSession(channel);
            allSessions.add(session);
            return session;
        } catch (IOException e) {
            e.printStackTrace();
            throw new JMSException("unabel to create queue session (rabbitmq channel) " + e.getMessage());
        }
    }
}
