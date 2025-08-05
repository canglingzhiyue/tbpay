package com.taobao.android.meta.structure.childpage;

import android.app.Activity;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.structure.list.h;
import com.taobao.android.meta.structure.state.MetaState;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.meta.uikit.MetaLayout;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.android.xsearchplugin.muise.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import kotlin.reflect.k;
import tb.hte;
import tb.htf;
import tb.htm;
import tb.htn;
import tb.htv;
import tb.irp;
import tb.irq;
import tb.iru;
import tb.ise;
import tb.ite;
import tb.itk;
import tb.itl;
import tb.itn;
import tb.ito;
import tb.iuh;
import tb.iuj;
import tb.iuk;
import tb.ium;
import tb.iuo;
import tb.iur;
import tb.kge;

/* loaded from: classes6.dex */
public class g extends htn<FrameLayout, com.taobao.android.meta.structure.childpage.c, com.taobao.android.meta.structure.childpage.b, iru<? extends com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>>, hte> implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ k[] f14287a;
    public h b;
    private final HashMap<String, List<itk>> c;
    private final SparseArray<ite> d;
    private final HashSet<BaseTypedBean> e;
    private final HashSet<BaseTypedBean> f;
    private final ArrayList<iuk<?, ?>> g;
    private ViewPager h;
    private final kotlin.d i;
    private htv j;
    private itn k;

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
                return;
            }
            ((com.taobao.android.meta.structure.list.b) g.this.g().J()).n();
            g.a(g.this);
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
            ((com.taobao.android.meta.structure.list.b) g.this.g().J()).o();
            g.a(g.this);
        }
    }

    /* loaded from: classes6.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                g.this.g().l();
            }
        }
    }

    static {
        kge.a(283607379);
        kge.a(627681016);
        f14287a = new k[]{t.a(new PropertyReference1Impl(t.b(g.class), "headerHolder", "getHeaderHolder()Lcom/taobao/android/meta/structure/MetaHeadersHolder;"))};
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        if (str.hashCode() == -211767613) {
            super.onComponentDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ec556", new Object[]{this});
        }
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "MetaChildPageWidget";
    }

    @Override // tb.iut, tb.iul
    public String getScopeTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("53eba25d", new Object[]{this}) : "childPageWidget";
    }

    public final htm h() {
        IpChange ipChange = $ipChange;
        return (htm) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("44e131f6", new Object[]{this}) : this.i.getValue());
    }

    public static final /* synthetic */ void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bcbeda9", new Object[]{gVar});
        } else {
            gVar.F();
        }
    }

    @Override // tb.iun
    public /* synthetic */ iuh d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iuh) ipChange.ipc$dispatch("261b13ff", new Object[]{this}) : i();
    }

    @Override // tb.iun
    public /* synthetic */ iuj f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iuj) ipChange.ipc$dispatch("357e5efb", new Object[]{this}) : j();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Activity activity, ium parent, iru<? extends com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>> model, ViewGroup viewGroup, iur iurVar) {
        super(activity, parent, model, viewGroup, iurVar);
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(model, "model");
        this.c = new HashMap<>();
        this.d = new SparseArray<>();
        this.e = new HashSet<>();
        this.f = new HashSet<>();
        this.g = new ArrayList<>();
        this.i = kotlin.e.a(new MetaChildPageWidget$headerHolder$2(this));
    }

    public final HashMap<String, List<itk>> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("8adf10c", new Object[]{this}) : this.c;
    }

    public final SparseArray<ite> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SparseArray) ipChange.ipc$dispatch("6c44248d", new Object[]{this}) : this.d;
    }

    public final h g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("a8c5676d", new Object[]{this});
        }
        h hVar = this.b;
        if (hVar == null) {
            q.b("listWidget");
        }
        return hVar;
    }

    public final htv D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (htv) ipChange.ipc$dispatch("2fe5f1b1", new Object[]{this});
        }
        if (a().g() == null) {
            return null;
        }
        if (this.j == null) {
            this.j = E();
        }
        return this.j;
    }

    private final htv E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (htv) ipChange.ipc$dispatch("37979710", new Object[]{this});
        }
        irq creatorParam = I();
        q.a((Object) creatorParam, "creatorParam");
        com.taobao.android.meta.structure.childpage.c iView = (com.taobao.android.meta.structure.childpage.c) J();
        q.a((Object) iView, "iView");
        creatorParam.f = iView.b();
        creatorParam.g = new iuo();
        Activity activity = creatorParam.c;
        q.a((Object) activity, "param.activity");
        ium iumVar = creatorParam.d;
        q.a((Object) iumVar, "param.parent");
        iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar = creatorParam.e;
        if (iruVar != null) {
            htv htvVar = new htv(activity, iumVar, iruVar, creatorParam.f, creatorParam.g);
            htvVar.attachToContainer();
            htvVar.a(((com.taobao.android.meta.structure.childpage.c) J()).bJ_().getListStart());
            return htvVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.widget.WidgetModelAdapter<out com.taobao.android.meta.data.MetaDataSource<com.taobao.android.meta.data.MetaCombo, com.taobao.android.meta.data.MetaResult<com.taobao.android.meta.data.MetaCombo>>>");
    }

    public com.taobao.android.meta.structure.childpage.b i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.structure.childpage.b) ipChange.ipc$dispatch("76f67096", new Object[]{this}) : a().p().a(a());
    }

    public com.taobao.android.meta.structure.childpage.c j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.structure.childpage.c) ipChange.ipc$dispatch("ba818e76", new Object[]{this}) : a().q().a(a());
    }

    @Override // com.taobao.android.meta.structure.childpage.a
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        ((com.taobao.android.meta.structure.childpage.c) J()).a(i);
        htv D = D();
        if (D == null) {
            return;
        }
        D.a(i);
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        h a2 = a().n().a(I());
        q.a((Object) a2, "getConfig().listWidget.create(creatorParam)");
        this.b = a2;
        h hVar = this.b;
        if (hVar == null) {
            q.b("listWidget");
        }
        hVar.attachToContainer();
        ViewGroup e = ((com.taobao.android.meta.structure.childpage.c) J()).e();
        h hVar2 = this.b;
        if (hVar2 == null) {
            q.b("listWidget");
        }
        com.taobao.android.meta.structure.list.b bVar = (com.taobao.android.meta.structure.list.b) hVar2.J();
        q.a((Object) bVar, "listWidget.iView");
        e.addView(bVar.b(), -1, -1);
        MetaLayout bJ_ = ((com.taobao.android.meta.structure.childpage.c) J()).bJ_();
        h hVar3 = this.b;
        if (hVar3 == null) {
            q.b("listWidget");
        }
        bJ_.setCurrentList(hVar3);
        ((com.taobao.android.meta.structure.childpage.c) J()).bJ_().commit();
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        h hVar = this.b;
        if (hVar == null) {
            q.b("listWidget");
        }
        hVar.destroyAndRemoveFromParent();
        h hVar2 = this.b;
        if (hVar2 == null) {
            q.b("listWidget");
        }
        FrameLayout frameLayout = (FrameLayout) hVar2.getView();
        ViewParent parent = frameLayout != null ? frameLayout.getParent() : null;
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            h hVar3 = this.b;
            if (hVar3 == null) {
                q.b("listWidget");
            }
            FrameLayout frameLayout2 = (FrameLayout) hVar3.getView();
            if (frameLayout2 == null) {
                q.a();
            }
            viewGroup.removeView(frameLayout2);
        }
        m();
    }

    public final void a(JSONObject data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, data});
            return;
        }
        q.c(data, "data");
        iru model = (iru) getModel();
        q.a((Object) model, "model");
        com.taobao.android.meta.data.b bVar = (com.taobao.android.meta.data.b) model.d();
        BaseTypedBean a2 = c().g().a(data, (MetaResult) bVar.getTotalSearchResult());
        if (!(a2 instanceof MuiseBean)) {
            a2 = null;
        }
        MuiseBean muiseBean = (MuiseBean) a2;
        if (muiseBean == null) {
            return;
        }
        itn itnVar = this.k;
        if (itnVar != null) {
            if (itnVar == null) {
                q.a();
            }
            itnVar.destroyAndRemoveFromParent();
            this.k = null;
        }
        TemplateBean template = bVar.getTemplate(muiseBean.type);
        if (template == null) {
            return;
        }
        q.a((Object) template, "scopeDatasource.getTempl…ftBarBean.type) ?: return");
        ViewGroup f = ((com.taobao.android.meta.structure.childpage.c) J()).f();
        itn a3 = a().e().a(new irp(I(), template));
        a3.b(false);
        a3.bindWithData(muiseBean);
        f.getLayoutParams().width = j.a(muiseBean.model.getInteger("width").intValue());
        f.addView(a3.getView(), -1, -1);
        f.setVisibility(0);
        this.k = a3;
        O();
    }

    public final void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
            return;
        }
        itn itnVar = this.k;
        if (itnVar != null) {
            itnVar.destroyAndRemoveFromParent();
        }
        this.k = null;
        ViewGroup f = ((com.taobao.android.meta.structure.childpage.c) J()).f();
        f.removeAllViews();
        f.getLayoutParams().width = 0;
        f.setVisibility(8);
    }

    @Override // com.taobao.android.meta.structure.childpage.a
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            ((com.taobao.android.meta.structure.childpage.c) J()).b(i);
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        k();
        b(true);
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        h hVar = this.b;
        if (hVar == null) {
            q.b("listWidget");
        }
        hVar.a(false);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        h hVar = this.b;
        if (hVar == null) {
            q.b("listWidget");
        }
        hVar.a(z);
    }

    public void a(ListStyle style) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b84a965", new Object[]{this, style});
            return;
        }
        q.c(style, "style");
        h hVar = this.b;
        if (hVar == null) {
            q.b("listWidget");
        }
        hVar.a(style);
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        h hVar = this.b;
        if (hVar == null) {
            q.b("listWidget");
        }
        hVar.j();
    }

    public void a(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619b90c", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        h hVar = this.b;
        if (hVar == null) {
            q.b("listWidget");
        }
        hVar.a(i, z, i2, 0);
        if (z) {
            return;
        }
        F();
    }

    public void b(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f7cdda", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        h hVar = this.b;
        if (hVar == null) {
            q.b("listWidget");
        }
        hVar.a(z, i, 0);
        if (z) {
            return;
        }
        F();
    }

    private final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
            return;
        }
        h hVar = this.b;
        if (hVar == null) {
            q.b("listWidget");
        }
        com.taobao.android.meta.structure.list.b bVar = (com.taobao.android.meta.structure.list.b) hVar.J();
        q.a((Object) bVar, "listWidget.iView");
        bVar.b().post(new c());
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        h hVar = this.b;
        if (hVar == null) {
            q.b("listWidget");
        }
        RecyclerView B = hVar.B();
        if (B == null) {
            return;
        }
        if (B.isAttachedToWindow()) {
            h hVar2 = this.b;
            if (hVar2 == null) {
                q.b("listWidget");
            }
            ((com.taobao.android.meta.structure.list.b) hVar2.J()).n();
            F();
            return;
        }
        B.post(new a());
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        h hVar = this.b;
        if (hVar == null) {
            q.b("listWidget");
        }
        RecyclerView B = hVar.B();
        if (B == null) {
            return;
        }
        if (B.isAttachedToWindow()) {
            h hVar2 = this.b;
            if (hVar2 == null) {
                q.b("listWidget");
            }
            ((com.taobao.android.meta.structure.list.b) hVar2.J()).o();
            F();
            return;
        }
        B.post(new b());
    }

    public void a(iuk<?, ?> widget, boolean z, htf htfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4b8c491", new Object[]{this, widget, new Boolean(z), htfVar});
            return;
        }
        q.c(widget, "widget");
        a(widget, z, htfVar, 0);
    }

    public void a(iuk<?, ?> widget, boolean z, htf htfVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2604092", new Object[]{this, widget, new Boolean(z), htfVar, new Integer(i)});
            return;
        }
        q.c(widget, "widget");
        ite iteVar = this.d.get(widget.hashCode());
        if (iteVar == null) {
            return;
        }
        ((com.taobao.android.meta.structure.childpage.c) J()).bJ_().scrollHeaderToTop(iteVar, z, htfVar, i);
    }

    public boolean c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8b44dd", new Object[]{this, new Integer(i)})).booleanValue();
        }
        h hVar = this.b;
        if (hVar == null) {
            q.b("listWidget");
        }
        RecyclerView B = hVar.B();
        if (B == null) {
            return false;
        }
        return B.canScrollVertically(i);
    }

    public void a(ViewPager view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2029c714", new Object[]{this, view});
            return;
        }
        q.c(view, "view");
        this.h = view;
    }

    public int M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4529647", new Object[]{this})).intValue();
        }
        h hVar = this.b;
        if (hVar == null) {
            q.b("listWidget");
        }
        RecyclerView B = hVar.B();
        q.a((Object) B, "listWidget.recyclerView");
        return B.getMeasuredWidth();
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.b
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        h hVar = this.b;
        if (hVar == null) {
            q.b("listWidget");
        }
        hVar.r();
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.b
    public boolean a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue();
        }
        h hVar = this.b;
        if (hVar == null) {
            q.b("listWidget");
        }
        return hVar.a(motionEvent);
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.b
    public boolean b(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74207cc2", new Object[]{this, motionEvent})).booleanValue();
        }
        h hVar = this.b;
        if (hVar == null) {
            q.b("listWidget");
        }
        return hVar.b(motionEvent);
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.b
    public int s() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66a136d", new Object[]{this})).intValue();
        }
        ViewPager viewPager = this.h;
        if (viewPager != null) {
            i = com.taobao.android.searchbaseframe.meta.uikit.g.a(viewPager);
        }
        h hVar = this.b;
        if (hVar == null) {
            q.b("listWidget");
        }
        return i + hVar.s();
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.b
    public int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6782aee", new Object[]{this})).intValue();
        }
        h hVar = this.b;
        if (hVar == null) {
            q.b("listWidget");
        }
        return hVar.t();
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        h hVar = this.b;
        if (hVar == null) {
            q.b("listWidget");
        }
        hVar.h();
        c(true);
    }

    private final void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else if (this.d.size() != 0) {
            int size = this.d.size();
            for (int i = 0; i < size; i++) {
                if (z) {
                    this.d.valueAt(i).j();
                } else {
                    this.d.valueAt(i).k();
                }
            }
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        h hVar = this.b;
        if (hVar == null) {
            q.b("listWidget");
        }
        hVar.i();
        c(false);
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        iru model = (iru) getModel();
        q.a((Object) model, "model");
        MetaResult it = (MetaResult) ((com.taobao.android.meta.data.b) model.d()).getTotalSearchResult();
        if (it == null) {
            return;
        }
        q.a((Object) it, "it");
        if (!it.isSuccess()) {
            return;
        }
        h hVar = this.b;
        if (hVar == null) {
            q.b("listWidget");
        }
        hVar.a(false);
        ((com.taobao.android.meta.structure.childpage.b) K()).b();
        ((com.taobao.android.meta.structure.childpage.b) K()).an_();
        y();
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        htv D = D();
        if (D != null) {
            D.a(MetaState.UPDATING);
        }
        G();
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        htv D = D();
        if (D != null) {
            D.a(MetaState.UPDATE_ERROR);
        }
        G();
    }

    private final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
            return;
        }
        z();
        C();
        ((com.taobao.android.meta.structure.childpage.c) J()).bJ_().setVisibility(8);
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        htv D = D();
        if (D != null) {
            D.a(MetaState.DEFAULT);
        }
        ((com.taobao.android.meta.structure.childpage.c) J()).bJ_().setVisibility(0);
    }

    public ise<irp, ? extends itn> a(String type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ise) ipChange.ipc$dispatch("7c70c4f9", new Object[]{this, type});
        }
        q.c(type, "type");
        return a().e();
    }

    public ise<irp, ? extends ito> b(String type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ise) ipChange.ipc$dispatch("7d1d7098", new Object[]{this, type});
        }
        q.c(type, "type");
        return a().f();
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        ((com.taobao.android.meta.structure.childpage.c) J()).a();
        this.d.clear();
        this.c.clear();
        h hVar = this.b;
        if (hVar == null) {
            q.b("listWidget");
        }
        hVar.p();
        h().a();
        A();
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
            return;
        }
        this.f.clear();
        this.f.addAll(this.e);
        this.e.clear();
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        Iterator<iuk<?, ?>> it = this.g.iterator();
        while (it.hasNext()) {
            it.next().destroyAndRemoveFromParent();
        }
        this.g.clear();
        h hVar = this.b;
        if (hVar == null) {
            q.b("listWidget");
        }
        hVar.q();
    }

    private final iuk<BaseTypedBean, ?> a(com.taobao.android.meta.data.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iuk) ipChange.ipc$dispatch("48cdc645", new Object[]{this, cVar});
        }
        htm h = h();
        iru model = (iru) getModel();
        q.a((Object) model, "model");
        return h.a(cVar, (com.taobao.android.meta.data.b) model.d(), new MetaChildPageWidget$createWidget$1(this), new MetaChildPageWidget$createWidget$2(this));
    }

    public void a(com.taobao.android.meta.data.c mod, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b4f1f2", new Object[]{this, mod, new Boolean(z)});
            return;
        }
        q.c(mod, "mod");
        iuk<BaseTypedBean, ?> a2 = a(mod);
        if (a2 == null) {
            return;
        }
        if (a2 instanceof o) {
            ((o) a2).c(a().as());
        }
        boolean z2 = a2 instanceof itl;
        if (z2) {
            ((itl) a2).a(((com.taobao.android.meta.structure.childpage.c) J()).bJ_().getListStart());
        }
        a2.attachToContainer();
        if (!z || !this.f.contains(mod.b())) {
            a2.bindWithData(mod.b());
        }
        this.e.add(mod.b());
        ite iteVar = new ite(a2, a().x());
        if (z2) {
            itl itlVar = (itl) a2;
            iteVar.a(itlVar.i());
            iteVar.c(itlVar.j());
        }
        iteVar.a(mod.a());
        a(a2, iteVar, mod.a());
        a(mod.a(), iteVar);
        this.d.put(a2.hashCode(), iteVar);
    }

    public void a(BaseTypedBean bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb896021", new Object[]{this, bean});
            return;
        }
        q.c(bean, "bean");
        htm h = h();
        iru model = (iru) getModel();
        q.a((Object) model, "model");
        iuk<BaseTypedBean, ?> a2 = h.a(bean, "", (com.taobao.android.meta.data.b) model.d(), new MetaChildPageWidget$addFooter$footer$1(this), new MetaChildPageWidget$addFooter$footer$2(this));
        if (a2 == null) {
            return;
        }
        a2.ensureView();
        a2.bindWithData(bean);
        this.g.add(a2);
        h hVar = this.b;
        if (hVar == null) {
            q.b("listWidget");
        }
        hVar.a(a2);
    }

    public void a(iuk<BaseTypedBean, ?> widget, ite header, String type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d98859", new Object[]{this, widget, header, type});
            return;
        }
        q.c(widget, "widget");
        q.c(header, "header");
        q.c(type, "type");
        if (TextUtils.equals(type, "list")) {
            h hVar = this.b;
            if (hVar == null) {
                q.b("listWidget");
            }
            hVar.b(widget);
            return;
        }
        ((com.taobao.android.meta.structure.childpage.c) J()).a(header);
    }

    private final void a(String str, itk itkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e408802", new Object[]{this, str, itkVar});
            return;
        }
        ArrayList arrayList = this.c.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.c.put(str, arrayList);
        }
        arrayList.add(itkVar);
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
            return;
        }
        iru model = (iru) getModel();
        q.a((Object) model, "model");
        if (model.g()) {
            c(true);
        }
        h().b();
    }

    @Override // tb.ins
    public void a(com.taobao.android.searchbaseframe.datasource.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79b9ad93", new Object[]{this, bVar});
            return;
        }
        h hVar = this.b;
        if (hVar == null) {
            q.b("listWidget");
        }
        hVar.a(bVar);
    }

    @Override // tb.iun, tb.iut
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.onComponentDestroy();
        if (!a().Y()) {
            return;
        }
        iru model = (iru) getModel();
        q.a((Object) model, "model");
        ((com.taobao.android.meta.data.b) model.d()).destroy();
    }
}
