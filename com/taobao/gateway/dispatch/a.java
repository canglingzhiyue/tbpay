package com.taobao.gateway.dispatch;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.tao.recommend3.tracelog.b;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HandlerThread f17202a;
    public Handler b;
    public Handler c;
    public HandlerThread d;
    public Handler e;
    public HandlerThread f;
    public Handler g;
    public HandlerThread h;
    public Handler i;

    /* renamed from: com.taobao.gateway.dispatch.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0660a {
        public static final a instance;

        static {
            kge.a(-1811670572);
            instance = new a();
        }
    }

    static {
        kge.a(-1907846399);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.c = new Handler(Looper.getMainLooper());
        if (this.f17202a == null) {
            try {
                this.f17202a = new HandlerThread("HomeGateway1Thread");
                this.f17202a.start();
                this.b = new Handler(this.f17202a.getLooper());
            } catch (Throwable th) {
                e.a("GatewayThreadMgr", "HomeGateway1Thread create fail", th);
                this.f17202a = null;
            }
        }
        if (this.d == null) {
            try {
                this.d = new HandlerThread("HomeMtopThread");
                this.d.start();
                this.e = new Handler(this.d.getLooper());
            } catch (Throwable th2) {
                e.a("GatewayThreadMgr", "HomeMtopThread create fail", th2);
                this.d = null;
            }
        }
        if (this.f == null) {
            try {
                this.f = new HandlerThread("HomeTraceLogThread");
                this.f.start();
                this.g = new Handler(this.f.getLooper());
            } catch (Throwable th3) {
                e.a("GatewayThreadMgr", "HomeTraceLogThread create fail", th3);
                this.f = null;
            }
        }
        if (this.h == null) {
            try {
                this.h = new HandlerThread("HomeIOThread");
                this.h.start();
                this.i = new Handler(this.h.getLooper());
            } catch (Throwable th4) {
                e.a("GatewayThreadMgr", "HomeIOThread create fail", th4);
                this.h = null;
            }
        }
        b.a().a(true);
    }

    public Handler a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("b016d95e", new Object[]{this}) : this.b;
    }

    public Handler d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("a41b85fb", new Object[]{this}) : this.e;
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else if (runnable == null || this.f17202a == null) {
        } else {
            if (Thread.currentThread() == this.f17202a) {
                runnable.run();
            } else {
                this.b.post(runnable);
            }
        }
    }

    public void d(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9021f9e9", new Object[]{this, runnable});
        } else {
            this.b.postAtFrontOfQueue(runnable);
        }
    }

    public void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{this, runnable});
        } else if (runnable == null) {
        } else {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.c.postAtFrontOfQueue(runnable);
            }
        }
    }

    public void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf1ace8", new Object[]{this, runnable});
        } else if (runnable == null) {
        } else {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.c.post(runnable);
            }
        }
    }

    public void a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91c09e", new Object[]{this, runnable, new Long(j)});
        } else if (runnable == null) {
        } else {
            if (j == 0) {
                this.c.post(runnable);
            } else {
                this.c.postDelayed(runnable, j);
            }
        }
    }

    public void e(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("145246ea", new Object[]{this, runnable});
        } else if (runnable == null || this.h == null) {
        } else {
            if (Thread.currentThread() == this.h) {
                runnable.run();
            } else {
                this.i.post(runnable);
            }
        }
    }

    public void f(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("988293eb", new Object[]{this, runnable});
        } else if (runnable == null || this.f == null) {
        } else {
            if (Thread.currentThread() == this.f) {
                runnable.run();
            } else {
                this.g.post(runnable);
            }
        }
    }

    public static a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("582020f0", new Object[0]) : C0660a.instance;
    }

    private a() {
        c();
    }
}
