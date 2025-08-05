package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class per {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERROR_CODE_DATA_ERROR = "error_code_data_error";
    public static final String ERROR_CODE_DATA_NULL = "error_code_data_null";
    public static final String ERROR_CODE_LISTENER_ERROR = "error_code_listener_error";
    public static final String ERROR_CODE_LISTENER_IS_NULL = "error_code_listener_is_null";
    public static final String ERROR_CODE_NO_RUNNING = "error_code_no_running";
    public static final String MODULE_POINT_CDN_RECEIVE = "lm_module_point_cdn_receive";
    public static final String MODULE_POINT_DEDUPLICATION = "lm_module_point_deduplication";
    public static final String MODULE_POINT_HEART = "lm_module_point_heart";
    public static final String MODULE_POINT_PM_RECEIVE = "lm_module_point_pm_receive";
    public static final String MODULE_POINT_PROVIDER = "lm_module_point_provider";
    public static final String MONITOR_BUINESS_ARG = "time=%d;source=java";
    public static final String MONITOR_MOUDLE = "taolive";

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (pmd.a().n() == null) {
        } else {
            pmd.a().n().a("taolive", str);
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (pmd.a().n() == null) {
        } else {
            pmd.a().n().a("taolive", str, str2);
        }
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else if (pmd.a().n() == null) {
        } else {
            pmd.a().n().a("taolive", str, str2, str3);
        }
    }
}
