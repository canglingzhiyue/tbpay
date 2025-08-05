package com.taobao.search.sf.datasource;

import android.os.Build;
import android.taobao.util.g;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.f;
import com.taobao.android.searchbaseframe.datasource.LocalDataManager;
import com.taobao.android.searchbaseframe.datasource.a;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.param.SearchParam;
import com.taobao.android.searchbaseframe.datasource.param.SearchParamImpl;
import com.taobao.android.searchbaseframe.datasource.result.SearchResult;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.o;
import com.taobao.downgrade.Downgrade;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.search.common.SearchSdk;
import com.taobao.search.common.util.n;
import com.taobao.search.common.util.r;
import com.taobao.search.common.util.u;
import com.taobao.search.mmd.util.j;
import com.taobao.tao.Globals;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.gse;
import tb.imn;
import tb.ioy;
import tb.kge;
import tb.nne;
import tb.nnq;
import tb.noa;
import tb.noo;
import tb.nwh;
import tb.qus;

/* loaded from: classes8.dex */
public abstract class c extends com.taobao.android.meta.data.b<com.taobao.search.refactor.e, CommonSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f19441a;
    private String b;
    private com.taobao.search.sf.datasource.a c;
    private String d;
    private boolean e;
    public long r;
    public boolean s;

    static {
        kge.a(-880864861);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -1510769058:
                super.onTriggerEventAfterSearchTask((a.C0571a) objArr[0], (SearchResult) objArr[1], ((Boolean) objArr[2]).booleanValue());
                return null;
            case -369283914:
                return super.getUserListStyle();
            case -306642067:
                return super.getUIListStyle();
            case -284107456:
                super.setUserListStyle((ListStyle) objArr[0]);
                return null;
            case -114912927:
                return new Boolean(super.doRefreshListSearch());
            case 158902275:
                return super.getLatestParamsSnapshot();
            case 1083699496:
                return new Boolean(super.doNewSearch());
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public com.taobao.search.sf.realtimetag.b K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.search.sf.realtimetag.b) ipChange.ipc$dispatch("ae50ff59", new Object[]{this});
        }
        return null;
    }

    public nwh L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nwh) ipChange.ipc$dispatch("6d75e074", new Object[]{this});
        }
        return null;
    }

    public abstract com.taobao.android.searchbaseframe.util.e<String, String> a();

    public void e(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c96b99", new Object[]{this, map});
        }
    }

    @Override // com.taobao.android.meta.data.b
    public boolean isMetaMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9589cc1d", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ String a(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("be8377e", new Object[]{cVar, str});
        }
        cVar.f19441a = str;
        return str;
    }

    public static /* synthetic */ String b(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f96623f", new Object[]{cVar, str});
        }
        cVar.b = str;
        return str;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    /* renamed from: createResult */
    public /* synthetic */ SearchResult mo1015createResult(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SearchResult) ipChange.ipc$dispatch("23b3014a", new Object[]{this, new Boolean(z)}) : c(z);
    }

    @Override // com.taobao.android.meta.data.b, com.taobao.android.searchbaseframe.datasource.a
    public /* synthetic */ LocalDataManager onCreateLocalDataManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LocalDataManager) ipChange.ipc$dispatch("74f5fe77", new Object[]{this}) : I();
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    public /* synthetic */ void onTriggerEventAfterSearchTask(a.C0571a c0571a, SearchResult searchResult, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5f37e5e", new Object[]{this, c0571a, searchResult, new Boolean(z)});
        } else {
            a(c0571a, (CommonSearchResult) searchResult, z);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f19441a = str;
        }
    }

    public String o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4719ea", new Object[]{this}) : this.f19441a;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public String p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91ccd489", new Object[]{this}) : this.b;
    }

    public c(imn imnVar, ioy ioyVar) {
        super(imnVar, ioyVar);
        this.e = false;
        d();
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    public boolean shouldResetEventBus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8b4a808d", new Object[]{this})).booleanValue() : u.v();
    }

    public c(imn imnVar) {
        this(imnVar, null);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            e();
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!"degrade".equals(Downgrade.getInstance().getDowngradeStrategy("search").getTacticsPerformance())) {
        } else {
            setParam("devicePerformanceLevel", "low");
            if (n.INSTANCE.a()) {
                addParam("devicePerformanceType", "NonVideo");
            }
            if (n.INSTANCE.b()) {
                addParam("devicePerformanceType", "NonIntelligEnd");
            }
            if (!n.INSTANCE.c()) {
                return;
            }
            addParam("devicePerformanceType", "DPicDegraded");
        }
    }

    @Override // com.taobao.android.meta.data.b, com.taobao.android.searchbaseframe.datasource.a
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        unsubscribe(this);
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.a, com.taobao.android.searchbaseframe.datasource.c
    public void setParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70906a96", new Object[]{this, map});
        } else if (map != null) {
            SearchParamImpl currentParam = getCurrentParam();
            HashSet hashSet = new HashSet();
            String remove = map.remove(noa.KEY_MULTI_VALUE_KEYS);
            if (!TextUtils.isEmpty(remove)) {
                hashSet.addAll(Arrays.asList(remove.split(",")));
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key)) {
                    if (value == null) {
                        value = "";
                    }
                    if (hashSet.contains(key)) {
                        for (String str : value.split(SearchParam.Param.getParamSeparator(key))) {
                            currentParam.addParamSetValue(key, str);
                        }
                    } else {
                        currentParam.setParam(key, value);
                    }
                }
            }
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        this.f19441a = "";
        this.b = "";
        clearParam(noa.KEY_RCMD_TIPS_SHOWED);
    }

    public String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ed849c7", new Object[]{this});
        }
        String paramValue = getParamValue("page_name");
        return !TextUtils.isEmpty(paramValue) ? paramValue : getParamValue("m");
    }

    public String s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("255e0466", new Object[]{this}) : getParamValue("sort");
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
        } else {
            setParam(noa.KEY_ENTER_SRP, "true");
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
        } else {
            clearParam(noa.KEY_ENTER_SRP);
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    public void setUserListStyle(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef10dd40", new Object[]{this, listStyle});
            return;
        }
        super.setUserListStyle(listStyle);
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (commonSearchResult == null || !commonSearchResult.isSaveListStyle) {
            return;
        }
        qus.INSTANCE.a(listStyle);
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue() : TextUtils.equals("shop", getParamValue("tab"));
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[]{this})).booleanValue() : TextUtils.equals(noa.VALUE_SHOWTYPE_SIMILAR, c(noa.KEY_SHOWTYPE));
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue() : TextUtils.equals(noa.VALUE_SHOWTYPE_SAME, c(noa.KEY_SHOWTYPE));
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[]{this})).booleanValue() : TextUtils.equals(noa.VALUE_MODULE_SPUITEM, c("m"));
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue() : TextUtils.equals(noa.VALUE_MODULE_INSHOP, c("m"));
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue() : TextUtils.equals(noa.VALUE_BOT_SEARCH, c("m"));
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str}) : a(str, "");
    }

    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        String paramValue = getParamValue(noa.GLOBAL_PARAM_PREFIX + str);
        if (TextUtils.isEmpty(paramValue)) {
            paramValue = getParamValue(str);
        }
        return TextUtils.isEmpty(paramValue) ? str2 : paramValue;
    }

    public String d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f4d254b", new Object[]{this, str}) : b(str, "");
    }

    public String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String paramStr = getParamStr(noa.GLOBAL_PARAM_PREFIX + str);
        if (TextUtils.isEmpty(paramStr)) {
            paramStr = getParamStr(str);
        }
        return TextUtils.isEmpty(paramStr) ? str2 : paramStr;
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
        } else if (r.cq() && !TextUtils.isEmpty(getParamStr(noa.KEY_NEED_TABS))) {
        } else {
            setParam(noa.KEY_NEED_TABS, "true");
        }
    }

    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str) || !TextUtils.equals(str2, c(str))) {
        } else {
            removeParam(str, str2);
            removeParam(noa.GLOBAL_PARAM_PREFIX + str, str2);
        }
    }

    public Map<String, String> D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("53c795c0", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : getParamsSnapShot().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value) && key.startsWith(noa.GLOBAL_PARAM_PREFIX)) {
                hashMap.put(key, value);
            }
        }
        a(hashMap);
        return hashMap;
    }

    private void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        for (String str : Arrays.asList(noa.KEY_POP_UP_STYLE, noa.KEY_POP_UP, "tbsearch_popup_animated")) {
            String paramValue = getParamValue(str);
            if (!TextUtils.isEmpty(paramValue)) {
                map.put(str, paramValue);
            }
        }
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[]{this})).booleanValue() : F().isFilterBtnSelected;
    }

    public CommonLocalManager F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CommonLocalManager) ipChange.ipc$dispatch("13721ac9", new Object[]{this}) : (CommonLocalManager) getLocalDataManager();
    }

    public com.taobao.search.sf.datasource.a G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.sf.datasource.a) ipChange.ipc$dispatch("ed752d80", new Object[]{this}) : this.c;
    }

    public void a(com.taobao.search.sf.datasource.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("141e10da", new Object[]{this, aVar});
            return;
        }
        this.c = aVar;
        if (!(this.mAdapter instanceof d)) {
            return;
        }
        ((d) this.mAdapter).a(aVar);
    }

    @Override // com.taobao.android.meta.data.b
    public f<com.taobao.search.refactor.e, CommonSearchResult> createRequestAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("94cf75ea", new Object[]{this}) : new d(c(), getSrpLifeCycleWatcher());
    }

    @Override // com.taobao.android.meta.data.b, com.taobao.android.searchbaseframe.datasource.a
    public boolean doNewSearch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4097f128", new Object[]{this})).booleanValue();
        }
        q();
        return super.doNewSearch();
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    public boolean doRefreshListSearch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9269161", new Object[]{this})).booleanValue();
        }
        q();
        return super.doRefreshListSearch();
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else {
            triggerAfter(true, false, false);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.android.meta.data.b, com.taobao.android.searchbaseframe.datasource.a
    public Map<String, String> buildSearchParams(SearchParamImpl searchParamImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("97339dcc", new Object[]{this, searchParamImpl});
        }
        Map<String, String> createUrlParams = searchParamImpl.createUrlParams();
        d(createUrlParams);
        noo.a(createUrlParams);
        f(createUrlParams);
        c(createUrlParams);
        return createUrlParams;
    }

    public void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            return;
        }
        for (String str : noa.REQUEST_BLACK_PARAMS) {
            map.remove(str);
        }
    }

    public Map<String, String> H() {
        com.taobao.search.refactor.e combo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8a711cc4", new Object[]{this});
        }
        if (isMetaMode() && getTotalSearchResult() != 0 && (combo = ((CommonSearchResult) getTotalSearchResult()).getCombo(0)) != null) {
            return getSearchParams(combo);
        }
        return buildSearchParams(getCurrentParam());
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    public Map<String, String> getLatestParamsSnapshot() {
        com.taobao.search.refactor.e combo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("978a803", new Object[]{this});
        }
        Map<String, String> latestParamsSnapshot = super.getLatestParamsSnapshot();
        if (isMetaMode() && getTotalSearchResult() != 0 && (combo = ((CommonSearchResult) getTotalSearchResult()).getCombo(0)) != null) {
            appendComboParams(latestParamsSnapshot, combo, null);
        }
        return latestParamsSnapshot;
    }

    public Map<String, String> a(com.taobao.search.refactor.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("67889e80", new Object[]{this, eVar});
        }
        Map<String, String> latestParamsSnapshot = super.getLatestParamsSnapshot();
        if (eVar != null) {
            appendComboParams(latestParamsSnapshot, eVar, null);
        }
        return latestParamsSnapshot;
    }

    public CommonLocalManager I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CommonLocalManager) ipChange.ipc$dispatch("17151366", new Object[]{this}) : new CommonLocalManager();
    }

    public CommonSearchResult c(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CommonSearchResult) ipChange.ipc$dispatch("7e3d3f09", new Object[]{this, new Boolean(z)}) : new CommonSearchResult(getCore(), z);
    }

    private void f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e06b41f8", new Object[]{this, map});
            return;
        }
        map.put("page", String.valueOf(getNextPage()));
        map.put("n", String.valueOf(getPageSize()));
    }

    public void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, map});
            return;
        }
        ScreenType.a(map);
        map.put("sversion", noa.SERVER_VERSION_VALUE);
        map.put(noa.KEY_IS_BETA, String.valueOf(SearchSdk.isBeta()));
        map.put("apptimestamp", String.valueOf(System.currentTimeMillis() / 1000));
        map.put("vm", "nw");
        imn c = c();
        if (c != null && c.a() != null) {
            map.put("ttid", c.a().a());
            map.put("utd_id", c.a().b());
        }
        TBLocationDTO a2 = nnq.a();
        if (a2 != null) {
            map.put("longitude", a2.longitude);
            map.put("latitude", a2.latitude);
            map.put(noa.KEY_CITY_CODE, a2.cityCode);
            map.put(noa.KEY_AREA_LBS_CODE, a2.areaCode);
        }
        map.put("info", g.c(Globals.getApplication()));
        String a3 = o.a();
        if (!TextUtils.isEmpty(a3)) {
            map.put("network", a3);
        }
        map.put(MspDBHelper.BizEntry.COLUMN_NAME_DEVICE, Build.MODEL);
        map.put("brand", Build.BRAND);
        String b2 = com.taobao.search.mmd.util.g.b();
        if (!TextUtils.isEmpty(b2)) {
            map.put("areaCode", b2);
        }
        String c2 = com.taobao.search.mmd.util.g.c();
        if (!TextUtils.isEmpty(c2)) {
            map.put(noa.KEY_COUNTRY_NUM, c2);
        }
        String d = com.taobao.search.mmd.util.g.d();
        if (!TextUtils.isEmpty(d)) {
            map.put(noa.KEY_EDITION_CODE, d);
        }
        if (!TextUtils.isEmpty(com.taobao.search.common.util.f.a())) {
            map.put(noa.KEY_HOMEPAGE_VERSION, com.taobao.search.common.util.f.a());
        }
        String b3 = com.taobao.search.common.util.f.b();
        if (!TextUtils.isEmpty(b3)) {
            map.put("LBS", b3);
        }
        if (TextUtils.isEmpty(map.get(noa.KEY_GLOBAL_LBS))) {
            String c3 = com.taobao.search.common.util.o.INSTANCE.c(Globals.getApplication());
            if (!TextUtils.isEmpty(c3)) {
                map.put(noa.KEY_GLOBAL_LBS, c3);
            }
        }
        map.put("elderHome", String.valueOf(j.INSTANCE.a()));
        if (!map.containsKey(noa.KEY_GOOD_PRICE)) {
            map.put(noa.KEY_GOOD_PRICE, String.valueOf(j.INSTANCE.c()));
        }
        map.put("gpsEnabled", String.valueOf(TBLocationClient.c()));
        if (!b() || n.INSTANCE.g()) {
            return;
        }
        g(map);
    }

    public void d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1127953a", new Object[]{this, map});
            return;
        }
        Map<String, String> c = com.taobao.search.common.util.f.c();
        if (c == null) {
            return;
        }
        map.putAll(c);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : "true".equals(r.a("jarvis_config_v2", "sendClickedAuctions", "true"));
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[]{this})).booleanValue();
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        return commonSearchResult != null && commonSearchResult.isAddCartSupported;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    public ListStyle getUserListStyle() {
        ListStyle a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("e9fd2cb6", new Object[]{this});
        }
        ListStyle userListStyle = super.getUserListStyle();
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (commonSearchResult == null || userListStyle != null || !commonSearchResult.isSaveListStyle || (a2 = qus.INSTANCE.a()) == null) {
            return userListStyle;
        }
        super.setUserListStyle(a2);
        return a2;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.a
    public ListStyle getUIListStyle() {
        ResultMainInfoBean mainInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ListStyle) ipChange.ipc$dispatch("edb9036d", new Object[]{this});
        }
        ListStyle uIListStyle = super.getUIListStyle();
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (commonSearchResult == null || !commonSearchResult.isSuccess() || (mainInfo = commonSearchResult.getMainInfo()) == null) {
            return uIListStyle;
        }
        if (TextUtils.equals(mainInfo.pageName, nne.PAGE_NAME_MAIN_SPU)) {
            return ListStyle.LIST;
        }
        return (v() || "shopsearch".equals(getParamValue("m"))) ? ListStyle.LIST : uIListStyle;
    }

    public void a(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b84a965", new Object[]{this, listStyle});
        } else {
            setParam("style", com.taobao.search.mmd.datasource.bean.ListStyle.convertFromSFStyle(listStyle).getValue());
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    public Map<String, String> getResultTrackArgs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7baebd7e", new Object[]{this, map});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("appId", map.get("appId"));
        return hashMap;
    }

    public int M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4529647", new Object[]{this})).intValue();
        }
        String a2 = r.a("jarvis_config_v2", "sendClickedAuctionsWaitTime", "30");
        if (Integer.parseInt(a2) <= 100) {
            return Integer.parseInt(a2);
        }
        return 30;
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    public void asyncAppendParams(Map<String, String> map, a.C0571a c0571a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbb69bd", new Object[]{this, map, c0571a});
        } else if (!n.INSTANCE.g() || !b()) {
        } else {
            g(map);
        }
    }

    private void g(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80d1857", new Object[]{this, map});
            return;
        }
        com.taobao.android.searchbaseframe.util.e<String, String> a2 = a();
        if (a2 == null) {
            return;
        }
        String str = a2.f15014a;
        String str2 = a2.b;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                int M = M();
                CountDownLatch countDownLatch = new CountDownLatch(2);
                HashMap hashMap = new HashMap();
                hashMap.put("query", getKeyword());
                e(hashMap);
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                boolean O = O();
                if (O) {
                    com.taobao.android.jarviswe.a.a().a(str, str2, hashMap, new a(this, concurrentHashMap, countDownLatch));
                } else {
                    countDownLatch.countDown();
                }
                boolean P = P();
                if (P) {
                    com.taobao.android.jarviswe.tracker.c.a().a(getKeyword(), new b(this, concurrentHashMap, countDownLatch));
                } else {
                    countDownLatch.countDown();
                }
                countDownLatch.await(M, TimeUnit.MILLISECONDS);
                String b2 = b(O, P, concurrentHashMap);
                if (!TextUtils.isEmpty(b2)) {
                    map.put("pvFeature", b2);
                }
                a(O, P, concurrentHashMap);
            } catch (Exception unused) {
            }
        }
    }

    private String b(boolean z, boolean z2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("21b097e4", new Object[]{this, new Boolean(z), new Boolean(z2), map});
        }
        String str = map.get("pvFeature");
        if (TextUtils.isEmpty(str)) {
            str = this.f19441a;
        }
        String str2 = map.get("nativePvFeature");
        if (TextUtils.isEmpty(str2)) {
            str2 = this.b;
        }
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (!z || !z2) {
            return z ? str : z2 ? str2 : "";
        }
        return str + "|" + str2;
    }

    public void a(boolean z, boolean z2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c128219d", new Object[]{this, new Boolean(z), new Boolean(z2), map});
            return;
        }
        String str = map.get("pvFeature");
        String str2 = map.get("nativePvFeature");
        if (z && !TextUtils.isEmpty(str)) {
            AppMonitor.Alarm.commitSuccess("JarvisWE", "pvFeature_python");
        } else if (z) {
            AppMonitor.Alarm.commitFail("JarvisWE", "pvFeature_python", "", "", "");
        }
        if (z2 && !TextUtils.isEmpty(str2)) {
            AppMonitor.Alarm.commitSuccess("JarvisWE", "pvFeature_native");
        } else if (!z2) {
        } else {
            AppMonitor.Alarm.commitFail("JarvisWE", "pvFeature_native", "", "", "");
        }
    }

    public boolean O() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[]{this})).booleanValue() : !r.w();
    }

    public boolean P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("47cdcdb", new Object[]{this})).booleanValue() : !r.x();
    }

    /* loaded from: classes8.dex */
    public static class a implements gse {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f19442a;
        private Map<String, String> b;
        private CountDownLatch c;

        static {
            kge.a(-347801790);
            kge.a(20055365);
        }

        public a(c cVar, Map<String, String> map, CountDownLatch countDownLatch) {
            this.f19442a = new WeakReference<>(cVar);
            this.b = map;
            this.c = countDownLatch;
        }

        @Override // tb.gse
        public void notify(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("12981c64", new Object[]{this, str, str2});
                return;
            }
            try {
                c cVar = this.f19442a.get();
                if (cVar == null) {
                    return;
                }
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                this.b.put("pvFeature", str2);
                c.a(cVar, str2);
            } finally {
                this.c.countDown();
            }
        }

        @Override // tb.gse
        public void errorReport(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("28fdfd81", new Object[]{this, str, str2, str3});
            } else {
                this.c.countDown();
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class b implements com.taobao.android.jarviswe.tracker.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f19443a;
        private Map<String, String> b;
        private CountDownLatch c;

        static {
            kge.a(733667630);
            kge.a(-212829689);
        }

        public b(c cVar, Map<String, String> map, CountDownLatch countDownLatch) {
            this.f19443a = new WeakReference<>(cVar);
            this.b = map;
            this.c = countDownLatch;
        }

        @Override // com.taobao.android.jarviswe.tracker.a
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            try {
                c cVar = this.f19443a.get();
                if (cVar == null) {
                    return;
                }
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                this.b.put("nativePvFeature", str2);
                c.b(cVar, str2);
            } finally {
                this.c.countDown();
            }
        }

        @Override // com.taobao.android.jarviswe.tracker.a
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            } else {
                this.c.countDown();
            }
        }
    }

    public void a(a.C0571a c0571a, CommonSearchResult commonSearchResult, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e85cf560", new Object[]{this, c0571a, commonSearchResult, new Boolean(z)});
            return;
        }
        super.onTriggerEventAfterSearchTask(c0571a, commonSearchResult, z);
        a(commonSearchResult);
    }

    public String Q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("479b3b48", new Object[]{this}) : this.d;
    }

    public void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        this.e = z;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String tab = getTab();
        if (TextUtils.isEmpty(tab)) {
            tab = "default";
        }
        this.d = str + "_" + tab;
    }

    public void a(CommonSearchResult commonSearchResult) {
        CommonSearchResult commonSearchResult2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a4cbd85", new Object[]{this, commonSearchResult});
        } else if (TextUtils.isEmpty(this.d) || (commonSearchResult2 = (CommonSearchResult) getTotalSearchResult()) == null) {
        } else {
            if (commonSearchResult2.getPageNo() == 1) {
                com.taobao.search.sf.detailpre.a.b().b(commonSearchResult2.getMainInfo().abtest, this.e);
            }
            if (!commonSearchResult2.isPreDetail()) {
                return;
            }
            com.taobao.search.sf.detailpre.a.b().a(this.d, commonSearchResult, getKeyword(), this.e);
        }
    }
}
