package tb;

import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bsu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final UMLinkLogInterface f26112a;

    static {
        kge.a(-1649485671);
        f26112a = bpp.a();
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
            return;
        }
        try {
            f26112a.logError("ultron_container", str, "exception", null, str3, str4, null, null);
            f26112a.commitFailure("exception", str2, "1.0", "ultron_container", str, null, str3, str4);
        } catch (Throwable unused) {
        }
    }
}
