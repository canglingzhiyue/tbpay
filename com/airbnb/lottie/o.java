package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import tb.akh;

/* loaded from: classes2.dex */
public class o<T> {

    /* renamed from: a */
    public static Executor f1784a = Executors.newCachedThreadPool();
    private final Set<j<T>> b;
    private final Set<j<Throwable>> c;
    private final Handler d;
    private volatile n<T> e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class a extends FutureTask<n<T>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Callable<n<T>> callable) {
            super(callable);
            o.this = r1;
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (isCancelled()) {
                return;
            }
            try {
                o.this.a((n) get());
            } catch (InterruptedException | ExecutionException e) {
                o.this.a(new n(e));
            }
        }
    }

    public o(Callable<n<T>> callable) {
        this(callable, false);
    }

    public o(Callable<n<T>> callable, boolean z) {
        this.b = new LinkedHashSet(1);
        this.c = new LinkedHashSet(1);
        this.d = new Handler(Looper.getMainLooper());
        this.e = null;
        if (!z) {
            f1784a.execute(new a(callable));
            return;
        }
        try {
            a((n) callable.call());
        } catch (Throwable th) {
            a((n) new n<>(th));
        }
    }

    private void a() {
        this.d.post(new Runnable() { // from class: com.airbnb.lottie.-$$Lambda$o$OML0x41MzrBxIUEw9k1pQVSKR6A
            {
                o.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                o.lambda$OML0x41MzrBxIUEw9k1pQVSKR6A(o.this);
            }
        });
    }

    public void a(n<T> nVar) {
        if (this.e != null) {
            akh.c("A task may only be set once.");
            return;
        }
        this.e = nVar;
        a();
    }

    private synchronized void a(T t) {
        for (j jVar : new ArrayList(this.b)) {
            jVar.onResult(t);
        }
    }

    private synchronized void a(Throwable th) {
        ArrayList<j> arrayList = new ArrayList(this.c);
        if (arrayList.isEmpty()) {
            akh.b("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        for (j jVar : arrayList) {
            jVar.onResult(th);
        }
    }

    public /* synthetic */ void b() {
        n<T> nVar = this.e;
        if (nVar == null) {
            return;
        }
        if (nVar.a() != null) {
            a((o<T>) nVar.a());
        } else {
            a(nVar.b());
        }
    }

    public static /* synthetic */ void lambda$OML0x41MzrBxIUEw9k1pQVSKR6A(o oVar) {
        oVar.b();
    }

    public synchronized o<T> a(j<T> jVar) {
        n<T> nVar = this.e;
        if (nVar != null && nVar.a() != null) {
            jVar.onResult(nVar.a());
        }
        this.b.add(jVar);
        return this;
    }

    public synchronized o<T> b(j<T> jVar) {
        this.b.remove(jVar);
        return this;
    }

    public synchronized o<T> c(j<Throwable> jVar) {
        n<T> nVar = this.e;
        if (nVar != null && nVar.b() != null) {
            jVar.onResult(nVar.b());
        }
        this.c.add(jVar);
        return this;
    }

    public synchronized o<T> d(j<Throwable> jVar) {
        this.c.remove(jVar);
        return this;
    }
}
