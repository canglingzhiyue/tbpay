package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class SellOutNode extends DetailNode {
    public static final int STATUS_HAS_GIFT = 2;
    public static final int STATUS_NO_GIFT = 1;
    public static final int STATUS_UNSUPPORTED = 0;
    public String activityId;
    public String jumpUrl;
    public boolean reserved;
    public String reservedModuleId;
    public int sellOutStatus;

    static {
        kge.a(-382249545);
    }

    public SellOutNode(JSONObject jSONObject) {
        super(jSONObject);
        this.activityId = "";
        this.jumpUrl = "";
        this.reservedModuleId = "";
        tpc.a("com.taobao.android.detail.sdk.model.node.SellOutNode");
        try {
            this.sellOutStatus = jSONObject.getIntValue("sellOutStatus");
        } catch (Exception unused) {
            this.sellOutStatus = 0;
        }
        try {
            this.reserved = jSONObject.getBooleanValue("reserved");
        } catch (Exception unused2) {
            this.reserved = false;
        }
        this.activityId = jSONObject.getString("activityId");
        this.jumpUrl = jSONObject.getString("jumpUrl");
        this.reservedModuleId = jSONObject.getString("reservedModuleId");
    }
}
