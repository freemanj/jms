package vmware.jms;

import javax.jms.ConnectionConsumer;
import javax.jms.ConnectionMetaData;
import javax.jms.Destination;
import javax.jms.ExceptionListener;
import javax.jms.JMSException;
import javax.jms.ServerSessionPool;
import javax.jms.Session;
import javax.jms.Topic;
import javax.jms.TopicSession;
import javax.jms.XASession;
import javax.jms.XATopicConnection;
import javax.jms.XATopicSession;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RMQXATopicConnection implements XATopicConnection {

    @Override
    public Session createSession(boolean arg0, int arg1) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public XASession createXASession() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void close() throws JMSException {
        throw new NotImplementedException();
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
        throw new NotImplementedException();
    }

    @Override
    public void stop() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public ConnectionConsumer createConnectionConsumer(Topic arg0, String arg1, ServerSessionPool arg2, int arg3)
            throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public TopicSession createTopicSession(boolean arg0, int arg1) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public XATopicSession createXATopicSession() throws JMSException {
        throw new NotImplementedException();
    }

}
