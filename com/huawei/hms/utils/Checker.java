package com.huawei.hms.utils;

import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;

/* loaded from: classes.dex */
public final class Checker {
    private Checker() {
    }

    public static void assertHandlerThread(Handler handler) {
        assertHandlerThread(handler, "Must be called on the handler thread");
    }

    public static void assertHandlerThread(Handler handler, String str) {
        if (Looper.myLooper() == handler.getLooper()) {
            return;
        }
        throw new IllegalStateException(str);
    }

    public static void assertNonEmpty(String str) {
        if (!StringUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalStateException("Given String is empty or null");
    }

    public static void assertNonEmpty(String str, String str2) {
        if (!StringUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalStateException(String.valueOf(str2));
    }

    public static <T> T assertNonNull(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("Null reference");
    }

    public static <T> T assertNonNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(str));
    }

    public static void assertNotUiThread(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException(str);
    }

    public static void assertUiThread(String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException(str);
    }

    public static String checkNonEmpty(String str) {
        if (!StringUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public static String checkNonEmpty(String str, String str2) {
        if (!StringUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(str2));
    }

    public static <T> T checkNonNull(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("Null reference");
    }

    public static <T> T checkNonNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(str));
    }

    public static int checkNonZero(int i) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    public static int checkNonZero(int i, String str) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException(String.valueOf(str));
    }

    public static long checkNotZero(long j) {
        if (j != 0) {
            return j;
        }
        throw new IllegalArgumentException("Given Long is zero");
    }

    public static long checkNotZero(long j, String str) {
        if (j != 0) {
            return j;
        }
        throw new IllegalArgumentException(String.valueOf(str));
    }
}
