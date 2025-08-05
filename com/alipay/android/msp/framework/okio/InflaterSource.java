package com.alipay.android.msp.framework.okio;

import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes3.dex */
public final class InflaterSource implements Source {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final BufferedSource f4827a;
    private final Inflater b;
    private int c;
    private boolean d;

    public InflaterSource(Source source, Inflater inflater) {
        this(Okio.buffer(source), inflater);
    }

    public InflaterSource(BufferedSource bufferedSource, Inflater inflater) {
        if (bufferedSource != null) {
            if (inflater == null) {
                throw new IllegalArgumentException("inflater == null");
            }
            this.f4827a = bufferedSource;
            this.b = inflater;
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.alipay.android.msp.framework.okio.Source
    public final long read(Buffer buffer, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4c0cbcc", new Object[]{this, buffer, new Long(j)})).longValue();
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
        if (this.d) {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        }
        if (i == 0) {
            return 0L;
        }
        while (true) {
            boolean refill = refill();
            try {
                Segment a2 = buffer.a(1);
                int inflate = this.b.inflate(a2.f4836a, a2.c, 2048 - a2.c);
                if (inflate > 0) {
                    a2.c += inflate;
                    long j2 = inflate;
                    buffer.b += j2;
                    return j2;
                } else if (this.b.finished() || this.b.needsDictionary()) {
                    break;
                } else if (refill) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        a();
        return -1L;
    }

    public final boolean refill() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c2d2bc1", new Object[]{this})).booleanValue();
        }
        if (!this.b.needsInput()) {
            return false;
        }
        a();
        if (this.b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.f4827a.exhausted()) {
            return true;
        }
        Segment segment = this.f4827a.buffer().f4819a;
        this.c = segment.c - segment.b;
        this.b.setInput(segment.f4836a, segment.b, this.c);
        return false;
    }

    private void a() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        int i = this.c;
        if (i == 0) {
            return;
        }
        int remaining = i - this.b.getRemaining();
        this.c -= remaining;
        this.f4827a.skip(remaining);
    }

    @Override // com.alipay.android.msp.framework.okio.Source
    public final Timeout timeout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Timeout) ipChange.ipc$dispatch("21cbd5f8", new Object[]{this}) : this.f4827a.timeout();
    }

    @Override // com.alipay.android.msp.framework.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (this.d) {
        } else {
            this.b.end();
            this.d = true;
            this.f4827a.close();
        }
    }
}
