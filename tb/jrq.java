package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.e;
import com.taobao.android.virtual_thread.stub.StubExecutors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class jrq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final boolean PURGE_ENABLED;
    public static final int PURGE_PERIOD_SECONDS;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference<ScheduledExecutorService> f29741a;
    public static final Map<ScheduledExecutorService, Object> b;

    static {
        boolean z;
        kge.a(-457920752);
        f29741a = new AtomicReference<>();
        b = new ConcurrentHashMap();
        Properties properties = System.getProperties();
        int i = 1;
        if (properties.containsKey("rx2.purge-enabled")) {
            z = Boolean.getBoolean("rx2.purge-enabled");
            if (z && properties.containsKey("rx2.purge-period-seconds")) {
                i = Integer.getInteger("rx2.purge-period-seconds", 1).intValue();
            }
        } else {
            z = true;
        }
        PURGE_ENABLED = z;
        PURGE_PERIOD_SECONDS = i;
        a();
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        while (true) {
            ScheduledExecutorService scheduledExecutorService = f29741a.get();
            if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
                return;
            }
            ScheduledExecutorService newScheduledThreadPool = StubExecutors.newScheduledThreadPool(1, new jrp("RxSchedulerPurge"));
            if (f29741a.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                Runnable runnable = new Runnable() { // from class: tb.jrq.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            Iterator it = new ArrayList(jrq.b.keySet()).iterator();
                            while (it.hasNext()) {
                                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) it.next();
                                if (scheduledExecutorService2.isShutdown()) {
                                    jrq.b.remove(scheduledExecutorService2);
                                } else if (scheduledExecutorService2 instanceof ScheduledThreadPoolExecutor) {
                                    ((ScheduledThreadPoolExecutor) scheduledExecutorService2).purge();
                                }
                            }
                        } catch (Throwable th) {
                            rsy.a(th);
                        }
                    }
                };
                int i = PURGE_PERIOD_SECONDS;
                newScheduledThreadPool.scheduleAtFixedRate(runnable, i, i, TimeUnit.SECONDS);
                return;
            }
            newScheduledThreadPool.shutdownNow();
        }
    }

    public static ScheduledExecutorService a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledExecutorService) ipChange.ipc$dispatch("7992cff6", new Object[]{eVar});
        }
        ScheduledExecutorService newScheduledThreadPool = StubExecutors.newScheduledThreadPool(1, eVar);
        b.put(newScheduledThreadPool, newScheduledThreadPool);
        return newScheduledThreadPool;
    }
}
