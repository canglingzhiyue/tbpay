package com.taobao.android.linkback;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class h implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.linkback.g
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : d.S_ROUTE_EXCLUSION.contains(str);
    }
}
