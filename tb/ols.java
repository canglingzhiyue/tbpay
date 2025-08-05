package tb;

import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.AlarmObject;
import anet.channel.statist.CountObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class ols {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String POINT_ACCS_EXCEPTION = "accs_monitor_exception";
    public static final String POINT_DELTA_TIME = "delta_time";
    public static final String POINT_DISPATCH = "dispatch";
    public static final String POINT_INTERNAL_INIT = "internal_init";
    public static final String POINT_MSG_ORDER = "pm_msg_order";
    public static final String POINT_ORANGE_SWITCH = "orange_switch";
    public static final String POINT_PARSE_MESSAGE = "parse_message";

    static {
        kge.a(-1638799464);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = "pm";
        alarmObject.modulePoint = str;
        alarmObject.arg = str2;
        alarmObject.isSuccess = true;
        AppMonitor.getInstance().commitAlarm(alarmObject);
    }

    public static void a(String str, String str2, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba8242", new Object[]{str, str2, new Double(d)});
            return;
        }
        CountObject countObject = new CountObject();
        countObject.module = "pm";
        countObject.modulePoint = str;
        countObject.arg = str2;
        countObject.value = d;
        AppMonitor.getInstance().commitCount(countObject);
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
            return;
        }
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = "pm";
        alarmObject.modulePoint = str;
        alarmObject.arg = str2;
        alarmObject.errorCode = str3;
        alarmObject.errorMsg = str4;
        alarmObject.isSuccess = false;
        AppMonitor.getInstance().commitAlarm(alarmObject);
    }
}
