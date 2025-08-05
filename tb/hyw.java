package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class hyw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1951132752);
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : b();
    }

    private static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : jpx.a() ? "http://taobao.com/jstracker/android/debug/aura.html" : "http://taobao.com/jstracker/android/aura.html";
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            jpr.a(jpu.a("AURA", "26900-tracker", b()).c(str).b(str2));
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

    /* loaded from: classes2.dex */
    public static class a extends jpt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(644883585);
        }

        private a(String str, String str2, String str3, String str4) {
            super(str, str2, str3, str4);
        }

        public static a b(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("aa2b4350", new Object[]{str}) : new a("AURA", str, "26900-tracker", hyw.a());
        }
    }
}
