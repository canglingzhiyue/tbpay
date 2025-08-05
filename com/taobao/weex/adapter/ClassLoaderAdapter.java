package com.taobao.weex.adapter;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.ui.component.WXComponent;
import tb.kge;

/* loaded from: classes9.dex */
public class ClassLoaderAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1381858879);
    }

    public Class<? extends WXModule> getModuleClass(String str, String str2, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("e640aa44", new Object[]{this, str, str2, context});
        }
        try {
            return context.getClassLoader().loadClass(str2);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Class<? extends WXComponent> getComponentClass(String str, String str2, WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("a4de488f", new Object[]{this, str, str2, wXSDKInstance});
        }
        try {
            return wXSDKInstance.O().getClassLoader().loadClass(str2);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
