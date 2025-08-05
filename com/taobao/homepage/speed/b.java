package com.taobao.homepage.speed;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.tao.homepage.launcher.f;
import com.taobao.tao.recommend2.view.widget.weex.NestedScrollViewWXContainer;
import com.taobao.tao.recommend4.manager.weex.RecommendWeexContainerView;
import com.taobao.tao.recommend4.manager.weex2.RecommendWeex2ContainerView;
import com.taobao.weex.WXSDKEngine;
import tb.kge;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(217849045);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            if (f.a()) {
                return;
            }
            WXSDKEngine.registerComponent("MC-ContainerView", NestedScrollViewWXContainer.class);
            WXSDKEngine.registerComponent("RC-RecommendContainer", RecommendWeexContainerView.class);
            f.a(true);
            MUSEngine.registerPlatformView("rc-recomment-container", RecommendWeex2ContainerView.class);
        } catch (Throwable unused) {
        }
    }
}
