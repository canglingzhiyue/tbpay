package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class WwPromptNode extends DetailNode {
    public String msg;

    static {
        kge.a(-431372115);
    }

    public WwPromptNode(JSONObject jSONObject) {
        super(jSONObject);
        this.msg = jSONObject.getString("msg");
        tpc.a("com.taobao.android.detail.sdk.model.node.WwPromptNode");
    }
}
