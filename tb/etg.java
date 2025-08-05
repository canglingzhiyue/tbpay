package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.industry.tool.a;
import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class etg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Activity, eti> f27559a;
    private static final Map<Activity, ConcurrentHashMap<String, etf>> b;

    static {
        kge.a(-20012033);
        f27559a = new ConcurrentHashMap();
        b = new ConcurrentHashMap();
        emu.a("com.taobao.android.detail.industry.adapter.component.DIComponentLifecycleCenter");
    }

    public static etf a(Context context, String str) {
        ConcurrentHashMap<String, etf> concurrentHashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (etf) ipChange.ipc$dispatch("837a6665", new Object[]{context, str});
        }
        if (!(context instanceof Activity) || (concurrentHashMap = b.get(context)) == null) {
            return null;
        }
        return concurrentHashMap.get(str);
    }

    public static Enumeration<etf> a(Context context) {
        ConcurrentHashMap<String, etf> concurrentHashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Enumeration) ipChange.ipc$dispatch("15d2f10a", new Object[]{context});
        }
        if (!(context instanceof Activity) || (concurrentHashMap = b.get(context)) == null) {
            return null;
        }
        return concurrentHashMap.elements();
    }

    public static void a(etf etfVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f1d3d6b", new Object[]{etfVar, str});
            return;
        }
        Context e = etfVar.b.e();
        if (!(e instanceof Activity)) {
            return;
        }
        ConcurrentHashMap<String, etf> concurrentHashMap = b.get(e);
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        }
        concurrentHashMap.put(str, etfVar);
        b.put((Activity) e, concurrentHashMap);
        a.a("DIComponentLifecycleCenter", "registViewLifecycleHolder|activiy:" + e.hashCode() + "|" + concurrentHashMap.size());
        h(e);
    }

    private static void h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2d615b9", new Object[]{context});
        } else if (!(context instanceof Activity) || f27559a.get(context) != null) {
        } else {
            Activity activity = (Activity) context;
            f27559a.put(activity, new eti());
            activity.getApplication().registerActivityLifecycleCallbacks(new eti());
            a.a("DIComponentLifecycleCenter", "registerActivityLifecycleCallbacks|activiy:" + context.hashCode());
        }
    }

    private static void i(Context context) {
        eti remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a382c158", new Object[]{context});
        } else if (!(context instanceof Activity) || (remove = f27559a.remove(context)) == null) {
        } else {
            ((Activity) context).getApplication().unregisterActivityLifecycleCallbacks(remove);
            a.a("DIComponentLifecycleCenter", "unregisterActivityLifecycleCallbacks|activiy:" + context.hashCode());
        }
    }

    public static void b(Context context) {
        ConcurrentHashMap<String, etf> concurrentHashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
        } else if (!(context instanceof Activity) || (concurrentHashMap = b.get(context)) == null) {
        } else {
            a.a("DIComponentLifecycleCenter", "clearViewLifecycleHolder|activiy:" + context.hashCode() + "|" + concurrentHashMap.size());
            concurrentHashMap.clear();
            b.remove(context);
        }
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
        } else {
            i(context);
        }
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{context});
            return;
        }
        Enumeration<etf> a2 = a(context);
        if (a2 == null) {
            return;
        }
        while (a2.hasMoreElements()) {
            try {
                arc.a().a("DIComponentLifecycleCenter", "通知LifecycleHolder STARTED: ", "");
                a2.nextElement().i();
            } catch (Throwable th) {
                ard a3 = arc.a();
                a3.a("DIComponentLifecycleCenter", "dispatchPageStart 生命周期异常：", "exception: " + th.getMessage());
                return;
            }
        }
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d012dc", new Object[]{context});
            return;
        }
        Enumeration<etf> a2 = a(context);
        if (a2 == null) {
            return;
        }
        while (a2.hasMoreElements()) {
            try {
                arc.a().a("DIComponentLifecycleCenter", "通知LifecycleHolder RESUMED: ", "");
                a2.nextElement().j();
            } catch (Throwable th) {
                ard a3 = arc.a();
                a3.a("DIComponentLifecycleCenter", "dispatchPageResume 生命周期异常：", "exception: " + th.getMessage());
                return;
            }
        }
    }

    public static void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17cbe7b", new Object[]{context});
            return;
        }
        Enumeration<etf> a2 = a(context);
        if (a2 == null) {
            return;
        }
        while (a2.hasMoreElements()) {
            try {
                arc.a().a("DIComponentLifecycleCenter", "通知LifecycleHolder PAUSED: ", "");
                a2.nextElement().k();
            } catch (Throwable th) {
                ard a3 = arc.a();
                a3.a("DIComponentLifecycleCenter", "dispatchPagePause 生命周期异常：", "exception: " + th.getMessage());
                return;
            }
        }
    }

    public static void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2296a1a", new Object[]{context});
            return;
        }
        Enumeration<etf> a2 = a(context);
        if (a2 == null) {
            return;
        }
        while (a2.hasMoreElements()) {
            try {
                arc.a().a("DIComponentLifecycleCenter", "通知LifecycleHolder STOPPED: ", "");
                a2.nextElement().l();
            } catch (Throwable th) {
                ard a3 = arc.a();
                a3.a("DIComponentLifecycleCenter", "dispatchPageStop 生命周期异常：", "exception: " + th.getMessage());
                return;
            }
        }
    }

    public static boolean b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b80d80d", new Object[]{context, str})).booleanValue();
        }
        etf a2 = a(context, str);
        if (a2 == null) {
            return false;
        }
        a2.g();
        return true;
    }

    public static boolean c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d54b79ec", new Object[]{context, str})).booleanValue();
        }
        etf a2 = a(context, str);
        if (a2 == null) {
            return false;
        }
        a2.h();
        return true;
    }
}
