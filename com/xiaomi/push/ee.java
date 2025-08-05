package com.xiaomi.push;

import android.content.Context;
import android.os.Build;

/* loaded from: classes9.dex */
public class ee {
    private static void a(byte[] bArr) {
        if (bArr.length >= 2) {
            bArr[0] = 99;
            bArr[1] = 100;
        }
    }

    public static boolean a(Context context, String str, long j) {
        return com.xiaomi.push.service.az.a(context).a(ih.DCJobMutualSwitch.a(), false) && (Build.VERSION.SDK_INT < 29 || context.getApplicationInfo().targetSdkVersion < 29) && !af.a(context, str, j);
    }

    public static byte[] a(String str, byte[] bArr) {
        byte[] m1740a = bj.m1740a(str);
        try {
            a(m1740a);
            return h.a(m1740a, bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] b(String str, byte[] bArr) {
        byte[] m1740a = bj.m1740a(str);
        try {
            a(m1740a);
            return h.b(m1740a, bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
