package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class plx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1685303082);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        pmd.a().m().b("LiveLog-" + str, str2);
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
            return;
        }
        pmd.a().m().a("LiveLog-" + str, str2);
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
            return;
        }
        pmd.a().m().d("LiveLog-" + str, str2);
    }
}
