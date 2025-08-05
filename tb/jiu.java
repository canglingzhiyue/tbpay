package tb;

import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jiu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-164265002);
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
            if (!TextUtils.isEmpty(str2)) {
                str2 = str2 + ":appVersion=2.0";
            }
            AppMonitor.Alarm.commitFail("Dymanic_tracker", str, str2, str3, str4);
        }
    }
}
