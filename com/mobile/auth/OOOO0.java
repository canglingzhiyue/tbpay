package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;

/* loaded from: classes4.dex */
public final class OOOO0 {
    public static Boolean O000000o(String str) {
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
