package com.taobao.themis.kernel.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006JA\u0010\u0007\u001a\u00020\b22\u0010\t\u001a\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b0\n\"\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0007¢\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0007J.\u0010\u000e\u001a\n\u0012\u0004\u0012\u0002H\u0010\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0012H\u0007J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0007¨\u0006\u0014"}, d2 = {"Lcom/taobao/themis/kernel/utils/JSONExt;", "", "()V", "buildJSONArray", "Lcom/alibaba/fastjson/JSONArray;", "list", "", "buildJSONObject", "Lcom/alibaba/fastjson/JSONObject;", "pairs", "", "Lkotlin/Pair;", "", "([Lkotlin/Pair;)Lcom/alibaba/fastjson/JSONObject;", "safeParseJSONArray", "data", "T", "clazz", "Ljava/lang/Class;", "safeParseJSONObject", "themis_kernel_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final f INSTANCE;

    static {
        kge.a(1641713279);
        INSTANCE = new f();
    }

    private f() {
    }

    @JvmStatic
    public static final JSONObject a(Pair<String, ? extends Object>... pairs) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ad92770c", new Object[]{pairs});
        }
        kotlin.jvm.internal.q.d(pairs, "pairs");
        JSONObject jSONObject = new JSONObject();
        for (Pair<String, ? extends Object> pair : pairs) {
            jSONObject.put((JSONObject) pair.getFirst(), (String) pair.getSecond());
        }
        return jSONObject;
    }

    @JvmStatic
    public static final JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{str});
        }
        JSONObject jSONObject = null;
        try {
            return JSONObject.parseObject(str);
        } catch (Exception e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    @JvmStatic
    public static final JSONArray b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("fe97466b", new Object[]{str});
        }
        JSONArray jSONArray = null;
        try {
            return JSONObject.parseArray(str);
        } catch (Exception e) {
            e.printStackTrace();
            return jSONArray;
        }
    }

    @JvmStatic
    public static final <T> List<T> a(String str, Class<T> clazz) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f26a7d9c", new Object[]{str, clazz});
        }
        kotlin.jvm.internal.q.d(clazz, "clazz");
        try {
            return JSONObject.parseArray(str, clazz);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final JSONArray a(List<? extends Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("8bdb05c5", new Object[]{this, list});
        }
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            for (Object obj : list) {
                jSONArray.add(obj);
            }
        }
        return jSONArray;
    }
}
