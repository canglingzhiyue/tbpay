package com.taobao.alimama.api;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG_TAG = "api_framework";

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, Object> f8398a = new HashMap();

    /* renamed from: com.taobao.alimama.api.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0323a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final a f8399a;

        static {
            kge.a(-1951529860);
            f8399a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("ab32ffcd", new Object[0]) : f8399a;
        }
    }

    static {
        kge.a(-525940663);
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        com.taobao.alimama.api.plugin.a.b().a(context.getApplicationContext());
        b.b().a();
    }

    public <T> T a(Class<T> cls) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("bd4d3fd", new Object[]{this, cls});
        }
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("only accept interface: " + cls);
        }
        synchronized (this.f8398a) {
            t = (T) this.f8398a.get(cls);
            if (t == null) {
                t = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new c());
                this.f8398a.put(cls, t);
            }
        }
        return t;
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("ab32ffcd", new Object[0]) : C0323a.a();
    }
}
