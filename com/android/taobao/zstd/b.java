package com.android.taobao.zstd;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class b extends FilterInputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public byte[] f6411a;
    public boolean b;
    private ZstdStreamInflater c;
    private boolean d;
    private final byte[] e;
    private final byte[] f;

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f11b06c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public b(InputStream inputStream, ZstdStreamInflater zstdStreamInflater, int i) {
        super(inputStream);
        this.b = false;
        this.d = false;
        this.e = new byte[1];
        this.f = new byte[512];
        Zstd.b();
        if (inputStream == null || zstdStreamInflater == null) {
            throw new NullPointerException();
        }
        if (i <= 0) {
            throw new IllegalArgumentException("buffer size <= 0");
        }
        this.c = zstdStreamInflater;
        this.f6411a = new byte[i];
    }

    public b(InputStream inputStream, ZstdStreamInflater zstdStreamInflater) {
        this(inputStream, zstdStreamInflater, 16384);
    }

    public b(InputStream inputStream) {
        this(inputStream, new ZstdStreamInflater());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException, ZstdException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc382310", new Object[]{this})).intValue();
        }
        b();
        if (read(this.e, 0, 1) != -1) {
            return this.e[0] & 255;
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException, ZstdException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9ed24497", new Object[]{this, bArr})).intValue() : read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws NullPointerException, IndexOutOfBoundsException, IOException, ZstdException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33620bf7", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        b();
        if (bArr == null) {
            throw new NullPointerException();
        }
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        while (true) {
            int decompress = this.c.decompress(bArr, i, i2);
            if (decompress != 0) {
                return decompress;
            }
            if (this.c.frameFinished()) {
                if (available() > 0) {
                    a();
                } else {
                    this.d = true;
                    return -1;
                }
            } else if (this.c.allInputDecompressed()) {
                a();
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f9282c3", new Object[]{this})).intValue();
        }
        b();
        return this.in.available() > 0 ? 1 : 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a0434f2", new Object[]{this, new Long(j)})).longValue();
        }
        if (j < 0) {
            throw new IllegalArgumentException("negative skip length");
        }
        b();
        int min = (int) Math.min(j, 2147483647L);
        int i = 0;
        while (true) {
            if (i >= min) {
                break;
            }
            int i2 = min - i;
            byte[] bArr = this.f;
            if (i2 > bArr.length) {
                i2 = bArr.length;
            }
            int read = read(this.f, 0, i2);
            if (read == -1) {
                this.d = true;
                break;
            }
            i += read;
        }
        return i;
    }

    public void a() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        b();
        InputStream inputStream = this.in;
        byte[] bArr = this.f6411a;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException("Unexpected end of ZSTD input stream");
        }
        this.c.setInput(this.f6411a, 0, read);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52db0af", new Object[]{this, new Integer(i)});
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        IpChange ipChange = $ipChange;
        if (!(ipChange instanceof IpChange)) {
            throw new IOException("mark/reset not supported");
        }
        ipChange.ipc$dispatch("788e6256", new Object[]{this});
    }

    private void b() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.b) {
            throw new IOException("Zstd Stream closed");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            a(true);
        }
    }

    public synchronized void a(boolean z) throws IOException, ZstdException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!this.b) {
            this.c.close();
            if (z) {
                this.in.close();
            }
            this.b = true;
        }
    }
}
