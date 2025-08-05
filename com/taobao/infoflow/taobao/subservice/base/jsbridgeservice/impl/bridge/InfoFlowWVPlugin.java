package com.taobao.infoflow.taobao.subservice.base.jsbridgeservice.impl.bridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.taobao.subservice.base.jsbridgeservice.impl.bridge.model.JsActionModel;
import tb.kge;
import tb.ldf;

/* loaded from: classes7.dex */
public class InfoFlowWVPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "InfoFlowWVPlugin";

    static {
        kge.a(-150114378);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        JsActionModel a2 = com.taobao.infoflow.taobao.subservice.base.jsbridgeservice.impl.bridge.model.a.a(str, str2);
        if (a2 == null || !a2.isValid()) {
            ldf.d("InfoFlowWVPlugin", "jsActionModel is null。 不符合协议约定，见类注释");
            wVCallBackContext.error("不符合协议约定，请和客户端同学确认协议");
            return false;
        }
        return b.a(a2, new com.taobao.infoflow.taobao.subservice.base.jsbridgeservice.impl.bridge.model.b(wVCallBackContext));
    }
}
