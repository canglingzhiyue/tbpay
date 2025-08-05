package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class got extends gos<RunnableScheduledFuture<?>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ScheduledThreadPoolExecutor f28414a = new ScheduledThreadPoolExecutor(1, bgk.INSTANCE);
    private Object b = new Object();

    static {
        kge.a(373412707);
    }

    public RunnableScheduledFuture<?> a(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RunnableScheduledFuture) ipChange.ipc$dispatch("239ae410", new Object[]{this, runnable, new Long(j), timeUnit}) : (RunnableScheduledFuture) this.f28414a.schedule(runnable, j, timeUnit);
    }
}
