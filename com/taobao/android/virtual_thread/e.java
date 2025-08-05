package com.taobao.android.virtual_thread;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ThreadFactory;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class e implements ThreadFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(172979827);
        kge.a(-1938806936);
    }

    public abstract VirtualThread a(Runnable runnable);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : a(runnable);
    }
}
