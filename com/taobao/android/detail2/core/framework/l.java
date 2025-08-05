package com.taobao.android.detail2.core.framework;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.r;
import tb.kge;

/* loaded from: classes5.dex */
public class l extends r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1292788664);
    }

    public l() {
        addQueryFilter("hybrid_nd");
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean schemeFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9fb6ac52", new Object[]{this, str})).booleanValue() : str.equals("https") || str.equals("http");
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean pathFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ee8b1ad2", new Object[]{this, str})).booleanValue() : str.equals("/item.htm");
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean hostFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c0d619d5", new Object[]{this, str})).booleanValue() : str.equals("item.taobao.com");
    }
}
