package tb;

import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umbrella.link.export.a;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class hvh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final UMLinkLogInterface f28811a = bpp.a();

    public static void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{str, str2, str3, str4, str5});
            return;
        }
        a a2 = a.a(str5);
        a2.b("tag", str);
        f28811a.logError("add_bag", "", str2, null, str3, str4, null, a2);
    }
}
