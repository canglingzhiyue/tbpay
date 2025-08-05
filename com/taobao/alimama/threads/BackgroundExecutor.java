package com.taobao.alimama.threads;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import tb.kge;

/* loaded from: classes4.dex */
public class BackgroundExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Executor executor;

    static {
        kge.a(1732382915);
        executor = Executors.newCachedThreadPool();
    }

    public static void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{runnable});
            return;
        }
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
