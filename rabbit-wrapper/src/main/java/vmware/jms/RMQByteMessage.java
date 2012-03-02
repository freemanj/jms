package vmware.jms;

import javax.jms.BytesMessage;
import javax.jms.JMSException;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RMQByteMessage extends RMQMessage implements BytesMessage {

    @Override
    public long getBodyLength() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public boolean readBoolean() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public byte readByte() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public int readBytes(byte[] arg0) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public int readBytes(byte[] arg0, int arg1) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public char readChar() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public double readDouble() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public float readFloat() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public int readInt() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public long readLong() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public short readShort() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public String readUTF() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public int readUnsignedByte() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public int readUnsignedShort() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void reset() throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void writeBoolean(boolean arg0) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void writeByte(byte arg0) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void writeBytes(byte[] arg0) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void writeBytes(byte[] arg0, int arg1, int arg2) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void writeChar(char arg0) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void writeDouble(double arg0) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void writeFloat(float arg0) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void writeInt(int arg0) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void writeLong(long arg0) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void writeObject(Object arg0) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void writeShort(short arg0) throws JMSException {
        throw new NotImplementedException();
    }

    @Override
    public void writeUTF(String arg0) throws JMSException {
        throw new NotImplementedException();
    }

}
