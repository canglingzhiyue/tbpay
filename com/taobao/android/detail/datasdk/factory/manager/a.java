package com.taobao.android.detail.datasdk.factory.manager;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.trade.event.Event;
import java.util.Map;
import tb.eon;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class a extends AbsFactoryManager<eon> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1936988220);
    }

    public Event a(ActionModel actionModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar, JSONObject jSONObject, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Event) ipChange.ipc$dispatch("e14b476", new Object[]{this, actionModel, bVar, jSONObject, map});
        }
        return null;
    }
}
