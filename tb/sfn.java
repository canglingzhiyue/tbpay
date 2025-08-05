package tb;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import tb.slx;

/* loaded from: classes7.dex */
public class sfn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void a(slx.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db8431c", new Object[]{this, aVar});
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            d(aVar);
        } else if (i >= 26) {
            c(aVar);
        } else {
            b(aVar);
        }
    }

    private void b(slx.a aVar) {
        try {
            Field declaredField = Class.forName("android.app.ActivityManagerNative").getDeclaredField("gDefault");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Field declaredField2 = Class.forName("android.util.Singleton").getDeclaredField("mInstance");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            Class<?> cls = Class.forName("android.app.IActivityManager");
            declaredField2.set(obj, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls}, new slx(obj2, aVar)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void c(slx.a aVar) {
        try {
            Field declaredField = Class.forName("android.app.ActivityManager").getDeclaredField("IActivityManagerSingleton");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Field declaredField2 = Class.forName("android.util.Singleton").getDeclaredField("mInstance");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            Class<?> cls = Class.forName("android.app.IActivityManager");
            declaredField2.set(obj, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls}, new slx(obj2, aVar)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void d(slx.a aVar) {
        try {
            Field declaredField = Class.forName("android.app.ActivityTaskManager").getDeclaredField("IActivityTaskManagerSingleton");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Field declaredField2 = Class.forName("android.util.Singleton").getDeclaredField("mInstance");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (obj2 == null) {
                return;
            }
            Class<?> cls = Class.forName("android.app.IActivityTaskManager");
            declaredField2.set(obj, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls}, new slx(obj2, aVar)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
