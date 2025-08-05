package com.taobao.android.detail.datasdk.model.datamodel.node;

import com.alibaba.fastjson.JSONObject;
import com.taobao.unit.center.sync.constant.SyncConstant;
import java.io.Serializable;
import tb.emu;
import tb.eni;
import tb.kge;

/* loaded from: classes4.dex */
public class LayoutNode implements Serializable {
    public String actionTemplateId;
    public JSONObject layoutJson;
    public String layoutTemplateId;
    public String ruleTemplateId;
    public String themeTemplateId;

    static {
        kge.a(-1038451975);
        kge.a(1028243835);
    }

    public LayoutNode(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.isEmpty()) {
            this.layoutTemplateId = eni.e;
            this.themeTemplateId = eni.h;
            this.ruleTemplateId = eni.f;
            this.actionTemplateId = eni.g;
            return;
        }
        this.layoutTemplateId = jSONObject.getString(SyncConstant.KEY_LAYOUTID);
        this.layoutJson = jSONObject.getJSONObject("detailTemplateData");
        JSONObject jSONObject2 = this.layoutJson;
        if (jSONObject2 != null && jSONObject2.isEmpty()) {
            this.layoutJson = null;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("config");
        if (jSONObject3 != null) {
            this.themeTemplateId = jSONObject3.getString("dependThemeConfigID");
            this.ruleTemplateId = jSONObject3.getString("dependComponentConfigID");
            this.actionTemplateId = jSONObject3.getString("dependActionConfigID");
        }
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.node.LayoutNode");
    }
}
