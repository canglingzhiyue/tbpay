package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class PageLayoutNode extends DetailNode {
    public static final String TAG = "pageLayout";
    public PageLayoutNaviTabNode naviTab;

    static {
        kge.a(-2046626712);
    }

    public PageLayoutNode(JSONObject jSONObject) {
        super(jSONObject);
        try {
            this.naviTab = new PageLayoutNaviTabNode(jSONObject.getJSONObject("naviTab"));
        } catch (Throwable unused) {
        }
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.PageLayoutNode");
    }
}
