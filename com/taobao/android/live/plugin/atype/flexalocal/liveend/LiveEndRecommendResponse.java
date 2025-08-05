package com.taobao.android.live.plugin.atype.flexalocal.liveend;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes6.dex */
public class LiveEndRecommendResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LiveEndRecommendDataBean data;

    static {
        kge.a(-158816518);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public LiveEndRecommendDataBean mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LiveEndRecommendDataBean) ipChange.ipc$dispatch("64d4a6b", new Object[]{this}) : this.data;
    }

    public void setData(LiveEndRecommendDataBean liveEndRecommendDataBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f8fbbcf", new Object[]{this, liveEndRecommendDataBean});
        } else {
            this.data = liveEndRecommendDataBean;
        }
    }
}
