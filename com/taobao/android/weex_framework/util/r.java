package com.taobao.android.weex_framework.util;

import com.alibaba.android.umbrella.link.export.UMLLCons;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import tb.kge;

/* loaded from: classes6.dex */
public class r {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LEVEL_ERROR = 1;
    public static final int LEVEL_INFO = 3;

    static {
        kge.a(-223270382);
    }

    public static com.taobao.android.riverlogger.b a(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.riverlogger.b) ipChange.ipc$dispatch("43522b7a", new Object[]{new Integer(i), str, str2}) : a(RVLLevel.Info, i, str, str2, null);
    }

    public static com.taobao.android.riverlogger.b a(int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.riverlogger.b) ipChange.ipc$dispatch("3e65f8b0", new Object[]{new Integer(i), str, str2, str3}) : a(RVLLevel.Info, i, str, str2, str3);
    }

    public static com.taobao.android.riverlogger.b c(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.riverlogger.b) ipChange.ipc$dispatch("aaae80fc", new Object[]{new Integer(i), str, str2}) : a(RVLLevel.Error, i, str, str2, null);
    }

    public static com.taobao.android.riverlogger.b b(int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.riverlogger.b) ipChange.ipc$dispatch("24115531", new Object[]{new Integer(i), str, str2, str3}) : a(RVLLevel.Error, i, str, str2, str3);
    }

    public static com.taobao.android.riverlogger.b d(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.riverlogger.b) ipChange.ipc$dispatch("de5cabbd", new Object[]{new Integer(i), str, str2}) : a(RVLLevel.Verbose, i, str, str2, null);
    }

    public static com.taobao.android.riverlogger.b a(RVLLevel rVLLevel, int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.riverlogger.b) ipChange.ipc$dispatch("c106f41f", new Object[]{rVLLevel, new Integer(i), str, str2, str3});
        }
        com.taobao.android.riverlogger.b a2 = com.taobao.android.riverlogger.e.a(rVLLevel, "Weex/" + str);
        if (UMLLCons.FEATURE_TYPE_PAGE.contentEquals(str)) {
            a2.a(str2, com.taobao.android.weex.inspector.b.a(i));
        } else {
            a2.a(str2, str3);
            a2.b(com.taobao.android.weex.inspector.b.a(i));
        }
        return a2;
    }
}
