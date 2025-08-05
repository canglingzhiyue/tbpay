package com.taobao.android.live.plugin.atype.flexalocal.good.ultron.events;

import com.alibaba.android.ultron.event.p;
import com.alibaba.android.ultron.event.q;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class c extends b<p> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1335391584);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.alibaba.android.ultron.event.p, com.alibaba.android.ultron.event.q] */
    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.ultron.events.b
    public /* synthetic */ p e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("b548ddb7", new Object[]{this}) : f();
    }

    public p f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p) ipChange.ipc$dispatch("c66ce77", new Object[]{this}) : new p();
    }
}
