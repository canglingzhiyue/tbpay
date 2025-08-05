package com.mobile.auth;

import android.util.Base64;
import com.taobao.accs.common.Constants;
import org.android.agoo.common.AgooConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class O00Oo00 extends O00Oo0 {
    private O00OO0O O000000o;
    private byte[] O00000Oo;
    private byte[] O00000o;
    private String O00000o0;
    private String O00000oO;
    private boolean O00000oo = false;

    @Override // com.mobile.auth.O00Oo0
    public String O000000o() {
        return this.O000000o.O000000o();
    }

    public void O000000o(O00OO0O o00oo0o) {
        this.O000000o = o00oo0o;
    }

    public void O000000o(boolean z) {
        this.O00000oo = z;
    }

    public void O000000o(byte[] bArr) {
        this.O00000Oo = bArr;
    }

    @Override // com.mobile.auth.O00Oo0
    public JSONObject O00000Oo() {
        JSONObject jSONObject = new JSONObject();
        if (this.O00000oo) {
            try {
                jSONObject.put(AgooConstants.MESSAGE_ENCRYPTED, this.O00000o0);
                jSONObject.put("encryptedIV", Base64.encodeToString(this.O00000o, 0));
                jSONObject.put(Constants.KEY_SEND_REQDATA, ooooooo.O000000o(this.O00000Oo, this.O000000o.toString(), this.O00000o));
                jSONObject.put("securityreinforce", this.O00000oO);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    public void O00000Oo(String str) {
        this.O00000oO = str;
    }

    public void O00000Oo(byte[] bArr) {
        this.O00000o = bArr;
    }

    public O00OO0O O00000o0() {
        return this.O000000o;
    }

    public void O00000o0(String str) {
        this.O00000o0 = str;
    }

    @Override // com.mobile.auth.O00Oo0
    protected String a_(String str) {
        return null;
    }
}
