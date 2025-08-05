package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;

/* loaded from: classes6.dex */
public class hyi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1604670162);
    }

    public static int a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258f9a96", new Object[]{context, new Integer(i)})).intValue();
        }
        try {
            int a2 = FestivalMgr.a().a("actionbarTextColor", i);
            hyn.a("FestivalMgrUtils", "getActionBarTextColor", "actionBarTextColor = " + a2);
            return a2;
        } catch (Throwable th) {
            hyq.a(context, "FestivalMgrUtils", "getActionBarTextColor", "error = ", th.toString());
            return i;
        }
    }
}
