package com.taobao.android.virtual_thread;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import tb.jrk;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<Looper> f15806a;
    private static final WeakHashMap<Thread, Looper> b;

    static {
        kge.a(-41971141);
        b = new WeakHashMap<>();
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod.setAccessible(true);
            Field field = (Field) declaredMethod.invoke(Looper.class, "sThreadLocal");
            field.setAccessible(true);
            f15806a = (ThreadLocal) field.get(null);
        } catch (Throwable th) {
            try {
                jrk.a(th);
            } finally {
                f15806a = null;
            }
        }
    }

    public static void a(Thread thread) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1d0af99", new Object[]{thread});
            return;
        }
        synchronized (b) {
            Looper looper = b.get(thread);
            if (looper != null && f15806a != null) {
                f15806a.set(looper);
            }
        }
    }

    public static void b(Thread thread) {
        Looper looper;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec0248da", new Object[]{thread});
            return;
        }
        ThreadLocal<Looper> threadLocal = f15806a;
        if (threadLocal == null || (looper = threadLocal.get()) == null) {
            return;
        }
        synchronized (b) {
            b.put(thread, looper);
            f15806a.remove();
        }
    }
}
