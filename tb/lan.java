package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.common.TBLocationDTO;

/* loaded from: classes7.dex */
public class lan {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(577288227);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            AppMonitor.Counter.commit("Page_Home", "monitorPath", str, 1.0d);
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            AppMonitor.Counter.commit("Page_Home", "LocationRequest", "begin", 1.0d);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            AppMonitor.Counter.commit("Page_Home", "LocationRequest", "end", 1.0d);
        }
    }

    public static void a(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d6c9b8", new Object[]{tBLocationDTO});
        } else if (tBLocationDTO == null) {
            ksp.c("AlertMonitor", "monitorLocationRequestError.location对象为空");
            AppMonitor.Alarm.commitFail("Page_Home", "HomeLocating", "-1", "location对象为空");
        } else {
            ksp.c("AlertMonitor", "monitorLocationRequestError");
            AppMonitor.Alarm.commitFail("Page_Home", "HomeLocating", String.valueOf(tBLocationDTO.getErrorCode()), "定位失败");
        }
    }
}
