package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class nyd {
    static {
        kge.a(-631216094);
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String REGISTER_MODULES = "registerModules";

        static {
            kge.a(1648052015);
        }

        public static void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            } else {
                AppMonitor.Alarm.commitSuccess("SearchNxWeex", str);
            }
        }

        public static void a(String str, String str2, String str3, String str4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
            } else {
                AppMonitor.Alarm.commitFail("SearchNxWeex", str, str2, str3, str4);
            }
        }

        public static void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            } else {
                AppMonitor.Alarm.commitFail("SearchNxWeex", str, str2, str3);
            }
        }
    }
}
