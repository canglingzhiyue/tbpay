package com.taobao.search.refactor;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.search.common.util.r;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.tao.Globals;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import tb.hte;
import tb.htj;
import tb.ioe;
import tb.ipj;
import tb.ipk;
import tb.iqt;
import tb.irp;
import tb.irq;
import tb.iru;
import tb.ise;
import tb.isv;
import tb.ite;
import tb.itl;
import tb.itn;
import tb.iug;
import tb.iuk;
import tb.iul;
import tb.ium;
import tb.iuo;
import tb.iur;
import tb.jxr;
import tb.jxs;
import tb.kge;
import tb.nwd;
import tb.nwk;
import tb.nwz;

/* loaded from: classes7.dex */
public final class d extends htj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private com.taobao.search.sf.widgets.list.floatbar.l c;
    private nwd d;
    private boolean e;
    private nwz f;
    private jxs g;
    private boolean h;
    private ite i;
    private ite j;
    private com.taobao.android.searchbaseframe.xsl.refact.q k;

    /* loaded from: classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;

        public a(boolean z) {
            this.b = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                d.a(d.this, this.b);
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View b;

        public b(View view) {
            this.b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animation});
                return;
            }
            kotlin.jvm.internal.q.c(animation, "animation");
            ROOT_VIEW view = d.this.getView();
            if (view == 0) {
                kotlin.jvm.internal.q.a();
            }
            ((FrameLayout) view).removeView(this.b);
        }
    }

    /* renamed from: com.taobao.search.refactor.d$d  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class RunnableC0775d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View b;

        public RunnableC0775d(View view) {
            this.b = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                d.a(d.this, this.b);
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                d.b(d.this, true);
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class f implements com.taobao.android.searchbaseframe.xsl.refact.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.taobao.android.searchbaseframe.xsl.refact.a
        public void onPullRefreshTrigger(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e9733bb", new Object[]{this, new Integer(i)});
                return;
            }
            d.a(d.this);
            iru model = (iru) d.this.getModel();
            kotlin.jvm.internal.q.a((Object) model, "model");
            com.taobao.android.searchbaseframe.datasource.impl.a d = model.d();
            if (d == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.refactor.MSDataSource");
            }
            ((j) d).U();
        }
    }

    static {
        kge.a(-778993968);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1885427910:
                super.onChildAdded((iul) objArr[0]);
                return null;
            case -1495693223:
                super.a((iuk) objArr[0], (ite) objArr[1], (String) objArr[2]);
                return null;
            case -1445549045:
                super.b(((Boolean) objArr[0]).booleanValue());
                return null;
            case 63286090:
                super.C();
                return null;
            case 74368342:
                super.O();
                return null;
            case 100226930:
                super.k();
                return null;
            case 109462140:
                super.u();
                return null;
            case 112232703:
                super.x();
                return null;
            case 114079745:
                super.z();
                return null;
            case 2087765241:
                return super.a((String) objArr[0]);
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static final /* synthetic */ void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dbea72c", new Object[]{dVar});
        } else {
            dVar.P();
        }
    }

    public static final /* synthetic */ void a(d dVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9e98a26", new Object[]{dVar, view});
        } else {
            dVar.a(view);
        }
    }

    public static final /* synthetic */ void a(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a16f128", new Object[]{dVar, new Boolean(z)});
        } else {
            dVar.e(z);
        }
    }

    public static final /* synthetic */ void b(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae562987", new Object[]{dVar, new Boolean(z)});
        } else {
            dVar.d(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Activity activity, ium parent, iru<? extends com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>> model, ViewGroup viewGroup, iur iurVar) {
        super(activity, parent, model, viewGroup, iurVar);
        kotlin.jvm.internal.q.c(activity, "activity");
        kotlin.jvm.internal.q.c(parent, "parent");
        kotlin.jvm.internal.q.c(model, "model");
        subscribeEvent(this);
        model.d().subscribe(this);
    }

    @Override // tb.htj, com.taobao.android.meta.structure.childpage.g
    public ise<irp, ? extends itn> a(String type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ise) ipChange.ipc$dispatch("7c70c4f9", new Object[]{this, type});
        }
        kotlin.jvm.internal.q.c(type, "type");
        if (kotlin.jvm.internal.q.a((Object) "topHeader", (Object) type)) {
            hte a2 = a();
            if (a2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.refactor.MSConfig");
            }
            return ((com.taobao.search.refactor.f) a2).ak();
        }
        return super.a(type);
    }

    @Override // com.taobao.android.meta.structure.childpage.g
    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        super.z();
        MSearchResult mSearchResult = null;
        this.i = null;
        iru model = (iru) getModel();
        kotlin.jvm.internal.q.a((Object) model, "model");
        MetaResult metaResult = (MetaResult) ((com.taobao.android.meta.data.b) model.d()).getTotalSearchResult();
        if (metaResult instanceof MSearchResult) {
            mSearchResult = metaResult;
        }
        MSearchResult mSearchResult2 = mSearchResult;
        if (mSearchResult2 == null) {
            return;
        }
        mSearchResult2.hasTopHeader = false;
    }

    @Override // com.taobao.android.meta.structure.childpage.g
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        cV_();
        jxs jxsVar = this.g;
        if (jxsVar != null) {
            iru model = (iru) getModel();
            kotlin.jvm.internal.q.a((Object) model, "model");
            jxsVar.onEventMainThread(isv.a.a(z, false, model.d()));
        }
        super.b(z);
        if (r.bw() && r.e("childPageRenderDelay")) {
            new Handler().post(new a(z));
        } else {
            e(z);
        }
        com.taobao.android.searchbaseframe.xsl.refact.q qVar = this.k;
        if (qVar == null) {
            return;
        }
        qVar.a();
    }

    private final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            if (r.bw() && r.e("floatBarDelay")) {
                new Handler().postDelayed(new e(), this.c != null ? 500L : 0L);
            } else {
                d(true);
            }
            E();
        }
        N();
    }

    @Override // com.taobao.android.meta.structure.childpage.g
    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
            return;
        }
        super.x();
        E();
    }

    @Override // com.taobao.android.meta.structure.childpage.g
    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ec556", new Object[]{this});
            return;
        }
        super.O();
        com.taobao.android.searchbaseframe.xsl.refact.q qVar = this.k;
        if (qVar == null) {
            return;
        }
        qVar.a(false);
    }

    private final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
            return;
        }
        iru model = (iru) getModel();
        kotlin.jvm.internal.q.a((Object) model, "model");
        MetaResult metaResult = (MetaResult) ((com.taobao.android.meta.data.b) model.d()).getTotalSearchResult();
        if (!(metaResult instanceof MSearchResult)) {
            metaResult = null;
        }
        MSearchResult mSearchResult = (MSearchResult) metaResult;
        if (mSearchResult == null || !mSearchResult.getUseNativeTopBar() || mSearchResult.newSearch) {
            return;
        }
        nwd nwdVar = this.d;
        if (nwdVar != null) {
            iru model2 = (iru) getModel();
            kotlin.jvm.internal.q.a((Object) model2, "model");
            com.taobao.android.searchbaseframe.datasource.impl.a d = model2.d();
            if (d == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonBaseDatasource");
            }
            nwdVar.a((com.taobao.search.sf.datasource.c) d);
            return;
        }
        Activity activity = getActivity();
        kotlin.jvm.internal.q.a((Object) activity, "activity");
        d dVar = this;
        iru iruVar = (iru) getModel();
        if (iruVar == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.CommonModelAdapter");
        }
        this.d = new nwd(activity, dVar, (com.taobao.search.sf.a) iruVar, null, new iuo());
    }

    @Override // tb.iut
    public void onChildAdded(iul iulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f9ea73a", new Object[]{this, iulVar});
            return;
        }
        super.onChildAdded(iulVar);
        if (!(iulVar instanceof jxs)) {
            return;
        }
        this.g = (jxs) iulVar;
    }

    @Override // com.taobao.android.meta.structure.childpage.g
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        super.u();
        G();
        postEvent(iqt.a.a(0));
        ((com.taobao.android.meta.structure.childpage.c) J()).bJ_().updateHeaderOffset();
        F();
    }

    private final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
            return;
        }
        iru model = (iru) getModel();
        kotlin.jvm.internal.q.a((Object) model, "model");
        MetaResult it = (MetaResult) ((com.taobao.android.meta.data.b) model.d()).getTotalSearchResult();
        if (it == null) {
            return;
        }
        kotlin.jvm.internal.q.a((Object) it, "it");
        if (!it.isSuccess()) {
            return;
        }
        iru model2 = (iru) getModel();
        kotlin.jvm.internal.q.a((Object) model2, "model");
        if (!model2.g()) {
            return;
        }
        ium parent = getParent();
        if (parent == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.meta.srp.SrpWidget<com.taobao.search.refactor.MSDataSource, com.taobao.search.refactor.MSCombo, com.taobao.search.sf.datasource.CommonSearchResult>");
        }
        com.taobao.android.meta.srp.c cVar = (com.taobao.android.meta.srp.c) parent;
        ite iteVar = this.i;
        if (iteVar != null) {
            if (iteVar == null) {
                kotlin.jvm.internal.q.a();
            }
            View d = iteVar.d();
            if (d == null) {
                kotlin.jvm.internal.q.a();
            }
            if (d.getParent() instanceof ViewGroup) {
                return;
            }
            cVar.k();
            ite iteVar2 = this.i;
            if (iteVar2 == null) {
                kotlin.jvm.internal.q.a();
            }
            cVar.a(iteVar2);
            cVar.m();
        } else if (cVar.l()) {
            cVar.k();
            cVar.m();
        }
        ((com.taobao.android.meta.structure.childpage.c) J()).bJ_().rebuildScrollHeaders();
    }

    @Override // com.taobao.android.meta.structure.childpage.g
    public void C() {
        ipj d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
            return;
        }
        super.C();
        iru model = (iru) getModel();
        kotlin.jvm.internal.q.a((Object) model, "model");
        if (model.g()) {
            G();
        }
        F();
        Activity activity = this.mActivity;
        if (!(activity instanceof ipk)) {
            activity = null;
        }
        ipk ipkVar = (ipk) activity;
        if (ipkVar == null || (d = ipkVar.d()) == null) {
            return;
        }
        d.b();
    }

    @Override // com.taobao.android.meta.structure.childpage.g
    public void f(boolean z) {
        boolean z2;
        IpChange ipChange = $ipChange;
        boolean z3 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.k == null) {
            Activity activity = getActivity();
            kotlin.jvm.internal.q.a((Object) activity, "activity");
            d dVar = this;
            iru iruVar = (iru) getModel();
            if (iruVar != null) {
                this.k = new com.taobao.android.searchbaseframe.xsl.refact.q(activity, dVar, iruVar, null, null);
                com.taobao.android.searchbaseframe.xsl.refact.q qVar = this.k;
                if (qVar == null) {
                    kotlin.jvm.internal.q.a();
                }
                qVar.ensureView();
                com.taobao.android.searchbaseframe.xsl.refact.q qVar2 = this.k;
                if (qVar2 == null) {
                    kotlin.jvm.internal.q.a();
                }
                qVar2.b(com.taobao.search.sf.b.a(getActivity()));
                ite iteVar = new ite(this.k);
                iteVar.a("list");
                this.j = iteVar;
                ((iru) getModel()).a().a(new f());
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.widget.WidgetModelAdapter<com.taobao.android.meta.data.MetaDataSource<com.taobao.android.meta.data.MetaCombo, com.taobao.android.meta.data.MetaResult<com.taobao.android.meta.data.MetaCombo>>>");
            }
        }
        com.taobao.android.searchbaseframe.xsl.refact.q qVar3 = this.k;
        if (qVar3 == null) {
            kotlin.jvm.internal.q.a();
        }
        FrameLayout frameLayout = (FrameLayout) qVar3.getView();
        if (frameLayout == null) {
            kotlin.jvm.internal.q.a();
        }
        kotlin.jvm.internal.q.a((Object) frameLayout, "pullToRefreshWidget!!.view!!");
        if (frameLayout.getParent() == null) {
            com.taobao.android.meta.structure.childpage.c cVar = (com.taobao.android.meta.structure.childpage.c) J();
            ite iteVar2 = this.j;
            if (iteVar2 == null) {
                kotlin.jvm.internal.q.a();
            }
            cVar.a(iteVar2);
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && z2) {
            ((com.taobao.android.meta.structure.childpage.c) J()).bJ_().commit();
        }
        ((com.taobao.android.meta.structure.childpage.c) J()).bJ_().resetScrollNode();
        com.taobao.android.searchbaseframe.xsl.refact.q qVar4 = this.k;
        if (qVar4 == null) {
            kotlin.jvm.internal.q.a();
        }
        iru model = (iru) getModel();
        kotlin.jvm.internal.q.a((Object) model, "model");
        MetaResult metaResult = (MetaResult) ((com.taobao.android.meta.data.b) model.d()).getLastSearchResult();
        if (!(metaResult instanceof CommonSearchResult)) {
            metaResult = null;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) metaResult;
        if (commonSearchResult != null && commonSearchResult.isPullRefreshEnabled) {
            z3 = true;
        }
        qVar4.a(z3);
    }

    private final void P() {
        com.taobao.android.meta.data.a combo;
        List<BaseCellBean> w;
        BaseCellBean baseCellBean;
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cdcd7", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = hashMap;
        iru model = (iru) getModel();
        kotlin.jvm.internal.q.a((Object) model, "model");
        String keyword = ((com.taobao.android.meta.data.b) model.d()).getKeyword();
        kotlin.jvm.internal.q.a((Object) keyword, "model.scopeDatasource.keyword");
        hashMap2.put("query", keyword);
        iru model2 = (iru) getModel();
        kotlin.jvm.internal.q.a((Object) model2, "model");
        MetaResult metaResult = (MetaResult) ((com.taobao.android.meta.data.b) model2.d()).getTotalSearchResult();
        if (!(metaResult instanceof CommonSearchResult)) {
            metaResult = null;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) metaResult;
        if (commonSearchResult != null) {
            JSONObject jSONObject = commonSearchResult.pageInfo;
            if (jSONObject != null) {
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    String key = entry.getKey();
                    kotlin.jvm.internal.q.a((Object) key, "entry.key");
                    hashMap2.put(key, entry.getValue().toString());
                }
            }
            Map<String, String> map = commonSearchResult.getMainInfo().pageTraceArgs;
            if (map != null) {
                hashMap.putAll(map);
            }
        }
        iru model3 = (iru) getModel();
        kotlin.jvm.internal.q.a((Object) model3, "model");
        MetaResult metaResult2 = (MetaResult) ((com.taobao.android.meta.data.b) model3.d()).getTotalSearchResult();
        if (metaResult2 != null && (combo = metaResult2.getCombo(0)) != null && (w = combo.w()) != null && (baseCellBean = (BaseCellBean) kotlin.collections.p.k((List<? extends Object>) w)) != null) {
            i = baseCellBean.pageNo;
        }
        hashMap2.put("srp_seq", String.valueOf(i));
        HashMap hashMap3 = new HashMap();
        hashMap3.put("utLogMap", com.taobao.android.searchbaseframe.util.r.c(JSON.toJSONString(hashMap)));
        com.taobao.search.mmd.util.e.a("Page_SearchItemList", "Search-RefreshExposure", 19997, hashMap3);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [android.view.View] */
    @Override // com.taobao.android.meta.structure.childpage.g
    public void a(iuk<BaseTypedBean, ?> widget, ite header, String type) {
        ?? view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d98859", new Object[]{this, widget, header, type});
            return;
        }
        kotlin.jvm.internal.q.c(widget, "widget");
        kotlin.jvm.internal.q.c(header, "header");
        kotlin.jvm.internal.q.c(type, "type");
        iru model = (iru) getModel();
        kotlin.jvm.internal.q.a((Object) model, "model");
        MetaResult metaResult = (MetaResult) ((com.taobao.android.meta.data.b) model.d()).getTotalSearchResult();
        if (metaResult == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonSearchResult");
        }
        if (!((CommonSearchResult) metaResult).isPullRefreshEnabled) {
            super.a(widget, header, type);
            return;
        }
        ((com.taobao.android.meta.structure.childpage.c) J()).a(header);
        if (!TextUtils.equals(type, "list") || (view = widget.getView()) == 0) {
            return;
        }
        view.setBackgroundColor(com.taobao.search.sf.b.a(getActivity()));
    }

    @Override // com.taobao.android.meta.structure.childpage.g
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        super.k();
        cV_();
    }

    private final void cV_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d19ecf3", new Object[]{this});
        } else if (this.e) {
        } else {
            hte a2 = a();
            if (a2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.refactor.MSConfig");
            }
            if (!((com.taobao.search.refactor.f) a2).al()) {
                return;
            }
            jxr.a(this, this);
            this.e = true;
        }
    }

    private final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        List<iuk<?, ?>> a2 = h().a("sceneHeader");
        if (a2 != null) {
            for (iuk<?, ?> iukVar : a2) {
                if ((iukVar instanceof itl) && ((itl) iukVar).i()) {
                    arrayList.add(iukVar);
                }
            }
        }
        List<iuk<?, ?>> a3 = h().a("topHeader");
        if (a3 != null) {
            for (iuk<?, ?> iukVar2 : a3) {
                if ((iukVar2 instanceof itl) && ((itl) iukVar2).i()) {
                    arrayList.add(iukVar2);
                }
            }
        }
        postEvent(ioe.b.a(null, null, null, arrayList));
    }

    private final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else if (this.h) {
        } else {
            if (this.c == null) {
                irq creatorParam = I();
                kotlin.jvm.internal.q.a((Object) creatorParam, "creatorParam");
                creatorParam.g = new c();
                this.c = com.taobao.search.sf.widgets.list.floatbar.l.CREATOR.a(creatorParam);
                com.taobao.search.sf.widgets.list.floatbar.l lVar = this.c;
                if (lVar == null) {
                    kotlin.jvm.internal.q.a();
                }
                lVar.attachToContainer();
                com.taobao.search.sf.widgets.list.floatbar.l lVar2 = this.c;
                if (lVar2 == null) {
                    kotlin.jvm.internal.q.a();
                }
                lVar2.d();
                com.taobao.search.sf.widgets.list.floatbar.l lVar3 = this.c;
                if (lVar3 == null) {
                    kotlin.jvm.internal.q.a();
                }
                lVar3.f19512a = false;
                com.taobao.search.sf.widgets.list.floatbar.l lVar4 = this.c;
                if (lVar4 == null) {
                    kotlin.jvm.internal.q.a();
                }
                lVar4.e();
                com.taobao.search.sf.widgets.list.floatbar.l lVar5 = this.c;
                if (lVar5 == null) {
                    kotlin.jvm.internal.q.a();
                }
                lVar5.f19512a = !com.taobao.search.common.util.n.INSTANCE.g();
            }
            iru model = (iru) getModel();
            kotlin.jvm.internal.q.a((Object) model, "model");
            MetaResult metaResult = (MetaResult) ((com.taobao.android.meta.data.b) model.d()).getLastSearchResult();
            if (metaResult == null) {
                return;
            }
            if (metaResult == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonSearchResult");
            }
            if (((CommonSearchResult) metaResult).floatBarBean == null) {
                return;
            }
            com.taobao.search.sf.widgets.list.floatbar.l lVar6 = this.c;
            if (lVar6 == null) {
                kotlin.jvm.internal.q.a();
            }
            lVar6.b(z);
        }
    }

    /* loaded from: classes7.dex */
    public static final class c implements iur {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.iur
        public void a(View componentView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, componentView});
                return;
            }
            kotlin.jvm.internal.q.c(componentView, "componentView");
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 85;
            com.taobao.android.meta.structure.childpage.c iView = (com.taobao.android.meta.structure.childpage.c) d.this.J();
            kotlin.jvm.internal.q.a((Object) iView, "iView");
            iView.b().addView(componentView, layoutParams);
        }

        @Override // tb.iur
        public void b(View componentView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91037249", new Object[]{this, componentView});
                return;
            }
            kotlin.jvm.internal.q.c(componentView, "componentView");
            com.taobao.android.meta.structure.childpage.c iView = (com.taobao.android.meta.structure.childpage.c) d.this.J();
            kotlin.jvm.internal.q.a((Object) iView, "iView");
            iView.b().removeView(componentView);
        }
    }

    private final void N() {
        MuiseBean muiseBean;
        TemplateBean template;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460add5", new Object[]{this});
            return;
        }
        iru model = (iru) getModel();
        kotlin.jvm.internal.q.a((Object) model, "model");
        com.taobao.android.meta.data.b bVar = (com.taobao.android.meta.data.b) model.d();
        MetaResult metaResult = (MetaResult) bVar.getLastSearchResult();
        if (!(metaResult instanceof MSearchResult)) {
            metaResult = null;
        }
        MSearchResult mSearchResult = (MSearchResult) metaResult;
        if (mSearchResult == null || (muiseBean = mSearchResult.popupBean) == null || (template = bVar.getTemplate(muiseBean.type)) == null) {
            return;
        }
        kotlin.jvm.internal.q.a((Object) template, "scopeDatasource.getTempl…popupBean.type) ?: return");
        nwz nwzVar = this.f;
        if (nwzVar != null) {
            nwzVar.destroyAndRemoveFromParent();
        }
        Activity activity = getActivity();
        kotlin.jvm.internal.q.a((Object) activity, "activity");
        iru model2 = (iru) getModel();
        kotlin.jvm.internal.q.a((Object) model2, "model");
        nwz nwzVar2 = new nwz(activity, this, model2, template, (ViewGroup) getView(), new iug((ViewGroup) getView()));
        nwzVar2.a(muiseBean);
        nwzVar2.attachToContainer();
        this.f = nwzVar2;
    }

    public final void onEventMainThread(nwk.b event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1245e335", new Object[]{this, event});
            return;
        }
        kotlin.jvm.internal.q.c(event, "event");
        com.taobao.android.searchbaseframe.datasource.impl.a aVar = event.f31807a;
        iru model = (iru) getModel();
        kotlin.jvm.internal.q.a((Object) model, "model");
        if (!kotlin.jvm.internal.q.a(aVar, (com.taobao.android.meta.data.b) model.d())) {
            return;
        }
        H();
    }

    private final void H() {
        LinearLayout linearLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
            return;
        }
        ((com.taobao.android.meta.structure.childpage.c) J()).bJ_().setScrollable(false);
        this.h = true;
        com.taobao.search.sf.widgets.list.floatbar.l lVar = this.c;
        if (lVar == null || (linearLayout = (LinearLayout) lVar.getView()) == null) {
            return;
        }
        linearLayout.setVisibility(8);
    }

    public final void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        int dip2px = DensityUtil.dip2px(Globals.getApplication(), 20.0f) + i + ((com.taobao.android.meta.structure.childpage.c) J()).bJ_().getListStart();
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.tbsearch_combo_toast, (ViewGroup) getView(), false);
        kotlin.jvm.internal.q.a((Object) inflate, "LayoutInflater.from(acti…combo_toast, view, false)");
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = dip2px;
        layoutParams2.gravity = 1;
        FrameLayout frameLayout = (FrameLayout) getView();
        if (frameLayout == null) {
            kotlin.jvm.internal.q.a();
        }
        frameLayout.addView(inflate);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_combo_toast);
        kotlin.jvm.internal.q.a((Object) textView, "textView");
        textView.setText(com.alibaba.ability.localization.b.a(R.string.taobao_app_1005_1_16654));
        inflate.setAlpha(0.0f);
        inflate.animate().alphaBy(1.0f);
        inflate.postDelayed(new RunnableC0775d(inflate), 800L);
    }

    private final void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f, 0.0f);
        ofFloat.addListener(new b(view));
        ofFloat.start();
    }
}
