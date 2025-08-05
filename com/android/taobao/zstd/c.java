package com.android.taobao.zstd;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class c extends FilterOutputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public byte[] f6412a;
    public boolean b;
    private ZstdStreamDeflater c;
    private final boolean d;
    private boolean e;

    public c(OutputStream outputStream, ZstdStreamDeflater zstdStreamDeflater, int i, boolean z) {
        super(outputStream);
        this.e = false;
        this.b = false;
        Zstd.b();
        if (outputStream == null || zstdStreamDeflater == null) {
            throw new NullPointerException();
        }
        if (i <= 0) {
            throw new IllegalArgumentException("buffer size <= 0");
        }
        this.c = zstdStreamDeflater;
        this.f6412a = new byte[i];
        this.d = z;
    }

    public c(OutputStream outputStream, ZstdStreamDeflater zstdStreamDeflater, boolean z) {
        this(outputStream, zstdStreamDeflater, 16384, z);
    }

    public c(OutputStream outputStream, ZstdStreamDeflater zstdStreamDeflater) {
        this(outputStream, zstdStreamDeflater, 16384, false);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException, ZstdException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7403add", new Object[]{this, new Integer(i)});
        } else {
            write(new byte[]{(byte) i}, 0, 1);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException, ZstdException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10cfa82d", new Object[]{this, bArr});
        } else {
            write(bArr, 0, bArr.length);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) throws IndexOutOfBoundsException, IOException, ZstdException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b94b14d", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = i + i2;
        if ((i | i2 | i3 | (bArr.length - i3)) < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return;
        }
        if (this.c.allInputCompressed()) {
            this.c.setInput(bArr, i, i2);
            while (!this.c.allInputCompressed()) {
                a();
            }
        }
    }

    public void a() throws IOException, ZstdException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ZstdStreamDeflater zstdStreamDeflater = this.c;
        byte[] bArr = this.f6412a;
        int compress = zstdStreamDeflater.compress(bArr, 0, bArr.length);
        if (compress <= 0) {
            return;
        }
        this.out.write(this.f6412a, 0, compress);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public synchronized void flush() throws IOException, ZstdException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
        } else if (this.d) {
            do {
                int flush = this.c.flush(this.f6412a, 0, this.f6412a.length);
                if (flush > 0) {
                    this.out.write(this.f6412a, 0, flush);
                }
            } while (this.c.remainCompressedData());
            this.out.flush();
        } else {
            this.out.flush();
        }
    }

    public synchronized void b() throws IOException, ZstdException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        do {
            int finish = this.c.finish(this.f6412a, 0, this.f6412a.length);
            if (finish > 0) {
                this.out.write(this.f6412a, 0, finish);
            }
        } while (this.c.remainCompressedData());
        this.c.reset();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException, ZstdException {
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
        if (!this.e) {
            b();
            if (this.b) {
                this.c.close();
            }
            if (z) {
                this.out.close();
            }
            this.e = true;
        }
    }
}
