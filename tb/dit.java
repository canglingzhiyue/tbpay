package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.virtual_thread.face.h;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class dit {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ScheduledThreadPoolExecutor f26792a = a(1, new a("Falco-Full-Trace"));
    private static ScheduledThreadPoolExecutor c = a(1, new a("Falco-Jank-Detect"));
    private static ThreadPoolExecutor b = a(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("Falco-Full-Trace-WV"));
    private static ThreadPoolExecutor d = a(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("Falco-LoadAction"));
    private static ScheduledThreadPoolExecutor e = a(1, new a("Falco-Screen-Monitor"));
    private static ThreadPoolExecutor f = a(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("Falco-Env"));

    /* loaded from: classes.dex */
    public static class a implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public AtomicInteger f26793a = new AtomicInteger(0);
        public String b;

        public a(String str) {
            this.b = str;
        }

        @Override // com.taobao.android.virtual_thread.face.h
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return this.b + this.f26793a.incrementAndGet();
        }
    }

    static {
        f26792a.setKeepAliveTime(30L, TimeUnit.SECONDS);
        f26792a.allowCoreThreadTimeOut(true);
        c.setKeepAliveTime(30L, TimeUnit.SECONDS);
        c.allowCoreThreadTimeOut(true);
        b.allowCoreThreadTimeOut(true);
        d.allowCoreThreadTimeOut(true);
        e.setKeepAliveTime(30L, TimeUnit.SECONDS);
        e.allowCoreThreadTimeOut(true);
        f.allowCoreThreadTimeOut(true);
    }

    public static Future<?> a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("f9227d7c", new Object[]{runnable}) : f26792a.submit(runnable);
    }

    public static Future<?> a(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("e6ac3c70", new Object[]{runnable, new Long(j), timeUnit}) : f26792a.schedule(runnable, j, timeUnit);
    }

    public static boolean f(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("988293ef", new Object[]{runnable})).booleanValue() : f26792a.remove(runnable);
    }

    public static Future<?> c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("1397e07e", new Object[]{runnable}) : c.submit(runnable);
    }

    public static Future<?> b(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("9e98a9f1", new Object[]{runnable, new Long(j), timeUnit}) : c.schedule(runnable, j, timeUnit);
    }

    public static Future<?> b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("865d2efd", new Object[]{runnable}) : b.submit(runnable);
    }

    public static Future<?> d(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("a0d291ff", new Object[]{runnable}) : d.submit(runnable);
    }

    public static Future<?> e(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("2e0d4380", new Object[]{runnable}) : e.submit(runnable);
    }

    public static Future<?> c(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("56851772", new Object[]{runnable, new Long(j), timeUnit}) : e.schedule(runnable, j, timeUnit);
    }

    public static Future<?> g(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("4882a682", new Object[]{runnable}) : f.submit(runnable);
    }

    private static ScheduledThreadPoolExecutor a(int i, h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledThreadPoolExecutor) ipChange.ipc$dispatch("8607e461", new Object[]{new Integer(i), hVar}) : (ScheduledThreadPoolExecutor) VExecutors.getThreadPoolFactory().a(i, hVar, new ThreadPoolExecutor.AbortPolicy());
    }

    private static ThreadPoolExecutor a(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadPoolExecutor) ipChange.ipc$dispatch("cb3b6ca2", new Object[]{new Integer(i), new Integer(i2), new Long(j), timeUnit, blockingQueue, hVar}) : (ThreadPoolExecutor) VExecutors.getThreadPoolFactory().a(i, i2, j, timeUnit, blockingQueue, hVar, new ThreadPoolExecutor.AbortPolicy());
    }
}
