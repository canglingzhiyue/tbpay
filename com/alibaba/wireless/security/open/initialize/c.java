package com.alibaba.wireless.security.open.initialize;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(974478474);
        new String[]{"aa2d4b45c16efec52c37ea3d701390ba07dccb6d35defb45029d6d5249a7bcfe", "15035b30c918dd03f393f1047ef70f6e65793832ed8db61137879450c10aa30e", "be51a4a6a8d8031a096f5438259dc8e7196411606ffc16df49bd40c3c5b353ab"};
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : "6.6.241002";
    }
}
