package vmware.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Topic;
import javax.jms.TopicSubscriber;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RMQTopicSubscriber implements TopicSubscriber {

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

    @Override
    public boolean getNoLocal() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public Topic getTopic() throws JMSException {
        throw new NotImplementedException();
    }

}
