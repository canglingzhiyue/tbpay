package com.taobao.android.detail.datasdk.model.datamodel.template;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class ActionModel implements Serializable {
    @Deprecated
    public String key;
    public String mapping;
    public JSONObject params;
    public String type;

    static {
        kge.a(-458707970);
        kge.a(1028243835);
    }

    public ActionModel(JSONObject jSONObject) {
        this.key = jSONObject.getString("key");
        this.type = jSONObject.getString("type");
        if (StringUtils.isEmpty(this.type)) {
            this.type = this.key;
        }
        if (jSONObject.containsKey("params")) {
            this.mapping = jSONObject.getString("params");
            this.params = jSONObject.getJSONObject("params");
        } else {
            this.mapping = jSONObject.getString("fields");
            this.params = jSONObject.getJSONObject("fields");
        }
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel");
    }

    public ActionModel(ActionModel actionModel) {
        if (actionModel == null) {
            return;
        }
        this.key = actionModel.key;
        this.type = actionModel.type;
        this.params = JSONObject.parseObject(actionModel.mapping);
        emu.a("com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel");
    }
}
