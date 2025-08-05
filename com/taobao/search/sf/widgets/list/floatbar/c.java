package com.taobao.search.sf.widgets.list.floatbar;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import com.taobao.search.mmd.datasource.bean.ReviewBean;
import com.taobao.search.mmd.util.d;
import com.taobao.search.sf.datasource.CommonSearchResult;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-281666875);
    }

    public static b a(JSONObject jSONObject, boolean z, CommonSearchResult commonSearchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("2808e929", new Object[]{jSONObject, new Boolean(z), commonSearchResult});
        }
        b bVar = new b();
        bVar.f19503a = b(jSONObject.getJSONObject("newReview"));
        bVar.b = c(jSONObject.getJSONObject("pushButton"));
        if (bVar.b == null || z) {
            bVar.c = a(jSONObject);
        }
        bVar.d = a(jSONObject.getJSONObject("bottomBar"), commonSearchResult, jSONObject.getJSONObject("pageInfo"));
        return bVar;
    }

    private static List<com.taobao.search.mmd.datasource.bean.a> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3f6755bf", new Object[]{jSONObject});
        }
        ArrayList arrayList = new ArrayList();
        JSONArray a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "pushButtonList");
        if (a2 != null) {
            for (int i = 0; i < a2.size(); i++) {
                com.taobao.search.mmd.datasource.bean.a c = c(a2.getJSONObject(i));
                if (c != null) {
                    arrayList.add(c);
                }
            }
        }
        return arrayList;
    }

    private static BaseTypedBean a(JSONObject jSONObject, CommonSearchResult commonSearchResult, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseTypedBean) ipChange.ipc$dispatch("b38fc4c4", new Object[]{jSONObject, commonSearchResult, jSONObject2});
        }
        if (jSONObject != null) {
            return com.taobao.search.sf.j.f19452a.g().a(jSONObject, commonSearchResult, jSONObject2);
        }
        return null;
    }

    private static ReviewBean b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReviewBean) ipChange.ipc$dispatch("c009e6e2", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        ReviewBean reviewBean = new ReviewBean();
        reviewBean.show = jSONObject.getBooleanValue("show");
        reviewBean.totalPage = jSONObject.getIntValue("itemTotalPage");
        if (reviewBean.totalPage > 2) {
            reviewBean.totalPage = 2;
        }
        reviewBean.h5Url = jSONObject.getString("h5Url");
        reviewBean.iconUrl = jSONObject.getString("iconUrl");
        if (reviewBean.totalPage > 0 && !TextUtils.isEmpty(reviewBean.h5Url)) {
            return reviewBean;
        }
        return null;
    }

    private static com.taobao.search.mmd.datasource.bean.a c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.search.mmd.datasource.bean.a) ipChange.ipc$dispatch("ff1857ca", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        com.taobao.search.mmd.datasource.bean.a aVar = new com.taobao.search.mmd.datasource.bean.a();
        aVar.f19161a = jSONObject.getString("text");
        aVar.b = jSONObject.getString("normalPic");
        aVar.c = jSONObject.getString("highlightPic");
        aVar.e = jSONObject.getString("rightPic");
        aVar.d = jSONObject.getString("hintText");
        aVar.g = jSONObject.getIntValue("hintStayTimeInterval");
        aVar.f = jSONObject.getIntValue("hintAppearPage");
        if (aVar.f <= 0) {
            aVar.f = 1;
        }
        if (aVar.g <= 0) {
            aVar.g = 3;
        }
        aVar.h = d.a(jSONObject.getString("hintTextColor"), -1);
        aVar.i = d.a(jSONObject.getString("hintStartColor"), -24771);
        aVar.j = d.a(jSONObject.getString("hintEndColor"), -761329);
        aVar.k = jSONObject.getString("strategy");
        aVar.l = jSONObject.getString("mode");
        if (TextUtils.isEmpty(aVar.l)) {
            aVar.l = "normal";
        }
        aVar.m = jSONObject.getIntValue("appearPage");
        aVar.n = jSONObject.getIntValue("disappearPage");
        if (aVar.n <= 0) {
            aVar.n = Integer.MAX_VALUE;
        }
        aVar.o = jSONObject.getString("url");
        aVar.p = jSONObject.getString("type");
        aVar.q = jSONObject.getString("action");
        aVar.r = jSONObject.getLongValue("timeInterval");
        if (aVar.r < 0) {
            aVar.r = 86400000L;
        } else {
            aVar.r *= 1000;
        }
        return aVar;
    }
}
