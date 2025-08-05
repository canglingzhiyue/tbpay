package tb;

import android.app.ActivityThread;
import android.app.Application;
import android.content.Context;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.weex_framework.util.a;
import com.taobao.atools.StaticHook;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.mto;

/* loaded from: classes6.dex */
public class kaq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile Context f29920a;
    private static final AtomicBoolean b;

    static {
        kge.a(-1908067920);
        b = new AtomicBoolean();
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (context == null || f29920a != null) {
        } else {
            if (!(context instanceof Application)) {
                context = context.getApplicationContext();
            }
            if (context != null && f29920a == null) {
                f29920a = context;
            }
            b();
        }
    }

    public static Context a() {
        if (f29920a != null) {
            return f29920a;
        }
        synchronized (kaq.class) {
            try {
                f29920a = ActivityThread.currentApplication();
                if (f29920a == null) {
                    try {
                        ActivityThread currentActivityThread = ActivityThread.currentActivityThread();
                        if (currentActivityThread != null) {
                            f29920a = currentActivityThread.getApplication();
                        }
                    } catch (Exception e) {
                        kau.instance.b("AppContext", "currentActivityThread err", e, new Object[0]);
                    }
                }
                if (f29920a == null) {
                    try {
                        f29920a = (Application) StaticHook.a(ActivityThread.class, "getApplication", new Class[0]).invoke(StaticHook.a(ActivityThread.class, ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(ActivityThread.class, new Object[0]), new Object[0]);
                    } catch (Exception e2) {
                        kau.instance.b("AppContext", "reflect err", e2, new Object[0]);
                    }
                }
                if (f29920a == null) {
                    a(LauncherRuntime.g);
                }
            }
        }
        if (f29920a == null) {
            kau.instance.d("AppContext", "mContext is null", a.ATOM_stack, kap.a(Thread.currentThread().getStackTrace()));
            kat.a("atools", "full_verify", "context", mto.a.GEO_NOT_SUPPORT);
        }
        return f29920a;
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (b.getAndSet(true)) {
        } else {
            xkg.a(a());
        }
    }
}
