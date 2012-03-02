package vmware.jms;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.TopicConnection;
import javax.jms.XAConnection;
import javax.jms.XATopicConnection;
import javax.jms.XATopicConnectionFactory;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RMQXATopicConnectionFactory implements XATopicConnectionFactory {

    @Override
    public XAConnection createXAConnection() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public XAConnection createXAConnection(String arg0, String arg1) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public TopicConnection createTopicConnection() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public TopicConnection createTopicConnection(String arg0, String arg1) throws JMSException {
        throw new NotImplementedException();
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
    public XATopicConnection createXATopicConnection() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public XATopicConnection createXATopicConnection(String arg0, String arg1) throws JMSException {
        throw new NotImplementedException();
    }

}
