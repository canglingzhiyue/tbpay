package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.Map;

/* loaded from: classes.dex */
public final class ikm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
            return;
        }
        a(map);
        String jSONString = JSON.toJSONString(map);
        AppMonitor.Counter.commit(str, str2, jSONString, 1.0d);
        RSoLog.c(str2 + " = " + jSONString);
    }

    public static void b(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c7968", new Object[]{str, str2, map});
            return;
        }
        a(map);
        String jSONString = JSON.toJSONString(map);
        AppMonitor.Alarm.commitSuccess(str, str2, jSONString);
        RSoLog.c(str2 + " = " + jSONString);
    }

    public static void a(String str, String str2, Map<String, Object> map, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d945d4e4", new Object[]{str, str2, map, new Integer(i), str3});
            return;
        }
        a(map);
        String jSONString = JSON.toJSONString(map);
        AppMonitor.Alarm.commitFail(str, str2, jSONString, String.valueOf(i), str3);
        RSoLog.c(str2 + " = " + jSONString + ", [" + i + ":" + str3 + riy.ARRAY_END_STR);
    }

    private static void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
        } else if (map != null) {
            for (String str : map.keySet()) {
                if (ikw.b((CharSequence) str) && str.contains("-")) {
                    RSoLog.c("!!! Do not use '-' in track args key !!!, key=" + str);
                }
            }
        }
    }
}
