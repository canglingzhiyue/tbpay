package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.c;

/* loaded from: classes.dex */
public class bhx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1250274759);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : c.a().a("isFullNewInstall", false);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : c.a().a("isFirstLaunch", false);
    }

    public static long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5e", new Object[0])).longValue();
        }
        return System.currentTimeMillis() - c.a().a("startProcessSystemTime", -1L);
    }
}
