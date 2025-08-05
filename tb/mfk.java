package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class mfk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CDN_REQUEST = "cdn_request";
    public static final String DYNAMIC_X_BIND_DATA = "dynamic_bind_data";
    public static final String DYNAMIC_X_CREATE = "dynamic_create_view";
    public static final String DYNAMIC_X_DOWNLOAD = "dynamic_x_download";
    public static final String DYNAMIC_X_FETCH = "dynamic_template_fetch";
    public static final String FEEDLIST_REQUEST = "feedList_request_total";
    public static final String MTOP_REQUEST = "mtop_request";

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            AppMonitor.Alarm.commitSuccess("Live_Home_Monitor", str, str2);
        }
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
        } else {
            AppMonitor.Alarm.commitFail("Live_Home_Monitor", str, str2, str3, str4);
        }
    }
}
