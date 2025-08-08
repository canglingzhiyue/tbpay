package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class tbg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, tbd> f34009a;

    static {
        kge.a(-1437983572);
        HashMap hashMap = new HashMap(4);
        f34009a = hashMap;
        hashMap.put("empty", new tbe());
        f34009a.put("not", new tbf());
        f34009a.put("and", new tbb());
        f34009a.put("or", new tbh());
        f34009a.put("deleteifnull", new tbc());
    }

    public static tbd a(String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            obj = ipChange.ipc$dispatch("7c75851e", new Object[]{str});
        } else if (StringUtils.isEmpty(str)) {
            return null;
        } else {
            obj = f34009a.get(str.trim().toLowerCase());
        }
        return (tbd) obj;
    }
}
