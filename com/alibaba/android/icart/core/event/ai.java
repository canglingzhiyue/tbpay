package com.alibaba.android.icart.core.event;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;
import tb.bca;
import tb.bei;
import tb.bmz;
import tb.kge;

/* loaded from: classes2.dex */
public class ai extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(523725340);
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        JSONObject jSONObject = this.h.getFields().getJSONObject("coupon");
        for (com.taobao.android.ultron.common.model.b bVar : (List) bmzVar.b("events")) {
            if (TextUtils.equals(bVar.getType(), "openPopupWindow")) {
                for (IDMComponent iDMComponent : bei.a(this.b, bVar)) {
                    if (TextUtils.equals("cartShopCouponPopWindow", iDMComponent.getTag())) {
                        JSONObject fields = iDMComponent.getFields();
                        if (jSONObject != null) {
                            fields.putAll(jSONObject.getInnerMap());
                        }
                    }
                }
            }
        }
    }
}
