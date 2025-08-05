package com.vivo.push.util;

/* loaded from: classes9.dex */
public final class y {
    public static int a(com.vivo.push.b.c cVar) {
        ad b = ad.b();
        int b2 = cVar.b();
        long currentTimeMillis = System.currentTimeMillis();
        int b3 = b.b("com.vivo.push_preferences.operate." + b2 + "OPERATE_COUNT", 0);
        long b4 = currentTimeMillis - b.b("com.vivo.push_preferences.operate." + b2 + "START_TIME", 0L);
        if (b4 > 86400000 || b4 < 0) {
            b.a("com.vivo.push_preferences.operate." + b2 + "START_TIME", System.currentTimeMillis());
            b.a("com.vivo.push_preferences.operate." + b2 + "OPERATE_COUNT", 1);
        } else if (b3 >= cVar.d()) {
            return 1001;
        } else {
            b.a("com.vivo.push_preferences.operate." + b2 + "OPERATE_COUNT", b3 + 1);
        }
        return 0;
    }
}
