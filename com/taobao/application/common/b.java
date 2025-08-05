package com.taobao.application.common;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            c.a(com.taobao.application.common.impl.b.d());
        }
    }
}
