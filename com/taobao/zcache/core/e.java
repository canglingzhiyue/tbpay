package com.taobao.zcache.core;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes9.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final ExecutorService f23641a;

    static {
        kge.a(321491026);
        f23641a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 3L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.taobao.zcache.core.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                return new Thread(runnable, "ZCache.TempTask_" + runnable.hashCode());
            }
        });
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else {
            f23641a.execute(runnable);
        }
    }

    public static void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{runnable});
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            f23641a.execute(runnable);
        } else {
            runnable.run();
        }
    }
}
