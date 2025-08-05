package com.taobao.android.tmgcontainer.router;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.r;
import tb.kge;

/* loaded from: classes6.dex */
public class c extends r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1415147323);
    }

    public c() {
        addQueryFilter("tmg_container");
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean schemeFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9fb6ac52", new Object[]{this, str})).booleanValue() : str.equals("https") || str.equals("http");
    }
}
