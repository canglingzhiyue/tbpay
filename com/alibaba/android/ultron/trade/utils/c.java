package com.alibaba.android.ultron.trade.utils;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DIMEN_SUFFIX_AP = "ap";
    public static final String DIMEN_SUFFIX_NP = "np";

    static {
        kge.a(1096167621);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (str.contains("ap")) {
                Float.parseFloat(str.replace("ap", ""));
            } else if (str.contains("np")) {
                Float.parseFloat(str.replace("np", ""));
            } else {
                Float.parseFloat(str);
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (StringUtils.isEmpty(str) || str.contains("ap") || str.contains("np")) {
            return str;
        }
        return str + "np";
    }
}
