package com.taobao.search.refactor;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.android.meta.data.c;
import com.taobao.android.searchbaseframe.datasource.a;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultLayoutInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.ResultMainInfoBean;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.android.searchbaseframe.nx3.bean.WeexCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import com.taobao.search.common.util.u;
import com.taobao.search.jarvis.bean.DynamicCardBean;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.mmd.datasource.bean.SearchApiModel;
import com.taobao.search.sf.widgets.list.listcell.baseauction.SFAuctionBaseCellBean;
import com.taobao.search.sf.widgets.topbar.SFTopBarBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import org.android.agoo.common.AgooConstants;
import tb.imn;
import tb.ioz;
import tb.itk;
import tb.its;
import tb.kge;
import tb.nne;
import tb.noa;
import tb.nst;
import tb.nty;
import tb.qus;

/* loaded from: classes7.dex */
public final class h implements com.taobao.android.meta.logic.b<e, MSearchResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f19313a;
    private final k b;

    static {
        kge.a(-658987711);
        kge.a(263684218);
    }

    public h(k flow) {
        kotlin.jvm.internal.q.c(flow, "flow");
        this.b = flow;
        this.f19313a = u.c();
    }

    @Override // com.taobao.android.meta.logic.b
    public void a(MSearchResult result, JSONObject jSONObject, imn imnVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("501b2f18", new Object[]{this, result, jSONObject, imnVar});
            return;
        }
        kotlin.jvm.internal.q.c(result, "result");
        e eVar = new e();
        result.addCombo(eVar);
        JSONArray a2 = this.b.a();
        if (a2 != null) {
            if (jSONObject == null) {
                kotlin.jvm.internal.q.a();
            }
            b(jSONObject, a2);
            this.b.a((JSONArray) null);
        }
        if (jSONObject == null) {
            kotlin.jvm.internal.q.a();
        }
        Object clone = jSONObject.clone();
        if (clone == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
        }
        result.originData = (JSONObject) clone;
        try {
            nst.INSTANCE.a(result, jSONObject);
        } catch (Throwable th) {
            i.a("preParse", th);
        }
        eVar.a(result.noResultMod);
        d(jSONObject);
        a(result, eVar, jSONObject);
        i.d(result, jSONObject);
        i.b(result, jSONObject);
        i.a(result, jSONObject, true);
        b(result, jSONObject);
        i.a(result, jSONObject);
        List<String> c = c(jSONObject);
        a(result, eVar, jSONObject, c);
        JSONArray a3 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "replaceArray");
        List<BaseCellBean> replaceCells = result.getReplaceCells();
        kotlin.jvm.internal.q.a((Object) replaceCells, "result.replaceCells");
        a(result, a3, jSONObject, replaceCells, c, false);
        JSONArray a4 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "bufferArray");
        List<BaseCellBean> bufferCells = result.getBufferCells();
        kotlin.jvm.internal.q.a((Object) bufferCells, "result.bufferCells");
        a(result, a4, jSONObject, bufferCells, c, false);
        i.c(result, jSONObject);
        a(result, jSONObject);
        h(result, jSONObject);
        a(result, jSONObject, eVar);
        g(result, jSONObject);
        f(result, jSONObject);
        e(result, jSONObject);
        l(result, jSONObject);
        c(result, jSONObject);
        boolean isNew = result.isNew();
        if (!isNew) {
            a.C0571a searchConfig = result.getSearchConfig();
            if (searchConfig == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.meta.data.MetaSearchConfig<*>");
            }
            Map<String, String> e = ((com.taobao.android.meta.data.e) searchConfig).e();
            if (e != null && (str = e.get("searchType")) != null) {
                isNew = kotlin.jvm.internal.q.a((Object) str, (Object) "all");
            }
        }
        if (isNew) {
            i(result, jSONObject);
            d(result, jSONObject);
            k(result, jSONObject);
            a(result, eVar);
        }
        j(result, jSONObject);
        result.updateItems();
    }

    private final void k(MSearchResult mSearchResult, JSONObject jSONObject) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a97ab568", new Object[]{this, mSearchResult, jSONObject});
        } else if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("extraConfig");
                if (jSONObject2 == null || (jSONArray = jSONObject2.getJSONArray("clearParams")) == null) {
                    return;
                }
                mSearchResult.clearParams = new HashSet();
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    String string = jSONArray.getString(i);
                    if (!StringUtils.isEmpty(string)) {
                        mSearchResult.clearParams.add(string);
                    }
                }
            } catch (Throwable th) {
                i.a("extraConfig", th);
            }
        }
    }

    private final void l(MSearchResult mSearchResult, JSONObject jSONObject) {
        String obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("876e1b47", new Object[]{this, mSearchResult, jSONObject});
            return;
        }
        JSONObject b = com.taobao.android.searchbaseframe.util.a.b(jSONObject, "sessionParams");
        if (b == null) {
            return;
        }
        kotlin.jvm.internal.q.a((Object) b, "FastJsonParseUtil.optJSO…sessionParams\") ?: return");
        HashMap<String, String> hashMap = new HashMap<>();
        for (Map.Entry<String, Object> entry : b.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && (obj = value.toString()) != null) {
                kotlin.jvm.internal.q.a((Object) key, "key");
                hashMap.put(key, obj);
            }
        }
        mSearchResult.sessionParams = hashMap;
    }

    private final void a(MSearchResult mSearchResult, e eVar) {
        ListStyle a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa67bca1", new Object[]{this, mSearchResult, eVar});
        } else if (mSearchResult == null || !mSearchResult.isSaveListStyle || (a2 = qus.INSTANCE.a()) == null) {
        } else {
            eVar.a(a2);
        }
    }

    private final void j(MSearchResult mSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb874f89", new Object[]{this, mSearchResult, jSONObject});
            return;
        }
        JSONObject b = com.taobao.android.searchbaseframe.util.a.b(jSONObject, "switches");
        if (b == null) {
            return;
        }
        mSearchResult.isPullRefreshEnabled = b.getBooleanValue("enableSrpRefresh");
    }

    public final void d(MSearchResult result, JSONObject data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d2ec4f", new Object[]{this, result, data});
            return;
        }
        kotlin.jvm.internal.q.c(result, "result");
        kotlin.jvm.internal.q.c(data, "data");
        try {
            JSONObject b = com.taobao.android.searchbaseframe.util.a.b(data, "switches");
            if (b == null) {
                return;
            }
            result.switches = b;
            result.isServerAutoPlay = b.getBooleanValue("videoAutoPlay4g");
            result.isPrePaging = b.getBooleanValue("prePaging");
            result.isPageTurning = b.getBooleanValue("pageTurning");
            result.isNewFilter = b.getBooleanValue("newFilter");
            result.isJarvisDataCache = b.getBooleanValue("isJarvisDataCache");
            result.isUpdateUtparam = b.getBooleanValue("updateUtparam");
            result.isPreciseAppear = b.getBooleanValue("preciseAppear");
            result.setPreDetail(Boolean.valueOf(com.taobao.android.searchbaseframe.util.a.a(b, "preDetail", true)));
            result.isHalfStickySearchBar = b.getBooleanValue("halfStickySearchBar");
            result.isSaveListStyle = b.getBooleanValue("saveListStyle");
            String string = b.getString("enableZstdDict");
            if (kotlin.jvm.internal.q.a((Object) string, (Object) "true")) {
                its.b = true;
            } else if (!kotlin.jvm.internal.q.a((Object) string, (Object) "false")) {
            } else {
                its.b = false;
            }
        } catch (Throwable th) {
            i.a("switches", th);
        }
    }

    private final void e(MSearchResult mSearchResult, JSONObject jSONObject) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c6522e", new Object[]{this, mSearchResult, jSONObject});
            return;
        }
        try {
            JSONObject b2 = com.taobao.android.searchbaseframe.util.a.b(jSONObject, "jarvisFeature");
            if (b2 == null || (b = com.taobao.android.searchbaseframe.util.a.b(b2, "queryFeature")) == null) {
                return;
            }
            kotlin.jvm.internal.q.a((Object) b, "FastJsonParseUtil.optJSO…                ?: return");
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, Object> entry : b.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!StringUtils.isEmpty(key) && value != null) {
                    kotlin.jvm.internal.q.a((Object) key, "key");
                    hashMap.put(key, value.toString());
                }
            }
            mSearchResult.jarvisFeature = hashMap;
        } catch (Throwable th) {
            i.a("jarvisFeature", th);
        }
    }

    private final void f(MSearchResult mSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53b9b80d", new Object[]{this, mSearchResult, jSONObject});
        } else {
            mSearchResult.sessionId = jSONObject.getString("sessionid");
        }
    }

    private final void g(MSearchResult mSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31ad1dec", new Object[]{this, mSearchResult, jSONObject});
            return;
        }
        try {
            String string = jSONObject.getString(JarvisConstant.KEY_JARVIS_CONFIG);
            if (!StringUtils.isEmpty(string)) {
                mSearchResult.addExtMod(JarvisConstant.KEY_JARVIS_CONFIG, string);
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(JarvisConstant.KEY_JARVIS_CONTEXT);
            if (jSONObject2 == null) {
                return;
            }
            mSearchResult.addExtMod(JarvisConstant.KEY_JARVIS_CONTEXT, jSONObject2.toString());
            if (!mSearchResult.isNew()) {
                return;
            }
            if (mSearchResult == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonSearchResult");
            }
            mSearchResult.spClientSession = jSONObject2.getString("isOpenDuplicateRemove");
        } catch (Throwable th) {
            i.a("jarvis", th);
        }
    }

    private final void a(MSearchResult mSearchResult, JSONObject jSONObject, e eVar) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f198cc55", new Object[]{this, mSearchResult, jSONObject, eVar});
            return;
        }
        try {
            if (mSearchResult.isNew() && (b = com.taobao.android.searchbaseframe.util.a.b(jSONObject, "updateParams")) != null && !b.isEmpty()) {
                if (mSearchResult != null) {
                    MSearchResult mSearchResult2 = mSearchResult;
                    for (Map.Entry<String, Object> entry : b.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        Map<String, String> map = mSearchResult2.updateParams;
                        kotlin.jvm.internal.q.a((Object) map, "searchResult.updateParams");
                        map.put(key, value.toString());
                        Map<String, String> D = eVar.D();
                        kotlin.jvm.internal.q.a((Object) key, "key");
                        D.put(key, value.toString());
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonSearchResult");
            }
        } catch (Throwable th) {
            i.a("updateParams", th);
        }
    }

    private final void h(MSearchResult mSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa083cb", new Object[]{this, mSearchResult, jSONObject});
            return;
        }
        try {
            String string = jSONObject.getString("filterMod");
            if (string != null) {
                mSearchResult.addExtMod("filterMod", string);
            }
            String string2 = jSONObject.getString("sideMod");
            if (StringUtils.isEmpty(string2)) {
                return;
            }
            mSearchResult.addExtMod("sideMod", string2);
        } catch (Throwable th) {
            i.a("extMod", th);
        }
    }

    public final void a(MSearchResult result, JSONObject dataObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdf8bab2", new Object[]{this, result, dataObject});
            return;
        }
        kotlin.jvm.internal.q.c(result, "result");
        kotlin.jvm.internal.q.c(dataObject, "dataObject");
        try {
            result.tabParseTraceDigest = new ioz();
            ArrayList<TabBean> parseBean = TabBean.parseBean(dataObject, result.tabParseTraceDigest);
            if (parseBean == null || parseBean.isEmpty()) {
                parseBean = TabBean.createDefaultTabs();
            }
            result.setTabs(parseBean);
            if (parseBean != null && !parseBean.isEmpty()) {
                int size = parseBean.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        i = -1;
                        break;
                    } else if (parseBean.get(i).isSelected) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i == -1) {
                    parseBean.get(0).isSelected = true;
                }
            }
            a(dataObject);
        } catch (Throwable th) {
            i.a("tabs", th);
        }
    }

    private final void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("bizApi");
                if (jSONObject2 == null) {
                    return;
                }
                for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                    String bizKey = entry.getKey();
                    Object value = entry.getValue();
                    if (!(value instanceof JSONObject)) {
                        value = null;
                    }
                    JSONObject jSONObject3 = (JSONObject) value;
                    if (jSONObject3 != null) {
                        HashMap<String, String> hashMap = new HashMap<>();
                        for (Map.Entry<String, Object> entry2 : jSONObject3.entrySet()) {
                            Object value2 = entry2.getValue();
                            if (!(value2 instanceof String)) {
                                value2 = null;
                            }
                            String str = (String) value2;
                            if (str != null) {
                                String key = entry2.getKey();
                                kotlin.jvm.internal.q.a((Object) key, "kvPair.key");
                                hashMap.put(key, str);
                            }
                        }
                        if (!hashMap.isEmpty()) {
                            nty ntyVar = nty.INSTANCE;
                            kotlin.jvm.internal.q.a((Object) bizKey, "bizKey");
                            ntyVar.a(bizKey, hashMap);
                        }
                    }
                }
            } catch (Throwable th) {
                i.a("bizApiParams", th);
            }
        }
    }

    private final void a(JSONObject jSONObject) {
        JSONArray a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty() && (a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "tabs")) != null) {
            kotlin.jvm.internal.q.a((Object) a2, "FastJsonParseUtil.optJSO…Object, \"tabs\") ?: return");
            int size = a2.size();
            for (int i = 0; i < size; i++) {
                b(a2.getJSONObject(i));
            }
        }
    }

    private final void b(JSONObject jSONObject) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (b = com.taobao.android.searchbaseframe.util.a.b(jSONObject, "api")) != null) {
            kotlin.jvm.internal.q.a((Object) b, "FastJsonParseUtil.optJSO…ject(it, \"api\") ?: return");
            JSONObject b2 = com.taobao.android.searchbaseframe.util.a.b(jSONObject, "tabAction");
            if (b2 == null) {
                return;
            }
            kotlin.jvm.internal.q.a((Object) b2, "FastJsonParseUtil.optJSO…t, \"tabAction\") ?: return");
            String tab = b2.getString("param");
            String string = b.getString("name");
            String string2 = b.getString("version");
            if (StringUtils.isEmpty(string) || StringUtils.isEmpty(string2) || StringUtils.isEmpty(tab)) {
                return;
            }
            HashMap hashMap = null;
            JSONObject b3 = com.taobao.android.searchbaseframe.util.a.b(b, "params");
            if (b3 != null) {
                hashMap = new HashMap();
                for (Map.Entry<String, Object> entry : b3.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (!StringUtils.isEmpty(key) && value != null) {
                        kotlin.jvm.internal.q.a((Object) key, "key");
                        hashMap.put(key, value.toString());
                    }
                }
            }
            SearchApiModel searchApiModel = new SearchApiModel(string, string2, hashMap);
            nty ntyVar = nty.INSTANCE;
            kotlin.jvm.internal.q.a((Object) tab, "tab");
            ntyVar.a(tab, searchApiModel);
        }
    }

    private final void i(MSearchResult mSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed93e9aa", new Object[]{this, mSearchResult, jSONObject});
            return;
        }
        try {
            JSONObject b = com.taobao.android.searchbaseframe.util.a.b(jSONObject, "pkModule");
            if (b == null) {
                return;
            }
            kotlin.jvm.internal.q.a((Object) b, "FastJsonParseUtil.optJSO…ct, \"pkModule\") ?: return");
            mSearchResult.pkModuleBean = mSearchResult.c().g().a(b, mSearchResult, jSONObject.getJSONObject("pageInfo"));
        } catch (Throwable th) {
            i.a(PushConstants.URI_PACKAGE_NAME, th);
        }
    }

    private final void c(MSearchResult mSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9df8670", new Object[]{this, mSearchResult, jSONObject});
            return;
        }
        JSONObject b = com.taobao.android.searchbaseframe.util.a.b(jSONObject, AgooConstants.MESSAGE_POPUP);
        if (b == null) {
            return;
        }
        kotlin.jvm.internal.q.a((Object) b, "FastJsonParseUtil.optJSO…bject, \"popup\") ?: return");
        BaseTypedBean a2 = mSearchResult.c().g().a(b, mSearchResult, jSONObject.getJSONObject("pageInfo"));
        if (!(a2 instanceof MuiseBean)) {
            a2 = null;
        }
        mSearchResult.popupBean = (MuiseBean) a2;
    }

    private final void a(MSearchResult mSearchResult, JSONArray jSONArray, JSONObject jSONObject, List<BaseCellBean> list, List<String> list2, boolean z) {
        JSONObject jSONObject2;
        h hVar = this;
        JSONArray jSONArray2 = jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f69ef1e8", new Object[]{hVar, mSearchResult, jSONArray2, jSONObject, list, list2, new Boolean(z)});
        } else if (jSONArray2 == null) {
        } else {
            JSONObject jSONObject3 = jSONObject.getJSONObject("pageInfo");
            HashMap hashMap = new HashMap();
            hashMap.put("iconStyle", jSONObject.getJSONObject("iconStyle"));
            hashMap.put("pageData", jSONObject.getJSONObject("pageData"));
            hashMap.put("negFeedbackActions", jSONObject.getJSONObject("negFeedbackActions"));
            int size = jSONArray.size();
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < size) {
                JSONObject jSONObject4 = jSONArray2.getJSONObject(i);
                if (jSONObject4 == null) {
                    sb.append("null_cell");
                    sb.append("/");
                    jSONObject2 = jSONObject3;
                } else {
                    if (hVar.f19313a && kotlin.jvm.internal.q.a((Object) jSONObject4.getString("tItemType"), (Object) "ms_tb-webb-widget_tbs_widget_m3")) {
                        jSONObject4.put((JSONObject) "tItemType", "nt_auction_m3");
                    }
                    jSONObject2 = jSONObject3;
                    BaseCellBean a2 = a(mSearchResult, jSONObject4, jSONObject3, hashMap, size, list2);
                    if (a2 == null) {
                        sb.append("parse_error:");
                        sb.append(jSONObject4.getString("tItemType"));
                        sb.append("/");
                    } else {
                        sb.append(a2.type);
                        sb.append("/");
                        a2.pagePos = i;
                        list.add(a2);
                    }
                }
                i++;
                hVar = this;
                jSONArray2 = jSONArray;
                jSONObject3 = jSONObject2;
            }
            if (!z) {
                return;
            }
            if (mSearchResult == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonSearchResult");
            }
            mSearchResult.itemsArrayTraceDigest = new ioz(sb.toString());
        }
    }

    private final void a(BaseCellBean baseCellBean, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f33562f6", new Object[]{this, baseCellBean, jSONObject});
            return;
        }
        boolean booleanValue = jSONObject.getBooleanValue("fullSpan");
        if (baseCellBean instanceof MuiseCellBean) {
            Map<String, Object> map = ((MuiseCellBean) baseCellBean).mExtraObj;
            kotlin.jvm.internal.q.a((Object) map, "bean.mExtraObj");
            map.put("fullSpan", Boolean.valueOf(booleanValue));
        } else if (!(baseCellBean instanceof WeexCellBean)) {
        } else {
            Map<String, Object> map2 = ((WeexCellBean) baseCellBean).mExtraObj;
            kotlin.jvm.internal.q.a((Object) map2, "bean.mExtraObj");
            map2.put("fullSpan", Boolean.valueOf(booleanValue));
        }
    }

    private final BaseCellBean a(MSearchResult mSearchResult, JSONObject jSONObject, JSONObject jSONObject2, Map<String, ? extends Object> map, int i, List<String> list) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseCellBean) ipChange.ipc$dispatch("eadc92bb", new Object[]{this, mSearchResult, jSONObject, jSONObject2, map, new Integer(i), list});
        }
        MSearchResult mSearchResult2 = mSearchResult;
        BaseCellBean a2 = mSearchResult.c().f().a(jSONObject, mSearchResult2, jSONObject2);
        if (a2 == null) {
            return null;
        }
        kotlin.jvm.internal.q.a((Object) a2, "result.c().cellParserReg…           ?: return null");
        a(a2, jSONObject);
        boolean z = a2 instanceof SFAuctionBaseCellBean;
        if (z) {
            ((SFAuctionBaseCellBean) a2).pageInfo = jSONObject2;
        } else if (a2 instanceof MuiseCellBean) {
            ((MuiseCellBean) a2).mExtraObj.putAll(map);
        } else if (a2 instanceof WeexCellBean) {
            ((WeexCellBean) a2).mExtraObj.putAll(map);
        }
        boolean z2 = a2 instanceof MuiseCellBean;
        if (z2 && (b = com.taobao.android.searchbaseframe.util.a.b(jSONObject, noa.VALUE_MODULE_DYNAMIC_CARD)) != null) {
            jSONObject.remove(noa.VALUE_MODULE_DYNAMIC_CARD);
            DynamicCardBean dynamicCardBean = new DynamicCardBean();
            dynamicCardBean.mOriginData = b;
            dynamicCardBean.mDynamicCellBean = mSearchResult.c().f().a(b, mSearchResult2, jSONObject2);
            Map<String, Object> map2 = ((MuiseCellBean) a2).mExtraObj;
            kotlin.jvm.internal.q.a((Object) map2, "bean.mExtraObj");
            map2.put("dynamicCardBean", dynamicCardBean);
        }
        JSONObject a3 = a(jSONObject, list);
        if (z) {
            ((SFAuctionBaseCellBean) a2).wsData = a3;
        } else if (z2) {
            Map<String, Object> map3 = ((MuiseCellBean) a2).mExtraObj;
            kotlin.jvm.internal.q.a((Object) map3, "bean.mExtraObj");
            map3.put("wsData", a3);
        } else if (a2 instanceof M3CellBean) {
            ((M3CellBean) a2).setWsData(a3);
        }
        a2.pageSize = i;
        a2.setOriginPageSize(i);
        return a2;
    }

    private final JSONObject a(JSONObject jSONObject, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e793ff99", new Object[]{this, jSONObject, list});
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : list) {
            String string = jSONObject.getString(str);
            if (!StringUtils.isEmpty(string)) {
                jSONObject2.put((JSONObject) str, string);
            }
        }
        return jSONObject2;
    }

    private final void a(MSearchResult mSearchResult, e eVar, JSONObject jSONObject, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17522560", new Object[]{this, mSearchResult, eVar, jSONObject, list});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("itemsArray");
        if (jSONArray == null) {
            jSONArray = jSONObject.getJSONArray("shopArray");
        }
        JSONArray jSONArray2 = jSONArray;
        ArrayList arrayList = new ArrayList();
        a(mSearchResult, jSONArray2, jSONObject, (List<BaseCellBean>) arrayList, list, true);
        eVar.a(arrayList);
    }

    private final List<String> c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("59dcb8c1", new Object[]{this, jSONObject});
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray a2 = com.taobao.android.searchbaseframe.util.a.a(com.taobao.android.searchbaseframe.util.a.b(com.taobao.android.searchbaseframe.util.a.b(jSONObject, JarvisConstant.KEY_JARVIS_CONFIG), "ext"), "ws_keys");
            if (a2 != null) {
                int size = a2.size();
                for (int i = 0; i < size; i++) {
                    String key = a2.getString(i);
                    if (!StringUtils.isEmpty(key)) {
                        kotlin.jvm.internal.q.a((Object) key, "key");
                        arrayList.add(key);
                    }
                }
            }
        } catch (Throwable th) {
            i.a("wsDataKeys", th);
        }
        return arrayList;
    }

    private final void a(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48168760", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("sortMenu");
        if (jSONObject2 == null) {
            return;
        }
        jSONObject2.put((JSONObject) "tItemType", "nt_sortbar");
        jSONArray.add(jSONObject2);
    }

    private final void b(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80f6e7ff", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("newPromotion");
        if (jSONObject2 == null) {
            return;
        }
        jSONObject2.put((JSONObject) "tItemType", "nt_promotionfilter");
        jSONArray.add(jSONObject2);
    }

    private final void c(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9d7489e", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("searchHint");
        if (jSONObject2 == null) {
            return;
        }
        jSONObject2.put((JSONObject) "tItemType", "nt_searchhint");
        jSONArray.add(jSONObject2);
    }

    private final void d(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2b7a93d", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("dynCellHeader");
        if (jSONArray2 == null) {
            return;
        }
        jSONArray.addAll(jSONArray2);
    }

    private final void e(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9809dc", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("promotionBanner");
        if (jSONObject2 == null) {
            return;
        }
        jSONObject2.put((JSONObject) "tItemType", "nt_promotionbanner");
        jSONArray.add(jSONObject2);
    }

    private final void a(JSONObject jSONObject, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f94b4b0", new Object[]{this, jSONObject, jSONArray});
        } else if (jSONObject == null) {
        } else {
            jSONArray.add(jSONObject);
        }
    }

    public final void b(MSearchResult result, JSONObject dataObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbec2091", new Object[]{this, result, dataObject});
            return;
        }
        kotlin.jvm.internal.q.c(result, "result");
        kotlin.jvm.internal.q.c(dataObject, "dataObject");
        a(result, dataObject, true);
    }

    public final void a(MSearchResult result, JSONObject dataObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c11f4e62", new Object[]{this, result, dataObject, new Boolean(z)});
            return;
        }
        kotlin.jvm.internal.q.c(result, "result");
        kotlin.jvm.internal.q.c(dataObject, "dataObject");
        result.layoutParseTraceDigestMap = new HashMap();
        ResultLayoutInfoBean resultLayoutInfoBean = new ResultLayoutInfoBean();
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        JSONArray jSONArray5 = new JSONArray();
        JSONArray jSONArray6 = new JSONArray();
        JSONArray jSONArray7 = new JSONArray();
        a(jSONArray2, dataObject);
        a(dataObject.getJSONObject("searchTips"), jSONArray4);
        a(dataObject.getJSONObject("ShopRecommendHeader"), jSONArray4);
        e(jSONArray4, dataObject);
        b(jSONArray4, dataObject);
        c(jSONArray4, dataObject);
        d(jSONArray4, dataObject);
        g(jSONArray4, dataObject);
        k(jSONArray5, dataObject);
        a(jSONArray3, jSONArray, jSONArray2, jSONArray4, jSONArray6, dataObject, result);
        result.topBarParseTraceDigest = null;
        a(result, jSONArray7, dataObject, result.getMainInfo().pageName);
        a(jSONArray4, jSONArray);
        if (z) {
            a("sceneHeader", result, jSONArray6, dataObject, true);
        }
        a(itk.TYPE_FOLD, result, jSONArray3, dataObject, true);
        a("topBar", result, jSONArray7, dataObject, true);
        a(itk.TYPE_HALF_STICKY, result, jSONArray2, dataObject, true);
        a("sticky", result, jSONArray, dataObject, true);
        a("list", result, jSONArray4, dataObject, true);
        a("listFooter", result, jSONArray5, dataObject, false);
        result.getMainInfo().layoutInfo = resultLayoutInfoBean;
    }

    private final void f(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64786a7b", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("halfStickyHeader");
        if (jSONArray2 == null || jSONArray == null) {
            return;
        }
        jSONArray.addAll(jSONArray2);
    }

    private final void a(JSONArray jSONArray, JSONArray jSONArray2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0623eb8", new Object[]{this, jSONArray, jSONArray2});
            return;
        }
        int size = jSONArray.size();
        JSONObject jSONObject = null;
        for (int i = 0; i < size; i++) {
            Object obj = jSONArray.get(i);
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
            JSONObject jSONObject2 = (JSONObject) obj;
            String string = jSONObject2.getString("tItemType");
            if (StringUtils.equals(string, "nt_prepose_filter") || StringUtils.equals(string, "nt_prepose_filter_new")) {
                jSONObject = jSONObject2;
            }
        }
        if (jSONObject == null) {
            return;
        }
        jSONArray.remove(jSONObject);
        jSONArray2.add(0, jSONObject);
    }

    private final void a(JSONObject jSONObject, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa861964", new Object[]{this, jSONObject, obj});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("iconStyle");
        if (jSONObject2 == null) {
            return;
        }
        if (obj instanceof MuiseBean) {
            JSONObject jSONObject3 = ((MuiseBean) obj).extraStatus;
            kotlin.jvm.internal.q.a((Object) jSONObject3, "bean.extraStatus");
            jSONObject3.put((JSONObject) "iconStyle", (String) jSONObject2);
        } else if (!(obj instanceof WeexBean)) {
        } else {
            JSONObject jSONObject4 = ((WeexBean) obj).extraStatus;
            kotlin.jvm.internal.q.a((Object) jSONObject4, "bean.extraStatus");
            jSONObject4.put((JSONObject) "iconStyle", (String) jSONObject2);
        }
    }

    private final void a(String str, MSearchResult mSearchResult, JSONArray jSONArray, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f28ee54", new Object[]{this, str, mSearchResult, jSONArray, jSONObject, new Boolean(z)});
        } else if (jSONArray != null) {
            StringBuilder sb = new StringBuilder();
            JSONObject jSONObject2 = jSONObject.getJSONObject("pageInfo");
            JSONObject jSONObject3 = jSONObject.getJSONObject("pageData");
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                jSONObject4.getString("tItemType");
                BaseTypedBean a2 = mSearchResult.c().g().a(jSONObject4, mSearchResult, jSONObject2);
                if (a2 != null) {
                    kotlin.jvm.internal.q.a((Object) a2, "result.c().modParserRegi…              ?: continue");
                    if (a2 instanceof MuiseBean) {
                        Map<String, Object> map = ((MuiseBean) a2).mExtraObj;
                        kotlin.jvm.internal.q.a((Object) map, "bean.mExtraObj");
                        map.put("pageData", jSONObject3);
                    }
                    sb.append(a2.type);
                    sb.append("/");
                    if (a2 instanceof SFTopBarBean) {
                        mSearchResult.topBarParseTraceDigest = ((SFTopBarBean) a2).traceDigest;
                    }
                    a(jSONObject, a2);
                    if (z) {
                        mSearchResult.addHeader(new c(str, a2, null));
                    } else {
                        mSearchResult.addFooter(a2);
                    }
                }
            }
            if (mSearchResult.layoutParseTraceDigestMap == null) {
                mSearchResult.layoutParseTraceDigestMap = new HashMap();
            }
            Map<String, ioz> map2 = mSearchResult.layoutParseTraceDigestMap;
            if (map2 == null) {
                kotlin.jvm.internal.q.a();
            }
            map2.put(str, new ioz(sb.toString()));
        }
    }

    private final String a(MSearchResult mSearchResult, JSONArray jSONArray, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d026dd4c", new Object[]{this, mSearchResult, jSONArray, jSONObject, str});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("topBar");
        if (jSONObject2 == null) {
            return "";
        }
        String topBarItemType = jSONObject2.getString("tItemType");
        if (StringUtils.isEmpty(topBarItemType)) {
            topBarItemType = StringUtils.equals(nne.PAGE_NAME_INSHOP, str) ? "nt_inshop_topbar" : "nt_topbar";
            jSONObject2.put((JSONObject) "tItemType", topBarItemType);
            mSearchResult.setUseNativeTopBar(true);
        }
        jSONArray.add(0, jSONObject2);
        kotlin.jvm.internal.q.a((Object) topBarItemType, "topBarItemType");
        return topBarItemType;
    }

    private final void g(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d58cb1a", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("userdoc");
        if (jSONObject2 == null) {
            return;
        }
        jSONObject2.put((JSONObject) "tItemType", "nt_personalization");
        jSONArray.add(jSONObject2);
    }

    private final void h(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6392bb9", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("foldHeader");
        if (jSONArray2 == null) {
            return;
        }
        jSONArray.addAll(jSONArray2);
    }

    private final void i(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f198c58", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("stickyHeader");
        if (jSONArray2 == null) {
            return;
        }
        jSONArray.addAll(jSONArray2);
    }

    private final void j(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47f9ecf7", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("listHeader");
        if (jSONArray2 == null) {
            return;
        }
        jSONArray.addAll(jSONArray2);
    }

    private final void a(JSONArray jSONArray, JSONObject jSONObject, MSearchResult mSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5c1dcf6", new Object[]{this, jSONArray, jSONObject, mSearchResult});
            return;
        }
        Object obj = jSONObject.get("sceneHeader");
        if (!(obj instanceof JSONObject)) {
            obj = null;
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        if (jSONObject2 == null) {
            return;
        }
        jSONArray.add(jSONObject2);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("style");
        if (jSONObject3 == null) {
            return;
        }
        String string = jSONObject3.getString("enableSlide");
        if (StringUtils.isEmpty(string)) {
            return;
        }
        mSearchResult.addExtMod("enableSlide", string);
    }

    private final void a(JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, JSONArray jSONArray4, JSONArray jSONArray5, JSONObject jSONObject, MSearchResult mSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84191456", new Object[]{this, jSONArray, jSONArray2, jSONArray3, jSONArray4, jSONArray5, jSONObject, mSearchResult});
            return;
        }
        h(jSONArray, jSONObject);
        i(jSONArray2, jSONObject);
        j(jSONArray4, jSONObject);
        a(jSONArray5, jSONObject, mSearchResult);
        f(jSONArray3, jSONObject);
    }

    private final void k(JSONArray jSONArray, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80da4d96", new Object[]{this, jSONArray, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("srpFooter");
        if (jSONObject2 == null) {
            return;
        }
        jSONArray.add(jSONObject2);
    }

    private final void a(MSearchResult mSearchResult, e eVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b228566f", new Object[]{this, mSearchResult, eVar, jSONObject});
            return;
        }
        try {
            ResultMainInfoBean resultMainInfoBean = new ResultMainInfoBean();
            ResultMainInfoBean.parseBaseInfo(resultMainInfoBean, jSONObject);
            mSearchResult.setMainInfo(resultMainInfoBean);
            ListStyle listStyle = resultMainInfoBean.style;
            kotlin.jvm.internal.q.a((Object) listStyle, "mainInfoBean.style");
            eVar.a(listStyle);
            eVar.a(resultMainInfoBean);
            eVar.a(Boolean.valueOf(resultMainInfoBean.finish));
            mSearchResult.crossShopRecPvUuid = jSONObject.getString("pvUuid");
        } catch (Throwable th) {
            i.a("status", th);
        }
    }

    private final void b(JSONObject jSONObject, JSONArray jSONArray) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b875154f", new Object[]{this, jSONObject, jSONArray});
        } else if (jSONArray != null && !jSONArray.isEmpty()) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string = jSONObject2.getString("type");
                if (!StringUtils.isEmpty(string) && (obj = jSONObject2.get("data")) != null) {
                    kotlin.jvm.internal.q.a(obj, "obj[\"data\"] ?: continue");
                    String key = jSONObject2.getString("key");
                    if (!StringUtils.isEmpty(key)) {
                        Object obj2 = jSONObject.get(key);
                        if (obj2 == null) {
                            jSONObject.put((JSONObject) key, (String) obj);
                        } else {
                            boolean z = obj2 instanceof JSONArray;
                            if (string != null) {
                                switch (string.hashCode()) {
                                    case -1108791789:
                                        if (!string.equals("mergeLocal")) {
                                            break;
                                        } else {
                                            kotlin.jvm.internal.q.a((Object) key, "key");
                                            a(key, jSONObject, obj, obj2);
                                            continue;
                                        }
                                    case -1102179574:
                                        if (string.equals("mergeStart")) {
                                            a(true, z, obj2, obj);
                                            break;
                                        } else {
                                            continue;
                                        }
                                    case -501718653:
                                        if (string.equals("mergeEnd")) {
                                            a(false, z, obj2, obj);
                                            break;
                                        } else {
                                            continue;
                                        }
                                    case 178828699:
                                        if (string.equals("mergeServer")) {
                                            kotlin.jvm.internal.q.a((Object) key, "key");
                                            a(key, jSONObject, obj2, obj);
                                            break;
                                        } else {
                                            continue;
                                        }
                                    case 1094496948:
                                        if (string.equals("replace")) {
                                            jSONObject.put((JSONObject) key, (String) obj);
                                            break;
                                        } else {
                                            continue;
                                        }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private final void a(String str, JSONObject jSONObject, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f01b6b6", new Object[]{this, str, jSONObject, obj, obj2});
        } else if (!(obj instanceof JSONObject) || !(obj2 instanceof JSONObject)) {
        } else {
            ((JSONObject) obj2).putAll((Map) obj);
            jSONObject.put((JSONObject) str, (String) obj2);
        }
    }

    private final void a(boolean z, boolean z2, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35f119a0", new Object[]{this, new Boolean(z), new Boolean(z2), obj, obj2});
        } else if (!(obj2 instanceof JSONArray) || !z2) {
        } else {
            if (obj != null) {
                JSONArray jSONArray = (JSONArray) obj;
                if (z) {
                    jSONArray.addAll(0, (Collection) obj2);
                    return;
                } else {
                    jSONArray.addAll((Collection) obj2);
                    return;
                }
            }
            throw new TypeCastException("null cannot be cast to non-null type com.alibaba.fastjson.JSONArray");
        }
    }
}
