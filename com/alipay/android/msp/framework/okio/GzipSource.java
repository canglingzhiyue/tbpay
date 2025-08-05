package com.alipay.android.msp.framework.okio;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes3.dex */
public final class GzipSource implements Source {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final BufferedSource b;
    private final Inflater c;
    private final InflaterSource d;

    /* renamed from: a  reason: collision with root package name */
    private int f4826a = 0;
    private final CRC32 e = new CRC32();

    public GzipSource(Source source) {
        if (source == null) {
            throw new IllegalArgumentException("source == null");
        }
        this.c = new Inflater(true);
        this.b = Okio.buffer(source);
        this.d = new InflaterSource(this.b, this.c);
    }

    @Override // com.alipay.android.msp.framework.okio.Source
    public final long read(Buffer buffer, long j) throws IOException {
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4c0cbcc", new Object[]{this, buffer, new Long(j)})).longValue();
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
        if (i == 0) {
            return 0L;
        }
        if (this.f4826a == 0) {
            this.b.require(10L);
            byte b = this.b.buffer().getByte(3L);
            boolean z = ((b >> 1) & 1) == 1;
            if (z) {
                a(this.b.buffer(), 0L, 10L);
            }
            a("ID1ID2", 8075, this.b.readShort());
            this.b.skip(8L);
            if (((b >> 2) & 1) == 1) {
                this.b.require(2L);
                if (z) {
                    a(this.b.buffer(), 0L, 2L);
                }
                long readShortLe = this.b.buffer().readShortLe();
                this.b.require(readShortLe);
                if (z) {
                    j2 = readShortLe;
                    a(this.b.buffer(), 0L, readShortLe);
                } else {
                    j2 = readShortLe;
                }
                this.b.skip(j2);
            }
            if (((b >> 3) & 1) == 1) {
                long indexOf = this.b.indexOf((byte) 0);
                if (indexOf == -1) {
                    throw new EOFException();
                }
                if (z) {
                    a(this.b.buffer(), 0L, indexOf + 1);
                }
                this.b.skip(indexOf + 1);
            }
            if (((b >> 4) & 1) == 1) {
                long indexOf2 = this.b.indexOf((byte) 0);
                if (indexOf2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    a(this.b.buffer(), 0L, indexOf2 + 1);
                }
                this.b.skip(indexOf2 + 1);
            }
            if (z) {
                a("FHCRC", this.b.readShortLe(), (short) this.e.getValue());
                this.e.reset();
            }
            this.f4826a = 1;
        }
        if (this.f4826a == 1) {
            long j3 = buffer.b;
            long read = this.d.read(buffer, j);
            if (read != -1) {
                a(buffer, j3, read);
                return read;
            }
            this.f4826a = 2;
        }
        if (this.f4826a == 2) {
            a("CRC", this.b.readIntLe(), (int) this.e.getValue());
            a("ISIZE", this.b.readIntLe(), this.c.getTotalOut());
            this.f4826a = 3;
            if (!this.b.exhausted()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // com.alipay.android.msp.framework.okio.Source
    public final Timeout timeout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Timeout) ipChange.ipc$dispatch("21cbd5f8", new Object[]{this}) : this.b.timeout();
    }

    @Override // com.alipay.android.msp.framework.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            this.d.close();
        }
    }

    private void a(Buffer buffer, long j, long j2) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ec78d37", new Object[]{this, buffer, new Long(j), new Long(j2)});
            return;
        }
        Segment segment = buffer.f4819a;
        while (j >= segment.c - segment.b) {
            j -= segment.c - segment.b;
            segment = segment.d;
        }
        while (j2 > 0) {
            int min = (int) Math.min(segment.c - i, j2);
            this.e.update(segment.f4836a, (int) (segment.b + j), min);
            j2 -= min;
            segment = segment.d;
            j = 0;
        }
    }

    private static void a(String str, int i, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3526812", new Object[]{str, new Integer(i), new Integer(i2)});
        } else if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }
}
