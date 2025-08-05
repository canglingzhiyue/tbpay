package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.biz.touch.e;
import com.taobao.android.launcher.bootstrap.tao.h;
import com.taobao.application.common.c;

/* loaded from: classes5.dex */
public class sxr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static sfp a(sxs sxsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sfp) ipChange.ipc$dispatch("9dec14ff", new Object[]{sxsVar});
        }
        int a2 = c.a().a("deviceLevel", -1);
        h.b("MessageLooperPreparers", "current device level: " + a2);
        return a2 < 2 ? new isy(sxsVar) : b(sxsVar);
    }

    private static sfp b(sxs sxsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sfp) ipChange.ipc$dispatch("858deb5e", new Object[]{sxsVar});
        }
        if (guc.a(sxsVar.i(), "lowEndHomepageSkiOpt") && e.a(sxsVar)) {
            return new rub(sxsVar);
        }
        return new oka(sxsVar);
    }
}
