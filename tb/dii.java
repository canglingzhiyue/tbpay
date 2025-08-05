package tb;

import android.app.Application;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class dii {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Application f26785a;

    public static synchronized Application a() {
        synchronized (dii.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Application) ipChange.ipc$dispatch("f921f837", new Object[0]);
            }
            if (f26785a == null) {
                f26785a = b();
            }
            if (f26785a == null) {
                try {
                    f26785a = Globals.getApplication();
                } catch (Throwable unused) {
                }
            }
            return f26785a;
        }
    }

    private static Application b() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            return (Application) declaredField.get(declaredMethod.invoke(null, new Object[0]));
        } catch (Exception unused) {
            return null;
        }
    }
}
