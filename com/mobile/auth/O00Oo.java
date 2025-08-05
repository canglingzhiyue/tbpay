package com.mobile.auth;

import android.os.SystemClock;
import com.cmic.sso.sdk.a;
import com.cmic.sso.sdk.b;
import com.mobile.auth.O00Oo00o;
import com.taobao.search.common.util.k;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class O00Oo {
    private static O00Oo O000000o;

    private O00Oo() {
    }

    public static O00Oo O000000o() {
        if (O000000o == null) {
            synchronized (O00Oo.class) {
                if (O000000o == null) {
                    O000000o = new O00Oo();
                }
            }
        }
        return O000000o;
    }

    private void O000000o(final O00OoOO0 o00OoOO0, final O00Ooo00 o00Ooo00, final a aVar) {
        O00O0o0 o00O0o0 = new O00O0o0();
        O00O0o00 o00O0o00 = new O00O0o00();
        O00O0OOo o00O0OOo = new O00O0OOo();
        o00O0o0.O000000o(o00O0o00);
        o00O0o00.O000000o(o00O0OOo);
        o00OoOO0.O000000o(SystemClock.elapsedRealtime());
        o00O0o0.O000000o(o00OoOO0, new O00o0() { // from class: com.mobile.auth.O00Oo.1
            private void O000000o() {
                if (!o00OoOO0.O000000o().contains("uniConfig")) {
                    O0OO0Oo.O00000o0(aVar, String.valueOf(SystemClock.elapsedRealtime() - o00OoOO0.O0000OOo()));
                }
            }

            @Override // com.mobile.auth.O00o0
            public void O000000o(O00o000 o00o000) {
                O000000o();
                O0OO0Oo.O00000Oo(aVar, String.valueOf(o00o000.O000000o()));
                o00Ooo00.O000000o(String.valueOf(o00o000.O000000o()), o00o000.O00000Oo(), O00O00o0.O000000o(String.valueOf(o00o000.O000000o()), o00o000.O00000Oo()));
            }

            @Override // com.mobile.auth.O00o0
            public void O000000o(O00o00 o00o00) {
                try {
                    O000000o();
                    JSONObject jSONObject = new JSONObject(o00o00.O00000o0());
                    String string = jSONObject.has("resultcode") ? jSONObject.getString("resultcode") : jSONObject.getString("resultCode");
                    O0OO0Oo.O00000Oo(aVar, string);
                    o00Ooo00.O000000o(string, jSONObject.optString("desc"), jSONObject);
                } catch (Exception e) {
                    e.printStackTrace();
                    O000000o(O00o000.O000000o(102223));
                }
            }
        }, aVar);
    }

    public void O000000o(a aVar, O00Ooo00 o00Ooo00) {
        String str;
        O00OoOO0 o00OoOO0;
        String O000000o2;
        int c = aVar.c("networktype");
        O00Oo0OO o00Oo0OO = new O00Oo0OO();
        o00Oo0OO.O00000Oo("1.0");
        o00Oo0OO.O00000o0(BuildConfig.CMCC_SDK_VERSION);
        o00Oo0OO.O00000o(aVar.b("appid"));
        o00Oo0OO.O00000oO(aVar.b("operatortype"));
        o00Oo0OO.O00000oo(c + "");
        o00Oo0OO.O0000O0o(O0OoOo.O000000o());
        o00Oo0OO.O0000OOo(O0OoOo.O00000Oo());
        o00Oo0OO.O0000Oo0(O0OoOo.O00000o0());
        o00Oo0OO.O0000Oo("0");
        o00Oo0OO.O0000OoO("3.0");
        o00Oo0OO.O0000Ooo(O0OO0Oo.O00000Oo());
        o00Oo0OO.O0000o00(O0OO0O.O000000o());
        o00Oo0OO.O0000o0O(aVar.b("apppackage"));
        o00Oo0OO.O0000o0o(aVar.b("appsign"));
        o00Oo0OO.O000000o(O0O0o00.O00000Oo("AID", ""));
        if (aVar.c("logintype") == 3 || aVar.b("isRisk", false)) {
            str = "pre";
        } else {
            o00Oo0OO.O0000ooO(aVar.b("userCapaid"));
            o00Oo0OO.O0000ooO(aVar.c("logintype") == 1 ? "200" : "50");
            str = "authz";
        }
        o00Oo0OO.O0000oO(str);
        O0OO0Oo.O000000o(aVar, "scripAndTokenForHttps");
        O00O0Oo b = aVar.b();
        if (aVar.b("isCacheScrip", false) || aVar.b("isGotScrip", false)) {
            o00Oo0OO.O0000oo(aVar.b("phonescrip"));
            o00Oo0OO.O0000o0(o00Oo0OO.O0000oo0(aVar.b("appkey")));
            o00OoOO0 = new O00OoOO0(k.HTTPS_PREFIX + b.O000000o() + "/unisdk/rs/scripAndTokenForHttps", o00Oo0OO, "POST", aVar.b("traceId"));
            o00OoOO0.O000000o("defendEOF", "0");
        } else {
            O00Oo00 o00Oo00 = new O00Oo00();
            o00Oo00.O000000o(aVar.a(b.a.f6472a));
            o00Oo00.O00000Oo(aVar.a(b.a.b));
            o00Oo00.O000000o(o00Oo0OO);
            o00Oo00.O000000o(false);
            aVar.a("isCloseIpv4", b.O0000OOo());
            aVar.a("isCloseIpv6", b.O0000Oo0());
            String str2 = k.HTTPS_PREFIX + b.O00000Oo() + "/unisdk/rs/scripAndTokenForHttps";
            if (aVar.b("use2048PublicKey", false)) {
                O0O000o.O000000o("BaseRequest", "使用2对应的编码");
                o00Oo00.O00000Oo("2");
                O000000o2 = O0O0OO.O000000o().O00000Oo(aVar.a(b.a.f6472a));
            } else {
                O000000o2 = O0O0OO.O000000o().O000000o(aVar.a(b.a.f6472a));
            }
            o00Oo00.O00000o0(O000000o2);
            o00OoOO0 = new O00OoO0o(str2, o00Oo00, "POST", aVar.b("traceId"));
            o00OoOO0.O000000o("defendEOF", "1");
            if (c == 3) {
                o00OoOO0.O000000o(true);
                aVar.a("doNetworkSwitch", true);
            } else {
                o00OoOO0.O000000o(false);
                aVar.a("doNetworkSwitch", false);
            }
        }
        o00OoOO0.O000000o("interfaceVersion", "3.0");
        O000000o(o00OoOO0, o00Ooo00, aVar);
    }

    public void O000000o(JSONObject jSONObject, a aVar, O00Ooo00 o00Ooo00) {
        O00Oo00o o00Oo00o = new O00Oo00o();
        O00Oo00o.O000000o o000000o = new O00Oo00o.O000000o();
        O00Oo00o.O00000Oo o00000Oo = new O00Oo00o.O00000Oo();
        o00000Oo.O00000oO(O0OO0Oo.O00000Oo());
        o00000Oo.O00000oo(O0OO0O.O000000o());
        o00000Oo.O00000Oo("2.0");
        o00000Oo.O00000o0(aVar.b("appid", ""));
        o00000Oo.O00000o(o00000Oo.O0000oo0(""));
        o000000o.O000000o(jSONObject);
        o00Oo00o.O000000o(o000000o);
        o00Oo00o.O000000o(o00000Oo);
        O00O0Oo b = aVar.b();
        O000000o(new O00OoOO0(k.HTTPS_PREFIX + b.O00000o() + "/log/logReport", o00Oo00o, "POST", aVar.b("traceId")), o00Ooo00, aVar);
    }

    public void O000000o(boolean z, a aVar, O00Ooo00 o00Ooo00) {
        O00OOOo o00OOOo = new O00OOOo();
        o00OOOo.O00000Oo("1.0");
        o00OOOo.O00000o0("Android");
        o00OOOo.O00000o(O0O0o00.O00000Oo("AID", ""));
        o00OOOo.O00000oO(z ? "1" : "0");
        o00OOOo.O00000oo(BuildConfig.CMCC_SDK_VERSION);
        o00OOOo.O0000O0o(aVar.b("appid"));
        o00OOOo.O0000OOo(o00OOOo.O0000oo0("iYm0HAnkxQtpvN44"));
        O00O0Oo b = aVar.b();
        O000000o(new O00OoOO0(k.HTTPS_PREFIX + b.O00000o0() + "/client/uniConfig", o00OOOo, "POST", aVar.b("traceId")), o00Ooo00, aVar);
    }
}
