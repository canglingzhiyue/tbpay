package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class kie {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final int f30094a;
    private static final int b;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final ScheduledExecutorService f30095a;

        static {
            kge.a(-1173669300);
            f30095a = kie.a(new b("computation-threadPool"));
        }
    }

    public static /* synthetic */ ScheduledExecutorService a(ThreadFactory threadFactory) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("95029313", new Object[]{threadFactory}) : b(threadFactory);
    }

    static {
        kge.a(-513382510);
        f30094a = Runtime.getRuntime().availableProcessors();
        b = Math.max(2, Math.min(f30094a - 1, 4));
    }

    public static ScheduledExecutorService a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("7a4b6c8c", new Object[0]) : a.f30095a;
    }

    private static ScheduledExecutorService b(ThreadFactory threadFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("389a454", new Object[]{threadFactory});
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(b, threadFactory);
        scheduledThreadPoolExecutor.setKeepAliveTime(10L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    /* loaded from: classes.dex */
    public static class b implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f30096a;
        private final AtomicInteger b = new AtomicInteger(1);

        static {
            kge.a(355284270);
            kge.a(-1938806936);
        }

        public b(String str) {
            this.f30096a = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, this.f30096a + " #" + this.b.getAndIncrement());
        }
    }
}
