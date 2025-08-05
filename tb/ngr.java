package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.k;
import com.taobao.pha.core.p;

/* loaded from: classes.dex */
public class ngr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-299616574);
    }

    private static String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{str}) : String.valueOf(str);
    }

    private static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        if (str == null) {
            str = "UNKNOWN_TAG";
        }
        return "PHA-LOG/" + str;
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (str2 == null) {
        } else {
            String b = b(str2);
            String c = c(str);
            k a2 = a();
            if (a2 == null) {
                return;
            }
            a2.a(c, b);
        }
    }

    @Deprecated
    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            b("UNKNOWN_TAG", str);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (str2 == null) {
        } else {
            String c = c(str);
            String b = b(str2);
            k a2 = a();
            if (a2 != null) {
                a2.b(c, b);
            } else {
                Log.e(c, b);
            }
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
        } else if (str2 == null) {
        } else {
            String c = c(str);
            String b = b(str2);
            k a2 = a();
            if (a2 == null) {
                return;
            }
            a2.c(c, b);
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else if (str2 == null) {
        } else {
            String c = c(str);
            String b = b(str2);
            k a2 = a();
            if (a2 == null) {
                return;
            }
            a2.d(c, b);
        }
    }

    private static k a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("10c0fcc5", new Object[0]);
        }
        if (p.b() != null) {
            return p.b().r();
        }
        return null;
    }
}
