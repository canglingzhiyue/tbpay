package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.engine.env.protocol.j;

/* loaded from: classes.dex */
public class ldf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static j f30494a;
    private static boolean b;

    static {
        kge.a(1965149496);
    }

    public static void a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9ab45c5", new Object[]{jVar});
            return;
        }
        f30494a = jVar;
        b = lcz.b();
    }

    public static void a(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04957ad", new Object[]{str, strArr});
            return;
        }
        String a2 = a(strArr);
        j jVar = f30494a;
        if (jVar == null) {
            return;
        }
        try {
            jVar.a("INFO_FLOW", str, a2);
        } catch (Throwable unused) {
        }
    }

    public static void b(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7ae8ccc", new Object[]{str, strArr});
            return;
        }
        String a2 = a(strArr);
        j jVar = f30494a;
        if (jVar == null) {
            return;
        }
        try {
            jVar.b("INFO_FLOW", str, a2);
        } catch (Throwable unused) {
        }
    }

    public static void c(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df13c1eb", new Object[]{str, strArr});
            return;
        }
        String a2 = a(strArr);
        j jVar = f30494a;
        if (jVar == null) {
            return;
        }
        try {
            jVar.c("INFO_FLOW", str, a2);
        } catch (Throwable unused) {
        }
    }

    public static void d(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e678f70a", new Object[]{str, strArr});
            return;
        }
        String a2 = a(strArr);
        if (b) {
            Log.e(str, a2);
        }
        j jVar = f30494a;
        if (jVar != null) {
            try {
                jVar.d("INFO_FLOW", str, a2);
                return;
            } catch (Throwable unused) {
                Log.e(str, a2);
                return;
            }
        }
        Log.e(str, a2);
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
            return;
        }
        if (b) {
            Log.e(str, str2, th);
        }
        j jVar = f30494a;
        if (jVar != null) {
            try {
                jVar.a(str, str2, th);
                return;
            } catch (Throwable unused) {
                Log.e(str, str2, th);
                return;
            }
        }
        Log.e(str, str2, th);
    }

    public static void a(String str, Throwable th, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a94d3c", new Object[]{str, th, strArr});
            return;
        }
        String a2 = a(strArr);
        if (b) {
            Log.e(str, a2, th);
        }
        j jVar = f30494a;
        if (jVar != null) {
            try {
                jVar.a(str, a2, th);
                return;
            } catch (Throwable unused) {
                Log.e(str, a2, th);
                return;
            }
        }
        Log.e(str, a2, th);
    }

    public static void e(final String str, final String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edde2c29", new Object[]{str, strArr});
        } else if (!b) {
        } else {
            ljd.a().a(new Runnable() { // from class: tb.ldf.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Log.e(nfc.PHA_MONITOR_MODULE_POINT_PERFORMANCE, riy.ARRAY_START_STR + str + "]:" + strArr[0]);
                }
            });
        }
    }

    private static String a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a51c09c9", new Object[]{strArr});
        }
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        if (strArr.length == 1) {
            return strArr[0];
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
        }
        return sb.toString();
    }
}
