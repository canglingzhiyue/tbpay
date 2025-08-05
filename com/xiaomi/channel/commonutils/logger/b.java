package com.xiaomi.channel.commonutils.logger;

import android.content.Context;
import android.os.Process;
import com.xiaomi.push.j;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import tb.riy;

/* loaded from: classes9.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static int f24276a = 2;

    /* renamed from: a  reason: collision with other field name */
    private static Context f2a = null;

    /* renamed from: a  reason: collision with other field name */
    private static boolean f8a = false;

    /* renamed from: b  reason: collision with other field name */
    private static boolean f9b = false;

    /* renamed from: a  reason: collision with other field name */
    private static String f5a = "XMPush-" + Process.myPid();

    /* renamed from: a  reason: collision with other field name */
    private static LoggerInterface f3a = new a();

    /* renamed from: a  reason: collision with other field name */
    private static final HashMap<Integer, Long> f6a = new HashMap<>();
    private static final HashMap<Integer, String> b = new HashMap<>();

    /* renamed from: a  reason: collision with other field name */
    private static final Integer f4a = -1;

    /* renamed from: a  reason: collision with other field name */
    private static AtomicInteger f7a = new AtomicInteger(1);

    /* loaded from: classes9.dex */
    static class a implements LoggerInterface {

        /* renamed from: a  reason: collision with root package name */
        private String f24277a = b.f5a;

        a() {
        }

        @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
        public void log(String str) {
        }

        @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
        public void log(String str, Throwable th) {
        }

        @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
        public void setTag(String str) {
            this.f24277a = str;
        }
    }

    public static int a() {
        return f24276a;
    }

    public static Integer a(String str) {
        if (f24276a <= 1) {
            Integer valueOf = Integer.valueOf(f7a.incrementAndGet());
            f6a.put(valueOf, Long.valueOf(System.currentTimeMillis()));
            b.put(valueOf, str);
            LoggerInterface loggerInterface = f3a;
            loggerInterface.log(str + " starts");
            return valueOf;
        }
        return f4a;
    }

    /* renamed from: a  reason: collision with other method in class */
    private static String m1615a(String str) {
        return b() + str;
    }

    public static String a(String str, String str2) {
        return riy.ARRAY_START_STR + str + "] " + str2;
    }

    private static String a(String str, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[Tid:");
        sb.append(Thread.currentThread().getId());
        sb.append("] ");
        sb.append(riy.ARRAY_START_STR);
        sb.append(str);
        sb.append("] ");
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                sb.append(obj);
            }
        }
        return sb.toString();
    }

    private static String a(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[Tid:");
        sb.append(Thread.currentThread().getId());
        sb.append("] ");
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                sb.append(obj);
            }
        }
        return sb.toString();
    }

    public static void a(int i) {
        if (i < 0 || i > 5) {
            a(2, "set log level as " + i);
        }
        f24276a = i;
    }

    public static void a(int i, String str) {
        if (i >= f24276a) {
            f3a.log(str);
        } else if (!m1620a()) {
        } else {
            String str2 = "-->log(" + i + "): " + str;
        }
    }

    public static void a(int i, String str, Throwable th) {
        if (i >= f24276a) {
            f3a.log(str, th);
        } else if (!m1620a()) {
        } else {
            String str2 = "-->log(" + i + "): " + str;
        }
    }

    public static void a(int i, Throwable th) {
        if (i >= f24276a) {
            f3a.log("", th);
        } else if (!m1620a()) {
        } else {
            String str = "-->log(" + i + "): ";
        }
    }

    public static void a(Context context) {
        f2a = context;
        if (j.m2118a(context)) {
            f8a = true;
        }
        if (j.m2117a()) {
            f9b = true;
        }
    }

    public static void a(LoggerInterface loggerInterface) {
        f3a = loggerInterface;
    }

    public static void a(Integer num) {
        if (f24276a > 1 || !f6a.containsKey(num)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - f6a.remove(num).longValue();
        LoggerInterface loggerInterface = f3a;
        loggerInterface.log(b.remove(num) + " ends in " + currentTimeMillis + " ms");
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m1616a(String str) {
        if (m1621a(2)) {
            a(2, m1615a(str));
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m1617a(String str, String str2) {
        if (m1621a(2)) {
            a(2, b(str, str2));
        }
    }

    public static void a(String str, Throwable th) {
        if (m1621a(4)) {
            a(4, m1615a(str), th);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m1618a(String str, Object... objArr) {
        if (m1621a(2)) {
            a(2, a(str, objArr));
        }
    }

    public static void a(Throwable th) {
        if (m1621a(4)) {
            a(4, th);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m1619a(Object... objArr) {
        if (m1621a(4)) {
            a(4, a(objArr));
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    private static boolean m1620a() {
        return false;
    }

    /* renamed from: a  reason: collision with other method in class */
    private static boolean m1621a(int i) {
        return i >= f24276a || m1620a();
    }

    private static String b() {
        return "[Tid:" + Thread.currentThread().getId() + "] ";
    }

    private static String b(String str, String str2) {
        return b() + a(str, str2);
    }

    public static void b(String str) {
        if (m1621a(0)) {
            a(0, m1615a(str));
        }
    }

    /* renamed from: b  reason: collision with other method in class */
    public static void m1622b(String str, String str2) {
        if (m1621a(1)) {
            a(1, b(str, str2));
        }
    }

    public static void b(String str, Object... objArr) {
        if (m1621a(1)) {
            a(1, a(str, objArr));
        }
    }

    public static void c(String str) {
        if (m1621a(0)) {
            a(1, m1615a(str));
        }
    }

    public static void c(String str, String str2) {
        if (f8a) {
            m1617a(str, str2);
            return;
        }
        b(str, str2);
        if (f9b) {
            return;
        }
        m1617a(str, str2);
    }

    public static void d(String str) {
        if (m1621a(4)) {
            a(4, m1615a(str));
        }
    }

    public static void e(String str) {
        if (f8a) {
            m1616a(str);
            return;
        }
        m1615a(str);
        if (f9b) {
            return;
        }
        m1616a(str);
    }
}
