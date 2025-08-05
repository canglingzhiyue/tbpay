package com.taobao.android.meta.logic;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.a;
import com.taobao.android.meta.data.b;
import com.taobao.android.meta.structure.childpage.g;
import com.taobao.android.meta.structure.page.f;
import com.taobao.android.meta.structure.state.MetaState;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import java.util.Map;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import kotlin.reflect.k;
import tb.hte;
import tb.htf;
import tb.ioy;
import tb.irt;
import tb.iru;
import tb.iuk;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class a<D extends com.taobao.android.meta.data.b<C, R>, C extends com.taobao.android.meta.data.a, R extends MetaResult<C>> implements c<D, C, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ k[] f14274a;
    public D b;
    public f<D, C, ? extends hte, R> c;
    private final d d = e.a(new BaseMetaPageController$pageModel$2(this));
    private final d e = e.a(new BaseMetaPageController$model$2(this));

    static {
        kge.a(1312345833);
        kge.a(1378069012);
        f14274a = new k[]{t.a(new PropertyReference1Impl(t.b(a.class), "pageModel", "getPageModel()Lcom/taobao/android/searchbaseframe/business/srp/widget/PageModel;")), t.a(new PropertyReference1Impl(t.b(a.class), "model", "getModel()Lcom/taobao/android/searchbaseframe/business/srp/widget/WidgetModelAdapter;"))};
    }

    public final irt<D> d() {
        IpChange ipChange = $ipChange;
        return (irt) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("261b0a30", new Object[]{this}) : this.d.getValue());
    }

    public final iru<D> e() {
        IpChange ipChange = $ipChange;
        return (iru) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("2dccafae", new Object[]{this}) : this.e.getValue());
    }

    public abstract com.taobao.android.searchbaseframe.context.a f();

    public final void a(D d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a57f0c3", new Object[]{this, d});
            return;
        }
        q.c(d, "<set-?>");
        this.b = d;
    }

    public final D b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (D) ipChange.ipc$dispatch("5546d528", new Object[]{this});
        }
        D d = this.b;
        if (d == null) {
            q.b("initDataSource");
        }
        return d;
    }

    public final void b(f<D, C, ? extends hte, R> fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65226d1f", new Object[]{this, fVar});
            return;
        }
        q.c(fVar, "<set-?>");
        this.c = fVar;
    }

    public final f<D, C, ? extends hte, R> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("88296d22", new Object[]{this});
        }
        f<D, C, ? extends hte, R> fVar = this.c;
        if (fVar == null) {
            q.b("pageWidget");
        }
        return fVar;
    }

    public final void b(D ds) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dffc444", new Object[]{this, ds});
            return;
        }
        q.c(ds, "ds");
        this.b = ds;
    }

    public void a(D scopeDataSource, g childPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75ff73ee", new Object[]{this, scopeDataSource, childPage});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        q.c(childPage, "childPage");
        d().a((com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>) scopeDataSource);
    }

    public void a(f<D, C, ? extends hte, R> widget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efa846de", new Object[]{this, widget});
            return;
        }
        q.c(widget, "widget");
        this.c = widget;
        f<D, C, ? extends hte, R> fVar = this.c;
        if (fVar == null) {
            q.b("pageWidget");
        }
        fVar.u();
        D d = this.b;
        if (d == null) {
            q.b("initDataSource");
        }
        d.setFlow(this);
    }

    public final boolean a(D scopeDataSource, C combo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbe2d4c3", new Object[]{this, scopeDataSource, combo})).booleanValue();
        }
        q.c(scopeDataSource, "scopeDataSource");
        q.c(combo, "combo");
        if (combo.k() != MetaState.DEFAULT || combo.e()) {
            return false;
        }
        b((a<D, C, R>) scopeDataSource, (D) combo);
        combo.a(MetaState.LOADING_MORE);
        return true;
    }

    public void b(D scopeDataSource, C combo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad346440", new Object[]{this, scopeDataSource, combo});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        q.c(combo, "combo");
        scopeDataSource.doLoadMore(combo, null);
    }

    public final iru<D> x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iru) ipChange.ipc$dispatch("bffbf5bb", new Object[]{this}) : e();
    }

    public final iru<D> a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iru) ipChange.ipc$dispatch("e663039f", new Object[]{this, new Integer(i)});
        }
        D d = this.b;
        if (d == null) {
            q.b("initDataSource");
        }
        if (a(i, (int) d)) {
            D d2 = this.b;
            if (d2 == null) {
                q.b("initDataSource");
            }
            d2.setIndex(i);
            return e();
        }
        f<D, C, ? extends hte, R> fVar = this.c;
        if (fVar == null) {
            q.b("pageWidget");
        }
        TabBean a2 = ((com.taobao.android.meta.structure.page.a) fVar.K()).a(i);
        D d3 = this.b;
        if (d3 == null) {
            q.b("initDataSource");
        }
        iru<D> a3 = a(i, a2, (TabBean) d3);
        a3.d().setFlow(this);
        a3.d().setInitDataSource(false);
        a3.d().setIndex(i);
        return a3;
    }

    @Override // com.taobao.android.meta.logic.c
    public void a(D initDataSource, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30a6da71", new Object[]{this, initDataSource, new Boolean(z)});
            return;
        }
        q.c(initDataSource, "initDataSource");
        MetaResult<C> it = (MetaResult) initDataSource.getTotalSearchResult();
        if (it != null && z) {
            f<D, C, ? extends hte, R> fVar = this.c;
            if (fVar == null) {
                q.b("pageWidget");
            }
            q.a((Object) it, "it");
            fVar.c(it);
            return;
        }
        f<D, C, ? extends hte, R> fVar2 = this.c;
        if (fVar2 == null) {
            q.b("pageWidget");
        }
        fVar2.t();
        ioy srpLifeCycleWatcher = initDataSource.getSrpLifeCycleWatcher();
        if (srpLifeCycleWatcher == null) {
            return;
        }
        srpLifeCycleWatcher.i(null);
    }

    @Override // com.taobao.android.meta.logic.c
    public void c(D scopeDataSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a797c5", new Object[]{this, scopeDataSource});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        f<D, C, ? extends hte, R> fVar = this.c;
        if (fVar == null) {
            q.b("pageWidget");
        }
        g b = fVar.b(scopeDataSource.getIndex());
        if (b == null) {
            return;
        }
        b.w();
    }

    @Override // com.taobao.android.meta.logic.c
    public void b(D scopeDataSource, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f97710", new Object[]{this, scopeDataSource, new Boolean(z)});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        f<D, C, ? extends hte, R> fVar = this.c;
        if (fVar == null) {
            q.b("pageWidget");
        }
        g b = fVar.b(scopeDataSource.getIndex());
        if (b == null) {
            return;
        }
        if (z) {
            b.b(true);
            return;
        }
        b.x();
        ioy srpLifeCycleWatcher = scopeDataSource.getSrpLifeCycleWatcher();
        if (srpLifeCycleWatcher == null) {
            return;
        }
        srpLifeCycleWatcher.i(null);
    }

    @Override // com.taobao.android.meta.logic.c
    public void a(D scopeDataSource, C c, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3da1cf0", new Object[]{this, scopeDataSource, c, new Boolean(z), map});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        if (c == null) {
            return;
        }
        if (z) {
            c.a(MetaState.LOADING_MORE);
        } else {
            c.a(MetaState.UPDATING);
        }
    }

    @Override // com.taobao.android.meta.logic.c
    public void a(D scopeDataSource, C c, boolean z, boolean z2, com.taobao.android.meta.data.e<C> config) {
        MetaState metaState;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be9c0f7", new Object[]{this, scopeDataSource, c, new Boolean(z), new Boolean(z2), config});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        q.c(config, "config");
        if (c == null) {
            return;
        }
        if (!z) {
            if (z2) {
                metaState = c.f() ? MetaState.DEFAULT : MetaState.EMPTY;
            } else {
                metaState = MetaState.UPDATE_ERROR;
            }
            c.a(metaState);
            return;
        }
        c.a(z2 ? MetaState.DEFAULT : MetaState.LOAD_MORE_ERROR);
        g d = d(scopeDataSource);
        if (d == null) {
            return;
        }
        d.o();
    }

    public boolean a(D scopeDataSource, C combo, ListStyle newStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0a1b7b2", new Object[]{this, scopeDataSource, combo, newStyle})).booleanValue();
        }
        q.c(scopeDataSource, "scopeDataSource");
        q.c(combo, "combo");
        q.c(newStyle, "newStyle");
        combo.a(newStyle);
        f<D, C, ? extends hte, R> fVar = this.c;
        if (fVar == null) {
            q.b("pageWidget");
        }
        g b = fVar.b(scopeDataSource.getIndex());
        if (b != null) {
            b.a(newStyle);
        }
        return true;
    }

    public final g d(D scopeDataSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("40e12d87", new Object[]{this, scopeDataSource});
        }
        q.c(scopeDataSource, "scopeDataSource");
        return b(scopeDataSource.getIndex());
    }

    public final g b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("b994a37b", new Object[]{this, new Integer(i)});
        }
        f<D, C, ? extends hte, R> fVar = this.c;
        if (fVar == null) {
            q.b("pageWidget");
        }
        return fVar.b(i);
    }

    public iru<D> e(D initDataSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iru) ipChange.ipc$dispatch("bf9aaef3", new Object[]{this, initDataSource});
        }
        q.c(initDataSource, "initDataSource");
        return new iru<>(d(), initDataSource);
    }

    public final irt<D> a(D initDataSource, com.taobao.android.searchbaseframe.context.a searchContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (irt) ipChange.ipc$dispatch("2f3c65c", new Object[]{this, initDataSource, searchContext});
        }
        q.c(initDataSource, "initDataSource");
        q.c(searchContext, "searchContext");
        return new irt<>(initDataSource, searchContext);
    }

    public final void a(D scopeDataSource, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17912d1", new Object[]{this, scopeDataSource, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        g d = d(scopeDataSource);
        if (d == null) {
            return;
        }
        d.a(i, i2, z);
    }

    public final void a(int i, int i2, int i3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d1660f9", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z)});
            return;
        }
        g b = b(i);
        if (b == null) {
            return;
        }
        b.a(i2, i3, z);
    }

    public final void a(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619b90c", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        g b = b(i);
        if (b == null) {
            return;
        }
        b.b(i2, z);
    }

    public void a(D scopeDataSource, iuk<?, ?> widget, boolean z, htf htfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bba12196", new Object[]{this, scopeDataSource, widget, new Boolean(z), htfVar});
            return;
        }
        q.c(scopeDataSource, "scopeDataSource");
        q.c(widget, "widget");
        g d = d(scopeDataSource);
        if (d == null) {
            return;
        }
        d.a(widget, z, htfVar, 0);
    }
}
