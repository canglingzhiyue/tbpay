package com.taobao.taolive.adapterimpl.msg;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.pnp;
import tb.pns;

/* loaded from: classes8.dex */
public class g implements pnp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1532976102);
        kge.a(-641131650);
    }

    @Override // tb.pnp
    public pns b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pns) ipChange.ipc$dispatch("16badee8", new Object[]{this}) : new a();
    }
}
