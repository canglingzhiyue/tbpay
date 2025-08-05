package com.taobao.android.searchbaseframe.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1290624635);
    }

    public static de.greenrobot.event.c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (de.greenrobot.event.c) ipChange.ipc$dispatch("541bb6e5", new Object[0]) : de.greenrobot.event.c.b().b(false).a(true).c(false).a();
    }
}
