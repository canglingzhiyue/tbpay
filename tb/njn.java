package tb;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class njn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static njt b;
    private static njm c;

    /* renamed from: a  reason: collision with root package name */
    private static LruCache<String, njm> f31502a = new LruCache<>(5);
    private static final njm d = new njp();

    public static synchronized njm a(String str) {
        synchronized (njn.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (njm) ipChange.ipc$dispatch("7c72ea03", new Object[]{str});
            } else if (b(str)) {
                return d;
            } else {
                njm njmVar = f31502a.get(str);
                if (njmVar == null) {
                    njmVar = new njq(str, a());
                    f31502a.put(str, njmVar);
                } else if (c != null && c != njmVar) {
                    c.a();
                }
                c = njmVar;
                return njmVar;
            }
        }
    }

    public static njm a(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (njm) ipChange.ipc$dispatch("2d8c77b", new Object[]{activity}) : a(d(activity));
    }

    public static void b(Activity activity) {
        njm njmVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{activity});
        } else if (activity == null || (njmVar = f31502a.get(activity.getClass().getName())) == null) {
        } else {
            njmVar.a();
        }
    }

    public static void a(Fragment fragment) {
        njm njmVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f0514a", new Object[]{fragment});
        } else if (fragment == null || (njmVar = f31502a.get(fragment.getClass().getName())) == null) {
        } else {
            njmVar.a();
        }
    }

    public static void c(Activity activity) {
        njm njmVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792c473c", new Object[]{activity});
        } else if (activity == null || (njmVar = f31502a.get(activity.getClass().getName())) == null) {
        } else {
            njmVar.b();
        }
    }

    public static void b(Fragment fragment) {
        njm njmVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6442ede9", new Object[]{fragment});
        } else if (fragment == null || (njmVar = f31502a.get(fragment.getClass().getName())) == null) {
        } else {
            njmVar.b();
        }
    }

    private static njt a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njt) ipChange.ipc$dispatch("f0841e6", new Object[0]);
        }
        if (b == null) {
            try {
                Class.forName("com.taobao.orange.OrangeConfigLocal");
                b = new nju();
            } catch (ClassNotFoundException | Exception unused) {
            }
        }
        return b;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        njt a2 = a();
        if (!(a2 instanceof nju)) {
            return false;
        }
        return ((nju) a2).b(str);
    }

    private static String d(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1861f643", new Object[]{activity});
        }
        if (activity != null) {
            return activity.getClass().getName();
        }
        return null;
    }
}
