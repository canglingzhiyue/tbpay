package com.taobao.global.setting.util;

import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : a("AB_", "202305152248_3089", str, false);
    }

    public static boolean a(String str, String str2, String str3, boolean z) {
        Variation variation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0bfeb52", new Object[]{str, str2, str3, new Boolean(z)})).booleanValue();
        }
        VariationSet activate = UTABTest.activate(str, str2);
        return (activate == null || (variation = activate.getVariation(str3)) == null) ? z : variation.getValueAsBoolean(z);
    }
}
