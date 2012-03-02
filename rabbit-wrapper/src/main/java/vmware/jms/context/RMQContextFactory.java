package vmware.jms.context;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.Name;
import javax.naming.NamingException;
import javax.naming.spi.InitialContextFactory;
import javax.naming.spi.ObjectFactory;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RMQContextFactory implements ObjectFactory, InitialContextFactory {

    @Override
    public Context getInitialContext(Hashtable<?, ?> properties) throws NamingException {
        return new RMQContext(properties);
    }

    @Override
    public Object getObjectInstance(Object arg0, Name arg1, Context arg2, Hashtable<?, ?> arg3) throws Exception {
        throw new NotImplementedException();
    }

}
