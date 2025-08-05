package com.taobao.media;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes7.dex */
public class DoubleReflectionUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(893107479);
    }

    public static Method getMethod(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return (Method) cls.getClass().getMethod("getMethod", String.class, Class[].class).invoke(cls, str, clsArr);
    }

    public static Field getPrivateField(Class<?> cls, String str) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredField", String.class);
        declaredMethod.setAccessible(true);
        return (Field) declaredMethod.invoke(cls, str);
    }
}
