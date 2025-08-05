package org.lsposed.hiddenapibypass;

import android.util.Log;
import com.alibaba.analytics.core.sync.q;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.IpChange;
import com.loc.at;
import dalvik.system.VMRuntime;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.lsposed.hiddenapibypass.Helper;
import sun.misc.Unsafe;
import tb.kge;

/* loaded from: classes9.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean DEBUG = false;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ boolean f25086a;
    private static final Unsafe b;
    private static final long c;
    private static final long d;
    private static final long e;
    private static final long f;
    private static final long g;
    private static final long h;
    private static final long i;

    static {
        kge.a(637989011);
        f25086a = !a.class.desiredAssertionStatus();
        try {
            b = (Unsafe) Unsafe.class.getDeclaredMethod("getUnsafe", new Class[0]).invoke(null, new Object[0]);
            if (!f25086a && b == null) {
                throw new AssertionError();
            }
            c = b.objectFieldOffset(Helper.Executable.class.getDeclaredField("artMethod"));
            d = b.objectFieldOffset(Helper.a.class.getDeclaredField("artFieldOrMethod"));
            e = b.objectFieldOffset(Helper.Class.class.getDeclaredField("methods"));
            f = b.objectFieldOffset(Helper.Class.class.getDeclaredField("iFields"));
            Method declaredMethod = Helper.NeverCall.class.getDeclaredMethod("a", new Class[0]);
            Method declaredMethod2 = Helper.NeverCall.class.getDeclaredMethod(TplMsg.VALUE_T_NATIVE_RETURN, new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod2.setAccessible(true);
            MethodHandle unreflect = MethodHandles.lookup().unreflect(declaredMethod);
            MethodHandle unreflect2 = MethodHandles.lookup().unreflect(declaredMethod2);
            long j = b.getLong(unreflect, d);
            long j2 = b.getLong(unreflect2, d);
            long j3 = b.getLong(Helper.NeverCall.class, e);
            g = j2 - j;
            h = (j - j3) - g;
            Field declaredField = Helper.NeverCall.class.getDeclaredField(q.MSGTYPE_INTERVAL);
            Field declaredField2 = Helper.NeverCall.class.getDeclaredField(at.j);
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            MethodHandle unreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
            MethodHandle unreflectGetter2 = MethodHandles.lookup().unreflectGetter(declaredField2);
            long j4 = b.getLong(unreflectGetter, d);
            long j5 = b.getLong(unreflectGetter2, d);
            b.getLong(Helper.NeverCall.class, f);
            i = j5 - j4;
        } catch (ReflectiveOperationException e2) {
            Log.e("HiddenApiBypass", "Initialize error", e2);
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static boolean a(Class<?>[] clsArr, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9bded85", new Object[]{clsArr, objArr})).booleanValue();
        }
        if (clsArr.length != objArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            if (clsArr[i2].isPrimitive()) {
                if (clsArr[i2] == Integer.TYPE && !(objArr[i2] instanceof Integer)) {
                    return false;
                }
                if (clsArr[i2] == Byte.TYPE && !(objArr[i2] instanceof Byte)) {
                    return false;
                }
                if (clsArr[i2] == Character.TYPE && !(objArr[i2] instanceof Character)) {
                    return false;
                }
                if (clsArr[i2] == Boolean.TYPE && !(objArr[i2] instanceof Boolean)) {
                    return false;
                }
                if (clsArr[i2] == Double.TYPE && !(objArr[i2] instanceof Double)) {
                    return false;
                }
                if (clsArr[i2] == Float.TYPE && !(objArr[i2] instanceof Float)) {
                    return false;
                }
                if (clsArr[i2] == Long.TYPE && !(objArr[i2] instanceof Long)) {
                    return false;
                }
                if (clsArr[i2] == Short.TYPE && !(objArr[i2] instanceof Short)) {
                    return false;
                }
            } else if (objArr[i2] != null && !clsArr[i2].isInstance(objArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public static Object a(Class<?> cls, Object obj, String str, Object... objArr) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if (obj != null && !cls.isInstance(obj)) {
            throw new IllegalArgumentException("this object is not an instance of the given class");
        }
        Method declaredMethod = Helper.InvokeStub.class.getDeclaredMethod("invoke", Object[].class);
        declaredMethod.setAccessible(true);
        long j = b.getLong(cls, e);
        if (j == 0) {
            throw new NoSuchMethodException("Cannot find matching method");
        }
        int i2 = b.getInt(j);
        for (int i3 = 0; i3 < i2; i3++) {
            b.putLong(declaredMethod, c, (i3 * g) + j + h);
            if (str.equals(declaredMethod.getName()) && a(declaredMethod.getParameterTypes(), objArr)) {
                return declaredMethod.invoke(obj, objArr);
            }
        }
        throw new NoSuchMethodException("Cannot find matching method");
    }

    public static boolean a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b26fbb", new Object[]{strArr})).booleanValue();
        }
        try {
            a(VMRuntime.class, a(VMRuntime.class, null, "getRuntime", new Object[0]), "setHiddenApiExemptions", strArr);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean b(String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ffb3fe9a", new Object[]{strArr})).booleanValue() : a(strArr);
    }
}
