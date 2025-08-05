package com.taobao.android.detail.sdk.request.market;

import java.io.Serializable;
import java.util.ArrayList;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class MarketRecommendCategory implements Serializable {
    public ArrayList<MarketRecommendItem> datalist;
    public String id;
    public String title;

    static {
        kge.a(827803915);
        kge.a(1028243835);
    }

    public MarketRecommendCategory() {
        tpc.a("com.taobao.android.detail.sdk.request.market.MarketRecommendCategory");
    }
}
