package com.taobao.android.meta.structure.page;

import android.support.v4.view.ViewPager;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.structure.childpage.g;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import kotlin.reflect.k;
import tb.hte;
import tb.imn;
import tb.irt;
import tb.iru;
import tb.iue;
import tb.kge;

/* loaded from: classes6.dex */
public class d extends iue<b, f<com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>, com.taobao.android.meta.data.a, hte, MetaResult<com.taobao.android.meta.data.a>>> implements com.taobao.android.meta.structure.page.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ k[] f14304a;
    private int c;
    private int d;
    private g g;
    private final SparseArray<g> b = new SparseArray<>();
    private int e = -1;
    private final kotlin.d f = kotlin.e.a(new MetaPagePresenter$adapter$2(this));

    /* loaded from: classes6.dex */
    public static final class a extends ViewPager.SimpleOnPageChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.support.v4.view.ViewPager.SimpleOnPageChangeListener, android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            } else {
                d.this.g(i);
            }
        }
    }

    static {
        kge.a(-174435545);
        kge.a(-2046219400);
        f14304a = new k[]{t.a(new PropertyReference1Impl(t.b(d.class), "adapter", "getAdapter()Lcom/taobao/android/meta/structure/page/MetaChildPageAdapter;"))};
    }

    private final c d() {
        IpChange ipChange = $ipChange;
        return (c) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("41a0fa64", new Object[]{this}) : this.f.getValue());
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        if (str.hashCode() == 531831650) {
            super.bind(objArr[0], objArr[1], (imn) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.iuh
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        }
    }

    @Override // tb.iue, tb.iuh
    public /* synthetic */ void bind(b bVar, f<com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>, com.taobao.android.meta.data.a, hte, MetaResult<com.taobao.android.meta.data.a>> fVar, imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fb31b62", new Object[]{this, bVar, fVar, imnVar});
        } else {
            a(bVar, fVar, imnVar);
        }
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
        } else if (this.b.size() == 0 || this.e == i) {
        } else {
            g gVar = this.b.get(i);
            if (gVar != null) {
                f<com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>, com.taobao.android.meta.data.a, hte, MetaResult<com.taobao.android.meta.data.a>> widget = getWidget();
                q.a((Object) widget, "widget");
                iru iruVar = (iru) widget.getModel();
                q.a((Object) iruVar, "widget.model");
                irt e = iruVar.e();
                iru iruVar2 = (iru) gVar.getModel();
                q.a((Object) iruVar2, "it.model");
                e.a(iruVar2.d());
            } else {
                gVar = null;
            }
            g gVar2 = this.b.get(this.e);
            if (gVar2 != null) {
                com.taobao.android.meta.logic.a<com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>, com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>> p = getWidget().p();
                iru iruVar3 = (iru) gVar2.getModel();
                q.a((Object) iruVar3, "it.model");
                p.c((com.taobao.android.meta.data.b) iruVar3.d(), gVar2);
                gVar2.v();
            }
            this.e = i;
            if (gVar == null) {
                return;
            }
            gVar.b(this.d);
            com.taobao.android.meta.logic.a<com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>, com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>> p2 = getWidget().p();
            iru iruVar4 = (iru) gVar.getModel();
            q.a((Object) iruVar4, "it.model");
            p2.a((com.taobao.android.meta.logic.a<com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>, com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>) ((com.taobao.android.meta.data.b) iruVar4.d()), gVar);
            gVar.u();
            getIView().a(gVar);
        }
    }

    @Override // com.taobao.android.meta.structure.page.a
    public TabBean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TabBean) ipChange.ipc$dispatch("adeef353", new Object[]{this, new Integer(i)}) : d().a().get(i);
    }

    @Override // com.taobao.android.meta.structure.page.a
    public g b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("b994a37b", new Object[]{this, new Integer(i)});
        }
        if (d().getCount() > 0 && this.g != null && i >= 0) {
            com.taobao.android.meta.logic.a<com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>, com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>> p = getWidget().p();
            f<com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>, com.taobao.android.meta.data.a, hte, MetaResult<com.taobao.android.meta.data.a>> widget = getWidget();
            q.a((Object) widget, "widget");
            iru iruVar = (iru) widget.getModel();
            q.a((Object) iruVar, "widget.model");
            com.taobao.android.searchbaseframe.datasource.impl.a c = iruVar.c();
            q.a((Object) c, "widget.model.initDatasource");
            if (p.a(i, (int) ((com.taobao.android.meta.data.b) c))) {
                f<com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>, com.taobao.android.meta.data.a, hte, MetaResult<com.taobao.android.meta.data.a>> widget2 = getWidget();
                q.a((Object) widget2, "widget");
                iru iruVar2 = (iru) widget2.getModel();
                q.a((Object) iruVar2, "widget.model");
                ((com.taobao.android.meta.data.b) iruVar2.c()).setIndex(i);
                this.b.put(i, this.g);
                g gVar = this.g;
                if (gVar == null) {
                    q.a();
                }
                gVar.a(this.c);
                g gVar2 = this.g;
                if (gVar2 == null) {
                    q.a();
                }
                gVar2.b(this.d);
                g gVar3 = this.g;
                if (gVar3 == null) {
                    q.a();
                }
                gVar3.b(true);
                this.g = null;
            }
        }
        g gVar4 = this.b.get(i);
        if (gVar4 != null) {
            return gVar4;
        }
        int count = d().getCount();
        if (i < 0 || count <= i) {
            return null;
        }
        g a2 = getWidget().a(i);
        this.b.put(i, a2);
        a2.attachToContainer();
        a2.a(this.c);
        a2.a(getIView().cX_());
        a2.b(this.d);
        a2.m();
        return a2;
    }

    @Override // com.taobao.android.meta.structure.page.a
    public g a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("5a9d8329", new Object[]{this}) : b(this.e);
    }

    @Override // com.taobao.android.meta.structure.page.a
    public void a(List<TabBean> tabs) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, tabs});
            return;
        }
        q.c(tabs, "tabs");
        d().a().clear();
        d().a().addAll(tabs);
        d().notifyDataSetChanged();
    }

    @Override // com.taobao.android.meta.structure.page.a
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            d().a(i);
        }
    }

    @Override // com.taobao.android.meta.structure.page.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        getIView().a(d());
        getIView().a(new a());
    }

    @Override // com.taobao.android.meta.structure.page.a
    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        this.c = i;
        if (this.b.size() == 0) {
            return;
        }
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            g valueAt = this.b.valueAt(i2);
            if (valueAt != null) {
                valueAt.a(i);
            }
        }
    }

    @Override // com.taobao.android.meta.structure.page.a
    public void e(int i) {
        g gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
            return;
        }
        this.d = i;
        if (this.b.size() == 0 || (gVar = this.b.get(this.e)) == null) {
            return;
        }
        gVar.b(i);
    }

    @Override // com.taobao.android.meta.structure.page.a
    public int ar_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d31527c8", new Object[]{this})).intValue() : d().getCount();
    }

    public void a(b bVar, f<com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>, com.taobao.android.meta.data.a, hte, MetaResult<com.taobao.android.meta.data.a>> fVar, imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c4e5be", new Object[]{this, bVar, fVar, imnVar});
            return;
        }
        if (fVar == null) {
            q.a();
        }
        iru iruVar = (iru) fVar.getModel();
        q.a((Object) iruVar, "widget!!.model");
        irt e = iruVar.e();
        q.a((Object) e, "widget!!.model.pageModel");
        com.taobao.android.searchbaseframe.track.a a2 = e.a();
        q.a((Object) a2, "widget!!.model.pageModel…rstScreenPerfMeasureEvent");
        a2.a(System.currentTimeMillis());
        super.bind(bVar, fVar, imnVar);
    }

    @Override // com.taobao.android.meta.structure.page.a
    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
            return;
        }
        this.g = null;
        g gVar = this.b.get(i);
        if (gVar == null) {
            return;
        }
        gVar.l();
    }

    @Override // com.taobao.android.meta.structure.page.a
    public void aD_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84963b43", new Object[]{this});
            return;
        }
        f<com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>, com.taobao.android.meta.data.a, hte, MetaResult<com.taobao.android.meta.data.a>> widget = getWidget();
        iru<com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>> x = getWidget().p().x();
        if (x == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.widget.WidgetModelAdapter<com.taobao.android.meta.data.MetaDataSource<out com.taobao.android.meta.data.MetaCombo, out com.taobao.android.meta.data.MetaResult<out com.taobao.android.meta.data.MetaCombo>>>");
        }
        g a2 = widget.a(x);
        a2.attachToContainer();
        a2.a(this.c);
        a2.a(getIView().cX_());
        a2.b(this.d);
        a2.m();
        this.g = a2;
    }

    @Override // com.taobao.android.meta.structure.page.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        f<com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>, com.taobao.android.meta.data.a, hte, MetaResult<com.taobao.android.meta.data.a>> widget = getWidget();
        q.a((Object) widget, "widget");
        hte a2 = ((iru) widget.getModel()).a();
        boolean Y = a2.Y();
        a2.t(false);
        g gVar = this.g;
        if (gVar != null) {
            gVar.destroyAndRemoveFromParent();
        }
        this.g = null;
        a2.t(Y);
    }
}
