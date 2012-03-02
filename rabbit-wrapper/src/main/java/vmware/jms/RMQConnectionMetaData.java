package vmware.jms;

import java.util.Enumeration;

import javax.jms.ConnectionMetaData;
import javax.jms.JMSException;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RMQConnectionMetaData implements ConnectionMetaData {

    @Override
    public int getJMSMajorVersion() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public int getJMSMinorVersion() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public String getJMSProviderName() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public String getJMSVersion() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public Enumeration getJMSXPropertyNames() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public int getProviderMajorVersion() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public int getProviderMinorVersion() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public String getProviderVersion() throws JMSException {
        throw new NotImplementedException();
    }

}
