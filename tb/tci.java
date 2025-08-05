package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class tci extends OutputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final OutputStream f34022a;

    static {
        kge.a(-1995255502);
    }

    public tci(OutputStream outputStream) {
        this.f34022a = outputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            this.f34022a.close();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
        } else {
            this.f34022a.flush();
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10cfa82d", new Object[]{this, bArr});
        } else {
            this.f34022a.write(bArr);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b94b14d", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
        } else {
            this.f34022a.write(bArr, i, i2);
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7403add", new Object[]{this, new Integer(i)});
        } else {
            this.f34022a.write(i);
        }
    }

    public void a(byte b) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8217954", new Object[]{this, new Byte(b)});
        } else {
            this.f34022a.write(b);
        }
    }

    public void a(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        a((byte) (i >> 24));
        a((byte) (i >> 16));
        a((byte) (i >> 8));
        a((byte) i);
    }

    public void a(long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        a((byte) (j >> 56));
        a((byte) (j >> 48));
        a((byte) (j >> 40));
        a((byte) (j >> 32));
        a((byte) (j >> 24));
        a((byte) (j >> 16));
        a((byte) (j >> 8));
        a((byte) j);
    }

    public void a(byte b, int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0e242f", new Object[]{this, new Byte(b), new Integer(i)});
            return;
        }
        a(b);
        a(i);
    }
}
