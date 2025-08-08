package tb;

import android.support.v4.util.ArrayMap;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.q;

/* loaded from: classes8.dex */
public class nye {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(237208570);
    }

    public static ArrayMap<String, String> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayMap) ipChange.ipc$dispatch("36c8b07e", new Object[]{jSONObject});
        }
        ArrayMap<String, String> arrayMap = new ArrayMap<>();
        if (jSONObject == null) {
            q.b("JsonParseUtil", "convertJsonToMap：jsonObject为空");
            return arrayMap;
        }
        for (String str : jSONObject.keySet()) {
            String string = jSONObject.getString(str);
            if (string != null) {
                arrayMap.put(str, string);
            }
        }
        return arrayMap;
    }

    public static ArrayMap<String, String> a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayMap) ipChange.ipc$dispatch("2bdff9f4", new Object[]{jSONObject, str});
        }
        if (jSONObject == null) {
            q.b("JsonParseUtil", "getMapFromJson：jsonObject为空");
            return new ArrayMap<>();
        } else if (StringUtils.isEmpty(str)) {
            q.b("JsonParseUtil", "getMapFromJson：key为空");
            return new ArrayMap<>();
        } else {
            try {
                return a(jSONObject.getJSONObject(str));
            } catch (Exception unused) {
                q.b("JsonParseUtil", "getMapFromJson：类型错误");
                return new ArrayMap<>();
            }
        }
    }
}
