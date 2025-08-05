package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class lbx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1057681896);
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        return str + "_";
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        String a2 = a(str);
        jqd a3 = jqd.a(str);
        a3.a(a2 + "requestParams", str2);
        jqd a4 = jqd.a(str);
        a4.a(a2 + "responseParams", str3);
    }
}
