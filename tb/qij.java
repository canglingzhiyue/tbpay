package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes8.dex */
public class qij {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        try {
            a(str, str2, str3, null);
        } catch (Exception e) {
            qif.a("sendTrack error：" + e.getMessage());
        }
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
        Map<String, String> build = new UTOriginalCustomHitBuilder("TBShortcutsManager", 19999, str, str2, str3, map).build();
        qif.a("arg1: " + str + "  arg2: " + str2 + "  arg3: " + str3 + " args = " + build, new Object[0]);
        UTAnalytics.getInstance().getDefaultTracker().send(build);
    }
}
