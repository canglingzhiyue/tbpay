package com.huawei.hms.framework.common;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;

/* loaded from: classes4.dex */
public class ReflectionUtils {
    private static final String TAG = "ReflectionUtils";

    public static boolean checkCompatible(String str) {
        try {
            tryLoadClass(str);
            return true;
        } catch (Exception unused) {
            Logger.w(TAG, str + "ClassNotFoundException");
            return false;
        }
    }

    public static boolean checkCompatible(String str, String str2, Class<?>... clsArr) {
        String str3;
        try {
            if (str == null || str2 == null) {
                Logger.w(TAG, "targetClass is  null or name is null:");
                return false;
            }
            Class.forName(str).getDeclaredMethod(str2, clsArr);
            Logger.v(TAG, "has method : " + str2);
            return true;
        } catch (RuntimeException unused) {
            str3 = str + " RuntimeException";
            Logger.w(TAG, str3);
            return false;
        } catch (Exception unused2) {
            str3 = str2 + " NoSuchMethodException";
            Logger.w(TAG, str3);
            return false;
        }
    }

    private static Class<?> getClass(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static Field getField(Object obj, String str) {
        String str2;
        if (obj != null && !TextUtils.isEmpty(str)) {
            try {
                final Field declaredField = obj.getClass().getDeclaredField(str);
                AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.hms.framework.common.ReflectionUtils.2
                    @Override // java.security.PrivilegedAction
                    public Object run() {
                        declaredField.setAccessible(true);
                        return null;
                    }
                });
                return declaredField;
            } catch (IllegalArgumentException e) {
                e = e;
                str2 = "Exception in getField :: IllegalArgumentException:";
                Logger.e(TAG, str2, e);
                return null;
            } catch (NoSuchFieldException e2) {
                e = e2;
                str2 = "Exception in getField :: NoSuchFieldException:";
                Logger.e(TAG, str2, e);
                return null;
            } catch (SecurityException e3) {
                e = e3;
                str2 = "not security int method getField,SecurityException:";
                Logger.e(TAG, str2, e);
                return null;
            }
        }
        return null;
    }

    public static Object getFieldObj(Object obj, String str) {
        String str2;
        if (obj == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            final Field declaredField = obj.getClass().getDeclaredField(str);
            AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.hms.framework.common.ReflectionUtils.1
                @Override // java.security.PrivilegedAction
                public Object run() {
                    declaredField.setAccessible(true);
                    return null;
                }
            });
            return declaredField.get(obj);
        } catch (IllegalAccessException e) {
            e = e;
            str2 = "Exception in getFieldObj :: IllegalAccessException:";
            Logger.e(TAG, str2, e);
            return null;
        } catch (IllegalArgumentException e2) {
            e = e2;
            str2 = "Exception in getFieldObj :: IllegalArgumentException:";
            Logger.e(TAG, str2, e);
            return null;
        } catch (NoSuchFieldException e3) {
            e = e3;
            str2 = "Exception in getFieldObj :: NoSuchFieldException:";
            Logger.e(TAG, str2, e);
            return null;
        } catch (SecurityException e4) {
            e = e4;
            str2 = "not security int method getFieldObj,SecurityException:";
            Logger.e(TAG, str2, e);
            return null;
        }
    }

    public static Method getMethod(Class<?> cls, String str, Class<?>... clsArr) {
        String str2;
        if (cls == null || str == null) {
            Logger.w(TAG, "targetClass is  null pr name is null:");
            return null;
        }
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            e = e;
            str2 = "NoSuchMethodException:";
            Logger.e(TAG, str2, e);
            return null;
        } catch (SecurityException e2) {
            e = e2;
            str2 = "SecurityException:";
            Logger.e(TAG, str2, e);
            return null;
        }
    }

    public static Object getStaticFieldObj(String str, String str2) {
        Class<?> cls;
        String str3;
        if (str == null || (cls = getClass(str)) == null || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            final Field declaredField = cls.getDeclaredField(str2);
            AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.hms.framework.common.ReflectionUtils.3
                @Override // java.security.PrivilegedAction
                public Object run() {
                    declaredField.setAccessible(true);
                    return null;
                }
            });
            return declaredField.get(cls);
        } catch (IllegalAccessException e) {
            e = e;
            str3 = "Exception in getFieldObj :: IllegalAccessException:";
            Logger.e(TAG, str3, e);
            return null;
        } catch (IllegalArgumentException e2) {
            e = e2;
            str3 = "Exception in getFieldObj :: IllegalArgumentException:";
            Logger.e(TAG, str3, e);
            return null;
        } catch (NoSuchFieldException e3) {
            e = e3;
            str3 = "Exception in getFieldObj :: NoSuchFieldException:";
            Logger.e(TAG, str3, e);
            return null;
        } catch (SecurityException e4) {
            e = e4;
            str3 = "not security int method getStaticFieldObj,SecurityException:";
            Logger.e(TAG, str3, e);
            return null;
        }
    }

    private static Object invoke(Object obj, Method method, Object... objArr) throws UnsupportedOperationException {
        String str;
        if (method == null) {
            return null;
        }
        try {
            return method.invoke(obj, objArr);
        } catch (RuntimeException e) {
            e = e;
            str = "RuntimeException in invoke:";
            Logger.e(TAG, str, e);
            return null;
        } catch (Exception e2) {
            e = e2;
            str = "Exception in invoke:";
            Logger.e(TAG, str, e);
            return null;
        }
    }

    public static Object invokeStaticMethod(String str, String str2, Class<?>[] clsArr, Object... objArr) {
        Method method = getMethod(getClass(str), str2, clsArr);
        if (method == null) {
            return null;
        }
        return invoke(null, method, objArr);
    }

    public static Object invokeStaticMethod(String str, String str2, Object... objArr) {
        Class[] clsArr;
        if (str == null) {
            return null;
        }
        if (objArr != null) {
            int length = objArr.length;
            clsArr = new Class[length];
            for (int i = 0; i < length; i++) {
                setClassType(clsArr, objArr[i], i);
            }
        } else {
            clsArr = null;
        }
        Method method = getMethod(getClass(str), str2, clsArr);
        if (method != null) {
            return invoke(null, method, objArr);
        }
        return null;
    }

    private static void setClassType(Class<?>[] clsArr, Object obj, int i) {
        if (obj instanceof Integer) {
            clsArr[i] = Integer.TYPE;
        } else if (obj instanceof Long) {
            clsArr[i] = Long.TYPE;
        } else if (obj instanceof Double) {
            clsArr[i] = Double.TYPE;
        } else if (obj instanceof Float) {
            clsArr[i] = Float.TYPE;
        } else if (obj instanceof Boolean) {
            clsArr[i] = Boolean.TYPE;
        } else if (obj instanceof Character) {
            clsArr[i] = Character.TYPE;
        } else if (obj instanceof Byte) {
            clsArr[i] = Byte.TYPE;
        } else if (obj instanceof Void) {
            clsArr[i] = Void.TYPE;
        } else if (obj instanceof Short) {
            clsArr[i] = Short.TYPE;
        } else {
            clsArr[i] = obj.getClass();
        }
    }

    private static void tryLoadClass(String str) throws ClassNotFoundException {
        ClassLoader classLoader = ReflectionUtils.class.getClassLoader();
        if (classLoader != null) {
            classLoader.loadClass(str);
            return;
        }
        throw new ClassNotFoundException("not found classloader");
    }
}
