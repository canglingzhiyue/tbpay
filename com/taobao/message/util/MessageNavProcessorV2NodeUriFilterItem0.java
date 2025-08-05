package com.taobao.message.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.r;
import tb.kge;

/* loaded from: classes7.dex */
public class MessageNavProcessorV2NodeUriFilterItem0 extends r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1310028827);
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean pathFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ee8b1ad2", new Object[]{this, str})).booleanValue() : str.contains("/n/im/dynamic/") || str.contains("/n/im/chatlayer") || str.contains("/im/fragment/auraFragment") || str.contains("/n/im/group/newchat") || str.contains("/n/im/chat") || str.contains("/n/ww/newchat") || str.contains("/n/ww/chatdetail") || str.contains("/n/ww/official") || str.contains("/n/ww/inner/official") || str.contains("/n/im/openapi");
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean hostFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c0d619d5", new Object[]{this, str})).booleanValue() : str.equals("tb.cn");
    }
}
