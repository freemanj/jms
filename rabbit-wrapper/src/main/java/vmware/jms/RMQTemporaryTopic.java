package vmware.jms;

import javax.jms.JMSException;
import javax.jms.TemporaryTopic;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RMQTemporaryTopic implements TemporaryTopic {

    @Override
    public String getTopicName() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void delete() throws JMSException {
        throw new NotImplementedException();
    }

}
