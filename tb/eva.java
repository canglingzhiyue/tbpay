package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class eva {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        tpc.a("com.taobao.android.detail.protocol.utils.LogUtils");
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || euy.f() == null) {
        } else {
            euy.f().a(str, str2);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || euy.f() == null) {
        } else {
            euy.f().b(str, str2);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || euy.f() == null) {
        } else {
            euy.f().c(str, str2);
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : euy.f() == null || euy.f().a();
    }

    public static void a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{th});
        } else if (a() || th == null) {
        } else {
            th.printStackTrace();
        }
    }
}
