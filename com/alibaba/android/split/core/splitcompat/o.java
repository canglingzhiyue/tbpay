package com.alibaba.android.split.core.splitcompat;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes.dex */
public final class o implements ThreadFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private AtomicInteger f2459a = new AtomicInteger();

    static {
        kge.a(-33714957);
        kge.a(-1938806936);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
        }
        return new Thread(runnable, "#TbSplitCompatBackgroundThread-" + this.f2459a.incrementAndGet());
    }
}
