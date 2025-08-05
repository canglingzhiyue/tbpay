package com.taobao.android.dinamicx;

import android.os.Looper;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.s;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import tb.fpy;
import tb.fpz;
import tb.fqi;
import tb.kge;

/* loaded from: classes5.dex */
public class av implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static ThreadLocal<bo> b;

    /* renamed from: a  reason: collision with root package name */
    public DXRuntimeContext f11811a;
    private DXRenderOptions c;

    static {
        kge.a(-1797201837);
        kge.a(-1390502639);
        b = new ThreadLocal<>();
    }

    public av(DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions) {
        this.f11811a = dXRuntimeContext;
        this.c = dXRenderOptions;
    }

    @Override // java.lang.Runnable
    public void run() {
        DXRuntimeContext b2 = b();
        if (b2 == null) {
            return;
        }
        if (u.m() != null && fqi.aI()) {
            u.m().a();
        }
        try {
            Field declaredField = Looper.class.getDeclaredField("sThreadLocal");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(Looper.getMainLooper());
            if (obj instanceof ThreadLocal) {
                ((ThreadLocal) obj).set(Looper.getMainLooper());
            }
            bo boVar = b.get();
            r a2 = a();
            DXEngineConfig c = c();
            if (boVar == null || c.b() != boVar.b().b()) {
                bo boVar2 = new bo(a2, aw.a(a2, DinamicXEngine.i()));
                b.set(boVar2);
                boVar = boVar2;
            }
            b2.a(boVar);
            b2.a(new fpz(b2.m().getApplicationContext()));
            DXButterRootView dXButterRootView = new DXButterRootView(b2.m());
            dXButterRootView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            dXButterRootView.setDxTemplateItem(b2.c());
            if (a2 != null && a2.b() != null) {
                dXButterRootView.setBindingXManagerWeakReference(a2.b().i);
            }
            b2.f11781a.q = new WeakReference<>(dXButterRootView);
            DXResult<DXRootView> a3 = boVar.a(dXButterRootView, b2, -1, this.c);
            if (a3 == null || a3.f11780a == null || !a(b2)) {
                return;
            }
            if (this.c.g() == 4) {
                fpy.a().a(c.c(), b2.V(), a3.f11780a);
            } else {
                fpy.a().b(a3.f11780a, b2.c(), c.c());
            }
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
        }
    }

    private boolean a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("487cd5dd", new Object[]{this, dXRuntimeContext})).booleanValue();
        }
        if (!dXRuntimeContext.o()) {
            return true;
        }
        s n = dXRuntimeContext.n();
        if (n == null || n.c == null || n.c.size() <= 0) {
            return false;
        }
        for (s.a aVar : n.c) {
            boolean z = aVar.d != 100002;
            boolean z2 = aVar.d < 71001 || aVar.d > 710010;
            if (z && z2) {
                return false;
            }
        }
        return true;
    }

    public r a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("a0545cfa", new Object[]{this});
        }
        DXRuntimeContext b2 = b();
        if (b2 != null) {
            return b2.C();
        }
        return null;
    }

    public DXRuntimeContext b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRuntimeContext) ipChange.ipc$dispatch("5391c83e", new Object[]{this}) : this.f11811a;
    }

    public DXEngineConfig c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEngineConfig) ipChange.ipc$dispatch("b27110d0", new Object[]{this});
        }
        r a2 = a();
        if (a2 != null) {
            return a2.a();
        }
        return null;
    }
}
