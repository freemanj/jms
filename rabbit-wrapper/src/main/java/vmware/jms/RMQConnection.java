package vmware.jms;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Map;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ShutdownListener;
import com.rabbitmq.client.ShutdownSignalException;

public class RMQConnection implements Connection {

    @Override
    public void addShutdownListener(ShutdownListener arg0) {
        throw new NotImplementedException();
    }

    @Override
    public ShutdownSignalException getCloseReason() {
        throw new NotImplementedException();
    }

    @Override
    public boolean isOpen() {
        throw new NotImplementedException();
    }

    @Override
    public void notifyListeners() {
        throw new NotImplementedException();
    }

    @Override
    public void removeShutdownListener(ShutdownListener arg0) {
        throw new NotImplementedException();
    }

    @Override
    public void abort() {
        throw new NotImplementedException();
    }

    @Override
    public void abort(int arg0) {
        throw new NotImplementedException();
    }

    @Override
    public void abort(int arg0, String arg1) {
        throw new NotImplementedException();
    }

    @Override
    public void abort(int arg0, String arg1, int arg2) {
        throw new NotImplementedException();
    }

    @Override
    public void close() throws IOException {
        throw new NotImplementedException();
    }

    @Override
    public void close(int arg0) throws IOException {
        throw new NotImplementedException();
    }

    @Override
    public void close(int arg0, String arg1) throws IOException {
        throw new NotImplementedException();
    }

    @Override
    public void close(int arg0, String arg1, int arg2) throws IOException {
        throw new NotImplementedException();
    }

    @Override
    public Channel createChannel() throws IOException {
        throw new NotImplementedException();
    }

    @Override
    public Channel createChannel(int arg0) throws IOException {
        throw new NotImplementedException();
    }

    @Override
    public InetAddress getAddress() {
        throw new NotImplementedException();
    }

    @Override
    public int getChannelMax() {
        throw new NotImplementedException();
    }

    @Override
    public Map<String, Object> getClientProperties() {
        throw new NotImplementedException();
    }

    @Override
    public int getFrameMax() {
        throw new NotImplementedException();
    }

    @Override
    public int getHeartbeat() {
        throw new NotImplementedException();
    }

    @Override
    public int getPort() {
        throw new NotImplementedException();
    }

    @Override
    public Map<String, Object> getServerProperties() {
        throw new NotImplementedException();
    }

}
