package com.taobao.android.detail.wrapper.ultronengine.event;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import tb.emu;
import tb.ens;
import tb.fdo;
import tb.kge;

/* loaded from: classes5.dex */
public class k extends com.alibaba.android.ultron.event.q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "openPopLayer";

    static {
        kge.a(-441599763);
    }

    public k() {
        emu.a("com.taobao.android.detail.wrapper.ultronengine.event.OpenPoplayerUltronSubscriber");
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        com.taobao.android.detail.core.utils.i.c("OpenPoplayerUltronSubscriber", "onHandleEvent");
        new fdo((DetailCoreActivity) com.taobao.prefork.a.a(eVar.a())).a(new ens(c()));
    }
}
