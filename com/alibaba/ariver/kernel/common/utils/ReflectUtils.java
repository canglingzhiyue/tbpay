package com.alibaba.ariver.kernel.common.utils;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class ReflectUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Method> f2913a;

    static {
        kge.a(1232666375);
        f2913a = new ConcurrentHashMap();
    }

    public static Object getDefaultValue(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("887e7602", new Object[]{cls});
        }
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            return false;
        }
        if (cls == Void.TYPE) {
            return null;
        }
        return (cls.isPrimitive() || Number.class.isAssignableFrom(cls)) ? 0 : null;
    }

    public static Object invokeMethod(Object obj, String str) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("173065cc", new Object[]{obj, str}) : invokeMethod(obj.getClass(), obj, str, (Class[]) null, (Object[]) null);
    }

    public static Object invokeMethod(String str, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("3862f51e", new Object[]{str, str2}) : invokeMethod(Class.forName(str), (Object) null, str2, (Class[]) null, (Object[]) null);
    }

    public static Object invokeMethod(Class cls, String str) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("1b4d59cb", new Object[]{cls, str}) : invokeMethod(cls, (Object) null, str, (Class[]) null, (Object[]) null);
    }

    public static Object invokeMethod(Class cls, String str, Class[] clsArr, Object[] objArr) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5f384670", new Object[]{cls, str, clsArr, objArr}) : invokeMethod(cls, (Object) null, str, clsArr, objArr);
    }

    public static Object invokeMethod(String str, Object obj, String str2, Class[] clsArr, Object[] objArr) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a8184859", new Object[]{str, obj, str2, clsArr, objArr}) : invokeMethod(Class.forName(str), obj, str2, clsArr, objArr);
    }

    public static Object invokeStaticMethod(Class cls, String str, Class[] clsArr, Object[] objArr) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("153f7b22", new Object[]{cls, str, clsArr, objArr}) : invokeMethod(cls, (Object) null, str, clsArr, objArr);
    }

    public static Object invokeStaticMethod(String str, String str2, Class[] clsArr, Object[] objArr) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("d8bfb48b", new Object[]{str, str2, clsArr, objArr}) : invokeMethod(Class.forName(str), (Object) null, str2, clsArr, objArr);
    }

    public static Object invokeMethod(Class cls, Object obj, String str, Class[] clsArr, Object[] objArr) throws Exception {
        Method method = getMethod(cls, str, clsArr);
        if (objArr == null) {
            return method.invoke(obj, new Object[0]);
        }
        return method.invoke(obj, objArr);
    }

    public static Method getMethod(Class<?> cls, String str, Class... clsArr) throws NoSuchMethodException {
        Method declaredMethod;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("3e76b86d", new Object[]{cls, str, clsArr});
        }
        String concat = cls.getName().concat(".").concat(str);
        if (clsArr != null && clsArr.length > 0) {
            String concat2 = concat.concat(riy.BRACKET_START_STR);
            for (Class cls2 : clsArr) {
                concat2 = concat2.concat(cls2.getName()).concat(",");
            }
            concat = concat2.substring(0, concat2.length() - 1).concat(riy.BRACKET_END_STR);
        }
        Method method = null;
        try {
            if (f2913a.containsKey(concat)) {
                method = f2913a.get(concat);
            }
        } catch (Throwable unused) {
        }
        if (method != null) {
            return method;
        }
        if (clsArr == null) {
            declaredMethod = cls.getDeclaredMethod(str, new Class[0]);
        } else {
            declaredMethod = cls.getDeclaredMethod(str, clsArr);
        }
        Method method2 = declaredMethod;
        method2.setAccessible(true);
        f2913a.put(concat, method2);
        return method2;
    }

    public static Object getField(Object obj, String str, Object obj2) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class<?> cls;
        if (obj instanceof Class) {
            cls = (Class) obj;
        } else {
            cls = Class.forName(String.valueOf(obj));
        }
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj2);
    }

    public static Method findMethod(Class cls, String str, String[] strArr) {
        Method[] methods;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("48d231e5", new Object[]{cls, str, strArr});
        }
        for (Method method : cls.getMethods()) {
            if (method.getName().equals(str)) {
                if (method.getParameterTypes().length == (strArr != null ? strArr.length : 0) && a(method.getParameterTypes(), strArr)) {
                    return method;
                }
            }
        }
        return null;
    }

    private static boolean a(Class<?>[] clsArr, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f73f2773", new Object[]{clsArr, strArr})).booleanValue();
        }
        for (int i = 0; i < clsArr.length; i++) {
            if (!TextUtils.equals(clsArr[i].getName(), strArr != null ? strArr[i] : null)) {
                return false;
            }
        }
        return true;
    }

    public static Set<Class<? extends Extension>> collectExtensionPoint(Class<? extends Extension> cls, Set<Class<? extends Extension>> set) {
        Class<?>[] interfaces;
        IpChange ipChange = $ipChange;
        LinkedHashSet linkedHashSet = set;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("2dd8e633", new Object[]{cls, set});
        }
        if (set == null) {
            linkedHashSet = new LinkedHashSet();
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (Extension.class.isAssignableFrom(cls2)) {
                linkedHashSet.add(cls2);
            }
        }
        return Extension.class.isAssignableFrom(cls.getSuperclass()) ? collectExtensionPoint(cls.getSuperclass(), linkedHashSet) : linkedHashSet;
    }
}
