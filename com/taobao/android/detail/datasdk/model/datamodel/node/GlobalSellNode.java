package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class GlobalSellNode extends DetailNode {
    public String currency;
    public String priceChar;
    public String site;

    static {
        kge.a(813101412);
    }

    public GlobalSellNode(JSONObject jSONObject) {
        super(jSONObject);
        this.site = jSONObject.getString("site");
        this.currency = jSONObject.getString("currency");
        this.priceChar = jSONObject.getString("priceChar");
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.GlobalSellNode");
    }
}
