package tb;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.j;

/* loaded from: classes.dex */
public class ijn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int a(ijd ijdVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c280712", new Object[]{ijdVar, str})).intValue();
        }
        Thread a2 = ika.a();
        if (Looper.getMainLooper().getThread() == a2) {
            RSoLog.c("puller -> call sync on Main thread, lib=" + str);
            return 1;
        }
        String name = a2.getName();
        if (ikw.b((CharSequence) name) && name.startsWith("launcher-") && name.split("-").length == 2) {
            RSoLog.c("puller -> call sync on launcher thread, lib=" + str);
            return 1;
        }
        long a3 = ijdVar.a("key_sync_timeout_all", 30L);
        return (int) ijdVar.a("key_sync_timeout_" + str, a3);
    }

    public static boolean b(ijd ijdVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4110cf64", new Object[]{ijdVar, str})).booleanValue() : ijdVar.a("key_last_index_white_list", "kernelu4_7z_uc").contains(str);
    }

    public static boolean a(j jVar, SoIndexData soIndexData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84b40370", new Object[]{jVar, soIndexData})).booleanValue();
        }
        String a2 = jVar.a();
        if (ikw.b((CharSequence) "kernelu4_7z_uc", (CharSequence) a2)) {
            return false;
        }
        String appVersion = soIndexData.getAppVersion();
        int[] a3 = a(appVersion);
        if (a3 == null || a3.length < 3) {
            ikq.a("isUCVerAvailable,error", appVersion);
            return false;
        }
        RSoLog.c("isUCVerAvailable, found data for " + a2 + ", ver=" + appVersion);
        int[] iArr = {10, 26, 30};
        for (int i = 0; i < 3 && a3[i] <= iArr[i]; i++) {
            if (a3[i] < iArr[i]) {
                return false;
            }
        }
        return true;
    }

    private static int[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("81233af2", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        try {
            String[] split = str.split("\\.");
            int[] iArr = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                iArr[i] = Integer.parseInt(split[i]);
            }
            return iArr;
        } catch (Throwable unused) {
            ikq.a("parseSemanticVer", "version = " + str);
            return null;
        }
    }
}
