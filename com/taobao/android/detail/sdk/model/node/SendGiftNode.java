package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.detail.sdk.utils.c;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class SendGiftNode extends DetailNode {
    public String buttonText;
    public String link;
    public boolean showGift;
    public String title;

    static {
        kge.a(-1267504351);
    }

    public SendGiftNode(JSONObject jSONObject) {
        super(jSONObject);
        tpc.a("com.taobao.android.detail.sdk.model.node.SendGiftNode");
        this.title = c.a(jSONObject.getString("title"));
        this.link = c.a(jSONObject.getString("link"));
        this.buttonText = c.a(jSONObject.getString("buttonText"));
        this.showGift = jSONObject.getBooleanValue("showGift");
    }
}
