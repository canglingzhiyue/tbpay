package com.taobao.android.detail.core.request.market;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes4.dex */
public class MarketBagPriceOutDo_ extends BaseOutDo {
    private MarketBagPrice data;

    static {
        kge.a(-1783768367);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MarketBagPrice mo2429getData() {
        return this.data;
    }

    public void setData(MarketBagPrice marketBagPrice) {
        this.data = marketBagPrice;
    }
}
