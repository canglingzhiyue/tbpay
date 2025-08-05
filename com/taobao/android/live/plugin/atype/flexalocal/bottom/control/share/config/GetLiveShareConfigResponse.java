package com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.config;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes5.dex */
public class GetLiveShareConfigResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private GetLiveShareConfigResponseData data;

    static {
        kge.a(-506372973);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public GetLiveShareConfigResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GetLiveShareConfigResponseData) ipChange.ipc$dispatch("9cbb5841", new Object[]{this}) : this.data;
    }

    public void setData(GetLiveShareConfigResponseData getLiveShareConfigResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ea3d65", new Object[]{this, getLiveShareConfigResponseData});
        } else {
            this.data = getLiveShareConfigResponseData;
        }
    }
}
