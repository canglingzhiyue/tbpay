package com.taobao.update.framework;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Object> f23417a;
    private static Map<String, Class> b;

    static {
        kge.a(-690733194);
        f23417a = new HashMap();
        b = new HashMap();
    }

    public static void registerClass(Class... clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("393b78e4", new Object[]{clsArr});
            return;
        }
        for (Class cls : clsArr) {
            Class<?>[] interfaces = cls.getInterfaces();
            if (interfaces != null && interfaces.length > 0) {
                for (Class<?> cls2 : interfaces) {
                    b.put(cls2.getName(), cls);
                }
            } else {
                b.put(cls.getSuperclass().getName(), cls);
            }
        }
    }

    public static void registerClass(String str, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4036a97", new Object[]{str, cls});
        } else {
            b.put(str, cls);
        }
    }

    public static void registerInstance(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de182fb", new Object[]{obj});
            return;
        }
        Class<?> cls = obj.getClass();
        Class<?>[] interfaces = cls.getInterfaces();
        if (interfaces != null && interfaces.length > 0) {
            for (Class<?> cls2 : interfaces) {
                b.put(cls2.getName(), cls);
                f23417a.put(cls2.getName(), obj);
            }
            return;
        }
        b.put(cls.getSuperclass().getName(), cls);
        f23417a.put(cls.getSuperclass().getName(), obj);
    }

    public static void registerInstance(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec02a485", new Object[]{str, obj});
        } else {
            f23417a.put(str, obj);
        }
    }

    public static final <T> T getInstance(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("b9451627", new Object[]{cls}) : (T) getInstance(cls.getName(), cls);
    }

    public static final <T> T getInstance(String str, Class<T> cls) {
        T t = (T) f23417a.get(str);
        if (t != null) {
            return t;
        }
        Class cls2 = b.get(str);
        if (cls2 == null) {
            return null;
        }
        try {
            return cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            Log.e("bf", "get Instance exception ", e);
            return null;
        }
    }
}
