package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.m;

/* loaded from: classes7.dex */
public class xnh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f34399a;

    static {
        kge.a(-35630510);
        f34399a = null;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : !TextUtils.isEmpty(b());
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        if (f34399a == null) {
            f34399a = (String) m.a().a("HomepageScrollSmoothOpt", String.class);
        }
        if (f34399a == null) {
            f34399a = "";
        }
        return f34399a;
    }
}
