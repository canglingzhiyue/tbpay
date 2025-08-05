package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.detail.sdk.utils.c;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class SuperMarketNode extends DetailNode {
    public String cartUrl;
    public boolean hideBuy;
    public String homePageUrl;
    public String logicArea;
    public boolean supportMakeUpOrder;
    public String tpId;
    public String weight;

    static {
        kge.a(-921037646);
    }

    public SuperMarketNode(JSONObject jSONObject) {
        super(jSONObject);
        tpc.a("com.taobao.android.detail.sdk.model.node.SuperMarketNode");
        this.weight = c.a(jSONObject.getString("weight"));
        this.tpId = c.a(jSONObject.getString("tpId"));
        this.logicArea = c.a(jSONObject.getString("logicArea"));
        this.homePageUrl = c.a(jSONObject.getString("homePageUrl"));
        this.cartUrl = c.a(jSONObject.getString("cartUrl"));
        Boolean bool = jSONObject.getBoolean("hideBuy");
        Boolean bool2 = jSONObject.getBoolean("supportMakeUpOrder");
        this.hideBuy = bool == null ? true : bool.booleanValue();
        this.supportMakeUpOrder = bool2 == null ? false : bool2.booleanValue();
    }
}
