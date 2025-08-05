package com.taobao.android.live.plugin.atype.flexalocal.good.ultron.events;

import com.alibaba.android.ultron.event.n;
import com.alibaba.android.ultron.event.q;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class d extends b<n> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1126108226);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.alibaba.android.ultron.event.q, com.alibaba.android.ultron.event.n] */
    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.ultron.events.b
    public /* synthetic */ n e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("b548ddb7", new Object[]{this}) : f();
    }

    public n f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (n) ipChange.ipc$dispatch("c66ce39", new Object[]{this}) : new n();
    }
}
