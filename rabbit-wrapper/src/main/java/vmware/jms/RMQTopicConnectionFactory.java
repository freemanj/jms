package vmware.jms;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RMQTopicConnectionFactory implements TopicConnectionFactory {

    @Override
    public Connection createConnection() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public Connection createConnection(String arg0, String arg1) throws JMSException {
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

}
