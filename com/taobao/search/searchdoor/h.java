package com.taobao.search.searchdoor;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.r;
import tb.kge;
import tb.noa;

/* loaded from: classes7.dex */
public class h extends r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1987043307);
    }

    public h() {
        addQueryFilter(noa.KEY_SEARCHDOOR_LAUNCH_MODE);
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean pathFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ee8b1ad2", new Object[]{this, str})).booleanValue() : str.equals("/h5entry");
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean hostFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c0d619d5", new Object[]{this, str})).booleanValue() : str.equals("s.m.taobao.com");
    }
}
