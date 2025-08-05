package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.LruCache;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class rlz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, HashMap<String, String>> f33231a;
    private static HashMap<String, HashMap<String, String>> b;
    private static HashMap<String, String> c;
    private static HashMap<String, HashMap<String, HashMap<String, HashMap<String, Object>>>> d;
    private static rls i;
    private static rlu j;
    private static Context k;
    private static rlz l;
    private static rly n;
    private HashMap<String, Boolean> e = new HashMap<>();
    private HashMap<String, List<Object>> f = new HashMap<>();
    private HashMap<String, LruCache<String, Integer>> g = new HashMap<>();
    private HashMap<String, HashMap<String, Integer>> h = new HashMap<>();
    private String m = "common";

    static {
        kge.a(-929818765);
        f33231a = new HashMap<>();
        b = new HashMap<>();
        c = new HashMap<>();
        d = new HashMap<>();
        i = null;
        j = null;
        n = rly.a();
    }

    private rlz() {
    }

    public static synchronized rlz a() {
        synchronized (rlz.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rlz) ipChange.ipc$dispatch("f0a1b9e", new Object[0]);
            }
            if (l == null) {
                l = new rlz();
            }
            return l;
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        Context applicationContext = context.getApplicationContext();
        k = applicationContext;
        rmq.a(applicationContext);
        rlx.a().a(k);
        if (rlo.b(k)) {
            return;
        }
        rlx.a().f();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            rly.a().f33229a = str;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            a(str, "");
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            c(rml.a(k, str), str2);
        }
    }

    public HashMap<String, HashMap<String, HashMap<String, Object>>> a(String str, String str2, String str3) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("d9b8c029", new Object[]{this, str, str2, str3});
        }
        HashMap<String, HashMap<String, HashMap<String, Object>>> hashMap = new HashMap<>();
        HashMap<String, HashMap<String, HashMap<String, HashMap<String, Object>>>> hashMap2 = d;
        if (hashMap2 != null && hashMap2.get(str3) != null) {
            hashMap = d.get(str3);
            hashMap.clear();
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject.containsKey("groups") && ((jSONArray = parseObject.getJSONArray("groups")) == null || jSONArray.size() > 0)) {
                this.e.put(str3, true);
                this.f.put(str3, jSONArray.subList(0, jSONArray.size()));
            }
            if (!TextUtils.isEmpty(str2) && parseObject.containsKey(str2)) {
                a(str2, parseObject.getJSONObject(str2), hashMap, str3);
            }
            for (Map.Entry<String, Object> entry : parseObject.entrySet()) {
                String obj = entry.getKey().toString();
                if (!"groups".equals(obj) && (entry.getValue() instanceof JSONObject)) {
                    a(obj, (JSONObject) entry.getValue(), hashMap, str3);
                }
            }
        } catch (Throwable th) {
            rmn.a(th);
        }
        return hashMap;
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        try {
            if (g(str2) != null && g(str2).size() > 0) {
                g(str2).clear();
            }
            for (Map.Entry<String, Object> entry : JSON.parseObject(str).entrySet()) {
                if (entry.getValue() instanceof JSONObject) {
                    for (Map.Entry<String, Object> entry2 : JSON.parseObject(entry.getValue().toString()).entrySet()) {
                        g(str2).put(entry2.getKey().toString(), entry2.getValue().toString());
                    }
                } else {
                    g(str2).put(entry.getKey().toString(), entry.getValue().toString());
                }
            }
        } catch (Throwable th) {
            rmn.a(th);
        }
    }

    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
            return;
        }
        try {
            if (h(str2) != null && h(str2).size() > 0) {
                h(str2).clear();
            }
            for (Map.Entry<String, Object> entry : JSON.parseObject(str).entrySet()) {
                h(str2).put(entry.getKey().toString(), entry.getValue().toString());
            }
        } catch (Throwable th) {
            rmn.a(th);
        }
    }

    public HashMap<String, HashMap<String, Object>> c(String str) {
        HashMap<String, HashMap<String, Object>> hashMap;
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("bd4def17", new Object[]{this, str});
        }
        try {
            parseObject = JSON.parseObject(str);
            hashMap = new HashMap<>();
        } catch (Throwable th) {
            th = th;
            hashMap = null;
        }
        try {
            for (Map.Entry<String, Object> entry : parseObject.entrySet()) {
                if (entry.getValue() instanceof JSONObject) {
                    hashMap.put(entry.getKey().toString(), a(entry.getKey().toString(), (JSONObject) entry.getValue()));
                }
            }
        } catch (Throwable th2) {
            th = th2;
            rmn.a(th);
            return hashMap;
        }
        return hashMap;
    }

    public <T> T a(JSONObject jSONObject, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("38839b1d", new Object[]{this, jSONObject, cls});
        }
        if (jSONObject == null) {
            return null;
        }
        String str = rly.a().c;
        JSONObject jSONObject2 = new JSONObject();
        if (h(str) != null && h(str).size() > 0) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                String obj = entry.getKey().toString();
                String obj2 = entry.getValue().toString();
                if (!TextUtils.isEmpty(obj) && !TextUtils.isEmpty(obj2)) {
                    if (h(str).containsKey(obj)) {
                        obj = h(str).get(obj);
                    }
                    jSONObject2.put(obj, (Object) obj2);
                }
            }
            jSONObject = jSONObject2;
        }
        try {
            return (T) JSONObject.toJavaObject(jSONObject, cls);
        } catch (Throwable th) {
            rmn.a(th);
            return null;
        }
    }

    private void a(String str, JSONObject jSONObject, HashMap<String, HashMap<String, HashMap<String, Object>>> hashMap, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5454fe7f", new Object[]{this, str, jSONObject, hashMap, str2});
        } else {
            a(str, jSONObject, this.m, hashMap, str2);
        }
    }

    private void a(String str, JSONObject jSONObject, String str2, HashMap<String, HashMap<String, HashMap<String, Object>>> hashMap, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7fade75", new Object[]{this, str, jSONObject, str2, hashMap, str3});
        } else if (TextUtils.isEmpty(str) || jSONObject == null) {
        } else {
            if (hashMap == null) {
                hashMap = new HashMap<>();
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = this.m;
            }
            HashMap<String, HashMap<String, Object>> hashMap2 = null;
            if (str2.equals(str) && (hashMap.get(str2) == null || hashMap.get(str2).size() == 0)) {
                hashMap.put(str2, a(str2, jSONObject, str3));
                return;
            }
            if (hashMap.get(str2) != null) {
                hashMap2 = (HashMap) hashMap.get(str2).clone();
            }
            if (hashMap2 == null) {
                hashMap2 = new HashMap<>();
            }
            hashMap2.putAll(a(str, jSONObject, str3));
            hashMap.put(str, hashMap2);
        }
    }

    private HashMap<String, HashMap<String, Object>> a(String str, JSONObject jSONObject, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("ac4d6ab", new Object[]{this, str, jSONObject, str2});
        }
        HashMap<String, HashMap<String, Object>> hashMap = new HashMap<>();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (entry.getValue() instanceof JSONObject) {
                String obj = entry.getKey().toString();
                if (!TextUtils.isEmpty(obj)) {
                    if (this.e.containsKey(str2) && this.e.get(str2).booleanValue()) {
                        hashMap.putAll(b(str, (JSONObject) entry.getValue(), str2));
                    } else {
                        hashMap.put(obj, c(obj, (JSONObject) entry.getValue(), str2));
                    }
                }
            }
        }
        return hashMap;
    }

    private HashMap<String, HashMap<String, Object>> b(String str, JSONObject jSONObject, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("9eb660a", new Object[]{this, str, jSONObject, str2});
        }
        if (TextUtils.isEmpty(str) || jSONObject == null) {
            return null;
        }
        HashMap<String, HashMap<String, Object>> hashMap = new HashMap<>();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (entry != null) {
                String obj = entry.getKey().toString();
                hashMap.put(obj, c(obj, (JSONObject) entry.getValue(), str2));
            }
        }
        return hashMap;
    }

    private HashMap<String, Object> c(String str, JSONObject jSONObject, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("911f569", new Object[]{this, str, jSONObject, str2});
        }
        if (TextUtils.isEmpty(str) || jSONObject == null) {
            return null;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(this.m) && d(str2) != null && d(str2).get(this.m) != null && d(str2).get(this.m).get(str) != null) {
            hashMap.putAll(d(str2).get(this.m).get(str));
        }
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (entry != null) {
                String obj = entry.getKey().toString();
                if (h(str2) != null && h(str2).containsKey(obj)) {
                    obj = h(str2).get(obj);
                }
                hashMap.put(obj, entry.getValue());
            }
        }
        return hashMap;
    }

    public rlu b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rlu) ipChange.ipc$dispatch("16bbc062", new Object[]{this}) : j;
    }

    private HashMap<String, Object> a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("9f66eee1", new Object[]{this, str, jSONObject});
        }
        if (TextUtils.isEmpty(str) || jSONObject == null) {
            return null;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (entry != null) {
                hashMap.put(entry.getKey().toString(), entry.getValue());
            }
        }
        return hashMap;
    }

    public rls c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rls) ipChange.ipc$dispatch("1e6d6583", new Object[]{this}) : i;
    }

    public HashMap<String, HashMap<String, HashMap<String, Object>>> d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("49ee1a18", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            str = rly.a().b;
        }
        HashMap<String, HashMap<String, HashMap<String, HashMap<String, Object>>>> hashMap = d;
        if (hashMap != null && hashMap.size() != 0) {
            return d.get(str);
        }
        return null;
    }

    public HashMap<String, HashMap<String, Object>> d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("8f924222", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            str = "common";
        }
        if (d(str2) != null && d(str2).containsKey(str)) {
            return d(str2).get(str);
        }
        return new HashMap<>();
    }

    public HashMap<String, HashMap<String, Object>> e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("d68e4519", new Object[]{this, str}) : d(str, rly.a().c);
    }

    public void a(JSONObject jSONObject, String str, String str2, String str3, rlv rlvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("470470da", new Object[]{this, jSONObject, str, str2, str3, rlvVar});
        } else {
            a(jSONObject, str, str2, str3, rlvVar, "");
        }
    }

    public void a(JSONObject jSONObject, String str, String str2, String str3, rlv rlvVar, String str4) {
        HashMap<String, HashMap<String, HashMap<String, HashMap<String, Object>>>> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ea4d824", new Object[]{this, jSONObject, str, str2, str3, rlvVar, str4});
        } else if (jSONObject == null) {
        } else {
            if (TextUtils.isEmpty(str4)) {
                str4 = rly.a().b;
            }
            if (!TextUtils.isEmpty(str3) && str3.equals(c.get(str4)) && (hashMap = d) != null && hashMap.get(str4) != null && d.get(str4).size() > 0) {
                return;
            }
            try {
                if (jSONObject.containsKey(str)) {
                    b(jSONObject.getJSONObject(str).toJSONString(), str4);
                }
                if (jSONObject.containsKey(str2)) {
                    d.put(str4, a(jSONObject.getJSONObject(str2).toJSONString(), "common", str4));
                }
                c.put(str4, str3);
            } catch (Throwable th) {
                rmn.a(th);
            }
        }
    }

    public HashMap<String, Integer> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("9d11238e", new Object[]{this}) : f("");
    }

    public HashMap<String, Integer> f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("632e701a", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            str = rly.a().b;
        }
        return this.h.get(str) == null ? new HashMap<>() : this.h.get(str);
    }

    public LruCache<String, Integer> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("6875001d", new Object[]{this});
        }
        String str = rly.a().c;
        if (this.g.get(str) == null) {
            this.g.put(str, new LruCache<>(1024));
        }
        return this.g.get(str);
    }

    public HashMap<String, String> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("31745610", new Object[]{this}) : g("");
    }

    public HashMap<String, String> g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("efce9b1b", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            str = rly.a().b;
        }
        if (f33231a.get(str) == null) {
            f33231a.put(str, new HashMap<>());
        }
        return f33231a.get(str);
    }

    public HashMap<String, String> h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("7c6ec61c", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            str = rly.a().b;
        }
        if (b.get(str) == null) {
            b.put(str, new HashMap<>());
        }
        return b.get(str);
    }

    public List<Object> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d0410f19", new Object[]{this}) : i("");
    }

    public List<Object> i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("331040cd", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            str = rly.a().b;
        }
        return this.f.get(str) == null ? new ArrayList() : this.f.get(str);
    }
}
