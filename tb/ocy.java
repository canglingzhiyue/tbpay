package tb;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes8.dex */
public class ocy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-598675405);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        String b = b(context);
        String packageName = context.getPackageName();
        return (b == null || packageName == null || !b.equals(packageName)) ? false : true;
    }

    private static String b(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && runningAppProcesses.size() != 0) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == myPid) {
                        return runningAppProcessInfo.processName;
                    }
                }
                return null;
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
