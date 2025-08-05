package com.taobao.android.meta.srp;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.b;
import com.taobao.android.meta.structure.page.f;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.android.searchbaseframe.meta.uikit.MetaLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.e;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import kotlin.reflect.k;
import tb.htg;
import tb.htk;
import tb.htl;
import tb.htv;
import tb.iru;
import tb.ite;
import tb.itk;
import tb.iuk;
import tb.ium;
import tb.iur;
import tb.kge;
import tb.noa;
import tb.rwf;

/* loaded from: classes6.dex */
public abstract class c<D extends com.taobao.android.meta.data.b<C, R>, C extends htg, R extends MetaResult<C>> extends f<D, C, com.taobao.android.meta.srp.a, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ k[] f14276a;
    private htl c;
    private ite d;
    private ArrayList<itk> e;
    private final kotlin.d f;
    private final kotlin.d g;
    private final com.taobao.android.meta.srp.a h;

    /* loaded from: classes6.dex */
    public static final class a implements MetaLayout.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.searchbaseframe.meta.uikit.MetaLayout.d
        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            ((com.taobao.android.meta.structure.page.a) c.this.K()).d(c.a(c.this));
            htv b = c.b(c.this);
            if (b == null) {
                return;
            }
            b.a(c.this.g());
        }
    }

    /* loaded from: classes6.dex */
    public static final class b implements MetaLayout.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.android.searchbaseframe.meta.uikit.MetaLayout.b
        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                ((com.taobao.android.meta.structure.page.a) c.this.K()).e(-((com.taobao.android.meta.structure.page.b) c.this.J()).d().getHiddenHeight());
            }
        }
    }

    /* renamed from: com.taobao.android.meta.srp.c$c  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class View$OnLayoutChangeListenerC0551c implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public View$OnLayoutChangeListenerC0551c() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            } else if (((com.taobao.android.meta.structure.page.b) c.this.J()).d().getListStart() == c.this.g()) {
            } else {
                htv b = c.b(c.this);
                if (b != null) {
                    b.a(c.this.g());
                }
                ((com.taobao.android.meta.structure.page.b) c.this.J()).d().setListStart(c.this.g());
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                c.d(c.this).attachToContainer();
            }
        }
    }

    static {
        kge.a(679606880);
        f14276a = new k[]{t.a(new PropertyReference1Impl(t.b(c.class), "searchBarWidget", "getSearchBarWidget()Lcom/taobao/android/searchbaseframe/widget/IViewWidget;")), t.a(new PropertyReference1Impl(t.b(c.class), "tabWidget", "getTabWidget()Lcom/taobao/android/meta/srp/ui/tab/ISrpTab;"))};
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1519309952) {
            super.a((com.taobao.android.meta.logic.a) objArr[0]);
            return null;
        } else if (hashCode != 1628600297) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((MetaResult) objArr[0]);
            return null;
        }
    }

    private final iuk<?, ?> w() {
        IpChange ipChange = $ipChange;
        return (iuk) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("b84a5a69", new Object[]{this}) : this.f.getValue());
    }

    public void a(iuk<?, ?> searchBarWidget, MetaResult<C> result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c93929b8", new Object[]{this, searchBarWidget, result});
            return;
        }
        q.c(searchBarWidget, "searchBarWidget");
        q.c(result, "result");
    }

    public final htk e() {
        IpChange ipChange = $ipChange;
        return (htk) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("2dcc419b", new Object[]{this}) : this.g.getValue());
    }

    public abstract htk i();

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        }
    }

    public int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6239de8", new Object[]{this})).intValue();
        }
        return 0;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static final /* synthetic */ int a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b1e0737e", new Object[]{cVar})).intValue() : cVar.y();
    }

    public static final /* synthetic */ htv b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (htv) ipChange.ipc$dispatch("795657b2", new Object[]{cVar}) : cVar.q();
    }

    public static final /* synthetic */ iuk d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iuk) ipChange.ipc$dispatch("43d9abff", new Object[]{cVar}) : cVar.w();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.taobao.android.meta.srp.a config, Activity activity, ium parent, iru<D> model, ViewGroup viewGroup, iur iurVar) {
        super(config, activity, parent, model, viewGroup, iurVar);
        q.c(config, "config");
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(model, "model");
        this.h = config;
        this.e = new ArrayList<>();
        this.f = e.a(new SrpWidget$searchBarWidget$2(this));
        this.g = e.a(new SrpWidget$tabWidget$2(this));
    }

    public final htl a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (htl) ipChange.ipc$dispatch("f05ac3e", new Object[]{this}) : this.c;
    }

    public final ite z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ite) ipChange.ipc$dispatch("cf5f460b", new Object[]{this}) : this.d;
    }

    public final ArrayList<itk> au_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("32b6c88c", new Object[]{this}) : this.e;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View] */
    public final int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
        }
        if (!this.h.ah()) {
            return 0;
        }
        ?? view = w().getView();
        if (view == 0) {
            q.a();
        }
        return view.getMeasuredHeight();
    }

    @Override // com.taobao.android.meta.structure.page.f
    public void a(com.taobao.android.meta.logic.a<D, C, R> controller) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5712b80", new Object[]{this, controller});
            return;
        }
        q.c(controller, "controller");
        super.a(controller);
        ((com.taobao.android.meta.structure.page.b) J()).d().setHeaderChangeListener(new a());
        ((com.taobao.android.meta.structure.page.b) J()).d().setOnHeaderScrollListener(new b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View] */
    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (!this.h.ah()) {
        } else {
            w().ensureView();
            if (!this.h.ai()) {
                this.d = new ite(w(), this.h.x());
                ite iteVar = this.d;
                if (iteVar == null) {
                    q.a();
                }
                iteVar.a(true);
                ite iteVar2 = this.d;
                if (iteVar2 == null) {
                    q.a();
                }
                iteVar2.a(this.h.aj() ? "sticky" : itk.TYPE_HALF_STICKY_SEARCHBAR);
                ((com.taobao.android.meta.structure.page.b) J()).d().addHeader(this.d);
            } else {
                ?? view = w().getView();
                if (view == 0) {
                    q.a();
                }
                if (view.getParent() instanceof ViewGroup) {
                    return;
                }
                com.taobao.android.meta.structure.page.b iView = (com.taobao.android.meta.structure.page.b) J();
                q.a((Object) iView, "iView");
                iView.b().addView(w().getView());
                ?? view2 = w().getView();
                if (view2 != 0) {
                    view2.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC0551c());
                }
            }
            getActivity().runOnUiThread(new d());
        }
    }

    @Override // com.taobao.android.meta.structure.page.f
    public void a(MetaResult<C> result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("611277e9", new Object[]{this, result});
            return;
        }
        q.c(result, "result");
        if (this.h.ai()) {
            ((com.taobao.android.meta.structure.page.a) K()).d(y());
        } else {
            ((com.taobao.android.meta.structure.page.a) K()).d(g() + n());
        }
        if (this.h.ah()) {
            a(w(), result);
        }
        super.a(result);
        b(result);
        iru model = (iru) getModel();
        q.a((Object) model, "model");
        model.f().setParam(noa.KEY_HAS_TAB, String.valueOf(A()));
        iru model2 = (iru) getModel();
        q.a((Object) model2, "model");
        ((com.taobao.android.meta.data.b) model2.c()).setParam(noa.KEY_HAS_TAB, String.valueOf(A()));
        ((com.taobao.android.meta.structure.page.b) J()).a();
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        ((com.taobao.android.meta.structure.page.b) J()).d().clearHeaders(true);
        this.e.clear();
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.e.size() > 0;
    }

    public final void a(itk header) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee561238", new Object[]{this, header});
            return;
        }
        q.c(header, "header");
        this.e.add(header);
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        ite iteVar = this.d;
        if (iteVar != null) {
            ((com.taobao.android.meta.structure.page.b) J()).d().addHeader(iteVar);
        }
        Iterator<itk> it = this.e.iterator();
        while (it.hasNext()) {
            ((com.taobao.android.meta.structure.page.b) J()).d().addHeader(it.next());
        }
        htl htlVar = this.c;
        if (htlVar != null) {
            ((com.taobao.android.meta.structure.page.b) J()).d().addHeader(htlVar);
        }
        ((com.taobao.android.meta.structure.page.b) J()).d().commit(true);
        j();
    }

    private final int x() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b088f2", new Object[]{this})).intValue();
        }
        Iterator<itk> it = this.e.iterator();
        while (it.hasNext()) {
            itk header = it.next();
            q.a((Object) header, "header");
            i += header.e();
        }
        return i;
    }

    private final int y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6bea073", new Object[]{this})).intValue() : rwf.c(n() + g(), n() + x());
    }

    public void b(MetaResult<C> result) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a8a0588", new Object[]{this, result});
            return;
        }
        q.c(result, "result");
        if (result.getTabs() != null) {
            List<TabBean> tabs = result.getTabs();
            if (tabs == null) {
                q.a();
            }
            if (tabs.size() > 1) {
                z = true;
            }
        }
        f(z);
        if (this.h.ai()) {
            ((com.taobao.android.meta.structure.page.a) K()).d(y());
        } else {
            ((com.taobao.android.meta.structure.page.a) K()).d(g() + n());
        }
        e().a(result, ((com.taobao.android.meta.structure.page.b) J()).cX_());
        if (n() > 0) {
            this.c = new htl(e().getView(), o());
            ((com.taobao.android.meta.structure.page.b) J()).d().addHeader(this.c);
        }
        j();
    }
}
