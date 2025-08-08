package com.taobao.search.common.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.search.sf.BaseResultActivity;
import com.taobao.tao.util.MyUrlEncoder;
import com.taobao.tao.util.NavUrls;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.noa;
import tb.noo;

/* loaded from: classes7.dex */
public class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2031817208);
    }

    public static void a(Map<String, String> map, Context context, String str, boolean z, Map<String, String> map2, boolean z2) {
        String format;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c691160e", new Object[]{map, context, str, new Boolean(z), map2, new Boolean(z2)});
            return;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        if (!StringUtils.isEmpty(str)) {
            bundle.putString("tab", str);
        }
        String str2 = map.get("q") == null ? "" : map.get("q");
        bundle.putString(noa.KEY_LAYERED_SRP, "true");
        String str3 = NavUrls.nav_urls_auction_search[1];
        if (z2) {
            format = String.format("https://main.m.taobao.com/search/index.html?q=%s", MyUrlEncoder.encod(str2, "UTF-8"));
            map2.put(noa.KEY_POP_UP, "true");
            map2.put("tbsearch_popup_animated", "false");
            map2.put(noa.KEY_POP_UP_HEIGHT, "1");
        } else {
            format = String.format(str3, MyUrlEncoder.encod(str2, "UTF-8"));
        }
        String a2 = y.a(format, map2);
        if (z && (context instanceof Activity)) {
            Nav.from(context).withExtras(bundle).toUri(a2);
            if (u.j()) {
                ((Activity) context).overridePendingTransition(R.anim.tbsearch_anim_slide_right_to_left, R.anim.tbsearch_anim_exit_right_to_left);
                return;
            } else {
                ((Activity) context).overridePendingTransition(0, 0);
                return;
            }
        }
        Nav.from(context).withExtras(bundle).toUri(a2);
    }

    public static void a(Map<String, String> map, Context context, com.taobao.search.sf.datasource.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f03ded5", new Object[]{map, context, cVar});
        } else if (!(context instanceof BaseResultActivity)) {
            q.b("SearchJmp", "当前activity不是搜索结果页，不能使用重搜功能");
        } else {
            HashMap hashMap = new HashMap();
            if (cVar != null) {
                noo.a(hashMap, cVar.getParamsSnapShot());
                String tab = cVar.getTab();
                if (!StringUtils.isEmpty(tab)) {
                    hashMap.put("tab", tab);
                }
            }
            if (map != null && map.size() > 0) {
                hashMap.putAll(map);
            }
            ((BaseResultActivity) context).a(hashMap);
        }
    }

    public static void a(String str, String str2, Map<String, String> map, Activity activity, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a485a25", new Object[]{str, str2, map, activity, str3});
        } else {
            a(str, str2, map, activity, str3, false);
        }
    }

    public static void a(String str, String str2, Map<String, String> map, Activity activity, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ec39d4f", new Object[]{str, str2, map, activity, str3, new Boolean(z)});
        } else if (activity != null) {
            Bundle bundle = new Bundle();
            bundle.putString("q", str);
            if (!StringUtils.isEmpty(str2)) {
                bundle.putString("tab", str2);
            }
            if (!StringUtils.isEmpty(str3)) {
                bundle.putString("searchDoorFrom", str3);
            }
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!StringUtils.isEmpty(key)) {
                        if (value == null) {
                            value = "";
                        }
                        bundle.putString(key, value);
                    }
                }
            }
            String str4 = "true".equals(map.get(noa.KEY_G_POP_UP)) ? "https://main.m.taobao.com/search/index.html?tbsearch_popup=true&tbsearch_popup_animated=false" : NavUrls.NAV_URL_SEARCH_HOME;
            if (z) {
                str4 = Uri.parse(str4).buildUpon().appendQueryParameter(noa.KEY_SEARCHDOOR_LAUNCH_MODE, noa.VALUE_SEARCHDOOR_LAUNCH_MODE_NEW_TASK).build().toString();
            }
            Nav.from(activity).withExtras(bundle).toUri(str4);
            if (Build.VERSION.SDK_INT < 21) {
                return;
            }
            activity.overridePendingTransition(0, 0);
        }
    }
}
