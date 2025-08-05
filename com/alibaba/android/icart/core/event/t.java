package com.alibaba.android.icart.core.event;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import tb.bca;
import tb.bdx;
import tb.bei;
import tb.bmz;
import tb.jqf;
import tb.kge;

/* loaded from: classes2.dex */
public class t extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-499890109);
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        bdx.a(bmzVar);
        com.taobao.android.ultron.common.model.b b = b();
        if (this.h == null || b == null) {
            return;
        }
        boolean a2 = jqf.a(((com.taobao.android.ultron.datamodel.imp.b) this.g).z());
        JSONObject fields = this.h.getFields();
        boolean booleanValue = true ^ fields.getBooleanValue("isExpanded");
        fields.put("isExpanded", (Object) Boolean.valueOf(booleanValue));
        String string = b.getFields().getString("calculatePopGroupName");
        for (DMComponent dMComponent : ((com.taobao.android.ultron.datamodel.imp.b) this.f25791a.H()).u().values()) {
            if (a2) {
                if (TextUtils.equals(dMComponent.getFields().getString("calculatePopGroupName"), string)) {
                    if (booleanValue) {
                        bei.e(dMComponent);
                    } else {
                        bei.d(dMComponent);
                    }
                }
            } else if (TextUtils.equals(dMComponent.getFields().getString("calculatePopGroupName"), string)) {
                bei.f(dMComponent);
            }
        }
        this.f25791a.x().m();
    }
}
