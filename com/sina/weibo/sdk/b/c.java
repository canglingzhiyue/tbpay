package com.sina.weibo.sdk.b;

import android.util.Log;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.kge;
import tb.riy;

/* loaded from: classes4.dex */
public final class c {
    private static boolean ai;

    static {
        kge.a(-1099070);
        ai = false;
    }

    public static void a(String str, String str2) {
        if (ai) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            String str3 = (stackTraceElement.getFileName() + riy.BRACKET_START_STR + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + ResponseProtocolType.COMMENT + str2;
        }
    }

    public static void b(String str, String str2) {
        if (ai) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            Log.e(str, (stackTraceElement.getFileName() + riy.BRACKET_START_STR + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + ResponseProtocolType.COMMENT + str2);
        }
    }

    public static void setLoggerEnable(boolean z) {
        ai = z;
    }
}
