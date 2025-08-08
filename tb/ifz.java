package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.calendar.sdk.db.schedule.Repeat;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ifz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1504776941);
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : b();
    }

    private static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : jpx.a() ? "http://taobao.com/jstracker/android/debug/tbbuy.html" : "http://taobao.com/jstracker/android/tbbuy.html";
    }

    public static void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{new Float(f)});
        } else {
            jpr.a(new sdb("AliBuy", "29224-tracker", b()).a(b(f)));
        }
    }

    private static float b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d660e7", new Object[]{new Float(f)})).floatValue();
        }
        if (!jpx.a() && !bxi.b()) {
            return f;
        }
        return 1.0f;
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            jpr.a(jpu.a("AliBuy", "29224-tracker", b()).c(str).b(str2));
        }
    }

    public static void a(String str, Map<String, Long> map, List<String> list, String str2, float f) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd10e4b2", new Object[]{str, map, list, str2, new Float(f)});
        } else if (map.isEmpty()) {
            jqg.a("AliBuyJSTracker#reportPerf", "stages 不能为空");
        } else {
            fgf a2 = new fgf("AliBuy", "29224-tracker", b()).a(str);
            if (list != null) {
                while (i < list.size()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Repeat.D);
                    int i2 = i + 1;
                    sb.append(i2);
                    a2.a(sb.toString(), list.get(i));
                    i = i2;
                }
            }
            for (Map.Entry<String, Long> entry : map.entrySet()) {
                a2.a(entry.getKey(), entry.getValue().longValue());
            }
            if (!StringUtils.isEmpty(str2)) {
                a2.d(str2);
            }
            a2.b(b(f));
            jpr.a(a2);
        }
    }

    public static void a(jpt jptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efd6a42a", new Object[]{jptVar});
        } else if (!(jptVar instanceof a)) {
            if (jpx.a()) {
                throw new IllegalArgumentException("model 必须为BuyCustomModel");
            }
        } else {
            if (jpx.a()) {
                jptVar.a(1.0f);
            }
            jpr.a(jptVar);
        }
    }

    public static void a(sda sdaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8084a8", new Object[]{sdaVar});
        } else if (!(sdaVar instanceof b)) {
            if (jpx.a()) {
                throw new IllegalArgumentException("model 必须为BuyMtopModel");
            }
        } else {
            if (jpx.a()) {
                sdaVar.a(1.0f);
            }
            jpr.a(sdaVar);
        }
    }

    /* loaded from: classes4.dex */
    public static class a extends jpt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2133576329);
        }

        private a(String str, String str2, String str3, String str4) {
            super(str, str2, str3, str4);
        }

        public static a b(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("aad5ba79", new Object[]{str}) : new a("AliBuy", str, "29224-tracker", ifz.a());
        }
    }

    /* loaded from: classes4.dex */
    public static class b extends sda {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-941177134);
        }

        private b(String str, String str2, String str3, String str4, boolean z) {
            super(str, str2, str3, str4, z);
        }

        public static b a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("4af9a009", new Object[]{str, new Boolean(z)}) : new b("AliBuy", "29224-tracker", ifz.a(), str, z);
        }
    }
}
