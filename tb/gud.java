package tb;

import android.content.Context;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.task.g;
import com.taobao.android.launcher.common.LauncherRuntime;

/* loaded from: classes.dex */
public class gud {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Pair<gub<String>, g<String, Void>> a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("bb36b1f4", new Object[]{context, str});
        }
        return Pair.create(new gue(), "com.taobao.taobao:channel".equals(str) ? new guk() : LauncherRuntime.PROCESS_SAFEMODE.equals(str) ? new gup() : new gun());
    }
}
