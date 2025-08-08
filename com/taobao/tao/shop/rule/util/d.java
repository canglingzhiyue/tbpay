package com.taobao.tao.shop.rule.util;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.rule.data.TBBundleUrlRuleInfo;
import tb.kge;

/* loaded from: classes8.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-368646719);
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (!StringUtils.isEmpty(str2) && !StringUtils.isEmpty(str)) {
            String[] split = str2.trim().split("\\.");
            TBBundleUrlRuleInfo a2 = com.taobao.tao.shop.rule.b.a(str);
            if (a2 == null) {
                return false;
            }
            try {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                if (a2.mFirstBitVersion != parseInt) {
                    return false;
                }
                return a2.mSecBitVersion <= parseInt2;
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    public static boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{str, str2})).booleanValue();
        }
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            String[] split = str.trim().split("\\.");
            String[] split2 = str2.trim().split("\\.");
            if (split.length != 2 && split2.length != 2) {
                return false;
            }
            try {
                return Integer.parseInt(split[0]) == Integer.parseInt(split2[0]) && Integer.parseInt(split[1]) < Integer.parseInt(split2[1]);
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }
}
