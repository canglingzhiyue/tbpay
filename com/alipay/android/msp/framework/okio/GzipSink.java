package com.alipay.android.msp.framework.okio;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* loaded from: classes3.dex */
public final class GzipSink implements Sink {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final BufferedSink f4825a;
    private final Deflater b;
    private final DeflaterSink c;
    private boolean d;
    private final CRC32 e = new CRC32();

    public GzipSink(Sink sink) {
        if (sink == null) {
            throw new IllegalArgumentException("sink == null");
        }
        this.b = new Deflater(-1, true);
        this.f4825a = Okio.buffer(sink);
        this.c = new DeflaterSink(this.f4825a, this.b);
        Buffer buffer = this.f4825a.buffer();
        buffer.mo533writeShort(8075);
        buffer.mo528writeByte(8);
        buffer.mo528writeByte(0);
        buffer.mo529writeInt(0);
        buffer.mo528writeByte(0);
        buffer.mo528writeByte(0);
    }

    @Override // com.alipay.android.msp.framework.okio.Sink
    public final void write(Buffer buffer, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a312ef", new Object[]{this, buffer, new Long(j)});
            return;
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
        if (i == 0) {
            return;
        }
        a(buffer, j);
        this.c.write(buffer, j);
    }

    @Override // com.alipay.android.msp.framework.okio.Sink
    public final void flush() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
        } else {
            this.c.flush();
        }
    }

    @Override // com.alipay.android.msp.framework.okio.Sink
    public final Timeout timeout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Timeout) ipChange.ipc$dispatch("21cbd5f8", new Object[]{this}) : this.f4825a.timeout();
    }

    @Override // com.alipay.android.msp.framework.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (this.d) {
        } else {
            Throwable th = null;
            try {
                this.c.a();
                this.f4825a.mo530writeIntLe((int) this.e.getValue());
                this.f4825a.mo530writeIntLe(this.b.getTotalIn());
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.b.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.f4825a.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                }
            }
            this.d = true;
            if (th == null) {
                return;
            }
            Util.sneakyRethrow(th);
        }
    }

    private void a(Buffer buffer, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("392cf2d", new Object[]{this, buffer, new Long(j)});
            return;
        }
        Segment segment = buffer.f4819a;
        while (j > 0) {
            int min = (int) Math.min(j, segment.c - segment.b);
            this.e.update(segment.f4836a, segment.b, min);
            j -= min;
            segment = segment.d;
        }
    }
}
