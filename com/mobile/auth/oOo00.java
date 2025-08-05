package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;

/* loaded from: classes4.dex */
public final class oOo00 {
    public static String O000000o = "";
    private static String O00000Oo = "";
    private static String O00000o = "";
    private static String O00000o0 = "";
    private static long O00000oO = 0;
    private static long O00000oo = 0;
    private static String O0000O0o = "CU";

    public static void O000000o(long j) {
        try {
            O00000oo = j;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O000000o(String str) {
        try {
            O0000O0o = str;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O00000Oo(long j) {
        try {
            O00000oO = j;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O00000Oo(String str) {
        try {
            O00000o0 = str;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O00000o(String str) {
        try {
            O00000o = str;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O00000o0(String str) {
        try {
            O00000Oo = str;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static Boolean O00000oO(String str) {
        if (str != null) {
            try {
                if (str.length() != 0 && str.trim().length() != 0 && !"null".equals(str) && !str.equals("")) {
                    return Boolean.TRUE;
                }
            } catch (Throwable th) {
                ExceptionProcessor.processException(th);
                return null;
            }
        }
        return Boolean.FALSE;
    }
}
