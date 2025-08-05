package com.taobao.android.detail.wrapper.ultronengine.event;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import tb.emu;
import tb.fcp;
import tb.kge;

/* loaded from: classes5.dex */
public class m extends com.alibaba.android.ultron.event.q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "openRedPacket";

    static {
        kge.a(-1720635260);
    }

    public m() {
        emu.a("com.taobao.android.detail.wrapper.ultronengine.event.OpenRedPacketUltronSubscriber");
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        com.taobao.android.detail.core.utils.i.c("OpenRedPacketUltronSubscriber", "onHandleEvent");
        DetailCoreActivity detailCoreActivity = (DetailCoreActivity) com.taobao.prefork.a.a(eVar.a());
        if (detailCoreActivity == null) {
            return;
        }
        new com.taobao.android.detail.wrapper.ext.event.subscriber.basic.g(detailCoreActivity).a(new fcp(c(), detailCoreActivity.C().f10055a));
    }
}
