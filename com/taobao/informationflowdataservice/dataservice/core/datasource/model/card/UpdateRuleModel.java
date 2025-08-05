package com.taobao.informationflowdataservice.dataservice.core.datasource.model.card;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.model.StWindow;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseUpdateRuleModel;
import tb.kge;

/* loaded from: classes7.dex */
public class UpdateRuleModel extends BaseUpdateRuleModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1574487540);
    }

    public UpdateRuleModel(JSONObject jSONObject) {
        super(jSONObject);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseUpdateRuleModel
    public String getUpdateType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2d0b100", new Object[]{this}) : getString(StWindow.UPDATE_TYPE);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseUpdateRuleModel
    public String getUpdateTarget() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("45a63ec9", new Object[]{this}) : getString("updateTarget");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseUpdateRuleModel
    public String getUpdatePosition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c20f19f1", new Object[]{this}) : getString("updatePosition");
    }
}
