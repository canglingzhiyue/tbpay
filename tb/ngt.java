package tb;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class ngt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f31449a;
    private static Boolean b;

    static {
        kge.a(1091372028);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (b == null) {
            String b2 = b(context);
            if (TextUtils.isEmpty(b2)) {
                return true;
            }
            if (context != null && TextUtils.equals(b2, context.getPackageName())) {
                z = true;
            }
            b = Boolean.valueOf(z);
        }
        return b.booleanValue();
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        try {
        } catch (Exception e) {
            ngr.b("ProcessUtil", e.toString());
        }
        if (f31449a != null && f31449a.length() > 0) {
            return f31449a;
        }
        if (context == null) {
            return null;
        }
        int myPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == myPid) {
                f31449a = runningAppProcessInfo.processName;
            }
        }
        return f31449a;
    }
}
