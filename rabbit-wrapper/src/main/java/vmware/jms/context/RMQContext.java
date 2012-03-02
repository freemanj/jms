package vmware.jms.context;

import java.util.Hashtable;
import java.util.Properties;

import javax.jms.ConnectionFactory;
import javax.jms.Queue;
import javax.jms.QueueConnectionFactory;
import javax.jms.Topic;
import javax.naming.Binding;
import javax.naming.Context;
import javax.naming.Name;
import javax.naming.NameClassPair;
import javax.naming.NameParser;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import vmware.jms.RMQQueue;
import vmware.jms.RMQQueueConnectionFactory;
import vmware.jms.RMQTopic;

public class RMQContext implements Context {

    Hashtable<?, ?> properties = new Properties();

    public static final String QUEUE_PREFIX = "queue.";
    public static final String TOPIC_PREFIX = "topic.";
    public static final String CONNECTIONFACTORY_PREFIX = "connectionfactory.";

    public RMQContext(Hashtable<?, ?> properties) {
        this.properties = properties;
    }

    @Override
    public Object addToEnvironment(String arg0, Object arg1) throws NamingException {
        throw new NotImplementedException();
    }

    @Override
    public void bind(Name arg0, Object arg1) throws NamingException {
        throw new NotImplementedException();
    }

    @Override
    public void bind(String arg0, Object arg1) throws NamingException {
        throw new NotImplementedException();
    }

    @Override
    public void close() throws NamingException {
        throw new NotImplementedException();
    }

    @Override
    public Name composeName(Name arg0, Name arg1) throws NamingException {
        throw new NotImplementedException();
    }

    @Override
    public String composeName(String arg0, String arg1) throws NamingException {
        throw new NotImplementedException();
    }

    @Override
    public Context createSubcontext(Name arg0) throws NamingException {
        throw new NotImplementedException();
    }

    @Override
    public Context createSubcontext(String arg0) throws NamingException {
        throw new NotImplementedException();
    }

    @Override
    public void destroySubcontext(Name arg0) throws NamingException {
        throw new NotImplementedException();
    }

    @Override
    public void destroySubcontext(String arg0) throws NamingException {
        throw new NotImplementedException();
    }

    @Override
    public Hashtable<?, ?> getEnvironment() throws NamingException {
        throw new NotImplementedException();
    }

    @Override
    public String getNameInNamespace() throws NamingException {
        throw new NotImplementedException();
    }

    @Override
    public NameParser getNameParser(Name arg0) throws NamingException {
        throw new NotImplementedException();
    }

    @Override
    public NameParser getNameParser(String arg0) throws NamingException {
        throw new NotImplementedException();
    }

    @Override
    public NamingEnumeration<NameClassPair> list(Name arg0) throws NamingException {
        throw new NotImplementedException();
    }

    @Override
    public NamingEnumeration<NameClassPair> list(String arg0) throws NamingException {
        throw new NotImplementedException();
    }

    @Override
    public NamingEnumeration<Binding> listBindings(Name arg0) throws NamingException {
        throw new NotImplementedException();
    }

    @Override
    public NamingEnumeration<Binding> listBindings(String arg0) throws NamingException {
        throw new NotImplementedException();
    }

    @Override
    public Object lookup(Name arg0) throws NamingException {

        throw new NotImplementedException();
    }

    @Override
    public Object lookup(String arg0) throws NamingException {
        Object result;
        ConnectionFactory connectionFactory = findConnectionFactoryForName(arg0);
        if (connectionFactory != null) {
            result = connectionFactory;
        } else {
            Queue queue = findQueueForName(arg0);
            if (queue != null) {
                result = queue;
            } else {
                Topic topic = findTopicForName(arg0);
                if (topic != null) {
                    result = topic;
                } else {
                    Object somethingElse = properties.get(arg0);
                    if (somethingElse != null) {
                        result = somethingElse;
                    } else {
                        throw new NamingException("Cannot lookup property with partial name " + arg0);
                    }
                }
            }
        }
        return result;
    }

    @Override
    public Object lookupLink(Name arg0) throws NamingException {
        throw new NotImplementedException();
    }

    @Override
    public Object lookupLink(String arg0) throws NamingException {
        throw new NotImplementedException();
    }

    @Override
    public void rebind(Name arg0, Object arg1) throws NamingException {
        throw new NotImplementedException();
    }

    @Override
    public void rebind(String arg0, Object arg1) throws NamingException {
        throw new NotImplementedException();
    }

    @Override
    public Object removeFromEnvironment(String arg0) throws NamingException {
        throw new NotImplementedException();
    }

    @Override
    public void rename(Name arg0, Name arg1) throws NamingException {
        throw new NotImplementedException();
    }

    @Override
    public void rename(String arg0, String arg1) throws NamingException {
        throw new NotImplementedException();
    }

    @Override
    public void unbind(Name arg0) throws NamingException {
        throw new NotImplementedException();
    }

    @Override
    public void unbind(String arg0) throws NamingException {
        throw new NotImplementedException();
    }

    /*
     * 
     */

    private Topic findTopicForName(String arg0) {
        String nameFromProps = (String) properties.get(TOPIC_PREFIX + arg0);
        if (nameFromProps != null) {
            RMQTopic topic = new RMQTopic(nameFromProps);
            return topic;
        } else {
            return null;
        }
    }

    private Queue findQueueForName(String arg0) {
        String nameFromProps = (String) properties.get(QUEUE_PREFIX + arg0);
        if (nameFromProps != null) {
            RMQQueue queue = new RMQQueue(nameFromProps);
            return queue;
        } else {
            return null;
        }
    }

    private QueueConnectionFactory findConnectionFactoryForName(String arg0) {
        String amqpUrl = (String) properties.get(CONNECTIONFACTORY_PREFIX + arg0);
        if (amqpUrl != null) {
            RMQQueueConnectionFactory factory = new RMQQueueConnectionFactory(amqpUrl);
            return factory;
        } else {
            return null;
        }
    }

}
