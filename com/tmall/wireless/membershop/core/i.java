package com.tmall.wireless.membershop.core;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.r;
import tb.kge;

/* loaded from: classes9.dex */
public class i extends r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-596595489);
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean schemeFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9fb6ac52", new Object[]{this, str})).booleanValue() : str.equals("http") || str.equals("https");
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean pathFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ee8b1ad2", new Object[]{this, str})).booleanValue() : str.equals("/m/searchbar.htm") || str.equals("/m/search.htm") || str.equals("/search_product.htm") || str.equals("/m/supermarket.htm") || str.equals("/search.htm") || str.equals("/m/chaoshi.htm") || str.equals("/chaoshi.htm");
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean hostFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c0d619d5", new Object[]{this, str})).booleanValue() : str.equals("list.tmall.com") || str.equals("s.m.tmall.com");
    }
}
