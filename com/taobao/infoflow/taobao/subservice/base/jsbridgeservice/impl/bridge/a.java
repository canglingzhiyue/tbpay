package com.taobao.infoflow.taobao.subservice.base.jsbridgeservice.impl.bridge;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import com.taobao.infoflow.taobao.subservice.base.jsbridgeservice.impl.bridge.model.JsActionModel;
import tb.kge;
import tb.ldf;
import tb.lkn;

/* loaded from: classes.dex */
public class a implements lkn.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(678782720);
        kge.a(744386039);
    }

    @Override // tb.lkn.a
    public boolean a(lkn.b bVar, IJsBridgeService.a.InterfaceC0670a interfaceC0670a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29ccb10b", new Object[]{this, bVar, interfaceC0670a})).booleanValue();
        }
        JsActionModel jsActionModel = new JsActionModel();
        jsActionModel.setContainer(bVar.a());
        jsActionModel.setAction(bVar.b());
        jsActionModel.setParam(bVar.c());
        if (!jsActionModel.isValid()) {
            ldf.d("InfoFlowBridgeApiPlugin", "jsActionModel is null。 不符合协议约定，见类注释");
            interfaceC0670a.a("不符合协议约定，请和信息流同学确认协议");
            return false;
        }
        return b.a(jsActionModel, interfaceC0670a);
    }
}
