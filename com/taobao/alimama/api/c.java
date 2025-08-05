package com.taobao.alimama.api;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.mto;

/* loaded from: classes4.dex */
public class c implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1812283981);
        kge.a(16938580);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8a05e524", new Object[]{this, obj, method, objArr});
        }
        d dVar = new d();
        dVar.a(objArr);
        dVar.a(method);
        return a.a(method.getReturnType(), b.b().a(dVar));
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final Map<Class, Object> f8402a;

        public static /* synthetic */ Object a(Class cls, Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("3d0f9ae1", new Object[]{cls, obj}) : b(cls, obj);
        }

        static {
            kge.a(1594314045);
            HashMap hashMap = new HashMap(7);
            f8402a = hashMap;
            hashMap.put(Integer.TYPE, 0);
            f8402a.put(Long.TYPE, 0L);
            f8402a.put(Boolean.TYPE, false);
            f8402a.put(Byte.TYPE, (byte) 0);
            f8402a.put(Float.TYPE, Float.valueOf(0.0f));
            f8402a.put(Double.TYPE, Double.valueOf((double) mto.a.GEO_NOT_SUPPORT));
            f8402a.put(Character.TYPE, (char) 0);
        }

        private static Object b(Class cls, Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("62a3a3e2", new Object[]{cls, obj}) : (obj != null || !f8402a.containsKey(cls)) ? obj : f8402a.get(cls);
        }
    }
}
