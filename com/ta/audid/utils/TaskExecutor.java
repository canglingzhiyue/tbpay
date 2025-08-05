package com.ta.audid.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledFuture;
import tb.kge;

/* loaded from: classes.dex */
public class TaskExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static TaskExecutor instance;
    private static a mHandler2Executor;

    static {
        kge.a(-1361426226);
    }

    public static synchronized TaskExecutor getInstance() {
        synchronized (TaskExecutor.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TaskExecutor) ipChange.ipc$dispatch("b0710a35", new Object[0]);
            }
            if (instance == null) {
                mHandler2Executor = new a();
                instance = new TaskExecutor();
            }
            return instance;
        }
    }

    public final ScheduledFuture schedule(ScheduledFuture scheduledFuture, Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduledFuture) ipChange.ipc$dispatch("9b56a2dc", new Object[]{this, scheduledFuture, runnable, new Long(j)});
        }
        if (scheduledFuture != null) {
            try {
                if (!scheduledFuture.isDone()) {
                    scheduledFuture.cancel(true);
                }
            } catch (Exception unused) {
                return scheduledFuture;
            }
        }
        return mHandler2Executor.a(runnable, j);
    }
}
