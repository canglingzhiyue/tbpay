package com.alibaba.wireless.security.framework.utils;

import android.os.Process;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class FLOG {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static String f4287a = "SGTIME";
    private static boolean b = false;

    static {
        kge.a(-52566644);
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        }
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
        }
    }

    public static String get_currentFuncName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d3e6473a", new Object[0]);
        }
        if (!b) {
            return null;
        }
        return Thread.currentThread().getStackTrace()[3].getMethodName();
    }

    public static long get_currentTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("99a2ba78", new Object[0])).longValue();
        }
        if (!b) {
            return 0L;
        }
        return System.currentTimeMillis();
    }

    public static void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{str});
        }
    }

    public static void printTimeCost(String str, String str2, String str3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac578dd8", new Object[]{str, str2, str3, new Long(j)});
        } else if (!b) {
        } else {
            String str4 = f4287a;
            Log.e(str4, riy.ARRAY_START_STR + Process.myPid() + "][" + Process.myTid() + "][" + str + "][JAVA][" + str2 + "] cost = " + (System.currentTimeMillis() - j) + " ms [" + str3 + riy.ARRAY_END_STR);
        }
    }

    public static void w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e977c8", new Object[]{str});
        }
    }

    public static void w(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be68a92d", new Object[]{str, th});
        }
    }
}
