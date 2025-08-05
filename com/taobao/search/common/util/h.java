package com.taobao.search.common.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import tb.kge;

/* loaded from: classes7.dex */
public class h implements com.taobao.search.rainbow.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1167743086);
        kge.a(-737320267);
    }

    @Override // com.taobao.search.rainbow.d
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : Login.getNick();
    }
}
