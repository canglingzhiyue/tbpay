package com.taobao.homepage.pop.model.section;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.section.BasePopItemModel;

/* loaded from: classes7.dex */
public class PopItemModel extends BasePopItemModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public PopItemModel(JSONObject jSONObject) {
        super(jSONObject);
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopItemModel
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : size();
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopItemModel
    /* renamed from: getBaseItemModel */
    public PopSubItemModel mo1071getBaseItemModel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopSubItemModel) ipChange.ipc$dispatch("f37c6e33", new Object[]{this, new Integer(i)});
        }
        JSONObject jSONObject = getJSONObject(String.valueOf(i));
        if (jSONObject != null) {
            return new PopSubItemModel(jSONObject);
        }
        return null;
    }
}
