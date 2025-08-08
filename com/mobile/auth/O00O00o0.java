package com.mobile.auth;

import mtopsdk.common.util.StringUtils;
import com.cmic.sso.sdk.a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class O00O00o0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject O000000o(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resultCode", "103000");
            jSONObject.put("desc", "true");
            jSONObject.put("securityphone", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject O000000o(String str, a aVar, JSONObject jSONObject) {
        String b;
        String str2;
        String[] strArr = {"未知", "移动", "联通", "电信"};
        try {
            b = aVar.b("operatortype", "0");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!"0".equals(b) && !StringUtils.isEmpty(b)) {
            str2 = strArr[Integer.parseInt(b)];
            jSONObject.put("operatorType", str2);
            return jSONObject;
        }
        str2 = "103000".equals(str) ? strArr[1] : strArr[0];
        jSONObject.put("operatorType", str2);
        return jSONObject;
    }

    public static JSONObject O000000o(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resultCode", str);
            jSONObject.put("desc", str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject O000000o(String str, String str2, a aVar, JSONObject jSONObject) {
        String str3;
        String str4;
        JSONObject jSONObject2 = new JSONObject();
        try {
            int parseInt = Integer.parseInt(aVar.b("authType", "0"));
            int c = aVar.c("networktype");
            if (parseInt != 3) {
                str3 = "0";
                str4 = "其他";
            } else if (c == 3) {
                str4 = "WIFI下网关鉴权";
                str3 = "1";
            } else {
                str4 = "网关鉴权";
                str3 = "2";
            }
            jSONObject2.put("resultCode", str);
            jSONObject2.put("authType", str3);
            jSONObject2.put("authTypeDes", str4);
            if ("103000".equals(str)) {
                if (1 == aVar.c("logintype")) {
                    jSONObject2.put("openId", aVar.b("openId"));
                    jSONObject2.put("securityphone", aVar.b("securityphone"));
                }
                jSONObject2.put("token", jSONObject.optString("token"));
                jSONObject2.put("tokenExpiresIn", jSONObject.optString("tokenExpiresIn"));
            } else {
                jSONObject2.put("desc", str2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        O0O000o.O00000Oo("AuthnResult", "返回参数:" + jSONObject2.toString());
        return jSONObject2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject O00000Oo(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resultCode", str);
            jSONObject.put("desc", str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
