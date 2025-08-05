package com.alipay.ma;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MaLogger {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static volatile MaEngineLogger f5311a = null;
    private static boolean b = false;

    /* loaded from: classes3.dex */
    public interface MaEngineLogger {
        void d(String str, String str2);

        void e(String str, String str2);

        void e(String str, String str2, Throwable th);

        void i(String str, String str2);

        boolean isDebuggable();

        void v(String str, String str2);

        void w(String str, String str2);
    }

    public static void registerLogger(MaEngineLogger maEngineLogger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2126ca85", new Object[]{maEngineLogger});
        } else {
            f5311a = maEngineLogger;
        }
    }

    public static void unRegisterLogger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19f34393", new Object[0]);
        } else {
            f5311a = null;
        }
    }

    public static void v(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("625b1491", new Object[]{str, str2});
        } else if (f5311a == null) {
        } else {
            f5311a.v(str, str2);
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
            return;
        }
        try {
            if (f5311a == null) {
                return;
            }
            f5311a.d(str, str2);
        } catch (Exception unused) {
        }
    }

    public static void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{str, str2});
            return;
        }
        try {
            if (f5311a == null) {
                return;
            }
            f5311a.i(str, str2);
        } catch (Exception unused) {
        }
    }

    public static void w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefb3f92", new Object[]{str, str2});
            return;
        }
        try {
            if (f5311a == null) {
                return;
            }
            f5311a.w(str, str2);
        } catch (Exception unused) {
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
            return;
        }
        try {
            if (f5311a == null) {
                return;
            }
            f5311a.e(str, str2);
        } catch (Exception unused) {
        }
    }

    public static void e(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9407f", new Object[]{str, th});
            return;
        }
        try {
            if (f5311a == null || th == null) {
                return;
            }
            f5311a.e(str, th.getMessage());
        } catch (Exception unused) {
        }
    }

    public static void e(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
            return;
        }
        try {
            if (f5311a == null || th == null) {
                return;
            }
            MaEngineLogger maEngineLogger = f5311a;
            maEngineLogger.e(str, str2 + ":" + th.getMessage());
        } catch (Exception unused) {
        }
    }

    public static boolean isDebuggable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4500e523", new Object[0])).booleanValue() : b;
    }
}
