package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.security.ccrc.service.build.C1238p;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes9.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private static String f24540a = null;

    /* renamed from: a  reason: collision with other field name */
    private static final Set<String> f495a;

    /* renamed from: a  reason: collision with other field name */
    private static boolean f496a = false;
    private static String b = null;
    private static String c = "";
    private static String d;
    private static String e;
    private static final String f = String.valueOf((char) 2);

    /* renamed from: a  reason: collision with other field name */
    private static final String[] f497a = {"--", "a-", "u-", "v-", "o-", "g-", "d-"};

    static {
        HashSet hashSet = new HashSet();
        f495a = hashSet;
        hashSet.add("com.xiaomi.xmsf");
        f495a.add("com.xiaomi.finddevice");
        f495a.add("com.miui.securitycenter");
        f496a = true;
    }

    private static double a(double d2) {
        int i = 1;
        while (true) {
            double d3 = i;
            if (d3 < d2) {
                i <<= 1;
            } else {
                return d3;
            }
        }
    }

    private static float a(int i) {
        float f2 = ((((((i + C1238p.b) / 524288) + 1) << 9) << 10) / 1024.0f) / 1024.0f;
        double d2 = f2;
        return d2 > 0.5d ? (float) Math.ceil(d2) : f2;
    }

    public static int a() {
        Object a2 = bh.a("android.os.UserHandle", "myUserId", new Object[0]);
        if (a2 == null) {
            return -1;
        }
        return ((Integer) Integer.class.cast(a2)).intValue();
    }

    private static long a(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return statFs.getBlockSizeLong() * statFs.getBlockCountLong();
    }

    /* renamed from: a  reason: collision with other method in class */
    public static String m2025a() {
        return a(b()) + "GB";
    }

    /* renamed from: a  reason: collision with other method in class */
    private static String m2026a(int i) {
        if (i > 0) {
            String[] strArr = f497a;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        return f497a[0];
    }

    @Deprecated
    public static String a(Context context) {
        return null;
    }

    public static synchronized String a(Context context, boolean z) {
        String str;
        synchronized (i.class) {
            if (d == null) {
                String b2 = b(context);
                int i = 1;
                switch (1) {
                    case 1:
                        String str2 = "";
                        if (!j.m2123d()) {
                            str2 = z ? c(context) : j(context);
                        }
                        String a2 = a(context);
                        if (!(Build.VERSION.SDK_INT < 26)) {
                            if (b(str2)) {
                                if (!b(a2)) {
                                }
                            }
                        }
                        b2 = str2 + b2 + a2;
                        break;
                    case 2:
                        String b3 = ax.a(context).b();
                        if (!StringUtils.isEmpty(b3)) {
                            b2 = b3 + b2;
                            i = 2;
                            break;
                        }
                    case 3:
                    case 4:
                        String mo1730a = ax.a(context).mo1730a();
                        if (!StringUtils.isEmpty(mo1730a) && !mo1730a.startsWith("00000000-0000-0000-0000-000000000000")) {
                            i = 4;
                            b2 = mo1730a;
                            break;
                        }
                        break;
                    case 5:
                        if (!StringUtils.isEmpty(b2)) {
                            i = 5;
                            break;
                        }
                    case 6:
                        b2 = k(context);
                        i = 6;
                        break;
                    default:
                        b2 = "";
                        break;
                }
                com.xiaomi.channel.commonutils.logger.b.b("devid rule select:" + i);
                if (i == 3) {
                    d = b2;
                } else {
                    d = m2026a(i) + bm.b(b2);
                }
            }
            str = d;
        }
        return str;
    }

    private static void a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("device_info", 0);
        if (StringUtils.isEmpty(sharedPreferences.getString("default_id", null))) {
            sharedPreferences.edit().putString("default_id", str).apply();
        } else {
            com.xiaomi.channel.commonutils.logger.b.m1616a("default_id exist,do not change it.");
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m2027a(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            return intExtra == 2 || intExtra == 5;
        }
        return false;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m2028a(Context context, String str) {
        PackageInfo packageInfo = (PackageInfo) bh.a((Object) context.getPackageManager(), "getPackageInfoAsUser", str, 0, 999);
        return packageInfo == null || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 8388608) != 8388608;
    }

    public static boolean a(String str) {
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        int i = 0;
        while (true) {
            String[] strArr = f497a;
            if (i >= strArr.length) {
                return false;
            }
            if (str.startsWith(strArr[i])) {
                return true;
            }
            i++;
        }
    }

    public static int b() {
        BufferedReader bufferedReader;
        Throwable th;
        String[] split;
        if (new File("/proc/meminfo").exists()) {
            BufferedReader bufferedReader2 = null;
            try {
                try {
                    bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
                } catch (Exception unused) {
                } catch (Throwable th2) {
                    bufferedReader = null;
                    th = th2;
                }
                try {
                    String readLine = bufferedReader.readLine();
                    if (!StringUtils.isEmpty(readLine) && (split = readLine.split("\\s+")) != null && split.length >= 2 && StringUtils.isDigitsOnly(split[1])) {
                        Integer.parseInt(split[1]);
                    }
                    bufferedReader.close();
                } catch (Exception unused2) {
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                    return 0;
                } catch (Throwable th3) {
                    th = th3;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused4) {
            }
        }
        return 0;
    }

    /* renamed from: b  reason: collision with other method in class */
    public static String m2029b() {
        double a2 = a(((a(Environment.getDataDirectory()) / 1024.0d) / 1024.0d) / 1024.0d);
        return a2 + "GB";
    }

    public static String b(Context context) {
        if (b != null || !f496a) {
            return b;
        }
        boolean m2031c = m2031c(context);
        f496a = m2031c;
        if (!m2031c) {
            return null;
        }
        try {
            b = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("failure to get androidId: " + th);
        }
        return b;
    }

    /* renamed from: b  reason: collision with other method in class */
    public static boolean m2030b(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return powerManager == null || powerManager.isScreenOn();
    }

    private static boolean b(String str) {
        if (str == null) {
            return true;
        }
        String trim = str.trim();
        return trim.length() == 0 || trim.equalsIgnoreCase("null") || trim.equalsIgnoreCase("unknown");
    }

    public static String c() {
        return b() + "KB";
    }

    @Deprecated
    public static String c(Context context) {
        return null;
    }

    /* renamed from: c  reason: collision with other method in class */
    private static boolean m2031c(Context context) {
        if ("com.xiaomi.xmsf".equals(context.getPackageName())) {
            return true;
        }
        Intent intent = new Intent();
        ComponentName componentName = new ComponentName(context.getPackageName(), "com.xiaomi.push.service.XMPushService");
        intent.setComponent(componentName);
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(componentName, 128);
            if (serviceInfo.metaData != null) {
                String string = serviceInfo.metaData.getString("supportGetAndroidID");
                if (!StringUtils.isEmpty(string)) {
                    return Boolean.parseBoolean(string);
                }
                return true;
            }
        } catch (Exception unused) {
        }
        return true;
    }

    public static String d() {
        long a2 = a(Environment.getDataDirectory());
        return (a2 / 1024) + "KB";
    }

    @Deprecated
    public static String d(Context context) {
        return null;
    }

    @Deprecated
    public static String e(Context context) {
        return null;
    }

    @Deprecated
    public static String f(Context context) {
        return "";
    }

    public static synchronized String g(Context context) {
        synchronized (i.class) {
            if (e != null) {
                return e;
            }
            String b2 = b(context);
            String a2 = a(context);
            String b3 = bm.b(b2 + a2);
            e = b3;
            return b3;
        }
    }

    public static synchronized String h(Context context) {
        String b2;
        synchronized (i.class) {
            String b3 = b(context);
            b2 = bm.b(b3 + ((String) null));
        }
        return b2;
    }

    public static String i(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
    }

    @Deprecated
    private static String j(Context context) {
        return "";
    }

    private static String k(Context context) {
        String string = context.getSharedPreferences("device_info", 0).getString("default_id", null);
        if (StringUtils.isEmpty(string)) {
            String l = l(context);
            a(context, l);
            return l;
        }
        return string;
    }

    private static String l(Context context) {
        String str = Build.BRAND;
        String str2 = Build.MODEL;
        int i = Build.VERSION.SDK_INT;
        String str3 = Build.VERSION.RELEASE;
        String str4 = Build.VERSION.INCREMENTAL;
        int a2 = a();
        String packageName = context.getPackageName();
        long currentTimeMillis = System.currentTimeMillis();
        String a3 = bm.a(16);
        return bj.a(str + "_" + str2 + "_" + i + "_" + str3 + "_" + str4 + "_" + a2 + "_" + packageName + "_" + currentTimeMillis + "_" + a3);
    }
}
