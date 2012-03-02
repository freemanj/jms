package vmware.jms;

import javax.jms.JMSException;
import javax.jms.TemporaryQueue;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RMQTemporaryQueue implements TemporaryQueue {

    @Override
    public String getQueueName() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void delete() throws JMSException {
        throw new NotImplementedException();
    }

}
