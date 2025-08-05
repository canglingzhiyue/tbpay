package com.taobao.homepage.pop.model.section;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.section.BasePopUtModel;

/* loaded from: classes7.dex */
public class PopUtModel extends BasePopUtModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public PopUtModel(JSONObject jSONObject) {
        super(jSONObject);
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopUtModel
    public String getArg1() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("715cfa88", new Object[]{this}) : getString("arg1");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopUtModel
    public JSONObject getArgs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("7c869f7a", new Object[]{this}) : getJSONObject("args");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopUtModel
    public String getEventId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dd90ef3a", new Object[]{this}) : getString("eventId");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopUtModel
    public String getPage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c740e914", new Object[]{this}) : getString("page");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopUtModel
    public String getItemId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this}) : getString("itemId");
    }
}
