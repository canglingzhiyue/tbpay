package com.taobao.homepage.pop.protocol.model.section;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class BasePopTemplateModel extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1810816950);
    }

    public abstract String getColumnType();

    public abstract String getName();

    public abstract String getNameV2();

    public abstract String getUrl();

    public abstract String getUrlV2();

    public abstract String getVersion();

    public abstract String getVersionV2();

    public BasePopTemplateModel(JSONObject jSONObject) {
        super(jSONObject);
    }
}
