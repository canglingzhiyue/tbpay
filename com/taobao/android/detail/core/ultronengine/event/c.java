package com.taobao.android.detail.core.ultronengine.event;

import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.event.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.basic.j;
import com.taobao.android.detail.core.utils.i;
import tb.efa;
import tb.emu;
import tb.fpz;
import tb.kge;

/* loaded from: classes4.dex */
public class c extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "openProductParams";

    static {
        kge.a(-1809026658);
    }

    public c() {
        emu.a("com.taobao.android.detail.core.ultronengine.event.OpenProductParamsUltronSubscriber");
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        i.c("OpenProductParamsSubscriber", "onHandleEvent");
        DetailCoreActivity detailCoreActivity = (DetailCoreActivity) fpz.c(eVar.a());
        if (detailCoreActivity == null || detailCoreActivity.C() == null) {
            return;
        }
        new efa(detailCoreActivity).a(new j(detailCoreActivity.C().f10055a, c()));
    }
}
