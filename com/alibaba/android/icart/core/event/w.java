package com.alibaba.android.icart.core.event;

import com.alibaba.android.icart.core.data.DataBizContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;
import tb.bca;
import tb.bei;
import tb.bex;
import tb.bmz;
import tb.kge;

/* loaded from: classes2.dex */
public class w extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(567023391);
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        Object obj;
        List<String> items;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        Object[] objArr = (Object[]) bmzVar.b("extraParams");
        if (objArr == null || objArr.length < 2 || (obj = objArr[1]) == null) {
            return;
        }
        String obj2 = obj.toString();
        ArrayList arrayList = new ArrayList();
        IDMComponent b = this.g.b(obj2);
        if (b != null) {
            List<IDMComponent> a2 = bei.a(b, this.f25791a);
            if (!a2.isEmpty()) {
                for (IDMComponent iDMComponent : a2) {
                    arrayList.add(iDMComponent.getKey());
                }
            }
        }
        DataBizContext.CartGroupContext d = this.b.o().d();
        if (d == null || (items = d.getItems()) == null) {
            return;
        }
        boolean z = !items.contains(obj2);
        if (z) {
            if (arrayList.isEmpty()) {
                items.add(0, obj2);
            } else {
                items.addAll(0, arrayList);
            }
        } else if (arrayList.isEmpty()) {
            items.remove(obj2);
        } else {
            items.removeAll(arrayList);
        }
        this.f25791a.x().g();
        boolean z2 = !"groupSelectedItems".equals(this.h.getTag());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < items.size(); i++) {
            IDMComponent b2 = this.b.w().b(items.get(i));
            if (b2 != null) {
                sb.append(b2.getFields().getString("itemId"));
                sb.append("#");
            }
        }
        if (sb.toString().endsWith("#")) {
            sb.delete(sb.length() - 1, sb.length());
        }
        String sb2 = sb.toString();
        bex.a(this.f25791a, "Page_ShoppingCart_RecommendItem_Click", "isChecked=" + z, "isItemClick=" + z2, "checkedItemIds=" + sb2);
    }
}
