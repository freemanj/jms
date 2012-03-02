package vmware.jms;

import java.io.IOException;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Queue;
import javax.jms.QueueSender;
import javax.jms.TextMessage;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RMQQueueSender implements QueueSender {

    com.rabbitmq.client.Channel channel;
    Queue queueDefinition;

    public RMQQueueSender(com.rabbitmq.client.Channel channel, Queue queueDefinition) {
        this.channel = channel;
        this.queueDefinition = queueDefinition;
    }

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
    public void send(Destination arg0, Message arg1) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void send(Destination arg0, Message arg1, int arg2, int arg3, long arg4) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void setDeliveryMode(int arg0) throws JMSException {
        System.out.println("ignore delivery mode configuration request: " + arg0);
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

    @Override
    public Queue getQueue() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void send(Message arg0) throws JMSException {
        if (arg0 instanceof TextMessage) {
            try {
                channel.basicPublish("", queueDefinition.getQueueName(), null, ((TextMessage) arg0).getText()
                        .getBytes());
            } catch (IOException e) {
                e.printStackTrace();
                throw new JMSException("Failed ot publish text message");
            }
        } else {
            throw new JMSException("only text messages currently supported in RMQQueueSender");
        }
    }

    @Override
    public void send(Queue arg0, Message arg1) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void send(Message arg0, int arg1, int arg2, long arg3) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void send(Queue arg0, Message arg1, int arg2, int arg3, long arg4) throws JMSException {
        throw new NotImplementedException();
    }

}
