package com.taobao.android.meta.structure.list;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.xsearchplugin.muise.MusTrimMemoryManager;
import com.taobao.android.xsearchplugin.muise.j;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.TypeCastException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import kotlin.reflect.k;
import tb.hte;
import tb.hto;
import tb.htq;
import tb.htt;
import tb.iny;
import tb.irq;
import tb.iru;
import tb.ise;
import tb.iuh;
import tb.iuj;
import tb.iuk;
import tb.iul;
import tb.ium;
import tb.iuo;
import tb.iur;
import tb.kge;

/* loaded from: classes6.dex */
public class h extends iny<FrameLayout, com.taobao.android.meta.structure.list.b, com.taobao.android.meta.structure.list.a, iru<? extends com.taobao.android.meta.data.b<? extends com.taobao.android.meta.data.a, ? extends MetaResult<? extends com.taobao.android.meta.data.a>>>> implements c, com.taobao.android.searchbaseframe.meta.uikit.b, j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ k[] f14300a;
    private final com.taobao.android.meta.logic.a<com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>, com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>> b;
    private final MusTrimMemoryManager c;
    private final kotlin.d d;
    private hte e;
    private final ArrayList<com.taobao.android.searchbaseframe.datasource.b> f;
    private e g;

    /* loaded from: classes6.dex */
    public static final class a implements htq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.htq
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                ((com.taobao.android.meta.structure.list.a) h.this.K()).b(true);
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ((com.taobao.android.meta.structure.list.a) h.this.K()).d();
            e a2 = h.a(h.this);
            if (a2 == null) {
                return;
            }
            a2.e();
        }
    }

    static {
        kge.a(-1265800443);
        kge.a(418331218);
        kge.a(164191806);
        kge.a(-1879861223);
        f14300a = new k[]{t.a(new PropertyReference1Impl(t.b(h.class), "stateWidget", "getStateWidget()Lcom/taobao/android/meta/structure/state/footer/MetaFootStateWidget;"))};
    }

    private final htt L() {
        IpChange ipChange = $ipChange;
        return (htt) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("6d731c6b", new Object[]{this}) : this.d.getValue());
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -782217418:
                super.aq_();
                return null;
            case -211767613:
                super.onComponentDestroy();
                return null;
            case 100226930:
                super.k();
                return null;
            case 102997493:
                super.n();
                return null;
            case 103921014:
                super.o();
                return null;
            case 593843865:
                super.onCtxDestroy();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.iny
    public iul a(irq irqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iul) ipChange.ipc$dispatch("f4d63a56", new Object[]{this, irqVar});
        }
        return null;
    }

    @Override // tb.iny
    public iul b(irq irqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iul) ipChange.ipc$dispatch("dc7810b5", new Object[]{this, irqVar});
        }
        return null;
    }

    @Override // tb.iny
    public iul c(irq irqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iul) ipChange.ipc$dispatch("c419e714", new Object[]{this, irqVar});
        }
        return null;
    }

    @Override // tb.iny
    public iul d(irq irqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iul) ipChange.ipc$dispatch("abbbbd73", new Object[]{this, irqVar});
        }
        return null;
    }

    public static final /* synthetic */ e a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("7e8f8871", new Object[]{hVar}) : hVar.g;
    }

    @Override // tb.iun
    public /* synthetic */ iuh d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iuh) ipChange.ipc$dispatch("261b13ff", new Object[]{this}) : b();
    }

    @Override // tb.iun
    public /* synthetic */ iuj f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iuj) ipChange.ipc$dispatch("357e5efb", new Object[]{this}) : e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Activity activity, ium parent, iru<? extends com.taobao.android.meta.data.b<? extends com.taobao.android.meta.data.a, ? extends MetaResult<? extends com.taobao.android.meta.data.a>>> model, ViewGroup viewGroup, iur iurVar) {
        super(activity, parent, model, viewGroup, iurVar);
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(model, "model");
        Object b2 = model.e().b("controller");
        if (b2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.meta.logic.BaseMetaPageController<com.taobao.android.meta.data.MetaDataSource<com.taobao.android.meta.data.MetaCombo, com.taobao.android.meta.data.MetaResult<com.taobao.android.meta.data.MetaCombo>>, com.taobao.android.meta.data.MetaCombo, com.taobao.android.meta.data.MetaResult<com.taobao.android.meta.data.MetaCombo>>");
        }
        this.b = (com.taobao.android.meta.logic.a) b2;
        this.c = new MusTrimMemoryManager(activity, model);
        this.d = kotlin.e.a(new MetaListWidget$stateWidget$2(this));
        this.f = new ArrayList<>();
    }

    public final com.taobao.android.meta.logic.a<com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>, com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.logic.a) ipChange.ipc$dispatch("4de54580", new Object[]{this}) : this.b;
    }

    private final hte M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hte) ipChange.ipc$dispatch("7524bff9", new Object[]{this});
        }
        hte hteVar = this.e;
        if (hteVar == null && (hteVar = ((iru) getModel()).a()) == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.meta.MetaConfig");
        }
        this.e = hteVar;
        return hteVar;
    }

    public com.taobao.android.meta.structure.list.a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.structure.list.a) ipChange.ipc$dispatch("96fa279", new Object[]{this}) : M().l().a(this.e);
    }

    public com.taobao.android.meta.structure.list.b e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.structure.list.b) ipChange.ipc$dispatch("35d64b75", new Object[]{this}) : M().m().a(this.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.View] */
    private final htt N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (htt) ipChange.ipc$dispatch("7cd66729", new Object[]{this});
        }
        irq creatorParam = I();
        q.a((Object) creatorParam, "creatorParam");
        creatorParam.g = new iuo();
        Activity activity = creatorParam.c;
        q.a((Object) activity, "param.activity");
        ium iumVar = creatorParam.d;
        q.a((Object) iumVar, "param.parent");
        iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar = creatorParam.e;
        if (iruVar != null) {
            htt httVar = new htt(activity, iumVar, iruVar, creatorParam.f, creatorParam.g);
            ((hto) httVar.K()).a(new a());
            httVar.attachToContainer();
            ((com.taobao.android.meta.structure.list.b) J()).e(httVar.getView());
            return httVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.widget.WidgetModelAdapter<out com.taobao.android.meta.data.MetaDataSource<com.taobao.android.meta.data.MetaCombo, com.taobao.android.meta.data.MetaResult<com.taobao.android.meta.data.MetaCombo>>>");
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        ise<h, ? extends e> i = M().i();
        this.g = i != null ? i.a(this) : null;
    }

    public void a(int i, boolean z, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e05b0b9", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2), new Integer(i3)});
        } else {
            ((com.taobao.android.meta.structure.list.b) J()).a(i, i2, z, i3);
        }
    }

    public void a(boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270908cc", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)});
        } else {
            ((com.taobao.android.meta.structure.list.b) J()).a(i, z, i2);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        ((com.taobao.android.meta.structure.list.a) K()).a();
        e eVar = this.g;
        if (eVar != null) {
            eVar.f();
        }
        this.c.b();
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        ((com.taobao.android.meta.structure.list.a) K()).b();
        e eVar = this.g;
        if (eVar != null) {
            eVar.g();
        }
        this.c.c();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        ((com.taobao.android.meta.structure.list.a) K()).a(z);
        j();
        e eVar = this.g;
        if (eVar != null) {
            eVar.d();
        }
        FrameLayout frameLayout = (FrameLayout) getView();
        if (frameLayout == null) {
            return;
        }
        frameLayout.post(new b());
    }

    public void a(ListStyle style) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b84a965", new Object[]{this, style});
            return;
        }
        q.c(style, "style");
        ((com.taobao.android.meta.structure.list.a) K()).a(style);
        e eVar = this.g;
        if (eVar == null) {
            return;
        }
        eVar.a(style);
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            L().g();
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        com.taobao.android.meta.structure.list.b iView = (com.taobao.android.meta.structure.list.b) J();
        q.a((Object) iView, "iView");
        RecyclerView l = iView.l();
        if (l == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView");
        }
        ((PartnerRecyclerView) l).invalidateScrollOffset();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View] */
    public void a(iuk<BaseTypedBean, ?> widget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee6429b9", new Object[]{this, widget});
            return;
        }
        q.c(widget, "widget");
        com.taobao.android.meta.structure.list.b bVar = (com.taobao.android.meta.structure.list.b) J();
        ?? view = widget.getView();
        if (view == 0) {
            q.a();
        }
        bVar.b((View) view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.view.View] */
    public void b(iuk<BaseTypedBean, ?> widget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dce7303a", new Object[]{this, widget});
            return;
        }
        q.c(widget, "widget");
        com.taobao.android.meta.structure.list.b iView = (com.taobao.android.meta.structure.list.b) J();
        q.a((Object) iView, "iView");
        RecyclerView l = iView.l();
        if (l == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView");
        }
        ((PartnerRecyclerView) l).addHeaderFrame();
        com.taobao.android.meta.structure.list.b bVar = (com.taobao.android.meta.structure.list.b) J();
        ?? view = widget.getView();
        if (view == 0) {
            q.a();
        }
        bVar.c(view);
    }

    @Override // tb.iny, com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.a
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        super.k();
        L().g();
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.b
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        com.taobao.android.meta.structure.list.b iView = (com.taobao.android.meta.structure.list.b) J();
        q.a((Object) iView, "iView");
        RecyclerView l = iView.l();
        q.a((Object) l, "iView.recyclerView");
        if (l.getScrollState() == 0) {
            return;
        }
        com.taobao.android.meta.structure.list.b iView2 = (com.taobao.android.meta.structure.list.b) J();
        q.a((Object) iView2, "iView");
        iView2.l().stopScroll();
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.b
    public boolean a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue();
        }
        com.taobao.android.meta.structure.list.b iView = (com.taobao.android.meta.structure.list.b) J();
        q.a((Object) iView, "iView");
        return iView.l().onInterceptTouchEvent(motionEvent);
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.b
    public boolean b(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74207cc2", new Object[]{this, motionEvent})).booleanValue();
        }
        com.taobao.android.meta.structure.list.b iView = (com.taobao.android.meta.structure.list.b) J();
        q.a((Object) iView, "iView");
        return iView.l().onTouchEvent(motionEvent);
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.b
    public int s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66a136d", new Object[]{this})).intValue();
        }
        com.taobao.android.meta.structure.list.b iView = (com.taobao.android.meta.structure.list.b) J();
        q.a((Object) iView, "iView");
        FrameLayout b2 = iView.b();
        q.a((Object) b2, "iView.view");
        ViewParent parent = b2.getParent();
        if (!(parent instanceof View)) {
            parent = null;
        }
        View view = (View) parent;
        if (view != null) {
            return com.taobao.android.searchbaseframe.meta.uikit.g.a(view);
        }
        return 0;
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.b
    public int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6782aee", new Object[]{this})).intValue();
        }
        com.taobao.android.meta.structure.list.b iView = (com.taobao.android.meta.structure.list.b) J();
        q.a((Object) iView, "iView");
        RecyclerView l = iView.l();
        if (l == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView");
        }
        return ((PartnerRecyclerView) l).getTotalScrollOffset();
    }

    @Override // tb.ins
    public void a(com.taobao.android.searchbaseframe.datasource.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79b9ad93", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            this.f.add(bVar);
        }
    }

    @Override // tb.inu
    public boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : M().C();
    }

    @Override // com.taobao.android.searchbaseframe.datasource.b
    public void a(int i, BaseTypedBean baseTypedBean, long j, BaseSearchResult baseSearchResult, com.taobao.android.searchbaseframe.datasource.impl.a<?, ?> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3136b669", new Object[]{this, new Integer(i), baseTypedBean, new Long(j), baseSearchResult, aVar});
            return;
        }
        Iterator<com.taobao.android.searchbaseframe.datasource.b> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().a(i, baseTypedBean, j, baseSearchResult, aVar);
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.b
    public void a(int i, BaseTypedBean baseTypedBean, BaseSearchResult baseSearchResult, com.taobao.android.searchbaseframe.datasource.impl.a<?, ?> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92aa8405", new Object[]{this, new Integer(i), baseTypedBean, baseSearchResult, aVar});
            return;
        }
        Iterator<com.taobao.android.searchbaseframe.datasource.b> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().a(i, baseTypedBean, baseSearchResult, aVar);
        }
    }

    @Override // tb.iny, com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.a
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        super.n();
        e eVar = this.g;
        if (eVar == null) {
            return;
        }
        eVar.a();
    }

    @Override // tb.iny, com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.a
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        super.o();
        e eVar = this.g;
        if (eVar == null) {
            return;
        }
        eVar.b();
    }

    @Override // tb.iny, com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.a
    public void aq_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1604f36", new Object[]{this});
            return;
        }
        super.aq_();
        e eVar = this.g;
        if (eVar == null) {
            return;
        }
        eVar.c();
    }

    @Override // tb.iut
    public void onCtxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        super.onCtxDestroy();
        destroyComponent();
        e eVar = this.g;
        if (eVar != null) {
            eVar.h();
        }
        this.c.e();
    }

    @Override // tb.iun, tb.iut
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.onComponentDestroy();
        e eVar = this.g;
        if (eVar != null) {
            eVar.h();
        }
        this.c.e();
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        com.taobao.android.meta.structure.list.b iView = (com.taobao.android.meta.structure.list.b) J();
        q.a((Object) iView, "iView");
        RecyclerView l = iView.l();
        if (l == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView");
        }
        PartnerRecyclerView partnerRecyclerView = (PartnerRecyclerView) l;
        ((com.taobao.android.meta.structure.list.b) J()).d();
        try {
            if (M().V() || b(partnerRecyclerView.getHeaderFrame())) {
                return;
            }
            partnerRecyclerView.removeHeaderFrame();
        } catch (Exception unused) {
        }
    }

    private final boolean b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9103724d", new Object[]{this, view})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        return (view.getPaddingTop() == 0 && view.getPaddingBottom() == 0) ? false : true;
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else {
            ((com.taobao.android.meta.structure.list.b) J()).cW_();
        }
    }

    public ViewGroup u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("5cc5cc19", new Object[]{this});
        }
        com.taobao.android.meta.structure.list.b iView = (com.taobao.android.meta.structure.list.b) J();
        q.a((Object) iView, "iView");
        ViewGroup e = iView.e();
        q.a((Object) e, "iView.headerContainer");
        return e;
    }

    @Override // com.taobao.android.xsearchplugin.muise.j
    public void a(com.taobao.android.xsearchplugin.muise.b<?, ?> musCell) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf74980", new Object[]{this, musCell});
            return;
        }
        q.c(musCell, "musCell");
        iru model = (iru) getModel();
        q.a((Object) model, "model");
        if (!model.e().a("trimMemory", false)) {
            return;
        }
        this.c.a(musCell);
    }
}
