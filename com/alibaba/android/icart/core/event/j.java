package com.alibaba.android.icart.core.event;

import com.alibaba.android.icart.core.data.DataBizContext;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.bca;
import tb.bed;
import tb.bei;
import tb.bmz;
import tb.kge;

/* loaded from: classes2.dex */
public class j extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2012094029);
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IDMComponent b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        DataBizContext.CartGroupContext d = this.b.o().d();
        if (d == null) {
            return;
        }
        this.f25791a.x().a(false);
        List<String> items = d.getItems();
        if (items == null) {
            items = new ArrayList<>();
        }
        int type = d.getType();
        if (items.isEmpty() && type == 2) {
            String a2 = com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21661);
            com.alibaba.android.icart.core.widget.d.a(this.e, a2);
            bed.a(a2);
            return;
        }
        IDMComponent b2 = this.g.b(d.getTriggerComponentKey());
        String a3 = bei.a(bei.q(bei.k(b2)));
        StringBuilder sb = new StringBuilder();
        for (String str : items) {
            if (str != null && (b = this.g.b(str)) != null) {
                sb.append(b.getFields().getString("cartId"));
                sb.append(",");
            }
        }
        if (sb.toString().endsWith(",")) {
            sb.delete(sb.length() - 1, sb.length());
        }
        String sb2 = sb.toString();
        String g = bei.g(b2);
        for (com.taobao.android.ultron.common.model.b bVar : b2.getEventMap().get("confirmEditGroup")) {
            if ("reorderClick".equals(bVar.getType())) {
                JSONObject fields = bVar.getFields();
                fields.put("from", (Object) a3);
                fields.put("to", (Object) sb2);
                fields.put("toBundleId", (Object) g);
                fields.put("name", (Object) d.getName());
                bmz a4 = this.f25791a.F().a();
                a4.c("confirmEditGroup");
                a4.a(bVar.getType());
                a4.a(bVar);
                a4.a(b2);
                this.f25791a.F().a(a4);
            }
        }
    }
}
