package com.taobao.android.detail.wrapper.request.inside;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.detail.datasdk.model.datamodel.node.FeatureNode;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class FeatureInsideExtNode extends FeatureNode {
    public boolean insideDowngrade;

    static {
        kge.a(1729220989);
    }

    public FeatureInsideExtNode(JSONObject jSONObject) {
        super(jSONObject);
        this.insideDowngrade = jSONObject.getBooleanValue("insideDowngrade");
        emu.a("com.taobao.android.detail.wrapper.request.inside.FeatureInsideExtNode");
    }
}
