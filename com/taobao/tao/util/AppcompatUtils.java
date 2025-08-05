package com.taobao.tao.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.acg;
import tb.kge;

@Deprecated
/* loaded from: classes8.dex */
public class AppcompatUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-18884133);
    }

    public static String getMenuTitle(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6bf0afc2", new Object[]{str, str2});
        }
        return str2 + ":" + str;
    }

    public static String getMenuTitle(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8e3b2d1", new Object[]{str, new Integer(i)});
        }
        return acg.a().getString(i) + ":" + str;
    }
}
