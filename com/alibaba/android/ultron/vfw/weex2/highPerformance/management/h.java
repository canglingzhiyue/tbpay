package com.alibaba.android.ultron.vfw.weex2.highPerformance.management;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.r;
import tb.kge;

/* loaded from: classes2.dex */
public class h extends r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1004145461);
    }

    public h() {
        addQueryFilter("wh_weex");
        addQueryFilter(com.taobao.vessel.utils.b.WX_TPL);
        addQueryFilter("_wx_devtool");
        addQueryFilter("_wx_f_");
        addQueryFilter("tradeHybrid");
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean schemeFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9fb6ac52", new Object[]{this, str})).booleanValue() : str.equals("http") || str.equals("https");
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean hostFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c0d619d5", new Object[]{this, str})).booleanValue() : str.equals("meta.m.taobao.com") || str.equals("meta.wapa.taobao.com");
    }
}
