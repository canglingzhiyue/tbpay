package com.alipay.mobile.verifyidentity.utils;

import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class FutureHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f6097a = FutureHelper.class.getSimpleName();
    private final long b = 2000;

    public Object getResultEvenTimeout(FutureTask<Object> futureTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("1472444c", new Object[]{this, futureTask}) : getResultEvenTimeout(futureTask, 2000L);
    }

    public Object getResultEvenTimeout(FutureTask<Object> futureTask, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("15ccf714", new Object[]{this, futureTask, new Long(j)});
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.alipay.mobile.verifyidentity.utils.FutureHelper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            private final AtomicInteger f6098a = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                return new Thread(runnable, "FutureHelper_thread_" + this.f6098a.incrementAndGet());
            }
        });
        try {
            threadPoolExecutor.execute(futureTask);
            VerifyLogCat.w(this.f6097a, "getResultEvenTimeout executed");
            return futureTask.get(j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            try {
                futureTask.cancel(true);
                VerifyLogCat.w(this.f6097a, "getResultEvenTimeout Exception", th);
                threadPoolExecutor.shutdown();
                return null;
            } finally {
                threadPoolExecutor.shutdown();
            }
        }
    }

    public Object futureEntrance(Callable<Object> callable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("995d20e1", new Object[]{this, callable}) : futureEntrance(callable, 2000L);
    }

    public Object futureEntrance(Callable<Object> callable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2e3dad1f", new Object[]{this, callable, new Long(j)});
        }
        Object resultEvenTimeout = getResultEvenTimeout(new FutureTask<>(callable), j);
        String str = this.f6097a;
        VerifyLogCat.i(str, "futureEntrance got result: " + resultEvenTimeout);
        return resultEvenTimeout;
    }
}
