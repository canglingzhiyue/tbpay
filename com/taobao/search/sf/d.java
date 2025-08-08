package com.taobao.search.sf;

import android.app.Application;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.themis.ThemisConfig;
import com.taobao.search.common.SearchSdk;
import com.taobao.search.common.util.u;
import com.taobao.search.sf.widgets.searchbar.SearchBarTagBean;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.noa;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1957568564);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        SearchSdk.init();
        com.taobao.android.searchbaseframe.util.k.a().b("SearchOutLinkPreloadJob", "preload init start");
        if (hashMap == null) {
            com.taobao.android.searchbaseframe.util.k.a().b("SearchOutLinkPreloadJob", "params is null， 预加载异常");
            return;
        }
        Object obj = hashMap.get("startIntent");
        if (!(obj instanceof String)) {
            com.taobao.android.searchbaseframe.util.k.a().b("SearchOutLinkPreloadJob", "the dpLink is not instance of String");
            return;
        }
        Uri parse = Uri.parse((String) obj);
        if (parse == null) {
            com.taobao.android.searchbaseframe.util.k.a().b("SearchOutLinkPreloadJob", "dateUri is null");
            return;
        }
        Map<String, String> a2 = com.taobao.android.searchbaseframe.util.f.a(parse);
        a(a2);
        if (!a2.containsKey(noa.KEY_SRP_SEARCH_BAR_TAG_STYLE) && u.e()) {
            a2.put(noa.KEY_SRP_SEARCH_BAR_TAG_STYLE, "true");
        }
        com.taobao.android.searchbaseframe.util.k.a().b("SearchOutLinkPreloadJob", "fireFirstSearch 调用");
    }

    private static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            return;
        }
        String remove = map.remove(com.taobao.search.common.util.k.KEY_SEARCH_BAR_TAG);
        if (StringUtils.isEmpty(remove)) {
            return;
        }
        try {
            JSONArray parseArray = JSON.parseArray(remove);
            if (parseArray == null) {
                return;
            }
            StringBuilder sb = new StringBuilder(map.get("q"));
            for (int i = 0; i < parseArray.size(); i++) {
                SearchBarTagBean fromJson = SearchBarTagBean.fromJson(parseArray.getJSONObject(i));
                if (fromJson != null) {
                    Map<String, String> params = fromJson.getParams();
                    if (params != null) {
                        map.putAll(params);
                    }
                    String q = fromJson.getQ();
                    if (!StringUtils.isEmpty(q)) {
                        sb.append(" ");
                        sb.append(q);
                    }
                    map.put("onTag", fromJson.getDescription());
                    map.put("tagAction", ThemisConfig.SCENE_SELECT);
                }
            }
            map.put(noa.KEY_TAG_SEARCH_KEYWORD, sb.toString());
        } catch (Exception unused) {
        }
    }
}
