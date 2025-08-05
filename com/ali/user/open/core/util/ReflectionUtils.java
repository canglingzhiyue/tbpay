package com.ali.user.open.core.util;

import com.ali.user.open.core.trace.SDKLogger;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.popupcenter.strategy.PopStrategy;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class ReflectionUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<String, Class<?>> PRIMITIVE_CLASSES;
    private static final String TAG;

    static {
        kge.a(424739913);
        PRIMITIVE_CLASSES = new HashMap();
        TAG = ReflectionUtils.class.getSimpleName();
        PRIMITIVE_CLASSES.put("short", Short.TYPE);
        PRIMITIVE_CLASSES.put("int", Integer.TYPE);
        PRIMITIVE_CLASSES.put("long", Long.TYPE);
        PRIMITIVE_CLASSES.put("double", Double.TYPE);
        PRIMITIVE_CLASSES.put(PopStrategy.IDENTIFIER_FLOAT, Float.TYPE);
        PRIMITIVE_CLASSES.put("char", Character.TYPE);
        PRIMITIVE_CLASSES.put(a.ATOM_boolean, Boolean.TYPE);
    }

    public static Object invoke(String str, String str2, String[] strArr, Object obj, Object[] objArr) {
        Method method;
        try {
            Class<?> cls = Class.forName(str);
            if (strArr != null && strArr.length != 0) {
                method = cls.getMethod(str2, toClasses(strArr));
                return method.invoke(obj, objArr);
            }
            method = cls.getMethod(str2, new Class[0]);
            return method.invoke(obj, objArr);
        } catch (Exception e) {
            String str3 = TAG;
            SDKLogger.e(str3, "Fail to post the " + str + "." + str2 + ", the error is " + e.getMessage());
            return null;
        }
    }

    public static <T> T newInstance(Class<T> cls, Class<?>[] clsArr, Object[] objArr) {
        if (clsArr != null) {
            try {
                if (clsArr.length != 0) {
                    return cls.getConstructor(clsArr).newInstance(objArr);
                }
            } catch (Exception e) {
                String str = TAG;
                SDKLogger.e(str, "Fail to create the instance of type " + cls.getName() + ", the error is " + e.getMessage());
                return null;
            }
        }
        return cls.newInstance();
    }

    public static Object newInstance(String str, String[] strArr, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b3f4e3da", new Object[]{str, strArr, objArr});
        }
        try {
            return newInstance(Class.forName(str), toClasses(strArr), objArr);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            String str2 = TAG;
            SDKLogger.e(str2, "Fail to create the instance of type " + str + ", the error is " + e2.getMessage());
            return null;
        }
    }

    public static Class<?>[] toClasses(String[] strArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class[]) ipChange.ipc$dispatch("558a2391", new Object[]{strArr});
        }
        if (strArr == null) {
            return null;
        }
        Class<?>[] clsArr = new Class[strArr.length];
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            if (str.length() < 8) {
                clsArr[i] = PRIMITIVE_CLASSES.get(str);
            }
            if (clsArr[i] == null) {
                clsArr[i] = Class.forName(str);
            }
        }
        return clsArr;
    }

    public static Class<?> loadClassQuietly(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("aa68ac2d", new Object[]{str});
        }
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
