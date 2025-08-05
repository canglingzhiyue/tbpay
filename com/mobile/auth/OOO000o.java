package com.mobile.auth;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import org.json.JSONObject;
import tb.dck;

/* loaded from: classes4.dex */
public final class OOO000o {
    public OO0OOOO O000000o = null;

    public final void O000000o(int i, int i2, String str, String str2, String str3) {
        try {
            OOO0o0.O00000o0("typeTokenUaid=".concat(String.valueOf(i)));
            try {
                if (this.O000000o == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("resultCode", i2);
                jSONObject.put("resultMsg", str);
                jSONObject.put("resultData", str2);
                jSONObject.put(dck.COL_SEQ, str3);
                this.O000000o.onResult(jSONObject.toString());
                this.O000000o = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }
}
