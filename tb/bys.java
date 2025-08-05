package tb;

import com.taobao.tao.log.TLog;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class bys {
    static {
        kge.a(-739190110);
    }

    private static String a(Map map) {
        return new JSONObject(map).toString();
    }

    private static String a(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            if (obj != null) {
                String a2 = obj instanceof Map ? a((Map) obj) : obj.toString();
                sb.append("->");
                sb.append(a2);
            }
        }
        return sb.toString();
    }

    public static void a(String str, Object... objArr) {
        try {
            TLog.loge("tbrest", str, a(objArr));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
