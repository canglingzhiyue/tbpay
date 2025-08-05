package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class clc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static String f26343a = "";
    private static String b = "";
    private static String c = "";
    private static String d = "";
    private static String e = "";
    private static Map<String, String> f = new HashMap();

    public static synchronized String a(String str) {
        synchronized (clc.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
            }
            String concat = "apdidTokenCache".concat(String.valueOf(str));
            if (f.containsKey(concat)) {
                String str2 = f.get(concat);
                if (cjw.b(str2)) {
                    return str2;
                }
            }
            return "";
        }
    }

    public static synchronized void a() {
        synchronized (clc.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
            }
        }
    }

    public static synchronized void a(String str, String str2) {
        synchronized (clc.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
                return;
            }
            String concat = "apdidTokenCache".concat(String.valueOf(str));
            if (f.containsKey(concat)) {
                f.remove(concat);
            }
            f.put(concat, str2);
        }
    }

    public static synchronized void a(ckv ckvVar) {
        synchronized (clc.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e39f2b0a", new Object[]{ckvVar});
                return;
            }
            if (ckvVar != null) {
                f26343a = ckvVar.f26339a;
                b = ckvVar.b;
                c = ckvVar.c;
            }
        }
    }

    public static synchronized void a(ckw ckwVar) {
        synchronized (clc.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e39f9f69", new Object[]{ckwVar});
                return;
            }
            if (ckwVar != null) {
                f26343a = ckwVar.f26340a;
                b = ckwVar.b;
                d = ckwVar.d;
                e = ckwVar.e;
                c = ckwVar.c;
            }
        }
    }

    public static synchronized boolean a(Context context, String str) {
        synchronized (clc.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
            }
            long j = 86400000;
            try {
                long a2 = clb.a(context);
                if (a2 >= 0) {
                    j = a2;
                }
            } catch (Throwable unused) {
            }
            return Math.abs(System.currentTimeMillis() - clb.h(context, str)) < j;
        }
    }

    public static synchronized String b() {
        synchronized (clc.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
            }
            return f26343a;
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            f26343a = str;
        }
    }

    public static synchronized String c() {
        synchronized (clc.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
            }
            return b;
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else {
            b = str;
        }
    }

    public static synchronized String d() {
        synchronized (clc.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
            }
            return d;
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else {
            c = str;
        }
    }

    public static synchronized String e() {
        synchronized (clc.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]);
            }
            return e;
        }
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
        } else {
            d = str;
        }
    }

    public static synchronized String f() {
        synchronized (clc.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("50938a53", new Object[0]);
            }
            return c;
        }
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{str});
        } else {
            e = str;
        }
    }

    public static synchronized ckw g() {
        synchronized (clc.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ckw) ipChange.ipc$dispatch("3d2d2629", new Object[0]);
            }
            return new ckw(f26343a, b, c, d, e);
        }
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[0]);
            return;
        }
        f.clear();
        f26343a = "";
        b = "";
        d = "";
        e = "";
        c = "";
    }
}
