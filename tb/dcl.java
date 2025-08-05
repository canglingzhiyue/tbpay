package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;

/* loaded from: classes.dex */
public class dcl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-807063751);
    }

    public static void a(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5cd3435", new Object[]{str, str2, objArr});
            return;
        }
        ALog.e("Sync." + str, str2, objArr);
    }

    public static void a(String str, String str2, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4f0c298", new Object[]{str, str2, th, objArr});
            return;
        }
        ALog.e("Sync." + str, str2, th, objArr);
    }

    public static void b(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd0ff94", new Object[]{str, str2, objArr});
            return;
        }
        ALog.d("Sync." + str, str2, objArr);
    }
}
