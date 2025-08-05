package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class TmallFeatureNode extends DetailNode {
    public String icon;
    public String link;
    public String spm;
    public String text;
    public String title;

    static {
        kge.a(1639901463);
    }

    public TmallFeatureNode(JSONObject jSONObject) {
        super(jSONObject);
        tpc.a("com.taobao.android.detail.sdk.model.node.TmallFeatureNode");
        if (jSONObject == null) {
            return;
        }
        this.title = jSONObject.getString("title");
        this.link = jSONObject.getString("link");
        this.icon = jSONObject.getString("icon");
        this.text = jSONObject.getString("text");
        this.spm = jSONObject.getString("spm");
    }
}
