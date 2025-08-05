package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import tb.emu;
import tb.epw;
import tb.kge;

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
        kge.a(2092779436);
    }

    public SuperMarketNode(JSONObject jSONObject) {
        super(jSONObject);
        this.weight = epw.a(jSONObject.getString("weight"));
        this.tpId = epw.a(jSONObject.getString("tpId"));
        this.logicArea = epw.a(jSONObject.getString("logicArea"));
        this.homePageUrl = epw.a(jSONObject.getString("homePageUrl"));
        this.cartUrl = epw.a(jSONObject.getString("cartUrl"));
        Boolean bool = jSONObject.getBoolean("hideBuy");
        Boolean bool2 = jSONObject.getBoolean("supportMakeUpOrder");
        this.hideBuy = bool == null ? true : bool.booleanValue();
        this.supportMakeUpOrder = bool2 == null ? false : bool2.booleanValue();
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.SuperMarketNode");
    }
}
