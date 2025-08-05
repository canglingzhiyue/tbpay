package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import tb.emu;
import tb.epw;
import tb.kge;

/* loaded from: classes4.dex */
public class ContentNode extends DetailNode {
    public static final String TAG = "content";
    public JSONObject commonUtParams;
    public String seeIds;
    public String title;

    static {
        kge.a(-217332466);
    }

    public ContentNode(JSONObject jSONObject) {
        super(jSONObject);
        this.title = epw.a(jSONObject.getString("askIcon"));
        this.seeIds = epw.a(jSONObject.getString("askText"));
        this.commonUtParams = jSONObject.getJSONObject("commonUtParams");
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.ContentNode");
    }
}
