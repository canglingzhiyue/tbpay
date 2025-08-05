package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.biz.substitute.SubstituteConstants;
import tb.emu;
import tb.epw;
import tb.kge;

/* loaded from: classes4.dex */
public class ChinaQualityNode extends DetailNode {
    public long endTime;
    public String location;
    public String slogan;
    public long startTime;

    static {
        kge.a(-218784073);
    }

    public ChinaQualityNode(JSONObject jSONObject) {
        super(jSONObject);
        this.location = epw.a(jSONObject.getString("location"));
        this.slogan = epw.a(jSONObject.getString(SubstituteConstants.KEY_SUBSTITUTE_PAY_SLOGAN));
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
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.ChinaQualityNode");
    }
}
