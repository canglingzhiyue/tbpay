package com.taobao.pexode.entity;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import tb.kge;
import tb.qol;

/* loaded from: classes7.dex */
public class d extends RewindableStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f18705a;
    public boolean b;
    private int c;
    private int d;
    private int e;
    private byte[] f;
    private final boolean g;
    private boolean h;

    static {
        kge.a(-1391948456);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.pexode.entity.RewindableStream
    public int getBufferOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c05bef63", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.pexode.entity.RewindableStream
    public FileDescriptor getFD() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileDescriptor) ipChange.ipc$dispatch("141de563", new Object[]{this});
        }
        return null;
    }

    public d(InputStream inputStream, int i) {
        this(3, inputStream, i);
    }

    public d(int i, InputStream inputStream, int i2) {
        super(i);
        this.f18705a = inputStream;
        this.g = this.f18705a.markSupported();
        a(i2);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.c = i;
        if (!this.g) {
            return;
        }
        this.f18705a.mark(this.c);
    }

    @Override // com.taobao.pexode.entity.RewindableStream
    public byte[] getBuffer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("99e867c0", new Object[]{this}) : this.f;
    }

    @Override // com.taobao.pexode.entity.RewindableStream
    public int getBufferLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c696436", new Object[]{this})).intValue();
        }
        int i = this.d;
        return i > 0 ? i : this.c;
    }

    @Override // com.taobao.pexode.entity.RewindableStream
    public void rewind() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51a1bc2", new Object[]{this});
            return;
        }
        if (this.g) {
            this.f18705a.reset();
        } else if (this.e > this.d) {
            throw new IOException("cannot rewind cause input stream offset too far");
        }
        this.e = 0;
        this.h = false;
    }

    @Override // com.taobao.pexode.entity.RewindableStream
    public void rewindAndSetBufferSize(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9e5fb15", new Object[]{this, new Integer(i)});
            return;
        }
        rewind();
        a(i);
    }

    private int a(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb6ab7c2", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        int min = Math.min(i2, this.d - this.e);
        System.arraycopy(this.f, this.e, bArr, i, min);
        this.e += min;
        return min;
    }

    private int b(byte[] bArr, int i, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4faf26c3", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        int min = Math.min(i2, this.c - this.d);
        int i3 = this.d + min;
        byte[] bArr2 = this.f;
        if (bArr2 == null || i3 > bArr2.length) {
            byte[] a2 = com.taobao.pexode.c.a().a(Math.min(i3 + min, this.c));
            byte[] bArr3 = this.f;
            if (bArr3 != null) {
                System.arraycopy(bArr3, 0, a2, 0, this.d);
                com.taobao.pexode.c.a().a(this.f);
            }
            this.f = a2;
        }
        int i4 = 0;
        int i5 = -1;
        while (true) {
            int i6 = this.e;
            int read = this.f18705a.read(this.f, i6, min - i4);
            if (read < 0) {
                this.h = true;
                qol.e(com.taobao.pexode.d.TAG, "bufferAndWriteTo() read stream end -1 now", new Object[0]);
                break;
            }
            if (read > 0) {
                this.d += read;
                this.e = this.d;
                System.arraycopy(this.f, i6, bArr, i + i4, read);
            }
            i5 = i4 + read;
            if (i5 == min) {
                break;
            }
            i4 = i5;
        }
        return i5;
    }

    private int c(byte[] bArr, int i, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3f395c4", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        int read = this.f18705a.read(bArr, i, i2);
        if (read < 0) {
            this.h = true;
            return -1;
        }
        if (read > 0) {
            this.e += read;
            com.taobao.pexode.c.a().a(this.f);
            this.f = null;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int c;
        int b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33620bf7", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        if (bArr == null || i < 0 || i2 <= 0) {
            throw new IOException("read parameters illegal");
        }
        int i4 = -1;
        if (this.h) {
            return -1;
        }
        if (!this.g) {
            if (this.e < this.d) {
                i4 = a(bArr, i, i2);
                i3 = i2 - i4;
            } else {
                i3 = i2;
            }
            if (i3 > 0 && this.d < this.c && (b = b(bArr, (i + i2) - i3, i3)) >= 0) {
                i3 -= b;
                i4 = i4 < 0 ? b : i4 + b;
            }
        } else {
            i3 = i2;
        }
        return (this.h || i3 <= 0 || (c = c(bArr, (i + i2) - i3, i3)) < 0) ? i4 : i4 < 0 ? c : i4 + c;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc382310", new Object[]{this})).intValue();
        }
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) <= 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        this.f18705a.close();
        this.b = true;
    }
}
