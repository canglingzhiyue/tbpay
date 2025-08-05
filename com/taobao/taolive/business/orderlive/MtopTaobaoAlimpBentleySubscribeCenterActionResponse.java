package com.taobao.taolive.business.orderlive;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopTaobaoAlimpBentleySubscribeCenterActionResponse extends NetBaseOutDo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MtopTaobaoAlimpBentleySubscribeCenterActionResponseData data;

    static {
        kge.a(-1995383110);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
    /* renamed from: getData */
    public MtopTaobaoAlimpBentleySubscribeCenterActionResponseData mo1437getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopTaobaoAlimpBentleySubscribeCenterActionResponseData) ipChange.ipc$dispatch("654e8f14", new Object[]{this}) : this.data;
    }

    public void setData(MtopTaobaoAlimpBentleySubscribeCenterActionResponseData mtopTaobaoAlimpBentleySubscribeCenterActionResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d48259ea", new Object[]{this, mtopTaobaoAlimpBentleySubscribeCenterActionResponseData});
        } else {
            this.data = mtopTaobaoAlimpBentleySubscribeCenterActionResponseData;
        }
    }
}
