package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.navigationextern.f;
import com.taobao.tao.navigation.g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class hus {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Map<String, f> a(String str) {
        JSONObject parseObject;
        Integer integer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                hut.b("ItemInfoUtil", " parseTabFromJson failed. tabJsonInfo string is null");
                return null;
            }
            hut.b("ItemInfoUtil", "parse tab json info: " + str);
            JSONObject parseObject2 = JSONObject.parseObject(str);
            if (parseObject2 == null) {
                hut.b("ItemInfoUtil", " parseTabFromJson failed. jsonTabs is null");
                return null;
            } else if (!parseObject2.containsKey("nav_tab_configs")) {
                hut.b("ItemInfoUtil", " parseTabFromJson failed. jsonTabs don't containsKey; " + parseObject2);
                return null;
            } else {
                JSONArray jSONArray = parseObject2.getJSONArray("nav_tab_configs");
                if (jSONArray == null) {
                    hut.b("ItemInfoUtil", " parseTabFromJson failed. jsonArray is null");
                    return null;
                }
                HashMap hashMap = new HashMap(1);
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if ((next instanceof String) && (integer = (parseObject = JSONObject.parseObject((String) next)).getInteger("nav_tab_index")) != null) {
                        f.a aVar = new f.a();
                        aVar.a(integer.intValue()).a(parseObject.getString("nav_tab_title")).a(parseObject.get("nav_tab_icon_unselected")).b(parseObject.get("nav_tab_icon_selected")).d(parseObject.getString("nav_tab_fragment_name")).b(parseObject.getIntValue("nav_tab_icon_type"));
                        hashMap.put(String.valueOf(integer), aVar.b());
                    }
                }
                return hashMap;
            }
        } catch (Exception e) {
            hut.b("ItemInfoUtil", " parseTabFromJson failed. exception is " + e.toString() + " error str is " + str);
            StringBuilder sb = new StringBuilder();
            sb.append(e.toString());
            sb.append(str);
            omr.a("cache_error", sb.toString());
            return null;
        }
    }

    private static String a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9fb4305", new Object[]{fVar});
        }
        if (fVar == null) {
            hut.b("ItemInfoUtil", "tab config is null");
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("nav_tab_icon_selected", fVar.d());
        jSONObject.put("nav_tab_icon_unselected", fVar.c());
        jSONObject.put("nav_tab_icon_type", (Object) Integer.valueOf(fVar.e()));
        jSONObject.put("nav_tab_index", (Object) Integer.valueOf(fVar.a()));
        jSONObject.put("nav_tab_title", (Object) fVar.b());
        jSONObject.put("nav_tab_fragment_name", (Object) fVar.h());
        return jSONObject.toJSONString();
    }

    public static String a(Map<String, f> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (String str : map.keySet()) {
            jSONArray.add(a(map.get(str)));
        }
        jSONObject.put("nav_tab_configs", (Object) jSONArray);
        return jSONObject.toJSONString();
    }

    public static f a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("6e658680", new Object[]{gVar});
        }
        if (gVar == null) {
            hut.b("ItemInfoUtil", "getTabInfoFromTab failed. tab is null");
            return null;
        }
        f.a aVar = new f.a();
        aVar.e(gVar.t()).c(gVar.j()).h("").d(gVar.k()).b(gVar.d().second).a(gVar.d().first).b(gVar.n().ordinal()).a(gVar.c()).a(gVar.s()).g("").f("").a(gVar.o()).b("");
        return aVar.a();
    }

    public static boolean a(f fVar, f fVar2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9a407d0c", new Object[]{fVar, fVar2})).booleanValue() : fVar != null && fVar2 != null && fVar.a() == fVar2.a() && TextUtils.equals(fVar.b(), fVar2.b()) && fVar.d() == fVar2.d() && fVar.c() == fVar2.c() && TextUtils.equals(fVar.h(), fVar2.h()) && fVar.e() == fVar2.e();
    }
}
