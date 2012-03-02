package vmware.jms;

import java.io.IOException;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Queue;
import javax.jms.QueueReceiver;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.GetResponse;

public class RMQQueueReceiver implements QueueReceiver {

    com.rabbitmq.client.Channel channel;
    Queue queueDefinition;

    public RMQQueueReceiver(com.rabbitmq.client.Channel channel, Queue queueDefinition) {
        this.channel = channel;
        this.queueDefinition = queueDefinition;
    }

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
        boolean autoAck = false;
        try {
            GetResponse amqpResponse = channel.basicGet(queueDefinition.getQueueName(), autoAck);
            AMQP.BasicProperties props = amqpResponse.getProps();
            byte[] body = amqpResponse.getBody();
            long deliveryTag = amqpResponse.getEnvelope().getDeliveryTag();
            channel.basicAck(deliveryTag, false);
            // how do we know what data type to use?
            return new RMQTextMessage(new String(body));
        } catch (IOException e) {
            e.printStackTrace();
            throw new JMSException("Unable to get response " + e.getLocalizedMessage());
        }
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
    public Queue getQueue() throws JMSException {
        throw new NotImplementedException();
    }

}
