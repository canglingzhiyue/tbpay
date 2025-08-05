package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.a;

/* loaded from: classes.dex */
public class omr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorMsg", (Object) str2);
            jSONObject.put("errorCode", (Object) str);
            AppMonitor.Counter.commit(a.a(), "navigation_exception", jSONObject.toJSONString(), 1.0d);
        } catch (Throwable th) {
            TLog.loge(a.a(), "NavigationMonitor", "count failed", th);
        }
    }
}
