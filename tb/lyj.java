package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class lyj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Map<String, String>> f30993a = new HashMap();

    private static Map<String, String> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{map});
        }
        HashMap hashMap = new HashMap();
        if (map != null && map.size() > 0) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public static Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str});
        }
        Map<String, Map<String, String>> map = f30993a;
        if (map != null && map.containsKey(str)) {
            return a(f30993a.get(str));
        }
        Map<String, String> b = b(str);
        if (f30993a != null && !TextUtils.isEmpty(str) && b.size() > 0) {
            f30993a.put(str, b);
        }
        return a(b);
    }

    public static Map<String, String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d2e5f268", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            JSONObject parseObject = JSON.parseObject(str.replace("'", "\"").replace(";", ","));
            if (parseObject.keySet().size() > 0) {
                for (String str2 : parseObject.keySet()) {
                    String valueOf = String.valueOf(str2);
                    hashMap.put(valueOf, (String) parseObject.get(valueOf));
                }
            }
        }
        return hashMap;
    }
}
