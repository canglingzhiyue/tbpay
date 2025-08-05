package com.taobao.android.detail.provider;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import tb.kge;

/* loaded from: classes4.dex */
public class b implements com.taobao.android.detail.protocol.adapter.optional.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(585558100);
        kge.a(-1590956793);
    }

    @Override // com.taobao.android.detail.protocol.adapter.optional.b
    public String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3}) : OrangeConfig.getInstance().getConfig(str, str2, str3);
    }
}
