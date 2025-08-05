package com.taobao.taolive.room.business.subscribe;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class VideoSubscribeResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private VideoSubscribeResponseData data;

    static {
        kge.a(-1046182460);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public VideoSubscribeResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoSubscribeResponseData) ipChange.ipc$dispatch("af57454a", new Object[]{this}) : this.data;
    }

    public void setData(VideoSubscribeResponseData videoSubscribeResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82dc25a0", new Object[]{this, videoSubscribeResponseData});
        } else {
            this.data = videoSubscribeResponseData;
        }
    }
}
