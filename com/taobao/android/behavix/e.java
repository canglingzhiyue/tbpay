package com.taobao.android.behavix;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.behavixswitch.a;
import tb.drp;
import tb.dru;
import tb.kge;

/* loaded from: classes4.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-66276879);
    }

    public static String a() {
        drp a2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : (!a.e() || (a2 = dru.a(dru.LAST_ENTER_NODE)) == null) ? "" : a2.d;
    }

    public static String b() {
        drp a2;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : (!a.e() || (a2 = dru.a(dru.LAST_ENTER_NODE)) == null) ? "" : a2.c();
    }
}
