package com.taobao.message.subscribe;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes7.dex */
public class MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponse extends BaseOutDo {
    private MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponseData data;

    static {
        kge.a(-399445564);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponseData mo2429getData() {
        return this.data;
    }

    public void setData(MtopTaobaoAlimpBentleySubscribeCenterActionCancelResponseData mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponseData) {
        this.data = mtopTaobaoAlimpBentleySubscribeCenterActionCancelResponseData;
    }
}
