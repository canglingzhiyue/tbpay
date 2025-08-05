package com.taobao.tao.homepage.launcher;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.orange.OrangeConfig;
import com.taobao.oversea.baobao.TMGBaobaoBridge;
import com.taobao.tao.recommend2.view.widget.weex.NestedScrollViewWXContainer;
import com.taobao.tao.recommend4.manager.weex.RecommendWeexContainerView;
import com.taobao.tao.recommend4.manager.weex2.RecommendWeex2ContainerView;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;
import java.util.HashMap;
import tb.kge;
import tb.ksp;
import tb.kss;
import tb.kyt;
import tb.las;
import tb.lau;
import tb.ooa;

/* loaded from: classes8.dex */
public class f extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean b;
    private static boolean c;

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        if (str.hashCode() == -193894180) {
            super.a((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(81852257);
        b = false;
        c = false;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : c;
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            c = z;
        }
    }

    @Override // com.taobao.tao.homepage.launcher.b
    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        this.f20600a.a("HomeIdleLauncher", 4);
        this.f20600a.d("homeIdle");
        super.a(application, hashMap);
        las.g();
        b = true;
        OrangeConfig.getInstance().getConfigs("homepage_switch");
        OrangeConfig.getInstance().registerListener(new String[]{"homepage_switch"}, new com.taobao.tao.homepage.h(), true);
        try {
            com.taobao.application.common.d a2 = com.taobao.application.common.c.a();
            if (a2 != null) {
                int a3 = a2.a("deviceLevel", -1);
                g.a(a3 == 2 ? "l" : a3 == 1 ? "m" : "h");
            }
        } catch (Throwable th) {
            com.taobao.android.home.component.utils.e.a("HomeIdleLauncher", "get deviceLevel error", th);
        }
        if (!c) {
            try {
                WXSDKEngine.registerComponent("MC-ContainerView", NestedScrollViewWXContainer.class);
                WXSDKEngine.registerComponent("RC-RecommendContainer", RecommendWeexContainerView.class);
                MUSEngine.registerPlatformView("rc-recomment-container", RecommendWeex2ContainerView.class);
                c = true;
            } catch (WXException e) {
                ooa.a("Weex exception:", e);
            }
        }
        kyt.b();
        lau.a().b();
        ksp.c("HomeIdleLauncher", "闲时校验加载订阅bundle");
        com.taobao.tao.topmultitab.c.a().M();
        com.taobao.tao.topmultitab.e.a();
        try {
            android.taobao.windvane.jsbridge.q.a("TMGBaobaoBridge", (Class<? extends android.taobao.windvane.jsbridge.e>) TMGBaobaoBridge.class);
            kss.a("Page_Home", 2201, "Page_Home_OvsbaobaoInit", "");
        } catch (Throwable th2) {
            com.taobao.android.home.component.utils.e.a("HomeIdleLauncher", "register ovs Plugin error", th2);
        }
        this.f20600a.b("HomeIdleLauncher");
    }
}
