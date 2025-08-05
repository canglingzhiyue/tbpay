package com.alibaba.android.ultron.vfw.weex2.module;

import com.alibaba.android.ultron.vfw.weex2.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.kge;

/* loaded from: classes2.dex */
public class UltronWeex2BizLifecycleModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "tradeBizLifecycle";

    static {
        kge.a(-218602339);
    }

    public UltronWeex2BizLifecycleModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod(uiThread = true)
    public void onBizReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a730856", new Object[]{this});
            return;
        }
        p ultronWeex2BizLifecycleModule = getInstance();
        if (ultronWeex2BizLifecycleModule == null) {
            UnifyLog.d("UltronWeex2BizLifecycleModule.onBizReady", "instance is null");
            return;
        }
        Object tag = ultronWeex2BizLifecycleModule.getTag("bizLifecycleListener");
        if (!(tag instanceof c)) {
            UnifyLog.d("UltronWeex2BizLifecycleModule.onBizReady", "listener is not a UltronWeex2BizLifecycleListener");
        } else {
            ((c) tag).onBizReady();
        }
    }

    @MUSMethod(uiThread = true)
    public void onBizFailed(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1435fd2c", new Object[]{this, str, str2});
            return;
        }
        p ultronWeex2BizLifecycleModule = getInstance();
        if (ultronWeex2BizLifecycleModule == null) {
            UnifyLog.d("UltronWeex2BizLifecycleModule.onBizFailed", "instance is null");
            return;
        }
        Object tag = ultronWeex2BizLifecycleModule.getTag("bizLifecycleListener");
        if (!(tag instanceof c)) {
            UnifyLog.d("UltronWeex2BizLifecycleModule.onBizFailed", "listener is not a UltronWeex2BizLifecycleListener");
        } else {
            ((c) tag).onBizFailed(str, str2);
        }
    }
}
