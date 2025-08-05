package com.ut.mini;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1531895312);
    }

    public static void setUtVariables(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38c761e7", new Object[]{str});
        } else {
            q.a().c(str);
        }
    }
}
