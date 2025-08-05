package com.mobile.auth;

import android.content.Context;
import com.mobile.auth.gatewayauth.ExceptionProcessor;

/* loaded from: classes4.dex */
public class OoO0o {
    public static int O000000o(Context context, int i) {
        try {
            try {
                return Integer.parseInt(O000o.O000000o(context).O00000Oo(context).optString("operatortype"));
            } catch (Exception e) {
                com.mobile.auth.gatewayauth.utils.O0000Oo0.O000000o(e);
                return i;
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return -1;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return -1;
            }
        }
    }

    public static String O000000o(Context context) {
        try {
            try {
                O0Oo.O000000o(context);
                O0O0OOO.O000000o(context);
                return O0O0OOO.O000000o().O00000Oo();
            } catch (Exception e) {
                e.toString();
                return null;
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }
}
