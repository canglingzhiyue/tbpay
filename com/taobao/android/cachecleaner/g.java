package com.taobao.android.cachecleaner;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes4.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes4.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public static final ScheduledExecutorService f9284a;

        static {
            kge.a(-279576461);
            f9284a = Executors.newSingleThreadScheduledExecutor(new b("cacheClean-init"));
        }
    }

    static {
        kge.a(-1282685043);
    }

    public static ScheduledExecutorService b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("bdd68a4d", new Object[0]);
        }
        if (c.f9284a instanceof ThreadPoolExecutor) {
            ((ThreadPoolExecutor) c.f9284a).allowCoreThreadTimeOut(true);
        }
        return c.f9284a;
    }

    /* loaded from: classes4.dex */
    public static class b implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f9283a;
        private final AtomicInteger b = new AtomicInteger(1);

        static {
            kge.a(1751559273);
            kge.a(-1938806936);
        }

        public b(String str) {
            this.f9283a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, this.f9283a + " #" + this.b.getAndIncrement());
        }
    }
}
