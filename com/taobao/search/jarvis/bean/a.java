package com.taobao.search.jarvis.bean;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.j;
import org.json.JSONObject;
import tb.iub;
import tb.kge;
import tb.npp;
import tb.nul;

/* loaded from: classes7.dex */
public final class a extends npp<DynamicCardBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final CommonSearchResult b;

    static {
        kge.a(-191713254);
    }

    public a(CommonSearchResult commonSearchResult) {
        this.b = commonSearchResult;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.search.jarvis.bean.DynamicCardBean, java.lang.Object] */
    @Override // tb.npp
    public /* synthetic */ DynamicCardBean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : a();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.search.jarvis.bean.DynamicCardBean, java.lang.Object] */
    @Override // tb.npp
    public /* synthetic */ DynamicCardBean b(JSONObject jSONObject, nul nulVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6b4445f2", new Object[]{this, jSONObject, nulVar}) : a(jSONObject, nulVar);
    }

    public DynamicCardBean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DynamicCardBean) ipChange.ipc$dispatch("a1a34de3", new Object[]{this}) : new DynamicCardBean();
    }

    public DynamicCardBean a(JSONObject jSONObject, nul nulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DynamicCardBean) ipChange.ipc$dispatch("7c2b3adc", new Object[]{this, jSONObject, nulVar});
        }
        if (jSONObject == null) {
            return a();
        }
        com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(jSONObject.toString());
        DynamicCardBean dynamicCardBean = new DynamicCardBean();
        dynamicCardBean.style = parseObject.getString("style");
        JSONArray jSONArray = parseObject.getJSONArray("templates");
        if (jSONArray != null) {
            dynamicCardBean.mTemplates = iub.a(jSONArray, j.f19452a);
        }
        JSONArray jSONArray2 = parseObject.getJSONArray("result");
        com.alibaba.fastjson.JSONObject jSONObject2 = null;
        if (jSONArray2 != null && !jSONArray2.isEmpty()) {
            jSONObject2 = jSONArray2.getJSONObject(0);
        }
        if (jSONObject2 != null) {
            dynamicCardBean.mDynamicCellBean = j.f19452a.f().a(jSONObject2, this.b);
            dynamicCardBean.mOriginData = jSONObject2;
        }
        return dynamicCardBean;
    }
}
