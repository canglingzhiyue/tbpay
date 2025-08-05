package tb;

import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.alibaba.android.umbrella.link.export.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes2.dex */
public class bix {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final UMLinkLogInterface f25934a;

    static {
        kge.a(677600927);
        f25934a = bpp.a();
    }

    public static void a(String str, String str2, String str3, String str4, Map<UMDimKey, Object> map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("806d6953", new Object[]{str, str2, str3, str4, map, aVar});
        } else {
            f25934a.logError(bip.KEY_UMBRELLA_PAGE, str, str2, null, str3, str4, map, aVar);
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19b0c1eb", new Object[]{str, str2, str3, str4, str5, map});
        } else {
            f25934a.commitFailure(str2, str3, "1.0", bip.KEY_UMBRELLA_PAGE, str, map, str4, str5);
        }
    }

    public static void a(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109fb67f", new Object[]{str, str2, str3, map});
        } else {
            f25934a.commitSuccess(str2, str3, "1.0", bip.KEY_UMBRELLA_PAGE, str, map);
        }
    }
}
