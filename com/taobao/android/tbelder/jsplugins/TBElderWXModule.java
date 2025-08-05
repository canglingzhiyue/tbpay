package com.taobao.android.tbelder.jsplugins;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbelder.b;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.WXModule;

/* loaded from: classes6.dex */
public class TBElderWXModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "TBElder";

    @JSMethod(uiThread = false)
    public boolean isElderHome() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5178e50a", new Object[]{this})).booleanValue() : b.b();
    }

    @JSMethod(uiThread = false)
    public boolean isElderFont() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("843ec47a", new Object[]{this})).booleanValue() : b.c();
    }
}
