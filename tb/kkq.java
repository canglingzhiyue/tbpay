package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downgrade.rule.AvailableBizRule;
import com.taobao.downgrade.rule.BusinessRule;
import com.taobao.downgrade.rule.DefaultRule;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class kkq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static BusinessRule a(String str) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BusinessRule) ipChange.ipc$dispatch("21c63d51", new Object[]{str});
        }
        try {
            map = (Map) JSON.parseObject(str, new TypeReference<Map<String, BusinessRule>>() { // from class: tb.kkq.1
            }, new Feature[0]);
        } catch (JSONException unused) {
            map = null;
        }
        if (map == null || map.size() != 1) {
            return null;
        }
        BusinessRule businessRule = (BusinessRule) map.values().toArray()[0];
        businessRule.businessRuleName = (String) map.keySet().toArray()[0];
        return businessRule;
    }

    public static DefaultRule b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DefaultRule) ipChange.ipc$dispatch("aba9c0cd", new Object[]{str});
        }
        JSONObject d = d(str);
        if (d != null) {
            return (DefaultRule) d.toJavaObject(DefaultRule.class);
        }
        return null;
    }

    public static AvailableBizRule c(String str) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AvailableBizRule) ipChange.ipc$dispatch("8b867905", new Object[]{str});
        }
        JSONObject d = d(str);
        if (d == null || (map = (Map) JSONObject.toJavaObject(d, Map.class)) == null) {
            return null;
        }
        Map<String, String> a2 = a(map);
        AvailableBizRule availableBizRule = new AvailableBizRule();
        availableBizRule.setBizMap(a2);
        return availableBizRule;
    }

    private static Map<String, String> a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{map});
        }
        HashMap hashMap = new HashMap(map.size());
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if ((obj instanceof String) && (obj2 instanceof String)) {
                hashMap.put((String) obj, (String) obj2);
            }
        }
        return hashMap;
    }

    private static JSONObject d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("efd4af15", new Object[]{str});
        }
        try {
            return JSON.parseObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }
}
