package vmware.jms;

import javax.jms.JMSException;
import javax.jms.XAConnection;
import javax.jms.XAConnectionFactory;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RMQXAConnectionFactory implements XAConnectionFactory {

    @Override
    public XAConnection createXAConnection() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public XAConnection createXAConnection(String arg0, String arg1) throws JMSException {
        throw new NotImplementedException();
    }

}
