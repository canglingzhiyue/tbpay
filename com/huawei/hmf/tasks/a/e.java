package com.huawei.hmf.tasks.a;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import tb.cxn;
import tb.cxo;
import tb.cxp;
import tb.cxq;
import tb.cxr;
import tb.cxt;

/* loaded from: classes4.dex */
public final class e<TResult> extends cxr<TResult> {
    private boolean b;
    private volatile boolean c;
    private TResult d;
    private Exception e;

    /* renamed from: a  reason: collision with root package name */
    private final Object f7308a = new Object();
    private List<cxn<TResult>> f = new ArrayList();

    private cxr<TResult> a(cxn<TResult> cxnVar) {
        boolean a2;
        synchronized (this.f7308a) {
            a2 = a();
            if (!a2) {
                this.f.add(cxnVar);
            }
        }
        if (a2) {
            cxnVar.a(this);
        }
        return this;
    }

    private void g() {
        synchronized (this.f7308a) {
            for (cxn<TResult> cxnVar : this.f) {
                try {
                    cxnVar.a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f = null;
        }
    }

    @Override // tb.cxr
    public final cxr<TResult> a(Executor executor, cxo<TResult> cxoVar) {
        return a((cxn) new b(executor, cxoVar));
    }

    public final cxr<TResult> a(Executor executor, cxp cxpVar) {
        return a((cxn) new c(executor, cxpVar));
    }

    public final cxr<TResult> a(Executor executor, cxq<TResult> cxqVar) {
        return a((cxn) new d(executor, cxqVar));
    }

    @Override // tb.cxr
    public final cxr<TResult> a(cxo<TResult> cxoVar) {
        return a(cxt.a(), cxoVar);
    }

    @Override // tb.cxr
    public final cxr<TResult> a(cxp cxpVar) {
        return a(cxt.a(), cxpVar);
    }

    @Override // tb.cxr
    public final cxr<TResult> a(cxq<TResult> cxqVar) {
        return a(cxt.a(), cxqVar);
    }

    public final void a(Exception exc) {
        synchronized (this.f7308a) {
            if (this.b) {
                return;
            }
            this.b = true;
            this.e = exc;
            this.f7308a.notifyAll();
            g();
        }
    }

    public final void a(TResult tresult) {
        synchronized (this.f7308a) {
            if (this.b) {
                return;
            }
            this.b = true;
            this.d = tresult;
            this.f7308a.notifyAll();
            g();
        }
    }

    @Override // tb.cxr
    public final boolean a() {
        boolean z;
        synchronized (this.f7308a) {
            z = this.b;
        }
        return z;
    }

    @Override // tb.cxr
    public final boolean b() {
        boolean z;
        synchronized (this.f7308a) {
            z = this.b && !c() && this.e == null;
        }
        return z;
    }

    @Override // tb.cxr
    public final boolean c() {
        return this.c;
    }

    @Override // tb.cxr
    public final TResult d() {
        TResult tresult;
        synchronized (this.f7308a) {
            if (this.e != null) {
                throw new RuntimeException(this.e);
            }
            tresult = this.d;
        }
        return tresult;
    }

    @Override // tb.cxr
    public final Exception e() {
        Exception exc;
        synchronized (this.f7308a) {
            exc = this.e;
        }
        return exc;
    }

    public final boolean f() {
        synchronized (this.f7308a) {
            if (this.b) {
                return false;
            }
            this.b = true;
            this.c = true;
            this.f7308a.notifyAll();
            g();
            return true;
        }
    }
}
