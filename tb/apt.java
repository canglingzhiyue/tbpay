package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Deprecated
/* loaded from: classes.dex */
public class apt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1666816963);
    }

    public static Map<String, String> a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (map == null || map.size() <= 0 || (r1 = map.keySet().iterator()) == null) {
            return null;
        }
        for (String str : map.keySet()) {
            String a2 = aqc.a(map.get(str));
            if (str != null) {
                hashMap.put(str, a2);
            }
        }
        return hashMap;
    }

    public static Map<String, String> b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8ce771b1", new Object[]{map});
        }
        if (map == null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            if (str instanceof String) {
                String str2 = map.get(str);
                if (!aqc.e(str) && !aqc.e(str2)) {
                    try {
                        hashMap.put(URLEncoder.encode(str, "UTF-8"), URLEncoder.encode(str2, "UTF-8"));
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return hashMap;
    }

    public static Map<String, String> a(Properties properties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ba636c99", new Object[]{properties});
        }
        if (properties == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Object obj : properties.keySet()) {
            if (obj instanceof String) {
                String a2 = aqc.a(obj);
                String a3 = aqc.a(properties.get(obj));
                if (!aqc.e(a2) && !aqc.e(a3)) {
                    hashMap.put(a2, a3);
                }
            }
        }
        return hashMap;
    }
}
