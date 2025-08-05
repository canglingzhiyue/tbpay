package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.detail.sdk.utils.c;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class PresaleNode extends DetailNode {
    public String depositText;
    public long endTime;
    public String extraText;
    public int orderedItemAmount;
    public String prefixText;
    public long startTime;
    public int status;

    static {
        kge.a(59660677);
    }

    public PresaleNode(JSONObject jSONObject) {
        super(jSONObject);
        tpc.a("com.taobao.android.detail.sdk.model.node.PresaleNode");
        Integer integer = jSONObject.getInteger("status");
        if (integer != null) {
            this.status = integer.intValue();
        }
        Long l = jSONObject.getLong("startTime");
        if (l != null) {
            this.startTime = l.longValue();
        }
        Long l2 = jSONObject.getLong("endTime");
        if (l2 != null) {
            this.endTime = l2.longValue();
        }
        this.prefixText = c.a(jSONObject.getString("text"));
        this.extraText = c.a(jSONObject.getString("extraText"));
        if (jSONObject.containsKey("orderedItemAmount")) {
            try {
                this.orderedItemAmount = jSONObject.getInteger("orderedItemAmount").intValue();
            } catch (Throwable unused) {
            }
        }
        this.depositText = c.a(jSONObject.getString("depositText"));
    }
}
