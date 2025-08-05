package tb;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class apg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, String> f25498a;
    private static Boolean b;
    private static String c;

    static {
        kge.a(-1144229239);
        b = null;
        c = null;
        f25498a = null;
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : aob.a().s();
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : aob.a().l();
    }

    @Deprecated
    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            String packageName = context.getPackageName();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                apr.b("AppInfoUtil", "appProcess.processName", runningAppProcessInfo.processName, "appProcess.importance", Integer.valueOf(runningAppProcessInfo.importance));
                if (runningAppProcessInfo.processName.equals(packageName)) {
                    if (runningAppProcessInfo.importance != 400 && runningAppProcessInfo.importance != 125) {
                        if (powerManager.isScreenOn()) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        } catch (Throwable unused) {
        }
        return true;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            String packageName = context.getPackageName();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                apr.b("AppInfoUtil", "appProcess.processName", runningAppProcessInfo.processName);
                if (runningAppProcessInfo.processName.equals(packageName)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String a(Context context, String str) {
        int identifier;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        if (context == null) {
            return null;
        }
        try {
            Resources resources = context.getResources();
            if (resources != null && (identifier = resources.getIdentifier(str, "string", context.getPackageName())) != 0) {
                return context.getString(identifier);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static Map<String, String> c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8ab12153", new Object[]{context});
        }
        Map<String, String> map = f25498a;
        if (map != null) {
            apr.a("AppInfoUtil", "getInfoForPreApk preInfoMap", map);
            return f25498a;
        } else if (context == null) {
            apr.e("AppInfoUtil", "getInfoForPreApk context is null");
            return null;
        } else {
            f25498a = new HashMap();
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("manufacture_config", 0);
                boolean z = sharedPreferences.getBoolean(oyw.PRE_LOAD, false);
                String string = sharedPreferences.getString("preLoad_VersionName", "");
                String string2 = sharedPreferences.getString("preLoad_Channel1", "");
                String string3 = sharedPreferences.getString("preLoad_Channel2", "");
                if (z) {
                    f25498a.put(oyw.PRE_LOAD, "true");
                    f25498a.put("preLoad_VersionName", string);
                    f25498a.put("preLoad_Channel1", string2);
                    f25498a.put("preLoad_Channel2", string3);
                }
            } catch (Exception e) {
                apr.b("AppInfoUtil", e, new Object[0]);
            }
            apr.b("AppInfoUtil", "getInfoForPreApk preInfoMap", f25498a);
            return f25498a;
        }
    }

    public static String d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c344f03", new Object[]{context});
        }
        Map<String, String> c2 = c(context);
        if (c2 == null) {
            return null;
        }
        return c2.get("preLoad_Channel2");
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0d012e0", new Object[]{context})).booleanValue();
        }
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return true;
        }
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.processName;
            String f = f(context);
            Boolean valueOf = Boolean.valueOf((TextUtils.isEmpty(str) || TextUtils.isEmpty(f)) ? true : f.equalsIgnoreCase(str));
            b = valueOf;
            return valueOf.booleanValue();
        } catch (Throwable unused) {
            return true;
        }
    }

    public static String f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7289b85", new Object[]{context});
        }
        String str = c;
        if (str != null) {
            return str;
        }
        if (context == null) {
            return "";
        }
        int myPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == myPid) {
                String str2 = runningAppProcessInfo.processName;
                c = str2;
                return str2;
            }
        }
        return "";
    }
}
