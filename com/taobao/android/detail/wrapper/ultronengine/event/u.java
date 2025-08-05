package com.taobao.android.detail.wrapper.ultronengine.event;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import tb.eef;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class u extends com.alibaba.android.ultron.event.q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "setRemind";

    static {
        kge.a(968146876);
    }

    public u() {
        emu.a("com.taobao.android.detail.wrapper.ultronengine.event.SetRemindUltronSubscriber");
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        JSONObject c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        DetailCoreActivity detailCoreActivity = (DetailCoreActivity) eVar.a();
        if (detailCoreActivity.C() == null || (c = c()) == null) {
            return;
        }
        String i = detailCoreActivity.C().i();
        long longValue = c.getLong("startTime").longValue();
        long longValue2 = c.getLong("endTime").longValue();
        int intValue = c.getInteger("sourceId").intValue();
        com.taobao.android.detail.core.event.params.f fVar = new com.taobao.android.detail.core.event.params.f(i, c.getString("title"), c.getString("link"), null, longValue, longValue2, 0L);
        fVar.h = intValue;
        com.taobao.android.trade.event.f.a(this.d, new eef(fVar));
        JSONObject jSONObject = c.getJSONObject("next");
        if (jSONObject != null) {
            a(jSONObject.getJSONArray("success"));
        }
        com.taobao.android.detail.core.utils.i.c("SetRemindUltronSubscriber", "SetRemindUltronSubscriber setRemind");
    }
}
