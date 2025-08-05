package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes9.dex */
public class cy {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f24411a;

    static void a(String str) {
        a("Push-ConnectionQualityStatsHelper", str);
    }

    public static void a(String str, String str2) {
    }

    public static boolean a(Context context) {
        boolean z;
        if (f24411a == null) {
            if (!j.m2118a(context)) {
                f24411a = false;
            }
            String m2361a = com.xiaomi.push.service.v.m2361a(context);
            if (TextUtils.isEmpty(m2361a) || m2361a.length() < 3) {
                z = false;
            } else {
                String substring = m2361a.substring(m2361a.length() - 3);
                a("shouldSampling uuid suffix = " + substring);
                z = Boolean.valueOf(TextUtils.equals(substring, "001"));
            }
            f24411a = z;
            a("shouldSampling = " + f24411a);
        }
        return f24411a.booleanValue();
    }
}
