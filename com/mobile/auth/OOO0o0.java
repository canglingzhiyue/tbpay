package com.mobile.auth;

import android.util.Log;
import com.mobile.auth.gatewayauth.ExceptionProcessor;

/* loaded from: classes4.dex */
public final class OOO0o0 {
    private static boolean O000000o = true;
    private static int O00000Oo = 2;
    private static int O00000o;
    private static long O00000o0;

    public static void O000000o() {
        try {
            O00000o = 0;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O000000o(String str) {
        try {
            O00000Oo("\n" + str + "\n");
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O000000o(boolean z) {
        try {
            O000000o = z;
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O00000Oo(String str) {
        try {
            StringBuilder sb = new StringBuilder("【");
            int i = O00000o;
            O00000o = i + 1;
            sb.append(i);
            sb.append("】\n时间戳:");
            sb.append(System.currentTimeMillis());
            sb.append("\n时间差:");
            sb.append(System.currentTimeMillis() - O00000o0);
            sb.append("\n数据:\n");
            sb.append(str);
            sb.append("\n\n");
            O00000o0 = System.currentTimeMillis();
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O00000o(String str) {
        try {
            if (!O000000o) {
                return;
            }
            Log.e("UniAccount", OOO0O0O.O00000Oo() + " " + str);
            O00000Oo(str);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O00000o0(String str) {
        try {
            if (!O000000o) {
                return;
            }
            String str2 = OOO0O0O.O00000Oo() + " " + str;
            O00000Oo(str);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static void O00000oO(String str) {
        try {
            Log.e("UniAccount", OOO0O0O.O00000Oo() + " " + str);
            O00000Oo(str);
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }
}
