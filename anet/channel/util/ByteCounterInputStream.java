package anet.channel.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import tb.kge;

/* loaded from: classes.dex */
public class ByteCounterInputStream extends InputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long cnt = 0;
    private InputStream is;

    static {
        kge.a(-182617532);
    }

    public ByteCounterInputStream(InputStream inputStream) {
        this.is = null;
        if (inputStream == null) {
            throw new NullPointerException("input stream cannot be null");
        }
        this.is = inputStream;
    }

    public long getReadByteCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("45773f36", new Object[]{this})).longValue() : this.cnt;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc382310", new Object[]{this})).intValue();
        }
        this.cnt++;
        return this.is.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33620bf7", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        int read = this.is.read(bArr, i, i2);
        if (read != -1) {
            this.cnt += read;
        }
        return read;
    }

    public ByteArrayOutputStream getByteArrayOutputStream(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        IOException e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteArrayOutputStream) ipChange.ipc$dispatch("903df488", new Object[]{this, str});
        }
        try {
            try {
                byte[] bArr = new byte[1024];
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int read = this.is.read(bArr);
                        if (read != -1) {
                            byteArrayOutputStream.write(bArr, 0, read);
                        } else {
                            try {
                                break;
                            } catch (Throwable th) {
                                ALog.e("ByteCounterInputStream", "inputStream close fail, e=" + th.toString(), str, new Object[0]);
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                        ALog.e("ByteCounterInputStream", "inputStream io fail, e=" + e.toString(), str, new Object[0]);
                        try {
                            if (this.is != null) {
                                this.is.close();
                            }
                        } catch (Throwable th2) {
                            ALog.e("ByteCounterInputStream", "inputStream close fail, e=" + th2.toString(), str, new Object[0]);
                        }
                        return byteArrayOutputStream;
                    }
                }
                if (this.is != null) {
                    this.is.close();
                }
            } catch (IOException e3) {
                byteArrayOutputStream = null;
                e = e3;
            }
            return byteArrayOutputStream;
        } catch (Throwable th3) {
            try {
                if (this.is != null) {
                    this.is.close();
                }
            } catch (Throwable th4) {
                ALog.e("ByteCounterInputStream", "inputStream close fail, e=" + th4.toString(), str, new Object[0]);
            }
            throw th3;
        }
    }
}
