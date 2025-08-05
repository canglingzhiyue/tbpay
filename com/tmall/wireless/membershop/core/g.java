package com.tmall.wireless.membershop.core;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.r;
import tb.kge;

/* loaded from: classes9.dex */
public class g extends r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1051370841);
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean pathFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ee8b1ad2", new Object[]{this, str})).booleanValue() : str.equals("/wow/tmclub/act/home") || str.equals("/wow/z/tmclub/channel/home");
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean hostFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c0d619d5", new Object[]{this, str})).booleanValue() : str.equals("pages.tmall.com") || str.equals("tmclub.tmall.com");
    }
}
