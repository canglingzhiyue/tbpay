package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.constant.Constants;

/* loaded from: classes6.dex */
public class xkf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f34347a;

    static {
        kge.a(-1129727452);
    }

    private static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        try {
            return xkg.a(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : a("anr_normal_change");
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        if (!kap.b() && kam.c()) {
            return true;
        }
        return a("aranger_hook_service");
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (f34347a == null) {
            if (!kap.b() && kam.c()) {
                f34347a = true;
            } else {
                f34347a = Boolean.valueOf(a(Constants.INTENT_KEY_SERVICE));
            }
        }
        return f34347a.booleanValue();
    }
}
