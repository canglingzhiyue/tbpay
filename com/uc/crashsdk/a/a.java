package com.uc.crashsdk.a;

import com.alibaba.analytics.core.sync.q;
import com.taobao.calendar.sdk.db.schedule.Repeat;
import com.uc.crashsdk.JNIBridge;

/* loaded from: classes.dex */
public final class a {
    public static void a(int i, String str, String str2, Throwable th) {
        if (i < 0) {
            i = 0;
        }
        if (i > 4) {
            i = 4;
        }
        try {
            Class<?> cls = Class.forName("android.util.Log");
            String[] strArr = {"v", Repeat.D, q.MSGTYPE_INTERVAL, "w", "e"};
            if (th != null) {
                cls.getDeclaredMethod(strArr[i], String.class, String.class, Throwable.class).invoke(null, str, str2, th);
            } else {
                cls.getDeclaredMethod(strArr[i], String.class, String.class).invoke(null, str, str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(String str) {
        if (com.uc.crashsdk.g.M()) {
            a(1, "crashsdk", str, null);
        }
    }

    public static void a(String str, String str2) {
        if (com.uc.crashsdk.g.M()) {
            a(2, str, str2, null);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        if (com.uc.crashsdk.g.M()) {
            a(4, str, str2, th);
        }
    }

    public static void b(String str) {
        if (com.uc.crashsdk.g.M()) {
            a(3, "crashsdk", str, null);
        }
    }

    public static void b(String str, String str2) {
        if (com.uc.crashsdk.b.d) {
            JNIBridge.nativeLog(4, str, str2);
        } else {
            a(2, str, str2, null);
        }
    }

    public static void c(String str, String str2) {
        if (com.uc.crashsdk.b.d) {
            JNIBridge.nativeLog(5, str, str2);
        } else {
            a(3, str, str2, null);
        }
    }

    public static void d(String str, String str2) {
        if (com.uc.crashsdk.b.d) {
            JNIBridge.nativeLog(6, str, str2);
        } else {
            a(4, str, str2, null);
        }
    }
}
