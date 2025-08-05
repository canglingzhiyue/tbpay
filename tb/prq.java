package tb;

import android.app.Application;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.aks;

/* loaded from: classes8.dex */
public class prq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HIGH_DEVICE = 1;
    public static final int LOW_DEVICE = 3;
    public static final int MIDDLE_DEVICE = 2;
    public static final int UNKNOWN_DEVICE = 0;

    /* renamed from: a  reason: collision with root package name */
    private static aks.d f32834a;
    private static Application b;

    static {
        kge.a(-1823880809);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        if (f32834a == null) {
            f32834a = aks.a().g();
        }
        aks.d dVar = f32834a;
        if (dVar == null) {
            return -1;
        }
        return dVar.f25407a;
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        if (f32834a == null) {
            f32834a = aks.a().g();
        }
        aks.d dVar = f32834a;
        if (dVar == null || -1 == dVar.f25407a) {
            return 0;
        }
        if (f32834a.f25407a == 0) {
            return 1;
        }
        if (1 == f32834a.f25407a) {
            return 2;
        }
        return 2 == f32834a.f25407a ? 3 : 0;
    }

    public static synchronized Application c() {
        synchronized (prq.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Application) ipChange.ipc$dispatch("4bc1c139", new Object[0]);
            }
            if (b == null) {
                b = d();
            }
            return b;
        }
    }

    private static Application d() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            return (Application) declaredField.get(declaredMethod.invoke(null, new Object[0]));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
