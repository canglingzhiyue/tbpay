package com.taobao.android.detail.sdk.request.market;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class MarketBagPriceResult extends BaseOutDo {
    private MarketBagPrice data;

    static {
        kge.a(1256522765);
    }

    public MarketBagPriceResult() {
        tpc.a("com.taobao.android.detail.sdk.request.market.MarketBagPriceResult");
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
