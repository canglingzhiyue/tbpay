package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
public class lat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HOME_PAGE = "Page_Home";

    /* renamed from: a  reason: collision with root package name */
    private static String f30436a;

    static {
        kge.a(-293151417);
    }

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
        } else if (jSONObject == null) {
            lap.a("TapGlobalSceneUtUtils", "beginScene", "tapItem is null");
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("clickParam");
            if (jSONObject2 == null) {
                lap.a("TapGlobalSceneUtUtils", "beginScene", "clickParams is null");
                return;
            }
            String b = b(jSONObject2);
            if (!"Page_Home".equals(b)) {
                lap.a("TapGlobalSceneUtUtils", "beginScene", "scene : " + b);
                return;
            }
            Map<String, String> c = c(jSONObject2);
            if (c == null) {
                lap.a("TapGlobalSceneUtUtils", "beginScene", "properties is null");
            } else {
                las.a(b, null, null, c);
            }
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            las.a(str);
        }
    }

    private static String b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{jSONObject}) : jSONObject.getString("page");
    }

    private static Map<String, String> c(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8707747b", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("multiPageUtParams");
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            lap.a("TapGlobalSceneUtUtils", "parseMultiPageUtParams", "multiPageUtParams is null");
            return null;
        }
        HashMap hashMap = new HashMap(2);
        Iterator<Map.Entry<String, Object>> it = jSONObject2.entrySet().iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, Object> next = it.next();
            String key = next.getKey();
            if (next.getValue() != null) {
                str = next.getValue().toString();
            }
            hashMap.put(key, str);
        }
        String str2 = f30436a;
        if (str2 == null) {
            str2 = str;
        }
        hashMap.put(ood.HOME_BUCKETS, str2);
        return hashMap;
    }
}
