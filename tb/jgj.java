package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class jgj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c81dbf", new Object[]{str, objArr});
            return;
        }
        try {
            TLog.loge("CrashReport", str, a(objArr));
        } catch (Throwable th) {
            jfj.b(th);
        }
    }

    private static String a(Object... objArr) {
        String obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2583e9f7", new Object[]{objArr});
        }
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                if (obj2 instanceof Map) {
                    obj = a((Map) obj2);
                } else {
                    obj = obj2.toString();
                }
                sb.append("->");
                sb.append(obj);
            }
        }
        return sb.toString();
    }

    private static String a(Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map}) : new JSONObject(map).toString();
    }
}
