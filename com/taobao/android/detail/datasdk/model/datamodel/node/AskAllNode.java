package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import tb.emu;
import tb.epw;
import tb.kge;

/* loaded from: classes4.dex */
public class AskAllNode extends DetailNode {
    public String askIcon;
    public String askText;
    public String linkUrl;

    static {
        kge.a(1883699511);
    }

    public AskAllNode(JSONObject jSONObject) {
        super(jSONObject);
        this.askIcon = epw.a(jSONObject.getString("askIcon"));
        this.askText = epw.a(jSONObject.getString("askText"));
        this.linkUrl = epw.a(jSONObject.getString("linkUrl"));
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.AskAllNode");
    }
}
