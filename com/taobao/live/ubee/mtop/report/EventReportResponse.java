package com.taobao.live.ubee.mtop.report;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes7.dex */
public class EventReportResponse extends BaseOutDo {
    private EventReportData data;

    static {
        kge.a(247807561);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public EventReportData mo2429getData() {
        return this.data;
    }

    public void setData(EventReportData eventReportData) {
        this.data = eventReportData;
    }
}
