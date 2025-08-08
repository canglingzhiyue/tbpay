package com.taobao.android.detail.sdk.model.template;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class ActionModel implements Serializable {
    @Deprecated
    public String key;
    public String mapping;
    public JSONObject params;
    public String type;

    static {
        kge.a(822442244);
        kge.a(1028243835);
    }

    public ActionModel(JSONObject jSONObject) {
        this.key = jSONObject.getString("key");
        this.type = jSONObject.getString("type");
        if (StringUtils.isEmpty(this.type)) {
            this.type = this.key;
        }
        this.mapping = jSONObject.getString("params");
        this.params = jSONObject.getJSONObject("params");
        tpc.a("com.taobao.android.detail.sdk.model.template.ActionModel");
    }

    public ActionModel(ActionModel actionModel) {
        tpc.a("com.taobao.android.detail.sdk.model.template.ActionModel");
        if (actionModel == null) {
            return;
        }
        this.key = actionModel.key;
        this.type = actionModel.type;
        this.params = JSONObject.parseObject(actionModel.mapping);
    }
}
