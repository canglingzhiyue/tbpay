package com.uc.webview.base.task;

import android.os.SystemClock;
import com.uc.webview.base.ErrorCode;
import com.uc.webview.base.Log;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.timing.TraceEvent;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public abstract class c implements Callable<C1036c> {
    private final C1036c c = new C1036c();

    /* renamed from: a  reason: collision with root package name */
    public b f23798a = null;
    private a d = null;
    public boolean b = true;
    private AtomicBoolean e = new AtomicBoolean(false);

    /* loaded from: classes9.dex */
    public static final class a extends FutureTask<C1036c> {
        public a(c cVar) {
            super(cVar);
        }
    }

    /* loaded from: classes9.dex */
    public static class b {
        public void a() {
        }

        public void a(UCKnownException uCKnownException) {
        }
    }

    /* renamed from: com.uc.webview.base.task.c$c  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C1036c {

        /* renamed from: a  reason: collision with root package name */
        public long f23799a = System.currentTimeMillis();
        public long b = 0;
        public long c = 0;
        public long d = 0;
        public long e = 0;
        public UCKnownException f = null;
    }

    public static void a(String str, Runnable runnable, b bVar) {
        a(str, runnable, bVar, 0L);
    }

    public static void a(final String str, final Runnable runnable, b bVar, long j) {
        c cVar = new c() { // from class: com.uc.webview.base.task.c.1
            @Override // com.uc.webview.base.task.c, java.util.concurrent.Callable
            public final /* synthetic */ C1036c call() throws Exception {
                return super.call();
            }

            @Override // com.uc.webview.base.task.c
            protected final void d() {
                runnable.run();
            }

            @Override // com.uc.webview.base.task.c
            protected final String e() {
                return str;
            }
        };
        if (bVar != null) {
            cVar.f23798a = bVar;
        }
        if (j > 0) {
            cVar.b = true;
            cVar.a(j);
            return;
        }
        cVar.b = true;
        cVar.a();
    }

    public c a() {
        return a(0L);
    }

    public final c a(long j) {
        if (this.b) {
            this.d = d.a(this, j);
        } else {
            Throwable th = null;
            try {
                call();
            } catch (Throwable th2) {
                th = th2;
            }
            if (this.c.f == null && th != null) {
                this.c.f = new UCKnownException(th);
            }
            if (this.c.f != null) {
                throw this.c.f;
            }
        }
        return this;
    }

    public final void b() throws UCKnownException {
        UCKnownException uCKnownException;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = this.e.get();
        try {
            try {
                if (this.d != null) {
                    this.d.get();
                }
                if (!z) {
                    String e = e();
                    Log.d(e, "waitForFinished cost:" + (System.currentTimeMillis() - currentTimeMillis));
                }
                uCKnownException = null;
            } finally {
                if (!z) {
                    String e2 = e();
                    Log.d(e2, "waitForFinished cost:" + (System.currentTimeMillis() - currentTimeMillis));
                }
            }
        } catch (UCKnownException e3) {
            uCKnownException = e3;
        }
        if (this.c.f == null) {
            this.c.f = uCKnownException;
        } else {
            Log.w(e(), "waitForFinished failed", uCKnownException);
        }
        if (this.c.f == null) {
            return;
        }
        throw this.c.f;
    }

    public final String c() {
        return e();
    }

    protected abstract void d();

    protected abstract String e();

    protected int f() {
        return -1;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: g */
    public final C1036c call() throws Exception {
        this.c.b = System.currentTimeMillis();
        this.c.c = SystemClock.currentThreadTimeMillis();
        Log.i(e(), "onStart");
        try {
            TraceEvent scoped = f() != -1 ? TraceEvent.scoped(f()) : TraceEvent.scoped(e());
            d();
            if (scoped != null) {
                scoped.close();
            }
        } catch (UCKnownException e) {
            this.c.f = e;
        } catch (Throwable th) {
            this.c.f = new UCKnownException(th);
        }
        boolean z = this.c.f == null;
        this.c.d = System.currentTimeMillis();
        this.c.e = SystemClock.currentThreadTimeMillis();
        this.e.set(true);
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "onSuccess" : "onFailed");
        sb.append(" wait:");
        sb.append(this.c.b - this.c.f23799a);
        sb.append(", run:");
        sb.append(this.c.d - this.c.b);
        sb.append("/");
        sb.append(this.c.e - this.c.c);
        String sb2 = sb.toString();
        if (z) {
            Log.i(e(), sb2);
        } else if (ErrorCode.isUnknownError(this.c.f.errCode())) {
            Log.w(e(), sb2, this.c.f);
        } else {
            String e2 = e();
            Log.w(e2, sb2 + ", error:" + this.c.f.errMsg());
        }
        b bVar = this.f23798a;
        if (bVar != null) {
            if (z) {
                bVar.a();
            } else {
                bVar.a(this.c.f);
            }
        }
        return this.c;
    }
}
