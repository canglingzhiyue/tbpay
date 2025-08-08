package com.taobao.android.searchbaseframe.xsl.refact;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.datasource.param.SearchParamImpl;
import com.taobao.android.searchbaseframe.xsl.module.XslDatasource;
import com.taobao.android.searchbaseframe.xsl.module.XslModule;
import com.taobao.android.searchbaseframe.xsl.module.XslSearchContext;
import com.taobao.android.searchbaseframe.xsl.module.XslSearchResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.TypeCastException;
import tb.hte;
import tb.htg;
import tb.hth;
import tb.imn;
import tb.iru;
import tb.itk;
import tb.kge;
import tb.rwf;

/* loaded from: classes6.dex */
public final class i extends hth<XslDataSource, htg, XslSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public XslModule d;
    private final j e = new j();
    private boolean f;

    static {
        kge.a(150140841);
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1845922032:
                super.b((i) ((com.taobao.android.meta.data.b) objArr[0]), ((Boolean) objArr[1]).booleanValue());
                return null;
            case -1389075392:
                super.b((i) ((com.taobao.android.meta.data.b) objArr[0]), (com.taobao.android.meta.data.b) ((com.taobao.android.meta.data.a) objArr[1]));
                return null;
            case -1107373491:
                super.b((i) ((com.taobao.android.meta.data.b) objArr[0]), (com.taobao.android.meta.structure.childpage.g) objArr[1]);
                return null;
            case -248756186:
                super.b((i) ((com.taobao.android.meta.data.b) objArr[0]), (htg) objArr[1], (htg) objArr[2], (com.taobao.android.meta.data.e<htg>) objArr[3]);
                return null;
            case 199868663:
                super.a((i) ((com.taobao.android.meta.data.b) objArr[0]), (com.taobao.android.meta.data.b) ((com.taobao.android.meta.data.a) objArr[1]), ((Boolean) objArr[2]).booleanValue(), ((Boolean) objArr[3]).booleanValue(), (com.taobao.android.meta.data.e<com.taobao.android.meta.data.b>) objArr[4]);
                return null;
            case 816241265:
                super.a((i) ((com.taobao.android.meta.data.b) objArr[0]), ((Boolean) objArr[1]).booleanValue());
                return null;
            case 1979675630:
                super.a((i) ((com.taobao.android.meta.data.b) objArr[0]), (com.taobao.android.meta.structure.childpage.g) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.meta.logic.c
    public void a(XslDataSource scopeDataSource, htg combo, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f7b5aa7", new Object[]{this, scopeDataSource, combo, new Integer(i)});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(combo, "combo");
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void b2(XslDataSource scopeDataSource, com.taobao.android.meta.structure.childpage.g childPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70392b0b", new Object[]{this, scopeDataSource, childPage});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(childPage, "childPage");
    }

    @Override // com.taobao.android.meta.logic.a, com.taobao.android.meta.logic.c
    public /* bridge */ /* synthetic */ void a(com.taobao.android.meta.data.b bVar, com.taobao.android.meta.data.a aVar, boolean z, boolean z2, com.taobao.android.meta.data.e eVar) {
        a((XslDataSource) bVar, (htg) aVar, z, z2, (com.taobao.android.meta.data.e<htg>) eVar);
    }

    @Override // tb.hth, com.taobao.android.meta.logic.a
    public /* synthetic */ void a(com.taobao.android.meta.data.b bVar, com.taobao.android.meta.structure.childpage.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75ff73ee", new Object[]{this, bVar, gVar});
        } else {
            c((XslDataSource) bVar, gVar);
        }
    }

    @Override // com.taobao.android.meta.logic.a
    public /* synthetic */ void b(com.taobao.android.meta.data.b bVar, com.taobao.android.meta.data.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad346440", new Object[]{this, bVar, aVar});
        } else {
            a((XslDataSource) bVar, (htg) aVar);
        }
    }

    @Override // tb.hth, com.taobao.android.meta.logic.c
    public /* synthetic */ void b(com.taobao.android.meta.data.b bVar, com.taobao.android.meta.data.a aVar, com.taobao.android.meta.data.a aVar2, com.taobao.android.meta.data.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dc2a5b4", new Object[]{this, bVar, aVar, aVar2, eVar});
        } else {
            a((XslDataSource) bVar, (htg) aVar, (htg) aVar2, (com.taobao.android.meta.data.e<htg>) eVar);
        }
    }

    @Override // tb.hth
    public /* synthetic */ void b(XslDataSource xslDataSource, com.taobao.android.meta.structure.childpage.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdfed24d", new Object[]{this, xslDataSource, gVar});
        } else {
            a(xslDataSource, gVar);
        }
    }

    @Override // tb.hth
    public /* synthetic */ void b(XslDataSource xslDataSource, htg htgVar, htg htgVar2, com.taobao.android.meta.data.e<htg> eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f12c4826", new Object[]{this, xslDataSource, htgVar, htgVar2, eVar});
        } else {
            a(xslDataSource, htgVar, htgVar2, eVar);
        }
    }

    @Override // com.taobao.android.meta.logic.c
    public /* synthetic */ void c(com.taobao.android.meta.data.b bVar, com.taobao.android.meta.structure.childpage.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fe30ac", new Object[]{this, bVar, gVar});
        } else {
            b2((XslDataSource) bVar, gVar);
        }
    }

    public final void a(XslModule xslModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d252ef93", new Object[]{this, xslModule});
            return;
        }
        kotlin.jvm.internal.q.c(xslModule, "<set-?>");
        this.d = xslModule;
    }

    private final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        iru iruVar = (iru) c().getModel();
        kotlin.jvm.internal.q.a((Object) iruVar, "pageWidget.model");
        return iruVar.e().a("XslPageConfig_PreventRequest", false);
    }

    @Override // com.taobao.android.meta.logic.a
    public com.taobao.android.searchbaseframe.context.a f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.searchbaseframe.context.a) ipChange.ipc$dispatch("ada654c5", new Object[]{this}) : new XslSearchContext();
    }

    @Override // tb.hth, com.taobao.android.meta.logic.a
    public void a(com.taobao.android.meta.structure.page.f<XslDataSource, htg, ? extends hte, XslSearchResult> widget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efa846de", new Object[]{this, widget});
            return;
        }
        kotlin.jvm.internal.q.c(widget, "widget");
        b(widget);
        ((XslDataSource) b()).setFlow(this);
        a().add(b());
    }

    @Override // com.taobao.android.meta.logic.b
    public void a(XslSearchResult result, JSONObject jSONObject, imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684c445c", new Object[]{this, result, jSONObject, imnVar});
            return;
        }
        kotlin.jvm.internal.q.c(result, "result");
        this.e.a(result, jSONObject, imnVar);
    }

    public void a(XslDataSource scopeDataSource, com.taobao.android.meta.structure.childpage.g childPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcc0190a", new Object[]{this, scopeDataSource, childPage});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(childPage, "childPage");
        if (h()) {
            c(scopeDataSource);
            XslModule xslModule = this.d;
            if (xslModule == null) {
                kotlin.jvm.internal.q.b("module");
            }
            xslModule.f15030a.a(scopeDataSource.getCurrentTabIndex(), 1);
        } else if (scopeDataSource.isJsParamReady()) {
            super.b((i) scopeDataSource, childPage);
        } else {
            XslModule xslModule2 = this.d;
            if (xslModule2 == null) {
                kotlin.jvm.internal.q.b("module");
            }
            XslModule.e eVar = xslModule2.f15030a;
            if (eVar == null) {
                return;
            }
            eVar.a(scopeDataSource.getCurrentTabIndex());
        }
    }

    public void a(XslDataSource scopeDataSource, htg combo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f7793dc", new Object[]{this, scopeDataSource, combo});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(combo, "combo");
        XslDataSource xslDataSource = scopeDataSource;
        htg htgVar = combo;
        a((i) xslDataSource, (XslDataSource) htgVar, true, (Map<String, String>) null);
        if (h()) {
            XslModule xslModule = this.d;
            if (xslModule == null) {
                kotlin.jvm.internal.q.b("module");
            }
            xslModule.f15030a.a(scopeDataSource.getCurrentTabIndex(), combo.d());
            return;
        }
        super.b((i) xslDataSource, (XslDataSource) htgVar);
    }

    public void a(XslDataSource scopeDataSource, htg htgVar, boolean z, boolean z2, com.taobao.android.meta.data.e<htg> config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("681c78d4", new Object[]{this, scopeDataSource, htgVar, new Boolean(z), new Boolean(z2), config});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(config, "config");
        XslModule xslModule = this.d;
        if (xslModule == null) {
            kotlin.jvm.internal.q.b("module");
        }
        xslModule.b.onDataLoadedMeta(scopeDataSource);
        super.a((i) scopeDataSource, (XslDataSource) htgVar, z, z2, (com.taobao.android.meta.data.e<XslDataSource>) config);
        com.taobao.android.meta.structure.childpage.g b = c().b(scopeDataSource.getIndex());
        if (b == null) {
            return;
        }
        b.b(false);
        Map<String, String> e = config.e();
        if (!StringUtils.equals(e != null ? e.get("searchType") : null, "allSearch")) {
            return;
        }
        b.p();
        a(scopeDataSource);
    }

    @Override // com.taobao.android.meta.logic.a, com.taobao.android.meta.logic.c
    public void a(XslDataSource initDataSource, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28c9d08d", new Object[]{this, initDataSource, new Boolean(z)});
            return;
        }
        kotlin.jvm.internal.q.c(initDataSource, "initDataSource");
        XslModule xslModule = this.d;
        if (xslModule == null) {
            kotlin.jvm.internal.q.b("module");
        }
        xslModule.b.onDataLoadedMeta(initDataSource);
        super.a((i) initDataSource, z);
        this.f = true;
        if (!z) {
            return;
        }
        a(initDataSource);
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.f;
    }

    private final void a(XslDataSource xslDataSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d2fc727", new Object[]{this, xslDataSource});
            return;
        }
        XslSearchResult it = (XslSearchResult) xslDataSource.getTotalSearchResult();
        if (it == null || !kotlin.jvm.internal.q.a(xslDataSource, (XslDataSource) b())) {
            return;
        }
        XslModule xslModule = this.d;
        if (xslModule == null) {
            kotlin.jvm.internal.q.b("module");
        }
        xslModule.a(it);
        kotlin.jvm.internal.q.a((Object) it, "it");
        ((XslDataSource) b()).setCurrentTabIndex(it.getDefaultTabIndex());
    }

    @Override // com.taobao.android.meta.logic.a, com.taobao.android.meta.logic.c
    public void b(XslDataSource scopeDataSource, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48b4c4e", new Object[]{this, scopeDataSource, new Boolean(z)});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        XslModule xslModule = this.d;
        if (xslModule == null) {
            kotlin.jvm.internal.q.b("module");
        }
        xslModule.b.onDataLoadedMeta(scopeDataSource);
        super.b((i) scopeDataSource, z);
    }

    public void c(XslDataSource scopeDataSource, com.taobao.android.meta.structure.childpage.g childPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23b23d0c", new Object[]{this, scopeDataSource, childPage});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(childPage, "childPage");
        super.a((i) scopeDataSource, childPage);
        XslModule xslModule = this.d;
        if (xslModule == null) {
            kotlin.jvm.internal.q.b("module");
        }
        XslModule.c cVar = xslModule.b;
        if (cVar == null) {
            return;
        }
        cVar.onTabChanged(scopeDataSource.getIndex());
    }

    @Override // com.taobao.android.meta.logic.c
    public iru<XslDataSource> a(int i, TabBean tab, XslDataSource initDataSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iru) ipChange.ipc$dispatch("fe56d8f8", new Object[]{this, new Integer(i), tab, initDataSource});
        }
        kotlin.jvm.internal.q.c(tab, "tab");
        kotlin.jvm.internal.q.c(initDataSource, "initDataSource");
        XslModule xslModule = this.d;
        if (xslModule == null) {
            kotlin.jvm.internal.q.b("module");
        }
        XslDatasource q = xslModule.q(i);
        if (q == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.xsl.refact.XslDataSource");
        }
        XslDataSource xslDataSource = (XslDataSource) q;
        xslDataSource.setMetaMode();
        xslDataSource.setController(this);
        return new iru<>(d(), xslDataSource);
    }

    private final void a(htg htgVar, htg htgVar2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e383e73", new Object[]{this, htgVar, htgVar2, map});
            return;
        }
        String str = map.get("from");
        if (str == null) {
            return;
        }
        int c = rwf.c(0, Integer.parseInt(str));
        if (c < 0) {
            htgVar.b(htgVar2);
            return;
        }
        String str2 = map.get(com.taobao.android.weex_framework.util.a.ATOM_length);
        if (str2 == null) {
            return;
        }
        int parseInt = Integer.parseInt(str2);
        String str3 = map.get("reserveCell");
        if (str3 == null) {
            return;
        }
        boolean parseBoolean = Boolean.parseBoolean(str3);
        String str4 = map.get("addFromPosition");
        if (str4 == null) {
            return;
        }
        boolean parseBoolean2 = Boolean.parseBoolean(str4);
        if (parseInt > 0) {
            a(htgVar, htgVar2, a(htgVar, parseBoolean, rwf.d((parseInt + c) - 1, htgVar.l().size()), c), c, parseBoolean2);
        } else {
            a(htgVar, htgVar2, a(htgVar, parseBoolean, htgVar.w().size() - 1, c), c, parseBoolean2);
        }
    }

    private final Map<Long, BaseCellBean> a(htg htgVar, boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b60d0aec", new Object[]{this, htgVar, new Boolean(z), new Integer(i), new Integer(i2)});
        }
        HashMap hashMap = z ? new HashMap() : null;
        if (i >= i2) {
            while (true) {
                if (i < htgVar.w().size()) {
                    BaseCellBean remove = htgVar.w().remove(i);
                    if (z && remove.id > 0 && hashMap != null) {
                        hashMap.put(Long.valueOf(remove.id), remove);
                    }
                }
                if (i == i2) {
                    break;
                }
                i--;
            }
        }
        return hashMap;
    }

    private final void a(htg htgVar, htg htgVar2, Map<Long, ? extends BaseCellBean> map, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91310de4", new Object[]{this, htgVar, htgVar2, map, new Integer(i), new Boolean(z)});
        } else if (map == null || map.isEmpty()) {
            try {
                htgVar.a(rwf.d(i, htgVar.w().size()), htgVar2.w());
            } catch (Exception e) {
                com.taobao.android.searchbaseframe.util.k.a("XslSearchResult.addNewCells", "from " + i + " size " + htgVar.w().size(), e);
            }
        } else {
            int size = htgVar2.w().size();
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < size; i2++) {
                BaseCellBean baseCellBean = htgVar2.w().get(i2);
                if (baseCellBean != null) {
                    BaseCellBean baseCellBean2 = map.get(Long.valueOf(baseCellBean.id));
                    if (baseCellBean2 != null) {
                        baseCellBean2.copyCellData(baseCellBean);
                    }
                    if (!z) {
                        htgVar.b(baseCellBean);
                    } else {
                        arrayList.add(baseCellBean);
                    }
                }
            }
            if (!z) {
                return;
            }
            htgVar.a(rwf.d(i, htgVar.w().size()), arrayList);
        }
    }

    public void a(XslDataSource scopeDataSource, htg src, htg incoming, com.taobao.android.meta.data.e<htg> config) {
        String str;
        XslSearchResult xslSearchResult;
        SearchParamImpl q;
        XslSearchResult lr;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca93d909", new Object[]{this, scopeDataSource, src, incoming, config});
            return;
        }
        kotlin.jvm.internal.q.c(scopeDataSource, "scopeDataSource");
        kotlin.jvm.internal.q.c(src, "src");
        kotlin.jvm.internal.q.c(incoming, "incoming");
        kotlin.jvm.internal.q.c(config, "config");
        Map<String, String> e = config.e();
        if (e != null && (str = e.get("searchType")) != null) {
            int hashCode = str.hashCode();
            if (hashCode != -954593327) {
                if (hashCode == -445821271) {
                    if (str.equals("allSearch")) {
                        XslSearchResult xslSearchResult2 = (XslSearchResult) scopeDataSource.getTotalSearchResult();
                        if (xslSearchResult2 == null || (xslSearchResult = (XslSearchResult) scopeDataSource.getLastSearchResult()) == null) {
                            return;
                        }
                        scopeDataSource.setTotalResult(xslSearchResult);
                        htg combo = xslSearchResult.getCombo(0);
                        if (combo == null || (q = combo.q()) == null) {
                            return;
                        }
                        htg combo2 = xslSearchResult2.getCombo(0);
                        q.copy(combo2 != null ? combo2.q() : null);
                        return;
                    }
                } else if (hashCode == 1403336329 && str.equals("partialSearch")) {
                    XslSearchResult tr = (XslSearchResult) scopeDataSource.getTotalSearchResult();
                    if (tr == null || (lr = (XslSearchResult) scopeDataSource.getLastSearchResult()) == null) {
                        return;
                    }
                    kotlin.jvm.internal.q.a((Object) tr, "tr");
                    kotlin.jvm.internal.q.a((Object) lr, "lr");
                    a(tr, lr);
                    tr.setMainInfo(lr.getMainInfo());
                    htg combo3 = tr.getCombo(0);
                    if (combo3 != null) {
                        ResultMainInfoBean mainInfo = lr.getMainInfo();
                        kotlin.jvm.internal.q.a((Object) mainInfo, "lr.mainInfo");
                        combo3.a(mainInfo);
                    }
                    Map<String, String> e2 = config.e();
                    if (e2 == null || (str2 = e2.get("updateConfig")) == null) {
                        return;
                    }
                    Object parseObject = JSON.parseObject(str2, Set.class);
                    if (parseObject == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                    }
                    Set<String> set = (Set) parseObject;
                    a(set, tr, lr);
                    b(set, tr, lr);
                    c(set, tr, lr);
                    a(set, "foldHeader", itk.TYPE_FOLD, tr, lr);
                    a(set, "stickyHeader", "sticky", tr, lr);
                    a(set, "listHeader", "list", tr, lr);
                    d(set, tr, lr);
                    b(tr, lr);
                    return;
                }
            } else if (str.equals("updateSearch")) {
                Map<String, String> e3 = config.e();
                if (e3 == null) {
                    kotlin.jvm.internal.q.a();
                }
                a(src, incoming, e3);
                return;
            }
        }
        super.b((i) scopeDataSource, src, incoming, config);
    }

    private final void a(XslSearchResult xslSearchResult, XslSearchResult xslSearchResult2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93707a28", new Object[]{this, xslSearchResult, xslSearchResult2});
            return;
        }
        xslSearchResult.setAtmosphereUrl(xslSearchResult2.getAtmosphereUrl());
        xslSearchResult.setAtmosphereType(xslSearchResult2.getAtmosphereType());
        xslSearchResult.setAtmosphereAnim(xslSearchResult2.isAtmosphereAnim());
        xslSearchResult.setAtmosphereListBgColor(xslSearchResult2.getAtmosphereListBgColor());
    }

    private final void a(Set<String> set, XslSearchResult xslSearchResult, XslSearchResult xslSearchResult2) {
        htg combo;
        htg combo2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c376e2d7", new Object[]{this, set, xslSearchResult, xslSearchResult2});
        } else if (!set.contains("listItems") || (combo = xslSearchResult.getCombo(0)) == null || (combo2 = xslSearchResult2.getCombo(0)) == null) {
        } else {
            combo.x();
            combo.a(combo2.w());
        }
    }

    private final void b(Set<String> set, XslSearchResult xslSearchResult, XslSearchResult xslSearchResult2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c07d4f6", new Object[]{this, set, xslSearchResult, xslSearchResult2});
        } else if (!set.contains("topHeader")) {
        } else {
            xslSearchResult.topHeaders.clear();
            xslSearchResult.topHeaders.addAll(xslSearchResult2.topHeaders);
            xslSearchResult.setHeaderChange(true);
        }
    }

    private final void c(Set<String> set, XslSearchResult xslSearchResult, XslSearchResult xslSearchResult2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7498c715", new Object[]{this, set, xslSearchResult, xslSearchResult2});
        } else if (!set.contains("tab")) {
        } else {
            xslSearchResult.tabHeaders.clear();
            xslSearchResult.tabHeaders.addAll(xslSearchResult2.tabHeaders);
            xslSearchResult.setHeaderChange(true);
        }
    }

    private final void a(Set<String> set, String str, String str2, XslSearchResult xslSearchResult, XslSearchResult xslSearchResult2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a2f8d6b", new Object[]{this, set, str, str2, xslSearchResult, xslSearchResult2});
        } else if (!set.contains(str)) {
        } else {
            xslSearchResult.getHeaders().removeAll(xslSearchResult.getHeadersByType(str2));
            xslSearchResult.addHeaders(xslSearchResult2.getHeadersByType(str2));
            xslSearchResult.setHeaderPartialRefresh(true);
        }
    }

    private final void d(Set<String> set, XslSearchResult xslSearchResult, XslSearchResult xslSearchResult2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d29b934", new Object[]{this, set, xslSearchResult, xslSearchResult2});
        } else if (!set.contains("listFooter")) {
        } else {
            xslSearchResult.getFooters().clear();
            xslSearchResult.getFooters().addAll(xslSearchResult2.getFooters());
            xslSearchResult.setFooterChanged(true);
        }
    }

    private final void b(XslSearchResult xslSearchResult, XslSearchResult xslSearchResult2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83336de9", new Object[]{this, xslSearchResult, xslSearchResult2});
            return;
        }
        xslSearchResult.setHasBarrier(xslSearchResult2.hasBarrier() || xslSearchResult.hasBarrier());
        xslSearchResult.setHasSectionClip(xslSearchResult2.hasSectionClip() || xslSearchResult.hasSectionClip());
        if (!xslSearchResult2.hasSections() && !xslSearchResult.hasSections()) {
            z = false;
        }
        xslSearchResult.setHasSections(z);
    }
}
