package com.taobao.android.boutique.reflection;

import android.os.Build;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.lsposed.hiddenapibypass.a;
import tb.kge;

/* loaded from: classes4.dex */
public class c implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Method f9223a;
    private final Method b;
    private final Method c;
    private final Method d;
    private final Method e;
    private final Method f;
    private final Method g;
    private final Method h;

    static {
        kge.a(-513576041);
        kge.a(-1310072873);
    }

    public c() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        try {
            method2 = Class.class.getDeclaredMethod("getField", String.class);
            try {
                method2.setAccessible(true);
                method3 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            } catch (Throwable th) {
                th = th;
                method = null;
                method3 = null;
                method4 = method3;
                method5 = method4;
                method6 = method5;
                method7 = method6;
                method8 = method7;
                Log.wtf("ReflectionUtils", th);
                this.f9223a = method2;
                this.b = method3;
                this.c = method4;
                this.d = method5;
                this.e = method6;
                this.f = method7;
                this.g = method8;
                this.h = method;
                Class cls = (Class) Class.class.getDeclaredMethod("forName", String.class).invoke(null, "dalvik.system.VMRuntime");
                Method method9 = (Method) method7.invoke(cls, "getRuntime");
                method9.setAccessible(true);
                method9.setAccessible(true);
                ((Method) method7.invoke(cls, "setHiddenApiExemptions", new Class[]{String[].class})).invoke(method9.invoke(null, new Object[0]), new String[]{"L"});
                return;
            }
            try {
                method3.setAccessible(true);
                method4 = Class.class.getDeclaredMethod("getFields", new Class[0]);
            } catch (Throwable th2) {
                th = th2;
                method = null;
                method4 = null;
                method5 = method4;
                method6 = method5;
                method7 = method6;
                method8 = method7;
                Log.wtf("ReflectionUtils", th);
                this.f9223a = method2;
                this.b = method3;
                this.c = method4;
                this.d = method5;
                this.e = method6;
                this.f = method7;
                this.g = method8;
                this.h = method;
                Class cls2 = (Class) Class.class.getDeclaredMethod("forName", String.class).invoke(null, "dalvik.system.VMRuntime");
                Method method92 = (Method) method7.invoke(cls2, "getRuntime");
                method92.setAccessible(true);
                method92.setAccessible(true);
                ((Method) method7.invoke(cls2, "setHiddenApiExemptions", new Class[]{String[].class})).invoke(method92.invoke(null, new Object[0]), new String[]{"L"});
                return;
            }
            try {
                method4.setAccessible(true);
                method5 = Class.class.getDeclaredMethod("getDeclaredFields", new Class[0]);
            } catch (Throwable th3) {
                th = th3;
                method = null;
                method5 = null;
                method6 = method5;
                method7 = method6;
                method8 = method7;
                Log.wtf("ReflectionUtils", th);
                this.f9223a = method2;
                this.b = method3;
                this.c = method4;
                this.d = method5;
                this.e = method6;
                this.f = method7;
                this.g = method8;
                this.h = method;
                Class cls22 = (Class) Class.class.getDeclaredMethod("forName", String.class).invoke(null, "dalvik.system.VMRuntime");
                Method method922 = (Method) method7.invoke(cls22, "getRuntime");
                method922.setAccessible(true);
                method922.setAccessible(true);
                ((Method) method7.invoke(cls22, "setHiddenApiExemptions", new Class[]{String[].class})).invoke(method922.invoke(null, new Object[0]), new String[]{"L"});
                return;
            }
        } catch (Throwable th4) {
            th = th4;
            method = null;
            method2 = null;
            method3 = null;
        }
        try {
            try {
                method5.setAccessible(true);
                method6 = Class.class.getDeclaredMethod("getMethod", String.class, Class[].class);
                try {
                    method6.setAccessible(true);
                    method7 = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
                    try {
                        method7.setAccessible(true);
                        method8 = Class.class.getDeclaredMethod("getMethods", new Class[0]);
                        try {
                            method8.setAccessible(true);
                            method = Class.class.getDeclaredMethod("getDeclaredMethods", new Class[0]);
                        } catch (Throwable th5) {
                            th = th5;
                            method = null;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        method = null;
                        method8 = null;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    method = null;
                    method7 = null;
                    method8 = method7;
                    Log.wtf("ReflectionUtils", th);
                    this.f9223a = method2;
                    this.b = method3;
                    this.c = method4;
                    this.d = method5;
                    this.e = method6;
                    this.f = method7;
                    this.g = method8;
                    this.h = method;
                    Class cls222 = (Class) Class.class.getDeclaredMethod("forName", String.class).invoke(null, "dalvik.system.VMRuntime");
                    Method method9222 = (Method) method7.invoke(cls222, "getRuntime");
                    method9222.setAccessible(true);
                    method9222.setAccessible(true);
                    ((Method) method7.invoke(cls222, "setHiddenApiExemptions", new Class[]{String[].class})).invoke(method9222.invoke(null, new Object[0]), new String[]{"L"});
                    return;
                }
                try {
                    method.setAccessible(true);
                } catch (Throwable th8) {
                    th = th8;
                    Log.wtf("ReflectionUtils", th);
                    this.f9223a = method2;
                    this.b = method3;
                    this.c = method4;
                    this.d = method5;
                    this.e = method6;
                    this.f = method7;
                    this.g = method8;
                    this.h = method;
                    Class cls2222 = (Class) Class.class.getDeclaredMethod("forName", String.class).invoke(null, "dalvik.system.VMRuntime");
                    Method method92222 = (Method) method7.invoke(cls2222, "getRuntime");
                    method92222.setAccessible(true);
                    method92222.setAccessible(true);
                    ((Method) method7.invoke(cls2222, "setHiddenApiExemptions", new Class[]{String[].class})).invoke(method92222.invoke(null, new Object[0]), new String[]{"L"});
                    return;
                }
            } catch (Throwable th9) {
                th = th9;
                method = null;
                method6 = null;
                method7 = method6;
                method8 = method7;
                Log.wtf("ReflectionUtils", th);
                this.f9223a = method2;
                this.b = method3;
                this.c = method4;
                this.d = method5;
                this.e = method6;
                this.f = method7;
                this.g = method8;
                this.h = method;
                Class cls22222 = (Class) Class.class.getDeclaredMethod("forName", String.class).invoke(null, "dalvik.system.VMRuntime");
                Method method922222 = (Method) method7.invoke(cls22222, "getRuntime");
                method922222.setAccessible(true);
                method922222.setAccessible(true);
                ((Method) method7.invoke(cls22222, "setHiddenApiExemptions", new Class[]{String[].class})).invoke(method922222.invoke(null, new Object[0]), new String[]{"L"});
                return;
            }
            Class cls222222 = (Class) Class.class.getDeclaredMethod("forName", String.class).invoke(null, "dalvik.system.VMRuntime");
            Method method9222222 = (Method) method7.invoke(cls222222, "getRuntime");
            method9222222.setAccessible(true);
            method9222222.setAccessible(true);
            ((Method) method7.invoke(cls222222, "setHiddenApiExemptions", new Class[]{String[].class})).invoke(method9222222.invoke(null, new Object[0]), new String[]{"L"});
            return;
        } catch (Throwable th10) {
            if (Build.VERSION.SDK_INT < 28) {
                return;
            }
            try {
                a.b(new String[]{"L"});
                return;
            } catch (Throwable unused) {
                Log.wtf("ReflectionUtils", th10);
                return;
            }
        }
        this.f9223a = method2;
        this.b = method3;
        this.c = method4;
        this.d = method5;
        this.e = method6;
        this.f = method7;
        this.g = method8;
        this.h = method;
    }

    @Override // com.taobao.android.boutique.reflection.g
    public Field getDeclaredField(Class<?> cls, String str) throws NoSuchFieldException {
        try {
            return (Field) this.b.invoke(cls, str);
        } catch (Exception e) {
            throw a(e, cls, str);
        }
    }

    @Override // com.taobao.android.boutique.reflection.g
    public Field[] a(Class<?> cls) throws SecurityException {
        try {
            return (Field[]) this.d.invoke(cls, new Object[0]);
        } catch (Exception e) {
            throw a(cls, e);
        }
    }

    @Override // com.taobao.android.boutique.reflection.g
    public Method a(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        try {
            return (Method) this.f.invoke(cls, str, clsArr);
        } catch (Exception e) {
            throw b(e, cls, str);
        }
    }

    private NoSuchFieldException a(Exception exc, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NoSuchFieldException) ipChange.ipc$dispatch("7739c86b", new Object[]{this, exc, cls, str});
        }
        boolean z = exc instanceof InvocationTargetException;
        Exception exc2 = exc;
        if (z) {
            exc2 = ((InvocationTargetException) exc).getTargetException();
        }
        if (exc2 instanceof NoSuchFieldException) {
            return (NoSuchFieldException) exc2;
        }
        NoSuchFieldException noSuchFieldException = new NoSuchFieldException(cls.getName() + ":" + str);
        noSuchFieldException.initCause(exc2);
        return noSuchFieldException;
    }

    private NoSuchMethodException b(Exception exc, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NoSuchMethodException) ipChange.ipc$dispatch("5a9a1ca9", new Object[]{this, exc, cls, str});
        }
        boolean z = exc instanceof InvocationTargetException;
        Exception exc2 = exc;
        if (z) {
            exc2 = ((InvocationTargetException) exc).getTargetException();
        }
        if (exc2 instanceof NoSuchMethodException) {
            return (NoSuchMethodException) exc2;
        }
        NoSuchMethodException noSuchMethodException = new NoSuchMethodException(cls.getName() + ":" + str);
        noSuchMethodException.initCause(exc2);
        return noSuchMethodException;
    }

    private SecurityException a(Class<?> cls, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SecurityException) ipChange.ipc$dispatch("3764d367", new Object[]{this, cls, exc});
        }
        if (exc instanceof InvocationTargetException) {
            return new SecurityException(cls.getName(), ((InvocationTargetException) exc).getTargetException());
        }
        return new SecurityException(cls.getName(), exc);
    }
}
