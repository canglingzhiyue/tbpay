package com.alibaba.aliweex.utils;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.aliweex.d;
import com.alibaba.aliweex.e;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.utils.TBWXConfigManger;
import tb.kge;

/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1237543916);
    }

    public static e a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("87f893a5", new Object[0]) : d.a().l();
    }

    public static Boolean a(String str, String str2, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("c2b2f78e", new Object[]{str, str2, bool});
        }
        e a2 = a();
        if (a2 == null) {
            return bool;
        }
        try {
            return Boolean.valueOf(Boolean.parseBoolean(a2.getConfig(str, str2, String.valueOf(bool))));
        } catch (Throwable unused) {
            return bool;
        }
    }

    public static Boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("a5abcd26", new Object[0]) : a(TBWXConfigManger.WX_COMMON_CONFIG, "enableFoldAdapterFix", true);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        boolean booleanValue = a(TBWXConfigManger.WX_COMMON_CONFIG, "waitInitDefaultValue", false).booleanValue();
        return StringUtils.isEmpty(str) ? booleanValue : Uri.parse(str).getBooleanQueryParameter(com.alibaba.aliweex.bundle.d.e, booleanValue);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : a(TBWXConfigManger.WX_COMMON_CONFIG, "enableSetDefaultHttps", true).booleanValue();
    }
}
