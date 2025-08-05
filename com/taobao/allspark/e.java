package com.taobao.allspark;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.b;
import com.taobao.android.nav.r;
import tb.kge;

/* loaded from: classes4.dex */
public class e extends r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1747515862);
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean schemeFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9fb6ac52", new Object[]{this, str})).booleanValue() : str.equals("http") || str.equals("https");
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean pathFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ee8b1ad2", new Object[]{this, str})).booleanValue() : str.equals(b.PATH);
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean hostFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c0d619d5", new Object[]{this, str})).booleanValue() : str.equals("h5.m.taobao.com");
    }
}
