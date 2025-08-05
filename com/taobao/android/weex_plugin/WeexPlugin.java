package com.taobao.android.weex_plugin;

import com.alibaba.flexa.compat.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.l;
import com.taobao.android.weex_plugin.component.VideoPlatformView;
import com.taobao.android.weex_plugin.component.WebViewPlatformView;
import com.taobao.tao.recommend4.manager.weex2.RecommendWeex2ContainerView;
import tb.jwm;
import tb.jwn;
import tb.jwo;
import tb.rts;

/* loaded from: classes6.dex */
public class WeexPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile Double sProcessStartUpTimestamp;

    public static void setup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cce3884", new Object[0]);
            return;
        }
        MUSEngine.registerPlatformView("video", VideoPlatformView.class);
        MUSEngine.registerPlatformView("web", WebViewPlatformView.class);
        MUSEngine.registerPlatformView("rc-recomment-container", RecommendWeex2ContainerView.class);
        l.a().a(jwm.b());
        l.a().a(jwn.a());
        try {
            c.a("com.taobao.android.order.bundle.weex2.view.AMapPlatformView", new c.a() { // from class: com.taobao.android.weex_plugin.WeexPlugin.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.flexa.compat.c.a
                public void onClassNotFound() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ad9dd2ef", new Object[]{this});
                    }
                }

                @Override // com.alibaba.flexa.compat.c.a
                public void onClassLoaded(Class<?> cls) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5ad6f018", new Object[]{this, cls});
                        return;
                    }
                    try {
                        MUSEngine.registerPlatformView("order-amap", cls);
                    } catch (Exception unused) {
                    }
                }
            });
        } catch (Exception unused) {
        }
        rts.a().a(new jwo());
    }

    public static void setProcessStartUpTimestamp(Double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1432b17", new Object[]{d});
        } else {
            sProcessStartUpTimestamp = d;
        }
    }

    public static Double getProcessStartUpTimestamp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Double) ipChange.ipc$dispatch("a9dd7b27", new Object[0]) : sProcessStartUpTimestamp;
    }
}
