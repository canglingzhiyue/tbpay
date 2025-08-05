package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.h;
import com.taobao.android.speed.TBSpeed;

/* loaded from: classes.dex */
public class guc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        if (h.a("/.biz_opt_switch/." + str)) {
            return true;
        }
        if (!h.a("/.biz_opt_switch/." + str + ".off")) {
            return TBSpeed.isSpeedEdition(context, str);
        }
        return false;
    }
}
