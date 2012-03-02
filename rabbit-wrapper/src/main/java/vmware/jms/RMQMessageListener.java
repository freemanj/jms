package vmware.jms;

import javax.jms.Message;
import javax.jms.MessageListener;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RMQMessageListener implements MessageListener {

    @Override
    public void onMessage(Message arg0) {
        throw new NotImplementedException();
    }

}
