package com.ali.alihadeviceevaluator.network;

import mtopsdk.mtop.domain.BaseOutDo;

/* loaded from: classes2.dex */
class MtopTaobaoHaQueryResponse extends BaseOutDo {
    private MtopTaobaoHaQueryResponseData data;

    MtopTaobaoHaQueryResponse() {
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MtopTaobaoHaQueryResponseData mo2429getData() {
        return this.data;
    }

    public void setData(MtopTaobaoHaQueryResponseData mtopTaobaoHaQueryResponseData) {
        this.data = mtopTaobaoHaQueryResponseData;
    }
}
