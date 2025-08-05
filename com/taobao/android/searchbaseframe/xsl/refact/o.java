package com.taobao.android.searchbaseframe.xsl.refact;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.meta.uikit.MetaLayout;
import com.taobao.android.searchbaseframe.xsl.module.XslSearchResult;
import com.taobao.android.searchbaseframe.xsl.page.uikit.XslBackgroundView;
import com.taobao.android.searchbaseframe.xsl.page.uikit.XslPageLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.t;
import tb.htg;
import tb.htm;
import tb.iru;
import tb.itk;
import tb.itu;
import tb.iuk;
import tb.iul;
import tb.ium;
import tb.iuo;
import tb.iur;
import tb.ius;
import tb.kge;

/* loaded from: classes6.dex */
public final class o extends com.taobao.android.meta.structure.page.f<XslDataSource, htg, h, XslSearchResult> implements com.taobao.android.searchbaseframe.xsl.refact.b, itu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BG_TYPE_IMAGE = "image";
    public static final String BG_TYPE_IMAGE_LOCAL = "_image_local_";
    public static final b Companion;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.k[] f15043a;
    private final kotlin.d c;
    private final l d;
    private c e;
    private final l f;
    private c g;
    private final XslBackgroundView h;
    private final HashSet<itu> i;

    /* loaded from: classes6.dex */
    public static final class a implements com.taobao.android.searchbaseframe.meta.uikit.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f15044a;

        public a(JSONObject jSONObject) {
            this.f15044a = jSONObject;
        }

        @Override // com.taobao.android.searchbaseframe.meta.uikit.d
        public final com.taobao.android.searchbaseframe.meta.uikit.f a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.searchbaseframe.meta.uikit.f) ipChange.ipc$dispatch("739f582f", new Object[]{this, new Integer(i)});
            }
            JSONObject jSONObject = this.f15044a;
            if (jSONObject == null) {
                return null;
            }
            n nVar = new n(jSONObject);
            return new com.taobao.android.searchbaseframe.meta.uikit.f(nVar.c(), nVar.a(), nVar.b(), nVar.d(), 0, true, false);
        }
    }

    static {
        kge.a(903796160);
        kge.a(-2072587617);
        kge.a(-2034596719);
        f15043a = new kotlin.reflect.k[]{t.a(new PropertyReference1Impl(t.b(o.class), "headerHolder", "getHeaderHolder()Lcom/taobao/android/meta/structure/MetaHeadersHolder;"))};
        Companion = new b(null);
    }

    private final htm bE_() {
        IpChange ipChange = $ipChange;
        return (htm) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("bfda5142", new Object[]{this}) : this.c.getValue());
    }

    public static /* synthetic */ Object ipc$super(o oVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -336807415) {
            if (hashCode != 1628600297) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.a((MetaResult) objArr[0]);
            return null;
        }
        return super.onCreateView();
    }

    @Override // tb.iut, tb.iul
    public String getScopeTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("53eba25d", new Object[]{this}) : "udrRsltPg";
    }

    @Override // com.taobao.android.searchbaseframe.xsl.refact.b
    public /* synthetic */ ViewGroup l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("e56c89c2", new Object[]{this}) : (ViewGroup) getView();
    }

    @Override // com.taobao.android.searchbaseframe.xsl.refact.b
    public /* synthetic */ iru m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iru) ipChange.ipc$dispatch("6b59daa6", new Object[]{this}) : (iru) getModel();
    }

    @Override // tb.iun, tb.ius
    public /* synthetic */ View onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : a();
    }

    /* loaded from: classes6.dex */
    public static final class b {
        static {
            kge.a(1781436680);
        }

        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.o oVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(h metaConfig, Activity activity, ium parent, iru<XslDataSource> modelAdapter, ViewGroup viewGroup, iur iurVar) {
        super(metaConfig, activity, parent, modelAdapter, viewGroup, iurVar);
        kotlin.jvm.internal.q.c(metaConfig, "metaConfig");
        kotlin.jvm.internal.q.c(activity, "activity");
        kotlin.jvm.internal.q.c(parent, "parent");
        kotlin.jvm.internal.q.c(modelAdapter, "modelAdapter");
        this.c = kotlin.e.a(new XslPageWidget$headerHolder$2(this, metaConfig));
        this.d = new l(activity, parent, modelAdapter, viewGroup, new iuo(), true);
        this.f = new l(activity, parent, modelAdapter, viewGroup, new iuo(), false);
        this.h = new XslBackgroundView(activity);
        this.i = new HashSet<>();
    }

    public FrameLayout a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("46931b71", new Object[]{this});
        }
        FrameLayout view = (FrameLayout) super.onCreateView();
        kotlin.jvm.internal.q.a((Object) view, "view");
        a(view);
        this.e = a(this.d, true, "list");
        this.g = a(this.f, false, "sticky");
        ((com.taobao.android.meta.structure.page.b) J()).a();
        v().al().a(new XslPageWidget$onCreateView$1(this));
        e();
        g();
        v().ap().a(new XslPageWidget$onCreateView$2(this));
        return view;
    }

    @Override // com.taobao.android.searchbaseframe.xsl.refact.b
    public void a(com.taobao.android.searchbaseframe.meta.uikit.c callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e381d6df", new Object[]{this, callback});
            return;
        }
        kotlin.jvm.internal.q.c(callback, "callback");
        v().U().a((com.taobao.android.meta.data.d<com.taobao.android.searchbaseframe.meta.uikit.c>) callback);
    }

    @Override // com.taobao.android.searchbaseframe.xsl.refact.b
    public void c_(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19c0cc80", new Object[]{this, new Integer(i)});
        } else {
            ((com.taobao.android.meta.structure.page.b) J()).d().setListStart(i);
        }
    }

    @Override // com.taobao.android.searchbaseframe.xsl.refact.b
    public void d_(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea707c1", new Object[]{this, new Integer(i)});
        } else {
            v().r().a((com.taobao.android.meta.data.d<Integer>) Integer.valueOf(i));
        }
    }

    @Override // com.taobao.android.searchbaseframe.xsl.refact.b
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            v().E().a((com.taobao.android.meta.data.d<Integer>) Integer.valueOf(i));
        }
    }

    @Override // com.taobao.android.searchbaseframe.xsl.refact.b
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            v().u().a((com.taobao.android.meta.data.d<Integer>) Integer.valueOf(com.taobao.android.searchbaseframe.util.g.a(str, 0)));
        }
    }

    @Override // com.taobao.android.searchbaseframe.xsl.refact.b
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            v().ad().a((com.taobao.android.meta.data.d<Boolean>) Boolean.valueOf(z));
        }
    }

    @Override // com.taobao.android.searchbaseframe.xsl.refact.b
    public void a(String str, int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c702c780", new Object[]{this, str, new Integer(i), new Boolean(z), new Integer(i2)});
        } else if (str == null) {
        } else {
            switch (str.hashCode()) {
                case 115029:
                    if (!str.equals("top")) {
                        return;
                    }
                    e(z);
                    return;
                case 3148801:
                    if (!str.equals(itk.TYPE_FOLD)) {
                        return;
                    }
                    MetaLayout d = ((com.taobao.android.meta.structure.page.b) J()).d();
                    c cVar = this.g;
                    if (cVar == null) {
                        kotlin.jvm.internal.q.b("tabHeader");
                    }
                    d.scrollHeaderToTop(cVar, false, null);
                    com.taobao.android.meta.structure.childpage.g b2 = b(p().d().e().getIndex());
                    if (!(b2 instanceof e)) {
                        b2 = null;
                    }
                    e eVar = (e) b2;
                    if (eVar == null) {
                        return;
                    }
                    eVar.a(z, true);
                    return;
                case 3322014:
                    if (!str.equals("list")) {
                        return;
                    }
                    ((com.taobao.android.meta.structure.page.b) J()).d().fold();
                    com.taobao.android.meta.structure.childpage.g b3 = b(p().d().e().getIndex());
                    if (!(b3 instanceof e)) {
                        b3 = null;
                    }
                    e eVar2 = (e) b3;
                    if (eVar2 != null) {
                        eVar2.b(z, false);
                    }
                    p().a(p().d().e().getIndex(), i, -i2, z);
                    return;
                case 35721419:
                    if (!str.equals("listHeader")) {
                        return;
                    }
                    com.taobao.android.meta.structure.childpage.g b4 = b(p().d().e().getIndex());
                    if (!(b4 instanceof e)) {
                        b4 = null;
                    }
                    e eVar3 = (e) b4;
                    if (eVar3 == null) {
                        return;
                    }
                    eVar3.a(i, z);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.taobao.android.searchbaseframe.xsl.refact.b
    public void a(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c190d17", new Object[]{this, new Boolean(z), new Integer(i)});
            return;
        }
        int ar_ = ((com.taobao.android.meta.structure.page.a) K()).ar_();
        for (int i2 = 0; i2 < ar_; i2++) {
            com.taobao.android.meta.structure.childpage.g b2 = b(i2);
            if (b2 != null) {
                b2.p();
                p().a(p().d().e().getIndex(), 0, z);
                ((com.taobao.android.meta.structure.childpage.c) b2.J()).bJ_().unfold();
            }
        }
        MetaLayout d = ((com.taobao.android.meta.structure.page.b) J()).d();
        c cVar = this.e;
        if (cVar == null) {
            kotlin.jvm.internal.q.b("topHeader");
        }
        d.scrollHeaderToTop(cVar, z, null);
    }

    private final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            return;
        }
        int ar_ = ((com.taobao.android.meta.structure.page.a) K()).ar_();
        for (int i = 0; i < ar_; i++) {
            com.taobao.android.meta.structure.childpage.g b2 = b(i);
            if (b2 != null) {
                b2.p();
                p().a(p().d().e().getIndex(), 0, 0, z);
                ((com.taobao.android.meta.structure.childpage.c) b2.J()).bJ_().unfold();
            }
        }
        MetaLayout d = ((com.taobao.android.meta.structure.page.b) J()).d();
        c cVar = this.e;
        if (cVar == null) {
            kotlin.jvm.internal.q.b("topHeader");
        }
        d.scrollHeaderToTop(cVar, z, null);
    }

    @Override // com.taobao.android.searchbaseframe.xsl.refact.b
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            v().H().a((com.taobao.android.meta.data.d<Boolean>) Boolean.valueOf(!z));
        }
    }

    @Override // com.taobao.android.searchbaseframe.xsl.refact.b
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            v().y().a((com.taobao.android.meta.data.d<com.taobao.android.searchbaseframe.meta.uikit.d>) new a(jSONObject));
        }
    }

    @Override // com.taobao.android.searchbaseframe.xsl.refact.b
    public ius<?, ?, ?> i(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ius) ipChange.ipc$dispatch("5a7b42ac", new Object[]{this, new Integer(i)}) : b(i);
    }

    @Override // com.taobao.android.searchbaseframe.xsl.refact.b
    public void d(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac4048b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        v().ah().a((com.taobao.android.meta.data.d<Integer>) Integer.valueOf(i));
        v().ai().a((com.taobao.android.meta.data.d<Integer>) Integer.valueOf(i2));
    }

    @Override // com.taobao.android.searchbaseframe.xsl.refact.b
    public void e(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2faa3fcc", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        v().aj().a((com.taobao.android.meta.data.d<Integer>) Integer.valueOf(i));
        v().ak().a((com.taobao.android.meta.data.d<Integer>) Integer.valueOf(i2));
    }

    @Override // com.taobao.android.searchbaseframe.xsl.refact.b
    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
        } else {
            v().O().a((com.taobao.android.meta.data.d<Integer>) Integer.valueOf(i));
        }
    }

    @Override // com.taobao.android.searchbaseframe.xsl.refact.b
    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4137ff4", new Object[]{this, new Integer(i)});
        } else {
            v().ac().a((com.taobao.android.meta.data.d<Integer>) Integer.valueOf(i));
        }
    }

    @Override // com.taobao.android.searchbaseframe.xsl.refact.b
    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
        } else {
            v().P().a((com.taobao.android.meta.data.d<Integer>) Integer.valueOf(i));
        }
    }

    @Override // com.taobao.android.searchbaseframe.xsl.refact.b
    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            v().J().a((com.taobao.android.meta.data.d<Boolean>) Boolean.valueOf(z));
        }
    }

    @Override // com.taobao.android.searchbaseframe.xsl.refact.b
    public void a(XslPageLayout.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c603b53", new Object[]{this, aVar});
        } else {
            v().am().a((com.taobao.android.meta.data.d<XslPageLayout.a>) aVar);
        }
    }

    @Override // com.taobao.android.searchbaseframe.xsl.refact.b
    public void k_(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0f2a688", new Object[]{this, new Integer(i)});
            return;
        }
        com.taobao.android.meta.structure.childpage.g b2 = b(i);
        if (!(b2 instanceof e)) {
            b2 = null;
        }
        e eVar = (e) b2;
        if (eVar == null) {
            return;
        }
        eVar.G();
    }

    @Override // com.taobao.android.searchbaseframe.xsl.refact.b
    public boolean d(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad401d7c", new Object[]{this, new Integer(i)})).booleanValue() : b(i) != null;
    }

    @Override // com.taobao.android.searchbaseframe.xsl.refact.b
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            v().ae().a((com.taobao.android.meta.data.d<d>) new d(str, str2));
        }
    }

    private final void a(l lVar, List<com.taobao.android.meta.data.c> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31a4d562", new Object[]{this, lVar, list});
            return;
        }
        lVar.a();
        for (com.taobao.android.meta.data.c cVar : list) {
            htm bE_ = bE_();
            iru model = (iru) getModel();
            kotlin.jvm.internal.q.a((Object) model, "model");
            com.taobao.android.searchbaseframe.datasource.impl.a c = model.c();
            kotlin.jvm.internal.q.a((Object) c, "model.initDatasource");
            iuk<BaseTypedBean, ?> a2 = bE_.a(cVar, (com.taobao.android.meta.data.b) c, new XslPageWidget$setHeaders$widget$1(this), new XslPageWidget$setHeaders$widget$2(this));
            if (a2 != null) {
                a2.ensureView();
                a2.bindWithData(cVar.b());
                lVar.a(a2);
            }
        }
    }

    @Override // com.taobao.android.meta.structure.page.f
    public void a(MetaResult<htg> result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("611277e9", new Object[]{this, result});
            return;
        }
        kotlin.jvm.internal.q.c(result, "result");
        super.a(result);
        XslSearchResult xslSearchResult = (XslSearchResult) result;
        bE_().a();
        l lVar = this.d;
        ArrayList<com.taobao.android.meta.data.c> arrayList = xslSearchResult.topHeaders;
        kotlin.jvm.internal.q.a((Object) arrayList, "xslResult.topHeaders");
        a(lVar, arrayList);
        l lVar2 = this.f;
        ArrayList<com.taobao.android.meta.data.c> arrayList2 = xslSearchResult.tabHeaders;
        kotlin.jvm.internal.q.a((Object) arrayList2, "xslResult.tabHeaders");
        a(lVar2, arrayList2);
        bE_().b();
    }

    @Override // com.taobao.android.searchbaseframe.xsl.refact.b
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        com.taobao.android.meta.logic.a<XslDataSource, htg, XslSearchResult> p = p();
        if (p == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.xsl.refact.XslController");
        }
        return ((i) p).g();
    }

    @Override // com.taobao.android.searchbaseframe.xsl.refact.b
    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        if (a(((com.taobao.android.meta.structure.page.b) J()).d())) {
            com.taobao.android.meta.structure.childpage.g a2 = ((com.taobao.android.meta.structure.page.a) K()).a();
            if (a2 == null || (a(((com.taobao.android.meta.structure.childpage.c) a2.J()).bJ_()) && !a2.c(-1))) {
                return true;
            }
        }
        return false;
    }

    private final boolean a(MetaLayout metaLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b5b880a3", new Object[]{this, metaLayout})).booleanValue() : metaLayout == null || metaLayout.getTotalHeaderHeight() == metaLayout.getCurrentHeaderHeight();
    }

    @Override // com.taobao.android.searchbaseframe.xsl.refact.b
    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        com.taobao.android.meta.structure.childpage.g a2 = ((com.taobao.android.meta.structure.page.a) K()).a();
        return a2 != null && !a2.c(1);
    }

    @Override // com.taobao.android.searchbaseframe.xsl.refact.b
    public void a(itu ituVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee5a9dee", new Object[]{this, ituVar});
        } else if (ituVar == null) {
        } else {
            this.i.add(ituVar);
        }
    }

    private final void a(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f363e3eb", new Object[]{this, frameLayout});
            return;
        }
        v().ae().a(new XslPageWidget$addBackground$1(this));
        v().ad().a(new XslPageWidget$addBackground$2(this));
        frameLayout.addView(this.h, 0, new ViewGroup.LayoutParams(-1, -1));
    }

    private final c a(l lVar, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("fa32ecbf", new Object[]{this, lVar, new Boolean(z), str});
        }
        lVar.ensureView();
        c cVar = new c(lVar);
        cVar.a(z);
        cVar.a(str);
        ((com.taobao.android.meta.structure.page.b) J()).a(cVar);
        return cVar;
    }

    private final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        v().af().a(new XslPageWidget$applyTopProperties$1(this));
        v().ah().a(new XslPageWidget$applyTopProperties$2(this));
        v().ai().a(new XslPageWidget$applyTopProperties$3(this));
    }

    private final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            v().ag().a(new XslPageWidget$applyTabProperties$1(this));
        }
    }

    @Override // tb.itu
    public void a(iul iulVar, String str, Object obj, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da215b52", new Object[]{this, iulVar, str, obj, str2, str3});
            return;
        }
        Iterator<itu> it = this.i.iterator();
        while (it.hasNext()) {
            it.next().a(iulVar, str, obj, str2, str3);
        }
    }

    @Override // com.taobao.android.searchbaseframe.xsl.refact.b
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            v().ap().a((com.taobao.android.meta.data.d<Boolean>) Boolean.valueOf(!z));
        }
    }
}
