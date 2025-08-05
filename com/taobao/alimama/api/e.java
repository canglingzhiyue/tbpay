package com.taobao.alimama.api;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, a> f8406a = new HashMap();

    static {
        kge.a(1948118880);
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, Method> f8407a = new HashMap();
        private AbsServiceImpl b;

        static {
            kge.a(-108053167);
        }

        public a(Class<?> cls, Class<? extends AbsServiceImpl> cls2) {
            Method[] declaredMethods;
            for (Method method : cls.getDeclaredMethods()) {
                this.f8407a.put(d.b(method), method);
            }
            try {
                this.b = cls2.newInstance();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        public Object a(d dVar) throws Throwable {
            return this.f8407a.get(dVar.b()).invoke(this.b, dVar.c());
        }
    }

    public e() {
        for (Map.Entry<Class<?>, Class<? extends AbsServiceImpl>> entry : com.taobao.alimama.api.plugin.a.b().a().entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
        String str = "register service completed, count=" + this.f8406a.size();
    }

    private void a(Class<?> cls, Class<? extends AbsServiceImpl> cls2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f9b1408", new Object[]{this, cls, cls2});
            return;
        }
        String str = "build service, service=" + cls.getSimpleName() + ", impl=" + cls2.getCanonicalName();
        this.f8406a.put(cls.getSimpleName(), new a(cls, cls2));
    }

    public Object a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("31dd1e0e", new Object[]{this, dVar});
        }
        a aVar = this.f8406a.get(dVar.a());
        if (aVar == null) {
            Log.e(com.taobao.alimama.api.a.LOG_TAG, "service not found, transaction= " + dVar);
            return null;
        }
        try {
            String str = "execute transaction " + dVar;
            return aVar.a(dVar);
        } catch (Throwable th) {
            th.printStackTrace();
            Log.e(com.taobao.alimama.api.a.LOG_TAG, "execute " + dVar + " error", th);
            return null;
        }
    }
}
