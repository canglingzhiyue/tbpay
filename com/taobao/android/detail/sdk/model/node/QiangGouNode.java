package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.detail.sdk.utils.c;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class QiangGouNode extends DetailNode {
    public long endTime;
    public int progress;
    public String progressText;
    public String remindText;
    public String soldText;
    public long startTime;
    public Status status;

    /* loaded from: classes4.dex */
    public enum Status {
        REMIND,
        START
    }

    static {
        kge.a(1620047156);
    }

    public QiangGouNode(JSONObject jSONObject) {
        super(jSONObject);
        this.startTime = 0L;
        this.endTime = 0L;
        this.progress = 0;
        tpc.a("com.taobao.android.detail.sdk.model.node.QiangGouNode");
        int intValue = jSONObject.getInteger("status").intValue();
        this.status = (intValue != 1 && intValue == 0) ? Status.REMIND : Status.START;
        this.soldText = c.a(jSONObject.getString("soldText"));
        this.remindText = c.a(jSONObject.getString("remindText"));
        this.progressText = c.a(jSONObject.getString("progressText"));
        if (jSONObject.containsKey("startTime")) {
            this.startTime = jSONObject.getLong("startTime").longValue();
        }
        if (jSONObject.containsKey("endTime")) {
            this.endTime = jSONObject.getLong("endTime").longValue();
        }
        if (jSONObject.containsKey("progress")) {
            this.progress = jSONObject.getInteger("progress").intValue();
        }
    }
}
