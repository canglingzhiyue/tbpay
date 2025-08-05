package com.taobao.themis.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.bkm;
import tb.kge;
import tb.rul;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u0019\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0001\u001a\u001e\u0010\b\u001a\u00020\t*\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000b\u001a\u001e\u0010\f\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000b\u001a0\u0010\r\u001a\u00020\u000e*\u00020\u00022\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000e0\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u001a6\u0010\u0013\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\t2\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010\u0012\u001a\u00020\u0004¨\u0006\u0015"}, d2 = {"getBooleanSafely", "", "Lcom/alibaba/fastjson/JSONObject;", "key", "", "(Lcom/alibaba/fastjson/JSONObject;Ljava/lang/String;)Ljava/lang/Boolean;", "getBooleanWithDefault", "default", "processJsonArray", "Lcom/alibaba/fastjson/JSONArray;", "replacement", "Lkotlin/Function1;", "processJsonObject", "traverseJson", "", "action", "Lkotlin/Function2;", "", bkm.PARSER_KEY_PARENT_KEY, "traverseJsonArray", "array", "themis_utils_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1932372412);
    }

    public static final Boolean a(JSONObject getBooleanSafely, String key) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("fd24f44f", new Object[]{getBooleanSafely, key});
        }
        kotlin.jvm.internal.q.d(getBooleanSafely, "$this$getBooleanSafely");
        kotlin.jvm.internal.q.d(key, "key");
        Object obj = getBooleanSafely.get(key);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (!(obj instanceof String)) {
            return null;
        }
        return Boolean.valueOf(Boolean.parseBoolean((String) obj));
    }

    public static final boolean a(JSONObject getBooleanWithDefault, String key, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8e3c9c6", new Object[]{getBooleanWithDefault, key, new Boolean(z)})).booleanValue();
        }
        kotlin.jvm.internal.q.d(getBooleanWithDefault, "$this$getBooleanWithDefault");
        kotlin.jvm.internal.q.d(key, "key");
        try {
            Boolean bool = getBooleanWithDefault.getBoolean(key);
            return bool != null ? bool.booleanValue() : z;
        } catch (Exception unused) {
            return z;
        }
    }

    public static final JSONObject a(JSONObject processJsonObject, rul<? super String, String> replacement) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bbd159ef", new Object[]{processJsonObject, replacement});
        }
        kotlin.jvm.internal.q.d(processJsonObject, "$this$processJsonObject");
        kotlin.jvm.internal.q.d(replacement, "replacement");
        JSONObject jSONObject = new JSONObject();
        for (String key : processJsonObject.keySet()) {
            kotlin.jvm.internal.q.b(key, "key");
            String mo2421invoke = replacement.mo2421invoke(key);
            Object obj = processJsonObject.get(key);
            if (obj instanceof JSONObject) {
                jSONObject.put((JSONObject) mo2421invoke, (String) a((JSONObject) obj, replacement));
            } else if (obj instanceof JSONArray) {
                jSONObject.put((JSONObject) mo2421invoke, (String) a((JSONArray) obj, replacement));
            } else if (obj instanceof String) {
                jSONObject.put((JSONObject) mo2421invoke, replacement.mo2421invoke(obj));
            } else {
                jSONObject.put((JSONObject) mo2421invoke, replacement.mo2421invoke(String.valueOf(obj)));
            }
        }
        return jSONObject;
    }

    public static final JSONArray a(JSONArray processJsonArray, rul<? super String, String> replacement) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("d507287", new Object[]{processJsonArray, replacement});
        }
        kotlin.jvm.internal.q.d(processJsonArray, "$this$processJsonArray");
        kotlin.jvm.internal.q.d(replacement, "replacement");
        JSONArray jSONArray = new JSONArray();
        int size = processJsonArray.size();
        for (int i = 0; i < size; i++) {
            Object obj = processJsonArray.get(i);
            if (obj instanceof JSONObject) {
                jSONArray.add(a((JSONObject) obj, replacement));
            } else if (obj instanceof JSONArray) {
                jSONArray.add(a((JSONArray) obj, replacement));
            } else if (obj instanceof String) {
                jSONArray.add(replacement.mo2421invoke(obj));
            } else {
                jSONArray.add(replacement.mo2421invoke(obj.toString()));
            }
        }
        return jSONArray;
    }
}
