package com.uc.webview.base;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static volatile ClassLoader f23781a = g.class.getClassLoader();

    public static Object a(Class<?> cls, String str, Class[] clsArr, Object[] objArr) throws Exception {
        return a(null, cls, str, clsArr, objArr);
    }

    public static Object a(ClassLoader classLoader, String str, String str2) throws Exception {
        return Class.forName(str, true, classLoader).getField(str2).get(null);
    }

    public static Object a(Object obj, Class<?> cls, String str, Class[] clsArr, Object[] objArr) throws Exception {
        Method method;
        try {
            method = cls.getDeclaredMethod(str, clsArr);
        } catch (Throwable unused) {
            method = cls.getMethod(str, clsArr);
        }
        return a(obj, method, objArr);
    }

    public static Object a(Object obj, String str) {
        try {
            return b(obj, str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Object a(Object obj, String str, Class[] clsArr, Object[] objArr) {
        try {
            return b(obj, str, clsArr, objArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Object a(Object obj, Method method, Object[] objArr) throws Exception {
        method.setAccessible(true);
        try {
            return method.invoke(obj, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof Exception) {
                throw ((Exception) targetException);
            }
            if (!(targetException instanceof Error)) {
                throw new RuntimeException(targetException);
            }
            throw ((Error) targetException);
        }
    }

    public static Object a(String str, String str2) {
        try {
            return b(str, str2, (Class[]) null, (Object[]) null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Object a(String str, String str2, Class[] clsArr, Object[] objArr) {
        try {
            return a(Class.forName(str, true, f23781a), str2, clsArr, objArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        Method method = null;
        if (cls == null) {
            return null;
        }
        if (clsArr != null) {
            try {
                try {
                    method = cls.getMethod(str, clsArr);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } catch (Throwable unused) {
                method = cls.getDeclaredMethod(str, clsArr);
            }
        } else {
            Method[] methods = cls.getMethods();
            int length = methods.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                Method method2 = methods[i2];
                if (method2.getName().equals(str)) {
                    method = method2;
                    break;
                }
                i2++;
            }
            if (method == null) {
                Method[] declaredMethods = cls.getDeclaredMethods();
                int length2 = declaredMethods.length;
                while (true) {
                    if (i >= length2) {
                        break;
                    }
                    Method method3 = declaredMethods[i];
                    if (method3.getName().equals(str)) {
                        method = method3;
                        break;
                    }
                    i++;
                }
            }
        }
        if (method != null) {
            method.setAccessible(true);
        }
        return method;
    }

    public static void a(ClassLoader classLoader) {
        f23781a = classLoader;
    }

    public static <T> boolean a(Class<T> cls, Class<? extends T> cls2, String str, Class<?>... clsArr) {
        Method a2 = a(cls2, str, clsArr);
        return a2 != null && !a2.getDeclaringClass().equals(cls);
    }

    public static Object b(Object obj, String str) throws Exception {
        return b(obj, str, (Class[]) null, new Object[0]);
    }

    public static Object b(Object obj, String str, Class[] clsArr, Object[] objArr) throws Exception {
        if (obj == null) {
            return null;
        }
        return a(obj, obj.getClass(), str, clsArr, objArr);
    }

    public static Object b(String str, String str2) throws Exception {
        return b(str, str2, (Class[]) null, (Object[]) null);
    }

    public static Object b(String str, String str2, Class[] clsArr, Object[] objArr) throws Exception {
        return a(Class.forName(str, true, f23781a), str2, clsArr, objArr);
    }
}
