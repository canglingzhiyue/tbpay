package com.taobao.android.dinamicx;

import android.os.Looper;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.UUID;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class ap implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static ThreadLocal<as> c;

    /* renamed from: a  reason: collision with root package name */
    public DXRuntimeContext f11806a;
    public boolean b;
    public DXRenderOptions d;
    public ab e;
    public WeakReference<View> f;

    public abstract void a();

    static {
        kge.a(625584438);
        kge.a(-1390502639);
        c = new ThreadLocal<>();
    }

    public ap(DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions, r rVar, ab abVar, View view) {
        this.f11806a = dXRuntimeContext;
        this.d = dXRenderOptions;
        this.e = abVar;
        this.f = new WeakReference<>(view);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Field declaredField = Looper.class.getDeclaredField("sThreadLocal");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(Looper.getMainLooper());
            if (obj instanceof ThreadLocal) {
                ((ThreadLocal) obj).set(Looper.getMainLooper());
            }
            a();
        } catch (Throwable unused) {
        }
    }

    public as b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (as) ipChange.ipc$dispatch("de7641d7", new Object[]{this});
        }
        as asVar = c.get();
        r c2 = c();
        DXEngineConfig d = d();
        if (asVar != null && d.b() == asVar.b().b()) {
            return asVar;
        }
        as asVar2 = new as(c2, 3, UUID.randomUUID().toString());
        c.set(asVar2);
        return asVar2;
    }

    public r c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (r) ipChange.ipc$dispatch("6e05dc7c", new Object[]{this}) : this.f11806a.C();
    }

    public DXEngineConfig d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEngineConfig) ipChange.ipc$dispatch("ec3bb2af", new Object[]{this});
        }
        r c2 = c();
        if (c2 != null) {
            return c2.a();
        }
        return null;
    }
}
