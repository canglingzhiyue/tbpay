package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.utils.baseutils.linklog.a;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class lxv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHILD_BIZ = "GUESS_YOU_LIKE";
    public static final String DATA_PROCESS_GATEWAY_LOAD_CACHE = "GATEWAY_LOAD_CACHE";
    public static final String DATA_PROCESS_GATEWAY_LOAD_PRESET = "GATEWAY_LOAD_PRESET";
    public static final String MAIN_BIZ = "Page_Home";
    public static final String PERFORMANCE_TAG = "create_view";
    public static final String REQUEST_ADD_REPEAT_PARAMS = "request_add_repeat_params";
    public static final String TAG_EXCEPTION = "catch_exception";
    public static final String TAG_FIXED_TAB = "home_fixed_recommend_tab";
    public static final String TAG_FIXED_TAB_REQUEST = "home_fixed_recommend_tab_request";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f30978a;

    static {
        kge.a(338682023);
        f30978a = false;
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2562e1a4", new Object[]{str, str2, str3, str4, str5, str6});
        } else if (f30978a) {
        } else {
            HashMap hashMap = null;
            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                hashMap = new HashMap();
                hashMap.put(str5, str6);
            }
            a.a("netRequest", str, str2, "GUESS_YOU_LIKE", "Page_Home", hashMap, str3, str4);
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b86a6e", new Object[]{str, str2, str3, str4, str5, str6, str7});
        } else if (f30978a) {
        } else {
            HashMap hashMap = null;
            if (!TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str7)) {
                hashMap = new HashMap();
                hashMap.put(str6, str7);
            }
            a.a("dataProcess", str, str2, "Page_Home", str3, hashMap, str4, str5);
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{str, str2, str3, str4, str5});
        } else if (f30978a) {
        } else {
            HashMap hashMap = null;
            if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5)) {
                hashMap = new HashMap();
                hashMap.put(str4, str5);
            }
            a.a("dataProcess", str, str2, "Page_Home", str3, hashMap);
        }
    }
}
