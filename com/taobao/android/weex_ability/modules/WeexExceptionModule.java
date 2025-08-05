package com.taobao.android.weex_ability.modules;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.common.expection.WXExceptionConfig;
import com.taobao.android.weex_framework.l;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.kge;

/* loaded from: classes6.dex */
public class WeexExceptionModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "exception";

    static {
        kge.a(-280410654);
    }

    public WeexExceptionModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod(uiThread = true)
    public void reportInnerInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2563cfe1", new Object[]{this, str});
        } else if (l.a().i() == null || getInstance() == null || getInstance().isDestroyed()) {
        } else {
            l.a().i().a(10033, WXExceptionConfig.KEY_BIZ, "000", str, getInstance().getInstanceId());
        }
    }

    @MUSMethod(uiThread = true)
    public void enableReportWhiteScreen(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("784e690f", new Object[]{this, new Boolean(z)});
        } else if (getInstance() == null || getInstance().isDestroyed()) {
        } else {
            ((MUSDKInstance) getInstance()).setIgnoreWhiteScreenReport(!z);
        }
    }
}
