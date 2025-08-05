package com.taobao.passivelocation.business.report_error;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes7.dex */
public class MtopLbsReportLocationErrResponse extends BaseOutDo {
    private MtopLbsReportLocationErrResponseData data;

    static {
        kge.a(701100753);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MtopLbsReportLocationErrResponseData mo2429getData() {
        return this.data;
    }

    public void setData(MtopLbsReportLocationErrResponseData mtopLbsReportLocationErrResponseData) {
        this.data = mtopLbsReportLocationErrResponseData;
    }
}
