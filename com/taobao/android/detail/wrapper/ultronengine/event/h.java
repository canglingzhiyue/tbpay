package com.taobao.android.detail.wrapper.ultronengine.event;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import tb.emu;
import tb.eoa;
import tb.kge;

/* loaded from: classes5.dex */
public class h extends com.alibaba.android.ultron.event.q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "openDesc";

    static {
        kge.a(36587614);
    }

    public h() {
        emu.a("com.taobao.android.detail.wrapper.ultronengine.event.OpenDescUltronSubscriber");
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        com.taobao.android.detail.core.utils.i.c("OpenDescUltronSubscriber", "onHandleEvent");
        DetailCoreActivity detailCoreActivity = (DetailCoreActivity) com.taobao.prefork.a.a(eVar.a());
        if (detailCoreActivity == null) {
            return;
        }
        eoa eoaVar = null;
        Object a2 = a(1);
        if (a2 != null) {
            try {
                if (JSON.parseObject(JSON.toJSONString(a2)) != null) {
                    eoaVar = new eoa();
                }
            } catch (Throwable th) {
                com.taobao.android.detail.core.utils.i.a("OpenDescUltronSubscriber", "keyword", th);
            }
        }
        if (eoaVar == null) {
            eoaVar = new eoa(c());
        }
        new com.taobao.android.detail.wrapper.ext.event.subscriber.desc.a(detailCoreActivity).a(eoaVar);
    }
}
