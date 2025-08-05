package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class aqh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final AtomicInteger b;

    /* renamed from: a  reason: collision with root package name */
    private ScheduledThreadPoolExecutor f25515a;

    public static /* synthetic */ AtomicInteger a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("f45a6d52", new Object[0]) : b;
    }

    static {
        kge.a(-1852858014);
        b = new AtomicInteger();
    }

    /* loaded from: classes.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1817107625);
            kge.a(-1938806936);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            int andIncrement = aqh.a().getAndIncrement();
            return new Thread(runnable, "UtHandlerThread:" + andIncrement);
        }
    }

    public aqh() {
        this.f25515a = null;
        if (this.f25515a == null) {
            this.f25515a = new ScheduledThreadPoolExecutor(1, new a());
            this.f25515a.setKeepAliveTime(3000L, TimeUnit.MILLISECONDS);
            this.f25515a.allowCoreThreadTimeOut(true);
        }
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            this.f25515a.submit(runnable);
        }
    }
}
