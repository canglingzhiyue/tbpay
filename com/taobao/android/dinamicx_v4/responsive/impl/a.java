package com.taobao.android.dinamicx_v4.responsive.impl;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.gbn;
import tb.gfb;
import tb.gfh;
import tb.gfo;
import tb.gfp;
import tb.ggk;
import tb.kge;

/* loaded from: classes5.dex */
public class a implements gfp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<ggk> f12232a;
    public WeakReference<Object> b;
    public String c;
    public boolean d;
    public List<WeakReference<DXWidgetNode>> e;
    public WeakReference<DXWidgetNode> f;
    public WeakReference<gfo> g;
    public List<WeakReference<Object>> h;
    public List<b> i;

    static {
        kge.a(-1386720926);
        kge.a(-1186224687);
        kge.a(1295721078);
    }

    public a(ggk ggkVar) {
        a(ggkVar);
    }

    public void a(ggk ggkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea352f6d", new Object[]{this, ggkVar});
            return;
        }
        this.f12232a = new WeakReference<>(ggkVar);
        this.e = new ArrayList();
        this.h = new ArrayList();
        this.d = ggkVar.f().b();
        this.c = ggkVar.f().d();
    }

    @Override // tb.gfq
    public void a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613bf3c7", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode == null) {
        } else {
            this.e.add(new WeakReference<>(dXWidgetNode));
        }
    }

    @Override // tb.gfq
    public void a(Object obj, boolean z) {
        ggk ggkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e7de910", new Object[]{this, obj, new Boolean(z)});
            return;
        }
        WeakReference<ggk> weakReference = this.f12232a;
        if (weakReference == null || (ggkVar = weakReference.get()) == null) {
            return;
        }
        ggkVar.h().a(obj);
        if (this.d) {
            a(ggkVar, obj);
            if (z) {
                a();
            }
        } else if (z) {
            a();
        }
        if (!z) {
            return;
        }
        d();
    }

    @Override // tb.gfq
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            a(obj, true);
        }
    }

    private void a(ggk ggkVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b6fe09", new Object[]{this, ggkVar, obj});
        } else if (ggkVar.f().c() != 1) {
        } else {
            try {
                DXWidgetNode dXWidgetNode = this.f.get();
                if (dXWidgetNode == null) {
                    return;
                }
                gfb.a(this.c, this.b.get(), obj, dXWidgetNode.getDXRuntimeContext().M());
                if (this.g == null || this.g.get() == null) {
                    return;
                }
                this.g.get();
            } catch (Exception e) {
                com.taobao.android.dinamicx.exception.a.b(e);
            }
        }
    }

    @Override // tb.gfq
    public void b(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b577266", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode == null) {
        } else {
            this.f = new WeakReference<>(dXWidgetNode);
        }
    }

    @Override // tb.gfq
    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
        } else {
            this.b = new WeakReference<>(obj);
        }
    }

    @Override // tb.gfq
    public void a(gfo gfoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea28e968", new Object[]{this, gfoVar});
        } else if (TextUtils.isEmpty(this.c) || !this.d || gfoVar == null) {
        } else {
            this.g = new WeakReference<>(gfoVar);
        }
    }

    public void a() {
        Iterator<WeakReference<DXWidgetNode>> it;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        List<WeakReference<DXWidgetNode>> list = this.e;
        if (list == null || (it = list.iterator()) == null) {
            return;
        }
        DXWidgetRefreshOption a2 = new DXWidgetRefreshOption.a().a(true).a(1).b(true).a();
        while (it.hasNext()) {
            WeakReference<DXWidgetNode> next = it.next();
            if (next.get() == null) {
                it.remove();
            } else {
                next.get().setNeedParse(a2);
            }
        }
    }

    @Override // tb.gfq
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.d;
    }

    @Override // tb.gfq
    public List<b> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.i;
    }

    @Override // tb.gfq
    public void a(DXWidgetNode dXWidgetNode, long j) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c642fbdd", new Object[]{this, dXWidgetNode, new Long(j)});
            return;
        }
        if (this.i == null) {
            this.i = new ArrayList();
        }
        Iterator<b> it = this.i.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            b next = it.next();
            if (next.a() == null) {
                it.remove();
            } else if (next.a().get() == dXWidgetNode) {
                next.a(j);
                break;
            }
        }
        if (z) {
            return;
        }
        b bVar = new b();
        bVar.a(dXWidgetNode);
        bVar.a(j);
        this.i.add(bVar);
    }

    public void d() {
        ggk ggkVar;
        List<gfh> f;
        gfh gfhVar;
        gbn f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        DXWidgetNode dXWidgetNode = this.f.get();
        if (dXWidgetNode == null || !dXWidgetNode.isRootNode() || (ggkVar = this.f12232a.get()) == null || (f = dXWidgetNode.getDxv4Properties().f()) == null) {
            return;
        }
        for (ggk.a aVar : ggkVar.g()) {
            int a2 = aVar.a();
            if (a2 >= 0 && a2 < f.size() && (gfhVar = f.get(a2)) != null && (f2 = gfhVar.f()) != null) {
                f2.a(aVar.b());
            }
        }
    }

    @Override // tb.gfq
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        a();
        d();
    }
}
