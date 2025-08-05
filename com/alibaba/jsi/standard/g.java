package com.alibaba.jsi.standard;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes2.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(694539809);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else {
            Log.e("jsi", str);
        }
    }

    public static String a(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{obj}) : ((Context) obj).getApplicationInfo().dataDir;
    }

    public static String b(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e17923bb", new Object[]{obj}) : ((Context) obj).getApplicationInfo().nativeLibraryDir;
    }

    public static String c(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3897149a", new Object[]{obj}) : ((Context) obj).getPackageName();
    }

    public static String a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93e4ff52", new Object[]{obj, str});
        }
        try {
            return ((Context) obj).getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Throwable th) {
            th.printStackTrace();
            return "<unknown>";
        }
    }

    public static Object a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bd3407ca", new Object[0]) : new LruCache(16);
    }

    public static void a(Object obj, String str, Method method) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d9b4b6", new Object[]{obj, str, method});
        } else {
            ((LruCache) obj).put(str, method);
        }
    }

    public static Method b(Object obj, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Method) ipChange.ipc$dispatch("b5a58f4f", new Object[]{obj, str}) : (Method) ((LruCache) obj).get(str);
    }

    public static boolean a(Object obj, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("53ab618a", new Object[]{obj, str, new Boolean(z)})).booleanValue() : ((Bundle) obj).getBoolean(str, z);
    }

    public static Object b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("43b9c269", new Object[0]);
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            return null;
        }
        return new Handler(myLooper);
    }

    public static boolean d(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("84b9de0b", new Object[]{obj})).booleanValue() : obj != null && ((Handler) obj).getLooper() == Looper.myLooper();
    }

    public static void a(Object obj, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81f832c2", new Object[]{obj, runnable});
        } else {
            ((Handler) obj).post(runnable);
        }
    }

    public static void a(Object obj, Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd0e9c42", new Object[]{obj, runnable, new Long(j)});
        } else if (j == 0) {
            ((Handler) obj).post(runnable);
        } else {
            ((Handler) obj).postDelayed(runnable, j);
        }
    }

    public static void b(Object obj, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6739a183", new Object[]{obj, runnable});
        } else {
            ((Handler) obj).removeCallbacks(runnable);
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : Build.VERSION.SDK_INT < 23;
    }
}
