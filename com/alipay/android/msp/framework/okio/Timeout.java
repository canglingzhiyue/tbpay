package com.alipay.android.msp.framework.okio;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class Timeout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Timeout NONE = new Timeout() { // from class: com.alipay.android.msp.framework.okio.Timeout.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.android.msp.framework.okio.Timeout
        public Timeout deadlineNanoTime(long j) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Timeout) ipChange.ipc$dispatch("96419034", new Object[]{this, new Long(j)}) : this;
        }

        @Override // com.alipay.android.msp.framework.okio.Timeout
        public void throwIfReached() throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee278636", new Object[]{this});
            }
        }

        @Override // com.alipay.android.msp.framework.okio.Timeout
        public Timeout timeout(long j, TimeUnit timeUnit) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Timeout) ipChange.ipc$dispatch("14aab7ec", new Object[]{this, new Long(j), timeUnit}) : this;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private boolean f4838a;
    private long b;
    private long c;

    public Timeout timeout(long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Timeout) ipChange.ipc$dispatch("14aab7ec", new Object[]{this, new Long(j), timeUnit});
        }
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0: ".concat(String.valueOf(j)));
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        this.b = timeUnit.toNanos(j);
        return this;
    }

    public long timeoutNanos() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("71f878d9", new Object[]{this})).longValue() : this.b;
    }

    public boolean hasDeadline() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c5c9429d", new Object[]{this})).booleanValue() : this.f4838a;
    }

    public long deadlineNanoTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5490fe14", new Object[]{this})).longValue();
        }
        if (!this.f4838a) {
            throw new IllegalStateException("No deadline");
        }
        return this.c;
    }

    public Timeout deadlineNanoTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Timeout) ipChange.ipc$dispatch("96419034", new Object[]{this, new Long(j)});
        }
        this.f4838a = true;
        this.c = j;
        return this;
    }

    public final Timeout deadline(long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Timeout) ipChange.ipc$dispatch("21545d23", new Object[]{this, new Long(j), timeUnit});
        }
        if (j <= 0) {
            throw new IllegalArgumentException("duration <= 0: ".concat(String.valueOf(j)));
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        return deadlineNanoTime(System.nanoTime() + timeUnit.toNanos(j));
    }

    public Timeout clearTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Timeout) ipChange.ipc$dispatch("e305b42b", new Object[]{this});
        }
        this.b = 0L;
        return this;
    }

    public Timeout clearDeadline() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Timeout) ipChange.ipc$dispatch("1461ff5c", new Object[]{this});
        }
        this.f4838a = false;
        return this;
    }

    public void throwIfReached() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee278636", new Object[]{this});
        } else if (Thread.interrupted()) {
            throw new InterruptedIOException();
        } else {
            if (this.f4838a && System.nanoTime() > this.c) {
                throw new IOException("deadline reached");
            }
        }
    }
}
