package tb;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.application.common.c;
import com.taobao.desktop.widget.manager.e;
import com.taobao.desktop.widget.monitor.MonitorType;
import com.taobao.desktop.widget.monitor.a;
import java.util.List;

/* loaded from: classes.dex */
public class kid {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1238556621);
    }

    public static int a(Context context, String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61b6361d", new Object[]{context, str})).intValue();
        }
        try {
            i = context.getApplicationContext().getPackageManager().getPackageInfo(str, 0).versionCode;
            kif.b("getApkVersion" + str + " version = " + i);
            return i;
        } catch (PackageManager.NameNotFoundException e) {
            kif.a("DeviceUtils getApkVersion error" + e.getMessage());
            return i;
        }
    }

    public static String a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e) {
            kif.a("DeviceUtils getPropertyString error" + e.getMessage());
            return str2;
        }
    }

    public static boolean a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d18de978", new Object[]{context, str, str2})).booleanValue();
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
            if (applicationInfo == null) {
                return false;
            }
            return applicationInfo.metaData.getBoolean(str2, false);
        } catch (Exception e) {
            kif.a("getBooleanFromMetaData error" + e.getMessage());
            return false;
        }
    }

    public static boolean a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        try {
            runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        } catch (Exception e) {
            kif.a("getRunningAppProcesses error" + e.getMessage());
        }
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.startsWith(context.getPackageName())) {
                return true;
            }
        }
        return false;
    }

    public static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{context, str});
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse("vivo://com.bbk.launcher2/origin?pkg=" + str));
            context.startActivity(intent);
        } catch (Exception e) {
            kif.a("WidgetOpenJsBridge widgetVivoAdd error" + e.getMessage());
        }
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue() : c() && e(context, "isMiuiWidgetSupported") && c(context);
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue() : c() && e(context, "isMiuiWidgetDetailPageSupported");
    }

    private static boolean e(Context context, String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48e0bdaa", new Object[]{context, str})).booleanValue();
        }
        try {
            Bundle call = context.getContentResolver().call(Uri.parse("content://com.miui.personalassistant.widget.external"), str, (String) null, (Bundle) null);
            if (call != null) {
                z = call.getBoolean(str);
            }
        } catch (Exception e) {
            kif.a("isMiuiSupported error" + e.getMessage());
        }
        kif.b(str + ":" + z);
        return z;
    }

    public static boolean c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d54b79ec", new Object[]{context, str})).booleanValue();
        }
        try {
            int a2 = a(context, "com.bbk.launcher2");
            String a3 = a("ro.product.device", "");
            kif.b("apkVersion = " + a2 + " device = " + a3 + " onlineVersion" + str);
            if (e.A(context).booleanValue() && ((a2 >= 135001230 && a2 < 140000000) || ((a2 >= 140001130 && a2 < 140002310) || (a2 >= 140501130 && a2 < 141500130)))) {
                kif.a("isVivoOriginWidgetSupport not support version: " + a2);
                a.a().a(MonitorType.WIDGET_STATE, new a.C0652a().d("widget_vivo_add"));
                return false;
            } else if (StringUtils.equals(a3, "PD2178") && a2 > 110500027) {
                return true;
            } else {
                return !StringUtils.isEmpty(str) ? a2 > Integer.parseInt(str) : a2 > 110000134;
            }
        } catch (Throwable th) {
            kif.a("isVivoOriginWidgetSupport error" + th.getMessage());
            return false;
        }
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{context});
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            context.startActivity(intent);
        } catch (Exception e) {
            kif.a("startHome error" + e.getMessage());
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : "vivo".equalsIgnoreCase(Build.BRAND);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        kif.b("DeviceInfo brand: " + Build.BRAND);
        return "OPPO".equalsIgnoreCase(Build.BRAND);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : "xiaomi".equalsIgnoreCase(Build.BRAND) || l.REDMI_MANUFACTURE_LOWER_CASE.equalsIgnoreCase(Build.BRAND);
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0d012e0", new Object[]{context})).booleanValue() : a(context, "com.bbk.launcher2", "vivo.widget.widgetListJump.support");
    }

    public static boolean d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f161bcb", new Object[]{context, str})).booleanValue();
        }
        try {
            String str2 = "";
            if (!StringUtils.isEmpty(str)) {
                str2 = JSON.parseObject(str).getString("vivo_desktop_version");
            }
            return c(context, str2);
        } catch (Exception e) {
            kif.a("WidgetOpenJsBridge widgetVivoAddSupport error：" + e.getMessage());
            return false;
        }
    }

    public static void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17cbe7b", new Object[]{context});
        } else {
            b(context, "com.taobao.widgetvivo");
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        boolean a2 = c.a().a("isFullNewInstall", false);
        kif.a("isFirstInstall：" + a2);
        return a2;
    }

    public static int g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2296a0d", new Object[]{context})).intValue();
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            kif.a("DeviceUtils getVersionCode error" + e.getMessage());
            return 0;
        }
    }

    public static String h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f21ce807", new Object[]{context});
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            kif.a("DeviceUtils getVersionName error" + e.getMessage());
            return "";
        }
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        String a2 = a("hw_sc.build.platform.version", "");
        kif.b("isHmOS2Above osVersion: " + a2);
        return !StringUtils.isEmpty(a2) && a2.compareTo("2.0.0") > 0;
    }

    public static boolean i(Context context) {
        boolean z = false;
        try {
            if (Build.VERSION.SDK_INT >= 19) {
                Object invoke = Class.forName(AppOpsManager.class.getName()).getDeclaredMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class).invoke((AppOpsManager) context.getSystemService("appops"), Integer.valueOf((int) rlp.T_BORDER_SELECTOR), Integer.valueOf(context.getApplicationInfo().uid), context.getApplicationContext().getPackageName());
                if ((invoke instanceof Integer) && ((Integer) invoke).intValue() == 0) {
                    z = true;
                }
                kif.a("hasShortcutPermissionMIUI isAllowed: " + z);
            }
        } catch (Exception e) {
            kif.b("hasShortcutPermissionMIUI error: " + e.getMessage());
        }
        return z;
    }

    public static int b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65d7b870", new Object[]{str, str2})).intValue();
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int max = Math.max(split.length, split2.length);
        int i = 0;
        while (i < max) {
            int parseInt = i < split.length ? Integer.parseInt(split[i]) : 0;
            int parseInt2 = i < split2.length ? Integer.parseInt(split2[i]) : 0;
            if (parseInt > parseInt2) {
                return 1;
            }
            if (parseInt < parseInt2) {
                return -1;
            }
            i++;
        }
        return 0;
    }
}
