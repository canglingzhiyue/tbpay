package tb;

import com.alibaba.motu.tbrest.d;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class bxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final AtomicInteger INTEGER = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    public static ScheduledExecutorService f26174a = null;
    public static int b = 1;

    /* loaded from: classes.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f26175a;

        public a(int i) {
            this.f26175a = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            int andIncrement = bxy.INTEGER.getAndIncrement();
            Thread thread = new Thread(runnable, "CrashReporterAdapter:" + andIncrement);
            thread.setPriority(this.f26175a);
            return thread;
        }
    }

    public synchronized void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            return;
        }
        if (f26174a == null) {
            f26174a = Executors.newScheduledThreadPool(3, new a(b));
            if (d.a().f3151a != null && "true".equals(d.a().f3151a.getSharedPreferences("BizErrorReport", 0).getString("allowCoreThreadTimeOut", "true")) && (f26174a instanceof ThreadPoolExecutor)) {
                ((ThreadPoolExecutor) f26174a).setKeepAliveTime(3L, TimeUnit.SECONDS);
                ((ThreadPoolExecutor) f26174a).allowCoreThreadTimeOut(true);
            }
        }
        f26174a.submit(runnable);
    }
}
