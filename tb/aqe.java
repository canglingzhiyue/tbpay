package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class aqe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static aqe f25512a;
    private static ScheduledExecutorService b;
    private static final AtomicInteger c;

    public static /* synthetic */ AtomicInteger b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("69d49393", new Object[0]) : c;
    }

    static {
        kge.a(693315840);
        c = new AtomicInteger();
    }

    /* loaded from: classes.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1114431442);
            kge.a(-1938806936);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            int andIncrement = aqe.b().getAndIncrement();
            return new Thread(runnable, "AppMonitor:" + andIncrement);
        }
    }

    private static synchronized ScheduledExecutorService c() {
        synchronized (aqe.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ScheduledExecutorService) ipChange.ipc$dispatch("161a80e", new Object[0]);
            }
            if (b == null) {
                b = Executors.newScheduledThreadPool(6, new a());
            }
            return b;
        }
    }

    public static synchronized aqe a() {
        synchronized (aqe.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (aqe) ipChange.ipc$dispatch("f027189", new Object[0]);
            }
            if (f25512a == null) {
                f25512a = new aqe();
            }
            return f25512a;
        }
    }

    public final ScheduledFuture a(ScheduledFuture scheduledFuture, Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("767f23a6", new Object[]{this, scheduledFuture, runnable, new Long(j)});
        }
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            scheduledFuture.cancel(true);
        }
        return c().schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    public final ScheduledFuture b(ScheduledFuture scheduledFuture, Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("cf8a6f27", new Object[]{this, scheduledFuture, runnable, new Long(j)});
        }
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            scheduledFuture.cancel(false);
        }
        return c().scheduleAtFixedRate(runnable, 1000L, j, TimeUnit.MILLISECONDS);
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            return;
        }
        try {
            c().submit(runnable);
        } catch (Throwable unused) {
        }
    }
}
