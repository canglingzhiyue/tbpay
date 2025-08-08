package com.alibaba.android.icart.core.event;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.taobao.R;
import java.util.List;
import tb.bca;
import tb.bei;
import tb.bmz;
import tb.kge;

/* loaded from: classes2.dex */
public class e extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(581823058);
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        IDMComponent b = bei.b(this.g, c().getString("bundleId"));
        if (b == null) {
            UnifyLog.d("CartAddItemConfirmSubscriber", "bundleHeader component is null");
            return;
        }
        List<IDMComponent> f = this.f25791a.x().e().f();
        if (f == null || f.isEmpty()) {
            return;
        }
        String a2 = bei.a(f, new bei.a() { // from class: com.alibaba.android.icart.core.event.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bei.a
            public boolean a(IDMComponent iDMComponent) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("e66567f0", new Object[]{this, iDMComponent})).booleanValue() : iDMComponent.getFields().getBooleanValue("_addItemIsChecked");
            }
        });
        if (StringUtils.isEmpty(a2)) {
            com.alibaba.android.icart.core.widget.d.a(this.e, com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21678));
            return;
        }
        String g = bei.g(b);
        for (com.taobao.android.ultron.common.model.b bVar : b.getEventMap().get("confirmAddItemToGroup")) {
            if ("reorderClick".equals(bVar.getType())) {
                JSONObject fields = bVar.getFields();
                fields.clear();
                fields.put("from", (Object) a2);
                fields.put("toBundleId", (Object) g);
                fields.put("type", (Object) "addItemToGroup");
                bmz a3 = this.f25791a.F().a();
                a3.c("confirmAddItemToGroup");
                a3.a(bVar.getType());
                a3.a(bVar);
                a3.a(b);
                this.f25791a.F().a(a3);
            }
        }
        this.f25791a.x().a(false);
    }
}
