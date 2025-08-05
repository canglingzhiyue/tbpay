package com.taobao.android.detail.wrapper.ultronengine.event;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.wrapper.ext.event.subscriber.basic.WangxinChatSubscriber;
import tb.emu;
import tb.env;
import tb.kge;

/* loaded from: classes5.dex */
public class q extends com.alibaba.android.ultron.event.q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "openWW";

    static {
        kge.a(1160475341);
    }

    public q() {
        emu.a("com.taobao.android.detail.wrapper.ultronengine.event.OpenWWUltronSubscriber");
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        com.taobao.android.detail.core.utils.i.c("OpenWWUltronSubscriber", "onHandleEvent");
        new WangxinChatSubscriber((DetailCoreActivity) com.taobao.prefork.a.a(eVar.a())).handleEvent(new env(c()));
    }
}
