package com.taobao.search.refactor;

import android.text.TextUtils;
import anetwork.channel.monitor.NetworkQualityMonitor;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.LocalDataManager;
import com.taobao.android.searchbaseframe.datasource.a;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.param.SearchParamImpl;
import com.taobao.android.searchbaseframe.datasource.result.SearchResult;
import com.taobao.search.common.util.r;
import com.taobao.search.common.util.u;
import com.taobao.search.mmd.rebuild.c;
import com.taobao.search.musie.x;
import com.taobao.search.sf.BaseResultActivity;
import com.taobao.search.sf.datasource.CommonSearchResult;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.ai;
import tb.htg;
import tb.imn;
import tb.ioy;
import tb.jvm;
import tb.kge;
import tb.noa;
import tb.noo;
import tb.nsp;
import tb.rwf;

/* loaded from: classes7.dex */
public class j extends nsp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int d;
    private boolean e;
    private c f;
    private boolean g;
    private g h;
    private final boolean i;
    private String j;
    private HashMap<String, com.taobao.search.sf.widgets.preposefilter.a> k;
    private boolean l;
    private boolean m;

    static {
        kge.a(275428580);
    }

    public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -1646562836:
                return new Integer(super.getCurrentPage());
            case -1555985156:
                return super.getParamsSnapShot();
            case -1470226968:
                return super.getParamValueSet((String) objArr[0]);
            case -1086827897:
                super.addParam((String) objArr[0], (String) objArr[1]);
                return null;
            case -596986778:
                super.setParam((String) objArr[0], (String) objArr[1]);
                return null;
            case -363095019:
                return super.getParamValue((String) objArr[0]);
            case -291807944:
                return new Boolean(super.containParam((String) objArr[0], (String) objArr[1]));
            case -97103493:
                return new Boolean(super.isTaskRunning());
            case 93762283:
                super.d();
                return null;
            case 169370833:
                super.clearParam((String) objArr[0]);
                return null;
            case 500418436:
                super.removeParam((String) objArr[0], (String) objArr[1]);
                return null;
            case 633041432:
                super.appendComboParams((Map) objArr[0], (com.taobao.android.meta.data.a) objArr[1], (com.taobao.android.meta.data.e) objArr[2]);
                return null;
            case 1083699496:
                return new Boolean(super.doNewSearch());
            case 1938556670:
                return new Integer(super.getTotalResultCount());
            case 2117093653:
                return super.getParamStr((String) objArr[0]);
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.search.sf.datasource.c, com.taobao.android.meta.data.b
    public boolean isMetaMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9589cc1d", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static final /* synthetic */ HashSet n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashSet) ipChange.ipc$dispatch("8303e9d2", new Object[0]) : nsp.f31737a;
    }

    @Override // com.taobao.android.meta.data.b
    public /* synthetic */ void appendComboParams(Map map, e eVar, com.taobao.android.meta.data.e<e> eVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25bb7218", new Object[]{this, map, eVar, eVar2});
        } else {
            a(map, eVar, eVar2);
        }
    }

    @Override // tb.nsp, com.taobao.search.sf.datasource.c
    public /* synthetic */ CommonSearchResult c(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CommonSearchResult) ipChange.ipc$dispatch("7e3d3f09", new Object[]{this, new Boolean(z)}) : b(z);
    }

    @Override // tb.nsp, com.taobao.search.sf.datasource.c, com.taobao.android.searchbaseframe.datasource.a
    /* renamed from: createResult */
    public /* synthetic */ SearchResult mo1015createResult(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SearchResult) ipChange.ipc$dispatch("23b3014a", new Object[]{this, new Boolean(z)}) : b(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(boolean z, imn core, ioy ioyVar) {
        super(core, ioyVar);
        kotlin.jvm.internal.q.c(core, "core");
        this.i = z;
        this.l = true;
        this.k = new HashMap<>();
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.d;
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.e;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.g;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(c cVar, boolean z, imn core, ioy ioyVar) {
        this(z, core, ioyVar);
        kotlin.jvm.internal.q.c(core, "core");
        this.e = true;
        this.f = cVar;
    }

    public final void U() {
        com.taobao.android.meta.structure.childpage.g d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c3525c", new Object[]{this});
            return;
        }
        MSearchResult i = i();
        e combo = i != null ? i.getCombo(0) : null;
        if (combo != null) {
            combo.j(true);
        }
        if (combo != null) {
            combo.i(true);
        }
        q();
        g gVar = this.h;
        int M = (gVar == null || (d = gVar.d((g) this)) == null) ? 0 : d.M();
        HashMap hashMap = new HashMap();
        hashMap.put("listWidth", String.valueOf(M));
        hashMap.put("searchType", "auction");
        doNewSearch(combo, false, hashMap);
    }

    @Override // tb.nsp, com.taobao.search.sf.datasource.c
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.e) {
        } else {
            super.d();
        }
    }

    public final g h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("11200f68", new Object[]{this}) : this.h;
    }

    public final void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dc00449", new Object[]{this, gVar});
            return;
        }
        this.h = gVar;
        Object obj = this.mAdapter;
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.refactor.MSRequestAdapter");
        }
        g gVar2 = gVar;
        ((n) obj).a(gVar2);
        if (this.i) {
            if (gVar == null) {
                kotlin.jvm.internal.q.a();
            }
            gVar.a((g) this);
        }
        if (gVar == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.meta.logic.BaseMetaPageController<com.taobao.android.meta.data.MetaDataSource<com.taobao.search.refactor.MSCombo, com.taobao.android.meta.data.MetaResult<com.taobao.search.refactor.MSCombo>>, com.taobao.search.refactor.MSCombo, com.taobao.android.meta.data.MetaResult<com.taobao.search.refactor.MSCombo>>");
        }
        setController(gVar2);
    }

    @Override // tb.nsp, com.taobao.search.sf.datasource.c, com.taobao.android.meta.data.b
    public com.taobao.android.meta.data.f<e, CommonSearchResult> createRequestAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.meta.data.f) ipChange.ipc$dispatch("94cf75ea", new Object[]{this});
        }
        imn core = getCore();
        kotlin.jvm.internal.q.a((Object) core, "core");
        return new n(core, getSrpLifeCycleWatcher());
    }

    public MSearchResult b(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return (MSearchResult) ipChange.ipc$dispatch("309a3ec1", new Object[]{this, new Boolean(z)});
        }
        imn core = getCore();
        kotlin.jvm.internal.q.a((Object) core, "core");
        MSearchResult mSearchResult = new MSearchResult(core, z);
        mSearchResult.newSearchNative = true;
        mSearchResult.guideSearchNative = this.c;
        mSearchResult.subTabNewSearch = this.g;
        String c = c("m");
        String c2 = c("channelSrp");
        if (TextUtils.isEmpty(c) && TextUtils.isEmpty(c2)) {
            z2 = true;
        }
        mSearchResult.mainSearch = z2;
        return mSearchResult;
    }

    public final MSearchResult i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MSearchResult) ipChange.ipc$dispatch("83fd37fc", new Object[]{this});
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (!(commonSearchResult instanceof MSearchResult)) {
            commonSearchResult = null;
        }
        return (MSearchResult) commonSearchResult;
    }

    @Override // tb.nsp
    public void a(com.taobao.search.mmd.rebuild.a aVar) {
        CommonSearchResult commonSearchResult;
        e combo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0cb092b", new Object[]{this, aVar});
        } else if (aVar == null || (commonSearchResult = (CommonSearchResult) getTotalSearchResult()) == null || (combo = commonSearchResult.getCombo(0)) == null) {
        } else {
            combo.h(aVar.a());
            combo.i(aVar.b());
            combo.j(aVar.c());
            combo.f(aVar.d());
            combo.e(aVar.e());
            combo.g(aVar.f());
            combo.d(aVar.g());
        }
    }

    public void a(Map<String, String> map, e eVar, com.taobao.android.meta.data.e<e> eVar2) {
        g gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b7a17f8", new Object[]{this, map, eVar, eVar2});
            return;
        }
        kotlin.jvm.internal.q.c(map, "map");
        e eVar3 = eVar;
        super.appendComboParams(map, eVar3, eVar2);
        a(map, eVar3);
        if (eVar == null || (gVar = this.h) == null) {
            return;
        }
        gVar.a(map, eVar, this, eVar2);
    }

    @Override // tb.nsp
    public int j() {
        e combo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue();
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (commonSearchResult != null && (combo = commonSearchResult.getCombo(0)) != null) {
            return combo.A();
        }
        return 0;
    }

    @Override // tb.nsp
    public int k() {
        e combo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue();
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (commonSearchResult != null && (combo = commonSearchResult.getCombo(0)) != null) {
            return combo.B();
        }
        return 0;
    }

    @Override // tb.nsp, com.taobao.search.sf.datasource.c, com.taobao.android.meta.data.b, com.taobao.android.searchbaseframe.datasource.a
    public Map<String, String> buildSearchParams(SearchParamImpl param) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("97339dcc", new Object[]{this, param});
        }
        kotlin.jvm.internal.q.c(param, "param");
        Map<String, String> createUrlParams = param.createUrlParams();
        kotlin.jvm.internal.q.a((Object) createUrlParams, "param.createUrlParams()");
        d(createUrlParams);
        noo.a(createUrlParams);
        b(createUrlParams);
        c(createUrlParams);
        String str = createUrlParams.get(noa.KEY_TAG_SEARCH_KEYWORD);
        if (!TextUtils.isEmpty(str)) {
            createUrlParams.put("q", str);
        }
        return createUrlParams;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    public void buildSearchParamsWithConfig(Map<String, String> map, a.C0571a c0571a) {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc63fd85", new Object[]{this, map, c0571a});
            return;
        }
        try {
            if (!r.cM()) {
                return;
            }
            if (c0571a != null) {
                com.taobao.android.meta.data.e eVar = (com.taobao.android.meta.data.e) c0571a;
                if (!eVar.c() && eVar.a() != null && !eVar.d()) {
                    return;
                }
                String a2 = x.Companion.a();
                if (TextUtils.isEmpty(a2)) {
                    return;
                }
                for (Map.Entry<String, Object> entry : JSON.parseObject(a2).entrySet()) {
                    String key = entry.getKey();
                    if (key != null && (value = entry.getValue()) != null && map != null) {
                        map.put(key, value.toString());
                    }
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.meta.data.MetaSearchConfig<out com.taobao.android.meta.data.MetaCombo>");
        } catch (Exception unused) {
        }
    }

    private final void a(Map<String, String> map, com.taobao.android.meta.data.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0e10e19", new Object[]{this, map, aVar});
            return;
        }
        boolean z = 1 == NetworkQualityMonitor.getGlobalNetworkQuality();
        if (aVar == null) {
            map.put("page", String.valueOf(getNextPage()));
            int pageSize = getPageSize();
            if (this.l && z && u.u()) {
                map.put("weakNetwork", "true");
                map.put("n", String.valueOf(pageSize / 2));
                this.m = true;
            } else {
                map.put("n", String.valueOf(pageSize));
                this.m = false;
            }
        } else {
            htg htgVar = (htg) aVar;
            map.put("page", String.valueOf(htgVar.d()));
            int c = htgVar.c();
            if (this.m && c < 10) {
                c = 10;
            }
            map.put("n", String.valueOf(c));
        }
        this.l = false;
    }

    private final void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("509c7e1", new Object[]{this});
        } else if (r.cf()) {
        } else {
            String paramValue = getParamValue("q");
            if (this.j != null || paramValue == null) {
                return;
            }
            this.j = paramValue;
        }
    }

    private final void aa() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaf280a7", new Object[]{this});
        } else if (r.cf() || this.j == null || !TextUtils.isEmpty(getParamValue("q"))) {
        } else {
            setParam("q", this.j);
        }
    }

    @Override // com.taobao.search.sf.datasource.c, com.taobao.android.searchbaseframe.datasource.a
    public boolean doRefreshListSearch() {
        com.taobao.android.meta.structure.childpage.g d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9269161", new Object[]{this})).booleanValue();
        }
        q();
        g gVar = this.h;
        int M = (gVar == null || (d = gVar.d((g) this)) == null) ? 0 : d.M();
        HashMap hashMap = new HashMap();
        hashMap.put("listWidth", String.valueOf(M));
        hashMap.put("searchType", "auction");
        MSearchResult i = i();
        e combo = i != null ? i.getCombo(0) : null;
        if (combo != null) {
            combo.i(false);
        }
        doNewSearch(combo, false, hashMap);
        return true;
    }

    @Override // com.taobao.search.sf.datasource.c, com.taobao.android.meta.data.b, com.taobao.android.searchbaseframe.datasource.a
    public boolean doNewSearch() {
        e combo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4097f128", new Object[]{this})).booleanValue();
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (commonSearchResult != null && (combo = commonSearchResult.getCombo(0)) != null) {
            combo.i(false);
            q();
            int i = combo.a().pageSize;
            int i2 = combo.a().totalResult;
            combo.h();
            combo.a().pageSize = i;
            combo.a().totalResult = i2;
            doNewSearch(combo, false, ai.a(new Pair("searchType", "all")));
            return true;
        }
        return super.doNewSearch();
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.a, com.taobao.android.searchbaseframe.datasource.c
    public void addParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf385287", new Object[]{this, str, str2});
            return;
        }
        SearchParamImpl W = W();
        if (W == null) {
            super.addParam(str, str2);
        } else if (str2 == null || str == null) {
        } else {
            W.addParamSetValue(str, str2);
        }
    }

    @Override // tb.nsp, com.taobao.android.searchbaseframe.datasource.impl.a, com.taobao.android.searchbaseframe.datasource.c
    public void setParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc6ab466", new Object[]{this, str, str2});
            return;
        }
        if (kotlin.jvm.internal.q.a((Object) str, (Object) "q")) {
            Z();
        }
        if (n().contains(str)) {
            addParam(str, str2);
            return;
        }
        SearchParamImpl W = W();
        if (W == null) {
            super.setParam(str, str2);
        } else if (str2 == null || str == null) {
        } else {
            W.setParam(str, str2);
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.a, com.taobao.android.searchbaseframe.datasource.c
    public void removeParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dd3c784", new Object[]{this, str, str2});
            return;
        }
        SearchParamImpl W = W();
        if (W != null && str2 != null && str != null) {
            W.removeParamSetValue(str, str2);
        }
        super.removeParam(str, str2);
        if (!kotlin.jvm.internal.q.a((Object) str, (Object) "q")) {
            return;
        }
        aa();
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.a, com.taobao.android.searchbaseframe.datasource.c
    public void clearParam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1864d1", new Object[]{this, str});
            return;
        }
        SearchParamImpl W = W();
        if (W != null && str != null) {
            W.removeParam(str);
        }
        super.clearParam(str);
        if (!kotlin.jvm.internal.q.a((Object) str, (Object) "q")) {
            return;
        }
        aa();
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.a
    public boolean containParam(String str, String str2) {
        SearchParamImpl W;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee9b5d38", new Object[]{this, str, str2})).booleanValue();
        }
        if (str != null && str2 != null && (W = W()) != null) {
            z = W.containsParamValue(str, str2);
        }
        return super.containParam(str, str2) | z;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.a
    public String getParamStr(String str) {
        SearchParamImpl W;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e304915", new Object[]{this, str});
        }
        if (str != null && (W = W()) != null) {
            String paramStr = W.getParamStr(str);
            kotlin.jvm.internal.q.a((Object) paramStr, "params.getParamStr(key)");
            if (!TextUtils.isEmpty(paramStr)) {
                return paramStr;
            }
        }
        return super.getParamStr(str);
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.a
    public String getParamValue(String str) {
        SearchParamImpl W;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea5b9c15", new Object[]{this, str});
        }
        if (str != null && (W = W()) != null) {
            String paramValue = W.getParamValue(str);
            if (!TextUtils.isEmpty(paramValue)) {
                return paramValue;
            }
        }
        return super.getParamValue(str);
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.a
    public Set<String> getParamValueSet(String str) {
        SearchParamImpl W;
        Set<String> paramValueSet;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("a85e1de8", new Object[]{this, str}) : (str == null || (W = W()) == null || (paramValueSet = W.getParamValueSet(str)) == null) ? super.getParamValueSet(str) : paramValueSet;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.a
    public Map<String, String> getParamsSnapShot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a3418cfc", new Object[]{this});
        }
        Map<String, String> paramsSnapShot = super.getParamsSnapShot();
        SearchParamImpl W = W();
        if (W != null) {
            Map<String, String> paramSnapshot = W.getParamSnapshot();
            kotlin.jvm.internal.q.a((Object) paramSnapshot, "it.paramSnapshot");
            paramsSnapShot.putAll(paramSnapshot);
        }
        return paramsSnapShot;
    }

    private final SearchParamImpl W() {
        e combo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchParamImpl) ipChange.ipc$dispatch("b7a1f5e8", new Object[]{this});
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (commonSearchResult != null && (combo = commonSearchResult.getCombo(0)) != null) {
            return combo.q();
        }
        return null;
    }

    @Override // tb.nsp
    public void a(Map<String, String> params) {
        e combo;
        g gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, params});
            return;
        }
        kotlin.jvm.internal.q.c(params, "params");
        MSearchResult i = i();
        if (i == null || (combo = i.getCombo(0)) == null || (gVar = this.h) == null) {
            return;
        }
        gVar.a(kotlin.jvm.internal.x.i(params), combo);
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    public int getCurrentPage() {
        e combo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ddb71ec", new Object[]{this})).intValue();
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (commonSearchResult != null && (combo = commonSearchResult.getCombo(0)) != null) {
            return rwf.c(1, combo.a().page);
        }
        return super.getCurrentPage();
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    public int getTotalResultCount() {
        ResultMainInfoBean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("738c06fe", new Object[]{this})).intValue();
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (commonSearchResult != null) {
            if (commonSearchResult.newSearch) {
                int comboSize = commonSearchResult.comboSize();
                int i = 0;
                for (int i2 = 0; i2 < comboSize; i2++) {
                    e combo = commonSearchResult.getCombo(i2);
                    if (combo == null) {
                        kotlin.jvm.internal.q.a();
                    }
                    i += combo.a().totalResult;
                }
                return i;
            }
            e combo2 = commonSearchResult.getCombo(0);
            if (combo2 != null && (a2 = combo2.a()) != null) {
                return a2.totalResult;
            }
            return 0;
        }
        return super.getTotalResultCount();
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    public boolean isTaskRunning() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa36517b", new Object[]{this})).booleanValue();
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (commonSearchResult != null) {
            int comboSize = commonSearchResult.comboSize();
            boolean z = false;
            for (int i = 0; i < comboSize; i++) {
                e combo = commonSearchResult.getCombo(i);
                if (combo == null) {
                    kotlin.jvm.internal.q.a();
                }
                com.taobao.android.searchbaseframe.datasource.a<M, SearchParamImpl, LocalDataManager>.b bVar = getComboTasks().get(combo.hashCode());
                z = bVar != null && !bVar.a();
                if (z) {
                    break;
                }
            }
            return z;
        }
        return super.isTaskRunning();
    }

    @Override // com.taobao.search.sf.datasource.c
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        g gVar = this.h;
        if (gVar == null) {
            kotlin.jvm.internal.q.a();
        }
        gVar.b(this, true);
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        c cVar = this.f;
        if (cVar == null) {
            return;
        }
        a(cVar.a());
        a(cVar.b());
        b(cVar.c());
        this.d = cVar.c();
        a(cVar.d());
        b(cVar.e());
        com.taobao.search.sf.datasource.a f = cVar.f();
        if (f != null) {
            a(f);
        }
        setExtraStatus(cVar.g());
        setFallbackTypeMap(cVar.h());
        setDynamicFallback(cVar.i());
        setSearchParam(cVar.k());
        setLocalDataManager(cVar.j());
        CommonSearchResult l = cVar.l();
        if (l != null) {
            setTotalResult(l);
            l.restore();
        }
        CommonSearchResult m = cVar.m();
        if (m != null) {
            setLastResult(m);
            m.restore();
        }
        setPager(cVar.n());
        setTemplates(cVar.o());
        ConcurrentHashMap<String, jvm.c> p = cVar.p();
        if (p == null) {
            p = new ConcurrentHashMap<>();
        }
        setTemplateFiles(p);
        setUserListStyle(cVar.q());
        updateRequestCount(cVar.r());
        updateFirstRequestPerf(cVar.s());
        setBundleUrl(cVar.t());
    }

    @Override // tb.nsp, com.taobao.search.sf.datasource.c, com.taobao.android.meta.data.b, com.taobao.android.searchbaseframe.datasource.a
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        g gVar = this.h;
        if (gVar == null) {
            return;
        }
        gVar.a((BaseResultActivity) null);
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    public boolean isTemplateParseAsync() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4687a078", new Object[]{this})).booleanValue() : r.bw() && getTemplateFiles() != null && getTemplateFiles().isEmpty();
    }

    public final com.taobao.search.sf.widgets.preposefilter.a e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.sf.widgets.preposefilter.a) ipChange.ipc$dispatch("4d66f639", new Object[]{this, str}) : this.k.get(str);
    }

    public final void a(com.taobao.search.sf.widgets.preposefilter.a bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2898e01", new Object[]{this, bean});
            return;
        }
        kotlin.jvm.internal.q.c(bean, "bean");
        if (TextUtils.isEmpty(bean.r())) {
            return;
        }
        this.k.put(bean.r(), bean);
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
        } else {
            this.k.clear();
        }
    }
}
