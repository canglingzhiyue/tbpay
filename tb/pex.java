package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class pex {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{str, obj});
        } else if (pmd.a().m() == null) {
        } else {
            pmd.a().m().a(String.format("TaoLiveMessage[%s]", str), obj);
        }
    }

    public static void b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18567e8f", new Object[]{str, obj});
        } else if (pmd.a().m() == null) {
        } else {
            pmd.a().m().b(String.format("TaoLiveMessage[%s]", str), obj);
        }
    }
}
