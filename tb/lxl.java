package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* loaded from: classes7.dex */
public class lxl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f30970a;

    static {
        kge.a(875157416);
        f30970a = true;
        try {
            Class.forName("com.taobao.tao.log.TLog");
        } catch (Throwable unused) {
            f30970a = false;
        }
    }

    public static void a(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04957ad", new Object[]{str, strArr});
            return;
        }
        if (f30970a) {
            TLog.logd(str, strArr);
        }
        if (!a()) {
            return;
        }
        a(strArr);
    }

    public static void b(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7ae8ccc", new Object[]{str, strArr});
            return;
        }
        if (f30970a) {
            TLog.logi(str, strArr);
        }
        if (!a()) {
            return;
        }
        a(strArr);
    }

    public static void a(String str, Throwable th, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a94d3c", new Object[]{str, th, strArr});
            return;
        }
        if (f30970a) {
            TLog.logw(str, a(strArr), th);
        }
        if (!a()) {
            return;
        }
        a(strArr);
    }

    public static void c(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df13c1eb", new Object[]{str, strArr});
            return;
        }
        if (f30970a) {
            TLog.loge(str, strArr);
        }
        if (!a()) {
            return;
        }
        Log.e(str, a(strArr));
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
            return;
        }
        if (f30970a) {
            TLog.loge(str, str2, th);
        }
        if (!a()) {
            return;
        }
        Log.e(str, a(str2), th);
    }

    private static String a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a51c09c9", new Object[]{strArr});
        }
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        if (strArr.length == 1) {
            return strArr[0];
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
        }
        return sb.toString();
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : lxm.b();
    }
}
