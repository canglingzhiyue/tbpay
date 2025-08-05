package com.tmall.android.dai.internal.util;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public final class LogUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String sLogTag;

    public static native void setCLoggerEnable(boolean z);

    public static native void setCLoggerReceiver(int i);

    static {
        kge.a(1568338451);
        sLogTag = "DAI-JAVA.";
    }

    public static void e(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
            return;
        }
        toLogcatE(sLogTag + str, "[error] " + str2, th);
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else {
            e(str, str2, null);
        }
    }

    public static void w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefb3f92", new Object[]{str, str2});
            return;
        }
        toLogcatW(sLogTag + str, "[warning] " + str2, null);
    }

    public static void inf(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ecb5", new Object[]{str, str2, objArr});
            return;
        }
        try {
            String str3 = sLogTag + str;
            toLogcatI(str3, "[info] " + String.format(str2, objArr), null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
            return;
        }
        toLogcatD(sLogTag + str, "[debug] " + str2, null);
    }

    private static void toLogcatD(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24a86ea3", new Object[]{str, str2, th});
        } else if (str2.length() <= 1000) {
        } else {
            str2.substring(0, 1000);
            toLogcatD(str, str2.substring(1000), th);
        }
    }

    private static void toLogcatI(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e09cbe", new Object[]{str, str2, th});
        } else if (str2.length() <= 1000) {
        } else {
            str2.substring(0, 1000);
            toLogcatI(str, str2.substring(1000), th);
        }
    }

    private static void toLogcatW(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("254ab770", new Object[]{str, str2, th});
        } else if (str2.length() <= 1000) {
        } else {
            str2.substring(0, 1000);
            toLogcatW(str, str2.substring(1000), th);
        }
    }

    private static void toLogcatE(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8e6de42", new Object[]{str, str2, th});
        } else if (str2.length() > 1000) {
            Log.e(str, str2.substring(0, 1000), null);
            toLogcatE(str, str2.substring(1000), th);
        } else {
            Log.e(str, str2, th);
        }
    }
}
