package com.taobao.tbpoplayer.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.r;
import tb.kge;

/* loaded from: classes8.dex */
public class k extends r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1807898848);
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean schemeFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9fb6ac52", new Object[]{this, str})).booleanValue() : str.equals("poplayer");
    }
}
