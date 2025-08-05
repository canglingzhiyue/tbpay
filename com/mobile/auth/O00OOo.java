package com.mobile.auth;

import com.ali.user.open.ucc.util.UccConstants;
import com.alipay.android.msp.framework.db.MspDBHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class O00OOo extends O00Oo0 {
    private final String O000000o;
    private final String O00000Oo;
    private String O00000o = "authz";
    private final String O00000o0;
    private String O00000oO;

    public O00OOo(String str, String str2, String str3) {
        this.O000000o = str;
        this.O00000Oo = str2;
        this.O00000o0 = str3;
    }

    @Override // com.mobile.auth.O00Oo0
    public String O000000o() {
        return this.O000000o;
    }

    @Override // com.mobile.auth.O00Oo0
    public JSONObject O00000Oo() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, this.O00000Oo);
            jSONObject.put("data", this.O00000o0);
            jSONObject.put("userCapaid", this.O00000oO);
            jSONObject.put(UccConstants.PARAM_FUNC_TYPE, this.O00000o);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public void O00000Oo(String str) {
        this.O00000o = str;
    }

    public void O00000o0(String str) {
        this.O00000oO = str;
    }

    @Override // com.mobile.auth.O00Oo0
    protected String a_(String str) {
        return null;
    }
}
