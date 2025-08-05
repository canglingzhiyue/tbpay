package com.taobao.trtc.utils;

import android.os.Process;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.kge;

/* loaded from: classes9.dex */
public class TrtcLog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f23183a;
    private static boolean b;

    /* renamed from: com.taobao.trtc.utils.TrtcLog$1  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23184a = new int[TrtcLogLevel.values().length];

        static {
            try {
                f23184a[TrtcLogLevel.E_LOG_LEVEL_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23184a[TrtcLogLevel.E_LOG_LEVEL_WARN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23184a[TrtcLogLevel.E_LOG_LEVEL_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23184a[TrtcLogLevel.E_LOG_LEVEL_DEBUG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23184a[TrtcLogLevel.E_LOG_LEVEL_VERBOSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes9.dex */
    public enum TrtcLogLevel {
        E_LOG_LEVEL_NONE,
        E_LOG_LEVEL_ERROR,
        E_LOG_LEVEL_WARN,
        E_LOG_LEVEL_INFO,
        E_LOG_LEVEL_DEBUG,
        E_LOG_LEVEL_VERBOSE
    }

    static {
        kge.a(64325994);
        f23183a = true;
        b = true;
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            f23183a = z;
        }
    }

    public static void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    public static void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{new Integer(i), str});
        } else if (i < 0 || i > TrtcLogLevel.values().length - 1) {
        } else {
            int i2 = AnonymousClass1.f23184a[TrtcLogLevel.values()[i].ordinal()];
            if (i2 == 1) {
                a("Ntrtc", str);
            } else if (i2 == 2) {
                c("Ntrtc", str);
            } else if (i2 == 3) {
                d("Ntrtc", str);
            } else if (i2 == 4) {
                b("Ntrtc", str);
            } else if (i2 != 5) {
            } else {
                e("Ntrtc", str);
            }
        }
    }

    private static void a(String str, TrtcLogLevel trtcLogLevel, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9dc8704", new Object[]{str, trtcLogLevel, str2});
        } else if (f23183a && AdapterForTLog.isValid()) {
            b(str, trtcLogLevel, str2);
            if (!b) {
            }
        } else {
            c(str, trtcLogLevel, str2);
        }
    }

    private static void b(String str, TrtcLogLevel trtcLogLevel, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1c8f485", new Object[]{str, trtcLogLevel, str2});
            return;
        }
        int i = AnonymousClass1.f23184a[trtcLogLevel.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            AdapterForTLog.loge(str, str2);
        } else if (i == 4) {
            AdapterForTLog.logd(str, str2);
        } else if (i != 5) {
        } else {
            AdapterForTLog.logv(str, str2);
        }
    }

    private static void c(String str, TrtcLogLevel trtcLogLevel, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b56206", new Object[]{str, trtcLogLevel, str2});
        } else if (AnonymousClass1.f23184a[trtcLogLevel.ordinal()] != 1) {
        } else {
            Log.e(str, str2);
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            a(a(str), TrtcLogLevel.E_LOG_LEVEL_ERROR, str2);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else {
            a(a(str), TrtcLogLevel.E_LOG_LEVEL_DEBUG, str2);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
        } else {
            a(a(str), TrtcLogLevel.E_LOG_LEVEL_WARN, str2);
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else {
            a(a(str), TrtcLogLevel.E_LOG_LEVEL_INFO, str2);
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else {
            a(a(str), TrtcLogLevel.E_LOG_LEVEL_VERBOSE, str2);
        }
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        Process.myPid();
        Process.myTid();
        String name = Thread.currentThread().getName();
        if (str == "Ntrtc") {
            return str + "/" + name;
        }
        return "Jtrtc/" + name + "/" + str;
    }
}
