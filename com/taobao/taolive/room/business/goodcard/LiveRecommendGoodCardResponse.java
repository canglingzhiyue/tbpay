package com.taobao.taolive.room.business.goodcard;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class LiveRecommendGoodCardResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LiveDetailMessinfoResponseData.RecommendCardInfo data;

    static {
        kge.a(1868793931);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public LiveDetailMessinfoResponseData.RecommendCardInfo mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LiveDetailMessinfoResponseData.RecommendCardInfo) ipChange.ipc$dispatch("8edd45d2", new Object[]{this}) : this.data;
    }

    public void setData(LiveDetailMessinfoResponseData.RecommendCardInfo recommendCardInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5febc36", new Object[]{this, recommendCardInfo});
        } else {
            this.data = recommendCardInfo;
        }
    }
}
