package com.taobao.search.refactor;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.common.util.r;
import com.taobao.search.refactor.list.c;
import com.taobao.search.sf.datasource.CommonSearchResult;
import java.util.List;
import kotlin.TypeCastException;
import tb.ipk;
import tb.iru;
import tb.kge;
import tb.noa;
import tb.nsp;
import tb.ntr;
import tb.nwf;

/* loaded from: classes7.dex */
public final class l extends com.taobao.android.meta.structure.list.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<com.taobao.android.meta.structure.list.e> f19315a;
    private boolean b;
    private Boolean g;

    static {
        kge.a(-725223952);
    }

    public static /* synthetic */ Object ipc$super(l lVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.taobao.android.meta.structure.list.h widget) {
        super(widget);
        kotlin.jvm.internal.q.c(widget, "widget");
        this.b = true;
        this.f19315a = kotlin.collections.p.c(new com.taobao.search.refactor.list.a(widget), new c(widget), new com.taobao.search.refactor.list.e(widget));
        iru iruVar = (iru) widget.getModel();
        kotlin.jvm.internal.q.a((Object) iruVar, "widget.model");
        if (kotlin.jvm.internal.q.a((Object) iruVar.d().getParamValue("m"), (Object) noa.VALUE_MODULE_INSHOP)) {
            this.f19315a.add(new com.taobao.search.refactor.list.f(widget));
        }
    }

    private final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        if (this.g == null) {
            iru iruVar = (iru) i().getModel();
            kotlin.jvm.internal.q.a((Object) iruVar, "widget.model");
            com.taobao.android.searchbaseframe.datasource.impl.a d = iruVar.d();
            kotlin.jvm.internal.q.a((Object) d, "widget.model.scopeDatasource");
            BaseSearchResult baseSearchResult = (BaseSearchResult) d.getTotalSearchResult();
            if (baseSearchResult != null) {
                if (baseSearchResult != null) {
                    this.g = Boolean.valueOf(((CommonSearchResult) baseSearchResult).newSearch);
                    Boolean bool = this.g;
                    if (bool == null) {
                        kotlin.jvm.internal.q.a();
                    }
                    return bool.booleanValue();
                }
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonSearchResult");
            }
            this.g = false;
        }
        Boolean bool2 = this.g;
        if (bool2 == null) {
            kotlin.jvm.internal.q.a();
        }
        return bool2.booleanValue();
    }

    @Override // com.taobao.android.meta.structure.list.e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        i().postEvent(new nwf.a());
        ntr ntrVar = ntr.INSTANCE;
        Activity activity = i().getActivity();
        kotlin.jvm.internal.q.a((Object) activity, "widget.activity");
        ntrVar.a(activity, "pageState", "isScrolling", "true");
        for (com.taobao.android.meta.structure.list.e eVar : this.f19315a) {
            eVar.a();
        }
    }

    @Override // com.taobao.android.meta.structure.list.e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (!k()) {
            l();
        }
        ntr ntrVar = ntr.INSTANCE;
        Activity activity = i().getActivity();
        kotlin.jvm.internal.q.a((Object) activity, "widget.activity");
        ntrVar.a(activity, "pageState", "isScrolling", "false");
        for (com.taobao.android.meta.structure.list.e eVar : this.f19315a) {
            eVar.b();
        }
    }

    @Override // com.taobao.android.meta.structure.list.e
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        for (com.taobao.android.meta.structure.list.e eVar : this.f19315a) {
            eVar.c();
        }
    }

    @Override // com.taobao.android.meta.structure.list.e
    public void a(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b84a965", new Object[]{this, listStyle});
            return;
        }
        kotlin.jvm.internal.q.c(listStyle, "listStyle");
        for (com.taobao.android.meta.structure.list.e eVar : this.f19315a) {
            eVar.a(listStyle);
        }
    }

    private final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        com.taobao.android.meta.structure.list.b bVar = (com.taobao.android.meta.structure.list.b) i().J();
        kotlin.jvm.internal.q.a((Object) bVar, "widget.iView");
        RecyclerView l = bVar.l();
        kotlin.jvm.internal.q.a((Object) l, "widget.iView.recyclerView");
        RecyclerView.LayoutManager layoutManager = l.getLayoutManager();
        kotlin.jvm.internal.q.a((Object) layoutManager, "widget.iView.recyclerView.layoutManager");
        View childAt = layoutManager.getChildAt(0);
        if (childAt == null) {
            return;
        }
        com.taobao.android.meta.structure.list.b bVar2 = (com.taobao.android.meta.structure.list.b) i().J();
        kotlin.jvm.internal.q.a((Object) bVar2, "widget.iView");
        int childAdapterPosition = bVar2.l().getChildAdapterPosition(childAt);
        iru iruVar = (iru) i().getModel();
        kotlin.jvm.internal.q.a((Object) iruVar, "widget.model");
        com.taobao.android.searchbaseframe.datasource.impl.a b = iruVar.b();
        if (b == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.datasource.mainsearch.MainSearchDatasource");
        }
        ((nsp) b).b(childAdapterPosition);
    }

    @Override // com.taobao.android.meta.structure.list.e
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        for (com.taobao.android.meta.structure.list.e eVar : this.f19315a) {
            eVar.f();
        }
    }

    @Override // com.taobao.android.meta.structure.list.e
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        for (com.taobao.android.meta.structure.list.e eVar : this.f19315a) {
            eVar.g();
        }
    }

    @Override // com.taobao.android.meta.structure.list.e
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (this.b) {
            this.b = false;
            if (!k()) {
                iru iruVar = (iru) i().getModel();
                kotlin.jvm.internal.q.a((Object) iruVar, "widget.model");
                com.taobao.android.searchbaseframe.datasource.impl.a d = iruVar.d();
                kotlin.jvm.internal.q.a((Object) d, "widget.model.scopeDatasource");
                BaseSearchResult baseSearchResult = (BaseSearchResult) d.getTotalSearchResult();
                if (baseSearchResult == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonSearchResult");
                }
                int b = ((CommonSearchResult) baseSearchResult).isPrePaging ? r.b(4) : -1;
                com.taobao.android.meta.structure.list.b bVar = (com.taobao.android.meta.structure.list.b) i().J();
                kotlin.jvm.internal.q.a((Object) bVar, "widget.iView");
                RecyclerView l = bVar.l();
                if (l == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView");
                }
                ((PartnerRecyclerView) l).setPreRequestCellThreshold(b);
            }
        }
        for (com.taobao.android.meta.structure.list.e eVar : this.f19315a) {
            eVar.d();
        }
    }

    @Override // com.taobao.android.meta.structure.list.e
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        n();
        if (k()) {
            return;
        }
        l();
        for (com.taobao.android.meta.structure.list.e eVar : this.f19315a) {
            eVar.e();
        }
    }

    @Override // com.taobao.android.meta.structure.list.e
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        for (com.taobao.android.meta.structure.list.e eVar : this.f19315a) {
            eVar.h();
        }
    }

    private final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (!(i().getActivity() instanceof ipk)) {
        } else {
            Activity activity = i().getActivity();
            if (activity == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.performance.M3CardManagerHolder");
            }
            ((ipk) activity).d().a();
        }
    }
}
