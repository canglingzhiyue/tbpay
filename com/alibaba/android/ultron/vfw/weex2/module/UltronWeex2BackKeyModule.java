package com.alibaba.android.ultron.vfw.weex2.module;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.UltronTradeHybridActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.cts;
import tb.kge;

/* loaded from: classes2.dex */
public class UltronWeex2BackKeyModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "UltronWeex2BackKeyModule";

    static {
        kge.a(-52797302);
    }

    public UltronWeex2BackKeyModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod(uiThread = true)
    public void onBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2372e0ed", new Object[]{this});
            return;
        }
        p ultronWeex2BackKeyModule = getInstance();
        if (ultronWeex2BackKeyModule == null) {
            UnifyLog.d("UltronWeex2BackKeyModule.onBack", "instance is null");
            return;
        }
        Context uIContext = ultronWeex2BackKeyModule.getUIContext();
        if (!(uIContext instanceof FragmentActivity)) {
            UnifyLog.d("UltronWeex2BackKeyModule.onBack", "context is not a FragmentActivity");
            return;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) uIContext;
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        boolean z = fragmentActivity instanceof UltronTradeHybridActivity;
        if (z && ((UltronTradeHybridActivity) fragmentActivity).c() && supportFragmentManager.getBackStackEntryCount() > 0) {
            supportFragmentManager.popBackStack();
            return;
        }
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(UltronWeex2DialogFragment.FRAGMENT_TAG);
        if (!(findFragmentByTag instanceof UltronWeex2DialogFragment)) {
            UnifyLog.a("UltronWeex2BackKeyModule.onBack", "fragment is not a UltronWeex2DialogFragment");
            fragmentActivity.finish();
            return;
        }
        UltronWeex2DialogFragment ultronWeex2DialogFragment = (UltronWeex2DialogFragment) findFragmentByTag;
        if (!ultronWeex2DialogFragment.hasFragmentDisplay()) {
            UnifyLog.a("UltronWeex2BackKeyModule.onBack", "fragment is not display");
            fragmentActivity.finish();
        } else if (z && !((UltronTradeHybridActivity) fragmentActivity).c() && a.a(ultronWeex2DialogFragment.getWeex2Url(), cts.a.PRE_RENDER_URL_ORDER_DETAIL)) {
            UnifyLog.a("UltronWeex2BackKeyModule.onBack", "orderDetail should finish UltronTradeHybridActivity");
            fragmentActivity.finish();
        } else {
            ultronWeex2DialogFragment.dismiss();
        }
    }
}
