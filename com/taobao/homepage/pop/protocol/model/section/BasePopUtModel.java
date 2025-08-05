package com.taobao.homepage.pop.protocol.model.section;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class BasePopUtModel extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1457841541);
    }

    public abstract String getArg1();

    public abstract JSONObject getArgs();

    public abstract String getEventId();

    public abstract String getItemId();

    public abstract String getPage();

    public BasePopUtModel(JSONObject jSONObject) {
        super(jSONObject);
    }
}
