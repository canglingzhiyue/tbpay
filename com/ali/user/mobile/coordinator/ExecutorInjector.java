package com.ali.user.mobile.coordinator;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import tb.kge;

/* loaded from: classes2.dex */
public class ExecutorInjector {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ScheduledExecutorService mScheduledExector;
    private static ThreadPoolExecutor mThreadPoolExecutor;

    static {
        kge.a(-2063269010);
        mThreadPoolExecutor = null;
        mScheduledExector = null;
    }

    public static ScheduledExecutorService getScheduledExector() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("8dc5e1da", new Object[0]) : mScheduledExector;
    }

    public static void setScheduledExector(ScheduledExecutorService scheduledExecutorService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dfdc632", new Object[]{scheduledExecutorService});
        } else {
            mScheduledExector = scheduledExecutorService;
        }
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
