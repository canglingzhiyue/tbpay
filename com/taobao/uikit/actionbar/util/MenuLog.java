package com.taobao.uikit.actionbar.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import tb.kge;

/* loaded from: classes9.dex */
public class MenuLog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MODULE = "TBPublicMenu";

    static {
        kge.a(-2137452662);
    }

    private static String args2arg(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7763f8a9", new Object[]{strArr});
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(" ");
            sb.append(str);
        }
        return sb.toString();
    }

    public static void log(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fc4102a", new Object[]{str, strArr});
        } else {
            TLog.loge(MODULE, str, args2arg(strArr));
        }
    }

    public static void block(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82a33501", new Object[]{str, strArr});
            return;
        }
        log(str + "->block->", strArr);
    }
}
