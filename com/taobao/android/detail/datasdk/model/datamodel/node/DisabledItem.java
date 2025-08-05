package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class DisabledItem extends DetailNode {
    public String hintText;
    public String linkText;
    public String linkUrl;

    static {
        kge.a(54105884);
    }

    public DisabledItem(JSONObject jSONObject) {
        super(jSONObject);
        this.hintText = jSONObject.getString("hintText");
        this.linkText = jSONObject.getString("linkText");
        this.linkUrl = jSONObject.getString("linkUrl");
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.DisabledItem");
    }
}
