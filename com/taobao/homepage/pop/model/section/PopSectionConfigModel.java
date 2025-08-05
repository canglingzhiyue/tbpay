package com.taobao.homepage.pop.model.section;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.section.BasePopSectionConfigModel;

/* loaded from: classes7.dex */
public class PopSectionConfigModel extends BasePopSectionConfigModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String updateCardSectionBizCode;

    public PopSectionConfigModel(JSONObject jSONObject) {
        super(jSONObject);
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSectionConfigModel
    public String getUpdateCardSectionBizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("eb3554ef", new Object[]{this}) : getString("updateCardSectionBizCode");
    }
}
