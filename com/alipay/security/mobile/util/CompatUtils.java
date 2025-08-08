package com.alipay.security.mobile.util;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class CompatUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static boolean DEBUG = false;
    private static final String TAG = "CompatUtils";

    public static Class<?> getClass(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("f7d6f780", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static Method getMethod(Class<?> cls, String str, Class<?>... clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("3e76b86d", new Object[]{cls, str, clsArr});
        }
        if (cls != null && !StringUtils.isEmpty(str)) {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static Field getField(Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("90de8d19", new Object[]{cls, str});
        }
        if (cls != null && !StringUtils.isEmpty(str)) {
            try {
                return cls.getDeclaredField(str);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static Constructor<?> getConstructor(Class<?> cls, Class<?>... clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Constructor) ipChange.ipc$dispatch("66ddf97", new Object[]{cls, clsArr});
        }
        if (cls != null && clsArr != null) {
            try {
                return cls.getConstructor(clsArr);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static Object newInstance(Constructor<?> constructor, Object... objArr) {
        if (constructor == null) {
            return null;
        }
        try {
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            String str = TAG;
            Log.e(str, "Exception in newInstance: " + e.getClass().getSimpleName());
            return null;
        }
    }

    public static Object invoke(Object obj, Object obj2, Method method, Object... objArr) {
        if (method == null) {
            return obj2;
        }
        try {
            return method.invoke(obj, objArr);
        } catch (Exception e) {
            String str = TAG;
            Log.e(str, "Exception in invoke: " + e.getClass().getSimpleName());
            return obj2;
        }
    }

    public static Object getFieldValue(Object obj, Object obj2, Field field) {
        if (field == null) {
            return obj2;
        }
        try {
            return field.get(obj);
        } catch (Exception unused) {
            return obj2;
        }
    }

    public static void setFieldValue(Object obj, Field field, Object obj2) {
        if (field == null) {
            return;
        }
        try {
            field.set(obj, obj2);
        } catch (Exception unused) {
        }
    }

    private CompatUtils() {
    }
}
