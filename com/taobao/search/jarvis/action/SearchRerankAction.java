package com.taobao.search.jarvis.action;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.util.ArrayMap;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.login4android.api.Login;
import com.taobao.search.common.util.k;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.mmd.util.e;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean;
import com.taobao.tao.util.Constants;
import com.taobao.taolive.room.utils.aw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.collections.p;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.gse;
import tb.imp;
import tb.iru;
import tb.jxs;
import tb.jxt;
import tb.jyh;
import tb.kge;
import tb.nns;
import tb.nnv;
import tb.noa;

/* loaded from: classes7.dex */
public final class SearchRerankAction implements jxt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String INPUT_EXTEND_SPLIT = "_#_";

    static {
        kge.a(-84707616);
        kge.a(-294247333);
        Companion = new a(null);
    }

    public static final /* synthetic */ void access$fillUnexposedMap(SearchRerankAction searchRerankAction, HashMap hashMap, HashMap hashMap2, jxs jxsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef0ebd39", new Object[]{searchRerankAction, hashMap, hashMap2, jxsVar});
        } else {
            searchRerankAction.fillUnexposedMap(hashMap, hashMap2, jxsVar);
        }
    }

    public static final /* synthetic */ ArrayList access$getItemIdList(SearchRerankAction searchRerankAction, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("e5ad373c", new Object[]{searchRerankAction, jSONObject, str}) : searchRerankAction.getItemIdList(jSONObject, str);
    }

    public static final /* synthetic */ ArrayList access$getRerankList(SearchRerankAction searchRerankAction, ArrayList arrayList, Map map, Map map2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("87c8a51b", new Object[]{searchRerankAction, arrayList, map, map2}) : searchRerankAction.getRerankList(arrayList, map, map2);
    }

    @Override // tb.jxt
    public void processAction(jxs jarvis, JSONObject actionObject, String str) {
        String str2;
        ResultMainInfoBean mainInfo;
        ResultMainInfoBean mainInfo2;
        ResultMainInfoBean mainInfo3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9695ac63", new Object[]{this, jarvis, actionObject, str});
            return;
        }
        q.c(jarvis, "jarvis");
        q.c(actionObject, "actionObject");
        JSONObject b2 = com.taobao.android.searchbaseframe.util.a.b(actionObject, "params");
        Map<String, Object> input = getInput(jarvis, b2);
        if (imp.a().c()) {
            k.a("[XSearchJarvis]", "rerank input data:", new JSONObject(input));
        }
        iru b3 = jarvis.b();
        q.a((Object) b3, "jarvis.widgetModelAdapter");
        com.taobao.android.searchbaseframe.datasource.impl.a d = b3.d();
        q.a((Object) d, "jarvis.widgetModelAdapter.scopeDatasource");
        String str3 = null;
        if (d.isTaskRunning()) {
            Companion.a(jarvis, null);
            return;
        }
        iru b4 = jarvis.b();
        q.a((Object) b4, "jarvis.widgetModelAdapter");
        com.taobao.android.searchbaseframe.datasource.impl.a d2 = b4.d();
        q.a((Object) d2, "jarvis.widgetModelAdapter.scopeDatasource");
        BaseSearchResult baseSearchResult = (BaseSearchResult) d2.getTotalSearchResult();
        if (baseSearchResult == null || (mainInfo3 = baseSearchResult.getMainInfo()) == null || (str2 = mainInfo3.rn) == null) {
            str2 = "";
        }
        String string = b2 != null ? b2.getString("modelPage") : null;
        if (StringUtils.isEmpty(string)) {
            string = "tb_search_srp";
        }
        String string2 = b2 != null ? b2.getString("modelEvent") : null;
        if (StringUtils.isEmpty(string2)) {
            string2 = "srp_rerank";
        }
        com.taobao.android.jarviswe.a.a().a(string, string2, input, new b(jarvis, str2));
        HashMap hashMap = new HashMap();
        iru b5 = jarvis.b();
        q.a((Object) b5, "jarvis.widgetModelAdapter");
        com.taobao.android.searchbaseframe.datasource.impl.a d3 = b5.d();
        q.a((Object) d3, "jarvis.widgetModelAdapter.scopeDatasource");
        HashMap hashMap2 = hashMap;
        BaseSearchResult baseSearchResult2 = (BaseSearchResult) d3.getTotalSearchResult();
        hashMap2.put(k.a.PARAM_KEY_FIRST_RN, (baseSearchResult2 == null || (mainInfo2 = baseSearchResult2.getMainInfo()) == null) ? null : mainInfo2.rn);
        BaseSearchResult baseSearchResult3 = (BaseSearchResult) d3.getTotalSearchResult();
        if (baseSearchResult3 != null && (mainInfo = baseSearchResult3.getMainInfo()) != null) {
            str3 = mainInfo.abtest;
        }
        hashMap2.put("wlsort", str3);
        hashMap2.put("src", StringUtils.equals(d3.getParamValue("m"), noa.VALUE_MODULE_INSHOP) ? "inshop" : "mainse");
        e.c("SearchEdgeCompute", "SearchRerankCall", hashMap2);
    }

    /* loaded from: classes7.dex */
    public static final class b implements gse {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ jxs b;
        public final /* synthetic */ String c;

        public b(jxs jxsVar, String str) {
            this.b = jxsVar;
            this.c = str;
        }

        @Override // tb.gse
        public void notify(String str, String str2) {
            ResultMainInfoBean mainInfo;
            ResultMainInfoBean mainInfo2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("12981c64", new Object[]{this, str, str2});
            } else if (StringUtils.isEmpty(str2)) {
            } else {
                JSONObject parseObject = JSON.parseObject(str2);
                JSONObject b = com.taobao.android.searchbaseframe.util.a.b(parseObject, "results");
                if (imp.a().c()) {
                    com.taobao.android.searchbaseframe.util.k.a("[XSearchJarvis]", "rerank callback result:\n", parseObject);
                }
                JSONObject b2 = com.taobao.android.searchbaseframe.util.a.b(b, "rerank_data");
                ArrayMap arrayMap = new ArrayMap();
                iru b3 = this.b.b();
                q.a((Object) b3, "jarvis.widgetModelAdapter");
                com.taobao.android.searchbaseframe.datasource.impl.a d = b3.d();
                q.a((Object) d, "jarvis.widgetModelAdapter.scopeDatasource");
                ArrayMap arrayMap2 = arrayMap;
                String str3 = null;
                arrayMap2.put("uniq_id", b != null ? b.getString("uniq_id") : null);
                arrayMap2.put("src", StringUtils.equals(d.getParamValue("m"), noa.VALUE_MODULE_INSHOP) ? "inshop" : "mainse");
                BaseSearchResult baseSearchResult = (BaseSearchResult) d.getTotalSearchResult();
                arrayMap2.put("wlsort", (baseSearchResult == null || (mainInfo2 = baseSearchResult.getMainInfo()) == null) ? null : mainInfo2.abtest);
                if (b2 == null || b2.isEmpty()) {
                    arrayMap2.put("rerank_data_v", "0");
                    e.c("SearchEdgeCompute", "SearchRerankSuccessCallback", arrayMap2);
                    return;
                }
                arrayMap2.put("rerank_data_v", "1");
                e.c("SearchEdgeCompute", "SearchRerankSuccessCallback", arrayMap2);
                iru b4 = this.b.b();
                q.a((Object) b4, "jarvis.widgetModelAdapter");
                com.taobao.android.searchbaseframe.datasource.impl.a d2 = b4.d();
                q.a((Object) d2, "jarvis.widgetModelAdapter.scopeDatasource");
                BaseSearchResult baseSearchResult2 = (BaseSearchResult) d2.getTotalSearchResult();
                if (baseSearchResult2 != null && (mainInfo = baseSearchResult2.getMainInfo()) != null) {
                    str3 = mainInfo.rn;
                }
                if (d2.isTaskRunning()) {
                    SearchRerankAction.Companion.a(this.b, b);
                } else if (!StringUtils.equals(str3, this.c)) {
                    SearchRerankAction.Companion.b(this.b, b);
                } else {
                    ArrayList access$getItemIdList = SearchRerankAction.access$getItemIdList(SearchRerankAction.this, b2, "m");
                    ArrayList access$getItemIdList2 = SearchRerankAction.access$getItemIdList(SearchRerankAction.this, b2, "p");
                    jyh buffer = this.b.h();
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    SearchRerankAction.access$fillUnexposedMap(SearchRerankAction.this, hashMap, hashMap2, this.b);
                    SearchRerankAction searchRerankAction = SearchRerankAction.this;
                    q.a((Object) buffer, "buffer");
                    Map<String, BaseCellBean> a2 = buffer.a();
                    q.a((Object) a2, "buffer.itemBuffer");
                    ArrayList access$getRerankList = SearchRerankAction.access$getRerankList(searchRerankAction, access$getItemIdList, a2, hashMap);
                    SearchRerankAction searchRerankAction2 = SearchRerankAction.this;
                    Map<String, BaseCellBean> b5 = buffer.b();
                    q.a((Object) b5, "buffer.p4pBuffer");
                    ArrayList access$getRerankList2 = SearchRerankAction.access$getRerankList(searchRerankAction2, access$getItemIdList2, b5, hashMap2);
                    JSONObject b6 = com.taobao.android.searchbaseframe.util.a.b(b, "clear_buffer");
                    if (b6 != null) {
                        if (b6.getBooleanValue("m")) {
                            com.taobao.android.searchbaseframe.util.k.d("[XSearchJarvis]", "清空自然结果buffer", new Object[0]);
                            buffer.d();
                        }
                        if (b6.getBooleanValue("p")) {
                            com.taobao.android.searchbaseframe.util.k.d("[XSearchJarvis]", "清空广告buffer", new Object[0]);
                            buffer.e();
                        }
                        if (b6.getBooleanValue(com.taobao.android.msoa.c.TAG)) {
                            com.taobao.android.searchbaseframe.util.k.d("[XSearchJarvis]", "清空内容buffer", new Object[0]);
                            buffer.f();
                        }
                    }
                    if (!(!access$getRerankList.isEmpty()) && !(!access$getRerankList2.isEmpty())) {
                        return;
                    }
                    new Handler(Looper.getMainLooper()).post(new c(new com.taobao.search.jarvis.action.b(b, this.c, access$getRerankList, access$getRerankList2, this.b)));
                }
            }
        }

        @Override // tb.gse
        public void errorReport(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("28fdfd81", new Object[]{this, str, str2, str3});
                return;
            }
            SearchRerankAction.Companion.a(this.b, str2, str3);
            com.taobao.android.searchbaseframe.util.k.f("[XSearchJarvis]", "rerank模型执行失败， " + str2 + " : " + str3, new Object[0]);
        }
    }

    private final void fillUnexposedMap(HashMap<String, BaseCellBean> hashMap, HashMap<String, BaseCellBean> hashMap2, jxs jxsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99a9b6a", new Object[]{this, hashMap, hashMap2, jxsVar});
            return;
        }
        hashMap.clear();
        hashMap2.clear();
        int f = jxsVar.f();
        iru b2 = jxsVar.b();
        q.a((Object) b2, "jarvis.widgetModelAdapter");
        com.taobao.android.searchbaseframe.datasource.impl.a d = b2.d();
        q.a((Object) d, "jarvis.widgetModelAdapter.scopeDatasource");
        BaseSearchResult baseSearchResult = (BaseSearchResult) d.getTotalSearchResult();
        if (baseSearchResult == null) {
            return;
        }
        int cellsCount = baseSearchResult.getCellsCount();
        for (int i = f + 1; i < cellsCount; i++) {
            BaseCellBean baseCellBean = baseSearchResult.getCell(i);
            if (StringUtils.equals(baseCellBean.cardType, "item") && !baseCellBean.isExposed) {
                if (baseCellBean.isP4p) {
                    String str = baseCellBean.itemId;
                    q.a((Object) str, "baseCellBean.itemId");
                    q.a((Object) baseCellBean, "baseCellBean");
                    hashMap2.put(str, baseCellBean);
                } else {
                    String str2 = baseCellBean.itemId;
                    q.a((Object) str2, "baseCellBean.itemId");
                    q.a((Object) baseCellBean, "baseCellBean");
                    hashMap.put(str2, baseCellBean);
                }
            }
        }
    }

    private final ArrayList<String> getItemIdList(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("ab6acaab", new Object[]{this, jSONObject, str});
        }
        ArrayList<String> arrayList = new ArrayList<>();
        JSONArray a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, str);
        if (a2 != null && !a2.isEmpty()) {
            int size = a2.size();
            for (int i = 0; i < size; i++) {
                Object obj = a2.get(i);
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str2 = (String) obj;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    private final Map<String, Object> getInput(jxs jxsVar, JSONObject jSONObject) {
        Map<String, String> map;
        CommonSearchResult commonSearchResult;
        ResultMainInfoBean mainInfo;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("48479f5f", new Object[]{this, jxsVar, jSONObject});
        }
        iru b2 = jxsVar.b();
        if (b2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.CommonModelAdapter");
        }
        com.taobao.search.sf.a aVar = (com.taobao.search.sf.a) b2;
        com.taobao.search.sf.datasource.c d = aVar.d();
        q.a((Object) d, "widgetModelAdapter.scopeDatasource");
        nns o = aVar.o();
        CommonSearchResult commonSearchResult2 = (CommonSearchResult) d.getLastSearchResult();
        CommonSearchResult commonSearchResult3 = (CommonSearchResult) d.getTotalSearchResult();
        BaseCellBean lastVisibleItem = getLastVisibleItem(jxsVar, commonSearchResult3);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = hashMap;
        hashMap2.put("user_id", Login.getUserId());
        hashMap2.put("tab", d.getTab());
        hashMap2.put("sort", d.s());
        hashMap2.put("os", "android");
        hashMap2.put("se_keyword", d.getKeyword());
        hashMap2.put(Constants.SEARCH_FROM, d.getParamValue("from"));
        hashMap2.put("buffer_data", nnv.INSTANCE.b(jxsVar));
        hashMap2.put("sversion", noa.SERVER_VERSION_VALUE);
        ListStyle uIListStyle = d.getUIListStyle();
        q.a((Object) uIListStyle, "scopeDataSource.uiListStyle");
        hashMap2.put("style", uIListStyle.getValue());
        hashMap2.put("context_feature", jxsVar.d());
        hashMap2.put("fetch_rn", (o == null || (commonSearchResult = (CommonSearchResult) o.getTotalSearchResult()) == null || (mainInfo = commonSearchResult.getMainInfo()) == null) ? null : mainInfo.rn);
        com.taobao.search.jarvis.bean.b a2 = nnv.INSTANCE.a(jxsVar);
        hashMap2.put("expose_ids", a2.a());
        hashMap2.put("expose_ts", a2.b());
        hashMap2.put("unexpose_ids", a2.c());
        hashMap2.put("unexpose_ts", a2.d());
        hashMap2.put("last_expose_ids", a2.e());
        hashMap2.put("last_expose_ts", a2.f());
        if (commonSearchResult2 != null) {
            hashMap2.put("max_page", String.valueOf(commonSearchResult2.getMainInfo().page));
        }
        if (commonSearchResult3 != null) {
            hashMap2.put(k.a.PARAM_KEY_FIRST_RN, commonSearchResult3.getMainInfo().rn);
            hashMap2.put("wlsort", commonSearchResult3.getMainInfo().abtest);
            if (commonSearchResult3.jarvisFeature != null) {
                q.a((Object) commonSearchResult3.jarvisFeature, "it.jarvisFeature");
                if (!map.isEmpty()) {
                    hashMap2.put("query_feature", JSON.toJSONString(commonSearchResult3.jarvisFeature));
                }
            }
            if (commonSearchResult3.isJarvisDataCache) {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                JSONArray jSONArray = new JSONArray();
                int min = Math.min(jxsVar.g(), commonSearchResult3.getCellsCount() - 1);
                int max = Math.max(min - 15, 0);
                if (min >= max) {
                    while (true) {
                        BaseCellBean baseCellBean = commonSearchResult3.getCells().get(min);
                        q.a((Object) baseCellBean, "baseCellBean");
                        appendClickTraceAndJarvisData(baseCellBean, sb, sb2);
                        appendWsData(baseCellBean, jSONArray);
                        if (min == max) {
                            break;
                        }
                        min--;
                    }
                }
                jyh buffer = jxsVar.h();
                q.a((Object) buffer, "buffer");
                for (BaseCellBean baseCellBean2 : buffer.a().values()) {
                    if (!jxsVar.a(baseCellBean2.itemId)) {
                        q.a((Object) baseCellBean2, "baseCellBean");
                        appendClickTraceAndJarvisData(baseCellBean2, sb, sb2);
                        appendWsData(baseCellBean2, jSONArray);
                    }
                }
                for (BaseCellBean baseCellBean3 : buffer.b().values()) {
                    if (!jxsVar.a(baseCellBean3.itemId)) {
                        q.a((Object) baseCellBean3, "baseCellBean");
                        appendClickTraceAndJarvisData(baseCellBean3, sb, sb2);
                        appendWsData(baseCellBean3, jSONArray);
                    }
                }
                if (sb.length() > 0) {
                    sb.delete(sb.length() - 3, sb.length());
                    hashMap2.put("clickTraces", sb.toString());
                }
                if (sb2.length() > 0) {
                    z = true;
                }
                if (z) {
                    sb2.delete(sb2.length() - 3, sb2.length());
                    hashMap2.put("jarvisDatas", sb2.toString());
                }
                hashMap2.put("ws_data", jSONArray.toString());
            }
        }
        jyh rankBuffer = jxsVar.h();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = jSONObject2;
        q.a((Object) rankBuffer, "rankBuffer");
        List<String> h = rankBuffer.h();
        q.a((Object) h, "rankBuffer.p4pItemFetchResult");
        jSONObject3.put((JSONObject) "p", p.a(h, ",", null, null, 0, null, null, 62, null));
        List<String> g = rankBuffer.g();
        q.a((Object) g, "rankBuffer.itemFetchResult");
        jSONObject3.put((JSONObject) "m", p.a(g, ",", null, null, 0, null, null, 62, null));
        hashMap2.put("last_fetch_list", jSONObject2.toString());
        Map<String, Object> i = jxsVar.i();
        if (i != null) {
            hashMap.putAll(i);
        } else if (lastVisibleItem != null) {
            hashMap2.put("page", Integer.valueOf(lastVisibleItem.pageNo));
            hashMap2.put("pv_pos", Integer.valueOf(lastVisibleItem.pagePos));
            hashMap2.put("pv_size", Integer.valueOf(lastVisibleItem.pageSize));
            hashMap2.put(aw.PARAM_SEARCH_KEYWORD_RN, lastVisibleItem.rn);
        }
        if (imp.a().c()) {
            hashMap2.put("is_debug", "true");
        }
        if (jSONObject != null) {
            hashMap.putAll(jSONObject);
        }
        return hashMap2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        if (r5 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
        if (r5 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
        if (r5 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void appendClickTraceAndJarvisData(com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean r5, java.lang.StringBuilder r6, java.lang.StringBuilder r7) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.search.jarvis.action.SearchRerankAction.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            if (r1 == 0) goto L1b
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r4
            r1[r2] = r5
            r5 = 2
            r1[r5] = r6
            r5 = 3
            r1[r5] = r7
            java.lang.String r5 = "c115c648"
            r0.ipc$dispatch(r5, r1)
            return
        L1b:
            java.lang.String r0 = r5.cardType
            java.lang.String r1 = "item"
            boolean r0 = kotlin.jvm.internal.q.a(r1, r0)
            r0 = r0 ^ r2
            if (r0 == 0) goto L27
            return
        L27:
            boolean r0 = r5 instanceof com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean
            java.lang.String r1 = "extend"
            java.lang.String r2 = ""
            if (r0 == 0) goto L49
            com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean r5 = (com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean) r5
            com.taobao.search.mmd.datasource.bean.AuctionBaseBean r0 = r5.auctionBaseBean
            java.lang.String r0 = r0.clickTrace
            if (r0 != 0) goto L38
            r0 = r2
        L38:
            com.taobao.search.mmd.datasource.bean.AuctionBaseBean r5 = r5.auctionBaseBean
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.jarvisData
            if (r5 == 0) goto L91
            java.lang.Object r5 = r5.get(r1)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L47
            goto L91
        L47:
            r2 = r5
            goto L91
        L49:
            boolean r0 = r5 instanceof com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean
            if (r0 == 0) goto L70
            com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean r5 = (com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean) r5
            com.taobao.android.searchbaseframe.nx3.bean.MuiseBean r0 = r5.mMuiseBean
            com.alibaba.fastjson.JSONObject r0 = r0.model
            java.lang.String r3 = "clickTrace"
            java.lang.String r0 = r0.getString(r3)
            if (r0 != 0) goto L5c
            r0 = r2
        L5c:
            com.taobao.android.searchbaseframe.nx3.bean.MuiseBean r5 = r5.mMuiseBean
            com.alibaba.fastjson.JSONObject r5 = r5.model
            java.lang.String r3 = "jarvisData"
            com.alibaba.fastjson.JSONObject r5 = com.taobao.android.searchbaseframe.util.a.b(r5, r3)
            if (r5 == 0) goto L91
            java.lang.String r5 = r5.getString(r1)
            if (r5 != 0) goto L47
            goto L91
        L70:
            boolean r0 = r5 instanceof com.taobao.search.m3.M3CellBean
            if (r0 == 0) goto L90
            com.taobao.search.m3.M3CellBean r5 = (com.taobao.search.m3.M3CellBean) r5
            com.taobao.search.mmd.datasource.bean.AuctionBaseBean r0 = r5.getAuctionBean()
            java.lang.String r0 = r0.clickTrace
            if (r0 != 0) goto L7f
            r0 = r2
        L7f:
            com.taobao.search.mmd.datasource.bean.AuctionBaseBean r5 = r5.getAuctionBean()
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.jarvisData
            if (r5 == 0) goto L91
            java.lang.Object r5 = r5.get(r1)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L47
            goto L91
        L90:
            r0 = r2
        L91:
            r6.append(r0)
            java.lang.String r5 = "_#_"
            r6.append(r5)
            r7.append(r2)
            r7.append(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.jarvis.action.SearchRerankAction.appendClickTraceAndJarvisData(com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean, java.lang.StringBuilder, java.lang.StringBuilder):void");
    }

    private final void appendWsData(BaseCellBean baseCellBean, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afb0d5a1", new Object[]{this, baseCellBean, jSONArray});
        } else if (!q.a((Object) "item", (Object) baseCellBean.cardType)) {
        } else {
            JSONObject jSONObject = null;
            if (baseCellBean instanceof SFAuctionBaseCellBean) {
                jSONObject = ((SFAuctionBaseCellBean) baseCellBean).wsData;
            } else if (baseCellBean instanceof MuiseCellBean) {
                Object obj = ((MuiseCellBean) baseCellBean).mExtraObj.get("wsData");
                if (!(obj instanceof JSONObject)) {
                    obj = null;
                }
                jSONObject = (JSONObject) obj;
            } else if (baseCellBean instanceof M3CellBean) {
                jSONObject = ((M3CellBean) baseCellBean).getWsData();
            }
            if (jSONObject == null) {
                return;
            }
            jSONArray.add(jSONObject);
        }
    }

    private final BaseCellBean getLastVisibleItem(jxs jxsVar, CommonSearchResult commonSearchResult) {
        int f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseCellBean) ipChange.ipc$dispatch("e826ce20", new Object[]{this, jxsVar, commonSearchResult});
        }
        if (commonSearchResult == null || (f = jxsVar.f()) <= 0 || f >= commonSearchResult.getCellsCount()) {
            return null;
        }
        return commonSearchResult.getCell(f);
    }

    private final ArrayList<BaseCellBean> getRerankList(ArrayList<String> arrayList, Map<String, ? extends BaseCellBean> map, Map<String, ? extends BaseCellBean> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("dbb0120a", new Object[]{this, arrayList, map, map2});
        }
        ArrayList<BaseCellBean> arrayList2 = new ArrayList<>();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            BaseCellBean baseCellBean = map.get(next);
            if (baseCellBean == null) {
                baseCellBean = map2.get(next);
            }
            if (baseCellBean != null) {
                arrayList2.add(baseCellBean);
            }
        }
        return arrayList2;
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1464093224);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final void a(jxs jarvis, String str, String str2) {
            ResultMainInfoBean mainInfo;
            ResultMainInfoBean mainInfo2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5823f367", new Object[]{this, jarvis, str, str2});
                return;
            }
            q.c(jarvis, "jarvis");
            iru b = jarvis.b();
            q.a((Object) b, "jarvis.widgetModelAdapter");
            com.taobao.android.searchbaseframe.datasource.impl.a d = b.d();
            q.a((Object) d, "jarvis.widgetModelAdapter.scopeDatasource");
            HashMap hashMap = new HashMap();
            BaseSearchResult baseSearchResult = (BaseSearchResult) d.getTotalSearchResult();
            String str3 = null;
            hashMap.put("wlsort", (baseSearchResult == null || (mainInfo2 = baseSearchResult.getMainInfo()) == null) ? null : mainInfo2.abtest);
            BaseSearchResult baseSearchResult2 = (BaseSearchResult) d.getTotalSearchResult();
            if (baseSearchResult2 != null && (mainInfo = baseSearchResult2.getMainInfo()) != null) {
                str3 = mainInfo.rn;
            }
            hashMap.put(k.a.PARAM_KEY_FIRST_RN, str3);
            hashMap.put("src", StringUtils.equals(d.getParamValue("m"), noa.VALUE_MODULE_INSHOP) ? "inshop" : "mainse");
            hashMap.put("errorCode", str);
            hashMap.put("errorMessage", str2);
            e.c("SearchEdgeCompute", "DropRerankByError", hashMap);
        }

        public final void a(jxs jarvis, JSONObject jSONObject) {
            ResultMainInfoBean mainInfo;
            ResultMainInfoBean mainInfo2;
            ResultMainInfoBean mainInfo3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a95f557d", new Object[]{this, jarvis, jSONObject});
                return;
            }
            q.c(jarvis, "jarvis");
            iru b = jarvis.b();
            q.a((Object) b, "jarvis.widgetModelAdapter");
            com.taobao.android.searchbaseframe.datasource.impl.a d = b.d();
            q.a((Object) d, "jarvis.widgetModelAdapter.scopeDatasource");
            HashMap hashMap = new HashMap();
            BaseSearchResult baseSearchResult = (BaseSearchResult) d.getTotalSearchResult();
            String str = null;
            hashMap.put("wlsort", (baseSearchResult == null || (mainInfo3 = baseSearchResult.getMainInfo()) == null) ? null : mainInfo3.abtest);
            hashMap.put("src", StringUtils.equals(d.getParamValue("m"), noa.VALUE_MODULE_INSHOP) ? "inshop" : "mainse");
            hashMap.put("uniq_id", jSONObject != null ? jSONObject.getString("uniq_id") : null);
            BaseSearchResult baseSearchResult2 = (BaseSearchResult) d.getTotalSearchResult();
            hashMap.put(k.a.PARAM_KEY_FIRST_RN, (baseSearchResult2 == null || (mainInfo2 = baseSearchResult2.getMainInfo()) == null) ? null : mainInfo2.rn);
            BaseSearchResult baseSearchResult3 = (BaseSearchResult) d.getLastSearchResult();
            if (baseSearchResult3 != null && (mainInfo = baseSearchResult3.getMainInfo()) != null) {
                str = String.valueOf(mainInfo.page);
            }
            hashMap.put("page", str);
            e.c("SearchEdgeCompute", "DropRerankByPaging", hashMap);
        }

        public final void b(jxs jarvis, JSONObject jSONObject) {
            ResultMainInfoBean mainInfo;
            ResultMainInfoBean mainInfo2;
            ResultMainInfoBean mainInfo3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("62d6e31c", new Object[]{this, jarvis, jSONObject});
                return;
            }
            q.c(jarvis, "jarvis");
            iru b = jarvis.b();
            q.a((Object) b, "jarvis.widgetModelAdapter");
            com.taobao.android.searchbaseframe.datasource.impl.a d = b.d();
            q.a((Object) d, "jarvis.widgetModelAdapter.scopeDatasource");
            HashMap hashMap = new HashMap();
            hashMap.put("src", StringUtils.equals(d.getParamValue("m"), noa.VALUE_MODULE_INSHOP) ? "inshop" : "mainse");
            BaseSearchResult baseSearchResult = (BaseSearchResult) d.getTotalSearchResult();
            String str = null;
            hashMap.put(k.a.PARAM_KEY_FIRST_RN, (baseSearchResult == null || (mainInfo3 = baseSearchResult.getMainInfo()) == null) ? null : mainInfo3.rn);
            hashMap.put("uniq_id", jSONObject != null ? jSONObject.getString("uniq_id") : null);
            BaseSearchResult baseSearchResult2 = (BaseSearchResult) d.getTotalSearchResult();
            hashMap.put("wlsort", (baseSearchResult2 == null || (mainInfo2 = baseSearchResult2.getMainInfo()) == null) ? null : mainInfo2.abtest);
            BaseSearchResult baseSearchResult3 = (BaseSearchResult) d.getLastSearchResult();
            if (baseSearchResult3 != null && (mainInfo = baseSearchResult3.getMainInfo()) != null) {
                str = String.valueOf(mainInfo.page);
            }
            hashMap.put("page", str);
            e.c("SearchEdgeCompute", "DropRerankByNewPage", hashMap);
        }

        public final void a(jxs jarvis, int i, int i2, int i3, JSONObject jSONObject) {
            ResultMainInfoBean mainInfo;
            ResultMainInfoBean mainInfo2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c8a67b00", new Object[]{this, jarvis, new Integer(i), new Integer(i2), new Integer(i3), jSONObject});
                return;
            }
            q.c(jarvis, "jarvis");
            iru b = jarvis.b();
            q.a((Object) b, "jarvis.widgetModelAdapter");
            com.taobao.android.searchbaseframe.datasource.impl.a d = b.d();
            q.a((Object) d, "jarvis.widgetModelAdapter.scopeDatasource");
            HashMap hashMap = new HashMap();
            BaseSearchResult baseSearchResult = (BaseSearchResult) d.getTotalSearchResult();
            String str = null;
            hashMap.put(k.a.PARAM_KEY_FIRST_RN, (baseSearchResult == null || (mainInfo2 = baseSearchResult.getMainInfo()) == null) ? null : mainInfo2.rn);
            hashMap.put("src", StringUtils.equals(d.getParamValue("m"), noa.VALUE_MODULE_INSHOP) ? "inshop" : "mainse");
            BaseSearchResult baseSearchResult2 = (BaseSearchResult) d.getTotalSearchResult();
            hashMap.put("wlsort", (baseSearchResult2 == null || (mainInfo = baseSearchResult2.getMainInfo()) == null) ? null : mainInfo.abtest);
            if (jSONObject != null) {
                str = jSONObject.getString("uniq_id");
            }
            hashMap.put("uniq_id", str);
            hashMap.put("toRerankCount", String.valueOf(i));
            hashMap.put("rerankCount", String.valueOf(i2));
            hashMap.put("originCount", String.valueOf(i3));
            e.c("SearchEdgeCompute", "DropItemRerankByLessResult", hashMap);
        }

        public final void b(jxs jarvis, int i, int i2, int i3, JSONObject jSONObject) {
            ResultMainInfoBean mainInfo;
            ResultMainInfoBean mainInfo2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c8301501", new Object[]{this, jarvis, new Integer(i), new Integer(i2), new Integer(i3), jSONObject});
                return;
            }
            q.c(jarvis, "jarvis");
            iru b = jarvis.b();
            q.a((Object) b, "jarvis.widgetModelAdapter");
            com.taobao.android.searchbaseframe.datasource.impl.a d = b.d();
            q.a((Object) d, "jarvis.widgetModelAdapter.scopeDatasource");
            HashMap hashMap = new HashMap();
            BaseSearchResult baseSearchResult = (BaseSearchResult) d.getTotalSearchResult();
            String str = null;
            hashMap.put(k.a.PARAM_KEY_FIRST_RN, (baseSearchResult == null || (mainInfo2 = baseSearchResult.getMainInfo()) == null) ? null : mainInfo2.rn);
            hashMap.put("src", StringUtils.equals(d.getParamValue("m"), noa.VALUE_MODULE_INSHOP) ? "inshop" : "mainse");
            BaseSearchResult baseSearchResult2 = (BaseSearchResult) d.getTotalSearchResult();
            hashMap.put("wlsort", (baseSearchResult2 == null || (mainInfo = baseSearchResult2.getMainInfo()) == null) ? null : mainInfo.abtest);
            if (jSONObject != null) {
                str = jSONObject.getString("uniq_id");
            }
            hashMap.put("uniq_id", str);
            hashMap.put("toRerankCount", String.valueOf(i));
            hashMap.put("rerankCount", String.valueOf(i2));
            hashMap.put("originCount", String.valueOf(i3));
            e.c("SearchEdgeCompute", "DropP4pRerankByLessResult", hashMap);
        }
    }
}
