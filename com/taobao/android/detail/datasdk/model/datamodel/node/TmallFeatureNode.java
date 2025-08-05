package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class TmallFeatureNode extends DetailNode {
    public String icon;
    public String link;
    public String spm;
    public String text;
    public String title;

    static {
        kge.a(578950493);
    }

    public TmallFeatureNode(JSONObject jSONObject) {
        super(jSONObject);
        if (jSONObject == null) {
            return;
        }
        this.title = jSONObject.getString("title");
        this.link = jSONObject.getString("link");
        this.icon = jSONObject.getString("icon");
        this.text = jSONObject.getString("text");
        this.spm = jSONObject.getString("spm");
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.TmallFeatureNode");
    }
}
