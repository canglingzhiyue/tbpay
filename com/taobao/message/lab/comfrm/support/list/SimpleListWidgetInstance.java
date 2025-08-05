package com.taobao.message.lab.comfrm.support.list;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class SimpleListWidgetInstance extends AbsListWidgetInstance {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1379136664);
    }

    @Override // com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance
    public boolean enableSection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70b40b6d", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance
    public boolean isEmpty(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2184aeea", new Object[]{this, jSONObject})).booleanValue() : getViewAdapterCount("content") == 0;
    }
}
