package com.taobao.android.fluid.framework.preload.launcher;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.datamodel.DelayConfig;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import tb.kge;
import tb.soq;
import tb.spz;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-306997394);
    }

    public static DelayConfig a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (DelayConfig) ipChange.ipc$dispatch("fee3272", new Object[]{fluidContext});
        }
        try {
            if (!soq.d()) {
                return null;
            }
            boolean a2 = soq.a();
            if (((IUsePreloadService) fluidContext.getService(IUsePreloadService.class)).enableTab3UseCacheData() && a2) {
                z = true;
            }
            spz.c("PickPreloadController_LauncherOptHelper", "weexDelay，initDelayConfig,hitVideoOpt:" + a2 + "，defaultTab3CanDelay：" + z);
            if (z) {
                return new DelayConfig();
            }
            return null;
        } catch (Throwable th) {
            spz.a("PickPreloadController_LauncherOptHelper", "", th);
            return null;
        }
    }
}
