package com.alibaba.android.icart.core.event;

import com.alibaba.android.icart.core.data.DataBizContext;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bbz;
import tb.bca;
import tb.bex;
import tb.bmz;
import tb.kge;

/* loaded from: classes2.dex */
public class m extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1539477237);
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        DataBizContext.CartGroupContext d = this.b.o().d();
        if (d == null) {
            return;
        }
        d.setIsExpanded(!d.getIsExpanded());
        d.setHandleExpanded(true);
        bbz bbzVar = this.f25791a;
        bex.a(bbzVar, "Page_ShoppingCart_SelectedItem_Expand", "isExpanded=" + d.getIsExpanded());
        this.f25791a.x().g();
    }
}
