package com.alibaba.triver.triver_shop.newShop.ext;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;

/* loaded from: classes3.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Object f3849a;

    static {
        kge.a(-576710285);
        f3849a = new Object();
    }

    public static final JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{str});
        }
        try {
            return JSONObject.parseObject(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final JSONArray b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("fe97466b", new Object[]{str});
        }
        try {
            return JSONObject.parseArray(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final JSONObject a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("9797964f", new Object[]{bArr}) : a(b.a(bArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T a(JSONObject jSONObject, Class<T> clazz) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("38839b1d", new Object[]{jSONObject, clazz});
        }
        q.d(clazz, "clazz");
        T t = null;
        try {
            Result.a aVar = Result.Companion;
            if (jSONObject != null) {
                t = jSONObject.toJavaObject(clazz);
            }
            Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            Result.m2371constructorimpl(kotlin.i.a(th));
        }
        return t;
    }

    public static final String a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("731d6f8e", new Object[]{jSONObject, str});
        }
        if (jSONObject != null) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static final JSONObject b(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7af4d51", new Object[]{jSONObject, str});
        }
        if (jSONObject != null) {
            return jSONObject.getJSONObject(str);
        }
        return null;
    }

    public static final Object a(JSONArray jSONArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6fb70c1f", new Object[]{jSONArray, new Integer(i)});
        }
        q.d(jSONArray, "<this>");
        if (!d(jSONArray, i)) {
            return jSONArray.get(i);
        }
        return null;
    }

    public static final JSONObject b(JSONArray jSONArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6d82ff32", new Object[]{jSONArray, new Integer(i)});
        }
        q.d(jSONArray, "<this>");
        if (!d(jSONArray, i)) {
            return jSONArray.getJSONObject(i);
        }
        return null;
    }

    public static final JSONArray c(JSONArray jSONArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("93888b6d", new Object[]{jSONArray, new Integer(i)});
        }
        q.d(jSONArray, "<this>");
        if (!d(jSONArray, i)) {
            return jSONArray.getJSONArray(i);
        }
        return null;
    }

    public static final boolean d(JSONArray jSONArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a2e5554", new Object[]{jSONArray, new Integer(i)})).booleanValue();
        }
        q.d(jSONArray, "<this>");
        return i >= jSONArray.size();
    }

    public static final String c(JSONObject jSONObject, String str) {
        String string;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1353d90", new Object[]{jSONObject, str}) : (jSONObject == null || (string = jSONObject.getString(str)) == null) ? "" : string;
    }

    public static final JSONObject a(Pair<String, ? extends Object>... pairs) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ad92770c", new Object[]{pairs});
        }
        q.d(pairs, "pairs");
        JSONObject jSONObject = new JSONObject();
        for (Pair<String, ? extends Object> pair : pairs) {
            jSONObject.put((JSONObject) pair.getFirst(), (String) pair.getSecond());
        }
        return jSONObject;
    }
}
