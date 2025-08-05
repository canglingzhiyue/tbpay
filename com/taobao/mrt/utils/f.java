package com.taobao.mrt.utils;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.MRTRuntimeException;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import tb.kge;

/* loaded from: classes7.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(764700243);
    }

    public static void a(Closeable... closeableArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94717f1e", new Object[]{closeableArr});
        } else if (closeableArr != null) {
            for (Closeable closeable : closeableArr) {
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (IOException e) {
                        a.b("Util", e.getMessage(), e);
                    }
                }
            }
        }
    }

    public static String a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        return "" + obj;
    }

    public static boolean b(Object obj) throws MRTRuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f056ab89", new Object[]{obj})).booleanValue();
        }
        if (obj != null && (obj instanceof String)) {
            return true;
        }
        throw new MRTRuntimeException(82, "config error");
    }

    public static Map<String, Object> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str}) : a(JSONObject.parseObject(str));
    }

    public static Map<String, Object> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2b563fbd", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        for (String str : jSONObject.keySet()) {
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONArray) {
                ArrayList arrayList = new ArrayList();
                Iterator<Object> it = ((JSONArray) obj).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JSONObject) {
                        arrayList.add(a((JSONObject) next));
                    } else {
                        arrayList.add(next);
                    }
                }
                hashMap.put(str.toString(), arrayList);
            } else if (obj instanceof JSONObject) {
                hashMap.put(a((Object) str), a((JSONObject) obj));
            } else {
                hashMap.put(str.toString(), obj);
            }
        }
        return hashMap;
    }

    public static HashMap<String, Object> b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("30adc416", new Object[]{str}) : b(JSONObject.parseObject(str));
    }

    public static HashMap<String, Object> b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("1413b1ca", new Object[]{jSONObject});
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        for (String str : jSONObject.keySet()) {
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONArray) {
                Vector vector = new Vector();
                Iterator<Object> it = ((JSONArray) obj).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JSONObject) {
                        vector.add(b((JSONObject) next));
                    } else {
                        vector.add(next);
                    }
                }
                hashMap.put(str.toString(), vector);
            } else if (obj instanceof JSONObject) {
                hashMap.put(a((Object) str), b((JSONObject) obj));
            } else {
                hashMap.put(str.toString(), obj);
            }
        }
        return hashMap;
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : (context.getApplicationInfo().flags & 2) != 0;
    }
}
