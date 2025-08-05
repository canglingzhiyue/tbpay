package com.taobao.android.shop.application;

import com.alibaba.android.umbrella.weex.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.c;
import com.taobao.android.shop.utils.ShopStat;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import tb.kge;

/* loaded from: classes6.dex */
public class ShopApplication {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f15098a;

    static {
        kge.a(1246271701);
        f15098a = false;
    }

    public static synchronized void a() {
        synchronized (ShopApplication.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
            } else if (f15098a) {
            } else {
                f15098a = true;
                bundleStaticDependency();
                initAppMonitor();
                new ShopLauncher().prepareJS(false);
                a.a(Globals.getApplication());
            }
        }
    }

    private static void bundleStaticDependency() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30f88c02", new Object[0]);
            return;
        }
        c.a("com.taobao.weappplus", null);
        c.a("com.taobao.search", null);
        if (!"true".equals(OrangeConfig.getInstance().getConfig("shop_router", "shop_bundle_static_dependency", "false"))) {
            return;
        }
        c.a("com.taobao.weapp", null);
        c.a("com.taobao.avplayer", null);
        c.a("com.taobao.relationship", null);
        c.a("com.taobao.trade.rate", null);
        c.a("com.taobao.android.capsule", null);
    }

    private static void initAppMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ec5930", new Object[0]);
        } else {
            ShopStat.INSTANCE.init();
        }
    }
}
