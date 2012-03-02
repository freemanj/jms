package vmware.jms;

import javax.jms.JMSException;
import javax.jms.TextMessage;

public class RMQTextMessage extends RMQMessage implements TextMessage {

    String message;

    public RMQTextMessage(String message) {
        this.message = message;
    }

    public RMQTextMessage() {
        this.message = "";
    }

    @Override
    public String getText() throws JMSException {
        return message;
    }

    @Override
    public void setText(String arg0) throws JMSException {
        message = arg0;
    }

}
