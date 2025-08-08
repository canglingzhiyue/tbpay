package com.taobao.search.refactor;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.structure.state.MetaState;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.datasource.a;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.meta.uikit.MetaLayout;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.common.util.r;
import com.taobao.search.common.util.y;
import com.taobao.search.mmd.datasource.bean.SFOnesearchBean;
import com.taobao.search.sf.BaseResultActivity;
import com.taobao.search.sf.MainSearchResultActivity;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.datasource.e;
import com.taobao.search.sf.widgets.searchbar.SearchBarTagBean;
import com.taobao.tao.util.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.t;
import tb.hte;
import tb.htf;
import tb.htg;
import tb.imn;
import tb.ipl;
import tb.ipq;
import tb.iqt;
import tb.irt;
import tb.iru;
import tb.ise;
import tb.itd;
import tb.iuk;
import tb.jvm;
import tb.kge;
import tb.nne;
import tb.nng;
import tb.nns;
import tb.noa;
import tb.nox;
import tb.noz;
import tb.npb;
import tb.nqh;
import tb.nsk;
import tb.nsx;
import tb.ntd;
import tb.ntr;
import tb.nul;

/* loaded from: classes7.dex */
public class g extends com.taobao.android.meta.srp.b<j, com.taobao.search.refactor.e, CommonSearchResult> implements e.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final /* synthetic */ kotlin.reflect.k[] o;
    public CommonSearchContext d;
    private BaseResultActivity e;
    private final k f;
    private p<j, com.taobao.search.refactor.e, CommonSearchResult> g;
    private boolean h;
    private JSONArray i;
    private nns j;
    private List<SearchBarTagBean> k;
    private ntd l;
    private SparseArray<Set<com.taobao.search.refactor.a>> m;
    private final imn n;
    private final kotlin.d p;
    private com.taobao.search.sf.g q;
    private boolean r;
    private boolean s;

    /* loaded from: classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ j b;
        public final /* synthetic */ boolean c;

        public a(j jVar, boolean z) {
            this.b = jVar;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            g.a(g.this, this.b, this.c);
            if (this.b.e() <= 0) {
                return;
            }
            final int e = this.b.e();
            this.b.a(0);
            FrameLayout frameLayout = (FrameLayout) g.this.c().getView();
            if (frameLayout == null) {
                kotlin.jvm.internal.q.a();
            }
            frameLayout.post(new Runnable() { // from class: com.taobao.search.refactor.g.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    com.taobao.android.meta.structure.childpage.c cVar;
                    MetaLayout bJ_;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    com.taobao.android.meta.structure.childpage.g d = g.this.d((g) a.this.b);
                    if (d != null && (cVar = (com.taobao.android.meta.structure.childpage.c) d.J()) != null && (bJ_ = cVar.bJ_()) != null) {
                        bJ_.fold();
                    }
                    g.this.a((g) a.this.b, e, 0, false);
                }
            });
        }
    }

    /* loaded from: classes7.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ j b;

        public b(j jVar) {
            this.b = jVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                g.this.c().getActivity().finish();
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ j b;

        public c(j jVar) {
            this.b = jVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                g.this.c().getActivity().finish();
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ j b;

        public d(j jVar) {
            this.b = jVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.b.resetInit();
            this.b.doNewSearch();
        }
    }

    /* renamed from: com.taobao.search.refactor.g$g  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class RunnableC0776g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j f19311a;

        public RunnableC0776g(j jVar) {
            this.f19311a = jVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f19311a.resetInit();
            this.f19311a.doNewSearch();
        }
    }

    /* loaded from: classes7.dex */
    public static final class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            View loadingView = g.a(g.this);
            kotlin.jvm.internal.q.a((Object) loadingView, "loadingView");
            loadingView.setAlpha(1.0f);
        }
    }

    static {
        kge.a(-359613413);
        kge.a(-1987047719);
        o = new kotlin.reflect.k[]{t.a(new PropertyReference1Impl(t.b(g.class), "loadingView", "getLoadingView()Landroid/view/View;"))};
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1845922032:
                super.b((g) ((com.taobao.android.meta.data.b) objArr[0]), ((Boolean) objArr[1]).booleanValue());
                return null;
            case -1331578958:
                return new Boolean(super.a((g) ((com.taobao.android.meta.data.b) objArr[0]), (com.taobao.android.meta.data.b) ((com.taobao.android.meta.data.a) objArr[1]), (ListStyle) objArr[2]));
            case -1107373491:
                super.b((g) ((com.taobao.android.meta.data.b) objArr[0]), (com.taobao.android.meta.structure.childpage.g) objArr[1]);
                return null;
            case -274184482:
                super.a((com.taobao.android.meta.structure.page.f) objArr[0]);
                return null;
            case 238753705:
                super.a((g) ((com.taobao.android.meta.data.b) objArr[0]), (com.taobao.android.meta.data.b) ((htg) objArr[1]), ((Boolean) objArr[2]).booleanValue(), (Map) objArr[3]);
                return null;
            case 816241265:
                super.a((g) ((com.taobao.android.meta.data.b) objArr[0]), ((Boolean) objArr[1]).booleanValue());
                return null;
            case 1105256304:
                super.a((g) ((com.taobao.android.meta.data.b) objArr[0]), (com.taobao.android.meta.data.b) ((htg) objArr[1]), ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue(), (com.taobao.android.meta.data.e<com.taobao.android.meta.data.b>) objArr[4]);
                return null;
            case 1979675630:
                super.a((g) ((com.taobao.android.meta.data.b) objArr[0]), (com.taobao.android.meta.structure.childpage.g) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    private final View m() {
        IpChange ipChange = $ipChange;
        return (View) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("93b2e9b6", new Object[]{this}) : this.p.getValue());
    }

    @Override // com.taobao.android.meta.logic.c
    public void c(j scopeDataSource, com.taobao.android.meta.structure.childpage.g childPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7afe929", new Object[]{this, scopeDataSource, childPage});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(childPage, "childPage");
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static final /* synthetic */ View a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("855b7c4b", new Object[]{gVar}) : gVar.m();
    }

    public static final /* synthetic */ void a(g gVar, com.taobao.android.meta.data.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c44d82b0", new Object[]{gVar, bVar, new Boolean(z)});
        } else {
            super.a((g) bVar, z);
        }
    }

    @Override // tb.hth, com.taobao.android.meta.logic.c
    public /* synthetic */ void a(com.taobao.android.meta.data.b bVar, com.taobao.android.meta.data.a aVar, com.taobao.android.meta.data.a aVar2, com.taobao.android.meta.data.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ed9e33", new Object[]{this, bVar, aVar, aVar2, eVar});
        } else {
            b((j) bVar, (com.taobao.search.refactor.e) aVar, (com.taobao.search.refactor.e) aVar2, (com.taobao.android.meta.data.e<com.taobao.search.refactor.e>) eVar);
        }
    }

    @Override // com.taobao.android.meta.srp.b, com.taobao.android.meta.logic.a, com.taobao.android.meta.logic.c
    public /* bridge */ /* synthetic */ void a(com.taobao.android.meta.data.b bVar, com.taobao.android.meta.data.a aVar, boolean z, Map map) {
        a2((j) bVar, (com.taobao.search.refactor.e) aVar, z, (Map<String, String>) map);
    }

    @Override // com.taobao.android.meta.srp.b, com.taobao.android.meta.logic.a, com.taobao.android.meta.logic.c
    public /* bridge */ /* synthetic */ void a(com.taobao.android.meta.data.b bVar, com.taobao.android.meta.data.a aVar, boolean z, boolean z2, com.taobao.android.meta.data.e eVar) {
        a((j) bVar, (com.taobao.search.refactor.e) aVar, z, z2, (com.taobao.android.meta.data.e<com.taobao.search.refactor.e>) eVar);
    }

    @Override // tb.hth
    public /* synthetic */ void a(com.taobao.android.meta.data.b bVar, htg htgVar, htg htgVar2, com.taobao.android.meta.data.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("393fdaa5", new Object[]{this, bVar, htgVar, htgVar2, eVar});
        } else {
            b((j) bVar, (com.taobao.search.refactor.e) htgVar, (com.taobao.search.refactor.e) htgVar2, (com.taobao.android.meta.data.e<com.taobao.search.refactor.e>) eVar);
        }
    }

    @Override // com.taobao.android.meta.srp.b
    public /* bridge */ /* synthetic */ void a(j jVar, com.taobao.search.refactor.e eVar, boolean z, Map map) {
        a2(jVar, eVar, z, (Map<String, String>) map);
    }

    @Override // com.taobao.android.meta.logic.a
    public /* bridge */ /* synthetic */ void a(com.taobao.android.meta.data.b bVar, iuk iukVar, boolean z, htf htfVar) {
        a((j) bVar, (iuk<?, ?>) iukVar, z, htfVar);
    }

    @Override // com.taobao.android.meta.srp.b, com.taobao.android.meta.logic.a, com.taobao.android.meta.logic.c
    public /* synthetic */ void a(com.taobao.android.meta.data.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30a6da71", new Object[]{this, bVar, new Boolean(z)});
        } else {
            b((j) bVar, z);
        }
    }

    @Override // com.taobao.android.meta.logic.a
    public /* synthetic */ void b(com.taobao.android.meta.data.b bVar, com.taobao.android.meta.data.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad346440", new Object[]{this, bVar, aVar});
        } else {
            a((j) bVar, (com.taobao.search.refactor.e) aVar);
        }
    }

    @Override // tb.hth, com.taobao.android.meta.logic.c
    public /* synthetic */ void b(com.taobao.android.meta.data.b bVar, com.taobao.android.meta.data.a aVar, com.taobao.android.meta.data.a aVar2, com.taobao.android.meta.data.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc2a5b4", new Object[]{this, bVar, aVar, aVar2, eVar});
        } else {
            a((j) bVar, (com.taobao.search.refactor.e) aVar, (com.taobao.search.refactor.e) aVar2, (com.taobao.android.meta.data.e<com.taobao.search.refactor.e>) eVar);
        }
    }

    @Override // tb.hth
    public /* synthetic */ void b(com.taobao.android.meta.data.b bVar, htg htgVar, htg htgVar2, com.taobao.android.meta.data.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f12c4826", new Object[]{this, bVar, htgVar, htgVar2, eVar});
        } else {
            a((j) bVar, (com.taobao.search.refactor.e) htgVar, (com.taobao.search.refactor.e) htgVar2, (com.taobao.android.meta.data.e<com.taobao.search.refactor.e>) eVar);
        }
    }

    @Override // com.taobao.android.meta.srp.b, com.taobao.android.meta.logic.a, com.taobao.android.meta.logic.c
    public /* synthetic */ void b(com.taobao.android.meta.data.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f97710", new Object[]{this, bVar, new Boolean(z)});
        } else {
            a((j) bVar, z);
        }
    }

    @Override // com.taobao.android.meta.logic.a
    public /* synthetic */ iru e(com.taobao.android.meta.data.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iru) ipChange.ipc$dispatch("bf9aaef3", new Object[]{this, bVar}) : b((j) bVar);
    }

    @Override // com.taobao.android.meta.srp.b
    public /* synthetic */ void f(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9f1248", new Object[]{this, jVar});
        } else {
            h(jVar);
        }
    }

    public final imn l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (imn) ipChange.ipc$dispatch("63a821a9", new Object[]{this}) : this.n;
    }

    public g(imn core) {
        kotlin.jvm.internal.q.c(core, "core");
        this.n = core;
        this.p = kotlin.e.a(new MSController$loadingView$2(this));
        this.f = new k();
        this.q = new com.taobao.search.sf.g();
        this.f.a(this);
        this.g = this.f;
        this.m = new SparseArray<>();
        this.r = com.alibaba.ability.localization.b.f();
        this.s = com.alibaba.ability.localization.b.b();
    }

    public final void a(CommonSearchContext commonSearchContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50b1f163", new Object[]{this, commonSearchContext});
            return;
        }
        kotlin.jvm.internal.q.c(commonSearchContext, "<set-?>");
        this.d = commonSearchContext;
    }

    public final CommonSearchContext g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommonSearchContext) ipChange.ipc$dispatch("8a200e63", new Object[]{this});
        }
        CommonSearchContext commonSearchContext = this.d;
        if (commonSearchContext == null) {
            kotlin.jvm.internal.q.b("searchContext");
        }
        return commonSearchContext;
    }

    public final void a(BaseResultActivity baseResultActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b969d4", new Object[]{this, baseResultActivity});
        } else {
            this.e = baseResultActivity;
        }
    }

    public final void a(nns nnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f68d6345", new Object[]{this, nnsVar});
        } else {
            this.j = nnsVar;
        }
    }

    public final nns h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nns) ipChange.ipc$dispatch("44e3d664", new Object[]{this}) : this.j;
    }

    public final void a(List<SearchBarTagBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.k = list;
        }
    }

    public final void a(ntd ntdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6db1eba", new Object[]{this, ntdVar});
        } else {
            this.l = ntdVar;
        }
    }

    @Override // com.taobao.android.meta.logic.c
    public iru<j> a(int i, TabBean tab, j initDataSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iru) ipChange.ipc$dispatch("787fc5af", new Object[]{this, new Integer(i), tab, initDataSource});
        }
        kotlin.jvm.internal.q.c(tab, "tab");
        kotlin.jvm.internal.q.c(initDataSource, "initDataSource");
        return this.g.a(i, tab, (TabBean) initDataSource);
    }

    public final void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
        } else {
            this.i = jSONArray;
        }
    }

    public final void a(com.taobao.search.sf.datasource.c dataSource, com.taobao.search.refactor.a listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ae0a33f", new Object[]{this, dataSource, listener});
            return;
        }
        kotlin.jvm.internal.q.c(dataSource, "dataSource");
        kotlin.jvm.internal.q.c(listener, "listener");
        HashSet hashSet = this.m.get(dataSource.hashCode());
        if (hashSet == null) {
            hashSet = new HashSet();
            this.m.put(dataSource.hashCode(), hashSet);
        }
        hashSet.add(listener);
    }

    public final void b(com.taobao.search.sf.datasource.c dataSource, com.taobao.search.refactor.a listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3c103de", new Object[]{this, dataSource, listener});
            return;
        }
        kotlin.jvm.internal.q.c(dataSource, "dataSource");
        kotlin.jvm.internal.q.c(listener, "listener");
        Set<com.taobao.search.refactor.a> set = this.m.get(dataSource.hashCode());
        if (set == null) {
            return;
        }
        set.remove(listener);
    }

    private final void a(com.taobao.search.sf.datasource.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("141ef998", new Object[]{this, cVar});
            return;
        }
        Set<com.taobao.search.refactor.a> set = this.m.get(cVar.hashCode());
        if (set == null) {
            return;
        }
        for (com.taobao.search.refactor.a aVar : set) {
            aVar.v();
        }
    }

    public void a(j scopeDataSource) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dc16166", new Object[]{this, scopeDataSource});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        CommonSearchResult it = (CommonSearchResult) scopeDataSource.getTotalSearchResult();
        if (it == null) {
            return;
        }
        kotlin.jvm.internal.q.a((Object) it, "it");
        if (!it.isSuccess()) {
            return;
        }
        String str = it.getMainInfo().pageName;
        String str2 = it.getMainInfo().pageTraceName;
        Map<String, String> map2 = it.getMainInfo().pageTraceArgs;
        if (scopeDataSource.w()) {
            str2 = "Page_SearchSimilar";
        } else if (scopeDataSource.x()) {
            str2 = "Page_SearchSameStyle";
        } else if (scopeDataSource.y()) {
            str2 = "Page_SearchSpuItemList";
        } else {
            String str3 = str;
            if (StringUtils.equals(nne.PAGE_NAME_MAIN_SPU, str3)) {
                str2 = "Page_SearchSpuList";
            } else if (StringUtils.equals(nne.PAGE_NAME_MAIN, str3)) {
                str2 = "Page_SearchItemList";
            } else if (StringUtils.equals(nne.PAGE_NAME_TMALL, str3)) {
                str2 = "Page_SearchTmallList";
            } else if (StringUtils.equals(nne.PAGE_NAME_TMALL_SPU, str3)) {
                str2 = "Page_SearchTmallSpuList";
            } else if (StringUtils.equals(nne.PAGE_NAME_SHOP, str3)) {
                str2 = "Page_SearchShopList";
            } else if (it.newSearch) {
                str2 = it.getMainInfo().pageTraceName;
            }
        }
        if (StringUtils.isEmpty(str2)) {
            str2 = "Page_SearchItemList";
        }
        HashMap hashMap = new HashMap();
        if (it.newSearch) {
            hashMap.put(noa.VALUE_BIZ_TYPE_NEW_SEARCH, "true");
        }
        CommonSearchContext commonSearchContext = this.d;
        if (commonSearchContext == null) {
            kotlin.jvm.internal.q.b("searchContext");
        }
        String param = commonSearchContext.getParam("pageName");
        if (!StringUtils.isEmpty(param)) {
            CommonSearchContext commonSearchContext2 = this.d;
            if (commonSearchContext2 == null) {
                kotlin.jvm.internal.q.b("searchContext");
            }
            String param2 = commonSearchContext2.getParam("psqk");
            if (!StringUtils.isEmpty(param2)) {
                hashMap.put("psqk", param2);
            }
            str2 = param;
        }
        String keyword = scopeDataSource.getKeyword();
        String str4 = keyword;
        if (!StringUtils.isEmpty(str4)) {
            HashMap hashMap2 = hashMap;
            hashMap2.put(Constants.KEY_SEARCH_KEYWORD, keyword);
            hashMap2.put("keyword", keyword);
        }
        if (map2 != null) {
            hashMap.putAll(map2);
        }
        HashMap hashMap3 = new HashMap();
        SFOnesearchBean onesearch = it.getOnesearch();
        if (onesearch != null && (map = onesearch.nextPageTraceMap) != null) {
            hashMap3.putAll(map);
        }
        if (!StringUtils.isEmpty(str4)) {
            HashMap hashMap4 = hashMap3;
            hashMap4.put(Constants.KEY_SEARCH_KEYWORD, keyword);
            hashMap4.put("keyword", keyword);
        }
        BaseResultActivity baseResultActivity = this.e;
        if (baseResultActivity == null) {
            return;
        }
        baseResultActivity.onEventMainThread(iqt.p.a(str2, false, hashMap, hashMap3));
    }

    @Override // tb.hth, com.taobao.android.meta.logic.a
    public void a(j scopeDataSource, com.taobao.android.meta.structure.childpage.g childPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a4d14eb", new Object[]{this, scopeDataSource, childPage});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(childPage, "childPage");
        j jVar = scopeDataSource;
        super.a((g) jVar, childPage);
        this.g.a((p<j, com.taobao.search.refactor.e, CommonSearchResult>) jVar, childPage);
        a(scopeDataSource);
        if (!r.ce()) {
            return;
        }
        ntr ntrVar = ntr.INSTANCE;
        Activity activity = c().getActivity();
        kotlin.jvm.internal.q.a((Object) activity, "pageWidget.activity");
        String tab = scopeDataSource.getTab();
        if (tab == null) {
            tab = "";
        }
        ntrVar.a(activity, "pageState", "currentTab", tab);
    }

    @Override // com.taobao.android.meta.logic.a
    public com.taobao.android.searchbaseframe.context.a f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.searchbaseframe.context.a) ipChange.ipc$dispatch("ada654c5", new Object[]{this});
        }
        CommonSearchContext commonSearchContext = this.d;
        if (commonSearchContext == null) {
            kotlin.jvm.internal.q.b("searchContext");
        }
        return commonSearchContext;
    }

    @Override // tb.hth
    public void b(j scopeDataSource, com.taobao.android.meta.structure.childpage.g childPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8fe7f0a", new Object[]{this, scopeDataSource, childPage});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(childPage, "childPage");
        if (!scopeDataSource.isInitDataSource() && r.bR()) {
            com.taobao.android.searchbaseframe.context.a f2 = e().f();
            if (!(f2 instanceof CommonSearchContext)) {
                f2 = null;
            }
            CommonSearchContext commonSearchContext = (CommonSearchContext) f2;
            if (commonSearchContext != null) {
                scopeDataSource.setParams(commonSearchContext.getOtherTabParams());
            }
        }
        p<j, com.taobao.search.refactor.e, CommonSearchResult> pVar = this.g;
        if (!(pVar instanceof k)) {
            if (pVar == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.refactor.ns.NSFlow");
            }
            ((npb) pVar).b(scopeDataSource);
            return;
        }
        if (StringUtils.isEmpty(scopeDataSource.getKeyword())) {
            CommonSearchContext commonSearchContext2 = this.d;
            if (commonSearchContext2 == null) {
                kotlin.jvm.internal.q.b("searchContext");
            }
            String keyword = commonSearchContext2.getKeyword();
            if (!StringUtils.isEmpty(keyword)) {
                scopeDataSource.setParam("q", keyword);
            }
        }
        super.b((g) scopeDataSource, childPage);
    }

    public void a(j scopeDataSource, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a6b7e2e", new Object[]{this, scopeDataSource, new Boolean(z)});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        j jVar = scopeDataSource;
        this.g.b(jVar, z);
        super.b((g) jVar, z);
        if (!z || !kotlin.jvm.internal.q.a((j) d().e(), scopeDataSource)) {
            return;
        }
        a(scopeDataSource);
    }

    private final void k(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8238def0", new Object[]{this, jVar});
            return;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) jVar.getLastSearchResult();
        if (commonSearchResult == null) {
            return;
        }
        kotlin.jvm.internal.q.a((Object) commonSearchResult, "scopeDataSource.lastSearchResult ?: return");
        MSearchResult i = jVar.i();
        if (i == null) {
            return;
        }
        com.taobao.search.refactor.e combo = i.getCombo(0);
        if (!i.isPageTurning || combo == null) {
            return;
        }
        ((iru) c().getModel()).a().a(true);
        if (!commonSearchResult.getCells().isEmpty()) {
            return;
        }
        a((g) jVar, (j) combo);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void a2(j scopeDataSource, com.taobao.search.refactor.e eVar, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c3343a", new Object[]{this, scopeDataSource, eVar, new Boolean(z), map});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        if (z) {
            if (StringUtils.equals(map != null ? map.get("searchType") : null, "preload")) {
                return;
            }
        }
        j jVar = scopeDataSource;
        super.a((g) jVar, (j) eVar, z, map);
        this.g.a((p<j, com.taobao.search.refactor.e, CommonSearchResult>) jVar, (j) eVar, z, map);
        a((com.taobao.search.sf.datasource.c) scopeDataSource);
    }

    public void a(j scopeDataSource, com.taobao.search.refactor.e src, com.taobao.search.refactor.e incoming, com.taobao.android.meta.data.e<com.taobao.search.refactor.e> config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc0cf0e4", new Object[]{this, scopeDataSource, src, incoming, config});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(src, "src");
        kotlin.jvm.internal.q.c(incoming, "incoming");
        kotlin.jvm.internal.q.c(config, "config");
        this.g.b(scopeDataSource, src, incoming, config);
    }

    public void b(j scopeDataSource, com.taobao.search.refactor.e src, com.taobao.search.refactor.e incoming, com.taobao.android.meta.data.e<com.taobao.search.refactor.e> config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f19ed25", new Object[]{this, scopeDataSource, src, incoming, config});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(src, "src");
        kotlin.jvm.internal.q.c(incoming, "incoming");
        kotlin.jvm.internal.q.c(config, "config");
        this.g.a((p<j, com.taobao.search.refactor.e, CommonSearchResult>) scopeDataSource, src, incoming, config);
    }

    private final boolean c(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b72e0ec", new Object[]{this, jVar})).booleanValue();
        }
        if (!r.co()) {
            return false;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) jVar.getTotalSearchResult();
        if (!(commonSearchResult instanceof MSearchResult)) {
            commonSearchResult = null;
        }
        MSearchResult mSearchResult = (MSearchResult) commonSearchResult;
        if (mSearchResult == null || !mSearchResult.isRedirectMode() || StringUtils.isEmpty(mSearchResult.getRedirectUrl())) {
            return false;
        }
        SFOnesearchBean onesearch = mSearchResult.getOnesearch();
        if (onesearch != null && !StringUtils.isEmpty(onesearch.utLogMap) && !StringUtils.isEmpty(onesearch.expArg1)) {
            HashMap hashMap = new HashMap();
            String b2 = y.b(onesearch.utLogMap);
            kotlin.jvm.internal.q.a((Object) b2, "SearchUrlUtil.encodeByUTF8(onesearch.utLogMap)");
            hashMap.put("utLogMap", b2);
            hashMap.put("spm", "a2141.7631557.0.0");
            com.taobao.search.mmd.util.e.b(onesearch.expArg1, hashMap);
        }
        Intent intentForUri = Nav.from(c().getActivity()).intentForUri(mSearchResult.getRedirectUrl());
        if (intentForUri == null || intentForUri.getComponent() == null) {
            Nav.from(c().getActivity()).toUri(mSearchResult.getRedirectUrl());
            new Handler(Looper.getMainLooper()).post(new b(jVar));
            return true;
        }
        String canonicalName = MainSearchResultActivity.class.getCanonicalName();
        ComponentName component = intentForUri.getComponent();
        if (component == null) {
            kotlin.jvm.internal.q.a();
        }
        if (!StringUtils.equals(canonicalName, component.getClassName())) {
            Nav.from(c().getActivity()).toUri(mSearchResult.getRedirectUrl());
            new Handler(Looper.getMainLooper()).post(new c(jVar));
            return true;
        }
        String queryParameter = Uri.parse(mSearchResult.getRedirectUrl()).getQueryParameter("q");
        CommonSearchContext commonSearchContext = this.d;
        if (commonSearchContext == null) {
            kotlin.jvm.internal.q.b("searchContext");
        }
        if (!StringUtils.equals(queryParameter, commonSearchContext.getParam("q"))) {
            return false;
        }
        CommonSearchContext commonSearchContext2 = this.d;
        if (commonSearchContext2 == null) {
            kotlin.jvm.internal.q.b("searchContext");
        }
        String param = commonSearchContext2.getParam("from");
        CommonSearchContext commonSearchContext3 = this.d;
        if (commonSearchContext3 == null) {
            kotlin.jvm.internal.q.b("searchContext");
        }
        commonSearchContext3.updateParams(com.taobao.android.searchbaseframe.util.f.a(Uri.parse(mSearchResult.getRedirectUrl())));
        if (!StringUtils.isEmpty(param)) {
            CommonSearchContext commonSearchContext4 = this.d;
            if (commonSearchContext4 == null) {
                kotlin.jvm.internal.q.b("searchContext");
            }
            commonSearchContext4.setParam("from", param);
        }
        mSearchResult.setRedirectMode(false);
        mSearchResult.setRedirectUrl("");
        mSearchResult.clearCombos();
        CommonSearchContext commonSearchContext5 = this.d;
        if (commonSearchContext5 == null) {
            kotlin.jvm.internal.q.b("searchContext");
        }
        j newDs = com.taobao.search.sf.datasource.e.a(true, commonSearchContext5, (e.b) this);
        kotlin.jvm.internal.q.a((Object) newDs, "newDs");
        jVar.setSearchParam(newDs.getCurrentParam());
        b((g) jVar);
        new Handler().post(new d(jVar));
        return true;
    }

    private final void i(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4875f6e", new Object[]{this, jVar});
            return;
        }
        TemplateBean template = jVar.getTemplate(this.r ? "ms_tb-webb-widget_tbs_widget_m3" : this.s ? "ms_tmall-ovs-rax_tmg_search_item_all_m1" : "ms_tmall-ovs-rax_tmg_search_item_local_m1");
        if (template == null) {
            return;
        }
        kotlin.jvm.internal.q.a((Object) template, "initDataSource.getTemplate(cardType) ?: return");
        jvm.c templateFile = jVar.getTemplateFile(template.url);
        if (templateFile == null) {
            return;
        }
        kotlin.jvm.internal.q.a((Object) templateFile, "initDataSource.getTempla…mplateBean.url) ?: return");
        ipl.g().a(templateFile, template);
    }

    private final void j(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b601f2f", new Object[]{this, jVar});
            return;
        }
        TemplateBean template = jVar.getTemplate(this.r ? r.cH() : "ms_tmall-ovs-rax_search_weexv2_topbar_sort");
        if (template == null) {
            return;
        }
        kotlin.jvm.internal.q.a((Object) template, "initDataSource.getTemplate(cardType) ?: return");
        jvm.c templateFile = jVar.getTemplateFile(template.url);
        if (templateFile == null) {
            return;
        }
        kotlin.jvm.internal.q.a((Object) templateFile, "initDataSource.getTempla…mplateBean.url) ?: return");
        ipl.g().b(templateFile, template);
    }

    public void b(j initDataSource, boolean z) {
        ArrayList<com.taobao.android.meta.data.c> headers;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeaab68d", new Object[]{this, initDataSource, new Boolean(z)});
            return;
        }
        kotlin.jvm.internal.q.c(initDataSource, "initDataSource");
        if (z && r.bw() && r.e("preloadInstance")) {
            i(initDataSource);
            j(initDataSource);
        }
        if (z) {
            if (c(initDataSource)) {
                CommonSearchResult commonSearchResult = (CommonSearchResult) initDataSource.getTotalSearchResult();
                if (commonSearchResult != null && (headers = commonSearchResult.getHeaders()) != null) {
                    headers.clear();
                }
                this.h = false;
                return;
            } else if (f2(initDataSource)) {
                return;
            } else {
                d(initDataSource);
            }
        }
        j jVar = initDataSource;
        this.g.a((p<j, com.taobao.search.refactor.e, CommonSearchResult>) jVar, z);
        if (initDataSource.f()) {
            FrameLayout frameLayout = (FrameLayout) c().getView();
            if (frameLayout == null) {
                kotlin.jvm.internal.q.a();
            }
            frameLayout.post(new a(initDataSource, z));
        } else {
            super.a((g) jVar, z);
        }
        e(initDataSource);
    }

    /* renamed from: f  reason: avoid collision after fix types in other method */
    private final boolean f2(j jVar) {
        CommonSearchResult commonSearchResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ffd202f", new Object[]{this, jVar})).booleanValue();
        }
        if (!(this.g instanceof nox)) {
            return false;
        }
        q.a();
        if (!r.aB() || (commonSearchResult = (CommonSearchResult) jVar.getTotalSearchResult()) == null || commonSearchResult.comboSize() != 0) {
            return false;
        }
        this.g = this.f;
        this.h = false;
        jVar.setParam("guideSearch", "false");
        new Handler().post(new RunnableC0776g(jVar));
        q.b();
        return true;
    }

    private final void d(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b24ba0a9", new Object[]{this, jVar});
            return;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) jVar.getTotalSearchResult();
        if (commonSearchResult == null) {
            return;
        }
        hte a2 = e().a();
        if (a2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.refactor.MSConfig");
        }
        com.taobao.search.refactor.f fVar = (com.taobao.search.refactor.f) a2;
        if (commonSearchResult.newSearch && !commonSearchResult.subTabNewSearch) {
            fVar.b(true);
            fVar.a(e.INSTANCE);
            fVar.b(f.INSTANCE);
            fVar.c(true);
            com.taobao.android.meta.data.d<com.taobao.android.searchbaseframe.meta.uikit.d> y = fVar.y();
            Activity activity = c().getActivity();
            if (!(activity instanceof com.taobao.android.xsearchplugin.muise.f)) {
                activity = null;
            }
            com.taobao.android.xsearchplugin.muise.f fVar2 = (com.taobao.android.xsearchplugin.muise.f) activity;
            y.a((com.taobao.android.meta.data.d<com.taobao.android.searchbaseframe.meta.uikit.d>) new nsx(fVar2 != null && fVar2.g()));
            if (commonSearchResult.guideSearch && commonSearchResult.guideSearchNative) {
                fVar.J().a((com.taobao.android.meta.data.d<Boolean>) true);
            }
            fVar.n(false);
            return;
        }
        fVar.p(true);
        fVar.e(commonSearchResult.isPreciseAppear);
    }

    /* loaded from: classes7.dex */
    public static final class e<PARAMS, RESULT> implements ise<ipq, itd<?, ?>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final e INSTANCE = new e();

        @Override // tb.ise
        public final com.taobao.search.musie.k a(ipq ipqVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.search.musie.k) ipChange.ipc$dispatch("fa5e3d70", new Object[]{this, ipqVar}) : new com.taobao.search.musie.k(ipqVar.c, ipqVar.e, ipqVar.d, ipqVar.b, ipqVar.f, ipqVar.f29218a);
        }
    }

    /* loaded from: classes7.dex */
    public static final class f<PARAMS, RESULT> implements ise<ipq, itd<?, ?>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final f INSTANCE = new f();

        @Override // tb.ise
        public final com.taobao.search.sf.newsearch.widgets.d a(ipq ipqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.search.sf.newsearch.widgets.d) ipChange.ipc$dispatch("ca29f0c2", new Object[]{this, ipqVar});
            }
            Activity activity = ipqVar.c;
            iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar = ipqVar.e;
            if (iruVar != null) {
                return new com.taobao.search.sf.newsearch.widgets.d(activity, iruVar, ipqVar.d, ipqVar.b, ipqVar.f, ipqVar.f29218a);
            }
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.widget.WidgetModelAdapter<com.taobao.search.refactor.MSDataSource>");
        }
    }

    private final void e(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1924606a", new Object[]{this, jVar});
        } else if (!StringUtils.equals(jVar.getParamValue("addToHistory"), "true")) {
        } else {
            new nqh(null, jVar.getParamValueIncludingGlobal(noa.KEY_CHANNEL_HISTORY_KEY)).a(jVar.getKeyword());
        }
    }

    private final boolean g(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e6d5dff0", new Object[]{this, jVar})).booleanValue() : StringUtils.isEmpty(jVar.getParamValueIncludingGlobal("channelSrp")) && StringUtils.isEmpty(jVar.getParamValue("m")) && !c().A();
    }

    private final void a(com.taobao.search.refactor.e eVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7cbf4b", new Object[]{this, eVar, new Boolean(z), new Boolean(z2)});
        } else if (eVar == null) {
        } else {
            if (!z && z2) {
                eVar.am();
            }
            eVar.j(false);
        }
    }

    @Override // com.taobao.android.meta.srp.b
    public void a(j scopeDataSource, com.taobao.search.refactor.e eVar, boolean z, boolean z2, com.taobao.android.meta.data.e<com.taobao.search.refactor.e> config) {
        com.taobao.search.refactor.e combo;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9b59c1", new Object[]{this, scopeDataSource, eVar, new Boolean(z), new Boolean(z2), config});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(config, "config");
        a(eVar, z, z2);
        ResultMainInfoBean resultMainInfoBean = null;
        if (z) {
            Map<String, String> e2 = config.e();
            if (StringUtils.equals(e2 != null ? e2.get("searchType") : null, "preload")) {
                return;
            }
        }
        if (((iru) c().getModel()).a().ar()) {
            com.taobao.android.searchbaseframe.util.t.a(m());
        }
        if (!z) {
            Map<String, String> e3 = config.e();
            if (StringUtils.equals(e3 != null ? e3.get("searchType") : null, "all") && (this.g instanceof k)) {
                if (g(scopeDataSource)) {
                    a(scopeDataSource);
                }
                MSearchResult i2 = scopeDataSource.i();
                if (i2 != null && (combo = i2.getCombo(0)) != null) {
                    eVar = combo;
                }
            }
        }
        j jVar = scopeDataSource;
        super.a((g) jVar, (j) eVar, z, z2, (com.taobao.android.meta.data.e<j>) config);
        this.g.a(jVar, eVar, z, z2, config);
        if (!z && this.l != null) {
            if (z2) {
                if ((eVar != null ? eVar.y() : null) == null) {
                    if (eVar != null) {
                        resultMainInfoBean = eVar.a();
                    }
                    if (resultMainInfoBean == null) {
                        kotlin.jvm.internal.q.a();
                    }
                    i = resultMainInfoBean.totalResult;
                }
            }
            c(i);
        }
        k(scopeDataSource);
    }

    public final void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        ntd ntdVar = this.l;
        if (ntdVar == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "totalResults", String.valueOf(i));
        ntdVar.a("searchFinish", jSONObject);
    }

    @Override // com.taobao.android.meta.logic.c
    public void a(j scopeDataSource, com.taobao.search.refactor.e combo, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d410b41a", new Object[]{this, scopeDataSource, combo, new Integer(i)});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(combo, "combo");
        this.g.a((p<j, com.taobao.search.refactor.e, CommonSearchResult>) scopeDataSource, (j) combo, i);
    }

    @Override // tb.hth, com.taobao.android.meta.logic.c
    public boolean a(int i, j initDataSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6982d5d", new Object[]{this, new Integer(i), initDataSource})).booleanValue();
        }
        kotlin.jvm.internal.q.c(initDataSource, "initDataSource");
        return this.g.a(i, (int) initDataSource);
    }

    public void a(j scopeDataSource, com.taobao.search.refactor.e combo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48e7c009", new Object[]{this, scopeDataSource, combo});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(combo, "combo");
        this.g.a((p<j, com.taobao.search.refactor.e, CommonSearchResult>) scopeDataSource, (j) combo);
    }

    private final boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue() : !StringUtils.isEmpty(jSONObject.getString(nsk.KEY_NEW_SEARCH_URL));
    }

    private final boolean b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63b9982b", new Object[]{this, jSONObject})).booleanValue() : !StringUtils.isEmpty(jSONObject.getString(nsk.KEY_GUIDE_SEARCH_URL));
    }

    public iru<j> b(j initDataSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iru) ipChange.ipc$dispatch("7c66093", new Object[]{this, initDataSource});
        }
        kotlin.jvm.internal.q.c(initDataSource, "initDataSource");
        irt<D> d2 = d();
        if (d2 != 0) {
            return new com.taobao.search.sf.a(d2, initDataSource, this.j);
        }
        throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.widget.PageModel<com.taobao.search.sf.datasource.CommonBaseDatasource>");
    }

    @Override // com.taobao.android.meta.logic.b
    public void a(CommonSearchResult result, JSONObject jSONObject, imn imnVar) {
        com.taobao.search.sf.g gVar;
        String str;
        k kVar;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6e40d71", new Object[]{this, result, jSONObject, imnVar});
            return;
        }
        kotlin.jvm.internal.q.c(result, "result");
        if (jSONObject != null && !this.h) {
            if (a(jSONObject)) {
                npb npbVar = new npb();
                npbVar.a(this);
                kVar = npbVar;
            } else if (b(jSONObject) && result.guideSearchNative) {
                nox noxVar = new nox(false);
                noxVar.a(this);
                kVar = noxVar;
            } else {
                k kVar2 = this.f;
                kVar2.a(this);
                kVar2.a(this.k);
                kVar2.a(this.j);
                kVar2.a(this.i);
                kVar = kVar2;
            }
            this.g = kVar;
            this.h = true;
        }
        this.g.a((p<j, com.taobao.search.refactor.e, CommonSearchResult>) result, jSONObject, imnVar);
        if (!r.ac() || !result.mainSearch || result.newSearch || !n() || (gVar = this.q) == null) {
            return;
        }
        boolean isNew = result.isNew();
        ListStyle listStyle = result.getMainInfo().style;
        List<BaseCellBean> cells = result.getCells();
        a.C0571a searchConfig = result.getSearchConfig();
        if (searchConfig != null) {
            Map<String, String> e2 = ((com.taobao.android.meta.data.e) searchConfig).e();
            if (e2 != null && (str = e2.get("listWidth")) != null) {
                i = Integer.parseInt(str);
            }
            gVar.a(isNew, listStyle, cells, i);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.meta.data.MetaSearchConfig<*>");
    }

    @Override // tb.hth, com.taobao.android.meta.logic.a
    public void a(com.taobao.android.meta.structure.page.f<j, com.taobao.search.refactor.e, ? extends hte, CommonSearchResult> widget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efa846de", new Object[]{this, widget});
            return;
        }
        kotlin.jvm.internal.q.c(widget, "widget");
        super.a(widget);
        p<j, com.taobao.search.refactor.e, CommonSearchResult> pVar = this.g;
        if (!(pVar instanceof k)) {
            return;
        }
        if (pVar == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.refactor.MSFlow");
        }
        k kVar = (k) pVar;
        hte a2 = ((iru) widget.getModel()).a();
        if (a2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.refactor.MSConfig");
        }
        kVar.a((com.taobao.search.refactor.f) a2);
    }

    @Override // com.taobao.search.sf.datasource.e.b
    public j a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("d66c5a68", new Object[]{this, new Boolean(z)});
        }
        j jVar = new j(z, this.n, new nng(new nul("SRPMain")));
        jVar.a(this);
        return jVar;
    }

    @Override // com.taobao.android.meta.logic.a
    public boolean a(j scopeDataSource, com.taobao.search.refactor.e combo, ListStyle newStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("836f8c28", new Object[]{this, scopeDataSource, combo, newStyle})).booleanValue();
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(combo, "combo");
        kotlin.jvm.internal.q.c(newStyle, "newStyle");
        j jVar = scopeDataSource;
        com.taobao.search.refactor.e eVar = combo;
        if (!this.g.a((p<j, com.taobao.search.refactor.e, CommonSearchResult>) jVar, (j) eVar, newStyle)) {
            return super.a((g) jVar, (j) eVar, newStyle);
        }
        return true;
    }

    public final int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue();
        }
        p<j, com.taobao.search.refactor.e, CommonSearchResult> pVar = this.g;
        if (!(pVar instanceof npb)) {
            return 0;
        }
        if (pVar == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.refactor.ns.NSFlow");
        }
        return ((npb) pVar).b();
    }

    public final noz j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (noz) ipChange.ipc$dispatch("544725bc", new Object[]{this});
        }
        p<j, com.taobao.search.refactor.e, CommonSearchResult> pVar = this.g;
        if (!(pVar instanceof npb)) {
            return null;
        }
        if (pVar == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.refactor.ns.NSFlow");
        }
        return ((npb) pVar).c();
    }

    public final void b(j scopeDataSource, com.taobao.search.refactor.e combo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96a7380a", new Object[]{this, scopeDataSource, combo});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(combo, "combo");
        a(scopeDataSource, combo);
        combo.a(MetaState.LOADING_MORE);
    }

    public final int a(noz combo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f69ea952", new Object[]{this, combo})).intValue();
        }
        kotlin.jvm.internal.q.c(combo, "combo");
        p<j, com.taobao.search.refactor.e, CommonSearchResult> pVar = this.g;
        if (!(pVar instanceof npb)) {
            return -1;
        }
        if (pVar == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.refactor.ns.NSFlow");
        }
        npb npbVar = (npb) pVar;
        CommonSearchResult commonSearchResult = (CommonSearchResult) ((j) b()).getTotalSearchResult();
        if (commonSearchResult == null) {
            kotlin.jvm.internal.q.a();
        }
        kotlin.jvm.internal.q.a((Object) commonSearchResult, "initDataSource.totalSearchResult!!");
        return npbVar.a(commonSearchResult, combo);
    }

    public final String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this});
        }
        p<j, com.taobao.search.refactor.e, CommonSearchResult> pVar = this.g;
        if (!(pVar instanceof npb)) {
            return null;
        }
        if (pVar == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.refactor.ns.NSFlow");
        }
        return ((npb) pVar).d();
    }

    public final void b(int i, int i2, int i3, boolean z) {
        com.taobao.android.meta.structure.childpage.g b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315acffa", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z)});
            return;
        }
        c().e_(i);
        if (i2 > 0) {
            a(i, i2, i3, false);
        }
        if (!z || (b2 = b(i)) == null) {
            return;
        }
        if (b2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.refactor.MSChildPageWidget");
        }
        ((com.taobao.search.refactor.d) b2).d(i3);
    }

    public final void a(String str, JSONObject jSONObject) {
        iru iruVar;
        com.taobao.android.meta.data.b bVar;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        CommonSearchResult it = (CommonSearchResult) ((j) b()).getTotalSearchResult();
        if (it == null) {
            return;
        }
        p<j, com.taobao.search.refactor.e, CommonSearchResult> pVar = this.g;
        if (pVar instanceof nox) {
            if (pVar == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.refactor.ns.IpGuideFlow");
            }
            ((nox) pVar).a(str);
            return;
        }
        kotlin.jvm.internal.q.a((Object) it, "it");
        List<TabBean> tabs = it.getTabs();
        if (tabs == null) {
            return;
        }
        int size = tabs.size();
        for (int i = 0; i < size; i++) {
            if (StringUtils.equals(tabs.get(i).param, str)) {
                c().e_(i);
                com.taobao.android.meta.structure.childpage.g b2 = c().b(i);
                if (b2 == null || (iruVar = (iru) b2.getModel()) == null || (bVar = (com.taobao.android.meta.data.b) iruVar.d()) == null || jSONObject == null) {
                    return;
                }
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        bVar.setParam(key, value.toString());
                        z = true;
                    }
                }
                if (!z) {
                    return;
                }
                bVar.doNewSearch(null, true, null);
                return;
            }
        }
    }

    public void a(Map<String, String> map, com.taobao.search.refactor.e combo, j scopeDataSource, com.taobao.android.meta.data.e<com.taobao.search.refactor.e> eVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ae0daf6", new Object[]{this, map, combo, scopeDataSource, eVar});
            return;
        }
        kotlin.jvm.internal.q.c(map, "map");
        kotlin.jvm.internal.q.c(combo, "combo");
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        this.g.a(map, (Map<String, String>) combo, (com.taobao.search.refactor.e) scopeDataSource, (com.taobao.android.meta.data.e<Map<String, String>>) eVar);
        if (combo.ah()) {
            String aj = combo.aj();
            if (aj == null) {
                aj = "";
            }
            map.put("srp_refresh_ts", aj);
            StringBuilder ai = combo.ai();
            if (ai == null || (str = ai.toString()) == null) {
                str = "";
            }
            map.put("srp_refresh_list", str);
        } else if (!combo.Z()) {
        } else {
            String al = combo.al();
            if (al == null) {
                al = "";
            }
            map.put("srp_refresh_ts", al);
            String ak = combo.ak();
            if (ak == null) {
                ak = "";
            }
            map.put("srp_refresh_list", ak);
        }
    }

    public final void a(Map<String, String> map, com.taobao.search.refactor.e combo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("417b9680", new Object[]{this, map, combo});
            return;
        }
        kotlin.jvm.internal.q.c(map, "map");
        kotlin.jvm.internal.q.c(combo, "combo");
        p<j, com.taobao.search.refactor.e, CommonSearchResult> pVar = this.g;
        if (!(pVar instanceof k)) {
            pVar = null;
        }
        k kVar = (k) pVar;
        if (kVar == null) {
            return;
        }
        kVar.a(map, combo);
    }

    public void a(j scopeDataSource, iuk<?, ?> widget, boolean z, htf htfVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7328ab53", new Object[]{this, scopeDataSource, widget, new Boolean(z), htfVar});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(widget, "widget");
        com.taobao.android.meta.structure.childpage.g d2 = d((g) scopeDataSource);
        if (d2 == null) {
            return;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) scopeDataSource.getTotalSearchResult();
        if (commonSearchResult != null) {
            i = commonSearchResult.sceneStickyHeight;
        }
        d2.a(widget, z, htfVar, i);
    }

    public void h(j scopeDataSource) {
        com.taobao.android.meta.structure.childpage.c cVar;
        FrameLayout b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dae9fad", new Object[]{this, scopeDataSource});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        com.taobao.android.searchbaseframe.util.t.a(m());
        com.taobao.android.meta.structure.childpage.g d2 = d((g) scopeDataSource);
        if (d2 != null && (cVar = (com.taobao.android.meta.structure.childpage.c) d2.J()) != null && (b2 = cVar.b()) != null) {
            b2.addView(m());
        }
        int cI = r.cI();
        if (cI <= 0) {
            return;
        }
        View loadingView = m();
        kotlin.jvm.internal.q.a((Object) loadingView, "loadingView");
        loadingView.setAlpha(0.0f);
        new Handler().postDelayed(new h(), cI);
    }
}
