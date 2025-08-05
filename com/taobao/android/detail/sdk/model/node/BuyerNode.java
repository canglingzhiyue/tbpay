package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.detail.sdk.utils.c;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class BuyerNode extends DetailNode {
    public String bucketId;
    public String taobaoMemberLevel;
    public String tmallMemberLevel;
    public String userId;

    static {
        kge.a(-1796862066);
    }

    public BuyerNode(JSONObject jSONObject) {
        super(jSONObject);
        this.userId = c.a(jSONObject.getString("userId"));
        this.bucketId = c.a(jSONObject.getString("bucketId"));
        this.taobaoMemberLevel = c.a(jSONObject.getString("taobaoMemberLevel"));
        this.tmallMemberLevel = c.a(jSONObject.getString("tmallMemberLevel"));
        tpc.a("com.taobao.android.detail.sdk.model.node.BuyerNode");
    }
}
