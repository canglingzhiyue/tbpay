package com.taobao.homepage.pop.protocol.model.section;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class BasePopItemModel extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(788045521);
    }

    /* renamed from: getBaseItemModel */
    public abstract BasePopSubItemModel mo1071getBaseItemModel(int i);

    public abstract int getItemCount();

    public BasePopItemModel(JSONObject jSONObject) {
        super(jSONObject);
    }
}
