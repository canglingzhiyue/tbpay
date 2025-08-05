package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.io.File;

/* loaded from: classes6.dex */
public class kfc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f30026a;

    static {
        kge.a(21276051);
        f30026a = false;
        try {
            f30026a = new File("/data/local/tmp/", ".tbbrowser_log_open").exists();
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (f30026a) {
            Log.e(str, str2);
        } else {
            TLog.loge(str, str2);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (f30026a) {
            Log.e(str, str2);
        } else {
            TLog.loge(str, str2);
        }
    }
}
