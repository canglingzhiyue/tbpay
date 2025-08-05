package com.xiaomi.push;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class as implements ar, InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    private static final String[][] f24357a = {new String[]{"com.bun.supplier.IIdentifierListener", "com.bun.supplier.IdSupplier"}, new String[]{"com.bun.miitmdid.core.IIdentifierListener", "com.bun.miitmdid.supplier.IdSupplier"}};

    /* renamed from: a  reason: collision with other field name */
    private Context f110a;

    /* renamed from: a  reason: collision with other field name */
    private Class f112a = null;
    private Class b = null;

    /* renamed from: a  reason: collision with other field name */
    private Method f114a = null;

    /* renamed from: b  reason: collision with other field name */
    private Method f115b = null;
    private Method c = null;
    private Method d = null;
    private Method e = null;
    private Method f = null;
    private Method g = null;

    /* renamed from: a  reason: collision with other field name */
    private final Object f113a = new Object();

    /* renamed from: a  reason: collision with other field name */
    private volatile int f108a = 0;

    /* renamed from: a  reason: collision with other field name */
    private volatile long f109a = 0;

    /* renamed from: a  reason: collision with other field name */
    private volatile a f111a = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public class a {

        /* renamed from: a  reason: collision with other field name */
        Boolean f116a;

        /* renamed from: a  reason: collision with other field name */
        String f117a;
        String b;
        String c;
        String d;

        private a() {
            this.f116a = null;
            this.f117a = null;
            this.b = null;
            this.c = null;
            this.d = null;
        }

        boolean a() {
            if (!TextUtils.isEmpty(this.f117a) || !TextUtils.isEmpty(this.b) || !TextUtils.isEmpty(this.c) || !TextUtils.isEmpty(this.d)) {
                this.f116a = true;
            }
            return this.f116a != null;
        }
    }

    public as(Context context) {
        this.f110a = context.getApplicationContext();
        a(context);
        b(context);
    }

    private static Class<?> a(Context context, String str) {
        try {
            return r.a(context, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static <T> T a(Method method, Object obj, Object... objArr) {
        if (method != null) {
            try {
                T t = (T) method.invoke(obj, objArr);
                if (t == null) {
                    return null;
                }
                return t;
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    private static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        if (cls != null) {
            try {
                return cls.getMethod(str, clsArr);
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    private void a() {
        synchronized (this.f113a) {
            try {
                this.f113a.notifyAll();
            } catch (Exception unused) {
            }
        }
    }

    private void a(Context context) {
        Class<?> a2 = a(context, "com.bun.miitmdid.core.MdidSdk");
        Class<?> cls = null;
        Class<?> cls2 = null;
        int i = 0;
        while (true) {
            String[][] strArr = f24357a;
            if (i >= strArr.length) {
                break;
            }
            String[] strArr2 = strArr[i];
            Class<?> a3 = a(context, strArr2[0]);
            Class<?> a4 = a(context, strArr2[1]);
            if (a3 != null && a4 != null) {
                b("found class in index " + i);
                cls2 = a4;
                cls = a3;
                break;
            }
            i++;
            cls2 = a4;
            cls = a3;
        }
        this.f112a = a2;
        this.f114a = a(a2, "InitSdk", Context.class, cls);
        this.b = cls;
        this.c = a(cls2, "getOAID", new Class[0]);
        this.f = a(cls2, "isSupported", new Class[0]);
        this.g = a(cls2, "shutDown", new Class[0]);
    }

    private void a(String str) {
        if (this.f111a != null) {
            return;
        }
        long j = this.f109a;
        long elapsedRealtime = SystemClock.elapsedRealtime() - Math.abs(j);
        int i = this.f108a;
        if (elapsedRealtime > 3000 && i < 3) {
            synchronized (this.f113a) {
                if (this.f109a == j && this.f108a == i) {
                    b("retry, current count is " + i);
                    this.f108a = this.f108a + 1;
                    b(this.f110a);
                    j = this.f109a;
                    elapsedRealtime = SystemClock.elapsedRealtime() - Math.abs(j);
                }
            }
        }
        if (this.f111a != null || j < 0 || elapsedRealtime > 3000 || Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        synchronized (this.f113a) {
            if (this.f111a == null) {
                try {
                    b(str + " wait...");
                    this.f113a.wait(3000L);
                } catch (Exception unused) {
                }
            }
        }
    }

    private static boolean a(Object obj) {
        return (obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Double);
    }

    private void b(Context context) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = -elapsedRealtime;
        Class cls = this.b;
        if (cls != null) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    classLoader = context.getClassLoader();
                }
                a(this.f114a, this.f112a.newInstance(), context, Proxy.newProxyInstance(classLoader, new Class[]{this.b}, this));
            } catch (Throwable th) {
                b("call init sdk error:" + th);
            }
            this.f109a = elapsedRealtime;
        }
        elapsedRealtime = j;
        this.f109a = elapsedRealtime;
    }

    private static void b(String str) {
        com.xiaomi.channel.commonutils.logger.b.m1616a("mdid:" + str);
    }

    @Override // com.xiaomi.push.ar
    /* renamed from: a */
    public String mo1730a() {
        a("getOAID");
        if (this.f111a == null) {
            return null;
        }
        return this.f111a.b;
    }

    @Override // com.xiaomi.push.ar
    /* renamed from: a  reason: collision with other method in class */
    public boolean mo1730a() {
        a("isSupported");
        return this.f111a != null && Boolean.TRUE.equals(this.f111a.f116a);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        this.f109a = SystemClock.elapsedRealtime();
        if (objArr != null) {
            a aVar = new a();
            int length = objArr.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Object obj2 = objArr[i];
                if (obj2 != null && !a(obj2)) {
                    aVar.b = (String) a(this.c, obj2, new Object[0]);
                    aVar.f116a = (Boolean) a(this.f, obj2, new Object[0]);
                    a(this.g, obj2, new Object[0]);
                    if (aVar.a()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("has get succ, check duplicate:");
                        if (this.f111a != null) {
                            z = true;
                        }
                        sb.append(z);
                        b(sb.toString());
                        synchronized (as.class) {
                            if (this.f111a == null) {
                                this.f111a = aVar;
                            }
                        }
                    }
                }
                i++;
            }
        }
        a();
        return null;
    }
}
