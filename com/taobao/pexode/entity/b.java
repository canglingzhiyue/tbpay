package com.taobao.pexode.entity;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.FileDescriptor;
import java.io.IOException;
import tb.kge;

/* loaded from: classes7.dex */
public class b extends RewindableStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private byte[] f18704a;
    private int b;
    private int c;
    private int d;
    private final int e;

    static {
        kge.a(383036287);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        }
    }

    @Override // com.taobao.pexode.entity.RewindableStream
    public FileDescriptor getFD() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileDescriptor) ipChange.ipc$dispatch("141de563", new Object[]{this});
        }
        return null;
    }

    public b(byte[] bArr, int i, int i2) {
        super(1);
        this.f18704a = bArr;
        this.b = i;
        this.c = i;
        int i3 = i2 + i;
        byte[] bArr2 = this.f18704a;
        this.d = i3 > bArr2.length ? bArr2.length : i3;
        this.e = i;
    }

    @Override // com.taobao.pexode.entity.RewindableStream
    public void rewind() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51a1bc2", new Object[]{this});
        } else {
            this.b = this.e;
        }
    }

    @Override // com.taobao.pexode.entity.RewindableStream
    public void rewindAndSetBufferSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9e5fb15", new Object[]{this, new Integer(i)});
        } else {
            rewind();
        }
    }

    @Override // com.taobao.pexode.entity.RewindableStream
    public byte[] getBuffer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("99e867c0", new Object[]{this}) : this.f18704a;
    }

    @Override // com.taobao.pexode.entity.RewindableStream
    public int getBufferOffset() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c05bef63", new Object[]{this})).intValue() : this.e;
    }

    @Override // com.taobao.pexode.entity.RewindableStream
    public int getBufferLength() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2c696436", new Object[]{this})).intValue() : this.d;
    }

    @Override // java.io.InputStream
    public synchronized int available() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f9282c3", new Object[]{this})).intValue();
        }
        return this.d - this.b;
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52db0af", new Object[]{this, new Integer(i)});
        } else {
            this.c = this.b;
        }
    }

    @Override // java.io.InputStream
    public synchronized int read() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc382310", new Object[]{this})).intValue();
        }
        if (this.b < this.d) {
            byte[] bArr = this.f18704a;
            int i2 = this.b;
            this.b = i2 + 1;
            i = bArr[i2] & 255;
        } else {
            i = -1;
        }
        return i;
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33620bf7", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        } else if (this.b >= this.d) {
            return -1;
        } else {
            if (i2 == 0) {
                return 0;
            }
            if (this.d - this.b < i2) {
                i2 = this.d - this.b;
            }
            System.arraycopy(this.f18704a, this.b, bArr, i, i2);
            this.b += i2;
            return i2;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            this.b = this.c;
        }
    }

    @Override // java.io.InputStream
    public synchronized long skip(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a0434f2", new Object[]{this, new Long(j)})).longValue();
        } else if (j <= 0) {
            return 0L;
        } else {
            int i = this.b;
            this.b = ((long) (this.d - this.b)) < j ? this.d : (int) (this.b + j);
            return this.b - i;
        }
    }
}
