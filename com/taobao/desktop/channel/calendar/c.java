package com.taobao.desktop.channel.calendar;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.RemoteException;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.khc;
import tb.khu;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2022971699);
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        if (!khc.a()) {
            return "error: huawei calender service orange disable";
        }
        if (!b(context) || !c(context)) {
            return "error: not support huawei calender service";
        }
        if (!d(context)) {
            return "error: not fix huawei calender dp link";
        }
        khu.a("CalenderHuaweiManager serviceEnable true");
        return "";
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        try {
            ContentResolver contentResolver = context.getContentResolver();
            if (contentResolver == null) {
                return false;
            }
            ContentProviderClient contentProviderClient = null;
            if (Build.VERSION.SDK_INT >= 16) {
                contentProviderClient = contentResolver.acquireUnstableContentProviderClient("com.huawei.calendar");
            }
            return contentProviderClient != null;
        } catch (Throwable th) {
            khu.a("CalenderHuaweiManager.isSupport：" + th);
            return false;
        }
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue();
        }
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            return false;
        }
        ContentProviderClient acquireUnstableContentProviderClient = Build.VERSION.SDK_INT >= 16 ? contentResolver.acquireUnstableContentProviderClient("com.huawei.calendar") : null;
        if (acquireUnstableContentProviderClient == null) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                String string = acquireUnstableContentProviderClient.call("query_version", null, null).getString("version");
                khu.a("CalenderHuaweiManager.getSupportVersion：" + string);
                return Float.parseFloat(string) >= 2.0f;
            }
        } catch (BadParcelableException | RemoteException e) {
            khu.a("CalenderHuaweiManager.getSupportVersion.error." + e.getMessage());
        }
        return false;
    }

    private static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue() : a() && a(context, "com.huawei.calendar").compareTo("13.0.11.340") >= 0;
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        String str2 = "";
        try {
            str2 = context.getPackageManager().getPackageInfo(str, 0).versionName;
            khu.a("CalenderHuaweiManager.isFixCalendarVersion versionName：" + str2);
            return str2;
        } catch (PackageManager.NameNotFoundException e) {
            khu.a("CalenderHuaweiManager.isFixCalendarVersion error：" + e.getMessage());
            return str2;
        }
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        String a2 = a("hw_sc.build.platform.version");
        khu.a("CalenderHuaweiManager.isHuaWeiHmOS3：" + a2);
        return !StringUtils.isEmpty(a2) && a2.compareTo("3.0.0") >= 0;
    }

    public static String a(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            khu.a("CalenderHuaweiManager.getRoValue error：" + e.getMessage());
            return "";
        }
    }
}
