package vmware.jms;

import javax.jms.JMSException;
import javax.jms.Queue;

public class RMQQueue implements Queue {

    /** the name of the queue , used to find the AMQP queue by the same name */
    String queueName;
    /** the message class we create when receiving messages */
    String messageClassName;

    public RMQQueue(String nameFromProps, String messageClassName) {
        this.queueName = nameFromProps;
        this.messageClassName = messageClassName;
    }

    @Override
    public String getQueueName() throws JMSException {
        return queueName;
    }

    public String getMessageClassName() {
        return messageClassName;
    }

}
