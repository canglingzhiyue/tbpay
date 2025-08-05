package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.tbadapter.ext.n;

/* loaded from: classes.dex */
public class iho {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static nhq a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nhq) ipChange.ipc$dispatch("f083a07", new Object[0]);
        }
        try {
            n.b();
            RSoLog.c("RSo init() , --- start ");
            gvt.a("rso-init");
            ihp ihpVar = new ihp(n.a(LauncherRuntime.h));
            ihpVar.a();
            RSoLog.c("RSo init() , finish with success");
            return ihpVar;
        } finally {
        }
    }
}
