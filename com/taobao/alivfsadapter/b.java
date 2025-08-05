package com.taobao.alivfsadapter;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import tb.die;
import tb.dih;
import tb.dii;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile b g;
    private d b;
    private f c;
    private Application e;

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f8470a = false;
    private final Handler d = new Handler(Looper.getMainLooper());
    private final Runnable f = new Runnable() { // from class: com.taobao.alivfsadapter.b.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            synchronized (b.a(b.this)) {
                b.this.a(dii.a(), null, null);
                b.a(b.this).notify();
            }
        }
    };

    public static /* synthetic */ Runnable a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("625a0167", new Object[]{bVar}) : bVar.f;
    }

    public static synchronized b a() {
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("78d2bf13", new Object[0]);
            }
            if (g == null && g == null) {
                g = new b();
            }
            return g;
        }
    }

    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
        } else {
            a(application, null, null);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f8470a) {
        } else {
            Log.e("AVFSAdapterManager", "- Unexpected: AVFSAdapterManager ensureInitialized", new UnsupportedOperationException());
            a(dii.a(), null, null);
        }
    }

    public synchronized void a(Application application, f fVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf8b9a7b", new Object[]{this, application, fVar, dVar});
        } else if (this.f8470a) {
        } else {
            b(application, fVar, dVar);
        }
    }

    private void b(Application application, f fVar, d dVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152cdd1a", new Object[]{this, application, fVar, dVar});
            return;
        }
        this.e = application;
        if (fVar == null) {
            try {
                Class.forName(OConstant.REFLECT_APPMONITOR);
                Class.forName("com.alibaba.mtl.appmonitor.AppMonitorStatTable");
                this.c = new die();
            } catch (ClassNotFoundException unused) {
            }
        } else {
            this.c = fVar;
        }
        if (dVar == null) {
            this.b = new dih();
        } else {
            this.b = dVar;
        }
        if (this.e == null) {
            z = false;
        }
        this.f8470a = z;
        Log.e("AVFSAdapterManager", "- AVFSAdapterManager initialize: mInitialized=" + this.f8470a);
    }

    public d c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("89333f0f", new Object[]{this});
        }
        b();
        d dVar = this.b;
        if (dVar == null) {
            throw new RuntimeException("AVFSAdapterManager not initialized!");
        }
        return dVar;
    }

    public f d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("11637f2c", new Object[]{this});
        }
        b();
        return this.c;
    }

    public Application e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("9e618a3b", new Object[]{this});
        }
        b();
        Application application = this.e;
        if (application == null) {
            throw new RuntimeException("AVFSAdapterManager not initialized!");
        }
        return application;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.f8470a;
    }
}
