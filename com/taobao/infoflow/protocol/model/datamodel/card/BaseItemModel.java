package com.taobao.infoflow.protocol.model.datamodel.card;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class BaseItemModel extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-954070669);
    }

    /* renamed from: getBaseItemModel */
    public abstract BaseSubItemModel mo1094getBaseItemModel(int i);

    public abstract int getItemCount();

    public BaseItemModel(JSONObject jSONObject) {
        super(jSONObject);
    }
}
