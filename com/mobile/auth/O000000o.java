package com.mobile.auth;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class O000000o {
    public static O00000o0 O000000o = null;
    public static int O00000Oo = 0;
    public static int O00000o = 0;
    public static int O00000o0 = 0;
    private static final String O00000oO = "O000000o";

    public static void O000000o(int i, int i2, int i3, O00000o0 o00000o0) {
        try {
            O00000o0 = i;
            O00000o = i2;
            O00000Oo = i3;
            O000000o = o00000o0;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public static void O000000o(Context context, String str, String str2, O00000Oo o00000Oo) {
        try {
            String str3 = O00000oO;
            O000000o(str3, "called requestPreAuthCode()   appId：" + str + ",appSecret:" + str2);
            O000000o(context, str, str2, "qhx", o00000Oo);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private static void O000000o(Context context, String str, String str2, String str3, O00000Oo o00000Oo) {
        try {
            if (o00000Oo == null) {
                O000000o = null;
                return;
            }
            if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
                if (!O000OOOo.O00000Oo(context)) {
                    o00000Oo.O000000o("{\"result\":80003,\"msg\":\"网络无连接\"}");
                    O000000o = null;
                    return;
                } else if (O000OOOo.O00000o0(context)) {
                    new O000O0o0().O000000o(context, str, str2, str3, o00000Oo);
                    return;
                } else if (O000OOOo.O00000o(context)) {
                    new O000O0o0().O00000Oo(context, str, str2, str3, o00000Oo);
                    return;
                } else {
                    o00000Oo.O000000o("{\"result\":80004,\"msg\":\"移动网络未开启\"}");
                    O000000o = null;
                    return;
                }
            }
            o00000Oo.O000000o("{\"result\":80106,\"msg\":\"请求参数异常\"}");
            O000000o = null;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public static void O000000o(String str, String str2) {
        try {
            if (O000000o == null) {
                return;
            }
            try {
                O000000o.O000000o("CT_" + str, str2);
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public static void O000000o(String str, String str2, Throwable th) {
        try {
            if (O000000o == null) {
                return;
            }
            try {
                O000000o.O000000o("CT_" + str, str2, th);
            } catch (Throwable unused) {
            }
        } catch (Throwable th2) {
            try {
                ExceptionProcessor.processException(th2);
            } catch (Throwable th3) {
                ExceptionProcessor.processException(th3);
            }
        }
    }

    public static void O00000Oo(Context context, String str, String str2, O00000Oo o00000Oo) {
        if (o00000Oo != null) {
            try {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    jSONObject.put("reqId", str2);
                    o00000Oo.O000000o(jSONObject.toString());
                    String str3 = O00000oO;
                    O000000o(str3, "callback result : " + jSONObject.toString());
                } catch (Exception unused) {
                    o00000Oo.O000000o(str);
                    String str4 = O00000oO;
                    O000000o(str4, "Exception callback result : " + str);
                }
                O000000o = null;
                O000O0OO.O000000o(context, str2);
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
    }
}
