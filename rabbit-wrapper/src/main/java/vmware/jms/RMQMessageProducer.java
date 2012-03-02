package vmware.jms;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RMQMessageProducer implements MessageProducer {

    @Override
    public void close() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public int getDeliveryMode() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public Destination getDestination() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public boolean getDisableMessageID() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public boolean getDisableMessageTimestamp() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public int getPriority() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public long getTimeToLive() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void send(Message arg0) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void send(Destination arg0, Message arg1) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void send(Message arg0, int arg1, int arg2, long arg3) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void send(Destination arg0, Message arg1, int arg2, int arg3, long arg4) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void setDeliveryMode(int arg0) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void setDisableMessageID(boolean arg0) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void setDisableMessageTimestamp(boolean arg0) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void setPriority(int arg0) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void setTimeToLive(long arg0) throws JMSException {
        throw new NotImplementedException();
    }

}
