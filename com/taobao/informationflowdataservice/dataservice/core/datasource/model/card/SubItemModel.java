package com.taobao.informationflowdataservice.dataservice.core.datasource.model.card;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.tao.infoflow.multitab.e;
import tb.kge;

/* loaded from: classes7.dex */
public class SubItemModel extends BaseSubItemModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(725393478);
    }

    public SubItemModel(JSONObject jSONObject) {
        super(jSONObject);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel
    public String getItemBizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cb53d582", new Object[]{this}) : getString("itemBizCode");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel
    public JSONObject getContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("14011e6a", new Object[]{this}) : getJSONObject("content");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel
    public JSONObject getSmartContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("a653bd8d", new Object[]{this}) : getJSONObject(e.KEY_SMART_CONTENT);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel
    public String getTargetUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d1e2c891", new Object[]{this}) : getString("targetUrl");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel
    /* renamed from: getClickParam  reason: collision with other method in class */
    public UtModel mo1100getClickParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UtModel) ipChange.ipc$dispatch("9046d4a9", new Object[]{this});
        }
        JSONObject jSONObject = getJSONObject("clickParam");
        if (jSONObject == null) {
            return new UtModel(new JSONObject());
        }
        return new UtModel(jSONObject);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel
    public JSONObject getExt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("a08ab512", new Object[]{this}) : getJSONObject("ext");
    }
}
