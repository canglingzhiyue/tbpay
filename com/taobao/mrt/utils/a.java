package com.taobao.mrt.utils;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.service.LogService;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import tb.dqy;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f18266a;
    private static LogService.LogReceiver b;
    private static e c;
    private static g d;

    /* renamed from: com.taobao.mrt.utils.a$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18267a = new int[LogService.LogLevel.values().length];

        static {
            try {
                f18267a[LogService.LogLevel.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18267a[LogService.LogLevel.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18267a[LogService.LogLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18267a[LogService.LogLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        kge.a(1135239541);
        f18266a = "MRT";
        b = LogService.LogReceiver.None;
        c = null;
        d = null;
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            a(LogService.LogSource.JAVA, LogService.LogLevel.INFO, str, str2, (Throwable) null);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else {
            a(LogService.LogSource.JAVA, LogService.LogLevel.DEBUG, str, str2, (Throwable) null);
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
            a(LogService.LogSource.JAVA, LogService.LogLevel.WARNING, str, str2, th);
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else {
            b(str, str2, null);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586f5b98", new Object[]{str, str2, th});
        } else {
            a(LogService.LogSource.JAVA, LogService.LogLevel.ERROR, str, str2, th);
        }
    }

    @Deprecated
    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else {
            a(LogService.LogSource.JAVA, LogService.LogLevel.DEBUG, str, str2, (Throwable) null);
        }
    }

    @Deprecated
    public static void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98586481", new Object[]{str, str2});
        } else {
            c(str, str2, null);
        }
    }

    @Deprecated
    public static void c(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecadcb37", new Object[]{str, str2, th});
        } else {
            a(LogService.LogSource.JAVA, LogService.LogLevel.ERROR, str, str2, th);
        }
    }

    @Deprecated
    public static void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f88f82", new Object[]{str, str2});
        } else {
            a(LogService.LogSource.JAVA, LogService.LogLevel.INFO, str, str2, (Throwable) null);
        }
    }

    public static void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{str, obj});
            return;
        }
        LogService.LogReceiver logReceiver = b;
        if (logReceiver == null || logReceiver == LogService.LogReceiver.None) {
            return;
        }
        LogService.LogSource logSource = LogService.LogSource.PYTHON;
        LogService.LogLevel logLevel = LogService.LogLevel.DEBUG;
        String str2 = "";
        if (obj != null) {
            str2 = obj + str2;
        }
        a(logSource, logLevel, str, str2, (Throwable) null);
    }

    private static LogService.LogLevel b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LogService.LogLevel) ipChange.ipc$dispatch("1807626c", new Object[]{str});
        }
        LogService.LogLevel logLevel = LogService.LogLevel.DEBUG;
        if (str.equals("DEBUG")) {
            return LogService.LogLevel.DEBUG;
        }
        if (str.equals("INFO")) {
            return LogService.LogLevel.INFO;
        }
        if (str.equals("WARN")) {
            return LogService.LogLevel.WARNING;
        }
        if (str.equals("ERROR")) {
            return LogService.LogLevel.ERROR;
        }
        return str.equals("CONFIG") ? LogService.LogLevel.CONFIG : logLevel;
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else if (str2.equals("C")) {
            a(LogService.LogSource.C, b(str), str2, str3, (Throwable) null);
        } else if (!str2.equals("P")) {
        } else {
            a(LogService.LogSource.PYTHON, b(str), str2, str3, (Throwable) null);
        }
    }

    public static synchronized void a(String str) {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
                return;
            }
            if (c == null) {
                c = new e();
            }
            c.a(str);
            a(LogService.LogReceiver.All);
            a(true);
        }
    }

    private static void a(LogService.LogSource logSource, LogService.LogLevel logLevel, String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0fb60b8", new Object[]{logSource, logLevel, str, str2, th});
        } else if (b == LogService.LogReceiver.None) {
        } else {
            String a2 = a(logSource.name, logLevel.name, str, str2, th);
            if (!logSource.name.equals("java") && !logSource.name.equals(dqy.TYPE)) {
                logSource.name.equals("C");
            }
            if (b == LogService.LogReceiver.Console) {
                b(logSource, logLevel, c(str), a2, th);
            } else if (b == LogService.LogReceiver.WorkStation) {
                if (d == null) {
                }
            } else if (b != LogService.LogReceiver.All) {
            } else {
                b(logSource, logLevel, c(str), a2, th);
                e eVar = c;
                if (eVar == null) {
                    return;
                }
                eVar.a(logSource, logLevel, c(str), a2, th);
            }
        }
    }

    private static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        return f18266a + "." + str;
    }

    private static void b(LogService.LogSource logSource, LogService.LogLevel logLevel, String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc17e9f9", new Object[]{logSource, logLevel, str, str2, th});
            return;
        }
        int i = AnonymousClass1.f18267a[logLevel.ordinal()];
        if (i == 1) {
            if (com.taobao.mrt.c.c()) {
                return;
            }
            AdapterForTLog.logi(str, str2);
        } else if (i == 2) {
            if (com.taobao.mrt.c.c()) {
                return;
            }
            AdapterForTLog.logd(str, str2);
        } else if (i == 3) {
            if (com.taobao.mrt.c.c()) {
                return;
            }
            AdapterForTLog.logw(str, str2, th);
        } else if (i != 4) {
        } else {
            if (com.taobao.mrt.c.c()) {
                Log.e(str, str2, th);
            } else {
                AdapterForTLog.loge(str, str2, th);
            }
        }
    }

    public static void a(boolean z) {
        Method declaredMethod;
        try {
            Class<?> cls = Class.forName("com.tmall.android.dai.internal.util.LogUtil");
            if (cls == null || (declaredMethod = cls.getDeclaredMethod("setCLoggerEnable", Boolean.TYPE)) == null) {
                return;
            }
            declaredMethod.invoke(null, Boolean.valueOf(z));
        } catch (Throwable unused) {
        }
    }

    public static void a(LogService.LogReceiver logReceiver) {
        Method declaredMethod;
        b = logReceiver;
        try {
            Class<?> cls = Class.forName("com.tmall.android.dai.internal.util.LogUtil");
            if (cls == null || (declaredMethod = cls.getDeclaredMethod("setCLoggerReceiver", Integer.TYPE)) == null) {
                return;
            }
            declaredMethod.invoke(null, Integer.valueOf(logReceiver.value));
        } catch (Throwable unused) {
        }
    }

    private static String a(String str, String str2, String str3, String str4, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("feaa91db", new Object[]{str, str2, str3, str4, th});
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm:ss.SSS");
        StringBuilder sb = new StringBuilder();
        sb.append(simpleDateFormat.format(Long.valueOf(System.currentTimeMillis())));
        sb.append(" ");
        sb.append(str3);
        sb.append(" ");
        if (StringUtils.equals(str2, "WARN")) {
            sb.append(" W");
        } else if (StringUtils.equals(str2, "ERROR")) {
            sb.append(" E");
        } else if (StringUtils.equals(str2, "INFO")) {
            sb.append(" I");
        } else {
            sb.append(" D");
        }
        sb.append("/EC_");
        if (StringUtils.equals(str, "java")) {
            sb.append("J");
        } else if (StringUtils.equals(str, dqy.TYPE)) {
            sb.append("P");
        } else {
            sb.append("C");
        }
        sb.append(" ");
        sb.append(str4);
        if (th != null) {
            sb.append("\n");
            sb.append(Log.getStackTraceString(th));
        }
        return sb.toString();
    }
}
