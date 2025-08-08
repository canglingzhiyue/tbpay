package com.taobao.android.detail.ttdetail.utils;

import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.au;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import tb.kge;

/* loaded from: classes5.dex */
public class bp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f10963a;
    private static final List<String> b;

    static {
        kge.a(-535455121);
        f10963a = new ArrayList<String>(2) { // from class: com.taobao.android.detail.ttdetail.utils.NewArchitectureUtils$1
            {
                add("taobao");
                add("itaobao");
            }
        };
        b = new ArrayList<String>(18) { // from class: com.taobao.android.detail.ttdetail.utils.NewArchitectureUtils$2
            {
                add("new.m.taobao.com/detail.htm");
                add("market.m.taobao.com/app/trip/rx-travel-detail/pages/index");
                add("market.m.taobao.com/app/trip/h5-traveldx-detail/pages/index/index.html");
                add("market.m.taobao.com/app/trip/h5-travel-detail/pages/index/index.html");
                add("market.m.taobao.com/app/dinamic/h5-tb-detail/index.html");
                add("market.m.taobao.com/app/mtb/h5-tb-detail-old/index.html");
                add("outfliggys.m.taobao.com/app/trip/rx-travel-detail/pages/index");
                add("fliggyrax.taobao.com/app/trip/rx-travel-detail/pages/index");
                add("detail.ju.taobao.com/home.htm");
                add("jhs.m.taobao.com/m/home.htm");
                add("reader.taobao.com/book/detail.htm");
                add("items.alitrip.com/item.htm");
                add("travelitem.taobao.com/item.htm");
                add("main.wapa.taobao.com/security-h5-detail/home");
                add("main.m.taobao.com/security-h5-detail/home");
                add("h5.m.taobao.com/trip/travel-detail/index/index.html");
                add("h5.m.taobao.com/trip/traveldx-detail/index/index.html");
                add("h5.m.taobao.com/jump/ratedetail");
            }
        };
    }

    public static boolean a(Intent intent) {
        Uri data;
        String str;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{intent})).booleanValue();
        }
        if (intent == null || (data = intent.getData()) == null) {
            return false;
        }
        if (Boolean.TRUE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sForceNewArchitecture))) {
            return true;
        }
        String scheme = data.getScheme();
        String authority = data.getAuthority();
        String path = data.getPath();
        List<String> S = j.S();
        boolean z2 = j.T() && a(f10963a, S) && a(S, scheme);
        List<String> U = j.U();
        if (j.V() && a(b, U)) {
            if (StringUtils.isEmpty(authority) || StringUtils.isEmpty(path)) {
                str = null;
            } else {
                str = authority + path;
            }
            if (a(U, str)) {
                z = true;
            }
        }
        if (!StringUtils.isEmpty(authority) && !StringUtils.isEmpty(path)) {
            if (b.contains(authority + path) && z) {
                return true;
            }
        }
        if (!StringUtils.isEmpty(scheme) && f10963a.contains(scheme) && z2) {
            return true;
        }
        return j.W();
    }

    private static boolean a(List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78fe44e", new Object[]{list, list2})).booleanValue();
        }
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            for (String str : list2) {
                for (String str2 : list) {
                    if (!StringUtils.isEmpty(str2) && !StringUtils.isEmpty(str) && StringUtils.equals(str2, str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean a(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c6e0ee7", new Object[]{list, str})).booleanValue();
        }
        if (list != null && !list.isEmpty() && !StringUtils.isEmpty(str)) {
            return list.contains(str);
        }
        return false;
    }

    public static boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f32d06c", new Object[]{jSONObject, jSONObject2})).booleanValue();
        }
        if (jSONObject != null) {
            String string = jSONObject.getString("blackConditions");
            String string2 = jSONObject.getString("eventBlackConditions");
            if (!StringUtils.isEmpty(string) && b(string, jSONObject2)) {
                return true;
            }
            if (!StringUtils.isEmpty(string2) && a(string2, jSONObject2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(String str, JSONObject jSONObject) {
        JSONObject e;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONArray jSONArray;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6635bd02", new Object[]{str, jSONObject})).booleanValue();
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            String[] split = str.split("/");
            if (split.length > 0 && (e = g.e(jSONObject)) != null && !e.isEmpty() && (jSONObject2 = e.getJSONObject("hierarchy")) != null && !jSONObject2.isEmpty() && (jSONObject3 = jSONObject2.getJSONObject("structure")) != null && !jSONObject3.isEmpty() && (jSONArray = jSONObject3.getJSONArray(jSONObject2.getString("root"))) != null && !jSONArray.isEmpty() && (jSONObject4 = e.getJSONObject("data")) != null && !jSONObject4.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    int size = jSONArray.size();
                    for (int i = 0; i < size; i++) {
                        if (a(jSONArray.getString(i), jSONObject3, jSONObject4, split, linkedHashSet)) {
                            return true;
                        }
                    }
                    return false;
                } finally {
                    i.a("NewArchitectureUtils", "filterEvents: " + linkedHashSet.toString());
                }
            }
        }
        return false;
    }

    private static boolean a(JSONObject jSONObject, String[] strArr, Set<String> set) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfff314c", new Object[]{jSONObject, strArr, set})).booleanValue();
        }
        if (jSONObject != null && !jSONObject.isEmpty() && (jSONObject2 = jSONObject.getJSONObject("events")) != null && !jSONObject2.isEmpty()) {
            for (String str : jSONObject2.keySet()) {
                JSONArray jSONArray = jSONObject2.getJSONArray(str);
                if (jSONArray != null) {
                    int size = jSONArray.size();
                    for (int i = 0; i < size; i++) {
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                        if (jSONObject3 != null) {
                            String string = jSONObject3.getString("type");
                            if (!StringUtils.isEmpty(string)) {
                                set.add(string);
                            }
                            for (String str2 : strArr) {
                                if (!StringUtils.isEmpty(str2) && StringUtils.equals(str2, string)) {
                                    return true;
                                }
                            }
                            continue;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    private static boolean a(String str, JSONObject jSONObject, JSONObject jSONObject2, String[] strArr, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9de5c0f6", new Object[]{str, jSONObject, jSONObject2, strArr, set})).booleanValue();
        }
        if (a(jSONObject2.getJSONObject(str), strArr, set)) {
            return true;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        if (jSONArray != null && !jSONArray.isEmpty()) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                if (a(jSONArray.getString(i), jSONObject, jSONObject2, strArr, set)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("676c0fe1", new Object[]{str, jSONObject})).booleanValue();
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            String[] split = str.split("/");
            if (split.length <= 0) {
                return false;
            }
            for (String str2 : split) {
                if (!StringUtils.isEmpty(str2) && c(str2, jSONObject)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean c(String str, JSONObject jSONObject) {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68a262c0", new Object[]{str, jSONObject})).booleanValue();
        }
        String[] split = str.split("\\.");
        if (split.length < 2 || !StringUtils.equals("data", split[0])) {
            return false;
        }
        if (StringUtils.equals("apiStack[]", split[1])) {
            a2 = au.b.a((String[]) Arrays.copyOfRange(split, 2, split.length), g.e(jSONObject));
        } else {
            a2 = au.b.a((String[]) Arrays.copyOfRange(split, 1, split.length), jSONObject);
        }
        return (bi.a(a2) && bi.b(a2)) || bi.a(a2);
    }
}
