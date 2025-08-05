package com.taobao.android.weex_ability;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.bridge.b;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.kge;

/* loaded from: classes6.dex */
public class AliMUShareModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "share";

    static {
        kge.a(-284272011);
    }

    public AliMUShareModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod(uiThread = true)
    public void doShare(String str, b bVar) {
        f d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9213823c", new Object[]{this, str, bVar});
        } else if (getInstance().isDestroyed() || (d = j.a().d()) == null) {
        } else {
            d.a(getInstance().getUIContext(), str, bVar);
        }
    }
}
