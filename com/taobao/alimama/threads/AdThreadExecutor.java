package com.taobao.alimama.threads;

import android.os.Handler;
import android.os.SystemClock;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.utils.UserTrackLogs;
import tb.kge;

/* loaded from: classes4.dex */
public class AdThreadExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(620383522);
    }

    public static void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{runnable});
        } else {
            execute(runnable, 0L);
        }
    }

    public static void execute(final Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4467280a", new Object[]{runnable, new Long(j)});
            return;
        }
        final long uptimeMillis = SystemClock.uptimeMillis();
        new Handler(a.a()).postDelayed(new Runnable() { // from class: com.taobao.alimama.threads.AdThreadExecutor.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                AppMonitor.Alarm.commitSuccess(UserTrackLogs.UT_PAGE_NAME, "ad_thread_waiting_time", String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                runnable.run();
            }
        }, j);
    }
}
