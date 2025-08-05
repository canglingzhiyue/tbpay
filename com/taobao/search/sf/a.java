package com.taobao.search.sf;

import com.android.alibaba.ip.runtime.IpChange;
import tb.irt;
import tb.iru;
import tb.kge;
import tb.nns;

/* loaded from: classes8.dex */
public class a extends iru<com.taobao.search.sf.datasource.c> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private nns f19433a;

    static {
        kge.a(629619033);
    }

    public a(irt<com.taobao.search.sf.datasource.c> irtVar, com.taobao.search.sf.datasource.c cVar, nns nnsVar) {
        super(irtVar, cVar);
        this.f19433a = nnsVar;
    }

    public nns o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nns) ipChange.ipc$dispatch("7abf5bfd", new Object[]{this}) : this.f19433a;
    }
}
