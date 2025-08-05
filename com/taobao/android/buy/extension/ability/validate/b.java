package com.taobao.android.buy.extension.ability.validate;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.regex.Pattern;
import tb.arc;
import tb.bau;
import tb.dtk;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-151211276);
    }

    public static dtk a(Map<String, Object> map, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (dtk) ipChange.ipc$dispatch("edcb1438", new Object[]{map, jSONObject});
        }
        if (map == null) {
            arc.a().a("inputFields is null !!");
            return dtk.a();
        } else if (jSONObject == null) {
            arc.a().a("validate is null !!");
            return dtk.a();
        } else {
            JSONArray jSONArray = jSONObject.getJSONArray("fields");
            if (bau.a(jSONArray)) {
                arc.a().a("fields is null !!");
                return dtk.a();
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray("regex");
            if (bau.a(jSONArray2)) {
                arc.a().a("regs is null !!");
                return dtk.a();
            }
            JSONArray jSONArray3 = jSONObject.getJSONArray("msg");
            if (bau.a(jSONArray3)) {
                arc.a().a("msg is null !!");
                return dtk.a();
            }
            if (jSONArray.size() != jSONArray2.size() || jSONArray2.size() != jSONArray3.size()) {
                z = false;
            }
            if (!z) {
                arc.a().a("fields msg regs size is not equal !!");
                return dtk.a();
            }
            return a(map, jSONArray, jSONArray3, jSONArray2);
        }
    }

    private static dtk a(Map<String, Object> map, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dtk) ipChange.ipc$dispatch("91b6e8d6", new Object[]{map, jSONArray, jSONArray2, jSONArray3});
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            Object obj = jSONArray.get(i);
            Object obj2 = jSONArray3.get(i);
            Object obj3 = jSONArray2.get(i);
            if ((obj instanceof String) && (obj2 instanceof String) && (obj3 instanceof String)) {
                Object obj4 = map.get(obj);
                if (obj4 == null) {
                    return new dtk(false, (String) obj3);
                }
                if (!a((String) obj2, !(obj4 instanceof String) ? obj4.toString() : (String) obj4)) {
                    return new dtk(false, (String) obj3);
                }
            }
        }
        return dtk.a();
    }

    private static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static JSONObject a(Object obj) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("62e9ad64", new Object[]{obj});
        }
        if ((obj instanceof JSONObject) && (jSONObject = ((JSONObject) obj).getJSONObject("linkage")) != null) {
            return jSONObject.getJSONObject("validate");
        }
        return null;
    }
}
