package com.alipay.android.msp.framework.okio;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import tb.riy;

/* loaded from: classes3.dex */
public abstract class ForwardingSink implements Sink {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Sink f4823a;

    public ForwardingSink(Sink sink) {
        if (sink == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f4823a = sink;
    }

    public final Sink delegate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Sink) ipChange.ipc$dispatch("e5d04126", new Object[]{this}) : this.f4823a;
    }

    @Override // com.alipay.android.msp.framework.okio.Sink
    public void write(Buffer buffer, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a312ef", new Object[]{this, buffer, new Long(j)});
        } else {
            this.f4823a.write(buffer, j);
        }
    }

    @Override // com.alipay.android.msp.framework.okio.Sink
    public void flush() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
        } else {
            this.f4823a.flush();
        }
    }

    @Override // com.alipay.android.msp.framework.okio.Sink
    public Timeout timeout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Timeout) ipChange.ipc$dispatch("21cbd5f8", new Object[]{this}) : this.f4823a.timeout();
    }

    @Override // com.alipay.android.msp.framework.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            this.f4823a.close();
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return getClass().getSimpleName() + riy.BRACKET_START_STR + this.f4823a.toString() + riy.BRACKET_END_STR;
    }
}
