package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.utils.b;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes7.dex */
public class kig {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-90430227);
    }

    public static void a(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109fb67f", new Object[]{str, str2, str3, map});
            return;
        }
        if (map == null) {
            map = Collections.emptyMap();
        }
        Map<String, String> build = new UTOriginalCustomHitBuilder(b.PAGE_FLOWCUSTOMS, 19999, str, str2, str3, map).build();
        kif.b("arg1: " + str + "  arg2: " + str2 + "  arg3: " + str3 + " args = " + build);
        UTAnalytics.getInstance().getDefaultTracker().send(build);
    }
}
