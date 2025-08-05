package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class lwx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORANGE_GROUP_NAME = "homepage_switch";

    static {
        kge.a(325032502);
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3}) : lww.a().a(str, str2, str3);
    }
}
