package com.taobao.android.remoteso.log;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public final class RSoLog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "RemoteSo";

    /* renamed from: a  reason: collision with root package name */
    private static final com.taobao.android.remoteso.log.a f14814a;
    private static volatile b b;
    private static LogLevel c;

    /* loaded from: classes6.dex */
    public enum LogLevel {
        DEBUG,
        INFO,
        WARN,
        ERROR;

        boolean shouldLog(LogLevel logLevel) {
            return compareTo(logLevel) <= 0;
        }
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f14815a;

        public a(String str) {
            this.f14815a = str;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            RSoLog.c(this.f14815a + "-> " + str);
        }
    }

    static {
        com.taobao.android.remoteso.log.a aVar = new com.taobao.android.remoteso.log.a("RemoteSo");
        f14814a = aVar;
        b = aVar;
        c = LogLevel.DEBUG;
    }

    public static void a(LogLevel logLevel, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e4f294", new Object[]{logLevel, bVar});
            return;
        }
        b = bVar;
        c = logLevel;
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        try {
            b.a(str);
        } catch (Throwable th) {
            f14814a.a("sLog.error(msg);", th);
        }
    }

    public static void a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe179b03", new Object[]{str, th});
            return;
        }
        try {
            b.a(str, th);
        } catch (Throwable th2) {
            f14814a.a("sLog.error(msg, throwable);", th2);
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        try {
            if (!c.shouldLog(LogLevel.WARN)) {
                return;
            }
            b.b(str);
        } catch (Throwable th) {
            f14814a.a("sLog.warn(msg);", th);
        }
    }

    public static void b(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1040462", new Object[]{str, th});
            return;
        }
        try {
            if (!c.shouldLog(LogLevel.WARN)) {
                return;
            }
            b.b(str, th);
        } catch (Throwable th2) {
            f14814a.a("sLog.warn(msg, throwable);", th2);
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
            return;
        }
        try {
            if (!c.shouldLog(LogLevel.INFO)) {
                return;
            }
            b.c(str);
        } catch (Throwable th) {
            f14814a.a("sLog.info(msg);", th);
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
            return;
        }
        try {
            if (!c.shouldLog(LogLevel.DEBUG)) {
                return;
            }
            b.d(str);
        } catch (Throwable th) {
            f14814a.a("sLog.debug(msg);", th);
        }
    }

    public static a e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("893b28f7", new Object[]{str}) : new a(str);
    }
}
