package com.huawei.hms.hatool;

import mtopsdk.common.util.StringUtils;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import tb.cyf;

/* loaded from: classes4.dex */
public class w0 {
    public static void a(String str, String str2) {
        n0 n0Var;
        String replace = "{url}/getPublicKey?keytype=2".replace("{url}", a1.f(str, str2));
        String f = q0.f();
        HashMap hashMap = new HashMap();
        hashMap.put("App-Id", f);
        try {
            n0Var = w.a(replace, new byte[0], hashMap);
        } catch (Exception e) {
            v.e("GetPublicKey", "get pubKey response Exception :" + e.getMessage());
            n0Var = null;
        }
        if (n0Var == null) {
            v.e("GetPublicKey", "get pubKey response is null");
        } else if (n0Var.b() == 200) {
            if (StringUtils.isEmpty(n0Var.a())) {
                return;
            }
            c(n0Var.a(), str2);
        } else {
            v.e("GetPublicKey", "get pubKey fail HttpCode :" + n0Var.b());
        }
    }

    public static boolean a() {
        String a2 = q0.a();
        if (StringUtils.isEmpty(a2)) {
            a2 = d.a(q0.i(), "Privacy_MY", "public_key_time_interval", "");
            q0.f(a2);
        }
        String m = q0.m();
        if (StringUtils.isEmpty(m)) {
            m = d.a(q0.i(), "Privacy_MY", "public_key_time_last", "");
            q0.c(m);
        }
        if (StringUtils.isEmpty(a2) || StringUtils.isEmpty(m)) {
            return true;
        }
        try {
            return System.currentTimeMillis() - Long.parseLong(m) > ((long) Integer.parseInt(a2));
        } catch (NumberFormatException e) {
            v.e("GetPublicKey", "checkCachePubKey NumberFormatException :" + e.getMessage());
            return true;
        }
    }

    public static String b(String str, String str2) {
        String o;
        String c = q0.c();
        if (StringUtils.isEmpty(c)) {
            c = d.a(q0.i(), "Privacy_MY", "public_key_version", "");
            q0.g(c);
        }
        if ("maint".equals(str2)) {
            o = q0.n();
            if (StringUtils.isEmpty(o)) {
                o = cyf.b("HiAnalytics_Sdk_Public_Sp_Key", d.a(q0.i(), "Privacy_MY", "public_key_maint", ""));
                q0.d(o);
            }
        } else {
            o = q0.o();
            if (StringUtils.isEmpty(o)) {
                o = cyf.b("HiAnalytics_Sdk_Public_Sp_Key", d.a(q0.i(), "Privacy_MY", "public_key_oper", ""));
                q0.e(o);
            }
        }
        if (StringUtils.isEmpty(o) || StringUtils.isEmpty(c) || a()) {
            b0.a().a(new j1(str, str2));
            return null;
        }
        return o;
    }

    private static void c(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("publicKey");
            String optString2 = jSONObject.optString("publicKeyOM");
            String optString3 = jSONObject.optString("pubkey_version");
            String str3 = System.currentTimeMillis() + "";
            String optString4 = jSONObject.optString("timeInterval");
            d.b(q0.i(), "Privacy_MY", "public_key_oper", cyf.a("HiAnalytics_Sdk_Public_Sp_Key", optString));
            d.b(q0.i(), "Privacy_MY", "public_key_maint", cyf.a("HiAnalytics_Sdk_Public_Sp_Key", optString2));
            d.b(q0.i(), "Privacy_MY", "public_key_time_interval", optString4);
            d.b(q0.i(), "Privacy_MY", "public_key_version", optString3);
            d.b(q0.i(), "Privacy_MY", "public_key_time_last", str3);
            q0.e(optString);
            q0.d(optString2);
            q0.g(optString3);
            q0.c(str3);
            q0.f(optString4);
        } catch (JSONException e) {
            v.e("GetPublicKey", "get pubKey parse json JSONException :" + e.getMessage());
        }
    }
}
