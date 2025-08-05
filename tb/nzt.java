package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes8.dex */
public class nzt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f31864a;
    private static Map<String, Class<?>> b;

    static {
        kge.a(128892541);
    }

    public static Map<String, Class<?>> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]) : b;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : f31864a;
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            f31864a = str;
        }
    }
}
