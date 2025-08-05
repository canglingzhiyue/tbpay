package com.etao.feimagesearch.pipline;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.isd;
import tb.kge;

/* loaded from: classes3.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final ExecutorService f6934a;

    static {
        kge.a(803271321);
        INSTANCE = new c();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(8, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new isd.f("pltpipline"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f6934a = threadPoolExecutor;
    }

    private c() {
    }

    @JvmStatic
    public static final void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else if (runnable == null) {
        } else {
            f6934a.execute(runnable);
        }
    }

    @JvmStatic
    public static final Future<Map<String, String>> a(Callable<Map<String, String>> task) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("3135d2bf", new Object[]{task});
        }
        q.c(task, "task");
        return f6934a.submit(task);
    }

    @JvmStatic
    public static final Future<Object> b(Callable<Object> task) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("af96d69e", new Object[]{task});
        }
        q.c(task, "task");
        Future<Object> submit = f6934a.submit(task);
        q.a((Object) submit, "PIP_LINE_EXECUTOR.submit(task)");
        return submit;
    }
}
