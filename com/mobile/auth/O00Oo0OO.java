package com.mobile.auth;

import com.ali.user.open.ucc.util.UccConstants;
import com.alipay.android.msp.framework.db.MspDBHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class O00Oo0OO extends O00OO0O {
    protected String O0000ooo = "";
    protected String O00oOooO = "";

    @Override // com.mobile.auth.O00OO0O
    public void O000000o(String str) {
        this.O0000oo0 = O0000oOO(str);
    }

    @Override // com.mobile.auth.O00Oo0
    public JSONObject O00000Oo() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, this.O000000o);
            jSONObject.put("sdkver", this.O00000Oo);
            jSONObject.put("appid", this.O00000o0);
            jSONObject.put("imsi", this.O00000o);
            jSONObject.put("operatortype", this.O00000oO);
            jSONObject.put("networktype", this.O00000oo);
            jSONObject.put("mobilebrand", this.O0000O0o);
            jSONObject.put("mobilemodel", this.O0000OOo);
            jSONObject.put("mobilesystem", this.O0000Oo0);
            jSONObject.put("clienttype", this.O0000Oo);
            jSONObject.put("interfacever", this.O0000OoO);
            jSONObject.put("expandparams", this.O0000Ooo);
            jSONObject.put("msgid", this.O0000o00);
            jSONObject.put("timestamp", this.O0000o0);
            jSONObject.put("subimsi", this.O0000o0O);
            jSONObject.put("sign", this.O0000o0o);
            jSONObject.put("apppackage", this.O0000o);
            jSONObject.put("appsign", this.O0000oO0);
            jSONObject.put("ipv4_list", this.O0000oO);
            jSONObject.put("ipv6_list", this.O0000oOO);
            jSONObject.put("sdkType", this.O0000oOo);
            jSONObject.put("tempPDR", this.O0000oo0);
            jSONObject.put("scrip", this.O0000ooo);
            jSONObject.put("userCapaid", this.O00oOooO);
            jSONObject.put(UccConstants.PARAM_FUNC_TYPE, this.O0000oo);
            jSONObject.put("socketip", this.O0000ooO);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public void O0000oo(String str) {
        this.O0000ooo = O0000oOO(str);
    }

    public void O0000ooO(String str) {
        this.O00oOooO = O0000oOO(str);
    }

    @Override // com.mobile.auth.O00Oo0
    protected String a_(String str) {
        return this.O00000Oo + this.O00000o0 + this.O00000o + this.O00000oO + this.O00000oo + this.O0000O0o + this.O0000OOo + this.O0000Oo0 + this.O0000Oo + this.O0000o00 + this.O0000o0 + str + this.O0000o0O + this.O0000o + this.O0000oO0 + this.O0000oO + this.O0000oOO + this.O0000oOo + this.O0000oo0 + this.O0000ooo + this.O00oOooO + this.O0000oo + this.O0000ooO;
    }

    public String toString() {
        return this.O000000o + "&" + this.O00000Oo + "&" + this.O00000o0 + "&" + this.O00000o + "&" + this.O00000oO + "&" + this.O00000oo + "&" + this.O0000O0o + "&" + this.O0000OOo + "&" + this.O0000Oo0 + "&" + this.O0000Oo + "&" + this.O0000OoO + "&" + this.O0000Ooo + "&" + this.O0000o00 + "&" + this.O0000o0 + "&" + this.O0000o0O + "&" + this.O0000o0o + "&" + this.O0000o + "&" + this.O0000oO0 + "&&" + this.O0000oO + "&" + this.O0000oOO + "&" + this.O0000oOo + "&" + this.O0000oo0 + "&" + this.O0000ooo + "&" + this.O00oOooO + "&" + this.O0000oo + "&" + this.O0000ooO;
    }
}
