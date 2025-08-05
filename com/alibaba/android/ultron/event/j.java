package com.alibaba.android.ultron.event;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;
import tb.jny;
import tb.kge;

/* loaded from: classes2.dex */
public class j extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2071327681);
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        jny b;
        IDMComponent b2;
        List<com.taobao.android.ultron.common.model.b> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        JSONObject fields = b().getFields();
        if (fields == null) {
            return;
        }
        String string = fields.getString("type");
        String string2 = fields.getString("target");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || (b = eVar.h().b()) == null || (b2 = b.b(string2)) == null || b2.getEventMap() == null || (list = b2.getEventMap().get(string)) == null) {
            return;
        }
        com.alibaba.android.ultron.event.base.f d = eVar.h().d();
        for (com.taobao.android.ultron.common.model.b bVar : list) {
            com.alibaba.android.ultron.event.base.e a2 = d.a();
            a2.a(bVar.getType());
            a2.a(b2);
            a2.a(bVar);
            a2.a("isFromRouterEvent", Boolean.TRUE);
            d.a(a2);
        }
    }
}
