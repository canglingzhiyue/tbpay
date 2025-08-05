package com.taobao.android.launcher.biz.launcher;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class fx extends com.taobao.android.launcher.biz.task.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.launcher.biz.task.j
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public fx(String str) {
        super(str);
        shouldRunImmediately(true);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) application.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                String str = runningAppProcessInfo.processName;
                if (!str.equals(application.getPackageName() + ":safemode")) {
                    String str2 = runningAppProcessInfo.processName;
                    if (!str2.equals(application.getPackageName() + ":watchdog")) {
                        return;
                    }
                }
            }
            if (runningAppProcessInfo.uid == myUid && runningAppProcessInfo.pid != myPid) {
                String str3 = runningAppProcessInfo.processName;
                if (str3.equals(application.getPackageName() + ":safemode")) {
                    Process.killProcess(myPid);
                }
            }
        }
    }
}
