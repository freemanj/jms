package vmware.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RMQMessageConsumer implements MessageConsumer {

    @Override
    public void close() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public MessageListener getMessageListener() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public String getMessageSelector() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public Message receive() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public Message receive(long arg0) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public Message receiveNoWait() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void setMessageListener(MessageListener arg0) throws JMSException {
        throw new NotImplementedException();
    }

}
