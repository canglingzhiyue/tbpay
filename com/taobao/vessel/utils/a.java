package com.taobao.vessel.utils;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import tb.kge;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1865044300);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("cart_switch", "vlview_fireViewAppearDisappear", "true"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : StringUtils.equals("true", OrangeConfig.getInstance().getConfig("android_detail", "enable_hybrid_webView", "true"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("android_vessel", "destroyVesselProxyViewBeforeCreate", "true"));
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("android_vessel", "callDestroyInsteadCoreDestroy", "true"));
    }
}
