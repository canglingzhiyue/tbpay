package com.taobao.search.searchdoor.shop.widget.bar;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.q;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.kge;
import tb.npp;
import tb.nul;

/* loaded from: classes8.dex */
public final class a extends npp<ArrayList<InShopSearchHintBean>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1161599139);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.ArrayList<com.taobao.search.searchdoor.shop.widget.bar.InShopSearchHintBean>] */
    @Override // tb.npp
    public /* synthetic */ ArrayList<InShopSearchHintBean> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : a();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.ArrayList<com.taobao.search.searchdoor.shop.widget.bar.InShopSearchHintBean>] */
    @Override // tb.npp
    public /* synthetic */ ArrayList<InShopSearchHintBean> b(JSONObject jSONObject, nul nulVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6b4445f2", new Object[]{this, jSONObject, nulVar}) : a(jSONObject, nulVar);
    }

    public ArrayList<InShopSearchHintBean> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("ab0d0c42", new Object[]{this}) : new ArrayList<>();
    }

    public ArrayList<InShopSearchHintBean> a(JSONObject jSONObject, nul nulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("8522be7b", new Object[]{this, jSONObject, nulVar});
        }
        ArrayList<InShopSearchHintBean> arrayList = new ArrayList<>();
        if (jSONObject == null) {
            nul.Companion.a(nulVar, "DataConvert", "-1", "JSON is empty");
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        String optString = jSONObject.optString(aw.PARAM_PVID);
        String optString2 = jSONObject.optString("tpp_trace");
        HashMap hashMap2 = hashMap;
        hashMap2.put("pvId", optString);
        hashMap2.put("tppTrace", optString2);
        JSONArray optJSONArray = jSONObject.optJSONArray("result");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            hashMap2.put("errCode", "-1");
            hashMap2.put("errMsg", "result array is empty");
            nul.Companion.b(nulVar, "DataConvert", hashMap2);
            return arrayList;
        }
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                try {
                    arrayList.add((InShopSearchHintBean) JSON.parseObject(optJSONObject.toString(), InShopSearchHintBean.class));
                } catch (Exception unused) {
                }
            }
        }
        if (arrayList.size() > 0) {
            InShopSearchHintBean inShopSearchHintBean = arrayList.get(0);
            q.a((Object) inShopSearchHintBean, "resultList[0]");
            InShopSearchHintBean inShopSearchHintBean2 = inShopSearchHintBean;
            hashMap2.put("displayText", inShopSearchHintBean2.getDisplayText());
            hashMap2.put("searchText", inShopSearchHintBean2.getSearchText());
        }
        nul.Companion.a(nulVar, "DataConvert", hashMap2);
        return arrayList;
    }
}
