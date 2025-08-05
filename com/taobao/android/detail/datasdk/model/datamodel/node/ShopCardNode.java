package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class ShopCardNode extends DetailNode {
    public String mRecPic;

    static {
        kge.a(-56456779);
    }

    public ShopCardNode(JSONObject jSONObject) {
        super(jSONObject);
        this.mRecPic = jSONObject.getString("recPic");
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.ShopCardNode");
    }
}
