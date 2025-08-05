package com.taobao.android.weex_framework.module.builtin.storage;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1542751783);
    }

    public static Map<String, Object> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str});
        }
        JSONObject jSONObject = new JSONObject(4);
        jSONObject.put((JSONObject) "result", str != null ? "success" : "failed");
        if (str == null) {
            str = "undefined";
        }
        jSONObject.put((JSONObject) "data", str);
        return jSONObject;
    }

    public static Map<String, Object> a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("913778a1", new Object[]{new Boolean(z)});
        }
        JSONObject jSONObject = new JSONObject(4);
        jSONObject.put((JSONObject) "result", z ? "success" : "failed");
        jSONObject.put((JSONObject) "data", "undefined");
        return jSONObject;
    }

    public static Map<String, Object> b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("78d94f00", new Object[]{new Boolean(z)});
        }
        JSONObject jSONObject = new JSONObject(4);
        jSONObject.put((JSONObject) "result", z ? "success" : "failed");
        jSONObject.put((JSONObject) "data", "undefined");
        return jSONObject;
    }

    public static Map<String, Object> a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("86999891", new Object[]{new Long(j)});
        }
        JSONObject jSONObject = new JSONObject(4);
        jSONObject.put((JSONObject) "result", "success");
        jSONObject.put((JSONObject) "data", (String) Long.valueOf(j));
        return jSONObject;
    }

    public static Map<String, Object> a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("71436bce", new Object[]{list});
        }
        if (list == null) {
            list = new ArrayList<>(1);
        }
        JSONObject jSONObject = new JSONObject(4);
        jSONObject.put((JSONObject) "result", "success");
        jSONObject.put((JSONObject) "data", (String) list);
        return jSONObject;
    }

    private static void a(com.taobao.android.weex.b bVar, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7627f78", new Object[]{bVar, str, obj});
        } else if (bVar == null) {
        } else {
            JSONObject jSONObject = new JSONObject(4);
            jSONObject.put((JSONObject) "result", str);
            jSONObject.put((JSONObject) "data", (String) obj);
            bVar.a(jSONObject);
        }
    }

    public static void a(com.taobao.android.weex.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("973d4552", new Object[]{bVar});
        } else {
            a(bVar, "failed", "invalid_param");
        }
    }
}
