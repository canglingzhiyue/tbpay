package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import tb.gmf;

/* loaded from: classes.dex */
public class gka {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-543956730);
    }

    public static void a(JSONObject jSONObject, Object obj, gjz gjzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a471387d", new Object[]{jSONObject, obj, gjzVar});
        } else if (jSONObject != null) {
            HashMap hashMap = new HashMap();
            for (String str : jSONObject.keySet()) {
                Object obj2 = jSONObject.get(str);
                if (obj2 instanceof JSONObject) {
                    a((JSONObject) obj2, obj, gjzVar);
                } else if (obj2 instanceof List) {
                    a((List) obj2, obj, gjzVar);
                } else if (obj2 instanceof String) {
                    hashMap.put(str, a((String) obj2, obj, gjzVar));
                }
            }
            if (hashMap.isEmpty()) {
                return;
            }
            jSONObject.putAll(hashMap);
        }
    }

    public static void a(List list, Object obj, gjz gjzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caafd30e", new Object[]{list, obj, gjzVar});
        } else if (list != null) {
            HashMap hashMap = new HashMap();
            for (Object obj2 : list) {
                if (obj2 instanceof JSONObject) {
                    a((JSONObject) obj2, obj, gjzVar);
                } else if (obj2 instanceof List) {
                    a((List) obj2, obj, gjzVar);
                } else if (obj2 instanceof String) {
                    hashMap.put(obj2, a((String) obj2, obj, gjzVar));
                }
            }
            if (hashMap.isEmpty()) {
                return;
            }
            for (Object obj3 : hashMap.keySet()) {
                int indexOf = list.indexOf(obj3);
                if (indexOf >= 0) {
                    list.set(indexOf, hashMap.get(obj3));
                }
            }
        }
    }

    public static Object a(String str, Object obj, gjz gjzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("9624f16b", new Object[]{str, obj, gjzVar}) : gmd.a(str, new gmf.a().b(obj).a(gjzVar).a(gme.a()).a());
    }
}
