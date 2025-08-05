package com.taobao.browser.nav;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.r;
import tb.kge;

/* loaded from: classes6.dex */
public class g extends r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-625903557);
    }

    public g() {
        addQueryFilter("wh_pid");
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean pathFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ee8b1ad2", new Object[]{this, str})).booleanValue() : str.contains("/wow/a/act");
    }
}
