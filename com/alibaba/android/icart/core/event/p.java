package com.alibaba.android.icart.core.event;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;
import tb.bca;
import tb.bei;
import tb.bmz;
import tb.kge;

/* loaded from: classes2.dex */
public class p extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-799362994);
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        List<IDMComponent> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        JSONObject c = c();
        if (c == null || c.isEmpty() || (a2 = bei.a(this.b, b())) == null) {
            return;
        }
        for (IDMComponent iDMComponent : a2) {
            JSONObject fields = iDMComponent.getFields();
            if (fields != null) {
                fields.put("componentKey", (Object) this.h.getKey());
                JSONObject jSONObject = this.h.getFields().getJSONObject("operate");
                if (jSONObject != null && jSONObject.size() > 0) {
                    fields.put("operate", (Object) jSONObject);
                }
            }
        }
        bmz a3 = this.f25791a.F().a();
        a3.c(bmzVar.f());
        a3.a("openPopupWindow");
        a3.a(this.d.e());
        a3.a(this.h);
        this.f25791a.F().a(a3);
    }
}
