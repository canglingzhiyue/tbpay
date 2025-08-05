package com.taobao.taolive.movehighlight.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.pmd;

/* loaded from: classes8.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1717706522);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (pmd.a().m() == null) {
        } else {
            pmd.a().m().a("HighlightBundle", str);
        }
    }
}
