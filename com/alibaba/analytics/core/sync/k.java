package com.alibaba.analytics.core.sync;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import java.lang.reflect.Method;
import tb.aob;
import tb.apr;
import tb.kge;
import tb.rpw;
import tb.rpy;
import tb.rqa;

/* loaded from: classes.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile k f2104a;
    private Object b = null;
    private Object c = null;
    private Method d = null;
    private Object e = null;
    private Method f = null;
    private Method g = null;
    private boolean h = false;
    private String i = "";

    static {
        kge.a(1858645827);
    }

    private k() {
    }

    public static k a() {
        k kVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("165ef9dc", new Object[0]);
        }
        if (f2104a == null) {
            synchronized (k.class) {
                if (f2104a == null) {
                    k kVar2 = new k();
                    f2104a = kVar2;
                    kVar2.c();
                }
                kVar = f2104a;
            }
            return kVar;
        }
        return f2104a;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        apr.a("", "mInitSecurityCheck", Boolean.valueOf(this.h));
        return this.h;
    }

    private synchronized void c() {
        apr.b();
        rpw n = aob.a().n();
        if (n instanceof rpy) {
            this.h = false;
        }
        if (n != null) {
            Class<?> cls = Class.forName(OConstant.REFLECT_SECURITYGUARD);
            Class<?> cls2 = Class.forName("com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent");
            Class<?> cls3 = Class.forName("com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent");
            if (n instanceof rqa) {
                this.i = ((rqa) n).getAuthcode();
            }
            if (cls != null && cls2 != null && cls3 != null) {
                this.b = cls.getMethod("getInstance", Context.class).invoke(null, aob.a().k());
                this.c = cls.getMethod("getStaticDataEncryptComp", new Class[0]).invoke(this.b, new Object[0]);
                this.e = cls.getMethod("getDynamicDataStoreComp", new Class[0]).invoke(this.b, new Object[0]);
                this.d = cls2.getMethod("staticBinarySafeDecryptNoB64", Integer.TYPE, String.class, byte[].class, String.class);
                this.f = cls3.getMethod("putByteArray", String.class, byte[].class);
                this.g = cls3.getMethod("getByteArray", String.class);
                this.h = true;
                return;
            }
            this.h = false;
        }
    }

    public byte[] a(int i, String str, byte[] bArr) {
        Object obj;
        Method method = this.d;
        if (method != null && (obj = this.c) != null) {
            try {
                Object invoke = method.invoke(obj, Integer.valueOf(i), str, bArr, this.i);
                apr.d("", "mStaticDataEncryptCompObj", this.c, q.MSGTYPE_INTERVAL, Integer.valueOf(i), "str", str, "bArr", bArr, "authcode", this.i, "obj", invoke);
                if (invoke != null) {
                    return (byte[]) invoke;
                }
                return null;
            } catch (Throwable th) {
                apr.b(null, th, new Object[0]);
            }
        }
        return null;
    }

    public int a(String str, byte[] bArr) {
        Object obj;
        Method method = this.f;
        if (method == null || (obj = this.e) == null) {
            return 0;
        }
        try {
            Object invoke = method.invoke(obj, str, bArr);
            if (invoke == null) {
                return 0;
            }
            int intValue = ((Integer) invoke).intValue();
            apr.b("", com.taobao.mtop.wvplugin.a.RESULT_KEY, Integer.valueOf(intValue));
            return intValue;
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
            return -1;
        }
    }

    public byte[] a(String str) {
        Object obj;
        Method method = this.g;
        if (method != null && (obj = this.e) != null) {
            try {
                Object invoke = method.invoke(obj, str);
                if (invoke != null) {
                    return (byte[]) invoke;
                }
                return null;
            } catch (Throwable th) {
                apr.b(null, th, new Object[0]);
            }
        }
        return null;
    }
}
