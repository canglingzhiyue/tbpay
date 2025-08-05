package com.taobao.android.dinamicx;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.fpv;
import tb.fpw;
import tb.fpx;
import tb.fxe;
import tb.fzm;
import tb.kge;

/* loaded from: classes5.dex */
public class ad extends fpx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final fpv<Void> j;

    static {
        kge.a(-1190933149);
    }

    public static /* synthetic */ Object ipc$super(ad adVar, String str, Object... objArr) {
        if (str.hashCode() == 1548812690) {
            super.run();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ fpv a(ad adVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fpv) ipChange.ipc$dispatch("501f93d9", new Object[]{adVar}) : adVar.j;
    }

    public ad(DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions, aw awVar, ab abVar, r rVar, fzm fzmVar) {
        this(dXRuntimeContext, dXRenderOptions, awVar, abVar, rVar, fzmVar, null);
    }

    public ad(DXRuntimeContext dXRuntimeContext, DXRenderOptions dXRenderOptions, aw awVar, ab abVar, r rVar, fzm fzmVar, fpv<Void> fpvVar) {
        super(dXRuntimeContext, dXRenderOptions, awVar, abVar, rVar, fzmVar);
        this.j = fpvVar;
    }

    @Override // tb.fpx, java.lang.Runnable
    public void run() {
        fpw q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        final DXRuntimeContext c = c();
        if (c == null) {
            return;
        }
        super.run();
        try {
            Thread.currentThread();
            r a2 = a();
            DXEngineConfig b = b();
            if (b == null) {
                return;
            }
            am a3 = a(b, a2);
            DinamicXEngine.j();
            c.a(new WeakReference<>(a3));
            a3.a(null, null, null, c, this.g);
            this.h = true;
            if (a2 != null && a2.a() != null && a2.a().u()) {
                fpw q2 = a2.b().q();
                if (q2 != null && c != null) {
                    q2.f(c);
                }
            } else if (a2 != null && a2.a() != null && (q = a2.b().q()) != null && c != null) {
                q.k(c);
            }
            if (this.j == null) {
                return;
            }
            if (c.o()) {
                fxe.c(new Runnable() { // from class: com.taobao.android.dinamicx.ad.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            ad.a(ad.this).a(c, null);
                        }
                    }
                });
            } else {
                fxe.c(new Runnable() { // from class: com.taobao.android.dinamicx.ad.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            ad.a(ad.this).a(null);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
            this.i = true;
            if (this.j == null) {
                return;
            }
            fxe.c(new Runnable() { // from class: com.taobao.android.dinamicx.ad.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ad.a(ad.this).a(c, th);
                    }
                }
            });
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
