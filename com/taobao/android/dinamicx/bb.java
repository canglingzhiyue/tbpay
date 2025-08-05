package com.taobao.android.dinamicx;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.cb;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.fuw;
import tb.fxe;
import tb.kge;

/* loaded from: classes.dex */
public class bb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<Class, cb.a<View>> f11821a = new ConcurrentHashMap(30);
    private final int b = 20;

    static {
        kge.a(-1670171268);
    }

    public void a(int i, Class cls, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("667d3890", new Object[]{this, new Integer(i), cls, view});
            return;
        }
        try {
            cb.a<View> aVar = this.f11821a.get(cls);
            if (aVar == null) {
                if (i > 200) {
                    i = 200;
                } else if (i < 20) {
                    i = 20;
                }
                aVar = new cb.c<>(i);
                this.f11821a.put(cls, aVar);
            }
            aVar.a(view);
        } catch (Exception e) {
            if (DinamicXEngine.j()) {
                fuw.d("shandian", cls + " 发生异常 " + view.hashCode());
            }
            com.taobao.android.dinamicx.exception.a.b(e);
        }
    }

    public View a(DXRuntimeContext dXRuntimeContext, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3fcf4dc6", new Object[]{this, dXRuntimeContext, cls});
        }
        View view = null;
        if (dXRuntimeContext != null && dXRuntimeContext.C() != null && dXRuntimeContext.d() != null && dXRuntimeContext.C().l()) {
            cb.a<View> aVar = this.f11821a.get(cls);
            if (aVar == null) {
                if (dXRuntimeContext.d().supportReuse() && dXRuntimeContext.d().reusePoolMaxSize() > 0) {
                    fxe.i(new b(dXRuntimeContext, cls));
                }
                return null;
            }
            view = aVar.a();
            if ((view == null || aVar.b() == 0) && dXRuntimeContext.d().supportReuse() && dXRuntimeContext.d().reusePoolMaxSize() > 0) {
                fxe.i(new b(dXRuntimeContext, cls));
            }
        }
        return view;
    }

    /* loaded from: classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<DXRuntimeContext> f11822a;
        public Class b;

        static {
            kge.a(-1328872574);
            kge.a(-1390502639);
        }

        public b(DXRuntimeContext dXRuntimeContext, Class cls) {
            this.f11822a = new WeakReference<>(dXRuntimeContext);
            this.b = cls;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (this.f11822a.get() != null && this.f11822a.get().m() != null && this.f11822a.get().d() != null) {
                    int reusePoolMaxSize = this.f11822a.get().d().reusePoolMaxSize();
                    int min = Math.min(10, reusePoolMaxSize);
                    for (int i = 0; i < min; i++) {
                        if (this.f11822a.get() != null && this.f11822a.get().m() != null && this.f11822a.get().d() != null) {
                            bb.this.a(reusePoolMaxSize, this.b, this.f11822a.get().d()._createViewOnlyForCache(this.f11822a.get().m()));
                        }
                        return;
                    }
                }
            } catch (Throwable th) {
                com.taobao.android.dinamicx.exception.a.b(th);
            }
        }
    }
}
