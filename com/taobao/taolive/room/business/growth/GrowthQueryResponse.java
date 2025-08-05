package com.taobao.taolive.room.business.growth;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class GrowthQueryResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private GrowthQueryResponseData data;

    static {
        kge.a(-1588232119);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public Object mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("4ca84d6b", new Object[]{this}) : this.data;
    }

    public void setData(GrowthQueryResponseData growthQueryResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d08ffb", new Object[]{this, growthQueryResponseData});
        } else {
            this.data = growthQueryResponseData;
        }
    }
}
