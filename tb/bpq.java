package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class bpq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Map<String, Object> map, Map<String, ?> map2) {
        String key;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0efabc8", new Object[]{map, map2});
        } else if (map != null && map2 != null && !map2.isEmpty()) {
            Set<Map.Entry<String, ?>> entrySet = map2.entrySet();
            if (entrySet.isEmpty()) {
                return;
            }
            for (Map.Entry<String, ?> entry : entrySet) {
                if (entry != null && (key = entry.getKey()) != null) {
                    Object value = entry.getValue();
                    if (value == null) {
                        value = "empty value";
                    }
                    map.put(key, value);
                }
            }
        }
    }

    public static void b(Map<String, String> map, Map<String, String> map2) {
        String key;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c86b89", new Object[]{map, map2});
        } else if (map != null && map2 != null && !map2.isEmpty()) {
            Set<Map.Entry<String, String>> entrySet = map2.entrySet();
            if (entrySet.isEmpty()) {
                return;
            }
            for (Map.Entry<String, String> entry : entrySet) {
                if (entry != null && (key = entry.getKey()) != null) {
                    String value = entry.getValue();
                    if (value == null) {
                        value = "empty value";
                    }
                    map.put(key, value);
                }
            }
        }
    }
}
