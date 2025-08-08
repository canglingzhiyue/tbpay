package tb;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.search.common.util.r;
import com.taobao.search.common.util.y;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import tb.nre;

/* loaded from: classes8.dex */
public class nse {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-810238436);
    }

    public static String a(nsi nsiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("26b3f20c", new Object[]{nsiVar}) : a(nsiVar, "sellerId", "");
    }

    public static String b(nsi nsiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("27609dab", new Object[]{nsiVar}) : a(nsiVar, "shopId", "");
    }

    public static String c(nsi nsiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("280d494a", new Object[]{nsiVar}) : a(nsiVar, noa.KEY_IS_WEEX_SHOP, "false");
    }

    public static String d(nsi nsiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("28b9f4e9", new Object[]{nsiVar}) : a(nsiVar, noa.KEY_MINI_APP, "false");
    }

    public static String e(nsi nsiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2966a088", new Object[]{nsiVar}) : a(nsiVar, noa.KEY_MINI_APP_DETAIL_URL, "");
    }

    public static String f(nsi nsiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a134c27", new Object[]{nsiVar}) : a(nsiVar, noa.KEY_MINI_APP_CATEGORY_URL, "");
    }

    public static String g(nsi nsiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2abff7c6", new Object[]{nsiVar}) : a(nsiVar, "storeId", "");
    }

    public static String h(nsi nsiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2b6ca365", new Object[]{nsiVar}) : a(nsiVar, "localInshopId", "");
    }

    public static String i(nsi nsiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2c194f04", new Object[]{nsiVar}) : a(nsiVar, "photoSearch", "");
    }

    public static String j(nsi nsiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2cc5faa3", new Object[]{nsiVar}) : a(nsiVar, noa.KEY_SHOP_SEARCH_ELDER, "");
    }

    private static String a(nsi nsiVar, String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7639c178", new Object[]{nsiVar, str, str2}) : (nsiVar == null || nsiVar.b() == null || (str3 = nsiVar.b().get(str)) == null) ? str2 : str3;
    }

    public static Map<String, String> k(nsi nsiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("178593d3", new Object[]{nsiVar});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm", "a2141.7631685.0.0");
        if (r.K()) {
            hashMap.put("sellerId", a(nsiVar));
            hashMap.put("shopId", b(nsiVar));
            hashMap.put(noa.KEY_IS_WEEX_SHOP, c(nsiVar));
            hashMap.put(noa.KEY_MINI_APP, d(nsiVar));
            hashMap.put(noa.KEY_MINI_APP_DETAIL_URL, e(nsiVar));
            hashMap.put(noa.KEY_MINI_APP_CATEGORY_URL, f(nsiVar));
            hashMap.put("photoSearch", i(nsiVar));
            hashMap.put(noa.KEY_SHOP_SEARCH_ELDER, j(nsiVar));
            String g = g(nsiVar);
            if (!StringUtils.isEmpty(g)) {
                hashMap.put("storeId", g);
            }
            String h = h(nsiVar);
            if (!StringUtils.isEmpty(h)) {
                hashMap.put("localInshopId", h);
            }
        } else {
            hashMap.putAll(nsiVar.b());
        }
        return hashMap;
    }

    public static void a(nsi nsiVar, Activity activity, String str, Map<String, String> map, iut iutVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c2837d", new Object[]{nsiVar, activity, str, map, iutVar});
        } else if (map == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("query", str);
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(activity, hashMap);
            map.put("q", str);
            if (map.get("spm") == null) {
                map.put("spm", "a2141.7631685.0.0");
            }
            if (r.K()) {
                map.put("sellerId", a(nsiVar));
                map.put("shopId", b(nsiVar));
                map.put(noa.KEY_IS_WEEX_SHOP, c(nsiVar));
                map.put(noa.KEY_MINI_APP, d(nsiVar));
                map.put(noa.KEY_MINI_APP_DETAIL_URL, e(nsiVar));
                map.put(noa.KEY_MINI_APP_CATEGORY_URL, f(nsiVar));
                map.put("photoSearch", i(nsiVar));
                map.put(noa.KEY_SHOP_SEARCH_ELDER, j(nsiVar));
                String g = g(nsiVar);
                if (!StringUtils.isEmpty(g)) {
                    map.put("storeId", g);
                }
                String h = h(nsiVar);
                if (!StringUtils.isEmpty(h)) {
                    map.put("localInshopId", h);
                }
            } else {
                map.putAll(nsiVar.b());
            }
            Nav.from(activity).toUri(y.a("http://shop.m.taobao.com/goods/index.htm", map));
            iutVar.postEvent(nre.e.a(str));
        }
    }

    public static void a(View view) {
        InputMethodManager inputMethodManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{view});
        } else if (view == null || (inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method")) == null) {
        } else {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
