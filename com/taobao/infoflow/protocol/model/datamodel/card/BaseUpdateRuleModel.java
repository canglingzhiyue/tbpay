package com.taobao.infoflow.protocol.model.datamodel.card;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class BaseUpdateRuleModel extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1960491359);
    }

    public abstract String getUpdatePosition();

    public abstract String getUpdateTarget();

    public abstract String getUpdateType();

    public BaseUpdateRuleModel(JSONObject jSONObject) {
        super(jSONObject);
    }
}
