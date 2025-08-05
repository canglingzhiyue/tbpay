package com.taobao.taolive.room.utils;

import android.app.ActivityManager;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-246058206);
    }

    public static String a(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        if (context != null) {
            try {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && runningTasks.get(0) != null && runningTasks.get(0).topActivity != null) {
                    return String.valueOf(runningTasks.get(0).topActivity);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static boolean a(com.taobao.taolive.sdk.controller.e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("24a98202", new Object[]{eVar})).booleanValue() : eVar == null || !eVar.y();
    }
}
