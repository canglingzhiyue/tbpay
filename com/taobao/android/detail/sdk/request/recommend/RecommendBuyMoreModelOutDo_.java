package com.taobao.android.detail.sdk.request.recommend;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes4.dex */
public class RecommendBuyMoreModelOutDo_ extends BaseOutDo {
    private RecommendBuyMoreModel data;

    static {
        kge.a(791743357);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public RecommendBuyMoreModel mo2429getData() {
        return this.data;
    }

    public void setData(RecommendBuyMoreModel recommendBuyMoreModel) {
        this.data = recommendBuyMoreModel;
    }
}
