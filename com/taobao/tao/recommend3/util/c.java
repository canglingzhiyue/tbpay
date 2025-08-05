package com.taobao.tao.recommend3.util;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.editionswitcher.l;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.home.component.utils.h;
import com.taobao.android.home.component.utils.j;
import com.taobao.android.jarviswe.Jarvis;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.homepage.launcher.g;
import com.taobao.tao.navigation.model.NavigationTabConstraints;
import com.taobao.tao.recommend.common.FixedSizeList;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.jqm;
import tb.kge;
import tb.ldf;
import tb.nlk;
import tb.nll;
import tb.opb;
import tb.oqc;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, List<String>> f20956a;
    private static Map<String, FixedSizeList<String>> b;
    private static Map<String, String> c;
    private static Map<String, String> d;
    private static Map<String, JSONObject> e;
    private static Map<String, List<String>> f;
    private static Map<String, JSONObject> g;
    private static long h;
    private static Integer i;
    private static String j;
    private static String k;
    private static String l;
    private static String m;
    private static String n;
    private static String o;
    private static String p;
    private static String q;
    private static final Object r;
    private static boolean s;
    private static boolean t;
    private static JSONObject u;
    private static JSONObject v;
    private static boolean w;

    public static int a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("266fb7b", new Object[]{jSONObject})).intValue();
        }
        return -1;
    }

    public static JSONObject a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("eef312bb", new Object[]{new Integer(i2)});
        }
        return null;
    }

    public static boolean a(AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e236be8", new Object[]{awesomeGetContainerData})).booleanValue();
        }
        return true;
    }

    public static JSONObject k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("112303dc", new Object[]{str});
        }
        return null;
    }

    static {
        kge.a(1296668042);
        f20956a = new ConcurrentHashMap(8);
        b = new ConcurrentHashMap(8);
        c = new ConcurrentHashMap(8);
        d = new ConcurrentHashMap(8);
        e = new ConcurrentHashMap(8);
        f = new ConcurrentHashMap(8);
        g = new ConcurrentHashMap(8);
        u = new JSONObject();
        v = new JSONObject();
        h = 0L;
        i = null;
        s = false;
        t = false;
        w = false;
        j = "hTaoHomePage";
        k = h.HOMEPAGE_HTAO;
        l = "cunHomePage";
        m = h.HOMEPAGE_CTAO;
        n = "oldHomePage";
        o = "old";
        p = NavigationTabConstraints.TAB_BIZ_HOMEPAGE;
        q = "main";
        r = new Object();
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            a(str, com.taobao.tao.homepage.d.f(str).g(str));
        }
    }

    public static void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{new Boolean(z), new Boolean(z2)});
            return;
        }
        s = z;
        t = z2;
        ldf.d("RecommendUtils", "productShouldRequestWindVane shouldRequest:" + z + "|enableWindTapOptimize:" + t + "|shouldRequestWindVane:" + s);
    }

    private static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[0]);
            return;
        }
        s = false;
        t = false;
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            w = z;
        }
    }

    private static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[0]);
        } else {
            w = false;
        }
    }

    public static void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6df97b3e", new Object[]{str});
        } else {
            u = JSONObject.parseObject(str);
        }
    }

    public static void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{jSONObject});
        } else {
            v = jSONObject;
        }
    }

    public static void a(String str, List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{str, list});
        } else if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (SectionModel sectionModel : list) {
                if (sectionModel != null) {
                    arrayList.add(sectionModel.getString("sectionBizCode"));
                }
            }
            String c2 = c(str);
            boolean a2 = new nlk(new nll(str, "windvane_request", c2, e(str), f(str), arrayList, 0, 0)).a();
            if (TextUtils.equals(oqc.j().f30287a, str)) {
                a2 = a2 && w;
            }
            if (t) {
                a2 = a2 && s;
            }
            ldf.d("RecommendUtils", "prepareWindvaneParams shouldRequest:" + a2 + "|enableWindTapOptimize:" + t + "|shouldRequestWindVane:" + s);
            if (a2) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("behavioralData", (Object) Jarvis.readKKVCache("gul_detail_action", c2));
                } catch (Throwable unused) {
                }
                jSONObject.put("sectionBizCode", (Object) e(str));
                jSONObject.put("itemId", (Object) c2);
                JSONObject jSONObject2 = v;
                if (jSONObject2 != null) {
                    jSONObject.putAll(jSONObject2);
                }
                JSONObject d2 = d(str);
                if (d2 != null) {
                    jSONObject.putAll(d2);
                }
                if (t) {
                    jSONObject.putAll(u);
                }
                g.put(str, jSONObject);
            } else {
                g.remove(str);
            }
            g();
            h();
        }
    }

    public static JSONObject b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("9d2c0493", new Object[]{str}) : g.get(str);
    }

    public static void a(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d5d0b6a", new Object[]{str, str2, str3, jSONObject});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            Map<String, String> map = c;
            if (str2 == null) {
                str2 = "";
            }
            map.put(str, str2);
            Map<String, String> map2 = d;
            if (str3 == null) {
                str3 = "";
            }
            map2.put(str, str3);
            if (jSONObject == null) {
                return;
            }
            e.put(str, (JSONObject) jSONObject.clone());
        }
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str}) : c.get(str);
    }

    public static JSONObject d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("efd4af15", new Object[]{str}) : e.get(str);
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("666b162a", new Object[]{str}) : d.get(str);
    }

    public static List<String> f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f186af0", new Object[]{str});
        }
        List<String> list = f.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        f.put(str, arrayList);
        return arrayList;
    }

    public static void a(String str, String str2, JSONObject jSONObject) {
        JSONObject jSONObject2;
        List<String> f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf4cf4", new Object[]{str, str2, jSONObject});
        } else if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("ext")) == null || !TextUtils.equals(jSONObject2.getString("sectionType"), "windvaneCard") || (f2 = f(str)) == null) {
        } else {
            h = System.currentTimeMillis();
            f2.add(str2);
        }
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue() : h;
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (TextUtils.isEmpty(str2) || !TextUtils.equals(c.get(str), str2)) {
        } else {
            c.remove(str);
            d.remove(str);
            e.remove(str);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            List<String> list = f20956a.get(str);
            if (list == null) {
                list = new ArrayList<>();
                f20956a.put(str, list);
            }
            list.add(str2);
            c(str, str2);
        }
    }

    private static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
            return;
        }
        try {
            if (i == null) {
                i = Integer.valueOf(j.j());
            }
            if (!TextUtils.isEmpty(str2) && i.intValue() > 0) {
                FixedSizeList<String> fixedSizeList = b.get(str);
                if (fixedSizeList == null) {
                    fixedSizeList = new FixedSizeList<>(i.intValue());
                    b.put(str, fixedSizeList);
                }
                fixedSizeList.add(str2);
            }
        } catch (Throwable th) {
            e.e("RecommendUtils", th.getMessage());
            if (jqm.a()) {
                throw th;
            }
        }
    }

    public static String g(String str) {
        FixedSizeList<String> fixedSizeList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14a6f7e8", new Object[]{str});
        }
        try {
            if (i == null) {
                i = Integer.valueOf(j.j());
            }
            if (i.intValue() > 0 && (fixedSizeList = b.get(str)) != null && !fixedSizeList.isEmpty()) {
                StringBuilder sb = new StringBuilder(fixedSizeList.get(0));
                int size = fixedSizeList.size();
                for (int i2 = 1; i2 < size; i2++) {
                    sb.append(",");
                    sb.append(fixedSizeList.get(i2));
                }
                return sb.toString();
            }
            return "";
        } catch (Throwable th) {
            e.e("RecommendUtils", th.getMessage());
            if (jqm.a()) {
                throw th;
            }
            return "";
        }
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        PositionInfo b2 = l.b(g.a());
        HashMap hashMap = new HashMap();
        hashMap.put("countryId", b2.countryCode);
        hashMap.put("cityId", b2.cityId);
        hashMap.put("countryNumCode", b2.countryNumCode);
        hashMap.put("actualLanguageCode", b2.actualLanguageCode);
        hashMap.put("currencyCode", b2.currencyCode);
        return JSON.toJSONString(hashMap);
    }

    public static String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6bc4e8c7", new Object[]{str});
        }
        if (TextUtils.equals(str, j)) {
            return k;
        }
        if (TextUtils.equals(str, l)) {
            return m;
        }
        if (TextUtils.equals(str, n)) {
            return o;
        }
        return q;
    }

    public static String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2e2d9a6", new Object[]{str});
        }
        return "lastResultVersion_" + str;
    }

    public static String j(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1a00ca85", new Object[]{str}) : b.a(i(h(str)), (String) null);
    }

    public static View a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9c7a352c", new Object[]{view});
        }
        while (view != null && !(view.getParent() instanceof RecyclerView)) {
            view = (View) view.getParent();
        }
        return view;
    }

    public static JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("containerId", (Object) oqc.a().m());
        return jSONObject;
    }

    public static List<SectionModel> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("195b8bfc", new Object[0]);
        }
        String a2 = opb.a(c());
        return com.taobao.tao.homepage.d.f(a2).g(a2);
    }

    public static List<SectionModel> a(List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{list});
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            SectionModel sectionModel = list.get(size);
            if (sectionModel.getBooleanValue(com.taobao.realtimerecommend.j.IS_USER_ACTION_TRACKED)) {
                break;
            }
            arrayList.add(0, sectionModel);
        }
        return arrayList;
    }

    public static List<SectionModel> l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("570816aa", new Object[]{str});
        }
        if (com.taobao.tao.homepage.d.f(str) == null) {
            return null;
        }
        return a(com.taobao.tao.homepage.d.f(str).g(str));
    }

    @Deprecated
    public static List<SectionModel> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fd625b", new Object[0]) : a(d());
    }

    @Deprecated
    public static JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d2e6990d", new Object[0]);
        }
        String a2 = opb.a(c());
        if (a2 != null && com.taobao.tao.homepage.d.f(a2).b(a2) != null) {
            return com.taobao.tao.homepage.d.f(a2).b(a2).getExt();
        }
        return null;
    }

    public static boolean b(String str, List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8aab2c68", new Object[]{str, list})).booleanValue();
        }
        synchronized (r) {
            AwesomeGetContainerData b2 = com.taobao.tao.homepage.d.f(str).b(str);
            if (b2 != null && b2.base != null) {
                b2.base.sections = list;
                List<SectionModel> a2 = opb.a(str, b2, b2);
                if (a2 != null && a2.size() != 0) {
                    b2.totalSectionList = a2;
                }
                return false;
            }
            return true;
        }
    }
}
