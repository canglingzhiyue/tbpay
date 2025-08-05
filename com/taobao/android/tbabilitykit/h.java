package com.taobao.android.tbabilitykit;

import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.adapter.IWXUserTrackAdapter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.ai;
import tb.kge;

/* loaded from: classes6.dex */
public final class h implements com.taobao.android.abilitykit.mega.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1560795940);
        kge.a(-492976882);
    }

    @Override // com.taobao.android.abilitykit.mega.d
    public ExecuteResult a(ExecuteResult result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b88a424e", new Object[]{this, result});
        }
        kotlin.jvm.internal.q.d(result, "result");
        return result;
    }

    @Override // com.taobao.android.abilitykit.mega.d
    public ExecuteResult b(ExecuteResult result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("1ae5592d", new Object[]{this, result});
        }
        kotlin.jvm.internal.q.d(result, "result");
        return result;
    }

    @Override // com.taobao.android.abilitykit.mega.d
    public JSONObject a(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject;
        Map<String, ? extends Object> a2 = com.alibaba.ability.e.a(jSONObject2, "data");
        if (jSONObject != null && a2 != null) {
            a(jSONObject, "point", "monitorPoint");
            a(jSONObject, a2, "errorCode", "errorCode");
            a(jSONObject, a2, "errorMsg", "errorMessage");
            a(jSONObject, a2, "value", "value");
            if (a2.containsKey(IWXUserTrackAdapter.MONITOR_ARG)) {
                Map<String, Object> c = com.alibaba.ability.e.c(jSONObject2, "args");
                if (c == null || (linkedHashMap = ai.c(c)) == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put("_dx_arg_", com.alibaba.ability.e.a(a2, IWXUserTrackAdapter.MONITOR_ARG, ""));
                jSONObject2.put((JSONObject) "args", (String) linkedHashMap);
            }
            jSONObject.remove("data");
        }
        return jSONObject;
    }

    private final void a(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95510c9c", new Object[]{this, jSONObject, str, str2});
        } else if (!jSONObject.containsKey(str)) {
        } else {
            jSONObject.put((JSONObject) str2, (String) jSONObject.get(str));
            jSONObject.remove(str);
        }
    }

    private final void a(JSONObject jSONObject, Map<String, ? extends Object> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("369b9991", new Object[]{this, jSONObject, map, str, str2});
        } else if (!map.containsKey(str)) {
        } else {
            jSONObject.put((JSONObject) str2, (String) map.get(str));
        }
    }
}
