package com.taobao.android.detail.wrapper.ultronengine.event;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import tb.emu;
import tb.fcu;
import tb.fdd;
import tb.kge;

/* loaded from: classes5.dex */
public class b extends com.alibaba.android.ultron.event.q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1516446004);
    }

    public b() {
        emu.a("com.taobao.android.detail.wrapper.ultronengine.event.BuyNowClickedUltronSubscriber");
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        fcu fcuVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        com.taobao.android.detail.core.utils.i.a("BuyNowClickedSubscriber", "onHandleEvent ultronEvent:" + eVar);
        fdd fddVar = new fdd((DetailCoreActivity) eVar.a());
        JSONObject c = c();
        if (c == null) {
            fcuVar = new fcu();
        } else {
            fcuVar = new fcu(c);
        }
        fddVar.a(fcuVar);
    }
}
