package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class PageLayoutNaviTabItemsNode extends DetailNode {
    public String locatorId;
    public String title;

    static {
        kge.a(2046731769);
    }

    public PageLayoutNaviTabItemsNode(JSONObject jSONObject) {
        super(jSONObject);
        this.locatorId = jSONObject.getString("locatorId");
        this.title = jSONObject.getString("title");
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.PageLayoutNaviTabItemsNode");
    }
}
