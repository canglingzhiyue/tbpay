package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class ShopCardNode extends DetailNode {
    public String mRecPic;

    static {
        kge.a(662850159);
    }

    public ShopCardNode(JSONObject jSONObject) {
        super(jSONObject);
        this.mRecPic = jSONObject.getString("recPic");
        tpc.a("com.taobao.android.detail.sdk.model.node.ShopCardNode");
    }
}
