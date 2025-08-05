package com.taobao.android.detail.sdk.model.network.market;

import java.io.Serializable;
import java.util.List;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class MarketFlashActivityData implements Serializable {
    public List<MarketFlashActivityItem> itemList;
    public long time;
    public String title;
    public String url;

    static {
        kge.a(1673431233);
        kge.a(1028243835);
    }

    public MarketFlashActivityData() {
        tpc.a("com.taobao.android.detail.sdk.model.network.market.MarketFlashActivityData");
    }
}
