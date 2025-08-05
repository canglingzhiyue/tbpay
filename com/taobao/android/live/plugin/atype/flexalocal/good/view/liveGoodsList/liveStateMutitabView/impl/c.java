package com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl;

import com.android.alibaba.ip.runtime.IpChange;
import tb.hgu;
import tb.hjf;
import tb.hjg;
import tb.hjh;
import tb.kge;

/* loaded from: classes6.dex */
public class c extends com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.b<hjh, hjf> implements hjg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1237539454);
        kge.a(-1683833796);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [tb.hjf, tb.hgu] */
    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.b
    public /* synthetic */ hjf bL_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hgu) ipChange.ipc$dispatch("456f4ef4", new Object[]{this}) : c();
    }

    public c(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar) {
        super(cVar);
    }

    public hjf c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hjf) ipChange.ipc$dispatch("1e68d0b8", new Object[]{this}) : new b(this.d);
    }
}
