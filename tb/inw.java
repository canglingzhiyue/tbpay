package tb;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.a;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.i;
import java.util.HashSet;
import java.util.Set;
import tb.iny;
import tb.ioa;
import tb.isr;
import tb.isu;
import tb.isv;

/* loaded from: classes6.dex */
public abstract class inw<VIEW extends ioa, WIDGET extends iny<? extends View, ? extends ioa, ? extends inz, ? extends iru<? extends a<? extends BaseSearchResult, ?>>>> extends iue<VIEW, WIDGET> implements inz<VIEW, WIDGET>, iry {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public inv b;
    private irz f;

    /* renamed from: a  reason: collision with root package name */
    private boolean f29168a = false;
    private int d = 0;
    private boolean e = true;
    private int g = 0;
    private boolean h = false;
    private boolean i = false;
    public final Set<Integer> c = new HashSet();

    static {
        kge.a(2132459531);
        kge.a(1473922430);
        kge.a(1807071941);
    }

    public static /* synthetic */ Object ipc$super(inw inwVar, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.destroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public int a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{this, new Float(f)})).intValue();
        }
        int i = (int) (f / 2.0f);
        if (i <= 0 && f >= 0.5d) {
            return 1;
        }
        return i;
    }

    public abstract inv a(WIDGET widget, int i, iru<? extends a<? extends BaseSearchResult, ?>> iruVar, ListStyle listStyle, Activity activity);

    public abstract float e();

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue();
        }
        return 3;
    }

    @Override // tb.inz
    public Float q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("2c3828c1", new Object[]{this});
        }
        return null;
    }

    public int y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6bea073", new Object[]{this})).intValue();
        }
        return 0;
    }

    public static /* synthetic */ int a(inw inwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ee06f999", new Object[]{inwVar})).intValue() : inwVar.g;
    }

    public Set<Integer> l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("7669a5a2", new Object[]{this}) : this.c;
    }

    @Override // tb.iuh
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.h = c().c().j().k;
        iny inyVar = (iny) getWidget();
        inyVar.attachToContainer();
        int a2 = a(e());
        iru iruVar = (iru) inyVar.getModel();
        this.b = a(inyVar, a2, iruVar, iruVar.d().getUIListStyle(), inyVar.getActivity());
        ((ioa) getIView()).b(a2);
        ((ioa) getIView()).a(this.b);
        inyVar.w();
        inyVar.x();
        inyVar.y();
        inyVar.z();
        ((iru) ((iny) getWidget()).getModel()).d().subscribe(this);
        inyVar.subscribeEvent(this);
        inyVar.subscribeScopeEvent(this, "childPageWidget");
    }

    public void c(boolean z) {
        this.f29168a = z;
        if (!z || this.f != null) {
            if (z) {
                return;
            }
            this.f = null;
            return;
        }
        try {
            this.f = c().c().j().u.newInstance();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // tb.inz
    public a p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("6769eb20", new Object[]{this}) : ((iru) ((iny) getWidget()).getModel()).d();
    }

    public void r() {
        float e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        a d = ((iru) ((iny) getWidget()).getModel()).d();
        BaseSearchResult baseSearchResult = (BaseSearchResult) d.getTotalSearchResult();
        ListStyle uIListStyle = d.getUIListStyle();
        if (baseSearchResult != null && baseSearchResult.getMainInfo().wfgap >= 0.0f) {
            e = baseSearchResult.getMainInfo().wfgap;
        } else {
            e = e();
        }
        int a2 = a(e);
        this.b.c(a2);
        ((ioa) getIView()).a(uIListStyle);
        ((ioa) getIView()).b(a2);
        this.b.a(uIListStyle);
        g();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.c.clear();
        this.b.notifyDataSetChanged();
    }

    @Override // com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.a
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        this.d = 0;
        ((iny) getWidget()).postScopeEvent(isu.e.a(((ioa) getIView()).m()), "childPageWidget");
        ((iny) getWidget()).n();
        ioc.a();
    }

    @Override // com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.a
    public void ao_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf69df8", new Object[]{this});
            return;
        }
        ((iny) getWidget()).postScopeEvent(isu.d.a(), "childPageWidget");
        ((iny) getWidget()).ao_();
    }

    public void aq_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1604f36", new Object[]{this});
            return;
        }
        int i = this.d;
        this.d = i + 1;
        if (i % j() == 0) {
            w();
        }
        if (((iru) ((iny) getWidget()).getModel()).n()) {
            ((iny) getWidget()).postScopeEvent(isu.g.a(), "childPageWidget");
        }
        ((iny) getWidget()).aq_();
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        ((iny) getWidget()).postEvent(isu.c.a(i));
        ((iny) getWidget()).c(i);
    }

    @Override // com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView.a
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        this.d = 0;
        ((iny) getWidget()).o();
        w();
        a();
    }

    private void a() {
        irz irzVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.f29168a || (irzVar = this.f) == null) {
        } else {
            irzVar.c();
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            ((iny) getWidget()).b(i);
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        ((iny) getWidget()).k();
        a d = ((iru) ((iny) getWidget()).getModel()).d();
        BaseSearchResult baseSearchResult = (BaseSearchResult) d.getTotalSearchResult();
        if (baseSearchResult == null || baseSearchResult.isFailed() || !baseSearchResult.hasListResult() || !d.hasNextPage()) {
            return;
        }
        d.doNextPageSearch();
    }

    @Override // tb.inz
    public RecyclerView.Adapter t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.Adapter) ipChange.ipc$dispatch("751a323e", new Object[]{this}) : this.b;
    }

    @Override // tb.inz
    public int u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("686426f", new Object[]{this})).intValue() : ((iru) ((iny) getWidget()).getModel()).d().getPageColumn();
    }

    public void onEventMainThread(isv.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0c64ab", new Object[]{this, bVar});
        } else if (!bVar.a()) {
        } else {
            g();
        }
    }

    public void onEventMainThread(isv.l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a10f061", new Object[]{this, lVar});
        } else if (lVar.a()) {
            r();
        } else {
            c().b().b("BaseListPresenter", "SearchEvent.SilentAfter is not new. not support now!!");
        }
    }

    public void onEventMainThread(isv.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0bf04c", new Object[]{this, aVar});
        } else if (aVar.b()) {
            r();
            v();
            this.i = true;
        } else {
            BaseSearchResult baseSearchResult = (BaseSearchResult) ((iru) ((iny) getWidget()).getModel()).d().getLastSearchResult();
            if (baseSearchResult == null || baseSearchResult.isFailed()) {
                return;
            }
            a(baseSearchResult);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.taobao.android.searchbaseframe.datasource.result.SearchResult] */
    public void v() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
        } else if (!this.h) {
        } else {
            try {
                ?? totalSearchResult = p().getTotalSearchResult();
                if (totalSearchResult != 0 && totalSearchResult.isSuccess()) {
                    i = totalSearchResult.calcMuiseCellCount();
                }
                if (i <= 0) {
                    return;
                }
                b();
                ((ioa) getIView()).l().postDelayed(new i() { // from class: tb.inw.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.searchbaseframe.util.i
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else if (inw.a(inw.this) != 0 || !((ioa) inw.this.getIView()).h()) {
                        } else {
                            inw.this.c().b().f("BaseListPresenter", "dyn overlay hide, no dyn started");
                            ((ioa) inw.this.getIView()).a((iny) inw.this.getWidget());
                        }
                    }
                }, 80L);
                ((ioa) getIView()).l().postDelayed(new i() { // from class: tb.inw.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.searchbaseframe.util.i
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else if (!((ioa) inw.this.getIView()).h()) {
                        } else {
                            inw.this.c().b().d("BaseListPresenter", "dyn overlay hide, timeout");
                            ((ioa) inw.this.getIView()).a((iny) inw.this.getWidget());
                        }
                    }
                }, 300L);
            } catch (Exception e) {
                c().b().b("BaseListPresenter", "dyn cover err", e);
            }
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ((ioa) getIView()).a((iny) getWidget(), this.i);
        c().b().c("BaseListPresenter", "dyn overlay shown, onlyViewHolder: %b", Boolean.valueOf(this.i));
    }

    public void a(BaseSearchResult baseSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee5bf110", new Object[]{this, baseSearchResult});
        } else {
            ((ioa) getIView()).a(baseSearchResult.getCellsCount(), this.b);
        }
    }

    public void onEventMainThread(isv.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0cd90a", new Object[]{this, cVar});
        } else {
            ((ioa) getIView()).c(cVar.a(), cVar.b(), this.b);
        }
    }

    public void onEventMainThread(isv.k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a107c02", new Object[]{this, kVar});
            return;
        }
        r();
        this.i = true;
        v();
    }

    public void onEventMainThread(isr.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43388dd0", new Object[]{this, aVar});
        } else {
            a(aVar);
        }
    }

    public void a(isr.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86fb0d73", new Object[]{this, aVar});
        } else {
            a(aVar.f29282a);
        }
    }

    public void a(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b84a965", new Object[]{this, listStyle});
            return;
        }
        ((iru) ((iny) getWidget()).getModel()).d().setUserListStyle(listStyle);
        this.b.a(listStyle);
        ((ioa) getIView()).a(listStyle);
        this.b.notifyDataSetChanged();
    }

    public void onEventMainThread(isu.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("485717ad", new Object[]{this, aVar});
        } else {
            ((ioa) getIView()).n();
        }
    }

    @Override // tb.inz
    public void a(irw irwVar, int i) {
        irz irzVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9ac1099", new Object[]{this, irwVar, new Integer(i)});
        } else if (!this.f29168a || (irzVar = this.f) == null) {
        } else {
            irzVar.d(irwVar, i);
        }
    }

    @Override // tb.inz
    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
        } else if (!this.f29168a || this.f == null) {
        } else {
            if (!x()) {
                this.f.a();
            } else {
                this.f.a(this);
            }
        }
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue() : A();
    }

    public int z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6ccb7f4", new Object[]{this})).intValue() : ((ioa) getIView()).l().getHeight();
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue() : ((iru) ((iny) getWidget()).getModel()).g() && this.e;
    }

    @Override // tb.inz
    public void B() {
        irz irzVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        this.e = false;
        if (this.f29168a && (irzVar = this.f) != null) {
            irzVar.a(x(), this);
        }
        ioc.a();
    }

    @Override // tb.inz
    public void C() {
        irz irzVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
            return;
        }
        this.e = true;
        if (!this.f29168a || (irzVar = this.f) == null) {
            return;
        }
        irzVar.b(x(), this);
    }

    @Override // tb.iue, tb.iuh
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        irz irzVar = this.f;
        if (irzVar == null) {
            return;
        }
        irzVar.d();
    }

    @Override // tb.inz
    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
        } else {
            ((iny) getWidget()).postEvent(obj);
        }
    }

    @Override // tb.inz
    public void a(itd<?, ?> itdVar, int i) {
        irz irzVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc0a0344", new Object[]{this, itdVar, new Integer(i)});
            return;
        }
        this.c.add(Integer.valueOf(i));
        if ((itdVar instanceof irw) && (irzVar = this.f) != null) {
            irzVar.b((irw) itdVar, i);
            this.f.a(this);
        }
        a(i);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (!c().c().j().l) {
        } else {
            d(i);
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else if (i < t().getItemCount() - ((PartnerRecyclerView) ((ioa) getIView()).l()).getPreRequestCellThreshold()) {
        } else {
            k();
        }
    }

    @Override // tb.inz
    public void b(itd<?, ?> itdVar, int i) {
        irz irzVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bde7cce3", new Object[]{this, itdVar, new Integer(i)});
            return;
        }
        this.c.remove(Integer.valueOf(i));
        if (!(itdVar instanceof irw) || (irzVar = this.f) == null) {
            return;
        }
        irzVar.c((irw) itdVar, i);
    }

    @Override // tb.iry
    public int D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3d3c2be", new Object[]{this})).intValue() : y();
    }

    @Override // tb.iry
    public int E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3e1da3f", new Object[]{this})).intValue() : z();
    }

    @Override // tb.iry
    public int F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3eff1c0", new Object[]{this})).intValue() : (int) ((E() + D()) * 0.4d);
    }

    @Override // tb.iry
    public int G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3fe0941", new Object[]{this})).intValue() : (int) ((E() + D()) * 0.6d);
    }

    @Override // tb.inz
    public void b(irw irwVar, int i) {
        irz irzVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb89da38", new Object[]{this, irwVar, new Integer(i)});
        } else if (!this.f29168a || (irzVar = this.f) == null) {
        } else {
            irzVar.a(this, irwVar, i);
        }
    }

    @Override // tb.inz
    public void c(irw irwVar, int i) {
        irz irzVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d67a3d7", new Object[]{this, irwVar, new Integer(i)});
        } else if (!this.f29168a || (irzVar = this.f) == null) {
        } else {
            irzVar.e(irwVar, i);
        }
    }

    @Override // tb.inz
    public void H() {
        irz irzVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
        } else if (!this.f29168a || (irzVar = this.f) == null) {
        } else {
            irzVar.a(this);
        }
    }

    @Override // tb.inz
    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[]{this});
        } else {
            this.g++;
        }
    }

    @Override // tb.inz
    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[]{this});
            return;
        }
        this.g--;
        try {
            if (!this.h || this.g != 0 || !((ioa) getIView()).h()) {
                return;
            }
            c().b().f("BaseListPresenter", "dyn overlay hide, count to zero");
            ((ioa) getIView()).a((iny) getWidget());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
