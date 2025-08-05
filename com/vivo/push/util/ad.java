package com.vivo.push.util;

import android.content.Context;

/* loaded from: classes9.dex */
public final class ad extends c {
    private static ad b;

    public static synchronized ad b() {
        ad adVar;
        synchronized (ad.class) {
            if (b == null) {
                b = new ad();
            }
            adVar = b;
        }
        return adVar;
    }

    private static byte[] b(String str) {
        int i;
        byte[] bArr = null;
        try {
            String[] split = str.split(",");
            if (split.length > 0) {
                bArr = new byte[split.length];
                i = split.length;
            } else {
                i = 0;
            }
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = Byte.parseByte(split[i2].trim());
            }
        } catch (Exception e) {
            u.a("SharePreferenceManager", "getCodeBytes error:" + e.getMessage());
        }
        return bArr;
    }

    public final synchronized void a(Context context) {
        if (this.f24260a == null) {
            this.f24260a = context;
            a(context, "com.vivo.push_preferences");
        }
    }

    public final byte[] c() {
        byte[] b2 = b(b("com.vivo.push.secure_cache_iv", ""));
        return (b2 == null || b2.length <= 0) ? new byte[]{34, 32, 33, 37, 33, 34, 32, 33, 33, 33, 34, 41, 35, 32, 32, 32} : b2;
    }

    public final byte[] d() {
        byte[] b2 = b(b("com.vivo.push.secure_cache_key", ""));
        return (b2 == null || b2.length <= 0) ? new byte[]{33, 34, 35, 36, 37, 38, 39, 40, 41, 32, 38, 37, 36, 35, 34, 33} : b2;
    }
}
