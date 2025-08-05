package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class GlobalSellNode extends DetailNode {
    public String currency;
    public String priceChar;
    public String site;

    static {
        kge.a(577334174);
    }

    public GlobalSellNode(JSONObject jSONObject) {
        super(jSONObject);
        this.site = jSONObject.getString("site");
        this.currency = jSONObject.getString("currency");
        this.priceChar = jSONObject.getString("priceChar");
        tpc.a("com.taobao.android.detail.sdk.model.node.GlobalSellNode");
    }
}
