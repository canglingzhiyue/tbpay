package com.taobao.android.purchase.aura.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import tb.kge;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BUY_POP_QUERY = "buyPopQuery";
    public static final String CONFIG_USE_SYSTEM_TOAST = "useSystemToast";
    public static final String GROUP_NAME = "aura_purchase";

    static {
        kge.a(1695141177);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("aura_purchase", "enableComponentsUpload", "true"));
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("aura_purchase", "enableNewErrorPopupWindow", "true"));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("aura_purchase", "enableAutoRefresh", "true"));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("aura_purchase", "enablePaySuccessAutoFinished", "true"));
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2}) : OrangeConfig.getInstance().getConfig("aura_purchase", str, str2);
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : "true".equalsIgnoreCase(a("enablePreGetCupDirectApps", "true"));
    }
}
