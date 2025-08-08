package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class tfv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f34082a;

    static {
        kge.a(2023661405);
        f34082a = new HashMap();
    }

    public static String a(String str, String str2, String str3) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            obj = ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        } else {
            Map<String, String> map = f34082a;
            if (StringUtils.isEmpty(map.get(str + "_" + str2))) {
                if (pmd.a().d() != null) {
                    str3 = pmd.a().d().a(str, str2, str3);
                }
                Map<String, String> map2 = f34082a;
                map2.put(str + "_" + str2, str3);
                return str3;
            }
            Map<String, String> map3 = f34082a;
            obj = map3.get(str + "_" + str2);
        }
        return (String) obj;
    }
}
