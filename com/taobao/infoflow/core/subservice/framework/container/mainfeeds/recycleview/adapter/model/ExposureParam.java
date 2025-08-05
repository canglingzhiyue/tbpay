package com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseUtModel;
import tb.kge;

/* loaded from: classes7.dex */
public class ExposureParam extends BaseUtModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1190239181);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseUtModel
    public String getArg1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("715cfa88", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseUtModel
    public JSONObject getArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7c869f7a", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseUtModel
    public String getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd90ef3a", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseUtModel
    public String getItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseUtModel
    public String getPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c740e914", new Object[]{this});
        }
        return null;
    }

    public ExposureParam(JSONObject jSONObject) {
        super(jSONObject);
    }
}
