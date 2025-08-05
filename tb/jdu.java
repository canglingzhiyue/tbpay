package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class jdu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ScheduledExecutorService f29485a;

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final jdu f29487a = new jdu();
    }

    private jdu() {
        this.f29485a = new ScheduledThreadPoolExecutor(3, new ThreadFactory() { // from class: tb.jdu.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "tcrash");
            }
        });
        ((ScheduledThreadPoolExecutor) this.f29485a).setKeepAliveTime(3L, TimeUnit.SECONDS);
        ((ScheduledThreadPoolExecutor) this.f29485a).allowCoreThreadTimeOut(true);
    }

    public static jdu a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jdu) ipChange.ipc$dispatch("f065a03", new Object[0]) : a.f29487a;
    }

    public ScheduledExecutorService b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("bdd68a4d", new Object[]{this}) : this.f29485a;
    }
}
