package android.taobao.windvane.monitor;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EVENTID_DEV_STORAGE = 15307;
    public static final int EVENTID_ERROR = 15306;
    public static final int EVENTID_MONITOR = 15301;
    public static final int EVENTID_PA_APPS = 15305;
    public static final int EVENTID_PA_SAPP = 15303;
    public static final int EVENTID_PA_UCSDK = 15309;
    public static boolean OFF;

    /* renamed from: a  reason: collision with root package name */
    private static Method f1677a;
    private static Method b;
    private static Method c;
    private static boolean d;

    static {
        kge.a(-1880742135);
        OFF = false;
        d = false;
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (d) {
        } else {
            try {
                Class<?> cls = Class.forName("com.taobao.statistic.TBS$Ext");
                f1677a = cls.getDeclaredMethod("commitEvent", Integer.TYPE, Object.class, Object.class, Object.class);
                b = cls.getDeclaredMethod("commitEvent", String.class, Integer.TYPE, Object.class, Object.class, Object.class, String[].class);
                c = cls.getDeclaredMethod("commitEvent", Integer.TYPE, Object.class, Object.class, Object.class, String[].class);
                d = true;
            } catch (ClassNotFoundException unused) {
                android.taobao.windvane.util.m.b("UserTrackUtil", "UT class not found");
            } catch (NoSuchMethodException unused2) {
                android.taobao.windvane.util.m.b("UserTrackUtil", "UT method not found");
            }
        }
    }

    public static void commitEvent(int i, String str, String str2, String str3) {
        if (f1677a == null || android.taobao.windvane.config.j.commonConfig.d == 0) {
            return;
        }
        try {
            if (android.taobao.windvane.util.m.a()) {
                android.taobao.windvane.util.m.b("UserTrackUtil", "commitEvent: " + i + "||" + str + "||" + str2 + "||" + str3);
            }
            f1677a.invoke(null, Integer.valueOf(i), str, str2, str3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void commitEvent(String str, int i, String str2, String str3, String str4, String str5) {
        if (b == null || android.taobao.windvane.config.j.commonConfig.d == 0) {
            return;
        }
        try {
            if (android.taobao.windvane.util.m.a()) {
                android.taobao.windvane.util.m.b("UserTrackUtil", "commitEvent: " + str + "||" + i + "||" + str2 + "||" + str3 + "||" + str4 + ((Object) TextUtils.concat(str5)));
            }
            b.invoke(null, str, Integer.valueOf(i), str2, str3, str4, new String[]{str5});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void commitEvent(int i, String str, String str2, String str3, String[] strArr) {
        if (c == null || android.taobao.windvane.config.j.commonConfig.d == 0) {
            return;
        }
        try {
            if (android.taobao.windvane.util.m.a()) {
                android.taobao.windvane.util.m.b("UserTrackUtil", "commitEvent: " + i + "||" + str + "||" + str2 + "||" + str3 + ((Object) TextUtils.concat(strArr)));
            }
            c.invoke(null, Integer.valueOf(i), str, str2, str3, strArr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String toArgString(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97cd000e", new Object[]{map});
        }
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(map.size() * 28);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key)) {
                sb.append(key);
                sb.append("=");
                sb.append(entry.getValue());
                sb.append(",");
            }
        }
        return sb.substring(0, sb.length() - 1);
    }
}
