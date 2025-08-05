package com.taobao.family.globalbubble;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.r;
import tb.kge;

/* loaded from: classes7.dex */
public class a extends r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1034670178);
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean hostFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c0d619d5", new Object[]{this, str})).booleanValue() : !str.contains("m.tb.cn");
    }
}
