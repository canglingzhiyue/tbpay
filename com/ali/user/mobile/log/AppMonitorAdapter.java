package com.ali.user.mobile.log;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class AppMonitorAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(345650883);
    }

    public static void commitSuccess(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeeeb8e7", new Object[]{str, str2});
            return;
        }
        try {
            AppMonitor.Alarm.commitSuccess(str, str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void commitSuccess(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d3416f1", new Object[]{str, str2, str3});
            return;
        }
        try {
            AppMonitor.Alarm.commitSuccess(str, str2, str3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void commitFail(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("426ed724", new Object[]{str, str2, str3, str4});
        } else {
            AppMonitor.Alarm.commitFail(str, str2, str3, str4);
        }
    }
}
