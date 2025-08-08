package com.taobao.android.dinamicx;

import android.content.Context;
import android.os.Trace;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import java.lang.ref.WeakReference;
import tb.fpv;
import tb.fpx;
import tb.fpy;
import tb.fpz;
import tb.fqi;
import tb.fxe;
import tb.fzm;
import tb.kge;

/* loaded from: classes.dex */
public class ac extends fpx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DXPreRenderWorkTask";
    private final fpv<DXResult<DXRootView>> j;

    static {
        kge.a(1600951432);
    }

    public static /* synthetic */ Object ipc$super(ac acVar, String str, Object... objArr) {
        if (str.hashCode() == 1548812690) {
            super.run();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ fpv a(ac acVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fpv) ipChange.ipc$dispatch("bb3ae118", new Object[]{acVar}) : acVar.j;
    }

    public ac(DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions, aw awVar, ab abVar, r rVar, fzm fzmVar) {
        this(dXRuntimeContext, dXRenderOptions, awVar, abVar, rVar, fzmVar, null);
    }

    public ac(DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions, aw awVar, ab abVar, r rVar, fzm fzmVar, fpv<DXResult<DXRootView>> fpvVar) {
        super(dXRuntimeContext, dXRenderOptions, awVar, abVar, rVar, fzmVar);
        this.j = fpvVar;
    }

    @Override // tb.fpx, java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        if (u.p != null && fqi.aI()) {
            u.p.a();
        }
        final DXRuntimeContext c = c();
        if (c == null) {
            return;
        }
        try {
            Trace.beginSection("dx_prerender_" + c.K());
            super.run();
            r a2 = a();
            DXEngineConfig b = b();
            am a3 = a(b, a2);
            c.a(new WeakReference<>(a3));
            c.L().h = new WeakReference<>(new fpz(c.m().getApplicationContext()));
            DXRootView dXRootView = new DXRootView(c.m());
            dXRootView.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
            dXRootView.dxTemplateItem = c.c();
            if (a2 != null && a2.b() != null) {
                dXRootView.setBindingXManagerWeakReference(a2.b().i);
            }
            c.f11781a.q = new WeakReference<>(dXRootView);
            final DXResult<DXRootView> a4 = a3.a(dXRootView, c, -1, this.g);
            this.h = true;
            if (a4 != null && a4.f11780a != null) {
                fpy.a().a(a4.f11780a, c.c(), b.f11775a);
                if (this.j != null) {
                    if (c.o()) {
                        fxe.c(new Runnable() { // from class: com.taobao.android.dinamicx.ac.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    ac.a(ac.this).a(c, null);
                                }
                            }
                        });
                    } else {
                        fxe.c(new Runnable() { // from class: com.taobao.android.dinamicx.ac.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    ac.a(ac.this).a(a4);
                                }
                            }
                        });
                    }
                }
            }
        } catch (Throwable th) {
            if (c != null) {
                try {
                    if (!StringUtils.isEmpty(c.L().d)) {
                        com.taobao.android.dinamicx.monitor.b.a(c.L().d, c.c(), DXMonitorConstant.DX_MONITOR_ASYNC_RENDER, DXMonitorConstant.PRE_RENDER_3_0_CRASH, s.V3_PRE_RENDER_CRASH, com.taobao.android.dinamicx.exception.a.a(th));
                    }
                } finally {
                    Trace.endSection();
                }
            }
            com.taobao.android.dinamicx.exception.a.b(th);
            this.i = true;
            if (this.j != null) {
                fxe.c(new Runnable() { // from class: com.taobao.android.dinamicx.ac.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            ac.a(ac.this).a(c, th);
                        }
                    }
                });
            }
        }
    }

    @Override // tb.fpx
    public aw a(r rVar, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aw) ipChange.ipc$dispatch("927ee5ce", new Object[]{this, rVar, context}) : new aw(rVar, context);
    }

    @Override // tb.fpx
    public am a(r rVar, aw awVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (am) ipChange.ipc$dispatch("4a569a26", new Object[]{this, rVar, awVar});
        }
        if (bx.p()) {
            return new at(rVar, awVar);
        }
        return new am(rVar, awVar);
    }
}
