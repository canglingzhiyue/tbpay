package com.taobao.android.festival.business.data;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes5.dex */
public class FestivalResponse extends BaseOutDo {
    private FestivalResponseData data;

    static {
        kge.a(-1173739021);
    }

    public void setData(FestivalResponseData festivalResponseData) {
        this.data = festivalResponseData;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public FestivalResponseData mo2429getData() {
        return this.data;
    }
}
