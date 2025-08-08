package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class syz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, szc> f33968a;

    static {
        kge.a(-1680848306);
        HashMap hashMap = new HashMap(4);
        f33968a = hashMap;
        hashMap.put("empty", new szd());
        f33968a.put("not", new sze());
        f33968a.put("and", new sza());
        f33968a.put("or", new szf());
        f33968a.put("deleteifnull", new szb());
    }

    public static szc a(String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            obj = ipChange.ipc$dispatch("7c756ab8", new Object[]{str});
        } else if (StringUtils.isEmpty(str)) {
            return null;
        } else {
            obj = f33968a.get(str.trim().toLowerCase());
        }
        return (szc) obj;
    }
}
