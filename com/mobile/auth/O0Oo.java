package com.mobile.auth;

import android.content.Context;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class O0Oo {
    private static volatile JSONObject O000000o;
    private static volatile long O00000Oo;

    public static synchronized JSONObject O000000o(Context context) {
        JSONObject jSONObject;
        synchronized (O0Oo.class) {
            try {
                if (System.currentTimeMillis() - O00000Oo > 1000 || O000000o == null) {
                    O000000o = O000o.O000000o(context).O00000Oo(context);
                    O00000Oo = System.currentTimeMillis();
                }
                jSONObject = O000000o;
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
        return jSONObject;
    }
}
