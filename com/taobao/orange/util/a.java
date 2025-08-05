package com.taobao.orange.util;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f18598a;
    private static String b;
    private static volatile long c;

    static {
        kge.a(888352402);
        b = "";
        f18598a = "";
        c = -1L;
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return true;
        }
        try {
            if (TextUtils.isEmpty(b)) {
                b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.processName;
                OLog.d("AndroidUtil", "isMainProcess", "mainProcessName", b);
            }
            if (TextUtils.isEmpty(f18598a)) {
                f18598a = a(context, Process.myPid());
                OLog.d("AndroidUtil", "isMainProcess", "currentProcessName", f18598a);
            }
            if (!TextUtils.isEmpty(b) && !TextUtils.isEmpty(f18598a)) {
                return b.equalsIgnoreCase(f18598a);
            }
            return true;
        } catch (Throwable th) {
            OLog.e("AndroidUtil", "isMainProcess", th, new Object[0]);
            return true;
        }
    }

    private static String a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe74945d", new Object[]{context, new Integer(i)});
        }
        String str = "";
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            try {
                if (runningAppProcessInfo.pid == i) {
                    str = runningAppProcessInfo.processName;
                }
                if (b.equals(runningAppProcessInfo.processName)) {
                    com.taobao.orange.a.c = true;
                    OLog.e("AndroidUtil", "getProcessName: " + com.taobao.orange.a.c, new Object[0]);
                }
                if ("com.taobao.taobao:channel".equals(runningAppProcessInfo.processName)) {
                    com.taobao.orange.a.e = true;
                }
            } catch (Exception unused) {
            }
        }
        return str;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            Process.setThreadPriority(2);
        } catch (Throwable th) {
            OLog.e("AndroidUtil", "setThreadPriority", th, new Object[0]);
        }
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue() : a(context, false);
    }

    public static boolean a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("258fda78", new Object[]{context, new Boolean(z)})).booleanValue();
        }
        try {
            if (TextUtils.isEmpty(b) || z) {
                b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.processName;
                OLog.e("AndroidUtil", "isMainProcess", "mainProcessName", b);
            }
            if (TextUtils.isEmpty(f18598a) || z) {
                f18598a = a(context, Process.myPid());
                OLog.e("AndroidUtil", "currentProcess:" + f18598a, new Object[0]);
            }
        } catch (Throwable th) {
            OLog.e("AndroidUtil", "isTaobaoChannelProcess", th.toString());
        }
        return "com.taobao.taobao:channel".equals(f18598a);
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        String packageName = context.getPackageName();
        return "com.taobao.taobao".equals(packageName) || "com.tmall.wireless".equals(packageName);
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue();
        }
        if (context != null) {
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    return activeNetworkInfo.isAvailable();
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dd", new Object[0])).longValue();
        }
        if (c != -1) {
            return c;
        }
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                c = System.currentTimeMillis() - (SystemClock.uptimeMillis() - Process.getStartUptimeMillis());
            } else {
                c = com.taobao.application.common.c.a().a("startProcessSystemTime", 0L);
            }
        } catch (Throwable th) {
            OLog.e("AndroidUtil", "getProcessStartSystemTime error", th, new Object[0]);
        }
        return c;
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0d012e0", new Object[]{context})).booleanValue();
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            try {
            } catch (Throwable th) {
                OLog.e("AndroidUtil", "checkTaoChannelProcessAlive error", th, new Object[0]);
            }
            if ("com.taobao.taobao:channel".equals(runningAppProcessInfo.processName)) {
                com.taobao.orange.a.e = true;
                return true;
            }
            continue;
        }
        return false;
    }
}
