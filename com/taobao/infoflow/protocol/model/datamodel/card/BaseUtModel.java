package com.taobao.infoflow.protocol.model.datamodel.card;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class BaseUtModel extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(709660839);
    }

    public abstract String getArg1();

    public abstract JSONObject getArgs();

    public abstract String getEventId();

    public abstract String getItemId();

    public abstract String getPage();

    public BaseUtModel(JSONObject jSONObject) {
        super(jSONObject);
    }
}
