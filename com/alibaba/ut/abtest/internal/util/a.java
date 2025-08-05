package com.alibaba.ut.abtest.internal.util;

import android.text.TextUtils;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.alibaba.ut.abtest.internal.bucketing.ExperimentRoutingType;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Set;
import tb.cex;
import tb.kge;

/* loaded from: classes.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-770792088);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        return str + "##" + str2;
    }

    public static String[] a(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("ad023781", new Object[]{str});
        }
        if (TextUtils.isEmpty(str) || (split = TextUtils.split(str, "##")) == null || split.length != 2) {
            return null;
        }
        return split;
    }

    public static String a(ExperimentRoutingType experimentRoutingType, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d22207c", new Object[]{experimentRoutingType, str, str2});
        }
        if (experimentRoutingType == ExperimentRoutingType.UserId) {
            String r = cex.a().r();
            if (!TextUtils.isEmpty(r)) {
                return a(r, str, str2);
            }
            h.b("ABUtils", "userId 获取失败，请检查是否登陆！");
            return null;
        }
        String b = o.a().b();
        if (!TextUtils.isEmpty(b)) {
            return a(b, str, str2);
        }
        h.b("ABUtils", "utdid 获取失败");
        return null;
    }

    private static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        if ("motu_md5".equals(str3)) {
            return str2 + str;
        }
        return str + str2;
    }

    public static boolean a(ExperimentV5 experimentV5, Set<Long> set) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ce9734c3", new Object[]{experimentV5, set})).booleanValue() : experimentV5 != null && experimentV5.getExpPublishType() == 2 && (set == null || !set.contains(Long.valueOf(experimentV5.getReleaseId())));
    }
}
