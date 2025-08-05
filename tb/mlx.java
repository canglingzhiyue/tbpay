package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.c;
import java.util.Map;

/* loaded from: classes.dex */
public class mlx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static String f31101a = "1.0.1";
    public static String b = "unknown";
    public static String c = "unknown";
    public static String d = "unknown";
    public static String e = "unknown";
    public static String f = "unknown";
    public static String g = "unknown";
    public static String h = "unknown";
    public static String i = "unknown";
    public static String j = "unknown";
    public static String k = "unknown";
    public static String l = "unknown";
    public static String m = "";
    public static String n = "";
    public static String o = "unknown";
    public static String p = "unknown";
    public static String q = "unknown";
    public static String r = "unknown";
    public static String s = "normal";
    public static boolean t = false;
    public static String u = "unknown";
    public static String v = "unknown";
    public static String w = "unknown";

    public static void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            return;
        }
        e = a(map.get("appVersion"), e);
        w = a(map.get("packageTag"), w);
        h = a(map.get("deviceId"), h);
        q = a(map.get("process"), q);
        v = c.a().a("lastAppVersion", v);
    }

    private static String a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93e4ff52", new Object[]{obj, str});
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
        }
        return str;
    }
}
