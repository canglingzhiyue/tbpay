package com.alibaba.android.split.core.tasks;

import com.alibaba.android.split.core.internal.ObjectInvoker;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;
import tb.kge;

/* loaded from: classes.dex */
public final class i<TResult> extends h<TResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Object f2483a = new Object();
    private k<TResult> b = new k<>();
    private boolean c;
    private TResult d;
    private Exception e;

    static {
        kge.a(2025832017);
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.split.core.tasks.h
    public final boolean a() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        synchronized (this.f2483a) {
            z = this.c;
        }
        return z;
    }

    @Override // com.alibaba.android.split.core.tasks.h
    public final boolean b() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        synchronized (this.f2483a) {
            if (this.c && this.e == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.alibaba.android.split.core.tasks.h
    public final TResult c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TResult) ipChange.ipc$dispatch("ca3f7d08", new Object[]{this});
        }
        synchronized (this.f2483a) {
            e();
            if (this.e != null) {
                return null;
            }
            return this.d;
        }
    }

    @Override // com.alibaba.android.split.core.tasks.h
    public final Exception d() {
        Exception exc;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Exception) ipChange.ipc$dispatch("c887cf21", new Object[]{this});
        }
        synchronized (this.f2483a) {
            exc = this.e;
        }
        return exc;
    }

    @Override // com.alibaba.android.split.core.tasks.h
    public final h<TResult> a(e<TResult> eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("2896b8ab", new Object[]{this, eVar}) : a(l.MAIN_THREAD, eVar);
    }

    public final h<TResult> a(Executor executor, e<TResult> eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("7ca4a7a5", new Object[]{this, executor, eVar});
        }
        this.b.a(new g(executor, eVar));
        g();
        return this;
    }

    @Override // com.alibaba.android.split.core.tasks.h
    public final h<TResult> a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("435549ea", new Object[]{this, dVar}) : a(l.MAIN_THREAD, dVar);
    }

    public final h<TResult> a(Executor executor, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("976338e4", new Object[]{this, executor, dVar});
        }
        this.b.a(new c(executor, dVar));
        g();
        return this;
    }

    @Override // com.alibaba.android.split.core.tasks.h
    public final h<TResult> a(q<TResult> qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("e7a7e9b7", new Object[]{this, qVar}) : a(l.MAIN_THREAD, qVar);
    }

    public final h<TResult> a(Executor executor, q<TResult> qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("3bb5d8b1", new Object[]{this, executor, qVar});
        }
        this.b.a(new p(executor, qVar));
        g();
        return this;
    }

    public final boolean b(TResult tresult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f056ab89", new Object[]{this, tresult})).booleanValue();
        }
        synchronized (this.f2483a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.d = tresult;
            this.b.a(this);
            return true;
        }
    }

    public final boolean a(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd91d322", new Object[]{this, exc})).booleanValue();
        }
        ObjectInvoker.notNull(exc, "Exception must not be null");
        synchronized (this.f2483a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.e = exc;
            this.b.a(this);
            return true;
        }
    }

    private final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            ObjectInvoker.notFalse(this.c, "Task is not yet complete");
        }
    }

    private final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        synchronized (this.f2483a) {
            if (!this.c) {
                return;
            }
            this.b.a(this);
        }
    }
}
