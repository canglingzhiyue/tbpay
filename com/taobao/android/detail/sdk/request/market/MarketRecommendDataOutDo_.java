package com.taobao.android.detail.sdk.request.market;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes4.dex */
public class MarketRecommendDataOutDo_ extends BaseOutDo {
    private MarketRecommendData data;

    static {
        kge.a(817505309);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MarketRecommendData mo2429getData() {
        return this.data;
    }

    public void setData(MarketRecommendData marketRecommendData) {
        this.data = marketRecommendData;
    }
}
