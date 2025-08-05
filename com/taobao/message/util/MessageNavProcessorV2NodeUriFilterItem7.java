package com.taobao.message.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.r;
import com.taobao.message.BuildConfig;
import tb.kge;

/* loaded from: classes7.dex */
public class MessageNavProcessorV2NodeUriFilterItem7 extends r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1310028834);
    }

    @Override // com.taobao.android.nav.r, com.taobao.android.nav.p
    public boolean hostFilter(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c0d619d5", new Object[]{this, str})).booleanValue() : str.equals(BuildConfig.APPLICATION_ID);
    }
}
