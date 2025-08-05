package com.taobao.android.live.plugin.atype.flexalocal.good.ultron.events;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.fnk;
import tb.fpd;
import tb.kge;

/* loaded from: classes5.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-452179954);
    }

    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e6cf1164", new Object[]{jSONObject, jSONObject2, obj});
        }
        JSONObject jSONObject3 = new JSONObject();
        for (String str : jSONObject.keySet()) {
            String string = jSONObject.getString(str);
            String a2 = a(string, jSONObject2, obj);
            if ("null".equals(a2)) {
                jSONObject3.put(str, (Object) string);
            } else {
                jSONObject3.put(str, (Object) a2);
            }
        }
        return jSONObject3;
    }

    private static String a(String str, JSONObject jSONObject, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b9aea86", new Object[]{str, jSONObject, obj});
        }
        fpd.a a2 = new fpd.a().b(jSONObject).a(obj);
        if (obj instanceof DXRuntimeContext) {
            a2.c(((DXRuntimeContext) obj).f());
        }
        return String.valueOf(fnk.a(str, "", a2.a()));
    }
}
