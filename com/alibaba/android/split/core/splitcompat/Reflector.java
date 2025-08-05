package com.alibaba.android.split.core.splitcompat;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import tb.kge;

/* loaded from: classes2.dex */
public class Reflector {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Class<?> f2446a;
    public Object b;
    public Constructor c;
    public Field d;
    public Method e;

    static {
        kge.a(435009395);
    }

    /* loaded from: classes2.dex */
    public static class ReflectedException extends Exception {
        static {
            kge.a(-912271228);
        }

        public ReflectedException(String str) {
            super(str);
        }

        public ReflectedException(String str, Throwable th) {
            super(str, th);
        }
    }

    public static Reflector a(String str) throws ReflectedException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Reflector) ipChange.ipc$dispatch("69c63400", new Object[]{str}) : a(str, true, Reflector.class.getClassLoader());
    }

    public static Reflector a(String str, boolean z, ClassLoader classLoader) throws ReflectedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reflector) ipChange.ipc$dispatch("51220eaa", new Object[]{str, new Boolean(z), classLoader});
        }
        try {
            return a(Class.forName(str, z, classLoader));
        } catch (Throwable th) {
            throw new ReflectedException("Oops!", th);
        }
    }

    public static Reflector a(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reflector) ipChange.ipc$dispatch("fefab83d", new Object[]{cls});
        }
        Reflector reflector = new Reflector();
        reflector.f2446a = cls;
        return reflector;
    }

    public static Reflector a(Object obj) throws ReflectedException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Reflector) ipChange.ipc$dispatch("63e6152e", new Object[]{obj}) : a(obj.getClass()).c(obj);
    }

    public Reflector a(Class<?>... clsArr) throws ReflectedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reflector) ipChange.ipc$dispatch("c6c99342", new Object[]{this, clsArr});
        }
        try {
            this.c = this.f2446a.getDeclaredConstructor(clsArr);
            this.c.setAccessible(true);
            this.d = null;
            this.e = null;
            return this;
        } catch (Throwable th) {
            throw new ReflectedException("Oops!", th);
        }
    }

    public <R> R a(Object... objArr) throws ReflectedException {
        Constructor constructor = this.c;
        if (constructor == null) {
            throw new ReflectedException("Constructor was null!");
        }
        try {
            return (R) constructor.newInstance(objArr);
        } catch (InvocationTargetException e) {
            throw new ReflectedException("Oops!", e.getTargetException());
        } catch (Throwable th) {
            throw new ReflectedException("Oops!", th);
        }
    }

    public Object b(Object obj) throws ReflectedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("eeb6464d", new Object[]{this, obj});
        }
        if (obj == null || this.f2446a.isInstance(obj)) {
            return obj;
        }
        throw new ReflectedException("Caller [" + obj + "] is not a instance of type [" + this.f2446a + "]!");
    }

    public void a(Object obj, Member member, String str) throws ReflectedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2930071d", new Object[]{this, obj, member, str});
        } else if (member == null) {
            throw new ReflectedException(str + " was null!");
        } else if (obj == null && !Modifier.isStatic(member.getModifiers())) {
            throw new ReflectedException("Need a caller!");
        } else {
            b(obj);
        }
    }

    public Reflector c(Object obj) throws ReflectedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reflector) ipChange.ipc$dispatch("e8146fec", new Object[]{this, obj});
        }
        this.b = b(obj);
        return this;
    }

    public Reflector b(String str) throws ReflectedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reflector) ipChange.ipc$dispatch("abdd615f", new Object[]{this, str});
        }
        try {
            this.d = c(str);
            this.d.setAccessible(true);
            this.c = null;
            this.e = null;
            return this;
        } catch (Throwable th) {
            throw new ReflectedException("field not exists in :" + this.f2446a, th);
        }
    }

    public Field c(String str) throws NoSuchFieldException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("44c12db1", new Object[]{this, str});
        }
        try {
            return this.f2446a.getField(str);
        } catch (NoSuchFieldException e) {
            for (Class<?> cls = this.f2446a; cls != null; cls = cls.getSuperclass()) {
                try {
                    return cls.getDeclaredField(str);
                } catch (NoSuchFieldException unused) {
                }
            }
            throw e;
        }
    }

    public <R> R a() throws ReflectedException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (R) ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : (R) d(this.b);
    }

    public <R> R d(Object obj) throws ReflectedException {
        a(obj, this.d, "Field");
        try {
            return (R) this.d.get(obj);
        } catch (Throwable th) {
            throw new ReflectedException("Oops!", th);
        }
    }

    public Reflector e(Object obj) throws ReflectedException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Reflector) ipChange.ipc$dispatch("6c42caaa", new Object[]{this, obj}) : a(this.b, obj);
    }

    public Reflector a(Object obj, Object obj2) throws ReflectedException {
        a(obj, this.d, "Field");
        try {
            this.d.set(obj, obj2);
            return this;
        } catch (Throwable th) {
            throw new ReflectedException("Oops!", th);
        }
    }

    public Reflector a(String str, Class<?>... clsArr) throws ReflectedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Reflector) ipChange.ipc$dispatch("40f18c38", new Object[]{this, str, clsArr});
        }
        try {
            this.e = b(str, clsArr);
            this.e.setAccessible(true);
            this.c = null;
            this.d = null;
            return this;
        } catch (NoSuchMethodException e) {
            throw new ReflectedException("Oops!", e);
        }
    }

    public Method b(String str, Class<?>... clsArr) throws NoSuchMethodException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("d85c22e3", new Object[]{this, str, clsArr});
        }
        try {
            return this.f2446a.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            for (Class<?> cls = this.f2446a; cls != null; cls = cls.getSuperclass()) {
                try {
                    return cls.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException unused) {
                }
            }
            throw e;
        }
    }

    public <R> R b(Object... objArr) throws ReflectedException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (R) ipChange.ipc$dispatch("bf61378a", new Object[]{this, objArr}) : (R) a(this.b, objArr);
    }

    public <R> R a(Object obj, Object... objArr) throws ReflectedException {
        a(obj, this.e, "Method");
        try {
            return (R) this.e.invoke(obj, objArr);
        } catch (InvocationTargetException e) {
            throw new ReflectedException("Oops!", e.getTargetException());
        } catch (Throwable th) {
            throw new ReflectedException("Oops!", th);
        }
    }
}
