package vmware.jms;

import java.io.Serializable;

import javax.jms.JMSException;
import javax.jms.ObjectMessage;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RMQObjectMessage extends RMQMessage implements ObjectMessage {

    @Override
    public Serializable getObject() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void setObject(Serializable arg0) throws JMSException {
        throw new NotImplementedException();
    }

}
