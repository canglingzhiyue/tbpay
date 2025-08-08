package com.taobao.search.searchdoor.sf.widgets.suggest.data;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import java.util.HashMap;
import tb.kge;
import tb.nqr;

/* loaded from: classes7.dex */
public class a extends nqr<SuggestCellBean, com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1874409938);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == -350917061) {
            super.a((JSONObject) objArr[0], (JSONObject) ((ActivateTypedBean) objArr[1]), (ActivateTypedBean) ((com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b) objArr[2]));
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "nt_suggest";
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public /* synthetic */ Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : a();
    }

    public SuggestCellBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SuggestCellBean) ipChange.ipc$dispatch("131b8d2a", new Object[]{this}) : new SuggestCellBean();
    }

    @Override // com.taobao.android.searchbaseframe.parse.a
    public Class<SuggestCellBean> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("76b61817", new Object[]{this}) : SuggestCellBean.class;
    }

    @Override // tb.nqr, com.taobao.android.searchbaseframe.parse.b, com.taobao.android.searchbaseframe.parse.a
    public void a(JSONObject jSONObject, SuggestCellBean suggestCellBean, com.taobao.search.searchdoor.sf.widgets.activate.data.bean.b bVar) throws Exception {
        JSONArray jSONArray;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15269650", new Object[]{this, jSONObject, suggestCellBean, bVar});
            return;
        }
        super.a(jSONObject, (JSONObject) suggestCellBean, (SuggestCellBean) bVar);
        JSONObject jSONObject3 = jSONObject.getJSONObject("data");
        if (jSONObject3 == null || (jSONArray = jSONObject3.getJSONArray("result")) == null || jSONArray.isEmpty() || (jSONObject2 = jSONArray.getJSONObject(0)) == null) {
            return;
        }
        suggestCellBean.result = bVar;
        suggestCellBean.searchText = jSONObject2.getString("searchtext");
        suggestCellBean.showText = jSONObject2.getString("showtext");
        suggestCellBean.icon = jSONObject2.getString("icon");
        if (!StringUtils.isEmpty(suggestCellBean.showText) && bVar != null) {
            if (bVar.h.length() > 0) {
                bVar.h += ";";
            }
            bVar.h += suggestCellBean.showText;
        }
        suggestCellBean.params = new HashMap();
        JSONArray jSONArray2 = jSONObject2.getJSONArray("params");
        if (jSONArray2 == null) {
            return;
        }
        for (int i = 0; i < jSONArray2.size(); i++) {
            JSONObject jSONObject4 = jSONArray2.getJSONObject(i);
            String string = jSONObject4.getString("key");
            String string2 = jSONObject4.getString("value");
            if (!StringUtils.isEmpty(string) && !StringUtils.isEmpty(string2)) {
                suggestCellBean.params.put(string, string2);
            }
        }
    }
}
