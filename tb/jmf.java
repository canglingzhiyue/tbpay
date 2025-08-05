package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class jmf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Long> f29629a;

    static {
        kge.a(1866111386);
        f29629a = new HashMap();
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (!jmi.b()) {
        } else {
            try {
                f29629a.put(str, Long.valueOf(SystemClock.uptimeMillis()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void a(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04957ad", new Object[]{str, strArr});
        } else if (!jmi.b()) {
        } else {
            try {
                if (f29629a.get(str) == null) {
                    return;
                }
                jkq.a("TS.performance", String.format("%s, %s, %s costTime = %d,", jmi.a(), str, a(strArr), Long.valueOf(SystemClock.uptimeMillis() - f29629a.remove(str).longValue())));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static String a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a51c09c9", new Object[]{strArr});
        }
        if (strArr == null || strArr.length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
            sb.append(" ");
        }
        return sb.toString();
    }
}
