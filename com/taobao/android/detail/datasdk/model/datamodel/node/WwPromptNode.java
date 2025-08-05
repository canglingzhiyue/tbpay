package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class WwPromptNode extends DetailNode {
    public String msg;

    static {
        kge.a(-1150679053);
    }

    public WwPromptNode(JSONObject jSONObject) {
        super(jSONObject);
        this.msg = jSONObject.getString("msg");
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.WwPromptNode");
    }
}
