package tb;

import android.app.Application;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Deprecated
/* loaded from: classes2.dex */
public class acg {

    /* renamed from: a  reason: collision with root package name */
    private static Application f25234a;

    static {
        kge.a(36243606);
    }

    public static synchronized Application a() {
        Application application;
        synchronized (acg.class) {
            if (f25234a == null) {
                f25234a = b();
            }
            application = f25234a;
        }
        return application;
    }

    private static Application b() {
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
