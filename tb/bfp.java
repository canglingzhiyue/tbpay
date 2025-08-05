package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Map;

/* loaded from: classes2.dex */
public class bfp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_NAME = "Nextrpc";

    private static void a(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b903f76", new Object[]{str, new Integer(i), str2, str3, str4, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, i, str2, str3, str4, map).build());
        }
    }

    public static void a(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109fb67f", new Object[]{str, str2, str3, map});
        } else {
            a("Nextrpc", 19997, str, str2, str3, map);
        }
    }
}
