package com.taobao.android.detail.ttdetail.request.params;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class RedPacketRequestParams implements MtopRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject data;

    static {
        kge.a(1364057106);
        kge.a(395113271);
    }

    public RedPacketRequestParams(JSONObject jSONObject) {
        this.data = jSONObject;
    }

    @Override // com.taobao.android.detail.ttdetail.request.params.MtopRequestParams
    public String toData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("add28f54", new Object[]{this}) : JSON.toJSONString(this.data);
    }
}
