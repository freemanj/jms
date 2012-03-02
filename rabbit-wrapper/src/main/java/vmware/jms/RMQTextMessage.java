package vmware.jms;

import javax.jms.JMSException;
import javax.jms.TextMessage;

public class RMQTextMessage extends RMQMessage implements TextMessage {

    byte message[];

    public RMQTextMessage(String message) {
        this.message = message.getBytes();
    }

    public RMQTextMessage(byte[] message) {
        this.message = message;
    }

    public RMQTextMessage() {
        this.message = "".getBytes();
    }

    @Override
    public String getText() throws JMSException {
        return new String(message);
    }

    @Override
    public void setText(String arg0) throws JMSException {
        message = arg0.getBytes();
    }

}
