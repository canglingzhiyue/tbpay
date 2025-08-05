package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.protocol.adapter.optional.a;
import java.util.Map;

/* loaded from: classes4.dex */
public class epn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-265197);
        emu.a("com.taobao.android.detail.datasdk.protocol.utils.BaseMonitorUtils");
    }

    public static void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{str, str2, str3, str4, str5});
            return;
        }
        a e = epj.e();
        if (e == null) {
            return;
        }
        e.a(str, str2, str3, str4, str5);
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
            return;
        }
        a e = epj.e();
        if (e == null) {
            return;
        }
        e.a(str, str2, str3, str4);
    }

    public static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            return;
        }
        a e = epj.e();
        if (e == null) {
            return;
        }
        e.a(map);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        a e = epj.e();
        if (e == null) {
            return;
        }
        e.b(str, str2);
    }

    public static void a(String str, String str2, String str3, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bf98b8", new Object[]{str, str2, str3, new Double(d)});
            return;
        }
        a e = epj.e();
        if (e == null) {
            return;
        }
        e.a(str, str2, str3, d);
    }
}
