package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.launcher.common.h;

/* loaded from: classes.dex */
public class gvu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        boolean z = LauncherRuntime.l;
        return h.a(".dag_switch_stage_off_" + str);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        boolean z = LauncherRuntime.l;
        return h.a(".dag_report_switch_on");
    }

    public static long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[0])).longValue() : h.a(".dag_switch_idle_delay", 0L);
    }
}
