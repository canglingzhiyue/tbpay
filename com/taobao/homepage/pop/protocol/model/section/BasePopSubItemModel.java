package com.taobao.homepage.pop.protocol.model.section;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class BasePopSubItemModel extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(300854427);
    }

    /* renamed from: getClickParam */
    public abstract BasePopUtModel mo1078getClickParam();

    public abstract JSONObject getContent();

    public abstract JSONObject getExt();

    public abstract String getItemBizCode();

    public abstract JSONObject getSmartContent();

    public abstract String getTargetUrl();

    public BasePopSubItemModel(JSONObject jSONObject) {
        super(jSONObject);
    }
}
