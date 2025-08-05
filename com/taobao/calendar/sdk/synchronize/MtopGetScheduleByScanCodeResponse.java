package com.taobao.calendar.sdk.synchronize;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes6.dex */
public class MtopGetScheduleByScanCodeResponse extends BaseOutDo {
    private MtopGetScheduleByScanCodeResponseData data;

    static {
        kge.a(2082509461);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MtopGetScheduleByScanCodeResponseData mo2429getData() {
        return this.data;
    }

    public void setData(MtopGetScheduleByScanCodeResponseData mtopGetScheduleByScanCodeResponseData) {
        this.data = mtopGetScheduleByScanCodeResponseData;
    }
}
