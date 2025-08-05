package tb;

import android.util.Log;
import com.alibaba.security.ccrc.service.build.C1249t;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class cjb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final a f26299a;
    private static final a b;
    private static final ThreadPoolExecutor c;
    private static final ScheduledThreadPoolExecutor d;

    static {
        kge.a(-680465472);
        f26299a = new a("action");
        b = new a("init");
        c = new ThreadPoolExecutor(0, 3, 3L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f26299a, $$Lambda$cjb$GPET1ITIFPPu3IQEp364paLNKfw.INSTANCE);
        d = new ScheduledThreadPoolExecutor(0, b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8106e78a", new Object[]{runnable, threadPoolExecutor});
        } else {
            Log.e(C1249t.f3327a, "reject!");
        }
    }

    /* loaded from: classes.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private AtomicInteger f26300a = new AtomicInteger(1);
        private String b;

        static {
            kge.a(1334176603);
            kge.a(-1938806936);
        }

        public a(String str) {
            this.b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(runnable);
            thread.setName(String.format("#safe-clean-%s-%s", this.b, Integer.valueOf(this.f26300a.getAndIncrement())));
            return thread;
        }
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else {
            c.execute(runnable);
        }
    }

    public static void a(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aab07da", new Object[]{runnable, new Long(j), timeUnit});
        } else {
            d.schedule(runnable, j, timeUnit);
        }
    }
}
