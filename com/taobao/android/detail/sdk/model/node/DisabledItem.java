package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class DisabledItem extends DetailNode {
    public String hintText;
    public String linkText;
    public String linkUrl;

    static {
        kge.a(773412822);
    }

    public DisabledItem(JSONObject jSONObject) {
        super(jSONObject);
        this.hintText = jSONObject.getString("hintText");
        this.linkText = jSONObject.getString("linkText");
        this.linkUrl = jSONObject.getString("linkUrl");
        tpc.a("com.taobao.android.detail.sdk.model.node.DisabledItem");
    }
}
