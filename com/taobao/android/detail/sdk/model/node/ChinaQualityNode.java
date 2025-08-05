package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.biz.substitute.SubstituteConstants;
import com.taobao.android.detail.sdk.utils.c;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class ChinaQualityNode extends DetailNode {
    public long endTime;
    public String location;
    public String slogan;
    public long startTime;

    static {
        kge.a(842166897);
    }

    public ChinaQualityNode(JSONObject jSONObject) {
        super(jSONObject);
        this.location = c.a(jSONObject.getString("location"));
        this.slogan = c.a(jSONObject.getString(SubstituteConstants.KEY_SUBSTITUTE_PAY_SLOGAN));
        try {
            this.startTime = jSONObject.getLongValue("startTime");
        } catch (Exception unused) {
            this.startTime = 0L;
        }
        try {
            this.endTime = jSONObject.getLongValue("endTime");
        } catch (Exception unused2) {
            this.endTime = 0L;
        }
        tpc.a("com.taobao.android.detail.sdk.model.node.ChinaQualityNode");
    }
}
