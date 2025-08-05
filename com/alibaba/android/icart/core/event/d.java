package com.alibaba.android.icart.core.event;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.weex.ui.view.gesture.WXGesture;
import java.util.List;
import tb.bca;
import tb.bei;
import tb.bmz;
import tb.kge;

/* loaded from: classes2.dex */
public class d extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-690411448);
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        List<IDMComponent> a2 = bei.a(this.b, b());
        if (a2 == null) {
            return;
        }
        for (IDMComponent iDMComponent : a2) {
            JSONObject fields = iDMComponent.getFields();
            if (fields == null) {
                fields = new JSONObject();
            }
            fields.put("componentKey", (Object) this.h.getKey());
            fields.put("cartId", (Object) bei.h(this.h));
            fields.put("from", (Object) "cart");
            fields.put("fromBundleId", (Object) bei.g(this.h));
            fields.put("to", (Object) "");
            fields.put("toBundleId", (Object) "");
            fields.put("type", (Object) (bei.p(this.h) ? WXGesture.MOVE : "add"));
        }
        bmz a3 = this.f25791a.F().a();
        a3.c(bmzVar.f());
        a3.a("openPopupWindow");
        a3.a(this.d.e());
        a3.a(this.h);
        this.f25791a.F().a(a3);
    }
}
