package com.taobao.search.jarvis;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.login4android.api.Login;
import com.taobao.search.common.util.k;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.tao.util.Constants;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.imp;
import tb.iru;
import tb.jxs;
import tb.jyc;
import tb.kge;
import tb.nnv;
import tb.noa;

/* loaded from: classes7.dex */
public final class SearchJarvisInputProvider implements jyc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1160541864);
        kge.a(1955806706);
    }

    @Override // tb.jyc
    public Map<String, Object> getInput(String trigger, jxs jarvisKitWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2a2f5a45", new Object[]{this, trigger, jarvisKitWidget});
        }
        q.c(trigger, "trigger");
        q.c(jarvisKitWidget, "jarvisKitWidget");
        HashMap hashMap = new HashMap();
        iru b = jarvisKitWidget.b();
        if (b == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.CommonModelAdapter");
        }
        com.taobao.search.sf.datasource.c d = ((com.taobao.search.sf.a) b).d();
        q.a((Object) d, "widgetModelAdapter.scopeDatasource");
        CommonSearchResult commonSearchResult = (CommonSearchResult) d.getLastSearchResult();
        CommonSearchResult commonSearchResult2 = (CommonSearchResult) d.getTotalSearchResult();
        jarvisKitWidget.getActivity();
        HashMap hashMap2 = hashMap;
        hashMap2.put("user_id", Login.getUserId());
        hashMap2.put("sversion", noa.SERVER_VERSION_VALUE);
        hashMap2.put("tab", d.getTab());
        hashMap2.put("sort", d.s());
        hashMap2.put("os", "android");
        hashMap2.put("se_keyword", d.getKeyword());
        hashMap2.put(Constants.SEARCH_FROM, d.getParamValue("from"));
        ListStyle uIListStyle = d.getUIListStyle();
        q.a((Object) uIListStyle, "scopeDataSource.uiListStyle");
        hashMap2.put("style", uIListStyle.getValue());
        hashMap2.put("buffer_data", nnv.INSTANCE.b(jarvisKitWidget));
        hashMap2.put("trigger_type", trigger);
        hashMap2.put("current_offset", String.valueOf(jarvisKitWidget.f()));
        hashMap2.put("context_feature", jarvisKitWidget.d());
        com.taobao.search.jarvis.bean.b a2 = nnv.INSTANCE.a(jarvisKitWidget);
        hashMap2.put("expose_ids", a2.a());
        hashMap2.put("expose_ts", a2.b());
        hashMap2.put("unexpose_ids", a2.c());
        hashMap2.put("unexpose_ts", a2.d());
        hashMap2.put("last_expose_ids", a2.e());
        hashMap2.put("last_expose_ts", a2.f());
        if (commonSearchResult != null) {
            hashMap2.put("max_page", String.valueOf(commonSearchResult.getMainInfo().page));
        }
        if (commonSearchResult2 != null) {
            hashMap2.put(k.a.PARAM_KEY_FIRST_RN, commonSearchResult2.getMainInfo().rn);
            hashMap2.put("wlsort", commonSearchResult2.getMainInfo().abtest);
            hashMap2.put("sp_client_session", commonSearchResult2.spClientSession);
            if (commonSearchResult2.jarvisFeature != null) {
                Map<String, String> map = commonSearchResult2.jarvisFeature;
                q.a((Object) map, "it.jarvisFeature");
                if (!map.isEmpty()) {
                    hashMap2.put("query_feature", JSON.toJSONString(commonSearchResult2.jarvisFeature));
                }
            }
            int f = jarvisKitWidget.f();
            if (f >= 0 && f < commonSearchResult2.getCellsCount()) {
                hashMap2.put(aw.PARAM_SEARCH_KEYWORD_POS, String.valueOf(jarvisKitWidget.f()));
                BaseCellBean baseCellBean = commonSearchResult2.getCells().get(jarvisKitWidget.f());
                hashMap2.put(aw.PARAM_SEARCH_KEYWORD_RN, baseCellBean.rn);
                hashMap2.put("pv_pos", String.valueOf(baseCellBean.pagePos));
                hashMap2.put("pv_size", Integer.valueOf(baseCellBean.pageSize));
                hashMap2.put("page", String.valueOf(baseCellBean.pageNo));
                if (!StringUtils.isEmpty(baseCellBean.itemId)) {
                    hashMap2.put("trigger_item_id", baseCellBean.itemId);
                }
            }
        }
        hashMap2.put("jarvis_dynamic_card", "false");
        if (imp.a().c()) {
            hashMap2.put("is_debug", "true");
        }
        return hashMap2;
    }
}
