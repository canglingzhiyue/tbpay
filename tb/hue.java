package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class hue {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1609730061);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (pmd.a().m() == null) {
        } else {
            pnj m = pmd.a().m();
            m.a("TBMiniLive" + str, str2);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (pmd.a().m() == null) {
        } else {
            pnj m = pmd.a().m();
            m.b("TBMiniLive" + str, str2);
        }
    }
}
