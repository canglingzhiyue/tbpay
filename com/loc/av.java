package com.loc;

import android.content.Context;
import android.os.Looper;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class av extends as implements Thread.UncaughtExceptionHandler {
    private static ExecutorService e;
    private static WeakReference<Context> g;
    private Context d;
    private static Set<Integer> f = Collections.synchronizedSet(new HashSet());
    private static final ThreadFactory h = new ThreadFactory() { // from class: com.loc.av.2

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f7669a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "pama#" + this.f7669a.getAndIncrement()) { // from class: com.loc.av.2.1
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    try {
                        super.run();
                    } catch (Throwable unused) {
                    }
                }
            };
        }
    };

    private av(Context context) {
        this.d = context;
        try {
            this.b = Thread.getDefaultUncaughtExceptionHandler();
            if (this.b == null) {
                Thread.setDefaultUncaughtExceptionHandler(this);
                this.c = true;
                return;
            }
            String obj = this.b.toString();
            if (!obj.startsWith("com.amap.apis.utils.core.dynamiccore") && (obj.indexOf("com.amap.api") != -1 || obj.indexOf("com.loc") != -1)) {
                this.c = false;
                return;
            }
            Thread.setDefaultUncaughtExceptionHandler(this);
            this.c = true;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static synchronized av a(Context context, w wVar) throws k {
        synchronized (av.class) {
            try {
                if (wVar == null) {
                    throw new k("sdk info is null");
                }
                if (wVar.a() == null || "".equals(wVar.a())) {
                    throw new k("sdk name is invalid");
                }
                if (!f.add(Integer.valueOf(wVar.hashCode()))) {
                    return (av) as.f7664a;
                }
                if (as.f7664a == null) {
                    as.f7664a = new av(context);
                } else {
                    as.f7664a.c = false;
                }
                as.f7664a.a(wVar, as.f7664a.c);
                return (av) as.f7664a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(w wVar, String str, k kVar) {
        if (kVar != null) {
            a(wVar, str, kVar.c(), kVar.d(), kVar.e(), kVar.b());
        }
    }

    public static void a(w wVar, String str, String str2, String str3, String str4) {
        a(wVar, str, str2, str3, "", str4);
    }

    public static void a(w wVar, String str, String str2, String str3, String str4, String str5) {
        try {
            if (as.f7664a == null) {
                return;
            }
            as.f7664a.a(wVar, "path:" + str + ",type:" + str2 + ",gsid:" + str3 + ",csid:" + str4 + ",code:" + str5, "networkError");
        } catch (Throwable unused) {
        }
    }

    public static synchronized void b() {
        synchronized (av.class) {
            try {
                if (e != null) {
                    e.shutdown();
                }
                bl.a();
                if (as.f7664a != null && Thread.getDefaultUncaughtExceptionHandler() == as.f7664a && as.f7664a.b != null) {
                    Thread.setDefaultUncaughtExceptionHandler(as.f7664a.b);
                }
                as.f7664a = null;
            }
        }
    }

    public static void b(w wVar, String str, String str2) {
        try {
            if (as.f7664a == null) {
                return;
            }
            as.f7664a.a(wVar, str, str2);
        } catch (Throwable unused) {
        }
    }

    public static void b(Throwable th, String str, String str2) {
        try {
            if (as.f7664a == null) {
                return;
            }
            as.f7664a.a(th, 1, str, str2);
        } catch (Throwable unused) {
        }
    }

    public static void c() {
        WeakReference<Context> weakReference = g;
        if (weakReference != null && weakReference.get() != null) {
            at.a(g.get());
        } else if (as.f7664a == null) {
        } else {
            as.f7664a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.loc.as
    public final void a() {
        at.a(this.d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.loc.as
    public final void a(w wVar, String str, String str2) {
        aw.a(wVar, this.d, str2, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.loc.as
    public final void a(final w wVar, final boolean z) {
        try {
            cr.a().b(new cs() { // from class: com.loc.av.1
                @Override // com.loc.cs
                public final void a() {
                    try {
                        synchronized (Looper.getMainLooper()) {
                            at.a(wVar);
                        }
                        if (!z) {
                            return;
                        }
                        aw.a(av.this.d);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.loc.as
    public final void a(Throwable th, int i, String str, String str2) {
        aw.a(this.d, th, i, str, str2);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (th == null) {
            return;
        }
        a(th, 0, null, null);
        if (this.b == null) {
            return;
        }
        try {
            Thread.setDefaultUncaughtExceptionHandler(this.b);
        } catch (Throwable unused) {
        }
        this.b.uncaughtException(thread, th);
    }
}
