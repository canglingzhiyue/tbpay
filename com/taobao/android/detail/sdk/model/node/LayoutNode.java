package com.taobao.android.detail.sdk.model.node;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.detail.sdk.structure.h;
import com.taobao.unit.center.sync.constant.SyncConstant;
import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class LayoutNode implements Serializable {
    public String actionTemplateId;
    public JSONObject layoutJson;
    public String layoutTemplateId;
    public String ruleTemplateId;
    public String themeTemplateId;

    static {
        kge.a(361177651);
        kge.a(1028243835);
    }

    public LayoutNode(JSONObject jSONObject) {
        tpc.a("com.taobao.android.detail.sdk.model.node.LayoutNode");
        if (jSONObject == null || jSONObject.isEmpty()) {
            this.layoutTemplateId = h.e;
            this.themeTemplateId = h.h;
            this.ruleTemplateId = h.f;
            this.actionTemplateId = h.g;
            return;
        }
        this.layoutTemplateId = jSONObject.getString(SyncConstant.KEY_LAYOUTID);
        this.layoutJson = jSONObject.getJSONObject("detailTemplateData");
        JSONObject jSONObject2 = this.layoutJson;
        if (jSONObject2 != null && jSONObject2.isEmpty()) {
            this.layoutJson = null;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("config");
        if (jSONObject3 == null) {
            return;
        }
        this.themeTemplateId = jSONObject3.getString("dependThemeConfigID");
        this.ruleTemplateId = jSONObject3.getString("dependComponentConfigID");
        this.actionTemplateId = jSONObject3.getString("dependActionConfigID");
    }
}
