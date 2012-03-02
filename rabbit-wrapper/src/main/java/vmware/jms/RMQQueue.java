package vmware.jms;

import javax.jms.JMSException;
import javax.jms.Queue;

public class RMQQueue implements Queue {

    String queueName;

    public RMQQueue(String nameFromProps) {
        this.queueName = nameFromProps;
    }

    @Override
    public String getQueueName() throws JMSException {
        return queueName;
    }

}
