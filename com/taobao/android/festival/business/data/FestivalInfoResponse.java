package com.taobao.android.festival.business.data;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes5.dex */
public class FestivalInfoResponse extends BaseOutDo {
    private FestivalInfoData data;

    static {
        kge.a(1328495553);
    }

    public void setData(FestivalInfoData festivalInfoData) {
        this.data = festivalInfoData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public FestivalInfoData mo2429getData() {
        return this.data;
    }
}
