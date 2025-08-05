package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class bed {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PID = "28330-tracker";

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Long> f25831a;
    private static final Map<String, Map<String, String>> b;

    private static float b(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d660e7", new Object[]{new Float(f)})).floatValue() : f;
    }

    static {
        kge.a(845985640);
        f25831a = new HashMap();
        b = new HashMap();
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : ifp.a() ? "http://taobao.com/jstracker/android/cartdebug.html" : "http://taobao.com/jstracker/android/cart.html";
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            a("", str, 1.0f);
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            a(str, str2, 1.0f);
        }
    }

    public static void a(String str, String str2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba89c4", new Object[]{str, str2, new Float(f)});
        } else {
            jpr.a(jpu.a("iCart", PID, b()).c(str).a(b(f)).b(str2));
        }
    }

    public static void a(String str, String str2, boolean z, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69a02de8", new Object[]{str, str2, new Boolean(z), new Float(f)});
            return;
        }
        a b2 = a.b(str);
        b2.a(str2);
        b2.a(z);
        b2.a(f);
        a(b2);
    }

    public static void a(jpt jptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efd6a42a", new Object[]{jptVar});
        } else if (!(jptVar instanceof a)) {
            a("reportCustom", "请传入CartCustomModel");
            if (ifp.a()) {
                throw new IllegalArgumentException("请传入CartCustomModel");
            }
        } else {
            jpr.a(jptVar.a(b(jptVar.a())));
        }
    }

    public static void a(sda sdaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8084a8", new Object[]{sdaVar});
        } else if (!(sdaVar instanceof b)) {
            a("reportMtop", "请传入CartMtopModel");
            if (ifp.a()) {
                throw new IllegalArgumentException("请传入CartMtopModel");
            }
        } else {
            jpr.a(sdaVar.a(b(sdaVar.a())));
        }
    }

    public static void b(String str, String str2, long j, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eda56b9", new Object[]{str, str2, new Long(j), new Float(f)});
        } else if (j < 0) {
            jqg.a("iCart", "性能数据小于0，不合法:", str2);
        } else {
            c b2 = c.b(str);
            b2.a(str2, j);
            b2.b(f);
            a(b2);
        }
    }

    public static void a(fgf fgfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e87e10f3", new Object[]{fgfVar});
        } else if (!(fgfVar instanceof c)) {
            a("reportPerf", "perfModel必须为CartPerfModel类型");
            if (ifp.a()) {
                throw new IllegalArgumentException("请传入CartPerfModel");
            }
        } else {
            jpr.a(fgfVar);
        }
    }

    public static void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{new Float(f)});
        } else {
            jpr.a(new sdb("iCart", PID, b()).a(b(f)));
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends fgf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1968417244);
        }

        private c(String str, String str2, String str3) {
            super(str, str2, str3);
        }

        public static c b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("9ecbb6b3", new Object[]{str});
            }
            c cVar = new c("iCart", bed.PID, bed.b());
            cVar.a(str);
            return cVar;
        }
    }

    /* loaded from: classes2.dex */
    public static class a extends jpt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1972844132);
        }

        public a(String str, String str2, String str3, String str4) {
            super(str, str2, str3, str4);
        }

        public static a b(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("9ecbb675", new Object[]{str}) : new a("iCart", str, bed.PID, bed.b());
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends sda {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1450077861);
        }

        private b(String str, String str2, String str3, String str4, boolean z) {
            super(str, str2, str3, str4, z);
        }

        public static b a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("3eef9c05", new Object[]{str, new Boolean(z)}) : new b("iCart", bed.PID, bed.b(), str, z);
        }
    }
}
