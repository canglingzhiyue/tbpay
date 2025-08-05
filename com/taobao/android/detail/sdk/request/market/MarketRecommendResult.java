package com.taobao.android.detail.sdk.request.market;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class MarketRecommendResult implements Serializable {
    @JSONField(name = "2015052020")
    public MarketRecommendCategory buyMore;
    @JSONField(name = "2015052019")
    public MarketRecommendCategory seeMore;

    static {
        kge.a(-1166019734);
        kge.a(1028243835);
    }

    public MarketRecommendResult() {
        tpc.a("com.taobao.android.detail.sdk.request.market.MarketRecommendResult");
    }
}
