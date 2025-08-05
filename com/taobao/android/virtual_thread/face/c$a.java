package com.taobao.android.virtual_thread.face;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ThreadFactory;
import tb.kge;

/* loaded from: classes6.dex */
public final class c$a implements ThreadFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final h f15811a;

    static {
        kge.a(-828448884);
        kge.a(-1938806936);
    }

    public c$a(h hVar) {
        this.f15811a = hVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, this.f15811a.newThreadName());
    }
}
