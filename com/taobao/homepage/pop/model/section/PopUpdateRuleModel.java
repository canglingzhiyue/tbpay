package com.taobao.homepage.pop.model.section;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.model.StWindow;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.section.BasePopUpdateRuleModel;

/* loaded from: classes7.dex */
public class PopUpdateRuleModel extends BasePopUpdateRuleModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public PopUpdateRuleModel(JSONObject jSONObject) {
        super(jSONObject);
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopUpdateRuleModel
    public String getUpdateType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2d0b100", new Object[]{this}) : getString(StWindow.UPDATE_TYPE);
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopUpdateRuleModel
    public String getUpdateTarget() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("45a63ec9", new Object[]{this}) : getString("updateTarget");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopUpdateRuleModel
    public String getUpdatePosition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c20f19f1", new Object[]{this}) : getString("updatePosition");
    }
}
