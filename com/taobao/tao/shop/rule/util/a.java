package com.taobao.tao.shop.rule.util;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(201761175);
    }

    public static boolean a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dbad4dc", new Object[]{str, str2, new Boolean(z)})).booleanValue();
        }
        String a2 = a(str, str2, (String) null);
        return !StringUtils.isEmpty(a2) ? Boolean.valueOf(a2).booleanValue() : z;
    }

    public static String a(String str, String str2, String str3) {
        OrangeConfig orangeConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2) && (orangeConfig = OrangeConfig.getInstance()) != null) {
            return orangeConfig.getConfig(str, str2, null);
        }
        return null;
    }
}
