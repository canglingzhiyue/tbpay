package com.xiaomi.push;

import android.app.AppOpsManager;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.Settings;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.vivo.push.PushClientConstants;
import java.util.Map;

/* loaded from: classes9.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static a f24488a;

    /* loaded from: classes9.dex */
    public interface a {
        Map<String, String> a(Context context, String str);

        /* renamed from: a  reason: collision with other method in class */
        boolean m1952a(Context context, String str);

        boolean b(Context context, String str);
    }

    /* loaded from: classes9.dex */
    public enum b {
        UNKNOWN(0),
        ALLOWED(1),
        NOT_ALLOWED(2);
        

        /* renamed from: a  reason: collision with other field name */
        private final int f389a;

        b(int i) {
            this.f389a = i;
        }

        public int a() {
            return this.f389a;
        }
    }

    public static int a(Context context) {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(PushClientConstants.COM_ANDROID_SYSTEMUI, 128);
                if (applicationInfo != null && applicationInfo.metaData != null) {
                    return applicationInfo.metaData.getInt("SupportForPushVersionCode");
                }
                return 0;
            } catch (PackageManager.NameNotFoundException unused) {
                return 0;
            }
        }
        return 0;
    }

    public static int a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception unused) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return 0;
    }

    /* renamed from: a  reason: collision with other method in class */
    private static ApplicationInfo m1944a(Context context, String str) {
        if (str.equals(context.getPackageName())) {
            return context.getApplicationInfo();
        }
        try {
            return context.getPackageManager().getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("not found app info " + str);
            return null;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static Drawable m1945a(Context context, String str) {
        ApplicationInfo m1944a = m1944a(context, str);
        Drawable drawable = null;
        if (m1944a != null) {
            try {
                drawable = m1944a.loadIcon(context.getPackageManager());
                if (drawable == null) {
                    drawable = m1944a.loadLogo(context.getPackageManager());
                }
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.m1616a("get app icon drawable failed, " + e);
            }
        }
        return drawable != null ? drawable : new ColorDrawable(0);
    }

    private static b a(Context context, ApplicationInfo applicationInfo) {
        int i = Build.VERSION.SDK_INT;
        if (applicationInfo == null || i < 24) {
            return b.UNKNOWN;
        }
        Boolean bool = null;
        try {
            if (applicationInfo.packageName.equals(context.getPackageName())) {
                bool = Boolean.valueOf(((NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION)).areNotificationsEnabled());
            } else {
                Object a2 = i >= 29 ? bh.a(context.getSystemService(RemoteMessageConst.NOTIFICATION), "getService", new Object[0]) : context.getSystemService(Baggage.Amnet.CFG_SSL);
                if (a2 != null) {
                    bool = (Boolean) bh.b(a2, "areNotificationsEnabledForPackage", applicationInfo.packageName, Integer.valueOf(applicationInfo.uid));
                }
            }
            if (bool != null) {
                return bool.booleanValue() ? b.ALLOWED : b.NOT_ALLOWED;
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("are notifications enabled error " + e);
        }
        return b.UNKNOWN;
    }

    public static b a(Context context, String str, boolean z) {
        ApplicationInfo applicationInfo;
        b a2;
        if (context == null || StringUtils.isEmpty(str)) {
            return b.UNKNOWN;
        }
        try {
            applicationInfo = str.equals(context.getPackageName()) ? context.getApplicationInfo() : context.getPackageManager().getApplicationInfo(str, 0);
            a2 = a(context, applicationInfo);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("get app op error " + th);
        }
        if (a2 != b.UNKNOWN) {
            return a2;
        }
        Integer num = (Integer) bh.a((Class<? extends Object>) AppOpsManager.class, "OP_POST_NOTIFICATION");
        if (num == null) {
            return b.UNKNOWN;
        }
        Integer num2 = (Integer) bh.a((Object) ((AppOpsManager) context.getSystemService("appops")), "checkOpNoThrow", num, Integer.valueOf(applicationInfo.uid), str);
        int i = (Integer) bh.a((Class<? extends Object>) AppOpsManager.class, "MODE_ALLOWED");
        int i2 = (Integer) bh.a((Class<? extends Object>) AppOpsManager.class, "MODE_IGNORED");
        com.xiaomi.channel.commonutils.logger.b.b(String.format("get app mode %s|%s|%s", num2, i, i2));
        if (i == null) {
            i = 0;
        }
        if (i2 == null) {
            i2 = 1;
        }
        if (num2 != null) {
            return z ? !num2.equals(i2) ? b.ALLOWED : b.NOT_ALLOWED : num2.equals(i) ? b.ALLOWED : b.NOT_ALLOWED;
        }
        return b.UNKNOWN;
    }

    public static String a() {
        String processName = Build.VERSION.SDK_INT >= 28 ? Application.getProcessName() : (String) bh.a(ProcessUtils.ACTIVITY_THREAD, "currentProcessName", new Object[0]);
        return !StringUtils.isEmpty(processName) ? processName : "";
    }

    /* renamed from: a  reason: collision with other method in class */
    public static String m1946a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception unused) {
            packageInfo = null;
        }
        return packageInfo != null ? packageInfo.versionName : "1.0";
    }

    /* renamed from: a  reason: collision with other method in class */
    public static Map<String, String> m1947a(Context context, String str) {
        a aVar = f24488a;
        if (aVar == null) {
            return null;
        }
        return aVar.a(context, str);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m1948a(Context context) {
        String a2 = a();
        if (StringUtils.isEmpty(a2) || context == null) {
            return false;
        }
        return a2.equals(context.getPackageName());
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m1949a(Context context, String str) {
        if (context != null && !StringUtils.isEmpty(str)) {
            if (!j.m2117a()) {
                return context.getPackageName().equals(str);
            }
            a aVar = f24488a;
            if (aVar != null && aVar.m1952a(context, str)) {
                return true;
            }
        }
        return false;
    }

    public static int b(Context context, String str) {
        ApplicationInfo m1944a = m1944a(context, str);
        if (m1944a != null) {
            int i = m1944a.icon;
            return i == 0 ? m1944a.logo : i;
        }
        return 0;
    }

    /* renamed from: b  reason: collision with other method in class */
    public static String m1950b(Context context, String str) {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            return (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null) ? str : packageManager.getApplicationLabel(applicationInfo).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return str;
        }
    }

    /* renamed from: b  reason: collision with other method in class */
    public static boolean m1951b(Context context, String str) {
        a aVar = f24488a;
        return aVar != null && aVar.b(context, str);
    }

    public static boolean c(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    public static boolean d(Context context, String str) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public static boolean e(Context context, String str) {
        if (context == null || StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "freeform_window_state", -1) < 0) {
                return false;
            }
            return str.equals(Settings.Secure.getString(context.getContentResolver(), "freeform_package_name"));
        } catch (Exception unused) {
            return false;
        }
    }
}
