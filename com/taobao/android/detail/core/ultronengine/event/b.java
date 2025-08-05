package com.taobao.android.detail.core.ultronengine.event;

import com.alibaba.android.ultron.event.i;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.MtopRequest;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class b extends i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(722542493);
    }

    public b() {
        emu.a("com.taobao.android.detail.core.ultronengine.event.DetailRequestSubscriber");
    }

    @Override // com.alibaba.android.ultron.event.i
    public boolean a(MtopRequest mtopRequest, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2e4381", new Object[]{this, mtopRequest, jSONObject})).booleanValue();
        }
        if (mtopRequest == null || jSONObject == null) {
            return false;
        }
        jSONObject.put("detail_v", "3.3.2");
        mtopRequest.setData(jSONObject.toJSONString());
        return true;
    }
}
