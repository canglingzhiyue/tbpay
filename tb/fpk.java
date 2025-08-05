package tb;

import android.support.v4.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* loaded from: classes5.dex */
public class fpk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final LruCache<String, Method> f28093a;

    static {
        kge.a(576974225);
        f28093a = new LruCache<>(8);
    }

    public static Object a(Object obj, String str, Object... objArr) {
        try {
            Method b = b(obj, str, objArr);
            if (b == null) {
                return null;
            }
            if (obj instanceof Class) {
                return b.invoke(null, objArr);
            }
            return b.invoke(obj, objArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Method b(Object obj, String str, Object... objArr) {
        Class<?> cls;
        Method[] declaredMethods;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("fbdf4ffc", new Object[]{obj, str, objArr});
        }
        if (obj instanceof Class) {
            cls = (Class) obj;
        } else {
            cls = obj.getClass();
        }
        String str2 = cls.getName() + "_" + str;
        Method method = f28093a.get(str2);
        if (method != null) {
            return method;
        }
        while (cls != null) {
            for (Method method2 : cls.getDeclaredMethods()) {
                if (str.equals(method2.getName()) && a(method2.getGenericParameterTypes(), objArr)) {
                    method2.setAccessible(true);
                    f28093a.put(str2, method2);
                    return method2;
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    private static boolean a(Type[] typeArr, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2bd7b19", new Object[]{typeArr, objArr})).booleanValue();
        }
        if (typeArr.length != objArr.length) {
            return false;
        }
        if (typeArr.length == 0) {
            return true;
        }
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            Type type = typeArr[i];
            Class cls = null;
            if (type instanceof Class) {
                cls = (Class) type;
            }
            if (cls == null) {
                return true;
            }
            obj.getClass();
        }
        return true;
    }
}
