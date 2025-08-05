package com.taobao.tlog.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.TLog;

/* loaded from: classes.dex */
public class AdapterForTLog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static boolean isValid = false;

    @Deprecated
    public static void traceLog(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e33b4eda", new Object[]{str, str2});
        }
    }

    static {
        try {
            Class.forName("com.taobao.tao.log.TLog");
            isValid = true;
        } catch (ClassNotFoundException unused) {
            isValid = false;
        }
    }

    public static boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[0])).booleanValue() : isValid;
    }

    public static void logv(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("693e017c", new Object[]{str, strArr});
        } else if (!isValid) {
        } else {
            TLog.logv(str, strArr);
        }
    }

    public static void logd(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e420454e", new Object[]{str, strArr});
        } else if (!isValid) {
        } else {
            TLog.logd(str, strArr);
        }
    }

    public static void logi(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a4ee9", new Object[]{str, strArr});
        } else if (!isValid) {
        } else {
            TLog.logi(str, strArr);
        }
    }

    public static void logw(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a3369b", new Object[]{str, strArr});
        } else if (!isValid) {
        } else {
            TLog.logw(str, strArr);
        }
    }

    public static void loge(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb857a6d", new Object[]{str, strArr});
        } else if (!isValid) {
        } else {
            TLog.loge(str, strArr);
        }
    }

    public static void logv(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2eedcd", new Object[]{str, str2});
        } else if (!isValid) {
        } else {
            TLog.logv(str, str2);
        }
    }

    public static void logd(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bebe7bb", new Object[]{str, str2});
        } else if (!isValid) {
        } else {
            TLog.logd(str, str2);
        }
    }

    public static void logi(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db0cbec0", new Object[]{str, str2});
        } else if (!isValid) {
        } else {
            TLog.logi(str, str2);
        }
    }

    public static void logw(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bcf18ce", new Object[]{str, str2});
        } else if (!isValid) {
        } else {
            TLog.logw(str, str2);
        }
    }

    public static void loge(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88c12bc", new Object[]{str, str2});
        } else if (!isValid) {
        } else {
            TLog.loge(str, str2);
        }
    }

    public static void logw(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("192407e7", new Object[]{str, str2, th});
        } else if (!isValid) {
        } else {
            TLog.logw(str, str2, th);
        }
    }

    public static void loge(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc02eb9", new Object[]{str, str2, th});
        } else if (!isValid) {
        } else {
            TLog.loge(str, str2, th);
        }
    }

    public static String getLogLevel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb391159", new Object[]{str});
        }
        if (!isValid) {
            return "L";
        }
        com.taobao.tao.log.e a2 = com.taobao.tao.log.e.a();
        if (a2 != null) {
            LogLevel a3 = a2.a(str);
            if (a3 != null) {
                return a3.toString();
            }
            return LogLevel.N.toString();
        }
        return LogLevel.N.toString();
    }

    public static String getLogLevel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b10888a3", new Object[0]) : getLogLevel(null);
    }
}
