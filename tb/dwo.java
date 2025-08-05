package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes4.dex */
public class dwo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1750908672);
        emu.a("com.taobao.android.detail.core.aura.compare.JsonDiffUtil");
    }

    public static boolean a(Object obj, Object obj2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a0f9aee", new Object[]{obj, obj2, str})).booleanValue();
        }
        if (dwm.d().contains(str)) {
            return true;
        }
        if (obj instanceof JSONObject) {
            return a((JSONObject) obj, (JSONObject) obj2, str);
        }
        if (obj instanceof JSONArray) {
            return a((JSONArray) obj, (JSONArray) obj2, str);
        }
        if (obj instanceof String) {
            return a((String) obj, (String) obj2, str);
        }
        return obj != null || obj2 == null;
    }

    private static boolean a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("461bb036", new Object[]{jSONObject, jSONObject2, str})).booleanValue();
        }
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null && jSONObject2 != null) {
            return false;
        }
        if (jSONObject != null && jSONObject2 == null) {
            return false;
        }
        a(jSONObject);
        a(jSONObject2);
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            if (!(key instanceof String)) {
                return true;
            }
            if (!a(jSONObject.get(key), jSONObject2.get(key), key)) {
                return false;
            }
        }
        for (Map.Entry<String, Object> entry2 : jSONObject2.entrySet()) {
            String key2 = entry2.getKey();
            if (!(key2 instanceof String)) {
                return true;
            }
            if (!a(jSONObject.get(key2), jSONObject2.get(key2), key2)) {
                return false;
            }
        }
        return true;
    }

    private static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
            return;
        }
        ArrayList<String> arrayList = new ArrayList();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            Object obj = jSONObject.get(key);
            if (((obj instanceof String) && TextUtils.isEmpty((String) obj)) || (((obj instanceof JSONObject) && bau.a((JSONObject) obj)) || ((obj instanceof JSONArray) && ((JSONArray) obj).size() == 0))) {
                arrayList.add(key);
            }
        }
        for (String str : arrayList) {
            jSONObject.remove(str);
        }
    }

    private static boolean a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{str, str2, str3})).booleanValue();
        }
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null && str2 != null) {
            return false;
        }
        if (str != null && str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    private static boolean a(JSONArray jSONArray, JSONArray jSONArray2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4ca2a86", new Object[]{jSONArray, jSONArray2, str})).booleanValue();
        }
        if (bau.a(jSONArray) && bau.a(jSONArray2)) {
            return true;
        }
        if (bau.a(jSONArray) && !bau.a(jSONArray2)) {
            return false;
        }
        if (!bau.a(jSONArray) && bau.a(jSONArray2)) {
            return false;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            Object a2 = a(jSONArray, i);
            Object a3 = a(jSONArray2, i);
            if (!a(a2, a3, "第" + i + "个")) {
                return false;
            }
        }
        for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
            Object a4 = a(jSONArray, i2);
            Object a5 = a(jSONArray2, i2);
            if (!a(a4, a5, "第" + i2 + "个")) {
                return false;
            }
        }
        return true;
    }

    private static Object a(JSONArray jSONArray, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6fb70c1f", new Object[]{jSONArray, new Integer(i)});
        }
        if (i >= jSONArray.size()) {
            return null;
        }
        return jSONArray.get(i);
    }
}
