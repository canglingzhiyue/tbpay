package com.taobao.android.dinamicx.widget.recycler.expose;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.fzu;
import tb.fzv;
import tb.fzw;
import tb.kge;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final RecyclerView f12132a;
    private final fzv b;
    private final fzu c;
    private final fzw d;
    private final long e;
    private d f;
    private b g;
    private boolean h;
    private List<Object> i;
    private final a j;

    static {
        kge.a(1385006725);
    }

    public c(RecyclerView recyclerView, ExposeHelperBuilder exposeHelperBuilder) {
        this.f12132a = recyclerView;
        this.c = exposeHelperBuilder.d();
        this.b = exposeHelperBuilder.g();
        this.e = exposeHelperBuilder.h();
        this.j = new a(recyclerView, exposeHelperBuilder);
        this.d = exposeHelperBuilder.b();
    }

    public void a() {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.h || (bVar = this.g) == null) {
        } else {
            bVar.a();
        }
    }

    public void b() {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.h || (bVar = this.g) == null) {
        } else {
            bVar.c();
        }
    }

    public void c() {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.h || (bVar = this.g) == null) {
        } else {
            bVar.b();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.h) {
        } else {
            this.h = true;
            a aVar = this.j;
            if (aVar != null) {
                aVar.c();
            }
            fzu fzuVar = this.c;
            if (fzuVar == null) {
                return;
            }
            this.g = new b(this.f12132a, fzuVar, this.b, this.e);
            this.f = new d(this.g);
            this.f12132a.addOnScrollListener(this.f);
            this.f12132a.addOnChildAttachStateChangeListener(this.g);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!this.h) {
        } else {
            this.h = false;
            b bVar = this.g;
            if (bVar != null) {
                this.f12132a.removeOnChildAttachStateChangeListener(bVar);
            }
            d dVar = this.f;
            if (dVar != null) {
                this.f12132a.removeOnScrollListener(dVar);
            }
            if (this.i != null) {
                this.i = null;
            }
            a aVar = this.j;
            if (aVar == null) {
                return;
            }
            aVar.d();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        a aVar = this.j;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        a aVar = this.j;
        if (aVar == null) {
            return;
        }
        aVar.e();
    }

    public List<Object> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this}) : this.i;
    }

    public void a(List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.i = list;
        }
    }

    public fzw i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fzw) ipChange.ipc$dispatch("4c920653", new Object[]{this}) : this.d;
    }
}
