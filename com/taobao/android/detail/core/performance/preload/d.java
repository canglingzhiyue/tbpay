package com.taobao.android.detail.core.performance.preload;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ThreadPoolExecutor f9795a;

    static {
        kge.a(72627762);
    }

    public d() {
        emu.a("com.taobao.android.detail.core.performance.preload.ExecutorServiceFactory");
    }

    public synchronized ExecutorService a(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("c9c7a3c9", new Object[]{this, new Integer(i), new Integer(i2), str});
        }
        if (this.f9795a == null) {
            this.f9795a = new ThreadPoolExecutor(i, Integer.MAX_VALUE, i2, TimeUnit.SECONDS, new LinkedBlockingDeque(), a(str, false));
            this.f9795a.allowCoreThreadTimeOut(true);
        }
        return this.f9795a;
    }

    private static ThreadFactory a(final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadFactory) ipChange.ipc$dispatch("f2e0e9fb", new Object[]{str, new Boolean(z)}) : new ThreadFactory() { // from class: com.taobao.android.detail.core.performance.preload.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
    }
}
