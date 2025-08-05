package com.taobao.android.detail.alicom.model.network;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes4.dex */
public class PreholdingPhoneNumberResult extends BaseOutDo {
    private PreholdingPhoneNumberData data;

    static {
        kge.a(650811372);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public PreholdingPhoneNumberData mo2429getData() {
        return this.data;
    }

    public void setData(PreholdingPhoneNumberData preholdingPhoneNumberData) {
        this.data = preholdingPhoneNumberData;
    }
}
