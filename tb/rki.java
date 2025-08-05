package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.utils.b;
import com.taobao.wireless.link.download.LinkDownloadItem;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class rki {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARG1_ASSISTANT_CLICK = "assistant_click";
    public static final String ARG1_ASSISTANT_EXPOSE = "assistant_expose";
    public static final String ARG1_ASSISTANT_EXPOSE_EXCEPTION = "assistant_expose_exception";
    public static final String ARG1_ASSISTANT_GET_MESSAGE = "assistant_get_message";
    public static final String ARG1_ASSISTANT_LONG_CLICK = "assistant_long_click";
    public static final String ARG1_ASSISTANT_REMOVE_EXCEPTION = "assistant_remove_exception";
    public static final String ARG1_ASSISTANT_REQUEST_FAIL = "assistant_request_fail";
    public static final String ARG1_ASSISTANT_REQUEST_SUCCESS = "assistant_request_success";
    public static final String ARG1_ASSISTANT_SWITCH_STATE = "assistant_switch_state";
    public static final String ARG1_ASSISTANT_TOAST = "assistant_toast";
    public static final String ARG1_ASSISTANT_USER_CLOSE = "assistant_user_close";
    public static final String ARG1_CANCEL_APK_DOWNLOAD = "cancel_apk_download";
    public static final String ARG1_DELETE_APK_DOWNLOAD = "delete_apk_download";
    public static final String ARG1_FINISH_APK_DOWNLOAD = "finish_apk_download";
    public static final String ARG1_FULL_POP_CLICK = "full_pop_click";
    public static final String ARG1_FULL_POP_EXPOSE = "full_pop_expose";
    public static final String ARG1_HAS_FLOAT_PERMISSION = "has_float_permission";
    public static final String ARG1_INSTALL_APK_DOWNLOAD = "install_apk_download";
    public static final String ARG1_INSTALL_FINISH_APK_DOWNLOAD = "install_finish_apk_download";
    public static final String ARG1_LAUNCH_APK_DOWNLOAD = "launch_apk_download";
    public static final String ARG1_NETWORK_NOT_CONNECTED = "network_not_connected";
    public static final String ARG1_NOTIFICATION_A_CLICK = "notification_A_click";
    public static final String ARG1_NOTIFICATION_B_CLICK = "notification_B_click";
    public static final String ARG1_NOTIFICATION_DELETE_CLICK = "notification_delete_click";
    public static final String ARG1_NOTIFICATION_EXPOSE = "notification_expose";
    public static final String ARG1_NOTIFICATION_NOT_IN_WHITELIST = "notification_not_in_whitelist";
    public static final String ARG1_NOTIFICATION_SWITCH_STATE = "notification_switch_state";
    public static final String ARG1_NOT_IN_REQUEST_SCENCE = "not_in_request_scence";
    public static final String ARG1_NOT_IN_REQUEST_TIME = "not_in_request_time";
    public static final String ARG1_PAUSE_APK_DOWNLOAD = "pause_apk_download";
    public static final String ARG1_POP_DATA_EXPIRE = "pop_data_expire";
    public static final String ARG1_POP_DATA_IN_BLACK = "pop_data_in_black";
    public static final String ARG1_POP_DATA_NOT_COMPLETE = "pop_data_not_complete";
    public static final String ARG1_POP_DELETE = "desktop_view_delete";
    public static final String ARG1_POP_IN_FRONT = "pop_in_front";
    public static final String ARG1_POP_NOT_DATA = "pop_not_data";
    public static final String ARG1_POP_NOT_IN_PERMISSION = "pop_not_in_permission";
    public static final String ARG1_POP_NOT_IN_WHITELIST = "pop_not_in_whitelist";
    public static final String ARG1_POP_SCREEN_LOCK = "pop_screen_lock";
    public static final String ARG1_READ_LOGIN_FREE = "read_login_free";
    public static final String ARG1_READ_LOGIN_FREE_FOR_TB = "read_login_free_for_tb";
    public static final String ARG1_RESUME_APK_DOWNLOAD = "resume_apk_download";
    public static final String ARG1_START_APK_DOWNLOAD = "start_apk_download";
    public static final String ARG1_WRITE_LOGIN_FREE = "write_login_free";
    public static final String POP_DISAPPEAR_EXCEPTION = "pop_disappear_exception";
    public static final String POP_EXPOSE_EXCEPTION = "pop_expose_exception";
    public static final String TABLE_PUSH_CLICK = "table_push_click";
    public static final String TABLE_PUSH_EXPOSE = "table_push_expose";

    static {
        kge.a(733622325);
    }

    public static void a(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109fb67f", new Object[]{str, str2, str3, map});
            return;
        }
        if (map == null) {
            map = Collections.emptyMap();
        }
        Map<String, String> build = new UTOriginalCustomHitBuilder(b.PAGE_FLOWCUSTOMS, 19999, str, str2, str3, map).build();
        rkg.a("link_tag", "arg1: " + str + "  arg2: " + str2 + "  arg3: " + str3 + " args = " + build);
        a(build);
    }

    private static void a(final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
        } else {
            rkf.f33202a.a(new Runnable() { // from class: tb.rki.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        UTAnalytics.getInstance().getDefaultTracker().send(map);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public static void a(String str, LinkDownloadItem linkDownloadItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6c657c", new Object[]{str, linkDownloadItem});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("packageName", linkDownloadItem.packageName);
        Map<String, String> build = new UTOriginalCustomHitBuilder(b.PAGE_FLOWCUSTOMS, 19999, str, linkDownloadItem.businessId, linkDownloadItem.downloadUrl, hashMap).build();
        rkg.a("link_tag", "arg1: " + str + "  downLoadItem: " + linkDownloadItem + " build = " + build);
        a(build);
    }
}
