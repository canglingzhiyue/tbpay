package com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes6.dex */
public class AtmosphereResListResponseNew extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AtmosphereResListResponseDataNew2 data;

    static {
        kge.a(1522674262);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public Object mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("4ca84d6b", new Object[]{this}) : this.data;
    }

    public void setData(AtmosphereResListResponseDataNew2 atmosphereResListResponseDataNew2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d74e748", new Object[]{this, atmosphereResListResponseDataNew2});
        } else {
            this.data = atmosphereResListResponseDataNew2;
        }
    }
}
