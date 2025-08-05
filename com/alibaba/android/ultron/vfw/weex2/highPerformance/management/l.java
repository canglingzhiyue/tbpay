package com.alibaba.android.ultron.vfw.weex2.highPerformance.management;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.r;
import tb.kge;

/* loaded from: classes2.dex */
public class l extends r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1004145460);
    }

    public l() {
        addQueryFilter("tradeHybrid");
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean schemeFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9fb6ac52", new Object[]{this, str})).booleanValue() : str.equals("http") || str.equals("https");
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean pathFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ee8b1ad2", new Object[]{this, str})).booleanValue() : str.startsWith("/app/mtb/ugc-container");
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean hostFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c0d619d5", new Object[]{this, str})).booleanValue() : str.equals("web.m.taobao.com") || str.equals("web.wapa.taobao.com");
    }
}
