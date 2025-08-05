package com.alibaba.android.ultron.event;

import com.alibaba.android.ultron.vfw.commonpopupwindow.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import tb.bga;
import tb.kge;

/* loaded from: classes2.dex */
public class d extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1453741641);
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        try {
            com.alibaba.android.ultron.vfw.commonpopupwindow.a aVar = (com.alibaba.android.ultron.vfw.commonpopupwindow.a) eVar.h().f().get("CommonPopupWindow");
            aVar.a(new a.InterfaceC0097a() { // from class: com.alibaba.android.ultron.event.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.ultron.vfw.commonpopupwindow.a.InterfaceC0097a
                public void a(boolean z) {
                    JSONObject fields;
                    JSONObject jSONObject;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                    } else if (!z || (fields = d.this.b().getFields()) == null || (jSONObject = fields.getJSONObject("next")) == null) {
                    } else {
                        d.this.a(jSONObject.getJSONArray("complete"));
                    }
                }
            });
            aVar.a(true);
        } catch (Throwable th) {
            UnifyLog.d("CommonDismissPopSubscriber", th.toString());
            bga.a.a(this.f == null ? "Ultron" : this.f.h(), "CommonDismissPopSubscriber", th);
        }
    }
}
