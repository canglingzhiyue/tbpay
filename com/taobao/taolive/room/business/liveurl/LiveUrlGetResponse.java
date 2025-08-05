package com.taobao.taolive.room.business.liveurl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class LiveUrlGetResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LiveUrlGetResponseData data;

    static {
        kge.a(1590108047);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public LiveUrlGetResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LiveUrlGetResponseData) ipChange.ipc$dispatch("7c3cbc1f", new Object[]{this}) : this.data;
    }

    public void setData(LiveUrlGetResponseData liveUrlGetResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb055f5", new Object[]{this, liveUrlGetResponseData});
        } else {
            this.data = liveUrlGetResponseData;
        }
    }
}
