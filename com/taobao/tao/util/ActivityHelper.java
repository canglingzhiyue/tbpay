package com.taobao.tao.util;

import android.app.ActivityManager;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class ActivityHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(640588778);
    }

    public static void kill() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbdee0e5", new Object[0]);
            return;
        }
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) Globals.getApplication().getSystemService("activity")).getRunningAppProcesses();
            String packageName = Globals.getApplication().getPackageName();
            for (int i = 0; i < runningAppProcesses.size(); i++) {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = runningAppProcesses.get(i);
                if (!runningAppProcessInfo.processName.equalsIgnoreCase(packageName + ":channel")) {
                    if (!runningAppProcessInfo.processName.equalsIgnoreCase(packageName + ":utremote")) {
                        if (!runningAppProcessInfo.processName.equalsIgnoreCase(packageName + ":qupai_media")) {
                            if (!runningAppProcessInfo.processName.equalsIgnoreCase(packageName + ":widgetProvider")) {
                            }
                        }
                    }
                }
                String str = "kill RunningAppProcessInfo:" + runningAppProcessInfo.processName;
                Process.killProcess(runningAppProcessInfo.pid);
            }
        } catch (Exception unused) {
        }
    }
}
