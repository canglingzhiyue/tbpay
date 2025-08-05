package mtopsdk.common.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class HeaderHandlerUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.HeaderHandlerUtil";

    static {
        kge.a(215236985);
    }

    public static List<String> getHeaderFieldByKey(Map<String, List<String>> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("677c03f0", new Object[]{map, str});
        }
        if (map != null && !map.isEmpty() && !StringUtils.isBlank(str)) {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                if (str.equalsIgnoreCase(entry.getKey())) {
                    return entry.getValue();
                }
            }
        }
        return null;
    }

    public static String getSingleHeaderFieldByKey(Map<String, List<String>> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4eda9f1", new Object[]{map, str});
        }
        List<String> headerFieldByKey = getHeaderFieldByKey(map, str);
        if (headerFieldByKey != null && !headerFieldByKey.isEmpty()) {
            return headerFieldByKey.get(0);
        }
        return null;
    }

    public static Map<String, List<String>> cloneHeaderMap(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fd445d61", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), new ArrayList(entry.getValue()));
        }
        return hashMap;
    }
}
