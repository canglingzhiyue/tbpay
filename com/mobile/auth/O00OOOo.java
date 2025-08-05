package com.mobile.auth;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class O00OOOo extends O00Oo0 {
    private String O000000o;
    private String O00000Oo;
    private String O00000o;
    private String O00000o0;
    private String O00000oO;
    private String O00000oo;
    private String O0000O0o;

    @Override // com.mobile.auth.O00Oo0
    public String O000000o() {
        return this.O00000oo;
    }

    @Override // com.mobile.auth.O00Oo0
    public JSONObject O00000Oo() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", this.O000000o);
            jSONObject.put("apptype", this.O00000Oo);
            jSONObject.put("phone_ID", this.O00000o0);
            jSONObject.put("certflag", this.O00000o);
            jSONObject.put("sdkversion", this.O00000oO);
            jSONObject.put("appid", this.O00000oo);
            jSONObject.put("expandparams", "");
            jSONObject.put("sign", this.O0000O0o);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public void O00000Oo(String str) {
        this.O000000o = str;
    }

    public void O00000o(String str) {
        this.O00000o0 = str;
    }

    public void O00000o0(String str) {
        this.O00000Oo = str;
    }

    public void O00000oO(String str) {
        this.O00000o = str;
    }

    public void O00000oo(String str) {
        this.O00000oO = str;
    }

    public void O0000O0o(String str) {
        this.O00000oo = str;
    }

    public void O0000OOo(String str) {
        this.O0000O0o = str;
    }

    @Override // com.mobile.auth.O00Oo0
    protected String a_(String str) {
        return this.O000000o + this.O00000oO + this.O00000oo + "iYm0HAnkxQtpvN44";
    }
}
