package vmware.jms;

import javax.jms.ConnectionConsumer;
import javax.jms.JMSException;
import javax.jms.ServerSessionPool;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RMQConnectionConsumer implements ConnectionConsumer {

    @Override
    public void close() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public ServerSessionPool getServerSessionPool() throws JMSException {
        throw new NotImplementedException();
    }

}
