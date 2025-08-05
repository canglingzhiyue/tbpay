package com.taobao.application.common.impl;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.IApmEventListener;
import com.taobao.application.common.IAppLaunchListener;
import com.taobao.application.common.IPageListener;
import com.taobao.application.common.IScrollListener;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class b implements com.taobao.application.common.a, com.taobao.application.common.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final h<Application.ActivityLifecycleCallbacks> f16327a;
    private final h<Application.ActivityLifecycleCallbacks> b;
    private final i<IPageListener> c;
    private final i<IAppLaunchListener> d;
    private final i<IApmEventListener> e;
    private final i<com.taobao.application.common.f> f;
    private final i<IScrollListener> g;
    private volatile Handler h;
    private final Object i;
    private volatile Activity j;
    private ConcurrentHashMap<Application.ActivityLifecycleCallbacks, Boolean> k;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f16328a = new b();
    }

    private <T> T a(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("9798556e", new Object[]{this, obj}) : obj;
    }

    private b() {
        this.f16327a = new j();
        this.b = new e();
        this.c = new k();
        this.d = new c();
        this.e = new com.taobao.application.common.impl.a();
        this.f = new g();
        this.g = new l();
        this.i = new Object();
        this.k = new ConcurrentHashMap<>();
        if (!com.taobao.monitor.impl.common.d.f18153a) {
            HandlerThread a2 = com.taobao.monitor.common.c.a("Apm-Sec");
            a2.start();
            this.h = new Handler(a2.getLooper());
        }
    }

    public static b d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("1d000315", new Object[0]) : a.f16328a;
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (!com.taobao.monitor.impl.common.d.f18153a || this.h != null) {
        } else {
            synchronized (this.i) {
                if (this.h == null) {
                    HandlerThread a2 = com.taobao.monitor.common.c.a("Apm-Sec");
                    a2.start();
                    this.h = new Handler(a2.getLooper());
                }
            }
        }
    }

    @Override // com.taobao.application.common.e
    public void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56e2eef2", new Object[]{this, activityLifecycleCallbacks, new Boolean(z)});
        } else if (activityLifecycleCallbacks == null) {
            throw new IllegalArgumentException();
        } else {
            if (this.k.put(activityLifecycleCallbacks, Boolean.valueOf(z)) != null) {
                throw new IllegalArgumentException();
            }
            if (z) {
                this.f16327a.b(activityLifecycleCallbacks);
            } else {
                this.b.b(activityLifecycleCallbacks);
            }
        }
    }

    @Override // com.taobao.application.common.e
    public void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f6c822", new Object[]{this, activityLifecycleCallbacks});
        } else if (activityLifecycleCallbacks == null) {
            throw new IllegalArgumentException();
        } else {
            Boolean bool = this.k.get(activityLifecycleCallbacks);
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                this.k.remove(activityLifecycleCallbacks);
                if (booleanValue) {
                    this.f16327a.a(activityLifecycleCallbacks);
                    return;
                } else {
                    this.b.a(activityLifecycleCallbacks);
                    return;
                }
            }
            throw new IllegalArgumentException();
        }
    }

    @Override // com.taobao.application.common.e
    public void a(IPageListener iPageListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0b0dcdf", new Object[]{this, iPageListener});
        } else {
            this.c.b(iPageListener);
        }
    }

    @Override // com.taobao.application.common.e
    public void b(IPageListener iPageListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a25a82fe", new Object[]{this, iPageListener});
        } else {
            this.c.a(iPageListener);
        }
    }

    @Override // com.taobao.application.common.e
    public void a(IAppLaunchListener iAppLaunchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a3426a6", new Object[]{this, iAppLaunchListener});
        } else {
            this.d.b(iAppLaunchListener);
        }
    }

    @Override // com.taobao.application.common.e
    public void b(IAppLaunchListener iAppLaunchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3887be7", new Object[]{this, iAppLaunchListener});
        } else {
            this.d.a(iAppLaunchListener);
        }
    }

    @Override // com.taobao.application.common.e
    public void a(IApmEventListener iApmEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78ba6d32", new Object[]{this, iApmEventListener});
        } else {
            this.e.b(iApmEventListener);
        }
    }

    @Override // com.taobao.application.common.e
    public void b(IApmEventListener iApmEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92d5ebd1", new Object[]{this, iApmEventListener});
        } else {
            this.e.a(iApmEventListener);
        }
    }

    @Override // com.taobao.application.common.e
    public void a(com.taobao.application.common.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7a4605", new Object[]{this, fVar});
        } else {
            this.f.b(fVar);
        }
    }

    @Override // com.taobao.application.common.e
    public void b(com.taobao.application.common.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afcce2a4", new Object[]{this, fVar});
        } else {
            this.f.a(fVar);
        }
    }

    @Override // com.taobao.application.common.e
    public void a(IScrollListener iScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec3ef761", new Object[]{this, iScrollListener});
        } else {
            this.g.b(iScrollListener);
        }
    }

    @Override // com.taobao.application.common.e
    public void b(IScrollListener iScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a1791c0", new Object[]{this, iScrollListener});
        } else {
            this.g.a(iScrollListener);
        }
    }

    @Override // com.taobao.application.common.e
    public com.taobao.application.common.d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.application.common.d) ipChange.ipc$dispatch("210d3d07", new Object[]{this}) : d.a();
    }

    @Override // com.taobao.application.common.e
    public Activity b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("233c125f", new Object[]{this}) : this.j;
    }

    @Override // com.taobao.application.common.e
    public Looper m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Looper) ipChange.ipc$dispatch("52cb5e49", new Object[]{this});
        }
        l();
        return this.h.getLooper();
    }

    @Override // com.taobao.application.common.e
    public Handler c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("a819f71c", new Object[]{this});
        }
        l();
        return this.h;
    }

    public Application.ActivityLifecycleCallbacks e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application.ActivityLifecycleCallbacks) ipChange.ipc$dispatch("8a3ae3e4", new Object[]{this}) : (Application.ActivityLifecycleCallbacks) a(this.f16327a);
    }

    public Application.ActivityLifecycleCallbacks f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application.ActivityLifecycleCallbacks) ipChange.ipc$dispatch("8b7136c3", new Object[]{this}) : (Application.ActivityLifecycleCallbacks) a(this.b);
    }

    public IPageListener g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPageListener) ipChange.ipc$dispatch("d15ef325", new Object[]{this}) : (IPageListener) a(this.c);
    }

    public IAppLaunchListener h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IAppLaunchListener) ipChange.ipc$dispatch("cc403705", new Object[]{this}) : (IAppLaunchListener) a(this.d);
    }

    public IApmEventListener i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IApmEventListener) ipChange.ipc$dispatch("4ee01dba", new Object[]{this}) : (IApmEventListener) a(this.e);
    }

    public com.taobao.application.common.f j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.application.common.f) ipChange.ipc$dispatch("d1f3acce", new Object[]{this}) : (com.taobao.application.common.f) a(this.f);
    }

    public IScrollListener k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IScrollListener) ipChange.ipc$dispatch("bca6c46b", new Object[]{this}) : (IScrollListener) a(this.g);
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else {
            this.j = activity;
        }
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            return;
        }
        l();
        this.h.post(runnable);
    }
}
