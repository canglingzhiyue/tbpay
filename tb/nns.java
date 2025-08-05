package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.datasource.param.SearchParamImpl;
import com.taobao.android.searchbaseframe.datasource.result.SearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.util.a;
import com.taobao.android.searchbaseframe.util.e;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.browser.utils.i;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.datasource.c;
import com.taobao.search.sf.j;
import com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean;
import com.taobao.taolive.room.utils.aw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.q;
import tb.isv;

/* loaded from: classes7.dex */
public final class nns extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f31598a;
    private final HashMap<String, BaseCellBean> b;
    private JSONObject c;
    private final nsp d;

    static {
        kge.a(-1122981215);
    }

    public static /* synthetic */ Object ipc$super(nns nnsVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 169827238) {
            super.onPostSearch(((Boolean) objArr[0]).booleanValue(), (SearchResult) objArr[1], (SearchResult) objArr[2]);
            return null;
        } else if (hashCode != 1083699496) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.doNewSearch());
        }
    }

    @Override // com.taobao.search.sf.datasource.c
    public e<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("3af765d3", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.search.sf.datasource.c
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nns(imn core, nsp mScopeDatasource) {
        super(core);
        q.c(core, "core");
        q.c(mScopeDatasource, "mScopeDatasource");
        this.d = mScopeDatasource;
        this.b = new HashMap<>();
        this.d.subscribe(this);
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    public /* synthetic */ void onPostSearch(boolean z, SearchResult searchResult, SearchResult searchResult2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f5ba6", new Object[]{this, new Boolean(z), searchResult, searchResult2});
        } else {
            a(z, (CommonSearchResult) searchResult, (CommonSearchResult) searchResult2);
        }
    }

    @Override // com.taobao.search.sf.datasource.c, com.taobao.android.meta.data.b, com.taobao.android.searchbaseframe.datasource.a
    public Map<String, String> buildSearchParams(SearchParamImpl param) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("97339dcc", new Object[]{this, param});
        }
        q.c(param, "param");
        Map<String, String> params = this.d.H();
        q.a((Object) params, "params");
        a(params);
        JSONObject jSONObject = this.c;
        if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                params.put(entry.getKey(), entry.getValue().toString());
            }
        }
        this.c = null;
        if (imp.a().c()) {
            HashMap<String, String> hashMap = new HashMap<>(params);
            a(hashMap);
            k.a("SearchJarvisRerank", "fetch request:\n" + JSON.toJSONString((Object) hashMap, true));
        }
        return params;
    }

    private final void b(CommonSearchResult commonSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe0c686", new Object[]{this, commonSearchResult});
            return;
        }
        HashSet hashSet = new HashSet();
        ArrayList<Map<?, ?>> arrayList = new ArrayList<>();
        List<BaseCellBean> cells = commonSearchResult.getCells();
        q.a((Object) cells, "lastResult.cells");
        a(cells, hashSet, arrayList);
        List<BaseCellBean> bufferCells = commonSearchResult.getBufferCells();
        q.a((Object) bufferCells, "lastResult.bufferCells");
        a(bufferCells, hashSet, arrayList);
        List<BaseCellBean> replaceCells = commonSearchResult.getReplaceCells();
        q.a((Object) replaceCells, "lastResult.replaceCells");
        a(replaceCells, hashSet, arrayList);
        com.taobao.android.jarviswe.tracker.c.a().a("dc_mainse_item_feature", new ArrayList<>(hashSet), arrayList, null);
        if (imp.a().c()) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "keys", (String) JSON.toJSON(hashSet));
            jSONObject2.put((JSONObject) "data", (String) JSON.toJSON(arrayList));
            k.a("[XSearchJarvis]", "写JarvisItemFeature", jSONObject);
        }
        if (commonSearchResult.jarvisFeature == null) {
            return;
        }
        Map<String, String> map = commonSearchResult.jarvisFeature;
        q.a((Object) map, "lastResult.jarvisFeature");
        if (!(!map.isEmpty())) {
            return;
        }
        ArrayList<String> arrayList2 = new ArrayList<>(commonSearchResult.jarvisFeature.keySet());
        ArrayList<Map> arrayList3 = new ArrayList<>();
        arrayList3.add(commonSearchResult.jarvisFeature);
        com.taobao.android.jarviswe.tracker.c.a().a("dc_mainse_query_feature", arrayList2, arrayList3, null);
        if (!imp.a().c()) {
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = jSONObject3;
        jSONObject4.put((JSONObject) "keys", (String) JSON.toJSON(arrayList2));
        jSONObject4.put((JSONObject) "data", (String) JSON.toJSON(arrayList3));
        k.a("[XSearchJarvis]", "写JarvisQueryFeature", jSONObject3);
    }

    private final void a(List<? extends BaseCellBean> list, Set<String> set, ArrayList<Map<?, ?>> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5c5a924", new Object[]{this, list, set, arrayList});
            return;
        }
        for (BaseCellBean baseCellBean : list) {
            if (TextUtils.equals(baseCellBean.cardType, "item")) {
                JSONObject jSONObject = null;
                if (baseCellBean instanceof SFAuctionBaseCellBean) {
                    jSONObject = ((SFAuctionBaseCellBean) baseCellBean).auctionBaseBean.jarvisData;
                } else if (baseCellBean instanceof MuiseCellBean) {
                    JSONObject jSONObject2 = ((MuiseCellBean) baseCellBean).mMuiseBean.model;
                    q.a((Object) jSONObject2, "cell.mMuiseBean.model");
                    jSONObject = a.b(jSONObject2, "jarvisData");
                } else if (baseCellBean instanceof M3CellBean) {
                    jSONObject = ((M3CellBean) baseCellBean).getAuctionBean().jarvisData;
                }
                if (jSONObject != null && !jSONObject.isEmpty()) {
                    set.addAll(jSONObject.keySet());
                    arrayList.add(jSONObject);
                }
            }
        }
    }

    private final void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        map.put("page", String.valueOf(getNextPage()));
        map.put("n", String.valueOf(getPageSize()));
    }

    @Override // com.taobao.android.meta.data.b, com.taobao.android.searchbaseframe.datasource.a
    /* renamed from: onCreateRequestAdapter */
    public ism<CommonSearchResult> mo1220onCreateRequestAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ism) ipChange.ipc$dispatch("884e42c1", new Object[]{this});
        }
        imn imnVar = j.f19452a;
        q.a((Object) imnVar, "NxCore.CORE");
        return new nnt(imnVar);
    }

    @Override // com.taobao.search.sf.datasource.c, com.taobao.android.meta.data.b, com.taobao.android.searchbaseframe.datasource.a
    public boolean doNewSearch() {
        String str;
        ResultMainInfoBean mainInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4097f128", new Object[]{this})).booleanValue();
        }
        this.b.clear();
        if (this.d.isTaskRunning()) {
            return false;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) this.d.getLastSearchResult();
        if (commonSearchResult == null || (mainInfo = commonSearchResult.getMainInfo()) == null || (str = mainInfo.rn) == null) {
            str = "";
        }
        this.f31598a = str;
        return super.doNewSearch();
    }

    public void a(boolean z, CommonSearchResult totalResult, CommonSearchResult lastResult) {
        ResultMainInfoBean mainInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93659d26", new Object[]{this, new Boolean(z), totalResult, lastResult});
            return;
        }
        q.c(totalResult, "totalResult");
        q.c(lastResult, "lastResult");
        super.onPostSearch(z, totalResult, lastResult);
        b(lastResult);
        if (this.d.isTaskRunning()) {
            e();
            return;
        }
        CommonSearchResult commonSearchResult = (CommonSearchResult) this.d.getLastSearchResult();
        String str = (commonSearchResult == null || (mainInfo = commonSearchResult.getMainInfo()) == null) ? null : mainInfo.rn;
        String str2 = this.f31598a;
        if (str2 == null) {
            q.b("mScopeDataSrourceVersion");
        }
        if (!TextUtils.equals(str, str2)) {
            k.a("SearchJarvisRerank", "扩召回结果被丢弃，因为请求中完成了翻页");
            e();
            return;
        }
        c(lastResult);
    }

    private final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        setTotalResult(null);
        setLastResult(null);
        this.b.clear();
    }

    public final void onEventMainThread(isv.a after) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0bf04c", new Object[]{this, after});
            return;
        }
        q.c(after, "after");
        e();
    }

    private final void c(CommonSearchResult commonSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6574cf87", new Object[]{this, commonSearchResult});
            return;
        }
        for (BaseCellBean baseCellBean : commonSearchResult.getCells()) {
            if (baseCellBean instanceof SFAuctionBaseCellBean) {
                String str = ((SFAuctionBaseCellBean) baseCellBean).auctionBaseBean.itemId;
                q.a((Object) str, "cell.auctionBaseBean.itemId");
                this.b.put(str, baseCellBean);
            } else if (baseCellBean instanceof M3CellBean) {
                String str2 = baseCellBean.itemId;
                q.a((Object) str2, "cell.itemId");
                this.b.put(str2, baseCellBean);
            }
        }
    }

    public final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.c = jSONObject;
        }
    }

    private final void a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
            return;
        }
        hashMap.remove(noa.KEY_GLOBAL_LBS);
        hashMap.remove("LBS");
        hashMap.remove(i.URL_REFERER_ORIGIN);
        hashMap.remove("_navigation_params");
        hashMap.remove("referrer");
        hashMap.remove("scm");
        hashMap.remove(aw.PARAM_UT_PARAMS);
        hashMap.remove("imei");
        hashMap.remove("imsi");
        hashMap.remove(noa.KEY_HOMEPAGE_VERSION);
        hashMap.remove("hasPreposeFilter");
        hashMap.remove(MspDBHelper.BizEntry.COLUMN_NAME_DEVICE);
        hashMap.remove("brand");
        hashMap.remove("apptimestamp");
        hashMap.remove("latitude");
        hashMap.remove("longitude");
        hashMap.remove("utd_id");
        hashMap.remove("sugg");
        hashMap.remove("rainbow");
        hashMap.remove("schemaType");
        hashMap.remove("searchDoorFrom");
        hashMap.remove("search_action");
        hashMap.remove("ttid");
        hashMap.remove("network");
        hashMap.remove(noa.KEY_COUNTRY_NUM);
        hashMap.remove(noa.KEY_CITY_CODE);
        hashMap.remove("from");
    }
}
