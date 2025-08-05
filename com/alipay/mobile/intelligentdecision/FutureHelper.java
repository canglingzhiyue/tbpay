package com.alipay.mobile.intelligentdecision;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class FutureHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f5719a = "FutureHelper";

    private Object a(FutureTask<Object> futureTask, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("47e021e7", new Object[]{this, futureTask, new Long(j)});
        }
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newCachedThreadPool(new ThreadFactory() { // from class: com.alipay.mobile.intelligentdecision.FutureHelper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final AtomicInteger b = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                return new Thread(runnable, "Intelligent_future_thread_" + this.b.incrementAndGet());
            }
        });
        try {
            try {
                try {
                    threadPoolExecutor.setKeepAliveTime(5L, TimeUnit.SECONDS);
                    threadPoolExecutor.execute(futureTask);
                    Object obj = futureTask.get(j, TimeUnit.MILLISECONDS);
                    try {
                        threadPoolExecutor.shutdown();
                    } catch (Throwable unused) {
                    }
                    return obj;
                } catch (TimeoutException unused2) {
                    threadPoolExecutor.shutdown();
                    return "TIME_OUT";
                } catch (Throwable th) {
                    String str = "EXCEPTION:" + th.getMessage();
                    try {
                        threadPoolExecutor.shutdown();
                    } catch (Throwable unused3) {
                    }
                    return str;
                }
            } catch (Throwable th2) {
                try {
                    threadPoolExecutor.shutdown();
                } catch (Throwable unused4) {
                }
                throw th2;
            }
        } catch (Throwable unused5) {
            return "TIME_OUT";
        }
    }

    public final Object a(Callable<Object> callable, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("d6046357", new Object[]{this, callable, new Long(j)}) : a(new FutureTask<>(callable), j);
    }
}
