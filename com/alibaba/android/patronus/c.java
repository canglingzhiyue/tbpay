package com.alibaba.android.patronus;

import android.os.Build;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.webkit.CookieManager;
import com.alibaba.android.patronus.simplecookie.CookieManagerAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes2.dex */
public final class c implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f2408a = "ProviderHandler";
    private final CookieManager b = new CookieManagerAdapter();
    private volatile Object c;
    private volatile Object d;
    private final boolean e;
    private final boolean f;

    public c(Object obj, boolean z, boolean z2) {
        this.c = obj;
        this.f = z;
        this.e = z2;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        UncaughtCrashHeader crashCaughtHeader = TCrashSDK.instance().getCrashCaughtHeader();
        if (this.f && method.getName().equals("getCookieManager")) {
            return this.b;
        }
        if (this.e && method.getName().equals("getStatics")) {
            Log.e("ProviderHandler", "getStatics");
            if (this.d == null) {
                synchronized (this) {
                    if (this.d == null) {
                        this.d = a();
                    }
                }
            }
            return this.d;
        }
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = b();
                }
            }
        }
        crashCaughtHeader.addHeaderInfo("ProviderHandler", method.getName());
        return method.invoke(this.c, objArr);
    }

    private Object a() throws Throwable {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{Class.forName("android.webkit.WebViewFactoryProvider$Statics")}, new d());
    }

    private Object b() throws Throwable {
        Class cls;
        Method method;
        com.taobao.android.boutique.reflection.e a2 = com.taobao.android.boutique.reflection.e.a(Class.forName("android.webkit.WebViewFactory"));
        if (Build.VERSION.SDK_INT <= 22) {
            cls = (Class) a2.c("getFactoryClass").a();
        } else {
            cls = (Class) a2.c("getProviderClass").a();
        }
        if (Build.VERSION.SDK_INT == 21) {
            Object newInstance = cls.newInstance();
            String str = "Loaded provider: " + newInstance;
            return newInstance;
        }
        Class<?> cls2 = Class.forName("android.webkit.WebViewDelegate");
        Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(new Class[0]);
        declaredConstructor.setAccessible(true);
        Object newInstance2 = declaredConstructor.newInstance(new Object[0]);
        if (Build.VERSION.SDK_INT > 25) {
            try {
                method = cls.getMethod("create", cls2);
            } catch (Exception unused) {
                method = null;
            }
            try {
                Object invoke = method.invoke(null, newInstance2);
                String str2 = "Loaded provider: " + invoke;
                return invoke;
            } catch (Exception e) {
                Log.e("ProviderHandler", "error instantiating provider", e);
                throw new AndroidRuntimeException(e);
            }
        }
        return cls.getConstructor(cls2).newInstance(newInstance2);
    }
}
