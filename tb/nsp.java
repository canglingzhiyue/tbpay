package tb;

import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.jarviswe.Jarvis;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.f;
import com.taobao.android.searchbaseframe.datasource.a;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.datasource.param.SearchParamImpl;
import com.taobao.android.searchbaseframe.datasource.result.SearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.track.d;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.e;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.search.common.util.ab;
import com.taobao.search.common.util.k;
import com.taobao.search.common.util.n;
import com.taobao.search.common.util.r;
import com.taobao.search.common.util.v;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.mmd.datasource.bean.SearchApiModel;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.datasource.c;
import com.taobao.search.sf.realtimetag.b;
import com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean;
import com.taobao.taolive.room.utils.aw;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public class nsp extends c implements nsn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static HashSet<String> f31737a;
    private static List<String> n;
    public final boolean b;
    public final boolean c;
    private b d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private Map<String, String> l;
    private int m;
    private JSONArray o;
    private HashMap<String, String> p;
    private final nwh q;

    public static /* synthetic */ Object ipc$super(nsp nspVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -1758224948:
                return super.buildSearchParams((SearchParamImpl) objArr[0]);
            case -596986778:
                super.setParam((String) objArr[0], (String) objArr[1]);
                return null;
            case -396561056:
                super.a((a.C0571a) objArr[0], (CommonSearchResult) objArr[1], ((Boolean) objArr[2]).booleanValue());
                return null;
            case -345310240:
                return new Boolean(super.doNextPageSearch());
            case -95162026:
                super.onPreSearchOfParams((a.C0571a) objArr[0], (Map) objArr[1]);
                return null;
            case 6973600:
                return new Boolean(super.onPostRequest((nsp) ((MetaResult) objArr[0]), (a.C0571a) objArr[1], ((Number) objArr[2]).longValue(), (d) objArr[3]));
            case 93762283:
                super.d();
                return null;
            case 105768056:
                super.q();
                return null;
            case 696631003:
                super.c((Map) objArr[0]);
                return null;
            case 2117943049:
                return super.c(((Boolean) objArr[0]).booleanValue());
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.search.sf.datasource.c, com.taobao.android.searchbaseframe.datasource.a
    /* renamed from: createResult */
    public /* synthetic */ SearchResult mo1015createResult(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SearchResult) ipChange.ipc$dispatch("23b3014a", new Object[]{this, new Boolean(z)}) : c(z);
    }

    @Override // com.taobao.android.meta.data.b
    public /* synthetic */ boolean onPostRequest(CommonSearchResult commonSearchResult, a.C0571a c0571a, long j, d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a68a0", new Object[]{this, commonSearchResult, c0571a, new Long(j), dVar})).booleanValue() : a(commonSearchResult, c0571a, j, dVar);
    }

    @Override // com.taobao.android.meta.data.b, com.taobao.android.searchbaseframe.datasource.a
    public /* synthetic */ boolean onPostRequest(SearchResult searchResult, a.C0571a c0571a, long j, d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("540c2155", new Object[]{this, searchResult, c0571a, new Long(j), dVar})).booleanValue() : a((CommonSearchResult) searchResult, c0571a, j, dVar);
    }

    @Override // com.taobao.search.sf.datasource.c, com.taobao.android.searchbaseframe.datasource.a
    public /* synthetic */ void onTriggerEventAfterSearchTask(a.C0571a c0571a, SearchResult searchResult, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5f37e5e", new Object[]{this, c0571a, searchResult, new Boolean(z)});
        } else {
            a(c0571a, (CommonSearchResult) searchResult, z);
        }
    }

    static {
        kge.a(-2012244302);
        kge.a(-801634456);
        f31737a = new HashSet<>();
        n = new ArrayList();
        f31737a.add("service");
        f31737a.add(noa.KEY_PROPERTY);
        f31737a.add(noa.KEY_CLOSE_MODULES);
        n.add("tb_search_srp");
    }

    public com.taobao.search.mmd.rebuild.a R() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.mmd.rebuild.a) ipChange.ipc$dispatch("740b2d5c", new Object[]{this}) : new com.taobao.search.mmd.rebuild.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    public void a(com.taobao.search.mmd.rebuild.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0cb092b", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.e = aVar.a();
            this.f = aVar.b();
            this.g = aVar.c();
            this.h = aVar.d();
            this.i = aVar.e();
            this.j = aVar.f();
            this.k = aVar.g();
        }
    }

    public int S() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4a7234d", new Object[]{this})).intValue() : this.m;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.m = i;
        }
    }

    public void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
        } else {
            this.o = jSONArray;
        }
    }

    public nsp(imn imnVar, ioy ioyVar) {
        super(imnVar, ioyVar);
        this.d = new b(this);
        this.p = new HashMap<>();
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = new HashMap();
        this.m = 0;
        this.b = true;
        this.c = r.cw();
        this.q = new nwh();
        registerTemplateLoadListener(new ab());
        if (!(this.mAdapter instanceof nsq) || !r.bo()) {
            return;
        }
        ((nsq) this.mAdapter).a(true);
    }

    @Override // com.taobao.search.sf.datasource.c
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        super.d();
        try {
            setParam("rainbow", com.taobao.search.rainbow.a.c());
        } catch (Throwable unused) {
            k.a("MainSearchDatasource", "get rainbow value error");
        }
        setParam("client_os", "Android");
        setParam("client_os_version", String.valueOf(Build.VERSION.SDK_INT));
        a(ListStyle.LIST);
        HashMap hashMap = new HashMap();
        for (String str : n) {
            Map<String, String> sceneModelsVersion = Jarvis.sceneModelsVersion(str);
            if (sceneModelsVersion != null) {
                hashMap.putAll(sceneModelsVersion);
            }
        }
        if (hashMap.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : hashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                sb.append(str2);
                sb.append(":");
                sb.append(str3);
                sb.append(";");
            }
        }
        if (sb.length() <= 0) {
            return;
        }
        sb.deleteCharAt(sb.length() - 1);
        setParam(noa.KEY_JARVIS_MODEL_VERSION, sb.toString());
    }

    @Override // com.taobao.search.sf.datasource.c, com.taobao.android.meta.data.b, com.taobao.android.searchbaseframe.datasource.a
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        b bVar = this.d;
        if (bVar != null) {
            bVar.d();
        }
        nwh nwhVar = this.q;
        if (nwhVar != null) {
            nwhVar.a();
        }
        v.INSTANCE.a(String.valueOf(hashCode()));
    }

    private void b(CommonSearchResult commonSearchResult) {
        String[] Y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe0c686", new Object[]{this, commonSearchResult});
            return;
        }
        JSONObject jSONObject = commonSearchResult.pageInfo;
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObject2 = commonSearchResult.copyPageInfo;
        for (String str : r.Y()) {
            String d = d(str);
            if (!TextUtils.isEmpty(d)) {
                jSONObject.put(str, (Object) d);
                if (jSONObject2 != null) {
                    jSONObject2.put(str, (Object) d);
                }
            }
        }
    }

    @Override // com.taobao.search.sf.datasource.c
    public e<String, String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("3af765d3", new Object[]{this}) : new e<>("searchSRP", "searchExposeFeedback");
    }

    @Override // com.taobao.android.searchbaseframe.datasource.impl.a, com.taobao.android.searchbaseframe.datasource.c
    public void setParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc6ab466", new Object[]{this, str, str2});
        } else if (f31737a.contains(str)) {
            addParam(str, str2);
        } else {
            super.setParam(str, str2);
        }
    }

    public void h(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afaeeeb6", new Object[]{this, map});
        } else if (map == null) {
        } else {
            this.l.putAll(map);
            setParams(map);
        }
    }

    public void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed98df", new Object[]{this});
            return;
        }
        for (Map.Entry<String, String> entry : this.l.entrySet()) {
            clearParam(entry.getKey());
        }
        this.l.clear();
    }

    public void Y() {
        Set<String> set;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fbb060", new Object[]{this});
            return;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (commonSearchResult == null || (set = commonSearchResult.clearParams) == null || set.isEmpty()) {
            return;
        }
        for (String str : set) {
            clearParam(str);
        }
    }

    public boolean T() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4b53adf", new Object[]{this})).booleanValue() : TextUtils.equals(noa.VALUE_SEARCH_ACTION_ZD, getParamValue("search_action"));
    }

    @Override // com.taobao.search.sf.datasource.c
    public b K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("ae50ff59", new Object[]{this}) : this.d;
    }

    public boolean a(CommonSearchResult commonSearchResult, a.C0571a c0571a, long j, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("107c63eb", new Object[]{this, commonSearchResult, c0571a, new Long(j), dVar})).booleanValue();
        }
        setParam(noa.KEY_PRE_SEARCH_TIME, String.valueOf(System.currentTimeMillis() / 1000));
        if (commonSearchResult.isSuccess()) {
            c(commonSearchResult);
            g();
            if (commonSearchResult.sessionParams != null && !commonSearchResult.sessionParams.isEmpty()) {
                this.p.putAll(commonSearchResult.sessionParams);
            }
        }
        boolean onPostRequest = super.onPostRequest((nsp) commonSearchResult, c0571a, j, dVar);
        d firstRequestPerf = getFirstRequestPerf();
        if (firstRequestPerf != null && firstRequestPerf.s == 0 && this.r != 0) {
            firstRequestPerf.s = this.r;
            firstRequestPerf.D = this.s;
            ioy srpLifeCycleWatcher = getSrpLifeCycleWatcher();
            if (srpLifeCycleWatcher != null) {
                srpLifeCycleWatcher.a("srpName", (Object) firstRequestPerf.d);
                srpLifeCycleWatcher.a("traceId", (Object) firstRequestPerf.p);
                srpLifeCycleWatcher.a("goodPrice", Boolean.valueOf("true".equals(getParamValueIncludingGlobal(noa.KEY_GOOD_PRICE))));
                srpLifeCycleWatcher.a("sversion", noa.SERVER_VERSION_VALUE);
                if (!n.INSTANCE.e()) {
                    srpLifeCycleWatcher.a("srp_perf", (Object) d(commonSearchResult));
                }
                String c = ntz.INSTANCE.c("base_optimize");
                if (c == null) {
                    c = "-1";
                }
                srpLifeCycleWatcher.a("baseOptimize", (Object) c);
            }
        }
        return onPostRequest;
    }

    private String d(CommonSearchResult commonSearchResult) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b37c3d18", new Object[]{this, commonSearchResult});
        }
        try {
            JSONObject jSONObject = commonSearchResult.pageInfo;
            if (jSONObject != null) {
                String string = jSONObject.getString("for_bts");
                if (!TextUtils.isEmpty(string) && (split = string.split(";")) != null) {
                    for (String str : split) {
                        if (str.startsWith("search_native")) {
                            return str;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    @Override // com.taobao.search.sf.datasource.c
    public void a(a.C0571a c0571a, CommonSearchResult commonSearchResult, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e85cf560", new Object[]{this, c0571a, commonSearchResult, new Boolean(z)});
            return;
        }
        super.a(c0571a, commonSearchResult, z);
        if (imp.a().c()) {
            StringBuilder sb = new StringBuilder();
            for (BaseCellBean baseCellBean : commonSearchResult.getCells()) {
                if (TextUtils.equals(baseCellBean.cardType, "item")) {
                    sb.append(baseCellBean.itemId);
                    sb.append(',');
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
                k.d("[XSearchJarvis]", "page result:" + sb.toString(), new Object[0]);
            }
        }
        b(commonSearchResult);
        aB_();
        f();
        this.k = ((CommonSearchResult) getTotalSearchResult()).getCellsCount() - commonSearchResult.getCellsCount();
        a((CommonSearchResult) getTotalSearchResult(), commonSearchResult);
        v.INSTANCE.a(String.valueOf(hashCode()), commonSearchResult.getMainInfo().page, commonSearchResult.originData);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.e += this.h;
        this.f += this.i;
        this.g += this.j;
        this.i = 0;
        this.h = 0;
        this.j = 0;
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        String a2 = k.a.a(k.a.PARAM_KEY_IS_NEW_SEARCH_JUMP);
        if (!"true".equals(getParamStr(a2))) {
            return;
        }
        clearParam(k.a.PARAM_KEY_FIRST_RN);
        clearParam(noa.KEY_P4P_IDS);
        clearParam("itemIds");
        clearParam(noa.KEY_P4P_S);
        clearParam(noa.KEY_ITEM_S);
        clearParam(k.a.PARAM_KEY_COMBO_PAGE);
        clearParam(k.a.a(k.a.PARAM_KEY_COMBO_PAGE));
        clearParam(a2);
    }

    private void c(CommonSearchResult commonSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6574cf87", new Object[]{this, commonSearchResult});
            return;
        }
        String a2 = k.a.a(k.a.PARAM_KEY_FIRST_RN);
        String paramStr = getParamStr(a2);
        if (TextUtils.isEmpty(paramStr)) {
            return;
        }
        clearParam(a2);
        commonSearchResult.getMainInfo().rn = paramStr;
    }

    @Override // com.taobao.search.sf.datasource.c, com.taobao.android.meta.data.b
    public f<com.taobao.search.refactor.e, CommonSearchResult> createRequestAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("94cf75ea", new Object[]{this});
        }
        nsq nsqVar = new nsq(c(), getSrpLifeCycleWatcher());
        nsqVar.a(this);
        return nsqVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.search.sf.datasource.c, com.taobao.android.meta.data.b, com.taobao.android.searchbaseframe.datasource.a
    public Map<String, String> buildSearchParams(SearchParamImpl searchParamImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("97339dcc", new Object[]{this, searchParamImpl});
        }
        Map<String, String> buildSearchParams = super.buildSearchParams(searchParamImpl);
        String str = buildSearchParams.get(noa.KEY_TAG_SEARCH_KEYWORD);
        if (!TextUtils.isEmpty(str)) {
            buildSearchParams.put("q", str);
        }
        Map<String, String> map = this.l;
        if (map != null) {
            buildSearchParams.putAll(map);
        }
        return buildSearchParams;
    }

    @Override // com.taobao.search.sf.datasource.c
    public void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, map});
            return;
        }
        super.c(map);
        i(map);
        map.put("newSortBar", String.valueOf(r.ci()));
        String a2 = com.taobao.search.common.util.a.a().a(getTab());
        if (!TextUtils.isEmpty(a2)) {
            map.put("behavior", a2);
        }
        if (!T()) {
            map.put(noa.KEY_ACTIVE_BD, "1");
        }
        nnd.b();
        map.put(noa.KEY_CAN_P4P_VIDEO_PLAY, String.valueOf(nnd.a()));
        a(map);
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (commonSearchResult != null) {
            map.put(k.a.PARAM_KEY_FIRST_RN, commonSearchResult.getMainInfo().rn);
        }
        if (F().getCurrentPreposeFilterBean(getTab()) != null) {
            z = true;
        }
        map.put("hasPreposeFilter", String.valueOf(z));
        f(map);
        try {
            g(map);
        } catch (Throwable unused) {
        }
        map.put("nsNative", String.valueOf(true));
        map.putAll(this.p);
    }

    private void i(Map<String, String> map) {
        Map<String, String> params;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9750c515", new Object[]{this, map});
            return;
        }
        String str = map.get("tab");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = map.get("appId");
        HashMap<String, String> b = nty.INSTANCE.b(str);
        SearchApiModel a2 = nty.INSTANCE.a(str);
        if (b != null && !b.isEmpty()) {
            map.putAll(b);
        } else if (a2 != null && (params = a2.getParams()) != null) {
            map.putAll(params);
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put("appId", str2);
    }

    private void f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e06b41f8", new Object[]{this, map});
            return;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (commonSearchResult == null) {
            return;
        }
        map.put("max_index", String.valueOf(commonSearchResult.getCellsCount() - 1));
        int cellsCount = commonSearchResult.getCellsCount() - 1;
        while (true) {
            if (cellsCount < 0) {
                cellsCount = -1;
                break;
            }
            BaseCellBean cell = commonSearchResult.getCell(cellsCount);
            if (cell.isP4p && !cell.isDynamicLandP4p) {
                break;
            }
            cellsCount--;
        }
        map.put("last_p4p_index", String.valueOf(cellsCount));
    }

    private void g(Map<String, String> map) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80d1857", new Object[]{this, map});
        } else if (!r.as() || !com.taobao.search.common.util.b.c().a()) {
        } else {
            String paramValue = getParamValue("tab");
            if (!z() && !TextUtils.isEmpty(paramValue) && !TextUtils.equals(paramValue, "all")) {
                return;
            }
            int aM = r.aM();
            String paramValue2 = getParamValue("bxConfigInvokeId");
            String paramValue3 = getParamValue("bxConfigBizId");
            String paramValue4 = getParamValue("bxConfigCurScene");
            if (TextUtils.isEmpty(paramValue3) || TextUtils.isEmpty(paramValue2)) {
                a2 = com.taobao.search.common.util.b.c().a(Integer.valueOf(aM));
            } else {
                a2 = com.taobao.search.common.util.b.c().a(paramValue3, paramValue2, paramValue4, Integer.valueOf(aM));
            }
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            map.put("bxFeature", a2);
        }
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    public boolean doNextPageSearch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("eb6afbe0", new Object[]{this})).booleanValue() : super.doNextPageSearch();
    }

    @Override // com.taobao.search.sf.datasource.c
    public CommonSearchResult c(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return (CommonSearchResult) ipChange.ipc$dispatch("7e3d3f09", new Object[]{this, new Boolean(z)});
        }
        CommonSearchResult c = super.c(z);
        c.newSearchNative = true;
        c.guideSearchNative = this.c;
        String c2 = c("m");
        String c3 = c("channelSrp");
        if (TextUtils.isEmpty(c2) && TextUtils.isEmpty(c3)) {
            z2 = true;
        }
        c.mainSearch = z2;
        return c;
    }

    @Override // com.taobao.android.meta.data.b, com.taobao.android.searchbaseframe.datasource.a
    public void onPreSearchOfParams(a.C0571a c0571a, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa53f156", new Object[]{this, c0571a, map});
            return;
        }
        super.onPreSearchOfParams(c0571a, map);
        if (c().a().c()) {
            UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("SearchClientExposeFilter");
            uTCustomHitBuilder.setEventPage("tbsearch");
            uTCustomHitBuilder.setProperty("page", map.get("page"));
            uTCustomHitBuilder.setProperty(k.a.PARAM_KEY_FIRST_RN, map.get(k.a.PARAM_KEY_FIRST_RN));
            uTCustomHitBuilder.setProperty("itemIds", map.get("itemIds"));
            uTCustomHitBuilder.setProperty(noa.KEY_ITEM_S, map.get(noa.KEY_ITEM_S));
            uTCustomHitBuilder.setProperty(noa.KEY_P4P_IDS, map.get(noa.KEY_P4P_IDS));
            uTCustomHitBuilder.setProperty(noa.KEY_P4P_S, map.get(noa.KEY_P4P_S));
            UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
        }
        a(a(c0571a), map);
    }

    private boolean a(a.C0571a c0571a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef24b45b", new Object[]{this, c0571a})).booleanValue();
        }
        if (c0571a instanceof com.taobao.android.meta.data.e) {
            return ((com.taobao.android.meta.data.e) c0571a).b();
        }
        return c0571a.f14968a;
    }

    private void a(boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d794299", new Object[]{this, new Boolean(z), map});
        } else if (map != null && !map.isEmpty()) {
            for (String str : new HashSet(map.keySet())) {
                if (!TextUtils.isEmpty(str) && str.startsWith(noa.PAGE_PROTECTED_PARAM_PREFIX) && 3 < str.length()) {
                    String substring = str.substring(3);
                    if (!TextUtils.isEmpty(substring)) {
                        String remove = map.remove(str);
                        if (!TextUtils.isEmpty(remove) && !z) {
                            map.put(substring, remove);
                        }
                    }
                }
            }
        }
    }

    public int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : this.e;
    }

    public int k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue() : this.f;
    }

    public void a(Map<String, String> map) {
        int i;
        int i2;
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) getTotalSearchResult();
        if (commonSearchResult == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sb5 = new StringBuilder();
        int i3 = this.k;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i3 < commonSearchResult.getCellsCount()) {
            BaseCellBean cell = commonSearchResult.getCell(i3);
            CommonSearchResult commonSearchResult2 = commonSearchResult;
            if (TextUtils.equals(cell.cardType, "item")) {
                if (cell.isP4p) {
                    sb4.append("p,");
                    sb2.append(cell.itemId);
                    sb2.append(',');
                    i4++;
                    if (cell.isDynamicLandP4p) {
                        sb3.append(cell.itemId);
                        sb3.append(',');
                        i6++;
                    }
                } else {
                    sb4.append("m,");
                    sb.append(cell.itemId);
                    sb.append(',');
                    i5++;
                }
            } else if (TextUtils.equals(cell.cardType, "multi_item")) {
                if (cell.curItemIds != null) {
                    String[] strArr2 = cell.curItemIds;
                    int length = strArr2.length;
                    i2 = i5;
                    int i7 = 0;
                    while (i7 < length) {
                        int i8 = length;
                        String str = strArr2[i7];
                        sb4.append("m,");
                        sb.append(str);
                        sb.append(',');
                        i2++;
                        i7++;
                        length = i8;
                    }
                } else {
                    i2 = i5;
                }
                if (cell.curP4pIds != null) {
                    for (String str2 : cell.curP4pIds) {
                        sb4.append("p,");
                        sb2.append(str2);
                        sb2.append(',');
                        i4++;
                    }
                }
                i5 = i2;
            } else if (!TextUtils.isEmpty(cell.cardType) && !TextUtils.isEmpty(cell.bizItemId)) {
                sb5.append(cell.cardType);
                sb5.append(":");
                sb5.append(cell.bizItemId);
                sb5.append(",");
            }
            i3++;
            commonSearchResult = commonSearchResult2;
        }
        this.i = i4;
        this.h = i5;
        this.j = i6;
        if (sb.length() > 0) {
            i = 1;
            sb.deleteCharAt(sb.length() - 1);
        } else {
            i = 1;
        }
        if (sb2.length() > 0) {
            sb2.deleteCharAt(sb2.length() - i);
        }
        if (sb3.length() > 0) {
            sb3.deleteCharAt(sb3.length() - i);
        }
        if (sb4.length() > 0) {
            sb4.deleteCharAt(sb4.length() - i);
        }
        if (sb5.length() > 0) {
            sb5.deleteCharAt(sb5.length() - i);
        }
        map.put(noa.KEY_ITEM_S, String.valueOf(this.e + i5));
        map.put(noa.KEY_P4P_S, String.valueOf(this.f + i4));
        map.put(noa.KEY_DYNAMIC_P4P_S, String.valueOf(this.g + i6));
        map.put("itemIds", sb.toString());
        map.put(noa.KEY_P4P_IDS, sb2.toString());
        map.put(noa.KEY_DYNAMIC_P4P_IDS, sb3.toString());
        map.put(noa.KEY_EXPOSE_TYPES, sb4.toString());
        if (sb5.length() <= 0) {
            return;
        }
        map.put(noa.KEY_CONTENT_IDS, sb5.toString());
    }

    @Override // com.taobao.search.sf.datasource.c
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        super.q();
        h();
        this.d.h();
        clearParam("recedItems");
        this.p.clear();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.j = 0;
        this.h = 0;
        this.i = 0;
    }

    private void a(CommonSearchResult commonSearchResult, CommonSearchResult commonSearchResult2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10fcaa22", new Object[]{this, commonSearchResult, commonSearchResult2});
            return;
        }
        HashSet hashSet = new HashSet();
        ArrayList<Map> arrayList = new ArrayList<>();
        Iterator<BaseCellBean> it = commonSearchResult2.getCells().iterator();
        while (true) {
            Map map = null;
            if (!it.hasNext()) {
                break;
            }
            BaseCellBean next = it.next();
            if (TextUtils.equals(next.cardType, "item")) {
                if (next instanceof SFAuctionBaseCellBean) {
                    map = ((SFAuctionBaseCellBean) next).auctionBaseBean.jarvisData;
                } else if (next instanceof MuiseCellBean) {
                    JSONObject b = com.taobao.android.searchbaseframe.util.a.b(((MuiseCellBean) next).mMuiseBean.model, "jarvisData");
                    map = new HashMap();
                    if (b != null) {
                        for (Map.Entry<String, Object> entry : b.entrySet()) {
                            map.put(entry.getKey(), entry.getValue().toString());
                        }
                    }
                } else if (next instanceof M3CellBean) {
                    map = ((M3CellBean) next).getAuctionBean().jarvisData;
                }
                if (map != null && !map.isEmpty()) {
                    hashSet.addAll(map.keySet());
                    arrayList.add(map);
                }
            }
        }
        hashSet.remove(aw.PARAM_EXTEND);
        com.taobao.android.jarviswe.tracker.c.a().a("dc_mainse_item_feature", new ArrayList<>(hashSet), arrayList, null);
        if (imp.a().c()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keys", JSON.toJSON(hashSet));
            jSONObject.put("data", JSON.toJSON(arrayList));
            com.taobao.android.searchbaseframe.util.k.a("[XSearchJarvis]", "写JarvisItemFeature", jSONObject);
        }
        if (commonSearchResult2.jarvisFeature == null || commonSearchResult2.jarvisFeature.isEmpty()) {
            return;
        }
        ArrayList<String> arrayList2 = new ArrayList<>(commonSearchResult2.jarvisFeature.keySet());
        ArrayList<Map> arrayList3 = new ArrayList<>();
        arrayList3.add(commonSearchResult2.jarvisFeature);
        com.taobao.android.jarviswe.tracker.c.a().a("dc_mainse_query_feature", arrayList2, arrayList3, null);
        if (!imp.a().c()) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("keys", JSON.toJSON(arrayList2));
        jSONObject2.put("data", JSON.toJSON(arrayList3));
        com.taobao.android.searchbaseframe.util.k.a("[XSearchJarvis]", "写JarvisQueryFeature", jSONObject2);
    }

    public void aB_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("812c8a05", new Object[]{this});
        } else {
            com.taobao.search.jarvis.c.a(this);
        }
    }

    @Override // com.taobao.search.sf.datasource.c
    public nwh L() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nwh) ipChange.ipc$dispatch("6d75e074", new Object[]{this}) : this.q;
    }

    @Override // tb.nsn
    public JSONArray aC_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("f8da631a", new Object[]{this});
        }
        JSONArray jSONArray = this.o;
        this.o = null;
        return jSONArray;
    }
}
