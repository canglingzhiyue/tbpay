package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;

/* loaded from: classes7.dex */
public class nea {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COLLECTION_LOG_PREFIX = "lbs_sdk.coll_";
    public static final String FENCE_LOG_PREFIX = "lbs_sdk.fence_";
    public static final String LBS_LOG_PREFIX = "lbs_sdk.";
    public static final String LBS_PASSIVE_PREFIX = "lbs_passive.";
    public static final String LOCATION_LOG_PREFIX = "lbs_passive.loc_";
    public static final String REPORT_LOG_PREFIX = "lbs_passive.report_";

    static {
        kge.a(-835883136);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            AdapterForTLog.loge(str, str2);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
        } else {
            AdapterForTLog.loge(str, str2, th);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else {
            AdapterForTLog.logw(str, str2);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
        } else {
            AdapterForTLog.logi(str, str2);
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else {
            AdapterForTLog.logd(str, str2);
        }
    }
}
