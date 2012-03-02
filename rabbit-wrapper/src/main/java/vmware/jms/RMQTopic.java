package vmware.jms;

import javax.jms.JMSException;
import javax.jms.Topic;

public class RMQTopic implements Topic {

    String topicName;

    public RMQTopic(String nameFromProps) {
        this.topicName = nameFromProps;
    }

    @Override
    public String getTopicName() throws JMSException {
        return topicName;
    }

}
