package com.taobao.android.live.plugin.atype.flexalocal.good.goodviewnew;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.hgv;
import tb.hgw;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class b<T extends hgv> implements hgw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c c;
    public T d = d();

    static {
        kge.a(-2094672589);
        kge.a(-1367436876);
    }

    public abstract T d();

    public b(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar) {
        this.c = cVar;
        c();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        T t = this.d;
        if (t == null) {
            return;
        }
        t.a(this);
    }

    public Context f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("442389e5", new Object[]{this}) : this.c.f();
    }
}
