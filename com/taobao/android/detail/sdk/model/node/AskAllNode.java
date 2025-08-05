package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.detail.sdk.utils.c;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class AskAllNode extends DetailNode {
    public String askIcon;
    public String askText;
    public String linkUrl;

    static {
        kge.a(-1011638159);
    }

    public AskAllNode(JSONObject jSONObject) {
        super(jSONObject);
        this.askIcon = c.a(jSONObject.getString("askIcon"));
        this.askText = c.a(jSONObject.getString("askText"));
        this.linkUrl = c.a(jSONObject.getString("linkUrl"));
        tpc.a("com.taobao.android.detail.sdk.model.node.AskAllNode");
    }
}
