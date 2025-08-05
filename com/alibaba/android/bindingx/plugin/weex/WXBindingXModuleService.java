package com.alibaba.android.bindingx.plugin.weex;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.ui.IExternalModuleGetter;

/* loaded from: classes2.dex */
public class WXBindingXModuleService extends Service implements IExternalModuleGetter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }

    @Override // com.taobao.weex.ui.IExternalModuleGetter
    public Class<? extends WXModule> getExternalModuleClass(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("f9116d39", new Object[]{this, str, context});
        }
        if (com.alibaba.android.bindingx.core.c.APM_POINT.equals(str) || "binding".equals(str)) {
            return WXBindingXModule.class;
        }
        if (!"expressionBinding".equals(str)) {
            return null;
        }
        return WXExpressionBindingModule.class;
    }
}
