package com.taobao.message.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.r;
import tb.kge;

/* loaded from: classes7.dex */
public class MessageNavProcessorV2NodeUriFilterItem2 extends r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1310028829);
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean pathFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ee8b1ad2", new Object[]{this, str})).booleanValue() : str.contains("/app/tb-chatting/tbms-chat/pages/index") || str.contains("/app/tb-chatting/chat-universal-page/pages/index");
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean hostFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c0d619d5", new Object[]{this, str})).booleanValue() : str.equals("market.m.taobao.com") || str.equals("market.wapa.taobao.com");
    }
}
