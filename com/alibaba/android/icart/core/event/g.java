package com.alibaba.android.icart.core.event;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bca;
import tb.bmz;
import tb.kge;

/* loaded from: classes2.dex */
public class g extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1054038923);
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        Object[] objArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
        } else if (this.h == null || (objArr = (Object[]) bmzVar.b("extraParams")) == null || objArr.length < 2) {
        } else {
            JSONObject fields = this.h.getFields();
            boolean z = !Boolean.parseBoolean(String.valueOf(objArr[1]));
            fields.put("isHideAddress", (Object) Boolean.valueOf(z));
            this.b.o().D().setHideAddress(z);
            this.f25791a.x().b(1);
        }
    }
}
