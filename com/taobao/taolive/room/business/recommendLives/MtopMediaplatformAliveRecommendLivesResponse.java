package com.taobao.taolive.room.business.recommendLives;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopMediaplatformAliveRecommendLivesResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MtopMediaplatformAliveRecommendLivesResponseData data;

    static {
        kge.a(-944641761);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public MtopMediaplatformAliveRecommendLivesResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopMediaplatformAliveRecommendLivesResponseData) ipChange.ipc$dispatch("686a6af5", new Object[]{this}) : this.data;
    }

    public void setData(MtopMediaplatformAliveRecommendLivesResponseData mtopMediaplatformAliveRecommendLivesResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff9c53d9", new Object[]{this, mtopMediaplatformAliveRecommendLivesResponseData});
        } else {
            this.data = mtopMediaplatformAliveRecommendLivesResponseData;
        }
    }
}
