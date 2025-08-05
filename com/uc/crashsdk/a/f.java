package com.uc.crashsdk.a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* loaded from: classes.dex */
public class f {
    private static volatile HandlerThread b;
    private static volatile HandlerThread c;
    private static volatile HandlerThread d;
    private static Handler e;
    private static Handler f;
    private static Handler g;
    private static Handler h;

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f23748a = !f.class.desiredAssertionStatus();
    private static final HashMap<Object, Object[]> i = new HashMap<>();

    public static Handler a(int i2) {
        if (i2 == 0) {
            if (b == null) {
                a();
            }
            return e;
        } else if (i2 == 1) {
            if (c == null) {
                b();
            }
            return f;
        } else if (i2 == 2) {
            if (g == null) {
                g = new Handler(Looper.getMainLooper());
            }
            return g;
        } else if (i2 == 3) {
            if (h == null) {
                c();
            }
            return h;
        } else {
            throw new RuntimeException("unknown thread type: " + i2);
        }
    }

    private static synchronized void a() {
        synchronized (f.class) {
            if (b == null) {
                HandlerThread handlerThread = new HandlerThread("CrashSDKBkgdHandler", 10);
                b = handlerThread;
                handlerThread.start();
                e = new Handler(b.getLooper());
            }
        }
    }

    public static void a(int i2, Object[] objArr) {
        if (i2 != 10) {
            if (!f23748a) {
                throw new AssertionError();
            }
        } else if (!f23748a && objArr == null) {
            throw new AssertionError();
        } else {
            Runnable runnable = (Runnable) objArr[0];
            synchronized (i) {
                if (i.get(runnable) != null) {
                    i.remove(runnable);
                }
            }
            runnable.run();
        }
    }

    public static void a(Runnable runnable) {
        Object[] objArr;
        if (runnable == null) {
            return;
        }
        synchronized (i) {
            objArr = i.get(runnable);
        }
        if (objArr == null) {
            return;
        }
        int intValue = ((Integer) objArr[1]).intValue();
        Handler handler = null;
        if (intValue == 0) {
            handler = e;
        } else if (intValue == 1) {
            handler = f;
        } else if (intValue == 2) {
            handler = g;
        }
        if (handler != null) {
            handler.removeCallbacks((Runnable) objArr[0]);
        }
        synchronized (i) {
            if (i.get(runnable) != null) {
                i.remove(runnable);
            }
        }
    }

    public static boolean a(int i2, Runnable runnable) {
        return a(i2, runnable, 0L);
    }

    public static boolean a(int i2, Runnable runnable, long j) {
        Handler a2;
        if (runnable == null || (a2 = a(i2)) == null) {
            return false;
        }
        e eVar = new e(10, new Object[]{runnable});
        synchronized (i) {
            i.put(runnable, new Object[]{eVar, Integer.valueOf(i2)});
        }
        return a2.postDelayed(eVar, j);
    }

    private static synchronized void b() {
        synchronized (f.class) {
            if (c == null) {
                HandlerThread handlerThread = new HandlerThread("CrashSDKNormalHandler", 0);
                c = handlerThread;
                handlerThread.start();
                f = new Handler(c.getLooper());
            }
        }
    }

    public static boolean b(Runnable runnable) {
        Object[] objArr;
        if (runnable == null) {
            return false;
        }
        synchronized (i) {
            objArr = i.get(runnable);
        }
        return objArr != null;
    }

    private static synchronized void c() {
        synchronized (f.class) {
            if (d == null) {
                HandlerThread handlerThread = new HandlerThread("CrashSDKAnrHandler", 0);
                d = handlerThread;
                handlerThread.start();
                h = new Handler(d.getLooper());
            }
        }
    }
}
