package com.taobao.android.taopai.charge.net;

import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes6.dex */
public class ChargeReportResponse extends BaseOutDo {
    private ChargeReportData data;

    /* loaded from: classes6.dex */
    public static class ChargeReportData implements IMTOPDataObject {
        public String traceId;

        static {
            kge.a(1043365158);
            kge.a(-350052935);
        }
    }

    static {
        kge.a(-1067365904);
    }

    public void setData(ChargeReportData chargeReportData) {
        this.data = chargeReportData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public ChargeReportData mo2429getData() {
        return this.data;
    }
}
