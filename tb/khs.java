package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class khs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(41504218);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            khw.a(kib.a().b()).a("search_data", str);
        }
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        String str = (String) khw.a(kib.a().b()).b("search_data", "");
        khu.a("searchDataLoad: " + str);
        return str;
    }
}
