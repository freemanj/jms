package vmware.jms;

import javax.jms.JMSException;
import javax.jms.ServerSession;
import javax.jms.ServerSessionPool;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RMQServerSessionPool implements ServerSessionPool {

    @Override
    public ServerSession getServerSession() throws JMSException {
        throw new NotImplementedException();
    }

}
