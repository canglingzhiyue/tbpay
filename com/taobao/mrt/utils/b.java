package com.taobao.mrt.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(672605597);
    }

    public static void a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            return;
        }
        com.taobao.mrt.service.c c = com.taobao.mrt.f.a().c();
        if (c == null) {
            return;
        }
        c.a(map);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        com.taobao.mrt.service.c c = com.taobao.mrt.f.a().c();
        if (c == null) {
            return;
        }
        c.a();
    }
}
