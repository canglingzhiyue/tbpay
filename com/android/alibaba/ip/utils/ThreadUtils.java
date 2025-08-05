package com.android.alibaba.ip.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes3.dex */
public class ThreadUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final ThreadPoolExecutor sExecutor;

    static {
        kge.a(718986658);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new InstantThreadFactory());
        sExecutor = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static void asyncExecute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e93b3de", new Object[]{runnable});
        } else {
            execute(runnable);
        }
    }

    public static void syncExecute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("529f57df", new Object[]{runnable});
        } else {
            runnable.run();
        }
    }

    public static void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{runnable});
        } else {
            sExecutor.execute(runnable);
        }
    }

    public static Future<?> submit(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b4a21fb3", new Object[]{runnable}) : sExecutor.submit(runnable);
    }

    public static <T> Future<T> submit(Callable<T> callable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b2277828", new Object[]{callable}) : sExecutor.submit(callable);
    }

    /* loaded from: classes3.dex */
    public static final class InstantThreadFactory implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static AtomicInteger atomicInteger;

        private InstantThreadFactory() {
        }

        static {
            kge.a(59715873);
            kge.a(-1938806936);
            atomicInteger = new AtomicInteger(1);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(runnable, "instantpatch-#-" + atomicInteger.getAndIncrement());
            thread.setPriority(10);
            return thread;
        }
    }
}
