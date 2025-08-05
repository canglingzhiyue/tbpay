package org.android.spdy;

import android.util.Log;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import tb.sad;

/* loaded from: classes.dex */
public class spduLog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static int defaultLogLevel = 0;
    private static volatile boolean isValid = false;

    /* loaded from: classes.dex */
    public static class Level {
        public static final int D = 1;
        public static final int E = 4;
        public static final int F = 5;
        public static final int I = 2;
        public static final int V = 0;
        public static final int W = 3;
    }

    public static void Logd(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be5ebbdb", new Object[]{str, str2});
        } else if (!SpdyAgent.enableDebug || str == null || str2 == null) {
        } else {
            String str3 = Thread.currentThread().getId() + " - " + str2;
        }
    }

    public static void Logd(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be4b8af7", new Object[]{str, str2, obj});
        } else if (!SpdyAgent.enableDebug) {
        } else {
            Logd(str, str2 + String.valueOf(obj));
        }
    }

    public static void Loge(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4afee6dc", new Object[]{str, str2});
        } else if (!SpdyAgent.enableDebug || str == null || str2 == null) {
        } else {
            Log.e(str, Thread.currentThread().getId() + " - " + str2);
        }
    }

    public static void Loge(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf0157b8", new Object[]{str, str2, obj});
        } else if (!SpdyAgent.enableDebug) {
        } else {
            Loge(str, str2 + obj);
        }
    }

    public static void Logi(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d7f92e0", new Object[]{str, str2});
        } else if (!SpdyAgent.enableDebug || str == null || str2 == null) {
        } else {
            String str3 = Thread.currentThread().getId() + " - " + str2;
        }
    }

    public static void Logi(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32733fe4", new Object[]{str, str2, new Long(j)});
        } else if (!SpdyAgent.enableDebug) {
        } else {
            Logi(str, str2 + String.valueOf(j));
        }
    }

    public static void Logi(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d88abc", new Object[]{str, str2, obj});
        } else if (!SpdyAgent.enableDebug) {
        } else {
            Logi(str, str2 + obj);
        }
    }

    static {
        try {
            Class.forName("anet.channel.util.ALog");
            isValid = true;
        } catch (ClassNotFoundException unused) {
            isValid = false;
        }
        defaultLogLevel = 4;
    }

    private static void d(String str, String str2, String str3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d85ce08", new Object[]{str, str2, str3, objArr});
            return;
        }
        try {
            if (!isValid) {
                return;
            }
            ALog.d(str, str2, str3, objArr);
        } catch (Throwable unused) {
        }
    }

    private static void i(String str, String str2, String str3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca8c6623", new Object[]{str, str2, str3, objArr});
            return;
        }
        try {
            if (!isValid) {
                return;
            }
            ALog.i(str, str2, str3, objArr);
        } catch (Throwable unused) {
        }
    }

    private static void e(String str, String str2, String str3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66871fa7", new Object[]{str, str2, str3, objArr});
            return;
        }
        try {
            if (!isValid) {
                return;
            }
            ALog.e(str, str2, str3, objArr);
        } catch (Throwable unused) {
        }
    }

    public static void Tloge(String str, String str2, String str3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ea6e17", new Object[]{str, str2, str3, objArr});
        } else {
            logAdapter(4, str, str2, str3, objArr);
        }
    }

    public static void logAdapter(int i, String str, String str2, String str3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24cfece2", new Object[]{new Integer(i), str, str2, str3, objArr});
        } else if (!sad.a() || i < defaultLogLevel) {
        } else {
            if (i == 1) {
                d(str, str3 + "|", str2, objArr);
            } else if (i == 2) {
                i(str, str3 + "|", str2, objArr);
            } else if (i != 4) {
            } else {
                e(str, str3 + "|", str2, objArr);
            }
        }
    }
}
