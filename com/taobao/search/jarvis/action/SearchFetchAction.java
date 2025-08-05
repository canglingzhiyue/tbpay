package com.taobao.search.jarvis.action;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.search.mmd.util.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.q;
import tb.imp;
import tb.iru;
import tb.isv;
import tb.jxs;
import tb.jyh;
import tb.kge;
import tb.nns;
import tb.noa;
import tb.nsp;

/* loaded from: classes7.dex */
public final class SearchFetchAction extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-858550971);
    }

    public static /* synthetic */ Object ipc$super(SearchFetchAction searchFetchAction, String str, Object... objArr) {
        if (str.hashCode() == -1768575901) {
            super.processAction((jxs) objArr[0], (JSONObject) objArr[1], (String) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.search.jarvis.action.a, tb.jxt
    public void processAction(jxs jarvis, JSONObject actionResult, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9695ac63", new Object[]{this, jarvis, actionResult, str});
            return;
        }
        q.c(jarvis, "jarvis");
        q.c(actionResult, "actionResult");
        super.processAction(jarvis, actionResult, str);
        iru b = jarvis.b();
        if (b == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.CommonModelAdapter");
        }
        com.taobao.search.sf.a aVar = (com.taobao.search.sf.a) b;
        com.taobao.search.sf.datasource.c d = aVar.d();
        q.a((Object) d, "widgetModelAdapter.scopeDatasource");
        if (d.isTaskRunning()) {
            k.a("SearchJarvisRerank", "fetch被丢弃，因为当前正在翻页");
            return;
        }
        nns o = aVar.o();
        if (o == null) {
            return;
        }
        q.a((Object) o, "widgetModelAdapter.rankPoolDataSource ?: return");
        if (!o.isSubscribed(this)) {
            o.subscribe(this);
        }
        o.a(buildActionParams(actionResult, jarvis));
        o.doNewSearch();
    }

    private final JSONObject buildActionParams(JSONObject jSONObject, jxs jxsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2123e02a", new Object[]{this, jSONObject, jxsVar});
        }
        JSONObject jSONObject2 = new JSONObject();
        iru b = jxsVar.b();
        q.a((Object) b, "jarvis.widgetModelAdapter");
        com.taobao.android.searchbaseframe.datasource.impl.a d = b.d();
        if (!(d instanceof nsp)) {
            d = null;
        }
        nsp nspVar = (nsp) d;
        if (nspVar == null) {
            return jSONObject2;
        }
        JSONObject jSONObject3 = jSONObject2;
        jSONObject3.put((JSONObject) "appId", noa.VALUE_TPP_ROUTER_APP_ID);
        jSONObject3.put((JSONObject) "m", noa.VALUE_MODULE_RANK_POOL);
        jSONObject3.put((JSONObject) noa.KEY_P4P_S, String.valueOf(nspVar.k()));
        jSONObject3.put((JSONObject) noa.KEY_ITEM_S, String.valueOf(nspVar.j()));
        HashMap hashMap = new HashMap();
        nspVar.a(hashMap);
        jSONObject3.put((JSONObject) "recedItems", buildRecedItems((String) hashMap.remove("itemIds"), (String) hashMap.remove(noa.KEY_P4P_IDS)));
        jSONObject3.put((JSONObject) "itemIds", "");
        jSONObject3.put((JSONObject) noa.KEY_P4P_IDS, "");
        JSONObject b2 = com.taobao.android.searchbaseframe.util.a.b(jSONObject, "params");
        if (b2 != null) {
            jSONObject2.putAll(b2);
        }
        return jSONObject2;
    }

    private final String buildRecedItems(String str, String str2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28da03e6", new Object[]{this, str, str2});
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            if (sb.length() <= 0) {
                z = false;
            }
            if (z) {
                sb.append(',');
            }
            sb.append(str2);
        }
        String sb2 = sb.toString();
        q.a((Object) sb2, "builder.toString()");
        return sb2;
    }

    public final void onEvent(isv.a after) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d06209", new Object[]{this, after});
            return;
        }
        q.c(after, "after");
        iru b = getMJarvisKit().b();
        if (b == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.CommonModelAdapter");
        }
        com.taobao.search.sf.a aVar = (com.taobao.search.sf.a) b;
        nns o = aVar.o();
        if (o == null) {
            return;
        }
        q.a((Object) o, "widgetModelAdapter.rankPoolDataSource ?: return");
        com.taobao.search.sf.datasource.c d = aVar.d();
        q.a((Object) d, "widgetModelAdapter.scopeDatasource");
        o.unsubscribe(this);
        jyh h = getMJarvisKit().h();
        if (h == null) {
            return;
        }
        com.taobao.android.searchbaseframe.datasource.a<?, ?, ?> a2 = after.a();
        q.a((Object) a2, "after.ds");
        Object lastSearchResult = a2.getLastSearchResult();
        if (!(lastSearchResult instanceof BaseSearchResult)) {
            lastSearchResult = null;
        }
        BaseSearchResult baseSearchResult = (BaseSearchResult) lastSearchResult;
        if (baseSearchResult == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        StringBuilder sb = new StringBuilder();
        for (int cellsCount = baseSearchResult.getCellsCount() - 1; cellsCount >= 0; cellsCount--) {
            BaseCellBean baseCellBean = baseSearchResult.getCells().get(cellsCount);
            if (!(!q.a((Object) baseCellBean.cardType, (Object) "item"))) {
                if (baseCellBean.isP4p) {
                    arrayList.add(baseCellBean);
                    linkedList.addFirst(baseCellBean.itemId);
                } else {
                    arrayList2.add(baseCellBean);
                    linkedList2.addFirst(baseCellBean.itemId);
                }
                if (imp.a().c()) {
                    sb.append(baseCellBean.itemId);
                    sb.append(',');
                }
            }
        }
        if (imp.a().c()) {
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
                k.d("[XSearchJarvis]", "fetch result:" + ((Object) sb), new Object[0]);
            }
        }
        h.a((List<String>) linkedList2);
        h.b((List<String>) linkedList);
        ArrayList arrayList3 = arrayList;
        if (!arrayList3.isEmpty()) {
            if (imp.a().c()) {
                StringBuilder sb2 = new StringBuilder();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    BaseCellBean baseCellBean2 = (BaseCellBean) it.next();
                    if (sb2.length() > 0) {
                        sb2.append(',');
                    }
                    sb2.append(baseCellBean2.itemId);
                }
                k.d("[XSearchJarvis]", "fetch追加广告buffer：" + ((Object) sb2), new Object[0]);
            }
            h.b((Collection<BaseCellBean>) arrayList3);
        }
        ArrayList arrayList4 = arrayList2;
        if (!arrayList4.isEmpty()) {
            if (imp.a().c()) {
                StringBuilder sb3 = new StringBuilder();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    BaseCellBean baseCellBean3 = (BaseCellBean) it2.next();
                    if (sb3.length() > 0) {
                        sb3.append(',');
                    }
                    sb3.append(baseCellBean3.itemId);
                }
                k.d("[XSearchJarvis]", "fetch追加buffer：" + ((Object) sb3), new Object[0]);
            }
            h.a((Collection<BaseCellBean>) arrayList4);
        }
        Map<String, TemplateBean> templates = baseSearchResult.getTemplates();
        if (templates != null) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, TemplateBean> entry : templates.entrySet()) {
                String templateName = entry.getKey();
                if (d.getTemplate(templateName) == null) {
                    q.a((Object) templateName, "templateName");
                    hashMap.put(templateName, templates.get(templateName));
                    e.c("SearchEdgeCompute", "MergeMissedTemplate", ai.c(j.a("tItemType", templateName)));
                }
            }
            d.mergeTemplates(hashMap);
        }
        triggerSubActions();
    }
}
