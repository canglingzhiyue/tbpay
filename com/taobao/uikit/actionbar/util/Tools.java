package com.taobao.uikit.actionbar.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class Tools {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(911800640);
    }

    public static String subTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc4fab37", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        if (str.length() < 2 || !str.contains(":")) {
            return str.trim();
        }
        return str.substring(str.indexOf(":") + 1).trim();
    }
}
