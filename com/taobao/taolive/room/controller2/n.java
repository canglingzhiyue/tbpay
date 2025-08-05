package com.taobao.taolive.room.controller2;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.pmd;
import tb.psn;

/* loaded from: classes8.dex */
public class n implements psn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1495098069);
        kge.a(219771001);
    }

    @Override // tb.psn
    public String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3}) : pmd.a().d().a(str, str2, str3);
    }
}
