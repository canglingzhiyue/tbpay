package com.mobile.auth.gatewayauth.utils;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import tb.czp;

/* loaded from: classes4.dex */
public class O0000Oo0 {
    private static boolean O000000o = false;
    private static boolean O00000Oo = true;

    public static void O000000o(String str) {
        try {
            if (!O000000o) {
                return;
            }
            StringUtils.isEmpty(str);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public static void O000000o(Throwable th) {
        try {
            if (!O000000o || th == null) {
                return;
            }
            Log.e("AuthSDK", czp.a(th));
        } catch (Throwable th2) {
            try {
                ExceptionProcessor.processException(th2);
            } catch (Throwable th3) {
                ExceptionProcessor.processException(th3);
            }
        }
    }

    public static void O000000o(boolean z) {
        try {
            O000000o = z;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public static boolean O000000o() {
        try {
            return O000000o;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    public static void O00000Oo(String str) {
        try {
            if (!O000000o) {
                return;
            }
            StringUtils.isEmpty(str);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public static void O00000Oo(boolean z) {
        try {
            O00000Oo = z;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public static boolean O00000Oo() {
        try {
            return O00000Oo;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    public static void O00000o(String str) {
        try {
            if (!O000000o) {
                return;
            }
            StringUtils.isEmpty(str);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public static void O00000o0(String str) {
        try {
            if (StringUtils.isEmpty(str)) {
                return;
            }
            Log.e("AuthSDK", str);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }
}
