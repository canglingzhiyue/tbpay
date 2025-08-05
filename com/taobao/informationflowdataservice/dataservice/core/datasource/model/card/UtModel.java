package com.taobao.informationflowdataservice.dataservice.core.datasource.model.card;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseUtModel;
import tb.kge;

/* loaded from: classes7.dex */
public class UtModel extends BaseUtModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(527569658);
    }

    public UtModel(JSONObject jSONObject) {
        super(jSONObject);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseUtModel
    public String getArg1() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("715cfa88", new Object[]{this}) : getString("arg1");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseUtModel
    public JSONObject getArgs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("7c869f7a", new Object[]{this}) : getJSONObject("args");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseUtModel
    public String getEventId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dd90ef3a", new Object[]{this}) : getString("eventId");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseUtModel
    public String getPage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c740e914", new Object[]{this}) : getString("page");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseUtModel
    public String getItemId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this}) : getString("itemId");
    }
}
