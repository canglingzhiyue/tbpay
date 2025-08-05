package com.taobao.android.detail.core.event.popup;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import java.util.Map;
import tb.emu;
import tb.enn;
import tb.kge;

/* loaded from: classes4.dex */
public class a extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-90906567);
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public a(ActionModel actionModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar, JSONObject jSONObject, Map<String, Object> map) {
        emu.a("com.taobao.android.detail.core.event.popup.ClosePopupWindowEvent");
    }
}
