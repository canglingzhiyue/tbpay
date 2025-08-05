package com.taobao.android.detail.ttdetail.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes5.dex */
public class bf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final int f10960a;
    private static final int b;
    private static final int c;
    public static final ThreadPoolExecutor mExecutor;

    static {
        kge.a(1053469642);
        f10960a = Runtime.getRuntime().availableProcessors();
        b = Math.max(2, Math.min(f10960a - 1, 4));
        c = (f10960a << 1) + 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(b, c, 30L, TimeUnit.SECONDS, new LinkedBlockingDeque(), a("TTThreadPoolExecutor", false));
        mExecutor = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    private static ThreadFactory a(final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadFactory) ipChange.ipc$dispatch("f2e0e9fb", new Object[]{str, new Boolean(z)}) : new ThreadFactory() { // from class: com.taobao.android.detail.ttdetail.utils.bf.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else {
            mExecutor.execute(runnable);
        }
    }

    public static <T> Future<T> a(Callable<T> callable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("3135d2bf", new Object[]{callable}) : mExecutor.submit(callable);
    }
}
