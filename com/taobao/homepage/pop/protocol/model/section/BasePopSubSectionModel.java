package com.taobao.homepage.pop.protocol.model.section;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class BasePopSubSectionModel extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-218072993);
    }

    public abstract BasePopSectionModel getGuide();

    /* renamed from: getOverlay */
    public abstract BasePopSectionModel mo1079getOverlay();

    public BasePopSubSectionModel(JSONObject jSONObject) {
        super(jSONObject);
    }
}
