package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import tb.arc;

/* loaded from: classes2.dex */
public class bbe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f25744a;
    private static final Map<String, Long> b;

    static {
        kge.a(-983127202);
        f25744a = baw.a();
        b = new HashMap();
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (!f25744a) {
        } else {
            String str2 = str + "  time:" + System.currentTimeMillis();
        }
    }

    public static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
        } else if (baw.a() || new File("/data/local/tmp/.enableLogForPerf").exists()) {
            arc.a a2 = arc.a.a().a("AURA/performance");
            if (map != null) {
                for (String str2 : map.keySet()) {
                    String str3 = map.get(str2);
                    if (!StringUtils.isEmpty(str3)) {
                        a2.a(str2, str3);
                    }
                }
            }
            arc.a().a(str, a2.b());
        }
    }
}
