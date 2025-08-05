package com.taobao.calendar.sdk.synchronize;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes6.dex */
public class MtopCalRemindUpdateResponse extends BaseOutDo {
    private MtopCalRemindUpdateResponseData data;

    static {
        kge.a(-1947647293);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MtopCalRemindUpdateResponseData mo2429getData() {
        return this.data;
    }

    public void setData(MtopCalRemindUpdateResponseData mtopCalRemindUpdateResponseData) {
        this.data = mtopCalRemindUpdateResponseData;
    }
}
