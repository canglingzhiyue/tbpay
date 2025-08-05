package com.alipay.android.msp.framework.okio;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import tb.riy;

/* loaded from: classes3.dex */
public abstract class ForwardingSource implements Source {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Source f4824a;

    public ForwardingSource(Source source) {
        if (source == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f4824a = source;
    }

    public final Source delegate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Source) ipChange.ipc$dispatch("bd68191e", new Object[]{this}) : this.f4824a;
    }

    @Override // com.alipay.android.msp.framework.okio.Source
    public long read(Buffer buffer, long j) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c4c0cbcc", new Object[]{this, buffer, new Long(j)})).longValue() : this.f4824a.read(buffer, j);
    }

    @Override // com.alipay.android.msp.framework.okio.Source
    public Timeout timeout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Timeout) ipChange.ipc$dispatch("21cbd5f8", new Object[]{this}) : this.f4824a.timeout();
    }

    @Override // com.alipay.android.msp.framework.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            this.f4824a.close();
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return getClass().getSimpleName() + riy.BRACKET_START_STR + this.f4824a.toString() + riy.BRACKET_END_STR;
    }
}
