package com.ali.user.open.core.service.impl;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ThreadPoolExecutor;
import tb.kge;

/* loaded from: classes2.dex */
public class ExecutorServiceInjectManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ThreadPoolExecutor mThreadPoolExecutor;

    static {
        kge.a(-1825109185);
        mThreadPoolExecutor = null;
    }

    public static void setInjectThreadPoolExecutor(ThreadPoolExecutor threadPoolExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3488fc5d", new Object[]{threadPoolExecutor});
        } else {
            mThreadPoolExecutor = threadPoolExecutor;
        }
    }

    public static ThreadPoolExecutor getInjectThreadPoolExecutor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadPoolExecutor) ipChange.ipc$dispatch("b3666587", new Object[0]) : mThreadPoolExecutor;
    }
}
