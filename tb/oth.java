package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class oth {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NOT_REACH_TOP = "notReachTop";
    public static final String REACH_TOP = "reachTop";

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f32389a;

    static {
        kge.a(1827583183);
        f32389a = new HashMap();
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            f32389a.put(str, str2);
        }
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : f32389a.get(str);
    }
}
