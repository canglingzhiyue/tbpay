package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* loaded from: classes5.dex */
public class spz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ADAPTER_NAME = "ILoggerAdapter";
    public static final int DEBUG = 1;
    public static final int ERROR = 4;
    public static final int INFO = 2;
    public static final String MODULE = "Fluid";
    public static final int WARN = 3;

    static {
        kge.a(-39190905);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            a(1, str, str2);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else {
            a(2, str, str2);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
        } else {
            a(str, str2, (Throwable) null);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
        } else {
            a(4, str, str2, th);
        }
    }

    private static void a(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8114572f", new Object[]{new Integer(i), str, str2});
        } else {
            a(i, str, str2, null);
        }
    }

    private static void a(int i, String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecdd4026", new Object[]{new Integer(i), str, str2, th});
        } else if (i == 2) {
            TLog.logi(MODULE, str, str2);
        } else if (i == 3) {
            TLog.logw(MODULE, str, str2);
        } else if (i != 4) {
            TLog.logd(MODULE, str, str2);
        } else if (th == null) {
            TLog.loge(MODULE, str, str2);
        } else {
            TLog.loge(MODULE, str, str2, th);
        }
    }
}
