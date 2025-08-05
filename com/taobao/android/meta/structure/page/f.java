package com.taobao.android.meta.structure.page;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.a;
import com.taobao.android.meta.data.b;
import com.taobao.android.meta.structure.childpage.g;
import com.taobao.android.meta.structure.state.MetaState;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.hte;
import tb.htv;
import tb.irq;
import tb.irr;
import tb.irt;
import tb.iru;
import tb.iuh;
import tb.iuj;
import tb.ium;
import tb.iuo;
import tb.iur;
import tb.kge;

/* loaded from: classes6.dex */
public class f<T extends com.taobao.android.meta.data.b<D, R>, D extends com.taobao.android.meta.data.a, C extends hte, R extends MetaResult<D>> extends irr<FrameLayout, b, com.taobao.android.meta.structure.page.a, iru<T>, Void> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f14307a;
    public com.taobao.android.meta.logic.a<T, D, R> b;
    private com.taobao.android.searchbaseframe.chitu.b c;
    private htv d;
    private final C e;
    private boolean f;

    static {
        kge.a(-31706587);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 217607196) {
            super.onCtxResume();
            return null;
        } else if (hashCode != 1280906097) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCtxStop();
            return null;
        }
    }

    public void d(MetaResult<D> result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d7920c6", new Object[]{this, result});
        } else {
            q.c(result, "result");
        }
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "MetaPageWidget";
    }

    @Override // tb.iun
    public /* synthetic */ iuh d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iuh) ipChange.ipc$dispatch("261b13ff", new Object[]{this}) : r();
    }

    @Override // tb.iun
    public /* synthetic */ iuj f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iuj) ipChange.ipc$dispatch("357e5efb", new Object[]{this}) : s();
    }

    public final C v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C) ipChange.ipc$dispatch("b0983c30", new Object[]{this}) : this.e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C metaConfig, Activity activity, ium parent, iru<T> modelAdapter, ViewGroup viewGroup, iur iurVar) {
        super(activity, parent, modelAdapter, viewGroup, iurVar);
        q.c(metaConfig, "metaConfig");
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(modelAdapter, "modelAdapter");
        this.e = metaConfig;
        ((b) J()).a(this.e);
        ((iru) getModel()).a(this.e);
        irt<T> e = modelAdapter.e();
        q.a((Object) e, "modelAdapter.pageModel");
        if (e.c() == null) {
            Activity activity2 = getActivity();
            q.a((Object) activity2, "getActivity()");
            Intent intent = activity2.getIntent();
            if (intent == null || intent.getData() == null) {
                return;
            }
            String uri = intent.getData().toString();
            irt<T> e2 = modelAdapter.e();
            q.a((Object) e2, "modelAdapter.pageModel");
            e2.a(uri);
        }
    }

    public final com.taobao.android.meta.logic.a<T, D, R> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.meta.logic.a) ipChange.ipc$dispatch("74baaa0f", new Object[]{this});
        }
        com.taobao.android.meta.logic.a<T, D, R> aVar = this.b;
        if (aVar == null) {
            q.b("controller");
        }
        return aVar;
    }

    public final boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue() : this.f;
    }

    public final void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public final htv q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (htv) ipChange.ipc$dispatch("8a200364", new Object[]{this});
        }
        if (this.e.g() == null) {
            return null;
        }
        if (this.d == null) {
            this.d = e();
        }
        return this.d;
    }

    public void a(com.taobao.android.meta.logic.a<T, D, R> controller) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5712b80", new Object[]{this, controller});
            return;
        }
        q.c(controller, "controller");
        this.b = controller;
        controller.a(this);
        iru model = (iru) getModel();
        q.a((Object) model, "model");
        model.e().a("controller", controller);
    }

    public com.taobao.android.meta.structure.page.a r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.meta.structure.page.a) ipChange.ipc$dispatch("662ab8d8", new Object[]{this}) : new d();
    }

    public b s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("1fa24696", new Object[]{this}) : new e();
    }

    public final g a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("8bbc091c", new Object[]{this, new Integer(i)});
        }
        irq creatorParam = I();
        q.a((Object) creatorParam, "creatorParam");
        creatorParam.g = new iuo();
        com.taobao.android.meta.logic.a<T, D, R> aVar = this.b;
        if (aVar == null) {
            q.b("controller");
        }
        creatorParam.e = aVar.a(i);
        return this.e.o().a(creatorParam);
    }

    public final g a(iru<com.taobao.android.meta.data.b<? extends com.taobao.android.meta.data.a, ? extends MetaResult<? extends com.taobao.android.meta.data.a>>> model) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("2b37bead", new Object[]{this, model});
        }
        q.c(model, "model");
        irq creatorParam = I();
        q.a((Object) creatorParam, "creatorParam");
        creatorParam.g = new iuo();
        creatorParam.e = model;
        return this.e.o().a(creatorParam);
    }

    @Override // tb.iut
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        g a2 = ((com.taobao.android.meta.structure.page.a) K()).a();
        if (a2 == null) {
            return;
        }
        a2.u();
    }

    @Override // tb.iut
    public void onCtxStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c591371", new Object[]{this});
            return;
        }
        super.onCtxStop();
        g a2 = ((com.taobao.android.meta.structure.page.a) K()).a();
        if (a2 == null) {
            return;
        }
        a2.v();
    }

    public final void c(MetaResult<D> result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4019327", new Object[]{this, result});
            return;
        }
        q.c(result, "result");
        if (this.f14307a) {
            return;
        }
        this.f14307a = true;
        a(result);
        a();
    }

    private final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.c = new com.taobao.android.searchbaseframe.chitu.b(getActivity(), this, null, new a());
        }
    }

    /* loaded from: classes6.dex */
    public static final class a implements iur {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.iur
        public void b(View componentView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91037249", new Object[]{this, componentView});
            } else {
                q.c(componentView, "componentView");
            }
        }

        public a() {
        }

        @Override // tb.iur
        public void a(View componentView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, componentView});
                return;
            }
            q.c(componentView, "componentView");
            b iView = (b) f.this.J();
            q.a((Object) iView, "iView");
            iView.b().addView(componentView);
        }
    }

    public void a(MetaResult<D> result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("611277e9", new Object[]{this, result});
            return;
        }
        q.c(result, "result");
        b();
        List<TabBean> it = result.getTabs();
        if (it != null) {
            q.a((Object) it, "it");
            Iterator<T> it2 = it.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                } else if (((TabBean) it2.next()).isSelected) {
                    break;
                } else {
                    i++;
                }
            }
            ((com.taobao.android.meta.structure.page.a) K()).c(i);
            ((com.taobao.android.meta.structure.page.a) K()).a(it);
            if (i > 0) {
                ((b) J()).cX_().setCurrentItem(i, false);
            }
            ((com.taobao.android.meta.structure.page.a) K()).c(-1);
        }
        d(result);
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        htv q = q();
        if (q == null) {
            return;
        }
        q.a(MetaState.UPDATE_ERROR);
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        htv q = q();
        if (q == null) {
            return;
        }
        q.a(MetaState.UPDATING);
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        htv q = q();
        if (q == null) {
            return;
        }
        q.a(MetaState.DEFAULT);
    }

    private final htv e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (htv) ipChange.ipc$dispatch("2dcc42f0", new Object[]{this});
        }
        irq creatorParam = I();
        q.a((Object) creatorParam, "creatorParam");
        b iView = (b) J();
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
            return htvVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.widget.WidgetModelAdapter<out com.taobao.android.meta.data.MetaDataSource<com.taobao.android.meta.data.MetaCombo, com.taobao.android.meta.data.MetaResult<com.taobao.android.meta.data.MetaCombo>>>");
    }

    public final g b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("b994a37b", new Object[]{this, new Integer(i)}) : ((com.taobao.android.meta.structure.page.a) K()).b(i);
    }

    public final g B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("2cc4e8ca", new Object[]{this}) : ((com.taobao.android.meta.structure.page.a) K()).a();
    }

    public final void e_(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("838d4302", new Object[]{this, new Integer(i)});
        } else {
            a(i, false);
        }
    }

    public final void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            ((b) J()).cX_().setCurrentItem(i, z);
        }
    }

    public final void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.e.M().a((com.taobao.android.meta.data.d<Integer>) Integer.valueOf(i));
        this.e.N().a((com.taobao.android.meta.data.d<Integer>) Integer.valueOf(i2));
    }

    public final void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.e.K().a((com.taobao.android.meta.data.d<Integer>) Integer.valueOf(i));
        this.e.L().a((com.taobao.android.meta.data.d<Integer>) Integer.valueOf(i2));
    }

    public final void c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ddc94a", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.e.Q().a((com.taobao.android.meta.data.d<Integer>) Integer.valueOf(i));
        this.e.R().a((com.taobao.android.meta.data.d<Integer>) Integer.valueOf(i2));
    }

    public final void f_(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8737e43", new Object[]{this, new Integer(i)});
        } else {
            ((com.taobao.android.meta.structure.page.a) K()).f(i);
        }
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
        } else if (this.f14307a) {
        } else {
            ((com.taobao.android.meta.structure.page.a) K()).aD_();
        }
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
        } else {
            ((com.taobao.android.meta.structure.page.a) K()).e();
        }
    }
}
