package com.taobao.taolive.sdk.business.detail.checkforeground;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class CheckForeGroundResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, CheckForeGroundResponseData> data;

    static {
        kge.a(1446381968);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData  reason: collision with other method in class */
    public Map<String, CheckForeGroundResponseData> mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("516a2e9c", new Object[]{this}) : this.data;
    }

    public void setData(Map<String, CheckForeGroundResponseData> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9cd3172", new Object[]{this, map});
        } else {
            this.data = map;
        }
    }
}
