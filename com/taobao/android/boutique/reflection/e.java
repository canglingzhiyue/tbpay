package com.taobao.android.boutique.reflection;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import tb.kge;

/* loaded from: classes4.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Object f9224a;
    private final Class b;

    static {
        kge.a(-1512683633);
    }

    public static e a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("a053a708", new Object[]{obj});
        }
        if (obj == null) {
            throw new NullPointerException();
        }
        if (obj instanceof Class) {
            return new e(null, (Class) obj);
        }
        return new e(obj, obj.getClass());
    }

    private e(Object obj, Class cls) {
        this.f9224a = obj;
        this.b = obj != null ? obj.getClass() : cls;
    }

    public <T> T a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : (T) this.f9224a;
    }

    public e a(String str) throws NoSuchFieldException, IllegalAccessException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("20ddf0da", new Object[]{this, str}) : a(b(str));
    }

    private Field b(String str) throws NoSuchFieldException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("cf470770", new Object[]{this, str});
        }
        Class cls = this.b;
        Field field = null;
        do {
            try {
                field = h.a(cls, str);
                break;
            } catch (Exception unused) {
                cls = cls.getSuperclass();
                if (cls == Object.class) {
                }
            }
        } while (cls == Object.class);
        if (field != null) {
            return field;
        }
        throw new NoSuchFieldException(this.b.getName() + ":" + str);
    }

    public e c(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("1d9ff898", new Object[]{this, str}) : a(str, new Class[0], new Object[0]);
    }

    public e a(String str, Class<?>[] clsArr, Object[] objArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        Method a2 = h.a(this.b, str, clsArr);
        if (a2 == null) {
            throw new NoSuchMethodException();
        }
        a2.setAccessible(true);
        Class<?> returnType = a2.getReturnType();
        Object obj = Modifier.isStatic(a2.getModifiers()) ? null : this.f9224a;
        if (a2.getReturnType() != Void.TYPE) {
            return new e(a2.invoke(obj, objArr), returnType);
        }
        a2.invoke(obj, objArr);
        return null;
    }

    public e a(String str, Object obj) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("47a0e0fe", new Object[]{this, str, obj}) : a(b(str), obj);
    }

    private e a(Field field) throws IllegalArgumentException, IllegalAccessException {
        field.setAccessible(true);
        return new e(field.get(Modifier.isStatic(field.getModifiers()) ? null : this.f9224a), field.getType());
    }

    private e a(Field field, Object obj) throws IllegalArgumentException, IllegalAccessException {
        field.setAccessible(true);
        if (Modifier.isStatic(field.getModifiers())) {
            field.set(null, obj);
        } else {
            field.set(this.f9224a, obj);
        }
        return this;
    }
}
