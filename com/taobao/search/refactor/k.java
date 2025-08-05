package com.taobao.search.refactor;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.structure.childpage.c;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.datasource.param.SearchParamImpl;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.common.util.r;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.datasource.e;
import com.taobao.search.sf.widgets.searchbar.SearchBarTagBean;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import tb.djy;
import tb.imn;
import tb.ipq;
import tb.irt;
import tb.iru;
import tb.ise;
import tb.itd;
import tb.iui;
import tb.kge;
import tb.nns;
import tb.noa;
import tb.nox;
import tb.nsk;
import tb.ntp;
import tb.ntv;

/* loaded from: classes7.dex */
public final class k extends p<j, e, CommonSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public g f19314a;
    private JSONArray b;
    private List<SearchBarTagBean> c;
    private nns d;
    private f e;
    private boolean g;
    private final h f = new h(this);
    private nox i = new nox(true);

    static {
        kge.a(1435657453);
    }

    public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
        if (str.hashCode() == 64625904) {
            super.a((k) ((com.taobao.android.meta.data.b) objArr[0]), (com.taobao.android.meta.data.b) ((com.taobao.android.meta.data.a) objArr[1]), ((Boolean) objArr[2]).booleanValue(), (Map) objArr[3]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.search.refactor.p, com.taobao.android.meta.logic.c
    public /* synthetic */ void a(com.taobao.android.meta.data.b bVar, com.taobao.android.meta.data.a aVar, com.taobao.android.meta.data.a aVar2, com.taobao.android.meta.data.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ed9e33", new Object[]{this, bVar, aVar, aVar2, eVar});
        } else {
            b((j) bVar, (e) aVar, (e) aVar2, (com.taobao.android.meta.data.e<e>) eVar);
        }
    }

    @Override // com.taobao.search.refactor.p, com.taobao.android.meta.logic.c
    public /* bridge */ /* synthetic */ void a(com.taobao.android.meta.data.b bVar, com.taobao.android.meta.data.a aVar, boolean z, Map map) {
        a((j) bVar, (e) aVar, z, (Map<String, String>) map);
    }

    @Override // com.taobao.search.refactor.p, com.taobao.android.meta.logic.c
    public /* bridge */ /* synthetic */ void a(com.taobao.android.meta.data.b bVar, com.taobao.android.meta.data.a aVar, boolean z, boolean z2, com.taobao.android.meta.data.e eVar) {
        a((j) bVar, (e) aVar, z, z2, (com.taobao.android.meta.data.e<e>) eVar);
    }

    @Override // com.taobao.search.refactor.p, com.taobao.android.meta.logic.c
    public /* synthetic */ void a(com.taobao.android.meta.data.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30a6da71", new Object[]{this, bVar, new Boolean(z)});
        } else {
            b((j) bVar, z);
        }
    }

    @Override // com.taobao.search.refactor.p
    public /* bridge */ /* synthetic */ void a(Map map, e eVar, j jVar, com.taobao.android.meta.data.e<e> eVar2) {
        a2((Map<String, String>) map, eVar, jVar, eVar2);
    }

    @Override // com.taobao.search.refactor.p, com.taobao.android.meta.logic.c
    public /* synthetic */ void b(com.taobao.android.meta.data.b bVar, com.taobao.android.meta.data.a aVar, com.taobao.android.meta.data.a aVar2, com.taobao.android.meta.data.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc2a5b4", new Object[]{this, bVar, aVar, aVar2, eVar});
        } else {
            a((j) bVar, (e) aVar, (e) aVar2, (com.taobao.android.meta.data.e<e>) eVar);
        }
    }

    @Override // com.taobao.search.refactor.p, com.taobao.android.meta.logic.c
    public /* synthetic */ void b(com.taobao.android.meta.data.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f97710", new Object[]{this, bVar, new Boolean(z)});
        } else {
            a((j) bVar, z);
        }
    }

    public final JSONArray a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("dc1f20d6", new Object[]{this}) : this.b;
    }

    public final void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
        } else {
            this.b = jSONArray;
        }
    }

    public final void a(List<SearchBarTagBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.c = list;
        }
    }

    public final void a(nns nnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f68d6345", new Object[]{this, nnsVar});
        } else {
            this.d = nnsVar;
        }
    }

    public final void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dbf8fea", new Object[]{this, fVar});
        } else {
            this.e = fVar;
        }
    }

    public final void a(g controller) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dc00449", new Object[]{this, controller});
            return;
        }
        kotlin.jvm.internal.q.c(controller, "controller");
        this.f19314a = controller;
        this.i.a(controller);
    }

    private final void a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dc16166", new Object[]{this, jVar});
            return;
        }
        g gVar = this.f19314a;
        if (gVar == null) {
            kotlin.jvm.internal.q.b("controller");
        }
        f fVar = new f(gVar.l());
        fVar.b(true);
        fVar.a(a.INSTANCE);
        fVar.b(b.INSTANCE);
        fVar.c(true);
        fVar.J().a((com.taobao.android.meta.data.d<Boolean>) true);
        fVar.c(true);
        g gVar2 = this.f19314a;
        if (gVar2 == null) {
            kotlin.jvm.internal.q.b("controller");
        }
        fVar.n(((f) gVar2.e().a()).ai());
        fVar.f(fVar.ai());
        g gVar3 = this.f19314a;
        if (gVar3 == null) {
            kotlin.jvm.internal.q.b("controller");
        }
        gVar3.e().a(jVar, fVar);
        g gVar4 = this.f19314a;
        if (gVar4 == null) {
            kotlin.jvm.internal.q.b("controller");
        }
        gVar4.c().f_(jVar.getIndex());
    }

    /* loaded from: classes7.dex */
    public static final class a<PARAMS, RESULT> implements ise<ipq, itd<?, ?>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // tb.ise
        public final com.taobao.search.musie.k a(ipq ipqVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.search.musie.k) ipChange.ipc$dispatch("fa5e3d70", new Object[]{this, ipqVar}) : new com.taobao.search.musie.k(ipqVar.c, ipqVar.e, ipqVar.d, ipqVar.b, ipqVar.f, ipqVar.f29218a);
        }
    }

    /* loaded from: classes7.dex */
    public static final class b<PARAMS, RESULT> implements ise<ipq, itd<?, ?>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // tb.ise
        public final com.taobao.search.sf.newsearch.widgets.d a(ipq ipqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.search.sf.newsearch.widgets.d) ipChange.ipc$dispatch("ca29f0c2", new Object[]{this, ipqVar});
            }
            Activity activity = ipqVar.c;
            iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> iruVar = ipqVar.e;
            if (iruVar == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.widget.WidgetModelAdapter<com.taobao.search.refactor.MSDataSource>");
            }
            return new com.taobao.search.sf.newsearch.widgets.d(activity, iruVar, ipqVar.d, ipqVar.b, ipqVar.f, ipqVar.f29218a);
        }
    }

    public void a(j scopeDataSource, boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a6b7e2e", new Object[]{this, scopeDataSource, new Boolean(z)});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        CommonSearchResult commonSearchResult = (CommonSearchResult) scopeDataSource.getTotalSearchResult();
        if (commonSearchResult != null && commonSearchResult.subTabNewSearch) {
            this.i.a(scopeDataSource, z);
            a(scopeDataSource);
            return;
        }
        if (z) {
            b(scopeDataSource);
            scopeDataSource.a(scopeDataSource.getUIListStyle());
        }
        if (z) {
            CommonSearchResult commonSearchResult2 = (CommonSearchResult) scopeDataSource.getTotalSearchResult();
            ResultMainInfoBean resultMainInfoBean = null;
            e combo = commonSearchResult2 != null ? commonSearchResult2.getCombo(0) : null;
            if ((combo != null ? combo.y() : null) == null) {
                if (combo != null) {
                    resultMainInfoBean = combo.a();
                }
                if (resultMainInfoBean == null) {
                    kotlin.jvm.internal.q.a();
                }
                i = resultMainInfoBean.totalResult;
            }
        }
        g gVar = this.f19314a;
        if (gVar == null) {
            kotlin.jvm.internal.q.b("controller");
        }
        gVar.c(i);
    }

    private final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            g gVar = this.f19314a;
            if (gVar == null) {
                kotlin.jvm.internal.q.b("controller");
            }
            CommonSearchContext g = gVar.g();
            if (!TextUtils.isEmpty(g.getKeyword())) {
                return;
            }
            g.setParam("q", str);
        }
    }

    private final void b(j jVar) {
        Map<String, String> it;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e49a2127", new Object[]{this, jVar});
            return;
        }
        MSearchResult i = jVar.i();
        if (i == null || (it = i.updateParams) == null) {
            return;
        }
        kotlin.jvm.internal.q.a((Object) it, "it");
        if (!(!it.isEmpty())) {
            return;
        }
        a(it.get("q"));
        jVar.setParams(it);
    }

    public void a(j scopeDataSource, e src, e incoming, com.taobao.android.meta.data.e<e> config) {
        String str;
        CommonSearchResult lr;
        SearchParamImpl q;
        CommonSearchResult commonSearchResult;
        ResultMainInfoBean mainInfo;
        ListStyle listStyle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc0cf0e4", new Object[]{this, scopeDataSource, src, incoming, config});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(src, "src");
        kotlin.jvm.internal.q.c(incoming, "incoming");
        kotlin.jvm.internal.q.c(config, "config");
        CommonSearchResult commonSearchResult2 = (CommonSearchResult) scopeDataSource.getTotalSearchResult();
        if (commonSearchResult2 != null && commonSearchResult2.subTabNewSearch) {
            this.i.b(scopeDataSource, src, incoming, config);
            return;
        }
        Map<String, String> e = config.e();
        SearchParamImpl searchParamImpl = null;
        if (TextUtils.equals(e != null ? e.get("searchType") : null, "auction") && (commonSearchResult = (CommonSearchResult) scopeDataSource.getTotalSearchResult()) != null && (mainInfo = commonSearchResult.getMainInfo()) != null && (listStyle = mainInfo.style) != null) {
            incoming.a().style = listStyle;
        }
        CommonSearchResult commonSearchResult3 = (CommonSearchResult) scopeDataSource.getTotalSearchResult();
        if (commonSearchResult3 != null) {
            commonSearchResult3.setMainInfo(incoming.a());
        }
        Map<String, String> e2 = config.e();
        if (e2 != null && (str = e2.get("searchType")) != null) {
            if (str.hashCode() == 96673 && str.equals("all")) {
                CommonSearchResult commonSearchResult4 = (CommonSearchResult) scopeDataSource.getTotalSearchResult();
                if (commonSearchResult4 != null && (lr = (CommonSearchResult) scopeDataSource.getLastSearchResult()) != null) {
                    scopeDataSource.setTotalResult(lr);
                    e combo = lr.getCombo(0);
                    if (combo != null && (q = combo.q()) != null) {
                        e combo2 = commonSearchResult4.getCombo(0);
                        if (combo2 != null) {
                            searchParamImpl = combo2.q();
                        }
                        q.copy(searchParamImpl);
                    }
                    if (scopeDataSource.getUserListStyle() != null) {
                        kotlin.jvm.internal.q.a((Object) lr, "lr");
                        lr.getMainInfo().style = src.n();
                        incoming.a(src.n());
                    }
                    src.a(incoming.a());
                }
            } else {
                src.b(incoming);
            }
        }
        src.d(0);
    }

    public void b(j scopeDataSource, e src, e incoming, com.taobao.android.meta.data.e<e> config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f19ed25", new Object[]{this, scopeDataSource, src, incoming, config});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(src, "src");
        kotlin.jvm.internal.q.c(incoming, "incoming");
        kotlin.jvm.internal.q.c(config, "config");
        CommonSearchResult commonSearchResult = (CommonSearchResult) scopeDataSource.getTotalSearchResult();
        if (commonSearchResult != null && commonSearchResult.subTabNewSearch) {
            this.i.a(scopeDataSource, src, incoming, config);
            return;
        }
        src.d(src.w().size());
        src.a(incoming);
        src.E();
    }

    public void b(j initDataSource, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeaab68d", new Object[]{this, initDataSource, new Boolean(z)});
            return;
        }
        kotlin.jvm.internal.q.c(initDataSource, "initDataSource");
        CommonSearchResult commonSearchResult = (CommonSearchResult) initDataSource.getTotalSearchResult();
        if (commonSearchResult != null && commonSearchResult.subTabNewSearch) {
            this.i.b(initDataSource, z);
            a(initDataSource);
        } else if (!z) {
        } else {
            b(initDataSource);
            c(initDataSource);
            d(initDataSource);
            initDataSource.a(initDataSource.getUIListStyle());
        }
    }

    private final void c(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b72e0e8", new Object[]{this, jVar});
            return;
        }
        jVar.u();
        CommonSearchResult commonSearchResult = (CommonSearchResult) jVar.getTotalSearchResult();
        if (commonSearchResult == null) {
            return;
        }
        kotlin.jvm.internal.q.a((Object) commonSearchResult, "initDataSource.totalSearchResult ?: return");
        if (TextUtils.isEmpty(commonSearchResult.poplayerUrl)) {
            return;
        }
        g gVar = this.f19314a;
        if (gVar == null) {
            kotlin.jvm.internal.q.b("controller");
        }
        Activity activity = gVar.c().getActivity();
        g gVar2 = this.f19314a;
        if (gVar2 == null) {
            kotlin.jvm.internal.q.b("controller");
        }
        ntv.a(activity, gVar2.g(), commonSearchResult.poplayerUrl);
    }

    private final void d(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b24ba0a9", new Object[]{this, jVar});
            return;
        }
        CommonSearchResult it = (CommonSearchResult) jVar.getTotalSearchResult();
        if (it == null || !jVar.J()) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isJiaGou", "true");
        hashMap.put("query", jVar.getKeyword());
        kotlin.jvm.internal.q.a((Object) it, "it");
        hashMap.put(djy.SERIALIZE_EXP_BUCKET_ID, it.getMainInfo().abtest);
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        kotlin.jvm.internal.q.a((Object) uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().updatePageProperties(this, hashMap);
    }

    public void a(j scopeDataSource, e eVar, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c3343a", new Object[]{this, scopeDataSource, eVar, new Boolean(z), map});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        CommonSearchResult commonSearchResult = (CommonSearchResult) scopeDataSource.getTotalSearchResult();
        if (commonSearchResult != null && commonSearchResult.subTabNewSearch) {
            this.i.a(scopeDataSource, eVar, z, map);
        } else {
            super.a((k) scopeDataSource, (j) eVar, z, map);
        }
    }

    public void a(j scopeDataSource, e eVar, boolean z, boolean z2, com.taobao.android.meta.data.e<e> config) {
        Map<String, String> e;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9b59c1", new Object[]{this, scopeDataSource, eVar, new Boolean(z), new Boolean(z2), config});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(config, "config");
        CommonSearchResult commonSearchResult = (CommonSearchResult) scopeDataSource.getTotalSearchResult();
        if (commonSearchResult != null && commonSearchResult.subTabNewSearch) {
            this.i.a(scopeDataSource, eVar, z, z2, config);
            return;
        }
        if (z2 && !z) {
            b(scopeDataSource);
        }
        if (!z2) {
            return;
        }
        if (z) {
            g gVar = this.f19314a;
            if (gVar == null) {
                kotlin.jvm.internal.q.b("controller");
            }
            com.taobao.android.meta.structure.childpage.g b2 = gVar.c().b(scopeDataSource.getIndex());
            if (b2 != null) {
                b2.b(false);
            }
            com.taobao.search.common.util.a.a().a(scopeDataSource.getTab(), scopeDataSource.getKeyword(), scopeDataSource.getCurrentPage(), false);
        } else if (((CommonSearchResult) scopeDataSource.getLastSearchResult()) == null || (e = config.e()) == null || (str = e.get("searchType")) == null) {
        } else {
            int hashCode = str.hashCode();
            if (hashCode != -661856701) {
                if (hashCode == 96673 && str.equals("all")) {
                    g gVar2 = this.f19314a;
                    if (gVar2 == null) {
                        kotlin.jvm.internal.q.b("controller");
                    }
                    com.taobao.android.meta.structure.childpage.g b3 = gVar2.c().b(scopeDataSource.getIndex());
                    if (b3 != null) {
                        iru iruVar = (iru) b3.getModel();
                        kotlin.jvm.internal.q.a((Object) iruVar, "it.model");
                        if (iruVar.g()) {
                            g gVar3 = this.f19314a;
                            if (gVar3 == null) {
                                kotlin.jvm.internal.q.b("controller");
                            }
                            ((com.taobao.android.meta.structure.page.b) gVar3.c().J()).d().unfold();
                        }
                        ((c) b3.J()).bJ_().unfold();
                        b3.b(true);
                        b3.p();
                    }
                    com.taobao.search.common.util.a.a().a(scopeDataSource.getTab(), scopeDataSource.getKeyword(), scopeDataSource.getCurrentPage(), true);
                    return;
                }
            } else if (str.equals("auction")) {
                g gVar4 = this.f19314a;
                if (gVar4 == null) {
                    kotlin.jvm.internal.q.b("controller");
                }
                com.taobao.android.meta.structure.childpage.g b4 = gVar4.c().b(scopeDataSource.getIndex());
                if (b4 != null) {
                    b4.b(true);
                    b4.p();
                }
                com.taobao.search.common.util.a.a().a(scopeDataSource.getTab(), scopeDataSource.getKeyword(), scopeDataSource.getCurrentPage(), true);
                return;
            }
            g gVar5 = this.f19314a;
            if (gVar5 == null) {
                kotlin.jvm.internal.q.b("controller");
            }
            com.taobao.android.meta.structure.childpage.g b5 = gVar5.c().b(scopeDataSource.getIndex());
            if (b5 == null) {
                return;
            }
            b5.b(false);
        }
    }

    @Override // com.taobao.search.refactor.p
    public void a(j scopeDataSource, com.taobao.android.meta.structure.childpage.g childPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a4d14eb", new Object[]{this, scopeDataSource, childPage});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(childPage, "childPage");
        g gVar = this.f19314a;
        if (gVar == null) {
            kotlin.jvm.internal.q.b("controller");
        }
        ((com.taobao.android.meta.structure.page.b) gVar.c().J()).d().unfold();
        g gVar2 = this.f19314a;
        if (gVar2 == null) {
            kotlin.jvm.internal.q.b("controller");
        }
        iui c = gVar2.c();
        if (c == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.refactor.MSPageWidget");
        }
        ((m) c).a(scopeDataSource);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
        if (android.text.TextUtils.equals(r6, r5.param) == false) goto L23;
     */
    @Override // com.taobao.search.refactor.p, com.taobao.android.meta.logic.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(int r5, com.taobao.search.refactor.j r6) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.search.refactor.k.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L24
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r4
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r5)
            r1[r3] = r2
            r5 = 2
            r1[r5] = r6
            java.lang.String r5 = "d6982d5d"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L24:
            java.lang.String r0 = "initDataSource"
            kotlin.jvm.internal.q.c(r6, r0)
            boolean r0 = r4.g
            if (r0 == 0) goto L2e
            return r2
        L2e:
            com.taobao.search.refactor.MSearchResult r0 = r6.i()
            if (r0 == 0) goto L63
            java.util.List r0 = r0.getTabs()
            if (r0 == 0) goto L63
            java.lang.Object r5 = r0.get(r5)
            com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean r5 = (com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean) r5
            java.lang.String r6 = r6.getTab()
            boolean r1 = r5.isSelected
            if (r1 == 0) goto L63
            int r0 = r0.size()
            if (r0 <= r3) goto L60
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L60
            java.lang.String r5 = r5.param
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.equals(r6, r5)
            if (r5 == 0) goto L63
        L60:
            r4.g = r3
            return r3
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.refactor.k.a(int, com.taobao.search.refactor.j):boolean");
    }

    @Override // com.taobao.search.refactor.p
    public void a(j scopeDataSource, e combo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48e7c009", new Object[]{this, scopeDataSource, combo});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(combo, "combo");
        scopeDataSource.doLoadMore(combo, null);
    }

    @Override // com.taobao.android.meta.logic.c
    public iru<j> a(int i, TabBean tab, j initDataSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iru) ipChange.ipc$dispatch("787fc5af", new Object[]{this, new Integer(i), tab, initDataSource});
        }
        kotlin.jvm.internal.q.c(tab, "tab");
        kotlin.jvm.internal.q.c(initDataSource, "initDataSource");
        g gVar = this.f19314a;
        if (gVar == null) {
            kotlin.jvm.internal.q.b("controller");
        }
        CommonSearchContext g = gVar.g();
        g gVar2 = this.f19314a;
        if (gVar2 == null) {
            kotlin.jvm.internal.q.b("controller");
        }
        j a2 = com.taobao.search.sf.datasource.e.a(false, g, (e.b) gVar2);
        g gVar3 = this.f19314a;
        if (gVar3 == null) {
            kotlin.jvm.internal.q.b("controller");
        }
        Map<String, String> tabParams = gVar3.g().getTabParams(tab.param);
        if (tabParams != null) {
            for (Map.Entry<String, String> entry : tabParams.entrySet()) {
                a2.setParam(entry.getKey(), entry.getValue());
            }
        }
        a2.setParam(noa.VALUE_BIZ_TYPE_NEW_SEARCH, "false");
        a2.setParam("guideSearch", "false");
        List<SearchBarTagBean> list = this.c;
        if (list != null && !list.isEmpty()) {
            ntp ntpVar = new ntp();
            for (SearchBarTagBean searchBarTagBean : list) {
                Map<String, String> params = searchBarTagBean.getParams();
                if (params != null) {
                    ntpVar.putAll(params);
                }
            }
            a2.setParams(ntpVar);
        }
        a2.setParam("tab", tab.param);
        a2.setParam(noa.KEY_SEARCH_ELDER_HOME_OPEN, String.valueOf(com.taobao.search.mmd.util.j.INSTANCE.b()));
        a2.setParam(noa.KEY_GRAY_HAIR, String.valueOf(com.taobao.search.mmd.util.j.INSTANCE.b()));
        a2.a(initDataSource.Q(), false);
        g gVar4 = this.f19314a;
        if (gVar4 == null) {
            kotlin.jvm.internal.q.b("controller");
        }
        irt<D> d = gVar4.d();
        if (d == 0) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.widget.PageModel<com.taobao.search.sf.datasource.CommonBaseDatasource>");
        }
        return new com.taobao.search.sf.a(d, a2, this.d);
    }

    @Override // com.taobao.search.refactor.p, com.taobao.android.meta.logic.b
    public void a(CommonSearchResult result, JSONObject jSONObject, imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6e40d71", new Object[]{this, result, jSONObject, imnVar});
            return;
        }
        kotlin.jvm.internal.q.c(result, "result");
        if (!result.subTabNewSearch) {
            if (jSONObject == null) {
                kotlin.jvm.internal.q.a();
            }
            if (TextUtils.isEmpty(jSONObject.getString(nsk.KEY_TAB_PAGE_URL)) || !r.cv()) {
                this.f.a((MSearchResult) result, jSONObject, imnVar);
                return;
            }
        }
        result.subTabNewSearch = true;
        MSearchResult mSearchResult = (MSearchResult) result;
        if (jSONObject == null) {
            kotlin.jvm.internal.q.a();
        }
        i.b(mSearchResult, jSONObject);
        i.a(mSearchResult, jSONObject, true);
        this.i.a(result, jSONObject, imnVar);
        this.f.a(mSearchResult, jSONObject);
        this.f.a(mSearchResult, jSONObject, false);
        this.f.d(mSearchResult, jSONObject);
    }

    @Override // com.taobao.search.refactor.p
    public boolean a(j scopeDataSource, e combo, ListStyle newStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("836f8c28", new Object[]{this, scopeDataSource, combo, newStyle})).booleanValue();
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(combo, "combo");
        kotlin.jvm.internal.q.c(newStyle, "newStyle");
        CommonSearchResult commonSearchResult = (CommonSearchResult) scopeDataSource.getTotalSearchResult();
        if (commonSearchResult != null && commonSearchResult.subTabNewSearch) {
            return this.i.a(scopeDataSource, combo, newStyle);
        }
        scopeDataSource.a(newStyle);
        return false;
    }

    public final void a(Map<String, String> map, e combo) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("417b9680", new Object[]{this, map, combo});
            return;
        }
        kotlin.jvm.internal.q.c(map, "map");
        kotlin.jvm.internal.q.c(combo, "combo");
        if (combo.d() <= 1) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sb5 = new StringBuilder();
        int z = combo.z();
        int size = combo.l().size();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (z < size) {
            BaseCellBean baseCellBean = combo.l().get(z);
            int i6 = size;
            if (TextUtils.equals(baseCellBean.cardType, "item")) {
                if (baseCellBean.isP4p) {
                    sb5.append("p,");
                    sb2.append(baseCellBean.itemId);
                    sb2.append(',');
                    i3++;
                    if (baseCellBean.isDynamicLandP4p) {
                        sb4.append(baseCellBean.itemId);
                        sb4.append(',');
                        i5++;
                    }
                } else {
                    sb5.append("m,");
                    sb.append(baseCellBean.itemId);
                    sb.append(',');
                    i4++;
                }
            } else if (TextUtils.equals(baseCellBean.cardType, "multi_item")) {
                if (baseCellBean.curItemIds != null) {
                    String[] strArr = baseCellBean.curItemIds;
                    if (strArr == null) {
                        kotlin.jvm.internal.q.a();
                    }
                    int length = strArr.length;
                    i2 = i4;
                    int i7 = 0;
                    while (i7 < length) {
                        int i8 = length;
                        String str = strArr[i7];
                        sb5.append("m,");
                        sb.append(str);
                        sb.append(',');
                        i2++;
                        i7++;
                        length = i8;
                    }
                } else {
                    i2 = i4;
                }
                if (baseCellBean.curP4pIds != null) {
                    String[] strArr2 = baseCellBean.curP4pIds;
                    if (strArr2 == null) {
                        kotlin.jvm.internal.q.a();
                    }
                    for (String str2 : strArr2) {
                        sb5.append("p,");
                        sb2.append(str2);
                        sb2.append(',');
                        i3++;
                    }
                }
                i4 = i2;
            } else if (!TextUtils.isEmpty(baseCellBean.cardType) && !TextUtils.isEmpty(baseCellBean.bizItemId)) {
                sb3.append(baseCellBean.cardType);
                sb3.append(":");
                sb3.append(baseCellBean.bizItemId);
                sb3.append(",");
            }
            z++;
            size = i6;
        }
        combo.e(i3);
        combo.f(i4);
        combo.g(i5);
        if (sb.length() > 0) {
            i = 1;
            sb.deleteCharAt(sb.length() - 1);
        } else {
            i = 1;
        }
        if (sb2.length() > 0) {
            sb2.deleteCharAt(sb2.length() - i);
        }
        if (sb4.length() > 0) {
            sb4.deleteCharAt(sb4.length() - i);
        }
        if (sb5.length() > 0) {
            sb5.deleteCharAt(sb5.length() - i);
        }
        StringBuilder sb6 = sb3;
        if (sb6.length() > 0) {
            sb3.deleteCharAt(sb3.length() - i);
        }
        map.put(noa.KEY_ITEM_S, String.valueOf(combo.A() + i4));
        map.put(noa.KEY_P4P_S, String.valueOf(combo.B() + i3));
        map.put(noa.KEY_DYNAMIC_P4P_S, String.valueOf(combo.C() + i5));
        String sb7 = sb.toString();
        kotlin.jvm.internal.q.a((Object) sb7, "natureIdBuilder.toString()");
        map.put("itemIds", sb7);
        String sb8 = sb2.toString();
        kotlin.jvm.internal.q.a((Object) sb8, "adIdBuilder.toString()");
        map.put(noa.KEY_P4P_IDS, sb8);
        String sb9 = sb4.toString();
        kotlin.jvm.internal.q.a((Object) sb9, "dynamicP4pIdBuilder.toString()");
        map.put(noa.KEY_DYNAMIC_P4P_IDS, sb9);
        String sb10 = sb5.toString();
        kotlin.jvm.internal.q.a((Object) sb10, "typeBuilder.toString()");
        map.put(noa.KEY_EXPOSE_TYPES, sb10);
        if (!(sb6.length() > 0)) {
            return;
        }
        String sb11 = sb3.toString();
        kotlin.jvm.internal.q.a((Object) sb11, "contentIdBuilder.toString()");
        map.put(noa.KEY_CONTENT_IDS, sb11);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void a2(Map<String, String> map, e combo, j scopeDataSource, com.taobao.android.meta.data.e<e> eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ae0daf6", new Object[]{this, map, combo, scopeDataSource, eVar});
            return;
        }
        kotlin.jvm.internal.q.c(map, "map");
        kotlin.jvm.internal.q.c(combo, "combo");
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        if (!scopeDataSource.g()) {
            return;
        }
        this.i.a2(map, combo, scopeDataSource, eVar);
    }
}
