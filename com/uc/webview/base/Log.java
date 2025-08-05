package com.uc.webview.base;

import com.uc.webview.base.klog.KLogHandler;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes9.dex */
public final class Log {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f23766a;
    private static volatile a b = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private LinkedList<com.uc.webview.base.klog.a> f23767a = new LinkedList<>();

        private void b() {
            while (this.f23767a.size() > 460) {
                this.f23767a.pop();
            }
        }

        public final LinkedList<com.uc.webview.base.klog.a> a() {
            LinkedList<com.uc.webview.base.klog.a> linkedList;
            synchronized (this) {
                linkedList = this.f23767a;
                this.f23767a = null;
            }
            return linkedList;
        }

        public final void a(com.uc.webview.base.klog.a aVar) {
            synchronized (this) {
                if (this.f23767a == null) {
                    return;
                }
                if (this.f23767a.size() > 512) {
                    b();
                }
                this.f23767a.add(aVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private static final Method[] f23768a = new Method[4];

        static {
            try {
                Class<?> cls = Class.forName("android.util.Log");
                Class[] clsArr = {String.class, String.class, Throwable.class};
                a(0, cls, clsArr);
                a(1, cls, clsArr);
                a(2, cls, clsArr);
                a(3, cls, clsArr);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        public static void a(int i, com.uc.webview.base.klog.a aVar) {
            try {
                f23768a[i].invoke(null, aVar.g, aVar.h, aVar.i);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        private static void a(int i, Class cls, Class[] clsArr) {
            String str = com.uc.webview.base.klog.a.b[i];
            try {
                try {
                    f23768a[i] = cls.getDeclaredMethod(str, clsArr);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } catch (Throwable unused) {
                f23768a[i] = cls.getMethod(str, clsArr);
            }
        }

        public static void a(String str, String str2, Throwable th) {
            try {
                f23768a[3].invoke(null, "ucbs.".concat(String.valueOf(str)), "[InfoLevelMessage] ".concat(String.valueOf(str2)), th);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public static String a(long j) {
        return com.uc.webview.base.klog.a.a(j);
    }

    public static String a(String str) {
        if (str == null || str.length() <= 6) {
            return str;
        }
        return str.substring(0, 6) + "...";
    }

    public static String a(Throwable th) {
        return com.uc.webview.base.klog.a.a(th);
    }

    private static void a(int i, String str, String str2, Throwable th) {
        com.uc.webview.base.klog.a aVar = new com.uc.webview.base.klog.a(i, "ucbs.".concat(String.valueOf(str)), str2, th);
        if (b != null) {
            b.a(aVar);
        }
        if (f23766a != null) {
            b.a(i, aVar);
        }
        KLogHandler.a(aVar);
    }

    public static void a(StringBuilder sb) {
        synchronized (Log.class) {
            if (b == null) {
                return;
            }
            LinkedList<com.uc.webview.base.klog.a> a2 = b.a();
            if (a2 != null) {
                Iterator<com.uc.webview.base.klog.a> it = a2.iterator();
                while (it.hasNext()) {
                    sb.append(it.next().toString());
                    sb.append("\n");
                }
            }
            b = null;
        }
    }

    public static void a(boolean z) {
        if (z && f23766a == null) {
            f23766a = new b();
        } else if (z || f23766a == null) {
        } else {
            f23766a = null;
        }
    }

    public static boolean a() {
        return KLogHandler.a();
    }

    public static void b() {
    }

    public static void d(String str, String str2) {
        d(str, str2, null);
    }

    public static void d(String str, String str2, Throwable th) {
        a(0, str, str2, th);
    }

    public static void e(String str, String str2) {
        e(str, str2, null);
    }

    public static void e(String str, String str2, Throwable th) {
        a(3, str, str2, th);
    }

    public static void i(String str, String str2) {
        i(str, str2, null);
    }

    public static void i(String str, String str2, Throwable th) {
        a(1, str, str2, th);
    }

    public static void rInfo(String str, String str2) {
        rInfo(str, str2, null);
    }

    public static void rInfo(String str, String str2, Throwable th) {
        a(1, str, str2, th);
        b.a(str, str2, th);
    }

    public static void w(String str, String str2) {
        w(str, str2, null);
    }

    public static void w(String str, String str2, Throwable th) {
        a(2, str, str2, th);
    }
}
