package com.taobao.android.detail.wrapper.ultronengine.event;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.datasdk.model.datamodel.node.RateNode;
import tb.emu;
import tb.enz;
import tb.fdf;
import tb.kge;

/* loaded from: classes5.dex */
public class l extends com.alibaba.android.ultron.event.q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "openRate";

    static {
        kge.a(-599517011);
    }

    public l() {
        emu.a("com.taobao.android.detail.wrapper.ultronengine.event.OpenRateUltronSubscriber");
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        com.taobao.android.detail.core.utils.i.c("OpenRateUltronSubscriber", "onHandleEvent");
        DetailCoreActivity detailCoreActivity = (DetailCoreActivity) com.taobao.prefork.a.a(eVar.a());
        if (detailCoreActivity == null) {
            return;
        }
        enz enzVar = null;
        Object a2 = a(1);
        if (a2 != null) {
            try {
                JSONObject parseObject = JSON.parseObject(JSON.toJSONString(a2));
                if (parseObject != null) {
                    enzVar = new enz(new RateNode.RateKeyword(parseObject));
                }
            } catch (Throwable th) {
                com.taobao.android.detail.core.utils.i.a("OpenRateUltronSubscriber", "rateKeyword", th);
            }
        }
        if (enzVar == null) {
            enzVar = new enz(c());
        }
        new fdf(detailCoreActivity).a(enzVar);
    }
}
