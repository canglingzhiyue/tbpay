package com.taobao.weex.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.r;
import tb.kge;

/* loaded from: classes9.dex */
public class TBWXNavProcessorNodeUriFilterItem1 extends r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(308388405);
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean pathFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ee8b1ad2", new Object[]{this, str})).booleanValue() : str.contains("h5.m.taobao.com/weex/viewpage.htm");
    }
}
