package com.taobao.infoflow.protocol.model.datamodel.card;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public abstract class BaseTemplateModel extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-832542228);
    }

    public abstract String getColumnType();

    public abstract String getName();

    public abstract String getNameV2();

    public abstract String getUrl();

    public abstract String getUrlV2();

    public abstract String getVersion();

    public abstract String getVersionV2();

    public BaseTemplateModel(JSONObject jSONObject) {
        super(jSONObject);
    }
}
