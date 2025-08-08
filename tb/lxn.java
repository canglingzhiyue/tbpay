package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.h;
import com.taobao.informationflowdataservice.dataservice.bizcode.model.FixedSizeList;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.navigation.model.NavigationTabConstraints;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class lxn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, List<String>> f30972a;
    private static Map<String, FixedSizeList<String>> b;
    private static Map<String, String> c;
    private static Map<String, String> d;
    private static Map<String, JSONObject> e;
    private static Map<String, List<String>> f;
    private static Map<String, JSONObject> g;
    private static Map<String, Long> h;
    private static Integer i;
    private static String j;
    private static String k;
    private static String l;
    private static String m;
    private static String n;
    private static String o;
    private static String p;
    private static String q;

    static {
        kge.a(-203082588);
        f30972a = new ConcurrentHashMap(8);
        b = new ConcurrentHashMap(8);
        c = new ConcurrentHashMap(8);
        d = new ConcurrentHashMap(8);
        e = new ConcurrentHashMap(8);
        f = new ConcurrentHashMap(8);
        g = new ConcurrentHashMap(8);
        h = new ConcurrentHashMap(8);
        i = 100;
        j = "hTaoHomePage";
        k = h.HOMEPAGE_HTAO;
        l = "cunHomePage";
        m = h.HOMEPAGE_CTAO;
        n = "oldHomePage";
        o = "old";
        p = NavigationTabConstraints.TAB_BIZ_HOMEPAGE;
        q = "main";
    }

    public static void a(lwd lwdVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4b17c09", new Object[]{lwdVar, str});
        } else {
            a(str, lwdVar.e(str));
        }
    }

    private static void a(String str, List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{str, list});
        } else if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (SectionModel sectionModel : list) {
                arrayList.add(sectionModel.getString("sectionBizCode"));
            }
            String c2 = c(str);
            if (new lxy(new lxz(str, "windvane_request", c2, e(str), b(str), arrayList, 0, 0)).a()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("sectionBizCode", (Object) e(str));
                jSONObject.put("itemId", (Object) c2);
                JSONObject d2 = d(str);
                if (d2 != null) {
                    jSONObject.putAll(d2);
                }
                g.put(str, jSONObject);
                return;
            }
            g.remove(str);
        }
    }

    public static JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{str}) : g.get(str);
    }

    private static String c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str}) : c.get(str);
    }

    private static JSONObject d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("efd4af15", new Object[]{str}) : e.get(str);
    }

    private static String e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("666b162a", new Object[]{str}) : d.get(str);
    }

    public static List<String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("89cdf874", new Object[]{str});
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
        List<String> b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf4cf4", new Object[]{str, str2, jSONObject});
        } else if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("ext")) == null || !StringUtils.equals(jSONObject2.getString("sectionType"), "windvaneCard") || (b2 = b(str)) == null) {
        } else {
            h.put(str, Long.valueOf(System.currentTimeMillis()));
            b2.add(str2);
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (StringUtils.isEmpty(str2) || !StringUtils.equals(c.get(str), str2)) {
        } else {
            c.remove(str);
            d.remove(str);
            e.remove(str);
        }
    }
}
