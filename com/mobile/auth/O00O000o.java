package com.mobile.auth;

import android.content.Context;
import android.text.TextUtils;
import com.cmic.sso.sdk.a;
import com.cmic.sso.sdk.b;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class O00O000o {
    private static O00O000o O00000o0;
    private final Context O00000Oo;
    private final Object O00000o = new Object();
    private final O00Oo O000000o = O00Oo.O000000o();

    private O00O000o(Context context) {
        this.O00000Oo = context.getApplicationContext();
    }

    public static O00O000o O000000o(Context context) {
        if (O00000o0 == null) {
            synchronized (O00O000o.class) {
                if (O00000o0 == null) {
                    O00000o0 = new O00O000o(context);
                }
            }
        }
        return O00000o0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void O000000o(com.cmic.sso.sdk.a r22, com.mobile.auth.O00O00Oo r23, java.lang.String r24, java.lang.String r25, org.json.JSONObject r26) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.O00O000o.O000000o(com.cmic.sso.sdk.a, com.mobile.auth.O00O00Oo, java.lang.String, java.lang.String, org.json.JSONObject):void");
    }

    private boolean O000000o(a aVar) {
        boolean O000000o;
        synchronized (this.O00000o) {
            O000000o = O0O0OO0.O000000o(aVar);
            if (O000000o) {
                aVar.a("securityphone", O0O0o00.O00000Oo("securityphone", ""));
                if (3 != aVar.c("logintype")) {
                    String O000000o2 = O0O0OO0.O000000o(this.O00000Oo);
                    StringBuilder sb = new StringBuilder();
                    sb.append("解密phoneScript ");
                    sb.append(!TextUtils.isEmpty(O000000o2));
                    O0O000o.O00000Oo("AuthnBusiness", sb.toString());
                    if (!TextUtils.isEmpty(O000000o2)) {
                        aVar.a("phonescrip", O000000o2);
                    } else {
                        O000000o = false;
                    }
                    O0O0OO0.O000000o(true, false);
                }
            }
            aVar.a("isCacheScrip", O000000o);
            O0O000o.O00000Oo("AuthnBusiness", "isCachePhoneScrip = " + O000000o);
        }
        if (aVar.c("networktype") == 2) {
            return O000000o;
        }
        return true;
    }

    private void O00000Oo(a aVar) {
        String packageName = this.O00000Oo.getPackageName();
        String O000000o = O0O00o0.O000000o(O0O0o0.O000000o(this.O00000Oo, packageName));
        aVar.a("apppackage", packageName);
        aVar.a("appsign", O000000o);
    }

    private void O00000Oo(final a aVar, final O00O00Oo o00O00Oo) {
        String str;
        O0O000o.O00000Oo("AuthnBusiness", "getScripAndToken start");
        boolean b = aVar.b("isGotScrip", false);
        O0O000o.O00000Oo("AuthnBusiness", "isGotScrip = " + b);
        if (!b) {
            O00000Oo(aVar);
            if (!aVar.b("isCacheScrip", false)) {
                O00000o0(aVar);
                if (aVar.c("networktype") == 3 && aVar.c("logintype") != 3) {
                    aVar.a("isRisk", true);
                }
            }
            if (aVar.c("logintype") == 1) {
                str = "200";
            } else if (aVar.c("logintype") == 0) {
                str = "50";
            }
            aVar.a("userCapaid", str);
        }
        this.O000000o.O000000o(aVar, new O00Ooo00() { // from class: com.mobile.auth.O00O000o.1
            @Override // com.mobile.auth.O00Ooo00
            public void O000000o(String str2, String str3, JSONObject jSONObject) {
                O00O000o.this.O000000o(aVar, o00O00Oo, str2, str3, jSONObject);
            }
        });
    }

    private void O00000o0(a aVar) {
        byte[] bArr = new byte[0];
        if (aVar.b("use2048PublicKey", false)) {
            O0O000o.O000000o("AuthnBusiness", "使用2048公钥对应的对称秘钥生成方式");
            bArr = ooooooo.O000000o();
        } else {
            O0O000o.O000000o("AuthnBusiness", "使用1024公钥对应的对称秘钥生成方式");
            try {
                bArr = UUID.randomUUID().toString().substring(0, 16).getBytes("utf-8");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        byte[] O000000o = ooooooo.O000000o();
        aVar.a(b.a.f6472a, bArr);
        aVar.a(b.a.b, O000000o);
        aVar.a("authType", "3");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O000000o(a aVar, O00O00Oo o00O00Oo) {
        JSONObject jSONObject;
        String str;
        String str2;
        if (O0O00o.O000000o(aVar.b("traceId"))) {
            return;
        }
        O0O000o.O00000Oo("AuthnBusiness", "LoginCheck method start");
        if (O000000o(aVar)) {
            O0O000o.O00000Oo("AuthnBusiness", "LoginCheck method start");
            int c = aVar.c("logintype");
            if (!aVar.b("isCacheScrip", false)) {
                O00000Oo(aVar, o00O00Oo);
                return;
            }
            String b = aVar.b("securityphone", "");
            if (c != 3) {
                O00000Oo(aVar, o00O00Oo);
                return;
            }
            jSONObject = O00O00o0.O000000o(b);
            str = "103000";
            str2 = "true";
        } else {
            jSONObject = null;
            str = "102103";
            str2 = "无数据网络";
        }
        o00O00Oo.O000000o(str, str2, aVar, jSONObject);
    }
}
