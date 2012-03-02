package vmware.jms;

import javax.jms.ExceptionListener;
import javax.jms.JMSException;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RMQExceptionListener implements ExceptionListener {

    @Override
    public void onException(JMSException arg0) {
        throw new NotImplementedException();
    }

}
