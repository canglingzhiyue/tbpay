package com.taobao.message.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.r;
import tb.kge;

/* loaded from: classes7.dex */
public class MessageNavProcessorV2NodeUriFilterItem1 extends r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1310028828);
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean pathFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ee8b1ad2", new Object[]{this, str})).booleanValue() : str.contains("/wx/h5chat.html") || str.contains("/ww/index.htm");
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean hostFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c0d619d5", new Object[]{this, str})).booleanValue() : str.equals("h5.m.taobao.com") || str.equals("wapp.m.taobao.com");
    }
}
