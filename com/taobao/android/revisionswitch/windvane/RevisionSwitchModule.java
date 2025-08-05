package com.taobao.android.revisionswitch.windvane;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.WXModule;

/* loaded from: classes6.dex */
public class RevisionSwitchModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "RevisionSwitchModule";

    @JSMethod(uiThread = false)
    public boolean getSwitchValue(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d957b4bc", new Object[]{this, str})).booleanValue() : TBRevisionSwitchManager.i().a(str);
    }

    @JSMethod(uiThread = false)
    public String getSimpleSwitchValue(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("571d53ba", new Object[]{this, str}) : TBRevisionSwitchManager.i().c(str);
    }

    @JSMethod(uiThread = false)
    public String getBucket() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4b88e19", new Object[]{this}) : TBRevisionSwitchManager.i().h();
    }
}
