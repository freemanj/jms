package vmware.jms;

import java.io.Serializable;

import javax.jms.BytesMessage;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.QueueBrowser;
import javax.jms.Session;
import javax.jms.StreamMessage;
import javax.jms.TemporaryQueue;
import javax.jms.TemporaryTopic;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicSubscriber;
import javax.jms.XASession;
import javax.transaction.xa.XAResource;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RMQXASession implements XASession {

    @Override
    public void close() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public QueueBrowser createBrowser(Queue arg0) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public QueueBrowser createBrowser(Queue arg0, String arg1) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public BytesMessage createBytesMessage() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public MessageConsumer createConsumer(Destination arg0) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public MessageConsumer createConsumer(Destination arg0, String arg1) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public MessageConsumer createConsumer(Destination arg0, String arg1, boolean arg2) throws JMSException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TopicSubscriber createDurableSubscriber(Topic arg0, String arg1) throws JMSException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TopicSubscriber createDurableSubscriber(Topic arg0, String arg1, String arg2, boolean arg3)
            throws JMSException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public MapMessage createMapMessage() throws JMSException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Message createMessage() throws JMSException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ObjectMessage createObjectMessage() throws JMSException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ObjectMessage createObjectMessage(Serializable arg0) throws JMSException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public MessageProducer createProducer(Destination arg0) throws JMSException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Queue createQueue(String arg0) throws JMSException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public StreamMessage createStreamMessage() throws JMSException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TemporaryQueue createTemporaryQueue() throws JMSException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TemporaryTopic createTemporaryTopic() throws JMSException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TextMessage createTextMessage() throws JMSException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TextMessage createTextMessage(String arg0) throws JMSException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Topic createTopic(String arg0) throws JMSException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getAcknowledgeMode() throws JMSException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public MessageListener getMessageListener() throws JMSException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void recover() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void run() {
        throw new NotImplementedException();
    }

    @Override
    public void setMessageListener(MessageListener arg0) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void unsubscribe(String arg0) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void commit() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public Session getSession() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public boolean getTransacted() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public XAResource getXAResource() {
        throw new NotImplementedException();
    }

    @Override
    public void rollback() throws JMSException {
        throw new NotImplementedException();
    }

}
