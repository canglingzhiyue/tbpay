package com.mobile.auth;

import android.util.Log;
import com.mobile.auth.gatewayauth.ExceptionProcessor;

/* loaded from: classes4.dex */
public final class OO0O0o0 {
    private static boolean O000000o = false;

    public static void O000000o(String str) {
        try {
            Log.e("uniaccount", "6.1.2 ".concat(String.valueOf(str)));
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
}
