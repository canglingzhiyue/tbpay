package com.hihonor.push.sdk;

/* loaded from: classes4.dex */
public class g {
    public static void a(String str) {
        String str2;
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "";
                break;
            } else if (!stackTrace[i].getClass().equals(g.class)) {
                String className = stackTrace[i].getClassName();
                str2 = className.substring(className.lastIndexOf(46) + 1);
                break;
            } else {
                i++;
            }
        }
        a("HonorPush_" + str2, str, null);
    }

    public static void a(String str, String str2, Throwable th) {
        if (str2.length() > 4000) {
            int i = 0;
            while (i < str2.length()) {
                int i2 = i + 4000;
                if (i2 < str2.length()) {
                    str2.substring(i, i2);
                } else {
                    str2.substring(i);
                }
                i = i2;
            }
        }
    }
}
