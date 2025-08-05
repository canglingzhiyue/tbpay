package com.taobao.android.detail.wrapper.ultronengine.event;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import tb.emu;
import tb.fct;
import tb.fdc;
import tb.kge;

/* loaded from: classes5.dex */
public class a extends com.alibaba.android.ultron.event.q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-867101015);
    }

    public a() {
        emu.a("com.taobao.android.detail.wrapper.ultronengine.event.AddCartClickedUltronSubscriber");
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        com.taobao.android.detail.core.utils.i.a("AddCartSubscriber", "onHandleEvent ultronEvent:" + eVar);
        new fdc((DetailCoreActivity) eVar.a()).a(new fct());
    }
}
