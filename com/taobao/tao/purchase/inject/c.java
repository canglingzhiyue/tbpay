package com.taobao.tao.purchase.inject;

import android.util.Log;
import android.util.LruCache;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, b> f20889a = new HashMap();
    private static final Map<Class, b> b = new HashMap();
    private static final HashSet<String> c = new HashSet<>();
    private static final LruCache<String, Pair<Field[], Field[]>> d = new LruCache<>(8);

    public static synchronized void a(String str, Class... clsArr) {
        synchronized (c.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("305a60fa", new Object[]{str, clsArr});
                return;
            }
            if (!c.contains(str)) {
                c.add(str);
                a(clsArr);
            }
        }
    }

    public static void a(Class... clsArr) {
        Class<?>[] interfaces;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ac91fb0", new Object[]{clsArr});
        } else if (clsArr != null && clsArr.length != 0) {
            for (Class cls : clsArr) {
                Implementation implementation = (Implementation) cls.getAnnotation(Implementation.class);
                if (implementation != null) {
                    b bVar = new b();
                    bVar.b = cls;
                    bVar.c = implementation.singleton();
                    for (Class<?> cls2 : cls.getInterfaces()) {
                        if (a.class.isAssignableFrom(cls2)) {
                            b.put(cls2, bVar);
                        }
                    }
                    for (String str : implementation.value()) {
                        bVar.f20888a = str;
                        f20889a.put(bVar.f20888a, bVar);
                    }
                    if (implementation.injectType() == InjectType.STATIC) {
                        for (Class cls3 : implementation.target()) {
                            b(cls3);
                        }
                    }
                }
            }
        }
    }

    public static Object a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("17307540", new Object[]{str});
        }
        b bVar = f20889a.get(str);
        if (bVar == null) {
            return null;
        }
        try {
            return bVar.a();
        } catch (Exception e) {
            Log.e("InjectEngine", "get instance from binding exception", e);
            return null;
        }
    }

    public static Object a(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("bd4d3fd", new Object[]{cls});
        }
        b bVar = b.get(cls);
        if (bVar == null) {
            return null;
        }
        try {
            return bVar.a();
        } catch (Exception e) {
            Log.e("InjectEngine", "get instance from binding exception", e);
            return null;
        }
    }

    private static void b(Class cls) {
        Field[] fields;
        Object a2;
        for (Field field : cls.getFields()) {
            ExternalInject externalInject = (ExternalInject) field.getAnnotation(ExternalInject.class);
            if (externalInject != null) {
                try {
                    if (externalInject.value().isEmpty()) {
                        a2 = a(field.getType());
                    } else {
                        a2 = a(externalInject.value());
                    }
                    field.set(null, a2);
                } catch (Exception e) {
                    Log.e("InjectEngine", "set static field exception", e);
                }
            }
        }
    }
}
