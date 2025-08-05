package tb;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class gwl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f28540a;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        try {
            return Resources.getSystem().getConfiguration().locale.getLanguage().contains("zh");
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : (context == null || (context.getApplicationInfo().flags & 2) == 0) ? false : true;
    }

    static {
        kge.a(-217736861);
        f28540a = "";
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        try {
        } catch (Exception e) {
            gwo.a(6, "getProcessName error", e.toString());
        }
        if (f28540a != null && f28540a.length() > 0) {
            return f28540a;
        }
        if (context == null) {
            return null;
        }
        int myPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == myPid) {
                f28540a = runningAppProcessInfo.processName;
            }
        }
        return f28540a;
    }
}
