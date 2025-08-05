package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.launcher.common.h;

/* loaded from: classes.dex */
public class guq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        boolean z = LauncherRuntime.l;
        return h.a(".dag_switch_task_off_" + str);
    }
}
