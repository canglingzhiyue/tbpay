package com.taobao.activelocation.mtop.pois;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes4.dex */
public class MtopPoiResponse extends BaseOutDo {
    private MtopPoiResponseData data;

    static {
        kge.a(-136768573);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MtopPoiResponseData mo2429getData() {
        return this.data;
    }

    public void setData(MtopPoiResponseData mtopPoiResponseData) {
        this.data = mtopPoiResponseData;
    }
}
