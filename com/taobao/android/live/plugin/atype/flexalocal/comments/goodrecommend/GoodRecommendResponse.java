package com.taobao.android.live.plugin.atype.flexalocal.comments.goodrecommend;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes5.dex */
public class GoodRecommendResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private GoodRecommendDO data;

    static {
        kge.a(649939041);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public GoodRecommendDO mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GoodRecommendDO) ipChange.ipc$dispatch("b1ff3d3", new Object[]{this}) : this.data;
    }

    public void setData(GoodRecommendDO goodRecommendDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c4dedf7", new Object[]{this, goodRecommendDO});
        } else {
            this.data = goodRecommendDO;
        }
    }
}
