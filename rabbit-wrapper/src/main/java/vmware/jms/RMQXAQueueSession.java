package vmware.jms;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.QueueConnection;
import javax.jms.XAConnection;
import javax.jms.XAQueueConnection;
import javax.jms.XAQueueConnectionFactory;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RMQXAQueueSession implements XAQueueConnectionFactory {

    @Override
    public XAConnection createXAConnection() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public XAConnection createXAConnection(String arg0, String arg1) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public QueueConnection createQueueConnection() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public QueueConnection createQueueConnection(String arg0, String arg1) throws JMSException {
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
    public XAQueueConnection createXAQueueConnection() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public XAQueueConnection createXAQueueConnection(String arg0, String arg1) throws JMSException {
        throw new NotImplementedException();
    }

}
