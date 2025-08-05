package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class dof {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EVENT_ID_19997 = 19997;
    public static final int EVENT_ID_19999 = 19999;
    public static final String PAGE_NAME_ADDRESS = "Address";
    public static final String PAGE_NAME_ADDRESS_DYNAMIC = "AddressDynamic";

    public static void a(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109fb67f", new Object[]{str, str2, str3, map});
        } else {
            a(PAGE_NAME_ADDRESS, 19999, str, str2, str3, map);
        }
    }

    public static void a(int i, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82762f2c", new Object[]{new Integer(i), str, str2, str3, map});
        } else {
            a(PAGE_NAME_ADDRESS, i, str, str2, str3, map);
        }
    }

    public static void a(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b903f76", new Object[]{str, new Integer(i), str2, str3, str4, map});
            return;
        }
        try {
            if (!UTAnalytics.getInstance().isInit()) {
                return;
            }
            if (map == null) {
                hashMap = new HashMap();
            } else {
                hashMap = new HashMap(map);
            }
            hashMap.put("addressAnalysis", "1");
            hashMap.put("addressVersion", "5.0.30");
            AdapterForTLog.loge(str, "addressSendUT eventId:" + i + " arg1:" + str2 + " arg2:" + str3 + " arg3:" + str4 + " properties:" + hashMap.toString());
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, i, str2, str3, str4, hashMap).build());
        } catch (Throwable th) {
            AdapterForTLog.loge(str, "addressSendUT error", th);
        }
    }
}
