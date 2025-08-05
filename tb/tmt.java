package tb;

import android.app.ActivityManager;
import android.app.ActivityThread;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import java.util.List;

/* loaded from: classes7.dex */
public class tmt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f34225a;
    private static ActivityManager b;
    private static Boolean c;

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : mzq.a();
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        try {
            return Login.getUserId();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return true;
        }
        Boolean bool = c;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(context.getPackageName().equals(b(context)));
        c = valueOf;
        return valueOf.booleanValue();
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        if (TextUtils.isEmpty(f34225a)) {
            if (Build.VERSION.SDK_INT >= 28) {
                f34225a = Application.getProcessName();
            } else {
                f34225a = ActivityThread.currentProcessName();
            }
            if (TextUtils.isEmpty(f34225a)) {
                f34225a = a(context, Process.myPid());
            }
        }
        return f34225a;
    }

    private static String a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe74945d", new Object[]{context, new Integer(i)});
        }
        try {
            if (b == null) {
                b = (ActivityManager) context.getSystemService("activity");
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = b.getRunningAppProcesses();
            if (runningAppProcesses != null && runningAppProcesses.size() > 0) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == i) {
                        return runningAppProcessInfo.processName;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }
}
