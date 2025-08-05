package tao.reactivex.f;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import tb.iqv;
import tb.kge;
import tb.mux;

/* loaded from: classes9.dex */
public final class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f25162a;
    public static final int b;
    public static final AtomicReference<ScheduledExecutorService> c;
    public static final Map<ScheduledThreadPoolExecutor, Object> d;

    /* loaded from: classes9.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1469162591);
            kge.a(-1390502639);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Iterator it = new ArrayList(j.d.keySet()).iterator();
                while (it.hasNext()) {
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                    if (scheduledThreadPoolExecutor.isShutdown()) {
                        j.d.remove(scheduledThreadPoolExecutor);
                    } else {
                        scheduledThreadPoolExecutor.purge();
                    }
                }
            } catch (Throwable th) {
                mux.a(th);
            }
        }
    }

    static {
        kge.a(1964949476);
        c = new AtomicReference<>();
        d = new ConcurrentHashMap();
        f25162a = iqv.a().e();
        b = iqv.a().f();
        a();
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("95029313", new Object[]{threadFactory});
        }
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (f25162a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) newScheduledThreadPool;
            if (iqv.a().b()) {
                scheduledThreadPoolExecutor.setKeepAliveTime(10L, TimeUnit.SECONDS);
                scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            d.put(scheduledThreadPoolExecutor, newScheduledThreadPool);
        }
        return newScheduledThreadPool;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (!f25162a) {
        } else {
            while (true) {
                ScheduledExecutorService scheduledExecutorService = c.get();
                if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
                    return;
                }
                ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new f("PmSchedulerPurge"));
                if (c.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                    a aVar = new a();
                    int i = b;
                    newScheduledThreadPool.scheduleAtFixedRate(aVar, i, i, TimeUnit.SECONDS);
                    return;
                }
                newScheduledThreadPool.shutdownNow();
            }
        }
    }
}
