package com.taobao.android.live.plugin.atype.flexalocal.good.business;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes4.dex */
public class LiveItemPersonalityGetResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LiveItemPersonalityGetResponseData data;

    static {
        kge.a(-2036761839);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public LiveItemPersonalityGetResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LiveItemPersonalityGetResponseData) ipChange.ipc$dispatch("ed8a4043", new Object[]{this}) : this.data;
    }

    public void setData(LiveItemPersonalityGetResponseData liveItemPersonalityGetResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1c0da7", new Object[]{this, liveItemPersonalityGetResponseData});
        } else {
            this.data = liveItemPersonalityGetResponseData;
        }
    }
}
