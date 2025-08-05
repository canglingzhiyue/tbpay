package com.taobao.trade.common.kit.utils;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes9.dex */
public final class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadPoolExecutor f22987a;
    private static final Handler b;

    public static /* synthetic */ ThreadPoolExecutor b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadPoolExecutor) ipChange.ipc$dispatch("c0e939c9", new Object[0]) : f22987a;
    }

    static {
        kge.a(-2098257077);
        b = new Handler(Looper.getMainLooper());
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f22987a = a(Math.max(1, availableProcessors / 2), availableProcessors, 10L, TimeUnit.SECONDS, "UltronWorkSchedules");
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91c09e", new Object[]{runnable, new Long(j)});
        } else {
            b.postDelayed(runnable, j);
        }
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else {
            b(runnable, 0L);
        }
    }

    public static void b(final Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("706b13bd", new Object[]{runnable, new Long(j)});
        } else if (0 == j) {
            f22987a.execute(runnable);
        } else {
            a(new Runnable() { // from class: com.taobao.trade.common.kit.utils.g.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        g.b().execute(runnable);
                    }
                }
            }, j);
        }
    }

    public static ThreadPoolExecutor a(int i, int i2, long j, TimeUnit timeUnit, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadPoolExecutor) ipChange.ipc$dispatch("b4b98766", new Object[]{new Integer(i), new Integer(i2), new Long(j), timeUnit, str}) : a(i, i2, j, timeUnit, null, str);
    }

    public static ThreadPoolExecutor a(int i, int i2, long j, TimeUnit timeUnit, Runnable runnable, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("3b990264", new Object[]{new Integer(i), new Integer(i2), new Long(j), timeUnit, runnable, str});
        }
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) VExecutors.getThreadPoolFactory().a(i, i2, j, timeUnit, new LinkedBlockingQueue(), new com.taobao.android.virtual_thread.face.h() { // from class: com.taobao.trade.common.kit.utils.g.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.virtual_thread.face.h
            public String newThreadName() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("57dab4a4", new Object[]{this}) : str;
            }
        }, new a(str, runnable));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* loaded from: classes9.dex */
    public static class a implements RejectedExecutionHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f22990a;
        private final Runnable b;

        static {
            kge.a(1397570796);
            kge.a(211959016);
        }

        public a(String str, Runnable runnable) {
            this.f22990a = str;
            this.b = runnable;
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf6566d1", new Object[]{this, runnable, threadPoolExecutor});
                return;
            }
            Runnable runnable2 = this.b;
            if (runnable2 != null) {
                runnable2.run();
            }
            f.a("UltronSchedules", "rejectedExecution", "threadName=" + this.f22990a);
        }
    }
}
