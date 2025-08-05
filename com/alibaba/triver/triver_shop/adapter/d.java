package com.alibaba.triver.triver_shop.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.r;
import tb.kge;

/* loaded from: classes3.dex */
public class d extends r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(967283237);
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean hostFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c0d619d5", new Object[]{this, str})).booleanValue() : str.contains(".taobao.com");
    }
}
