package com.alibaba.triver.triver_shop.newShop.view.provider;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.cel;
import tb.kge;

/* loaded from: classes3.dex */
public final class g implements cel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.alibaba.triver.triver_shop.newShop.view.embed.c f4015a;
    private final int b;
    private final boolean c;
    private com.alibaba.triver.triver_shop.newShop.view.h d;

    static {
        kge.a(-2007022639);
        kge.a(1635811568);
    }

    public g(com.alibaba.triver.triver_shop.newShop.view.embed.c swipeBigCardComponent, int i, boolean z) {
        q.d(swipeBigCardComponent, "swipeBigCardComponent");
        this.f4015a = swipeBigCardComponent;
        this.b = i;
        this.c = z;
    }

    @Override // tb.cel
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            cel.a.a(this, i);
        }
    }

    @Override // tb.cel
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : cel.a.a(this);
    }

    @Override // tb.cel
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            cel.a.b(this);
        }
    }

    @Override // tb.cel
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            cel.a.c(this);
        }
    }

    @Override // tb.cel
    public View a(Context context, Fragment outerFragment) {
        com.alibaba.triver.triver_shop.newShop.view.d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1bb42014", new Object[]{this, context, outerFragment});
        }
        q.d(outerFragment, "outerFragment");
        if (this.c) {
            dVar = new com.alibaba.triver.triver_shop.newShop.view.c(this.f4015a);
        } else {
            dVar = new com.alibaba.triver.triver_shop.newShop.view.d(this.f4015a, this.b);
        }
        this.d = dVar;
        com.alibaba.triver.triver_shop.newShop.view.h hVar = this.d;
        if (hVar != null) {
            return hVar.b();
        }
        return null;
    }

    @Override // tb.cel
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.alibaba.triver.triver_shop.newShop.view.h hVar = this.d;
        if (hVar == null) {
            return;
        }
        hVar.g();
    }

    @Override // tb.cel
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        cel.a.d(this);
        com.alibaba.triver.triver_shop.newShop.view.h hVar = this.d;
        if (hVar == null) {
            return;
        }
        hVar.c();
    }

    @Override // tb.cel
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        cel.a.e(this);
        com.alibaba.triver.triver_shop.newShop.view.h hVar = this.d;
        if (hVar == null) {
            return;
        }
        hVar.d();
    }
}
