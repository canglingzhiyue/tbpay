package com.taobao.homepage.pop.model.section;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.section.BasePopSubItemModel;
import com.taobao.tao.infoflow.multitab.e;

/* loaded from: classes7.dex */
public class PopSubItemModel extends BasePopSubItemModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public PopSubItemModel(JSONObject jSONObject) {
        super(jSONObject);
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSubItemModel
    public String getItemBizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cb53d582", new Object[]{this}) : getString("itemBizCode");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSubItemModel
    public JSONObject getContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("14011e6a", new Object[]{this}) : getJSONObject("content");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSubItemModel
    public JSONObject getSmartContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("a653bd8d", new Object[]{this}) : getJSONObject(e.KEY_SMART_CONTENT);
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSubItemModel
    public String getTargetUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d1e2c891", new Object[]{this}) : getString("targetUrl");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSubItemModel
    /* renamed from: getClickParam */
    public PopUtModel mo1078getClickParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopUtModel) ipChange.ipc$dispatch("ed9f726e", new Object[]{this}) : new PopUtModel(getJSONObject("clickParam"));
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSubItemModel
    public JSONObject getExt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("a08ab512", new Object[]{this}) : getJSONObject("ext");
    }
}
