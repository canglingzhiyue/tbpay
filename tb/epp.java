package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.protocol.adapter.optional.d;

/* loaded from: classes4.dex */
public class epp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(482533880);
        emu.a("com.taobao.android.detail.datasdk.protocol.utils.LogUtils");
    }

    private static d b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("338f1bf8", new Object[0]) : epj.i();
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        d b = b();
        if (b == null) {
            return;
        }
        b.a("Detail_SDK", riy.ARRAY_START_STR + str + "] " + str2);
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
            return;
        }
        d b = b();
        if (b == null) {
            return;
        }
        b.b("Detail_SDK", riy.ARRAY_START_STR + str + "] " + str2);
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
            return;
        }
        d b = b();
        if (b == null) {
            return;
        }
        b.c("Detail_SDK", riy.ARRAY_START_STR + str + "] " + str2);
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
            return;
        }
        d b = b();
        if (b == null) {
            return;
        }
        b.d("Detail_SDK", riy.ARRAY_START_STR + str + "] " + str2);
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
            return;
        }
        d b = b();
        if (b == null) {
            return;
        }
        b.b("Detail_SDK", riy.ARRAY_START_STR + str + "] " + str2, th);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        d b = b();
        return b == null || b.a();
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
