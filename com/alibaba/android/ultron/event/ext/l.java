package com.alibaba.android.ultron.event.ext;

import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import tb.kge;

/* loaded from: classes2.dex */
public class l extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(598327648);
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "-2945329375793642908";
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public void d(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
        } else if (!(eVar.h() instanceof com.alibaba.android.ultron.vfw.instance.d)) {
        } else {
            eVar.h();
            IDMComponent d = eVar.d();
            if (e(eVar) != null && e(eVar).getString("componentKey") != null) {
                d = eVar.h().b().b(e(eVar).getString("componentKey"));
            }
            if (d == null) {
                return;
            }
            if (e(eVar) != null && "true".equals(e(eVar).getString("noNeedReload"))) {
                return;
            }
            try {
                JSONObject parseObject = JSON.parseObject("{\n    \"container\": {\n        \"data\": []\n    },\n    \"endpoint\": {},\n    \"reload\": \"true\",\n    \"data\": {},\n    \"hierarchy\": {\n        \"structure\": {},\n        \"delta\": [\n        ]\n    },\n    \"global\": {},\n    \"linkage\": {}\n}");
                a(parseObject.getJSONObject("hierarchy").getJSONArray("delta"), d.getKey());
                ((com.alibaba.android.ultron.vfw.instance.d) eVar.h()).a(parseObject, (d.c) null);
            } catch (Exception unused) {
            }
        }
    }

    public static void a(JSONArray jSONArray, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5bb8b5a", new Object[]{jSONArray, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("opType", (Object) "delete");
        jSONObject.put("target", (Object) str);
        jSONArray.add(jSONObject);
    }
}
