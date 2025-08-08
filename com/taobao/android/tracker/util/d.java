package com.taobao.android.tracker.util;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jjk;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SPM_MAP_KEY = "spm";

    static {
        kge.a(-123526801);
    }

    public static String a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfa4f210", new Object[]{str, str2, str3, str4});
        }
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3)) {
            return null;
        }
        if (StringUtils.isEmpty(str4)) {
            str4 = "";
        }
        return str + "." + str2 + "." + str3 + "." + str4;
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (StringUtils.isEmpty(str)) {
            str = "";
        }
        if (StringUtils.isEmpty(str2)) {
            return str;
        }
        return str + str2;
    }

    public static String a(jjk jjkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c6be873", new Object[]{jjkVar});
        }
        if (jjkVar != null) {
            return a(jjkVar.f29584a, jjkVar.b, jjkVar.c, jjkVar.d);
        }
        return null;
    }
}
