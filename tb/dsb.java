package tb;

import android.text.TextUtils;
import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.alibaba.android.umbrella.link.export.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.utils.Debuggable;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class dsb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "BehaviXMonitor";

    static {
        kge.a(-2073098662);
    }

    public static void a(String str, String str2, Map<String, String> map, Throwable th) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1666d0c", new Object[]{str, str2, map, th});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        TLog.loge("behavix_track", TAG, th);
        StackTraceElement[] stackTrace = th.getStackTrace();
        String str4 = "";
        if (stackTrace == null || stackTrace.length <= 0) {
            str3 = str4;
        } else {
            str4 = stackTrace[0].toString();
            StringBuilder sb = new StringBuilder();
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append(stackTraceElement.toString());
                sb.append("\r\n");
            }
            str3 = sb.toString();
        }
        map.put("errorMsg", th.toString() + "____" + str4);
        map.put("errorStackString", str3);
        c(str, str2, map, th.getClass().getSimpleName(), th.getClass().getSimpleName());
        if (Debuggable.isDebug()) {
            throw new RuntimeException(th.getMessage(), th);
        }
    }

    public static void a(String str, String str2, Map<String, String> map, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fae8b1d", new Object[]{str, str2, map, str3, str4});
        } else {
            b(str, str2, map, str3, str4);
        }
    }

    public static void a(String str, String str2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac6a135a", new Object[]{str, str2, aVar});
            return;
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put(UMDimKey.DIM_1, str2);
        }
        bpp.a().logInfo("BehaviX", str, "eventProcess", null, hashMap, aVar);
    }

    public static void b(String str, String str2, Map<String, String> map, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ed51a7c", new Object[]{str, str2, map, str3, str4});
        } else {
            bpp.a().commitFailure("eventProcess", str, "1.0", "BehaviX", str2, map, str3, str4);
        }
    }

    public static void c(String str, String str2, Map<String, String> map, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfba9db", new Object[]{str, str2, map, str3, str4});
        } else {
            bpp.a().commitFailure("crash", str, "1.0", "BehaviX", str2, map, str3, str4);
        }
    }
}
