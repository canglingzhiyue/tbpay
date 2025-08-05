package com.taobao.android.dinamicx.template.download;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes5.dex */
public class k implements ThreadFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f11935a;
    private final AtomicInteger b = new AtomicInteger(1);
    private final boolean c;

    static {
        kge.a(834690663);
        kge.a(-1938806936);
    }

    public k(String str, boolean z) {
        this.f11935a = str;
        this.c = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
        }
        if (this.c) {
            return new Thread(runnable, this.f11935a + "#" + this.b.getAndIncrement());
        }
        return new Thread(runnable, this.f11935a);
    }
}
