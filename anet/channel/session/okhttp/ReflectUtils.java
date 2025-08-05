package anet.channel.session.okhttp;

import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import tb.kge;

/* loaded from: classes.dex */
public class ReflectUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Method class_getConstructor;
    private static Method method_getMethods;
    private static volatile boolean reflectValid;

    static {
        kge.a(1915859175);
        try {
            method_getMethods = Class.class.getDeclaredMethod("getMethods", new Class[0]);
            class_getConstructor = Class.class.getDeclaredMethod("getConstructors", new Class[0]);
            reflectValid = true;
        } catch (Throwable unused) {
            reflectValid = false;
        }
    }

    public static Method getDeclaredMethod(Object obj, String str, Class<?>... clsArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("4f2a6218", new Object[]{obj, str, clsArr});
        }
        if (reflectValid) {
            ALog.e("ReflectUtils", "getDeclaredMethod, isFixOkhttpOpen true, name=" + str, null, new Object[0]);
            return ((Class) obj).getDeclaredMethod(str, clsArr);
        }
        throw new NoSuchMethodException();
    }

    public static Method getMethod(Object obj, String str, Class<?>... clsArr) throws Exception {
        Method[] methodArr;
        if (reflectValid) {
            for (Method method : (Method[]) method_getMethods.invoke(obj, new Object[0])) {
                if (method.getName().equals(str) && Arrays.deepEquals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
        }
        throw new NoSuchMethodException();
    }

    public static Constructor getConstructor(Object obj, Class<?>... clsArr) throws Exception {
        Constructor[] constructorArr;
        if (reflectValid) {
            for (Constructor constructor : (Constructor[]) class_getConstructor.invoke(obj, new Object[0])) {
                if (Arrays.deepEquals(constructor.getParameterTypes(), clsArr)) {
                    return constructor;
                }
            }
        }
        throw new NoSuchMethodException();
    }
}
