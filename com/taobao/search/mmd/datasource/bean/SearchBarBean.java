package com.taobao.search.mmd.datasource.bean;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.g;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class SearchBarBean implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_SEARCH = "search";
    public static final String TYPE_TITLE = "title";
    public String icon;
    public String info;
    public String suffixIcon;
    public float suffixIconRatio;
    public String text;
    public String type;

    static {
        kge.a(-705265689);
        kge.a(1028243835);
    }

    public static SearchBarBean createDefault() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchBarBean) ipChange.ipc$dispatch("92c373d6", new Object[0]);
        }
        SearchBarBean searchBarBean = new SearchBarBean();
        searchBarBean.type = "search";
        return searchBarBean;
    }

    public static SearchBarBean fromJson(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SearchBarBean) ipChange.ipc$dispatch("60c97781", new Object[]{jSONObject});
        }
        SearchBarBean searchBarBean = new SearchBarBean();
        searchBarBean.type = jSONObject.getString("searchType");
        searchBarBean.text = jSONObject.getString("text");
        searchBarBean.icon = jSONObject.getString("icon");
        searchBarBean.info = jSONObject.getString("info");
        searchBarBean.suffixIcon = jSONObject.getString("suffixIcon");
        if (!TextUtils.isEmpty(searchBarBean.suffixIcon)) {
            int b = g.b(jSONObject.getString("width"), 0);
            int b2 = g.b(jSONObject.getString("height"), 0);
            if (b != 0 && b2 != 0) {
                searchBarBean.suffixIconRatio = b / b2;
            }
        }
        return searchBarBean;
    }
}
