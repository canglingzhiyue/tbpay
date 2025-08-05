package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class hul {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALARM_POINT = "Monitor_Trade_Service";
    public static final String MODULE = "Page_Trade_Govern";

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (str == null) {
        } else {
            if (str2 == null) {
                str2 = "null";
            }
            AppMonitor.Alarm.commitSuccess("Page_Trade_Govern", str, str2);
        }
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
        } else if (str == null) {
        } else {
            if (str2 == null) {
                str2 = "null";
            }
            if (str3 == null) {
                str3 = "null";
            }
            if (str4 == null) {
                str4 = "null";
            }
            AppMonitor.Alarm.commitFail("Page_Trade_Govern", str, str2, str3, str4);
        }
    }
}
