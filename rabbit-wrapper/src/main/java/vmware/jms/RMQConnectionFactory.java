package vmware.jms;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RMQConnectionFactory implements ConnectionFactory {

    @Override
    public Connection createConnection() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public Connection createConnection(String arg0, String arg1) throws JMSException {
        throw new NotImplementedException();
    }

}
