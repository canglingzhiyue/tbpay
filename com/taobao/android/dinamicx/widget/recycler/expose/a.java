package com.taobao.android.dinamicx.widget.recycler.expose;

import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import tb.fqi;
import tb.fxu;
import tb.fyn;
import tb.fyr;
import tb.fyt;
import tb.fyy;
import tb.fzs;
import tb.fzv;
import tb.kge;

/* loaded from: classes5.dex */
public class a extends fxu implements fyy<Integer, WeakReference<View>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ExposeHelperBuilder f12130a;
    private final fyt<Integer, WeakReference<View>> b;
    private final HashSet<String> c;
    private final HashSet<String> d;
    private final RecyclerView e;

    static {
        kge.a(2102486277);
        kge.a(-64242879);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == 1539149856) {
            super.b((fyr) objArr[0], (String) objArr[1], (RecyclerView) objArr[2], (View) objArr[3]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fyz
    public /* bridge */ /* synthetic */ void c(Object obj, Object obj2, String str) {
    }

    @Override // tb.fzc
    public /* bridge */ /* synthetic */ boolean a(Object obj, Object obj2, String str, Map map) {
        return a((Integer) obj, (WeakReference) obj2, str, (Map<Integer, WeakReference<View>>) map);
    }

    public a(RecyclerView recyclerView, ExposeHelperBuilder exposeHelperBuilder) {
        super(null, "dinamicx");
        this.c = new HashSet<>();
        this.d = new HashSet<>();
        this.f12130a = exposeHelperBuilder;
        this.e = recyclerView;
        fyn.a aVar = new fyn.a(recyclerView, this);
        long h = exposeHelperBuilder.h();
        this.b = aVar.a(this, h, "recyclerLayoutExpose" + recyclerView.hashCode()).a();
    }

    @Override // tb.fxu, tb.fzg.b
    public void a(fyr<Integer, WeakReference<View>> fyrVar, String str, RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3444a451", new Object[]{this, fyrVar, str, recyclerView, new Integer(i), new Integer(i2)});
        } else {
            f();
        }
    }

    @Override // tb.fxu, tb.fzg.b
    public void b(fyr<Integer, WeakReference<View>> fyrVar, String str, RecyclerView recyclerView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bbd9020", new Object[]{this, fyrVar, str, recyclerView, view});
            return;
        }
        super.b(fyrVar, str, recyclerView, view);
        if (this.f12130a.b() == null) {
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        HashSet<String> hashSet = this.d;
        hashSet.remove(childAdapterPosition + "");
        this.f12130a.b().b(childAdapterPosition);
    }

    @Override // tb.fza
    public boolean a(Integer num, WeakReference<View> weakReference, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("425c17fd", new Object[]{this, num, weakReference, str})).booleanValue();
        }
        ExposeHelperBuilder exposeHelperBuilder = this.f12130a;
        if (exposeHelperBuilder != null && exposeHelperBuilder.e() != null) {
            return this.f12130a.e().a(num.intValue());
        }
        return false;
    }

    @Override // tb.fzb
    public void b(Integer num, WeakReference<View> weakReference, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2587cb3a", new Object[]{this, num, weakReference, str});
        } else if (this.f12130a == null) {
        } else {
            if (fqi.O()) {
                String a2 = this.f12130a.c().a(num.intValue());
                if (!this.c.contains(a2)) {
                    if (this.f12130a.f() != null) {
                        this.f12130a.f().a(num.intValue());
                    }
                    this.c.add(a2);
                    this.d.add(a2);
                } else if (this.d.contains(a2)) {
                } else {
                    if (this.f12130a.b() != null) {
                        this.f12130a.b().a(num.intValue());
                    }
                    this.d.add(a2);
                }
            } else if (this.f12130a.f() == null) {
            } else {
                this.f12130a.f().a(num.intValue());
            }
        }
    }

    @Override // tb.fzb
    public void a(List<Pair<Integer, WeakReference<View>>> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c6e0ee3", new Object[]{this, list, str});
            return;
        }
        for (Pair<Integer, WeakReference<View>> pair : list) {
            b((Integer) pair.first, (WeakReference) pair.second, str);
        }
    }

    public boolean a(Integer num, WeakReference<View> weakReference, String str, Map<Integer, WeakReference<View>> map) {
        View findViewByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f445b270", new Object[]{this, num, weakReference, str, map})).booleanValue();
        }
        if (fqi.O()) {
            return a(num.intValue(), this.e.getLayoutManager().findViewByPosition(num.intValue()));
        }
        ExposeHelperBuilder exposeHelperBuilder = this.f12130a;
        if (exposeHelperBuilder == null) {
            return false;
        }
        if (exposeHelperBuilder.c() == null) {
            return true;
        }
        if (this.c.contains(String.valueOf(num)) || (findViewByPosition = this.e.getLayoutManager().findViewByPosition(num.intValue())) == null || this.f12130a.g() == null) {
            return false;
        }
        boolean a2 = e.a(findViewByPosition, this.f12130a.g().a());
        if (a2) {
            this.c.add(String.valueOf(num));
        }
        return a2;
    }

    private boolean a(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1113115b", new Object[]{this, new Integer(i), view})).booleanValue();
        }
        ExposeHelperBuilder exposeHelperBuilder = this.f12130a;
        if (exposeHelperBuilder == null || view == null) {
            return false;
        }
        fzs c = exposeHelperBuilder.c();
        fzv g = this.f12130a.g();
        if (c == null) {
            if (g == null) {
                return true;
            }
            return e.a(view, g.a());
        } else if (this.d.contains(c.a(i))) {
            return false;
        } else {
            if (g == null) {
                return true;
            }
            return e.a(view, g.a());
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.c.clear();
        this.d.clear();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        fyt<Integer, WeakReference<View>> fytVar = this.b;
        if (fytVar == null) {
            return;
        }
        fytVar.e();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        fyt<Integer, WeakReference<View>> fytVar = this.b;
        if (fytVar == null) {
            return;
        }
        fytVar.f();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        fyt<Integer, WeakReference<View>> fytVar = this.b;
        if (fytVar == null) {
            return;
        }
        fytVar.d();
        this.b.b();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        fyt<Integer, WeakReference<View>> fytVar = this.b;
        if (fytVar == null) {
            return;
        }
        fytVar.d();
    }
}
