package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public class kao {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, ScheduledThreadPoolExecutor> f29917a;
    private static ScheduledThreadPoolExecutor b;

    static {
        kge.a(-898370715);
        f29917a = new ConcurrentHashMap();
        b = null;
    }

    public static ScheduledThreadPoolExecutor a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("f6ff4fcf", new Object[0]);
        }
        if (b == null) {
            b = a(1, "atools");
        }
        return b;
    }

    /* loaded from: classes6.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f29918a;
        private AtomicLong b = new AtomicLong();

        static {
            kge.a(-85688173);
            kge.a(-1938806936);
        }

        public a(String str) {
            this.f29918a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(runnable, this.f29918a + "-" + this.b.incrementAndGet());
            thread.setPriority(5);
            return thread;
        }
    }

    public static ScheduledThreadPoolExecutor a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("b5ff2532", new Object[]{new Integer(i), str});
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = f29917a.get(str);
        if (scheduledThreadPoolExecutor == null) {
            synchronized (f29917a) {
                scheduledThreadPoolExecutor = f29917a.get(str);
                if (scheduledThreadPoolExecutor == null) {
                    scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i, new a(str));
                    scheduledThreadPoolExecutor.setKeepAliveTime(10L, TimeUnit.SECONDS);
                    scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
                    f29917a.put(str, scheduledThreadPoolExecutor);
                }
            }
        }
        return scheduledThreadPoolExecutor;
    }
}
