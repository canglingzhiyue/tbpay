package com.taobao.homepage.pop.protocol.model.section;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class BasePopUpdateRuleModel extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1484661377);
    }

    public abstract String getUpdatePosition();

    public abstract String getUpdateTarget();

    public abstract String getUpdateType();

    public BasePopUpdateRuleModel(JSONObject jSONObject) {
        super(jSONObject);
    }
}
