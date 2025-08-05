package com.mobile.auth;

import android.content.Context;
import android.text.TextUtils;
import com.cmic.sso.sdk.a;
import com.taobao.android.change.app.icon.core.Constrant;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class O00o {
    private a O000000o;

    private static void O000000o(O00oo000 o00oo000, a aVar) {
        if (o00oo000 == null || aVar == null) {
            return;
        }
        o00oo000.O00000Oo(aVar.b("appid", ""));
        o00oo000.O00000oO(O0OoOo.O000000o());
        o00oo000.O0000OOo(aVar.b("interfaceType", ""));
        o00oo000.O0000O0o(aVar.b("interfaceCode", ""));
        o00oo000.O00000oo(aVar.b("interfaceElasped", ""));
        o00oo000.O0000OoO(aVar.b(Constrant.KEY_TIME_OUT));
        o00oo000.O0000oO(aVar.b("traceId"));
        o00oo000.O0000o00(aVar.b("simCardNum"));
        o00oo000.O0000o0(aVar.b("operatortype"));
        o00oo000.O0000o0O(aVar.b("networkOperator"));
        o00oo000.O0000o0o(O0OoOo.O00000Oo());
        o00oo000.O0000o(O0OoOo.O00000o0());
        o00oo000.O0000ooO(String.valueOf(aVar.b("networktype", 0)));
        o00oo000.O0000oOO(aVar.b("starttime"));
        o00oo000.O0000oOo(aVar.b("endtime"));
        o00oo000.O0000Ooo(String.valueOf(aVar.b("systemEndTime", 0L) - aVar.b("systemStartTime", 0L)));
        o00oo000.O00000o0(aVar.b("imsiState"));
        o00oo000.O0000ooo(O0O0o00.O00000Oo("AID", ""));
        o00oo000.O00oOooO(aVar.b("operatortype"));
        o00oo000.O00oOooo(aVar.b("scripType"));
        o00oo000.O000O00o(aVar.b("networkTypeByAPI"));
        O0O000o.O000000o("SendLog", "traceId" + aVar.b("traceId"));
    }

    private void O000000o(JSONObject jSONObject) {
        O00Oo.O000000o().O000000o(jSONObject, this.O000000o, new O00Ooo00() { // from class: com.mobile.auth.O00o.1
            @Override // com.mobile.auth.O00Ooo00
            public void O000000o(String str, String str2, JSONObject jSONObject2) {
                long j;
                O00O0Oo b = O00o.this.O000000o.b();
                HashMap hashMap = new HashMap();
                if (!str.equals("103000")) {
                    if (b.O0000Ooo() != 0 && b.O0000OoO() != 0) {
                        int O000000o = O0O0o00.O000000o("logFailTimes", 0) + 1;
                        if (O000000o >= b.O0000OoO()) {
                            hashMap.put("logFailTimes", 0);
                            j = System.currentTimeMillis();
                        } else {
                            hashMap.put("logFailTimes", Integer.valueOf(O000000o));
                        }
                    }
                    O0O0o00.O000000o(hashMap);
                }
                hashMap.put("logFailTimes", 0);
                j = 0;
                hashMap.put("logCloseTime", Long.valueOf(j));
                O0O0o00.O000000o(hashMap);
            }
        });
    }

    private void O000000o(JSONObject jSONObject, a aVar) {
        this.O000000o = aVar;
        O000000o(jSONObject);
    }

    public void O000000o(Context context, String str, a aVar) {
        StackTraceElement[] stackTrace;
        String str2 = "";
        try {
            O00oo000 a2 = aVar.a();
            String O00000Oo = O0O0O0o.O00000Oo(context);
            a2.O00000o(str);
            a2.O0000oo(aVar.b("loginMethod", str2));
            a2.O0000oO0(aVar.b("isCacheScrip", false) ? "scrip" : "pgw");
            a2.O0000Oo0(O0O0O0o.O000000o(context));
            if (!TextUtils.isEmpty(O00000Oo)) {
                str2 = O00000Oo;
            }
            a2.O0000Oo(str2);
            O000000o(a2, aVar);
            JSONArray jSONArray = null;
            if (a2.O000000o.size() > 0) {
                jSONArray = new JSONArray();
                Iterator<Throwable> it = a2.O000000o.iterator();
                while (it.hasNext()) {
                    Throwable next = it.next();
                    StringBuffer stringBuffer = new StringBuffer();
                    JSONObject jSONObject = new JSONObject();
                    for (StackTraceElement stackTraceElement : next.getStackTrace()) {
                        stringBuffer.append("\n");
                        stringBuffer.append(stackTraceElement.toString());
                    }
                    jSONObject.put("message", next.toString());
                    jSONObject.put(com.taobao.android.weex_framework.util.a.ATOM_stack, stringBuffer.toString());
                    jSONArray.put(jSONObject);
                }
                a2.O000000o.clear();
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                a2.O000000o(jSONArray);
            }
            O0O000o.O000000o("SendLog", "登录日志");
            O000000o(a2.O00000Oo(), aVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
