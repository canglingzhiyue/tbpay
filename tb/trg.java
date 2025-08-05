package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class trg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1132542837);
    }

    public static String a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bfa4f210", new Object[]{str, str2, str3, str4}) : pmd.a().t() != null ? pmd.a().t().b(str, str2, str3, str4) : str4;
    }
}
