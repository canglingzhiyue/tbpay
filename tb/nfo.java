package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes7.dex */
public class nfo implements Closeable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f31425a;
    private final Charset b;
    private byte[] c;
    private int d;
    private int e;

    static {
        kge.a(-998832740);
        kge.a(-1811054506);
    }

    public static /* synthetic */ Charset a(nfo nfoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Charset) ipChange.ipc$dispatch("ff018c83", new Object[]{nfoVar}) : nfoVar.b;
    }

    public nfo(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public nfo(InputStream inputStream, int i, Charset charset) {
        if (inputStream != null) {
            if (charset == null) {
                throw new NullPointerException("charset == null");
            }
            if (i < 0) {
                throw new IllegalArgumentException("capacity <= 0");
            }
            if (!charset.equals(nfm.f31422a) && !charset.equals(nfm.b) && !charset.equals(nfm.c)) {
                throw new IllegalArgumentException("Unsupported encoding");
            }
            this.f31425a = inputStream;
            this.b = charset;
            this.c = new byte[i];
            return;
        }
        throw new NullPointerException("in == null");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        synchronized (this.f31425a) {
            if (this.c != null) {
                this.c = null;
                this.f31425a.close();
            }
        }
    }

    public String a() throws IOException {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        synchronized (this.f31425a) {
            if (this.c == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.d >= this.e) {
                c();
            }
            for (int i3 = this.d; i3 != this.e; i3++) {
                if (this.c[i3] == 10) {
                    if (i3 != this.d) {
                        i2 = i3 - 1;
                        if (this.c[i2] == 13) {
                            String str = new String(this.c, this.d, i2 - this.d, this.b);
                            this.d = i3 + 1;
                            return str;
                        }
                    }
                    i2 = i3;
                    String str2 = new String(this.c, this.d, i2 - this.d, this.b);
                    this.d = i3 + 1;
                    return str2;
                }
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((this.e - this.d) + 80) { // from class: tb.nfo.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.io.ByteArrayOutputStream
                public String toString() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (String) ipChange2.ipc$dispatch("8126d80d", new Object[]{this});
                    }
                    return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count - 1] != 13) ? this.count : this.count - 1, nfo.a(nfo.this));
                }
            };
            loop1: while (true) {
                byteArrayOutputStream.write(this.c, this.d, this.e - this.d);
                this.e = -1;
                c();
                i = this.d;
                while (i != this.e) {
                    if (this.c[i] == 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            if (i != this.d) {
                byteArrayOutputStream.write(this.c, this.d, i - this.d);
            }
            this.d = i + 1;
            return byteArrayOutputStream.toString();
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.e == -1;
    }

    private void c() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        InputStream inputStream = this.f31425a;
        byte[] bArr = this.c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.d = 0;
        this.e = read;
    }
}
