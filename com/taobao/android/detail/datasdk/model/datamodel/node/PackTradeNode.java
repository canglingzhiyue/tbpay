package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class PackTradeNode extends DetailNode {
    public String amountText;
    public int currentAmount;
    public long endTime;
    public long startTime;
    public int targetAmount;

    static {
        kge.a(311242144);
    }

    public PackTradeNode(JSONObject jSONObject) {
        super(jSONObject);
        this.startTime = jSONObject.getLongValue("startTimeMillis");
        this.endTime = jSONObject.getLongValue("endTimeMillis");
        this.currentAmount = jSONObject.getIntValue("currentAmount");
        this.targetAmount = jSONObject.getIntValue("targetAmount");
        this.amountText = jSONObject.getString("amountText");
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.PackTradeNode");
    }
}
