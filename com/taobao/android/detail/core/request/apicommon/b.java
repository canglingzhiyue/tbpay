package com.taobao.android.detail.core.request.apicommon;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ExecutorService f9817a;
    private static ScheduledExecutorService b;

    static {
        kge.a(1160685351);
        f9817a = Executors.newCachedThreadPool();
        b = Executors.newScheduledThreadPool(1);
        emu.a("com.taobao.android.detail.core.request.apicommon.TaskExecutor");
    }

    public static Future a(Callable callable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("3135d2bf", new Object[]{callable}) : f9817a.submit(callable);
    }
}
