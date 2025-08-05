package com.unionpay.utils;

import android.util.Log;

/* loaded from: classes9.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static int f24049a = Integer.MAX_VALUE;

    private static int a(int i, String str, String str2) {
        if (str != null && str2 != null) {
            if (i == 2) {
                return Log.v(str, str2);
            }
            if (i == 3) {
                return Log.d(str, str2);
            }
            if (i == 4) {
                return Log.i(str, str2);
            }
            if (i == 5) {
                return Log.w(str, str2);
            }
            if (i == 6) {
                return Log.e(str, str2);
            }
        }
        return 0;
    }

    public static int a(String str, String str2) {
        if (f24049a <= 3) {
            a(3, str, str2);
            return 0;
        }
        return 0;
    }

    public static int b(String str, String str2) {
        if (f24049a <= 4) {
            a(4, str, str2);
            return 0;
        }
        return 0;
    }

    public static int c(String str, String str2) {
        if (f24049a <= 6) {
            return a(6, str, str2);
        }
        return 0;
    }
}
