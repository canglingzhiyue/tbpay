package com.taobao.message.uikit.util;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class ActivityUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String TAG;

    static {
        kge.a(-1158853354);
        TAG = "ActivityUtil";
    }

    private static List<ActivityManager.RunningTaskInfo> getRunningTasks(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("15d7c30b", new Object[]{context});
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        return activityManager.getRunningTasks(1);
    }

    public static int getActivityNumInCurTask(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0f61635", new Object[]{context})).intValue();
        }
        List<ActivityManager.RunningTaskInfo> runningTasks = getRunningTasks(context);
        if (runningTasks != null && runningTasks.size() > 0) {
            return runningTasks.get(0).numActivities;
        }
        return 0;
    }

    public static boolean onlyOneActivity(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d990546", new Object[]{context, str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = getRunningTasks(context);
            if (runningTasks != null && runningTasks.size() > 0) {
                ActivityManager.RunningTaskInfo runningTaskInfo = runningTasks.get(0);
                if (runningTaskInfo.numActivities == 1) {
                    if (str.equals(runningTaskInfo.topActivity.getClassName())) {
                        return true;
                    }
                }
            }
        } catch (Throwable th) {
            TLog.loge(TAG, Log.getStackTraceString(th));
        }
        return false;
    }

    public static boolean onlyOneActivity(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e696497c", new Object[]{context})).booleanValue();
        }
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = getRunningTasks(context);
            if (runningTasks != null && runningTasks.size() > 0) {
                ActivityManager.RunningTaskInfo runningTaskInfo = runningTasks.get(0);
                TLog.loge("ActivityUtil:onlyOneActivity:" + runningTaskInfo.numActivities, new String[0]);
                if (runningTaskInfo.numActivities == 1) {
                    return true;
                }
            }
        } catch (Throwable th) {
            TLog.loge(TAG, Log.getStackTraceString(th));
        }
        return false;
    }
}
