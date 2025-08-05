package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import tb.emu;
import tb.epw;
import tb.kge;

/* loaded from: classes4.dex */
public class BuyerNode extends DetailNode {
    public static final String TAG = "buyer";
    public String bucketId;
    public String taobaoMemberLevel;
    public String tmallMemberLevel;
    public String userId;

    static {
        kge.a(-1010727416);
    }

    public BuyerNode(JSONObject jSONObject) {
        super(jSONObject);
        this.userId = epw.a(jSONObject.getString("userId"));
        this.bucketId = epw.a(jSONObject.getString("bucketId"));
        this.taobaoMemberLevel = epw.a(jSONObject.getString("taobaoMemberLevel"));
        this.tmallMemberLevel = epw.a(jSONObject.getString("tmallMemberLevel"));
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.BuyerNode");
    }
}
