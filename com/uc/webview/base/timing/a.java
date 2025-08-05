package com.uc.webview.base.timing;

import com.uc.webview.base.Log;
import com.uc.webview.base.g;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public final class a implements ITimingTracer {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f23808a = true;
    public static boolean b = false;
    private final ConcurrentHashMap<Integer, Object> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uc.webview.base.timing.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static class C1037a {

        /* renamed from: a  reason: collision with root package name */
        static final a f23809a = new a((byte) 0);
    }

    /* loaded from: classes9.dex */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        private static Method f23810a;
        private static Method b;

        static {
            if (!a.b || !a.b) {
                return;
            }
            try {
                Class<?> cls = Class.forName("android.os.Trace");
                f23810a = g.a(cls, "traceBegin", Long.TYPE, String.class);
                b = g.a(cls, "traceEnd", Long.TYPE);
            } catch (Throwable th) {
                Log.e("Timing", "initTraceMethod falied", th);
            }
        }

        public static void a() {
            if (!a.b) {
                return;
            }
            try {
                if (b == null) {
                    return;
                }
                b.invoke(null, 1L);
            } catch (Throwable unused) {
            }
        }

        public static void a(String str) {
            if (!a.b) {
                return;
            }
            try {
                if (f23810a == null) {
                    return;
                }
                f23810a.invoke(null, 1L, str);
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: classes9.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public C1038a f23811a;
        public C1038a b;

        /* renamed from: com.uc.webview.base.timing.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        public class C1038a {

            /* renamed from: a  reason: collision with root package name */
            public final long f23812a = System.currentTimeMillis();

            public C1038a() {
            }
        }

        public final synchronized c a() {
            if (this.f23811a == null) {
                this.f23811a = new C1038a();
            }
            return this;
        }

        public final synchronized c b() {
            if (this.b == null) {
                this.b = new C1038a();
            }
            return this;
        }
    }

    private a() {
        this.c = f23808a ? new ConcurrentHashMap<>() : null;
        if (f23808a) {
            mark(StartupTimingKeys.START);
        }
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public static Object a(int i) {
        if (f23808a) {
            return C1037a.f23809a.c.get(Integer.valueOf(i));
        }
        return null;
    }

    public static void a() {
        if (!b) {
            return;
        }
        b.a();
    }

    public static void a(int i, long j) {
        if (!f23808a) {
            return;
        }
        b().mark(i, String.valueOf(j));
    }

    public static void a(int i, String str) {
        if (!f23808a) {
            return;
        }
        b().mark(i, str);
    }

    public static void a(c cVar) {
        ConcurrentHashMap<Integer, Object> concurrentHashMap;
        if (!f23808a) {
            return;
        }
        a b2 = b();
        if (!f23808a || (concurrentHashMap = b2.c) == null || concurrentHashMap.containsKey(Integer.valueOf((int) StartupTimingKeys.FIRST_EXPORT_WEBVIEW))) {
            return;
        }
        b2.c.put(Integer.valueOf((int) StartupTimingKeys.FIRST_EXPORT_WEBVIEW), cVar);
    }

    public static void a(String str) {
        if (!b) {
            return;
        }
        b.a(str);
    }

    public static a b() {
        if (!f23808a) {
            return null;
        }
        return C1037a.f23809a;
    }

    public static boolean b(int i) {
        return a(i) != null;
    }

    public static void c(int i) {
        if (!f23808a) {
            return;
        }
        b().mark(i);
    }

    @Override // com.uc.webview.base.timing.ITimingTracer
    public final void mark(int i) {
        ConcurrentHashMap<Integer, Object> concurrentHashMap;
        if (f23808a && (concurrentHashMap = this.c) != null && !concurrentHashMap.containsKey(Integer.valueOf(i))) {
            this.c.put(Integer.valueOf(i), new c().a());
        }
    }

    @Override // com.uc.webview.base.timing.ITimingTracer
    public final void mark(int i, String str) {
        ConcurrentHashMap<Integer, Object> concurrentHashMap;
        if (f23808a && (concurrentHashMap = this.c) != null && str != null && !concurrentHashMap.containsKey(Integer.valueOf(i))) {
            this.c.put(Integer.valueOf(i), str);
        }
    }

    @Override // com.uc.webview.base.timing.ITimingTracer
    public final void markBegin(int i) {
        if (!f23808a) {
            return;
        }
        mark(i);
    }

    @Override // com.uc.webview.base.timing.ITimingTracer
    public final void markEnd(int i) {
        ConcurrentHashMap<Integer, Object> concurrentHashMap;
        c cVar;
        if (!f23808a || (concurrentHashMap = this.c) == null || (cVar = (c) concurrentHashMap.get(Integer.valueOf(i))) == null) {
            return;
        }
        cVar.b();
    }
}
