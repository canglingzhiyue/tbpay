package com.taobao.monitor.impl.util;

import android.app.ActivityManager;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.List;
import tb.mpi;

/* loaded from: classes.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue();
        }
        File file = new File("/proc/" + Process.myPid() + "/comm");
        if (!file.exists()) {
            return -1L;
        }
        return file.lastModified();
    }

    public static boolean b() {
        String str;
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        try {
            str = com.taobao.monitor.impl.common.e.a().b().getPackageName() + ":channel";
            activityManager = (ActivityManager) com.taobao.monitor.impl.common.e.a().b().getSystemService("activity");
        } catch (Throwable th) {
            mpi.c("ProcessUtils", th);
        }
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo != null && str.equals(runningAppProcessInfo.processName)) {
                return true;
            }
        }
        return false;
    }
}
