package com.alibaba.security.ccrc.service.build;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.alibaba.security.ccrc.service.build.t  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1249t {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3327a = "ThreadUtils";
    public static final ThreadPoolExecutor b;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, (Runtime.getRuntime().availableProcessors() << 1) + 1, 10L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new Ka("wukong_thread_pool"));
        b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static Future<?> a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("f9227d7c", new Object[]{runnable}) : b.submit(new RunnableC1241q(runnable));
    }

    public static void a(Runnable runnable, long j, InterfaceC1232n interfaceC1232n) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24522c20", new Object[]{runnable, new Long(j), interfaceC1232n});
        } else if (interfaceC1232n.a()) {
            runnable.run();
        } else {
            new Timer().schedule(new C1246s(a(new r(interfaceC1232n, new CountDownLatch(1), runnable))), j);
        }
    }
}
