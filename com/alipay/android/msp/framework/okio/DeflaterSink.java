package com.alipay.android.msp.framework.okio;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.util.zip.Deflater;
import tb.riy;

/* loaded from: classes3.dex */
public final class DeflaterSink implements Sink {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final BufferedSink f4822a;
    private final Deflater b;
    private boolean c;

    public DeflaterSink(Sink sink, Deflater deflater) {
        this(Okio.buffer(sink), deflater);
    }

    public DeflaterSink(BufferedSink bufferedSink, Deflater deflater) {
        if (bufferedSink != null) {
            if (deflater == null) {
                throw new IllegalArgumentException("inflater == null");
            }
            this.f4822a = bufferedSink;
            this.b = deflater;
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.alipay.android.msp.framework.okio.Sink
    public final void write(Buffer buffer, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a312ef", new Object[]{this, buffer, new Long(j)});
            return;
        }
        Util.checkOffsetAndCount(buffer.b, 0L, j);
        while (j > 0) {
            Segment segment = buffer.f4819a;
            int min = (int) Math.min(j, segment.c - segment.b);
            this.b.setInput(segment.f4836a, segment.b, min);
            a(false);
            long j2 = min;
            buffer.b -= j2;
            segment.b += min;
            if (segment.b == segment.c) {
                buffer.f4819a = segment.pop();
                SegmentPool.f4837a.a(segment);
            }
            j -= j2;
        }
    }

    private void a(boolean z) throws IOException {
        int deflate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        Buffer buffer = this.f4822a.buffer();
        while (true) {
            Segment a2 = buffer.a(1);
            if (z) {
                deflate = this.b.deflate(a2.f4836a, a2.c, 2048 - a2.c, 2);
            } else {
                deflate = this.b.deflate(a2.f4836a, a2.c, 2048 - a2.c);
            }
            if (deflate > 0) {
                a2.c += deflate;
                buffer.b += deflate;
                this.f4822a.mo524emitCompleteSegments();
            } else if (this.b.needsInput()) {
                return;
            }
        }
    }

    @Override // com.alipay.android.msp.framework.okio.Sink
    public final void flush() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
            return;
        }
        a(true);
        this.f4822a.flush();
    }

    public final void a() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b.finish();
        a(false);
    }

    @Override // com.alipay.android.msp.framework.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (this.c) {
        } else {
            Throwable th = null;
            try {
                a();
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
                this.f4822a.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                }
            }
            this.c = true;
            if (th == null) {
                return;
            }
            Util.sneakyRethrow(th);
        }
    }

    @Override // com.alipay.android.msp.framework.okio.Sink
    public final Timeout timeout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Timeout) ipChange.ipc$dispatch("21cbd5f8", new Object[]{this}) : this.f4822a.timeout();
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DeflaterSink(" + this.f4822a + riy.BRACKET_END_STR;
    }
}
