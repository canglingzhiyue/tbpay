package com.taobao.message.subscribe;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes7.dex */
public class MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponse extends BaseOutDo {
    private MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponseData data;

    static {
        kge.a(132391712);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponseData mo2429getData() {
        return this.data;
    }

    public void setData(MtopTaobaoAlimpBentleySubscribeCenterActionQueryResponseData mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponseData) {
        this.data = mtopTaobaoAlimpBentleySubscribeCenterActionQueryResponseData;
    }
}
