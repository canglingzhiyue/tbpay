package com.taobao.browser.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1254207735);
    }

    public static Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str});
        }
        try {
            android.taobao.windvane.util.m.e("OrangeConfigUtils", "getConfigs main process in");
            return OrangeConfig.getInstance().getConfigs(str);
        } catch (Throwable th) {
            if (th instanceof IllegalStateException) {
                android.taobao.windvane.util.m.a("OrangeConfigUtils", "getConfig e", th, new Object[0]);
            } else {
                android.taobao.windvane.util.m.b("OrangeConfigUtils", "getConfig e", th, new Object[0]);
            }
            android.taobao.windvane.util.m.d("OrangeConfigUtils", "getConfigs:" + str + " return null");
            return null;
        }
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        try {
            return OrangeConfig.getInstance().getConfig(str, str2, str3);
        } catch (Throwable th) {
            if (th instanceof IllegalStateException) {
                android.taobao.windvane.util.m.a("OrangeConfigUtils", "getSpecificConfig e", th, new Object[0]);
            } else {
                android.taobao.windvane.util.m.b("OrangeConfigUtils", "getSpecificConfig e", th, new Object[0]);
            }
            return str3;
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : "true".equalsIgnoreCase(a("group_common_browser", i.KEY_ORANGE_CONFIG_DISMISS_ON_T1, "true"));
    }
}
