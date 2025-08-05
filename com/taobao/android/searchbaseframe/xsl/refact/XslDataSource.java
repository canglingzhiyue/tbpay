package com.taobao.android.searchbaseframe.xsl.refact;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.searchbaseframe.xsl.module.XslDatasource;
import com.taobao.android.searchbaseframe.xsl.module.XslSearchResult;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.TypeCastException;
import tb.htg;
import tb.iml;
import tb.imn;
import tb.kge;

/* loaded from: classes6.dex */
public class XslDataSource extends XslDatasource {
    private i controller;

    static {
        kge.a(785182834);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XslDataSource(imn core) {
        super(core);
        kotlin.jvm.internal.q.c(core, "core");
    }

    public final i getController() {
        return this.controller;
    }

    public final void setController(i iVar) {
        this.controller = iVar;
        Object obj = this.mAdapter;
        if (obj != null) {
            ((com.taobao.android.meta.data.f) obj).a(this.controller);
            if (iVar == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.meta.logic.BaseMetaPageController<com.taobao.android.meta.data.MetaDataSource<com.taobao.android.meta.common.CommonSearchCombo, com.taobao.android.meta.data.MetaResult<com.taobao.android.meta.common.CommonSearchCombo>>, com.taobao.android.meta.common.CommonSearchCombo, com.taobao.android.meta.data.MetaResult<com.taobao.android.meta.common.CommonSearchCombo>>");
            }
            setController((com.taobao.android.meta.logic.a) iVar);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.meta.data.MetaSearchResultAdapter<com.taobao.android.meta.common.CommonSearchCombo, com.taobao.android.searchbaseframe.xsl.module.XslSearchResult>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.taobao.android.searchbaseframe.xsl.module.XslDatasource
    public void addTppPageParam(Map<String, String> map) {
        String valueOf;
        htg combo;
        if (isMetaMode()) {
            XslSearchResult xslSearchResult = (XslSearchResult) getTotalSearchResult();
            if (xslSearchResult == null || (combo = xslSearchResult.getCombo(0)) == null || (valueOf = String.valueOf(combo.d())) == null) {
                valueOf = String.valueOf(getNextPage());
            }
            if (map == null) {
                kotlin.jvm.internal.q.a();
            }
            map.put("page", valueOf);
            iml a2 = c().a();
            kotlin.jvm.internal.q.a((Object) a2, "c().constant()");
            String e = a2.e();
            kotlin.jvm.internal.q.a((Object) e, "c().constant().serverVersion");
            map.put("sversion", e);
            iml a3 = c().a();
            kotlin.jvm.internal.q.a((Object) a3, "c().constant()");
            String a4 = a3.a();
            kotlin.jvm.internal.q.a((Object) a4, "c().constant().ttid");
            map.put("ttid", a4);
            iml a5 = c().a();
            kotlin.jvm.internal.q.a((Object) a5, "c().constant()");
            String b = a5.b();
            kotlin.jvm.internal.q.a((Object) b, "c().constant().utdid");
            map.put("utd_id", b);
            if (this.mTppParams == null) {
                return;
            }
            map.putAll(this.mTppParams);
            return;
        }
        super.addTppPageParam(map);
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    public boolean doNextPageSearch(JSONObject jSONObject) {
        if (!isMetaMode()) {
            return super.doNextPageSearch(jSONObject);
        }
        XslSearchResult xslSearchResult = (XslSearchResult) getTotalSearchResult();
        return searchInternal(createConfig(false, xslSearchResult != null ? xslSearchResult.getCombo(0) : null, false, false, false, null, jSONObject));
    }

    @Override // com.taobao.android.meta.data.b, com.taobao.android.searchbaseframe.datasource.a
    public boolean doNewSearch(JSONObject jSONObject) {
        XslSearchResult xslSearchResult;
        htg combo;
        if (isMetaMode() && (xslSearchResult = (XslSearchResult) getTotalSearchResult()) != null && (combo = xslSearchResult.getCombo(0)) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("searchType", "allSearch");
            doNewSearch(combo, false, jSONObject, hashMap);
            return true;
        }
        return super.doNewSearch(jSONObject);
    }

    @Override // com.taobao.android.searchbaseframe.xsl.module.XslDatasource
    public void doUpdateSearch(JSONObject jSONObject, int i, int i2, boolean z, boolean z2) {
        if (!isMetaMode()) {
            super.doUpdateSearch(jSONObject, i, i2, z, z2);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("searchType", "updateSearch");
        hashMap.put("from", String.valueOf(i));
        hashMap.put(com.taobao.android.weex_framework.util.a.ATOM_length, String.valueOf(i2));
        hashMap.put("reserveCell", String.valueOf(z));
        hashMap.put("addFromPosition", String.valueOf(z2));
        XslSearchResult xslSearchResult = (XslSearchResult) getTotalSearchResult();
        searchInternal(createConfig(false, xslSearchResult != null ? xslSearchResult.getCombo(0) : null, true, false, false, hashMap, jSONObject, false));
    }

    @Override // com.taobao.android.searchbaseframe.datasource.a
    public boolean doPartialSearch(Set<String> set, JSONObject jSONObject) {
        if (isMetaMode()) {
            HashMap hashMap = new HashMap();
            hashMap.put("searchType", "partialSearch");
            if (set != null) {
                String jSONString = JSON.toJSONString(set);
                kotlin.jvm.internal.q.a((Object) jSONString, "JSON.toJSONString(partialConfig)");
                hashMap.put("updateConfig", jSONString);
            }
            XslSearchResult xslSearchResult = (XslSearchResult) getTotalSearchResult();
            return searchInternal(createConfig(false, xslSearchResult != null ? xslSearchResult.getCombo(0) : null, true, false, false, hashMap, jSONObject));
        }
        return super.doPartialSearch(set, jSONObject);
    }
}
