package com.alibaba.jsi.standard.js;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class u extends l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1743321467);
    }

    public u(com.alibaba.jsi.standard.d dVar, long j) {
        super(dVar, j);
    }

    @Override // com.alibaba.jsi.standard.js.w
    public z i(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (z) ipChange.ipc$dispatch("367d4238", new Object[]{this, dVar}) : m(dVar);
    }

    @Override // com.alibaba.jsi.standard.js.w
    public final w j(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (w) ipChange.ipc$dispatch("2a0cc61c", new Object[]{this, dVar}) : n(dVar);
    }
}
