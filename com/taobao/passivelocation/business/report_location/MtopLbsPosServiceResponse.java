package com.taobao.passivelocation.business.report_location;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes7.dex */
public class MtopLbsPosServiceResponse extends BaseOutDo {
    private MtopLbsPosServiceResponseData data;

    static {
        kge.a(1038915775);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MtopLbsPosServiceResponseData mo2429getData() {
        return this.data;
    }

    public void setData(MtopLbsPosServiceResponseData mtopLbsPosServiceResponseData) {
        this.data = mtopLbsPosServiceResponseData;
    }
}
