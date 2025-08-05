package tb;

import android.app.Activity;
import android.app.ActivityOptions;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public class sfc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Class<?> f33517a;

    static {
        kge.a(-1261460137);
        f33517a = null;
    }

    private static Method a(Class<?>[] clsArr) throws NoSuchMethodException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("e7b0b4ce", new Object[]{clsArr});
        }
        if (f33517a == null) {
            for (Class<?> cls : clsArr) {
                if (cls.getSimpleName().contains("TranslucentConversionListener")) {
                    f33517a = cls;
                }
            }
        }
        return Activity.class.getDeclaredMethod("convertToTranslucent", f33517a, ActivityOptions.class);
    }

    public static boolean a(Activity activity) {
        try {
            Method a2 = a(Activity.class.getDeclaredClasses());
            a2.setAccessible(true);
            a2.invoke(activity, null, null);
            return true;
        } catch (Throwable th) {
            TLog.loge("AnimationUtils", "convertActivityToTranslucent", th.getMessage());
            return false;
        }
    }

    public static boolean b(Activity activity) {
        try {
            Method declaredMethod = Activity.class.getDeclaredMethod("convertFromTranslucent", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(activity, new Object[0]);
            return true;
        } catch (Throwable th) {
            TLog.loge("AnimationUtils", "convertActivityFromTranslucent", th.getMessage());
            return false;
        }
    }
}
