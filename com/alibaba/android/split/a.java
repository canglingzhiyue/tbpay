package com.alibaba.android.split;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map f2426a;
    private static final Map<Class, Constructor> b;

    static {
        kge.a(-1235550716);
        f2426a = new HashMap();
        b = new HashMap();
    }

    public static <T> void a(Class<? super T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9dcc71", new Object[]{cls, t});
        } else if (f2426a.containsKey(cls)) {
            throw new IllegalStateException(cls.getName() + "instance can only regist once!");
        } else {
            f2426a.put(cls, t);
        }
    }

    public static <T> void a(Class<? super T> cls, Class<? extends T> cls2, Class<?>... clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75b91f50", new Object[]{cls, cls2, clsArr});
        } else if (f2426a.containsKey(cls)) {
            throw new IllegalStateException(cls.getName() + "instance can only regist once!");
        } else {
            try {
                b.put(cls, cls2.getDeclaredConstructor(clsArr));
            } catch (NoSuchMethodException e) {
                Log.e("Flex", "no such constructor with parameterTypes:" + clsArr.toString());
                e.printStackTrace();
            }
        }
    }

    public static <T> T a(Class<? extends T> cls, Object... objArr) {
        if (f2426a.containsKey(cls)) {
            return (T) f2426a.get(cls);
        }
        if (b.containsKey(cls)) {
            Constructor constructor = b.get(cls);
            constructor.setAccessible(true);
            try {
                T t = (T) constructor.newInstance(objArr);
                f2426a.put(cls, t);
                return t;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            } catch (InstantiationException e2) {
                e2.printStackTrace();
                return null;
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
                return null;
            }
        }
        throw new IllegalStateException(cls.getName() + "has no instance registed!");
    }

    public static <T> T b(Class<? extends T> cls, Object... objArr) {
        if (b.containsKey(cls)) {
            Constructor constructor = b.get(cls);
            constructor.setAccessible(true);
            try {
                return (T) constructor.newInstance(objArr);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            } catch (InstantiationException e2) {
                e2.printStackTrace();
                return null;
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
                return null;
            }
        }
        throw new IllegalStateException(cls.getName() + "has no instance registed!");
    }
}
