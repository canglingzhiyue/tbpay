package org.webrtc;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes9.dex */
public class RefCountDelegate implements RefCounted {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final AtomicInteger refCount = new AtomicInteger(1);
    private final Runnable releaseCallback;

    static {
        kge.a(-1968905448);
        kge.a(211517522);
    }

    public RefCountDelegate(Runnable runnable) {
        this.releaseCallback = runnable;
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e496b0c", new Object[]{this});
        } else {
            this.refCount.incrementAndGet();
        }
    }

    @Override // org.webrtc.RefCounted
    public void release() {
        Runnable runnable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else if (this.refCount.decrementAndGet() != 0 || (runnable = this.releaseCallback) == null) {
        } else {
            runnable.run();
        }
    }
}
