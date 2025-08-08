package com.taobao.tao.log;

import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.utils.MainAnrOptThreadPool;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.kge;

/* loaded from: classes.dex */
public class TLog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.tao.log.TLog$2  reason: invalid class name */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20683a = new int[LogLevel.values().length];

        static {
            try {
                f20683a[LogLevel.D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20683a[LogLevel.I.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20683a[LogLevel.W.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20683a[LogLevel.E.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20683a[LogLevel.V.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        kge.a(792242107);
    }

    private static void log(final LogLevel logLevel, String str, String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfb58f69", new Object[]{logLevel, str, str2, str3});
        } else if (StringUtils.isEmpty(str3)) {
        } else {
            if (StringUtils.isEmpty(str)) {
                if (StringUtils.isEmpty(str2)) {
                    str = "module";
                } else if (str2.contains(".")) {
                    String substring = str2.substring(0, str2.indexOf("."));
                    str2 = str2.substring(str2.indexOf(".") + 1);
                    str = substring;
                } else {
                    str = str2;
                }
            }
            if (StringUtils.isEmpty(str2)) {
                str2 = "tag";
            }
            if (d.l()) {
                final long currentTimeMillis = System.currentTimeMillis();
                final String str4 = str;
                final String str5 = str2;
                Runnable runnable = new Runnable() { // from class: com.taobao.tao.log.TLog.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            TLogNative.writeCodeLog(LogLevel.this, str4, str5, str3, true, currentTimeMillis);
                        }
                    }
                };
                if (d.m()) {
                    MainAnrOptThreadPool.execute(runnable);
                } else {
                    com.taobao.tao.log.utils.d.a().c(runnable);
                }
            } else {
                TLogNative.writeCodeLog(logLevel, str, str2, str3, false, 0L);
            }
            if (!f.a().q()) {
                return;
            }
            toLogcat(logLevel, str, str2, str3);
        }
    }

    public static void logv(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0631e57", new Object[]{str, str2, str3});
        } else {
            log(LogLevel.V, str, str2, str3);
        }
    }

    @Deprecated
    public static void logv(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2eedcd", new Object[]{str, str2});
        } else {
            logv("", str, str2);
        }
    }

    @Deprecated
    public static void logv(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("693e017c", new Object[]{str, strArr});
        } else if (strArr != null) {
            if (strArr.length == 1) {
                logv("", str, strArr[0]);
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (String str2 : strArr) {
                sb.append(str2);
                sb.append(" ");
            }
            logv("", str, sb.toString());
        }
    }

    public static void logd(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("939ab8c5", new Object[]{str, str2, str3});
        } else {
            log(LogLevel.D, str, str2, str3);
        }
    }

    @Deprecated
    public static void logd(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bebe7bb", new Object[]{str, str2});
        } else {
            logd("", str, str2);
        }
    }

    @Deprecated
    public static void logd(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e420454e", new Object[]{str, strArr});
        } else if (strArr != null) {
            if (strArr.length == 1) {
                logd("", str, strArr[0]);
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (String str2 : strArr) {
                sb.append(str2);
                sb.append(" ");
            }
            logd("", str, sb.toString());
        }
    }

    public static void logi(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e727b88a", new Object[]{str, str2, str3});
        } else {
            log(LogLevel.I, str, str2, str3);
        }
    }

    @Deprecated
    public static void logi(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db0cbec0", new Object[]{str, str2});
        } else {
            logi("", str, str2);
        }
    }

    @Deprecated
    public static void logi(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a4ee9", new Object[]{str, strArr});
        } else if (strArr != null) {
            if (strArr.length == 1) {
                logi("", str, strArr[0]);
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (String str2 : strArr) {
                sb.append(str2);
                sb.append(" ");
            }
            logi("", str, sb.toString());
        }
    }

    public static void logw(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d118eb18", new Object[]{str, str2, str3});
        } else {
            log(LogLevel.W, str, str2, str3);
        }
    }

    @Deprecated
    public static void logw(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bcf18ce", new Object[]{str, str2});
        } else {
            logw("", str, str2);
        }
    }

    @Deprecated
    public static void logw(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a3369b", new Object[]{str, strArr});
        } else if (strArr != null) {
            if (strArr.length == 1) {
                logw("", str, strArr[0]);
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (String str2 : strArr) {
                sb.append(str2);
                sb.append(" ");
            }
            logw("", str, sb.toString());
        }
    }

    public static void loge(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4508586", new Object[]{str, str2, str3});
        } else {
            log(LogLevel.E, str, str2, str3);
        }
    }

    @Deprecated
    public static void loge(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88c12bc", new Object[]{str, str2});
        } else {
            loge("", str, str2);
        }
    }

    @Deprecated
    public static void loge(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb857a6d", new Object[]{str, strArr});
        } else if (strArr != null) {
            if (strArr.length == 1) {
                loge("", str, strArr[0]);
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (String str2 : strArr) {
                sb.append(str2);
                sb.append(" ");
            }
            loge("", str, sb.toString());
        }
    }

    @Deprecated
    public static void logw(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("192407e7", new Object[]{str, str2, th});
        } else {
            logw("", str, str2, th);
        }
    }

    public static void logw(String str, String str2, String str3, Throwable th) {
        String exceptionMsg;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c13967dd", new Object[]{str, str2, str3, th});
            return;
        }
        if (th == null) {
            exceptionMsg = str3 + "******* NULL == e *******";
        } else {
            exceptionMsg = getExceptionMsg(str3, th);
        }
        log(LogLevel.W, str, str2, exceptionMsg);
    }

    @Deprecated
    public static void loge(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc02eb9", new Object[]{str, str2, th});
        } else {
            loge("", str, str2, th);
        }
    }

    public static void loge(String str, String str2, String str3, Throwable th) {
        String exceptionMsg;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("261c3e2f", new Object[]{str, str2, str3, th});
            return;
        }
        if (th == null) {
            exceptionMsg = str3 + "******* NULL == e *******";
        } else {
            exceptionMsg = getExceptionMsg(str3, th);
        }
        log(LogLevel.E, str, str2, exceptionMsg);
    }

    private static String getExceptionMsg(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("533fe44", new Object[]{str, th});
        }
        if (th == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\r\n");
        Throwable th2 = th;
        do {
            sb.append(th2.getClass().getName());
            sb.append(ResponseProtocolType.COMMENT);
            sb.append(th2.getMessage());
            sb.append("\r\n");
            StackTraceElement[] stackTrace = th.getStackTrace();
            StackTraceElement[] stackTrace2 = th.getStackTrace();
            int length = stackTrace2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace2[i];
                if (sb.length() >= 51200) {
                    sb.append(String.format("\t... total %d.\r\n", Integer.valueOf(stackTrace.length)));
                    break;
                }
                sb.append("\tat ");
                sb.append(stackTraceElement);
                sb.append("\r\n");
                i++;
            }
            th2 = th2.getCause();
            if (th2 != null) {
                sb.append("Caused by: ");
                continue;
            }
        } while (th2 != null);
        return sb.toString();
    }

    public static void toLogcat(LogLevel logLevel, String str, String str2, String str3) {
        int d;
        StringBuilder sb = new StringBuilder();
        if (str3 == null) {
            str3 = "";
        }
        if (StringUtils.isEmpty(str)) {
            sb.append(str2);
        } else {
            sb.append(str);
            sb.append(".");
            sb.append(str2);
        }
        String sb2 = sb.toString();
        if (Build.VERSION.SDK_INT >= 30 && sb2.length() > 100) {
            sb2 = sb2.substring(0, 100);
        }
        int i = AnonymousClass2.f20683a[logLevel.ordinal()];
        if (i == 1) {
            d = Log.d(sb2, str3);
        } else if (i == 2) {
            d = Log.i(sb2, str3);
        } else if (i == 3) {
            d = Log.w(sb2, str3);
        } else if (i == 4) {
            d = Log.e(sb2, str3);
        } else {
            d = Log.v(sb2, str3);
        }
        if (d == -100) {
            try {
                Log.class.getMethod(logLevel.getName().toLowerCase(), String.class, String.class).invoke(null, sb2, str3);
            } catch (Exception unused) {
            }
        }
    }
}
