package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.f;

/* loaded from: classes6.dex */
public final class hyn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1980007484);
    }

    public static void a(String str, String str2, String str3, String str4, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e010a68f", new Object[]{str, str2, str3, str4, strArr});
        } else if (f.b() == null) {
        } else {
            f.b().a(str, str2, str3, str4, 0, strArr);
        }
    }

    public static void a(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("434e6e23", new Object[]{str, str2, strArr});
        } else {
            a(str, str2, "", "", strArr);
        }
    }

    public static void a(String str, String str2, String str3, String str4, int i, String str5, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35009098", new Object[]{str, str2, str3, str4, new Integer(i), str5, th});
        } else if (f.b() == null) {
        } else {
            f.b();
            new String[1][0] = str5;
        }
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
        } else {
            a(str, str2, "0", "", 0, "", th);
        }
    }
}
