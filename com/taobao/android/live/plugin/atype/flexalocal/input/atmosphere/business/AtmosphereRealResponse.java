package com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes6.dex */
public class AtmosphereRealResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AtmosphereRealResponseData data;

    static {
        kge.a(-2008957772);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public Object mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("4ca84d6b", new Object[]{this}) : this.data;
    }

    public void setData(AtmosphereRealResponseData atmosphereRealResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af121a4", new Object[]{this, atmosphereRealResponseData});
        } else {
            this.data = atmosphereRealResponseData;
        }
    }
}
