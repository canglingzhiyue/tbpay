package com.taobao.android.sku.bizevent;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.o;
import java.util.HashMap;
import java.util.Map;
import tb.bpp;
import tb.iyb;
import tb.iyd;
import tb.iye;
import tb.kge;

/* loaded from: classes6.dex */
public class f implements iyd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "umbrellaAlarm";

    static {
        kge.a(796002604);
        kge.a(-1413102650);
    }

    @Override // tb.iyd
    public void a(iye iyeVar, iyb iybVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec0c8681", new Object[]{this, iyeVar, iybVar});
            return;
        }
        JSONObject b = iyeVar.b();
        if (b == null || b.isEmpty() || (jSONObject = b.getJSONObject("fields")) == null || jSONObject.isEmpty()) {
            return;
        }
        String string = jSONObject.getString("feature");
        String string2 = jSONObject.getString("mainBiz");
        String string3 = jSONObject.getString("childBiz");
        String string4 = jSONObject.getString("errorCode");
        String string5 = jSONObject.getString("errorMsg");
        JSONObject jSONObject2 = jSONObject.getJSONObject("args");
        UMLinkLogInterface a2 = bpp.a();
        if (a2 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorMsg", string5);
        if (jSONObject2 != null && !jSONObject2.isEmpty()) {
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!StringUtils.isEmpty(key)) {
                    hashMap.put(key, value == null ? "null" : String.valueOf(value));
                }
            }
        }
        try {
            a2.commitFailure(string, "", "", string2, string3, hashMap, string4, string5);
        } catch (Throwable th) {
            o.b(th.toString());
        }
    }
}
