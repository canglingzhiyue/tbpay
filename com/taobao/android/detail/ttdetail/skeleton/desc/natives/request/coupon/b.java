package com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.coupon;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.bf;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ScheduledThreadPoolExecutor b;

    static {
        kge.a(-1857403809);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, a("TaskExecutorTimeOut", false));
        b = scheduledThreadPoolExecutor;
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    private static ThreadFactory a(final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadFactory) ipChange.ipc$dispatch("f2e0e9fb", new Object[]{str, new Boolean(z)}) : new ThreadFactory() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.coupon.b.1
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

    public static Future a(Callable callable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("3135d2bf", new Object[]{callable}) : bf.a(callable);
    }
}
