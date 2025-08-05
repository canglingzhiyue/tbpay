package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.android.spdy.spduLog;

/* loaded from: classes.dex */
public class sab {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static volatile long f33449a = 0;
    private static Context b = null;
    private static boolean c = false;
    private static volatile boolean d = false;
    private static final CopyOnWriteArraySet<Object> e = new CopyOnWriteArraySet<>();
    private static Application.ActivityLifecycleCallbacks f = new Application.ActivityLifecycleCallbacks() { // from class: tb.sab.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private volatile int f33450a = 0;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
                return;
            }
            this.f33450a++;
            if (!sab.a()) {
                return;
            }
            sab.c();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                return;
            }
            this.f33450a--;
            if (this.f33450a > 0 || sab.a()) {
                return;
            }
            this.f33450a = 0;
            sab.d();
        }
    };

    public static /* synthetic */ CopyOnWriteArraySet e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArraySet) ipChange.ipc$dispatch("8f15355d", new Object[0]) : e;
    }

    public static void a(Context context) {
        Application application;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (context == null) {
        } else {
            try {
                b = context;
                if (c || Build.VERSION.SDK_INT < 14) {
                    return;
                }
                if (b instanceof Application) {
                    application = (Application) b;
                } else {
                    application = (Application) b.getApplicationContext();
                }
                if (application == null) {
                    spduLog.Tloge("tnetsdk.AppLifeCycle", null, "AppLifecycle initialize fail", "context", context);
                    return;
                }
                application.registerActivityLifecycleCallbacks(f);
                c = true;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static boolean a() {
        if (c) {
            return b == null || d;
        }
        try {
            Class<?> cls = Class.forName("anet.channel.GlobalAppRuntimeInfo");
            return ((Boolean) cls.getMethod("isAppBackground", new Class[0]).invoke(cls, new Object[0])).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : a() && f33449a > 0 && System.currentTimeMillis() - f33449a > 60000;
    }

    public static long f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[0])).longValue() : f33449a;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else if (!a()) {
        } else {
            spduLog.Tloge("tnetsdk.AppLifeCycle", null, "[onForeground]", new Object[0]);
            d = false;
            a(true);
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else if (a()) {
        } else {
            spduLog.Tloge("tnetsdk.AppLifeCycle", null, "[onBackground]", new Object[0]);
            d = true;
            f33449a = System.currentTimeMillis();
            a(false);
        }
    }

    private static void a(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            sae.b(new Runnable() { // from class: tb.sab.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Iterator it = sab.e().iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            });
        }
    }
}
