package com.taobao.android.meta.structure.list;

import android.app.Activity;
import android.support.v4.util.SparseArrayCompat;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.structure.state.MetaState;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.meta.datasource.ComboOp;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.xsl.section.a;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import kotlin.reflect.k;
import tb.Cint;
import tb.hte;
import tb.inv;
import tb.inw;
import tb.iru;
import tb.isp;
import tb.isr;
import tb.isu;
import tb.isx;
import tb.iti;
import tb.kge;

/* loaded from: classes6.dex */
public class f extends inw<b, h> implements com.taobao.android.meta.structure.list.a, a.b, iti {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ k[] f14292a;
    private int d;
    private boolean e;
    private final kotlin.d f;
    private com.taobao.android.searchbaseframe.business.weex.multiplelist.a g;
    private final SparseArrayCompat<Long> h;
    private final SparseArrayCompat<Boolean> i;
    private final SparseArrayCompat<Boolean> j;
    private BaseSearchResult k;
    private com.taobao.android.searchbaseframe.datasource.b l;
    private final hte m;

    /* loaded from: classes6.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ((b) f.this.getIView()).a();
            }
        }
    }

    static {
        kge.a(-144445881);
        kge.a(-1986084902);
        kge.a(-724678880);
        kge.a(2033269671);
        f14292a = new k[]{t.a(new PropertyReference1Impl(t.b(f.class), "layoutHelper", "getLayoutHelper()Lcom/taobao/android/searchbaseframe/xsl/section/CellLayoutHelper;"))};
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2030367373:
                super.a((isr.a) objArr[0]);
                return null;
            case -1474194533:
                super.a(((Number) objArr[0]).intValue());
                return null;
            case -1445565382:
                super.b(((Number) objArr[0]).intValue());
                return null;
            case -782217418:
                super.aq_();
                return null;
            case 267248023:
                super.init();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    private final com.taobao.android.searchbaseframe.xsl.section.a m() {
        IpChange ipChange = $ipChange;
        return (com.taobao.android.searchbaseframe.xsl.section.a) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("a3eb44a6", new Object[]{this}) : this.f.getValue());
    }

    @Override // tb.inw
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        }
    }

    public f(hte metaConfig) {
        q.c(metaConfig, "metaConfig");
        this.m = metaConfig;
        this.e = true;
        this.f = kotlin.e.a(new MetaListPresenter$layoutHelper$2(this));
        this.h = new SparseArrayCompat<>();
        this.i = new SparseArrayCompat<>();
        this.j = new SparseArrayCompat<>();
    }

    public static final /* synthetic */ void a(f fVar, com.taobao.android.searchbaseframe.business.weex.multiplelist.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7126f225", new Object[]{fVar, aVar});
        } else {
            fVar.g = aVar;
        }
    }

    @Override // tb.inw
    public /* bridge */ /* synthetic */ inv a(h hVar, int i, iru iruVar, ListStyle listStyle, Activity activity) {
        return a2(hVar, i, (iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>>) iruVar, listStyle, activity);
    }

    @Override // tb.inw
    public float e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[]{this})).floatValue() : this.m.t();
    }

    @Override // tb.inw
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        h widget = (h) getWidget();
        q.a((Object) widget, "widget");
        if (((iru) widget.getModel()).a().d()) {
            d(i);
        } else {
            super.a(i);
        }
    }

    @Override // tb.inw, tb.iuh
    public void init() {
        com.taobao.android.searchbaseframe.datasource.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        super.init();
        ((h) getWidget()).g();
        a(false);
        c(this.m.A());
        com.taobao.android.searchbaseframe.business.srp.a D = this.m.D();
        if (D != null) {
            h widget = (h) getWidget();
            q.a((Object) widget, "widget");
            iru iruVar = (iru) widget.getModel();
            q.a((Object) iruVar, "widget.model");
            com.taobao.android.searchbaseframe.datasource.impl.a<?, ?> d = iruVar.d();
            h widget2 = (h) getWidget();
            q.a((Object) widget2, "widget");
            bVar = D.a(d, (iru) widget2.getModel());
        } else {
            bVar = null;
        }
        this.l = bVar;
        O();
    }

    public void a(SparseArrayCompat<Boolean> sparseArrayCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c1ef9da", new Object[]{this, sparseArrayCompat});
            return;
        }
        b iView = (b) getIView();
        q.a((Object) iView, "iView");
        RecyclerView l = iView.l();
        q.a((Object) l, "iView.recyclerView");
        ((b) getIView()).a(l.getHeight(), sparseArrayCompat);
    }

    public void a(int i, BaseCellBean baseCellBean, long j, BaseSearchResult baseSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bba126a1", new Object[]{this, new Integer(i), baseCellBean, new Long(j), baseSearchResult});
            return;
        }
        com.taobao.android.searchbaseframe.datasource.b bVar = this.l;
        if (bVar != null) {
            bVar.a(i, baseCellBean, j, baseSearchResult, p());
        }
        b iView = (b) getIView();
        q.a((Object) iView, "iView");
        RecyclerView l = iView.l();
        if (l == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView");
        }
        PartnerRecyclerView partnerRecyclerView = (PartnerRecyclerView) l;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = partnerRecyclerView.findViewHolderForAdapterPosition(partnerRecyclerView.getHeaderViewsCount() + i);
        if (!(findViewHolderForAdapterPosition instanceof Cint)) {
            return;
        }
        Cint cint = (Cint) findViewHolderForAdapterPosition;
        h hVar = (h) getWidget();
        if (hVar == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.PreciseCellExposeableList");
        }
        cint.b(hVar);
    }

    public void a(int i, BaseCellBean baseCellBean, BaseSearchResult baseSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9244546b", new Object[]{this, new Integer(i), baseCellBean, baseSearchResult});
            return;
        }
        com.taobao.android.searchbaseframe.datasource.b bVar = this.l;
        if (bVar != null) {
            bVar.a(i, baseCellBean, baseSearchResult, p());
        }
        b iView = (b) getIView();
        q.a((Object) iView, "iView");
        RecyclerView l = iView.l();
        if (l == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView");
        }
        PartnerRecyclerView partnerRecyclerView = (PartnerRecyclerView) l;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = partnerRecyclerView.findViewHolderForAdapterPosition(partnerRecyclerView.getHeaderViewsCount() + i);
        if (!(findViewHolderForAdapterPosition instanceof Cint)) {
            return;
        }
        Cint cint = (Cint) findViewHolderForAdapterPosition;
        h hVar = (h) getWidget();
        if (hVar == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.PreciseCellExposeableList");
        }
        cint.a(hVar);
    }

    private final void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4366752", new Object[]{this});
            return;
        }
        com.taobao.android.searchbaseframe.datasource.impl.a datasource = p();
        q.a((Object) datasource, "datasource");
        BaseSearchResult baseSearchResult = (BaseSearchResult) datasource.getTotalSearchResult();
        if (baseSearchResult == null) {
            return;
        }
        b(baseSearchResult);
        long currentTimeMillis = System.currentTimeMillis();
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            int keyAt = this.h.keyAt(i);
            Long l = this.h.get(keyAt);
            q.a((Object) l, "visibleItems.get(position)");
            long longValue = currentTimeMillis - l.longValue();
            if (keyAt < baseSearchResult.getCellsCount()) {
                a(keyAt, baseSearchResult.getCell(keyAt), longValue, baseSearchResult);
            }
        }
        this.h.clear();
    }

    private final void b(BaseSearchResult baseSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ccea2f", new Object[]{this, baseSearchResult});
            return;
        }
        BaseSearchResult baseSearchResult2 = this.k;
        if (!(!q.a(baseSearchResult, baseSearchResult2))) {
            return;
        }
        this.k = baseSearchResult;
        long currentTimeMillis = System.currentTimeMillis();
        int size = this.h.size();
        for (int i = 0; i < size; i++) {
            int keyAt = this.h.keyAt(i);
            Long l = this.h.get(keyAt);
            q.a((Object) l, "visibleItems.get(position)");
            long longValue = currentTimeMillis - l.longValue();
            if (baseSearchResult2 != null && keyAt < baseSearchResult2.getCellsCount()) {
                a(keyAt, baseSearchResult2.getCell(keyAt), longValue, baseSearchResult2);
            }
        }
        this.h.clear();
    }

    @Override // com.taobao.android.meta.structure.list.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!this.m.C()) {
        } else {
            a(this.i);
            L();
        }
    }

    private final void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
        } else if (A()) {
            com.taobao.android.searchbaseframe.datasource.impl.a datasource = p();
            q.a((Object) datasource, "datasource");
            BaseSearchResult baseSearchResult = (BaseSearchResult) datasource.getTotalSearchResult();
            if (baseSearchResult == null) {
                return;
            }
            b(baseSearchResult);
            this.j.clear();
            int size = this.h.size();
            for (int i = 0; i < size; i++) {
                int keyAt = this.h.keyAt(i);
                if (this.i.get(keyAt) == null) {
                    this.j.append(keyAt, true);
                } else {
                    this.i.remove(keyAt);
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            int size2 = this.i.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.h.append(this.i.keyAt(i2), Long.valueOf(currentTimeMillis));
            }
            int size3 = this.j.size();
            for (int i3 = 0; i3 < size3; i3++) {
                int keyAt2 = this.j.keyAt(i3);
                Long l = this.h.get(keyAt2);
                q.a((Object) l, "visibleItems.get(position)");
                long longValue = currentTimeMillis - l.longValue();
                if (keyAt2 < baseSearchResult.getCellsCount()) {
                    a(keyAt2, baseSearchResult.getCell(keyAt2), longValue, baseSearchResult);
                }
                this.h.remove(keyAt2);
            }
            int size4 = this.h.size();
            for (int i4 = 0; i4 < size4; i4++) {
                int keyAt3 = this.h.keyAt(i4);
                if (keyAt3 < baseSearchResult.getCellsCount()) {
                    a(keyAt3, baseSearchResult.getCell(keyAt3), baseSearchResult);
                }
            }
        }
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public inv<? extends iru<?>> a2(h widget, int i, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar, ListStyle uiStyle, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (inv) ipChange.ipc$dispatch("c38e3b0", new Object[]{this, widget, new Integer(i), iruVar, uiStyle, activity});
        }
        q.c(widget, "widget");
        q.c(uiStyle, "uiStyle");
        q.c(activity, "activity");
        h hVar = widget;
        if (iruVar != null) {
            d dVar = new d(uiStyle, activity, hVar, iruVar, i, this.m);
            dVar.a((iti) this);
            return dVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.widget.WidgetModelAdapter<out com.taobao.android.meta.data.MetaDataSource<out com.taobao.android.meta.data.MetaCombo, com.taobao.android.meta.data.MetaResult<out com.taobao.android.meta.data.MetaCombo>>>");
    }

    @Override // com.taobao.android.meta.structure.list.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        w();
        d();
    }

    @Override // tb.inw, com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.a
    public void aq_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1604f36", new Object[]{this});
            return;
        }
        super.aq_();
        d();
    }

    @Override // com.taobao.android.meta.structure.list.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        w();
        K();
    }

    @Override // tb.inw
    public void a(isr.a event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86fb0d73", new Object[]{this, event});
            return;
        }
        q.c(event, "event");
        com.taobao.android.meta.logic.a<com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>, com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>> a2 = ((h) getWidget()).a();
        com.taobao.android.meta.data.a it = event.b;
        if (it != null) {
            h widget = (h) getWidget();
            q.a((Object) widget, "widget");
            iru iruVar = (iru) widget.getModel();
            q.a((Object) iruVar, "widget.model");
            com.taobao.android.searchbaseframe.datasource.impl.a d = iruVar.d();
            if (d == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.meta.data.MetaDataSource<com.taobao.android.meta.data.MetaCombo, com.taobao.android.meta.data.MetaResult<com.taobao.android.meta.data.MetaCombo>>");
            }
            q.a((Object) it, "it");
            ListStyle listStyle = event.f29282a;
            q.a((Object) listStyle, "event.toStyle");
            if (a2.a((com.taobao.android.meta.logic.a<com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>, com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>) ((com.taobao.android.meta.data.b) d), (com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>) it, listStyle)) {
                return;
            }
        }
        super.a(event);
    }

    private final void M() {
        float e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4529654", new Object[]{this});
            return;
        }
        h widget = (h) getWidget();
        q.a((Object) widget, "widget");
        iru iruVar = (iru) widget.getModel();
        q.a((Object) iruVar, "widget.model");
        com.taobao.android.searchbaseframe.datasource.impl.a ds = iruVar.d();
        q.a((Object) ds, "ds");
        BaseSearchResult baseSearchResult = (BaseSearchResult) ds.getTotalSearchResult();
        ListStyle uIListStyle = ds.getUIListStyle();
        q.a((Object) uIListStyle, "ds.uiListStyle");
        inv mAdapter = this.b;
        q.a((Object) mAdapter, "mAdapter");
        if (uIListStyle == mAdapter.c()) {
            return;
        }
        if (baseSearchResult != null && baseSearchResult.getMainInfo().wfgap >= 0) {
            e = baseSearchResult.getMainInfo().wfgap;
        } else {
            e = e();
        }
        int a2 = a(e);
        inv mAdapter2 = this.b;
        q.a((Object) mAdapter2, "mAdapter");
        mAdapter2.c(a2);
        ((b) getIView()).a(uIListStyle);
        ((b) getIView()).b(a2);
        inv mAdapter3 = this.b;
        q.a((Object) mAdapter3, "mAdapter");
        mAdapter3.a(uIListStyle);
    }

    public void onEventMainThread(isp ispVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5b6342f", new Object[]{this, ispVar});
            return;
        }
        h widget = (h) getWidget();
        q.a((Object) widget, "widget");
        iru iruVar = (iru) widget.getModel();
        q.a((Object) iruVar, "widget.model");
        com.taobao.android.searchbaseframe.datasource.impl.a d = iruVar.d();
        q.a((Object) d, "widget.model.scopeDatasource");
        BaseSearchResult baseSearchResult = (BaseSearchResult) d.getTotalSearchResult();
        if (baseSearchResult == null || !baseSearchResult.hasSectionClip()) {
            return;
        }
        m().b();
    }

    private final void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460add5", new Object[]{this});
            return;
        }
        h widget = (h) getWidget();
        q.a((Object) widget, "widget");
        iru iruVar = (iru) widget.getModel();
        q.a((Object) iruVar, "widget.model");
        com.taobao.android.searchbaseframe.datasource.impl.a d = iruVar.d();
        q.a((Object) d, "widget.model.scopeDatasource");
        BaseSearchResult baseSearchResult = (BaseSearchResult) d.getTotalSearchResult();
        if (baseSearchResult == null || !baseSearchResult.hasSectionClip()) {
            return;
        }
        if (baseSearchResult == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.meta.data.MetaResult<com.taobao.android.meta.data.MetaCombo>");
        }
        m().a(((MetaResult) baseSearchResult).getValidCells());
    }

    @Override // com.taobao.android.meta.structure.list.a
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.d = 0;
        h widget = (h) getWidget();
        q.a((Object) widget, "widget");
        iru iruVar = (iru) widget.getModel();
        q.a((Object) iruVar, "widget.model");
        com.taobao.android.searchbaseframe.datasource.impl.a d = iruVar.d();
        q.a((Object) d, "widget.model.scopeDatasource");
        BaseSearchResult baseSearchResult = (BaseSearchResult) d.getTotalSearchResult();
        if (baseSearchResult == null) {
            return;
        }
        boolean z3 = this.e;
        if (z3) {
            r();
            this.e = false;
        } else {
            M();
        }
        if (baseSearchResult == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.meta.data.MetaResult<com.taobao.android.meta.data.MetaCombo>");
        }
        MetaResult metaResult = (MetaResult) baseSearchResult;
        List<ComboOp> updateItems = metaResult.updateItems();
        if (!updateItems.isEmpty() && !z) {
            if (this.m.G()) {
                t().notifyDataSetChanged();
            } else {
                b iView = (b) getIView();
                q.a((Object) iView, "iView");
                RecyclerView l = iView.l();
                if (l == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView");
                }
                int headerViewsCount = ((PartnerRecyclerView) l).getHeaderViewsCount();
                for (ComboOp comboOp : updateItems) {
                    comboOp.a(headerViewsCount, t());
                }
                RecyclerView.Adapter t = t();
                if (t == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.meta.structure.list.MetaListAdapter");
                }
                ((d) t).h();
            }
            if (this.m.j()) {
                b iView2 = (b) getIView();
                q.a((Object) iView2, "iView");
                RecyclerView l2 = iView2.l();
                q.a((Object) l2, "iView.recyclerView");
                RecyclerView.LayoutManager layoutManager = l2.getLayoutManager();
                if (layoutManager == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.StaggeredGridLayoutManager");
                }
                ((StaggeredGridLayoutManager) layoutManager).invalidateSpanAssignments();
            }
        } else if (!z3) {
            t().notifyDataSetChanged();
        }
        N();
        this.c.clear();
        b bVar = (b) getIView();
        if (metaResult.getBarrierBean() != null) {
            z2 = false;
        }
        bVar.a(z2);
    }

    private final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ec556", new Object[]{this});
        } else {
            this.m.y().a(new MetaListPresenter$initItemBackground$1(this));
        }
    }

    @Override // com.taobao.android.searchbaseframe.xsl.section.g.a
    public com.taobao.android.searchbaseframe.business.weex.multiplelist.a h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.searchbaseframe.business.weex.multiplelist.a) ipChange.ipc$dispatch("37248493", new Object[]{this}) : this.g;
    }

    @Override // com.taobao.android.searchbaseframe.xsl.section.a.b
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        h widget = (h) getWidget();
        q.a((Object) widget, "widget");
        widget.getActivity().runOnUiThread(new a());
    }

    @Override // tb.inw, com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.a
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        super.b(i);
        this.d = i;
    }

    @Override // tb.inw
    public int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : this.m.B();
    }

    @Override // tb.inw, com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.a
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            b(false);
        }
    }

    @Override // com.taobao.android.meta.structure.list.a
    public void b(boolean z) {
        com.taobao.android.meta.data.a combo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        h widget = (h) getWidget();
        q.a((Object) widget, "widget");
        iru iruVar = (iru) widget.getModel();
        q.a((Object) iruVar, "widget.model");
        com.taobao.android.searchbaseframe.datasource.impl.a dataSource = iruVar.d();
        q.a((Object) dataSource, "dataSource");
        BaseSearchResult baseSearchResult = (BaseSearchResult) dataSource.getTotalSearchResult();
        if (baseSearchResult == null || this.d > baseSearchResult.getCellsCount() || baseSearchResult.getCellsCount() == 0 || (combo = baseSearchResult.getCell(Math.max(this.d - 1, 0)).combo) == null) {
            return;
        }
        if (z) {
            combo.a(MetaState.DEFAULT);
        }
        com.taobao.android.meta.logic.a<com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>, com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>> a2 = ((h) getWidget()).a();
        h widget2 = (h) getWidget();
        q.a((Object) widget2, "widget");
        iru iruVar2 = (iru) widget2.getModel();
        q.a((Object) iruVar2, "widget.model");
        com.taobao.android.searchbaseframe.datasource.impl.a d = iruVar2.d();
        if (d == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.meta.data.MetaDataSource<com.taobao.android.meta.data.MetaCombo, com.taobao.android.meta.data.MetaResult<com.taobao.android.meta.data.MetaCombo>>");
        }
        q.a((Object) combo, "combo");
        if (!a2.a((com.taobao.android.meta.logic.a<com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>, com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>) ((com.taobao.android.meta.data.b) d), (com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>) combo)) {
            return;
        }
        ((h) getWidget()).k();
    }

    @Override // tb.iti
    public void a(BaseCellBean cellBean, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4793309", new Object[]{this, cellBean, new Integer(i)});
            return;
        }
        q.c(cellBean, "cellBean");
        com.taobao.android.meta.data.a it = cellBean.combo;
        if (it == null) {
            return;
        }
        com.taobao.android.meta.logic.a<com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>, com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>> a2 = ((h) getWidget()).a();
        h widget = (h) getWidget();
        q.a((Object) widget, "widget");
        iru iruVar = (iru) widget.getModel();
        q.a((Object) iruVar, "widget.model");
        com.taobao.android.searchbaseframe.datasource.impl.a d = iruVar.d();
        if (d == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.meta.data.MetaDataSource<com.taobao.android.meta.data.MetaCombo, com.taobao.android.meta.data.MetaResult<com.taobao.android.meta.data.MetaCombo>>");
        }
        q.a((Object) it, "it");
        a2.a((com.taobao.android.meta.logic.a<com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>, com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>) ((com.taobao.android.meta.data.b) d), (com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>) it, i);
    }

    @Override // tb.inw, com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.a
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        ((h) getWidget()).postScopeEvent(isu.c.a(i), "childPageWidget");
        ((h) getWidget()).c(i);
    }

    @Override // com.taobao.android.searchbaseframe.xsl.section.SectionLayout.a
    public void a(int i, int i2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26197cfc", new Object[]{this, new Integer(i), new Integer(i2), new Long(j)});
        } else {
            b(new isx(i, i2, j));
        }
    }
}
