package com.taobao.live.ubee.mtop.report;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes7.dex */
public class ReportConfigResponse extends BaseOutDo {
    private ReportConfigData data;

    static {
        kge.a(-122960963);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public ReportConfigData mo2429getData() {
        return this.data;
    }

    public void setData(ReportConfigData reportConfigData) {
        this.data = reportConfigData;
    }
}
