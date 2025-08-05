package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public class neu implements nev {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static neu f31405a;
    private final AtomicInteger b = new AtomicInteger(0);
    private final ThreadPoolExecutor c = new ThreadPoolExecutor(5, 5, 3, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: tb.neu.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            int andAdd = neu.a(neu.this).getAndAdd(1);
            long uptimeMillis = SystemClock.uptimeMillis();
            Thread thread = new Thread(runnable, "pha-thread-new-" + neu.a(neu.this));
            ngr.b("FixedThreadHandler", "Current thread id:" + andAdd + ", costs " + (SystemClock.uptimeMillis() - uptimeMillis));
            return thread;
        }
    });

    static {
        kge.a(104379949);
        kge.a(1369009112);
    }

    public static /* synthetic */ AtomicInteger a(neu neuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("990842e4", new Object[]{neuVar}) : neuVar.b;
    }

    private neu() {
        try {
            this.c.allowCoreThreadTimeOut(true);
        } catch (Exception e) {
            ngr.b("FixedThreadHandler", e.getMessage());
        }
    }

    public static neu a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (neu) ipChange.ipc$dispatch("f082f40", new Object[0]);
        }
        if (f31405a == null) {
            synchronized (neu.class) {
                if (f31405a == null) {
                    f31405a = new neu();
                }
            }
        }
        return f31405a;
    }

    @Override // tb.nev
    public Future<?> a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("f9227d7c", new Object[]{this, runnable}) : this.c.submit(runnable);
    }

    @Override // tb.nev
    public <T> Future<T> a(Callable<T> callable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("3135d2bf", new Object[]{this, callable}) : this.c.submit(callable);
    }
}
