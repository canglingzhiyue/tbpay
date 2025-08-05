package com.taobao.homepage.pop.protocol.model.section;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class BasePopSectionConfigModel extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(685418567);
    }

    public abstract String getUpdateCardSectionBizCode();

    public BasePopSectionConfigModel(JSONObject jSONObject) {
        super(jSONObject);
    }
}
