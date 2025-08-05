package com.alibaba.android.bindingx.plugin.weex;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;

/* loaded from: classes2.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a() throws WXException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (com.alibaba.android.bindingx.core.c.a()) {
            Log.e(com.alibaba.android.bindingx.core.c.APM_POINT, "bindingx plugin is disabled by orange...");
        } else {
            WXSDKEngine.registerModule("expressionBinding", WXExpressionBindingModule.class);
            WXSDKEngine.registerModule("binding", WXBindingXModule.class);
            WXSDKEngine.registerModule(com.alibaba.android.bindingx.core.c.APM_POINT, WXBindingXModule.class);
        }
    }
}
