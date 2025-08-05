package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.c;

/* loaded from: classes.dex */
public class ikg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : c.a().a("isFullNewInstall", false);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : c.a().a("isFirstLaunch", false);
    }
}
