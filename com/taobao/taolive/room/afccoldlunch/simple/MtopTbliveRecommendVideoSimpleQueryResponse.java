package com.taobao.taolive.room.afccoldlunch.simple;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopTbliveRecommendVideoSimpleQueryResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MtopTbliveRecommendVideoSimpleQueryResponseData data;

    static {
        kge.a(-1538172928);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public MtopTbliveRecommendVideoSimpleQueryResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopTbliveRecommendVideoSimpleQueryResponseData) ipChange.ipc$dispatch("2fea44ce", new Object[]{this}) : this.data;
    }

    public void setData(MtopTbliveRecommendVideoSimpleQueryResponseData mtopTbliveRecommendVideoSimpleQueryResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0769764", new Object[]{this, mtopTbliveRecommendVideoSimpleQueryResponseData});
        } else {
            this.data = mtopTbliveRecommendVideoSimpleQueryResponseData;
        }
    }
}
