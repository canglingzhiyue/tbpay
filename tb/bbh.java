package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.MessageQueue;
import com.alibaba.android.aura.util.AURATraceUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.virtual_thread.face.h;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.arc;

/* loaded from: classes2.dex */
public class bbh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f25745a;
    private static final ThreadPoolExecutor b;
    private static final Handler c;

    static {
        kge.a(-225504617);
        f25745a = new Handler(Looper.getMainLooper());
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        b = a(Math.max(1, availableProcessors / 2), availableProcessors, 10L, TimeUnit.SECONDS, "AURASchedules");
        HandlerThread handlerThread = new HandlerThread("AURAWorkerHandler");
        handlerThread.start();
        c = new Handler(handlerThread.getLooper());
    }

    @Deprecated
    public static Handler a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("b016d95e", new Object[0]) : c;
    }

    public static Handler c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("a819f71c", new Object[0]) : c;
    }

    public static Handler b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("ac18683d", new Object[0]) : f25745a;
    }

    public static void a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91c09e", new Object[]{runnable, new Long(j)});
        } else if (bbl.a()) {
            runnable.run();
        } else {
            f25745a.postDelayed(runnable, j);
        }
    }

    public static void a(Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea2f8e64", new Object[]{runnable, runnable2});
            return;
        }
        try {
            if (bbl.a()) {
                runnable.run();
            } else {
                f25745a.postDelayed(runnable, 0L);
            }
        } catch (Throwable th) {
            arc.a().a(AURATraceUtil.a(th), arc.a.a().a("AURA/error").b());
            if (runnable2 == null) {
                return;
            }
            runnable2.run();
        }
    }

    public static void b(final Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{runnable});
        } else {
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: tb.bbh.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        arc.a().a(AURATraceUtil.a(th), arc.a.a().a("AURA/error").b());
                    }
                    return false;
                }
            });
        }
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else {
            b.execute(runnable);
        }
    }

    public static ThreadPoolExecutor a(int i, int i2, long j, TimeUnit timeUnit, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("b4b98766", new Object[]{new Integer(i), new Integer(i2), new Long(j), timeUnit, str});
        }
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) VExecutors.getThreadPoolFactory().a(i, i2, j, timeUnit, new LinkedBlockingQueue(), new h() { // from class: tb.bbh.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.virtual_thread.face.h
            public String newThreadName() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("57dab4a4", new Object[]{this}) : str;
            }
        }, new a(str));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* loaded from: classes2.dex */
    public static class a implements RejectedExecutionHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f25748a;

        static {
            kge.a(1133158688);
            kge.a(211959016);
        }

        public a(String str) {
            this.f25748a = str;
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf6566d1", new Object[]{this, runnable, threadPoolExecutor});
                return;
            }
            ard a2 = arc.a();
            a2.c("AURASchedules", "rejectedExecution", "threadName=" + this.f25748a);
        }
    }
}
