package com.taobao.android.detail.sdk.request.endorsement;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes4.dex */
public class EndorsementResultOutDo_ extends BaseOutDo {
    private EndorsementResult data;

    static {
        kge.a(252227792);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public EndorsementResult mo2429getData() {
        return this.data;
    }

    public void setData(EndorsementResult endorsementResult) {
        this.data = endorsementResult;
    }
}
