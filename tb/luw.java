package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class luw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-936142927);
    }

    public static String[] a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("1bd1fd57", new Object[]{jSONObject});
        }
        if (jSONObject == null || jSONObject.size() == 0) {
            return null;
        }
        String[] strArr = new String[jSONObject.size()];
        int i = 0;
        for (String str : jSONObject.keySet()) {
            String string = jSONObject.getString(str);
            if (string != null) {
                strArr[i] = String.format("%s=%s", str, string);
                i++;
            }
        }
        return strArr;
    }

    public static Map<String, String> b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("592eda1c", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return new HashMap();
        }
        return (Map) JSONObject.parseObject(jSONObject.toJSONString(), new TypeReference<Map<String, String>>() { // from class: tb.luw.1
        }, new Feature[0]);
    }
}
