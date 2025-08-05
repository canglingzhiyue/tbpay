package com.alibaba.android.ultron.engine.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.Iterator;
import tb.kge;

/* loaded from: classes2.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2013125447);
    }

    private static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("--");
        }
        return sb.toString();
    }

    public static String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            String string = jSONObject.getJSONObject("hierarchy").getString("root");
            if (string == null && jSONObject.getJSONObject("hierarchy").getJSONArray("delta") != null) {
                sb.append(jSONObject.toJSONString());
            } else {
                sb.append(string);
                sb.append("\n");
                JSONObject jSONObject2 = jSONObject.getJSONObject("hierarchy").getJSONObject("structure");
                sb.append(a(jSONObject2, jSONObject2.getJSONArray(string), 1));
            }
        } catch (Throwable th) {
            UnifyLog.d("PrintInfoUtils", "getProtocolRenderInfo exception: " + th.getMessage());
        }
        return sb.toString();
    }

    private static String a(JSONObject jSONObject, JSONArray jSONArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93f670ad", new Object[]{jSONObject, jSONArray, new Integer(i)});
        }
        StringBuilder sb = new StringBuilder();
        if (jSONArray == null) {
            return sb.toString();
        }
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof String) {
                sb.append(a(i));
                sb.append(next);
                sb.append("\n");
                if (jSONObject.containsKey(next)) {
                    sb.append(a(jSONObject, jSONObject.getJSONArray((String) next), i + 1));
                }
            }
        }
        return sb.toString();
    }
}
