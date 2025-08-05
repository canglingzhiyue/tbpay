package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes8.dex */
public class ohc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1833748229);
    }

    public static void a(String str, Object obj, Object obj2) {
        if (obj == null || str == null) {
            return;
        }
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(obj, obj2);
        } catch (Exception unused) {
            ogg.b("failed to setField " + str);
        }
    }

    public static void a(Class cls, String str, Object obj, Object obj2) {
        if (obj == null || str == null) {
            return;
        }
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(obj, obj2);
        } catch (Exception unused) {
            ogg.b("failed to setField " + str);
        }
    }

    public static Object a(String str, Object obj) {
        if (obj == null || str == null) {
            return null;
        }
        try {
            Field declaredField = obj.getClass().getSuperclass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Exception unused) {
            ogg.b("failed to getParentField " + str);
            return null;
        }
    }

    public static Object a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c254b136", new Object[]{str, str2});
        }
        try {
            return b(str, Class.forName(str2));
        } catch (ClassNotFoundException unused) {
            ogg.b("failed to getStaticField " + str);
            return null;
        }
    }

    public static Method a(String str, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("f01a1393", new Object[]{str, cls});
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Exception unused) {
            ogg.b("failed to getMethod " + str);
            return null;
        }
    }

    public static Method a(String str, Class cls, Class<?>... clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("752adc0b", new Object[]{str, cls, clsArr});
        }
        Method method = null;
        try {
            method = cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
        }
        if (method != null) {
            return method;
        }
        try {
            method = cls.getDeclaredMethod(str, clsArr);
            method.setAccessible(true);
            return method;
        } catch (Exception unused2) {
            ogg.b("failed to getMethod " + str);
            return method;
        }
    }

    public static Object b(String str, Class cls) {
        try {
            Field field = cls.getField(str);
            field.setAccessible(true);
            return field.get(null);
        } catch (Exception unused) {
            ogg.b("failed to getStaticField " + str);
            return null;
        }
    }

    public static Object c(String str, Class cls) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            ogg.b("failed to getStaticField " + str);
            return null;
        }
    }
}
