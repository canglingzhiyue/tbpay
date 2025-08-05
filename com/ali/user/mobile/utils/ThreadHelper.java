package com.ali.user.mobile.utils;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes2.dex */
public class ThreadHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile ThreadHelper sInstance;
    private final Handler mUIHandler = new Handler(Looper.getMainLooper());
    private final ScheduledThreadPoolExecutor mScheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactory() { // from class: com.ali.user.mobile.utils.ThreadHelper.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "LoginThread");
        }
    });

    static {
        kge.a(-1283159490);
    }

    public static ThreadHelper getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadHelper) ipChange.ipc$dispatch("74d1cbb5", new Object[0]);
        }
        if (sInstance == null) {
            synchronized (ThreadHelper.class) {
                if (sInstance == null) {
                    sInstance = new ThreadHelper();
                }
            }
        }
        return sInstance;
    }

    private ThreadHelper() {
        this.mScheduledThreadPoolExecutor.setKeepAliveTime(3000L, TimeUnit.MILLISECONDS);
        this.mScheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public void executeInBg(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("977e81e4", new Object[]{this, runnable});
        } else {
            this.mScheduledThreadPoolExecutor.execute(runnable);
        }
    }

    public void executeDelayedInBg(long j, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("417cae4", new Object[]{this, new Long(j), runnable});
        } else {
            this.mScheduledThreadPoolExecutor.schedule(runnable, j, TimeUnit.MILLISECONDS);
        }
    }

    public void removeBgCallbacks(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c20eb56a", new Object[]{this, runnable});
        } else {
            this.mScheduledThreadPoolExecutor.remove(runnable);
        }
    }

    public void executeInUI(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cf6a713", new Object[]{this, runnable});
        } else {
            this.mUIHandler.post(runnable);
        }
    }

    public void executeDelayedInUI(long j, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da44b95", new Object[]{this, new Long(j), runnable});
        } else {
            this.mUIHandler.postDelayed(runnable, j);
        }
    }
}
