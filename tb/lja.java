package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.StringTokenizer;

/* loaded from: classes7.dex */
public class lja {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1119215120);
    }

    public static Object a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("42bc9164", new Object[]{str, obj});
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, dmp.DELIMITER, false);
        while (stringTokenizer.hasMoreTokens()) {
            obj = a(obj, stringTokenizer.nextToken());
        }
        return obj;
    }

    private static Object a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a12221e4", new Object[]{obj, str});
        }
        if (obj != null && str != null) {
            if (obj instanceof JSONObject) {
                return ((JSONObject) obj).get(str);
            }
            if (obj instanceof JSONArray) {
                try {
                    return ((JSONArray) obj).get(Integer.parseInt(str));
                } catch (Exception e) {
                    ldf.a("ExpressionParser", "ExpressionParser list index is not number", e);
                }
            }
        }
        return null;
    }
}
