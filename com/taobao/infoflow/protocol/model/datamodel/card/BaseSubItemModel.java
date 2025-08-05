package com.taobao.infoflow.protocol.model.datamodel.card;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class BaseSubItemModel extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1302243001);
    }

    /* renamed from: getClickParam */
    public abstract BaseUtModel mo1100getClickParam();

    public abstract JSONObject getContent();

    public abstract JSONObject getExt();

    public abstract String getItemBizCode();

    public abstract JSONObject getSmartContent();

    public abstract String getTargetUrl();

    public BaseSubItemModel(JSONObject jSONObject) {
        super(jSONObject);
    }
}
