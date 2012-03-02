package vmware.jms;

import java.util.Enumeration;

import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.QueueBrowser;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RMQQueueBrowser implements QueueBrowser {

    @Override
    public void close() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public Enumeration getEnumeration() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public String getMessageSelector() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public Queue getQueue() throws JMSException {
        throw new NotImplementedException();
    }

}
