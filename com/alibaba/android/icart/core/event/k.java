package com.alibaba.android.icart.core.event;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.ArrayList;
import tb.bca;
import tb.bmz;
import tb.kge;

/* loaded from: classes2.dex */
public class k extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(237647197);
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        JSONArray jSONArray = c().getJSONArray("events");
        if (jSONArray == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                arrayList.add(new DMEvent(jSONObject.getString("type"), jSONObject.getJSONObject("fields"), null, jSONObject.getIntValue("option")));
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            com.taobao.android.ultron.common.model.b bVar = (com.taobao.android.ultron.common.model.b) arrayList.get(i2);
            bmz a2 = this.f25791a.F().a();
            a2.c(bmzVar.f());
            a2.a(bVar.getType());
            a2.a(bVar);
            a2.a("events", arrayList);
            a2.a(this.h);
            this.f25791a.F().a(a2);
        }
    }
}
