package com.ali.user.mobile.utils;

import com.ali.user.mobile.coordinator.Coordinator;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import java.util.concurrent.Executor;
import tb.kge;

/* loaded from: classes2.dex */
public class BackgroundExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Executor executor;

    static {
        kge.a(-2109583481);
        executor = Coordinator.sThreadPoolExecutor;
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
            LoginTLogAdapter.e("login.BackgroundExecutor", "BackgroundExecutor.excute failed.", e);
            e.printStackTrace();
        }
    }
}
