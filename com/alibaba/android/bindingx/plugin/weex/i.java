package com.alibaba.android.bindingx.plugin.weex;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.ui.component.WXComponent;

/* loaded from: classes2.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static View a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b8543ebe", new Object[]{str, str2});
        }
        WXComponent b = b(str, str2);
        if (b != null) {
            return b.mo1286getHostView();
        }
        return null;
    }

    public static WXComponent b(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXComponent) ipChange.ipc$dispatch("22f2199e", new Object[]{str, str2}) : WXSDKManager.getInstance().getWXRenderManager().getWXComponent(str, str2);
    }
}
