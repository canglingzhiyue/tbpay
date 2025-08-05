package com.xiaomi.push;

/* loaded from: classes9.dex */
public class q {
    public static String a(String str, String str2) {
        try {
            return (String) r.a(null, "android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("SystemProperties.get: " + e);
            return str2;
        }
    }
}
