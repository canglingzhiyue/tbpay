package com.taobao.android.detail.sdk.request.market;

import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class MarketRecommendItem implements Serializable {
    public String _pos_;
    public String acm;
    public String entityType;
    public boolean hasSku;
    public String itemId;
    public String jumpUrl;
    public String picUrl;
    public String price;
    public String scm;
    public String title;

    static {
        kge.a(329258400);
        kge.a(1028243835);
    }

    public MarketRecommendItem() {
        tpc.a("com.taobao.android.detail.sdk.request.market.MarketRecommendItem");
    }
}
