package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.utils.c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class qva {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static JSONObject f33067a;

    private static JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[0]);
        }
        JSONObject jSONObject = f33067a;
        if (jSONObject != null) {
            return jSONObject;
        }
        String a2 = c.a("cashDeskPopConfig", "{\"isTBBuyFloatMode\":\"true\",\"99tm\":\"true\",\"pageType\":\"float\"}");
        if (TextUtils.isEmpty(a2)) {
            f33067a = null;
            return null;
        }
        try {
            JSONObject parseObject = JSON.parseObject(a2);
            f33067a = parseObject;
            return parseObject;
        } catch (Exception unused) {
            f33067a = null;
            return null;
        }
    }

    public static boolean a(Map<String, String> map) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{map})).booleanValue();
        }
        if (map != null && (a2 = a()) != null && !a2.isEmpty()) {
            for (String str : a2.keySet()) {
                String str2 = map.get(str);
                if (str2 != null && str2.equals(a2.getString(str))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Map<String, String> b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8ce771b1", new Object[]{map});
        }
        HashMap hashMap = null;
        if (map == null) {
            return null;
        }
        JSONObject a2 = a();
        if (a2 != null && !a2.isEmpty()) {
            for (String str : a2.keySet()) {
                String str2 = map.get(str);
                if (str2 != null && str2.equals(a2.getString(str))) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(str, str2);
                }
            }
        }
        return hashMap;
    }
}
