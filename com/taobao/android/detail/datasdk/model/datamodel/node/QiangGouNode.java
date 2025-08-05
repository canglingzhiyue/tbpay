package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import tb.emu;
import tb.epw;
import tb.kge;

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
        kge.a(900740218);
    }

    public QiangGouNode(JSONObject jSONObject) {
        super(jSONObject);
        this.startTime = 0L;
        this.endTime = 0L;
        this.progress = 0;
        int intValue = jSONObject.getInteger("status").intValue();
        this.status = (intValue != 1 && intValue == 0) ? Status.REMIND : Status.START;
        this.soldText = epw.a(jSONObject.getString("soldText"));
        this.remindText = epw.a(jSONObject.getString("remindText"));
        this.progressText = epw.a(jSONObject.getString("progressText"));
        if (jSONObject.containsKey("startTime")) {
            this.startTime = jSONObject.getLong("startTime").longValue();
        }
        if (jSONObject.containsKey("endTime")) {
            this.endTime = jSONObject.getLong("endTime").longValue();
        }
        if (jSONObject.containsKey("progress")) {
            this.progress = jSONObject.getInteger("progress").intValue();
        }
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.QiangGouNode");
    }
}
