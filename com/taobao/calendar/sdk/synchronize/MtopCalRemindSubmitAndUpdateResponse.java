package com.taobao.calendar.sdk.synchronize;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes6.dex */
public class MtopCalRemindSubmitAndUpdateResponse extends BaseOutDo {
    private MtopCalRemindSubmitAndUpdateResponseData data;

    static {
        kge.a(-1356841424);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MtopCalRemindSubmitAndUpdateResponseData mo2429getData() {
        return this.data;
    }

    public void setData(MtopCalRemindSubmitAndUpdateResponseData mtopCalRemindSubmitAndUpdateResponseData) {
        this.data = mtopCalRemindSubmitAndUpdateResponseData;
    }
}
