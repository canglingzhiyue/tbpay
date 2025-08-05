package com.taobao.avplayer.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.component.weex.WXInteractiveComponent;
import com.taobao.avplayer.component.weex.WXSplayerModule;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.ui.IExternalComponentGetter;
import com.taobao.weex.ui.IExternalModuleGetter;
import com.taobao.weex.ui.component.WXComponent;
import tb.kge;

/* loaded from: classes6.dex */
public class DWWXComponentService extends Service implements IExternalComponentGetter, IExternalModuleGetter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1368923476);
        kge.a(827327188);
        kge.a(470773675);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }

    @Override // com.taobao.weex.ui.IExternalComponentGetter
    public Class<? extends WXComponent> getExternalComponentClass(String str, WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("464bab4e", new Object[]{this, str, wXSDKInstance});
        }
        if (!"videoplus".equals(str)) {
            return null;
        }
        return WXInteractiveComponent.class;
    }

    @Override // com.taobao.weex.ui.IExternalModuleGetter
    public Class<? extends WXModule> getExternalModuleClass(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("f9116d39", new Object[]{this, str, context});
        }
        if (!"SplayerModule".equals(str)) {
            return null;
        }
        return WXSplayerModule.class;
    }
}
