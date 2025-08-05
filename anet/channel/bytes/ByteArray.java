package anet.channel.bytes;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import tb.kge;

/* loaded from: classes.dex */
public class ByteArray implements Comparable<ByteArray> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final byte[] buffer;
    public int bufferLength;
    public int dataLength;
    public int rangeIndex;

    static {
        kge.a(-1003315986);
        kge.a(415966670);
    }

    public synchronized int getRangeIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c191bc85", new Object[]{this})).intValue();
        }
        return this.rangeIndex;
    }

    public synchronized void setRangeIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a77ce225", new Object[]{this, new Integer(i)});
        } else {
            this.rangeIndex = i;
        }
    }

    private ByteArray(byte[] bArr, int i) {
        this.buffer = bArr == null ? new byte[i] : bArr;
        this.bufferLength = this.buffer.length;
        this.dataLength = i;
    }

    public static ByteArray create(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteArray) ipChange.ipc$dispatch("15333cf7", new Object[]{new Integer(i)}) : new ByteArray(null, i);
    }

    public static ByteArray wrap(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteArray) ipChange.ipc$dispatch("c0a4770c", new Object[]{bArr, new Integer(i)});
        }
        if (bArr != null && i >= 0 && i <= bArr.length) {
            return new ByteArray(bArr, i);
        }
        return null;
    }

    public static ByteArray wrap(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteArray) ipChange.ipc$dispatch("4331e77f", new Object[]{bArr});
        }
        if (bArr != null) {
            return wrap(bArr, bArr.length);
        }
        return null;
    }

    public byte[] getBuffer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("99e867c0", new Object[]{this}) : this.buffer;
    }

    public int getBufferLength() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2c696436", new Object[]{this})).intValue() : this.bufferLength;
    }

    public int getDataLength() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2bf868a0", new Object[]{this})).intValue() : this.dataLength;
    }

    public void setDataLength(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ebb96a", new Object[]{this, new Integer(i)});
        } else {
            this.dataLength = i;
        }
    }

    public void recycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51af759a", new Object[]{this});
        } else if (this.bufferLength == 0) {
        } else {
            ByteArrayPool.getInstance().refund(this);
        }
    }

    public int readFrom(InputStream inputStream) throws IOException {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("532e71ff", new Object[]{this, inputStream})).intValue();
        }
        int read = inputStream.read(this.buffer, 0, this.bufferLength);
        if (read != -1) {
            i = read;
        }
        this.dataLength = i;
        return read;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90fbe573", new Object[]{this, outputStream});
        } else {
            outputStream.write(this.buffer, 0, this.dataLength);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(ByteArray byteArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa359d3b", new Object[]{this, byteArray})).intValue();
        }
        int i = this.bufferLength;
        int i2 = byteArray.bufferLength;
        if (i != i2) {
            return i - i2;
        }
        if (this.buffer == null) {
            return -1;
        }
        if (byteArray.buffer != null) {
            return hashCode() - byteArray.hashCode();
        }
        return 1;
    }
}
