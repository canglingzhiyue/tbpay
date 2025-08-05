package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class dci {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f26682a;
    private static volatile ScheduledThreadPoolExecutor b;
    private static volatile ScheduledThreadPoolExecutor c;
    private static volatile ScheduledThreadPoolExecutor d;
    private static final Map<String, ScheduledThreadPoolExecutor> e;

    public static /* synthetic */ AtomicInteger d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("54c8e015", new Object[0]) : f26682a;
    }

    static {
        kge.a(2013930512);
        f26682a = new AtomicInteger();
        e = new ConcurrentHashMap();
    }

    public static ScheduledThreadPoolExecutor a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("3d786545", new Object[]{str});
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = e.get(str);
        synchronized (com.taobao.accs.common.a.class) {
            if (scheduledThreadPoolExecutor == null) {
                scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new a("ACCS-SYNC-Q-" + str));
                scheduledThreadPoolExecutor.setKeepAliveTime(10L, TimeUnit.SECONDS);
                scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
                e.put(str, scheduledThreadPoolExecutor);
            }
        }
        return scheduledThreadPoolExecutor;
    }

    public static ScheduledThreadPoolExecutor a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("f6ff4fcf", new Object[0]);
        }
        if (b == null) {
            synchronized (com.taobao.accs.common.a.class) {
                if (b == null) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new a("ACCS-SYNC-SCHEDULE"));
                    b = scheduledThreadPoolExecutor;
                    scheduledThreadPoolExecutor.setKeepAliveTime(10L, TimeUnit.SECONDS);
                    b.allowCoreThreadTimeOut(true);
                }
            }
        }
        return b;
    }

    public static ScheduledThreadPoolExecutor b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("111ace6e", new Object[0]);
        }
        if (c == null) {
            synchronized (com.taobao.accs.common.a.class) {
                if (c == null) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new a("ACCS-SYNC-IO"));
                    c = scheduledThreadPoolExecutor;
                    scheduledThreadPoolExecutor.setKeepAliveTime(10L, TimeUnit.SECONDS);
                    c.allowCoreThreadTimeOut(true);
                }
            }
        }
        return c;
    }

    public static ScheduledThreadPoolExecutor c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("2b364d0d", new Object[0]);
        }
        if (d == null) {
            synchronized (com.taobao.accs.common.a.class) {
                if (d == null) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(3, new a("ACCS-SYNC-OUTER"));
                    d = scheduledThreadPoolExecutor;
                    scheduledThreadPoolExecutor.setKeepAliveTime(10L, TimeUnit.SECONDS);
                    d.allowCoreThreadTimeOut(true);
                }
            }
        }
        return d;
    }

    /* loaded from: classes.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f26683a;

        static {
            kge.a(2006055742);
            kge.a(-1938806936);
        }

        public a(String str) {
            this.f26683a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            int andIncrement = dci.d().getAndIncrement();
            Thread thread = new Thread(runnable, this.f26683a + andIncrement);
            thread.setPriority(5);
            return thread;
        }
    }
}
