package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import tb.emu;
import tb.epw;
import tb.kge;

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
        kge.a(-379184769);
    }

    public PresaleNode(JSONObject jSONObject) {
        super(jSONObject);
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
        this.prefixText = epw.a(jSONObject.getString("text"));
        this.extraText = epw.a(jSONObject.getString("extraText"));
        if (jSONObject.containsKey("orderedItemAmount")) {
            try {
                this.orderedItemAmount = jSONObject.getInteger("orderedItemAmount").intValue();
            } catch (Throwable unused) {
            }
        }
        this.depositText = epw.a(jSONObject.getString("depositText"));
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.PresaleNode");
    }
}
