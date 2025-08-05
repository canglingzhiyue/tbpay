package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class nyh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NOT_WEEX_CHANNEL_VERSION = "1";
    public static final String NOT_WEEX_FRIEND_VERSION = "1";
    public static final String WEEX_CHANNEL_VERSION = "2";
    public static final String WEEX_FRIEND_VERSION = "2";

    /* renamed from: a  reason: collision with root package name */
    private static String f31840a;
    private static String b;

    static {
        kge.a(-1041448272);
        f31840a = "2";
        b = "2";
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f31840a;
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            f31840a = str;
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            b = str;
        }
    }
}
