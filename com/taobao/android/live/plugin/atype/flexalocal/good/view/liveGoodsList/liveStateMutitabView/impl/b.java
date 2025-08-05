package com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.a;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.f;
import tb.hgx;
import tb.hjf;
import tb.hjg;
import tb.kge;

/* loaded from: classes6.dex */
public class b extends a<hjg> implements hjf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public f b;
    private hgx c;
    private com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c e;

    static {
        kge.a(-1804870909);
        kge.a(445537981);
    }

    public b(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar) {
        this.e = cVar;
    }

    @Override // tb.hgu
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        f fVar = this.b;
        if (fVar != null) {
            fVar.a();
        }
        hgx hgxVar = this.c;
        if (hgxVar == null) {
            return;
        }
        hgxVar.b();
        this.c = null;
    }
}
