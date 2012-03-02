package vmware.jms;

import javax.jms.JMSException;
import javax.jms.ServerSession;
import javax.jms.Session;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RMQServerSession implements ServerSession {

    @Override
    public Session getSession() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void start() throws JMSException {
        throw new NotImplementedException();
    }

}
