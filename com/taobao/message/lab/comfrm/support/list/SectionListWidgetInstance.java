package com.taobao.message.lab.comfrm.support.list;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ValueUtil;
import tb.kge;

/* loaded from: classes7.dex */
public class SectionListWidgetInstance extends AbsListWidgetInstance {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-868130819);
    }

    @Override // com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance
    public boolean enableSection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70b40b6d", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance
    public boolean isEmpty(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2184aeea", new Object[]{this, jSONObject})).booleanValue() : jSONObject != null && ValueUtil.getInteger(jSONObject, "status", 0) == 2;
    }
}
