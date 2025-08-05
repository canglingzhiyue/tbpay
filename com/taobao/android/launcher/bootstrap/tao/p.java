package com.taobao.android.launcher.bootstrap.tao;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.android.launcher.bootstrap.tao.ability.dispatch.Dispatchers;
import com.taobao.android.launcher.bootstrap.tao.ability.ipc.a;
import tb.gtk;
import tb.gtv;
import tb.gtx;
import tb.gvt;
import tb.xmf;
import tb.xmh;

/* loaded from: classes5.dex */
public class p implements com.taobao.android.launcher.bootstrap.tao.ability.m, com.taobao.android.launcher.bootstrap.tao.ability.n, gtv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Application f13105a;
    private gtx b;
    private gtv c;
    private boolean d = false;
    private Pair<gtk, m> e;

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.n
    public boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ Application a(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("9b368c22", new Object[]{pVar}) : pVar.f13105a;
    }

    public static /* synthetic */ gtv b(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gtv) ipChange.ipc$dispatch("5bfb0ecb", new Object[]{pVar}) : pVar.c;
    }

    @Override // tb.gtu
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        h.b("TaoNGNextAppDelegate", "lifeCycle#attachBaseContext");
        if (context instanceof a.c) {
            com.taobao.android.launcher.bootstrap.tao.ability.ipc.a.a((a.c) context);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        Dispatchers.a("AttachTime", String.valueOf(uptimeMillis));
        com.taobao.monitor.adapter.b.a("ngNextAppAttach", Long.valueOf(uptimeMillis));
    }

    @Override // tb.gtu
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        h.b("TaoNGNextAppDelegate", "lifeCycle#onCreate");
        long uptimeMillis = SystemClock.uptimeMillis();
        com.taobao.monitor.adapter.b.a("ngNextAppCreate", Long.valueOf(uptimeMillis));
        Dispatchers.a("CreateTime", String.valueOf(uptimeMillis));
    }

    @Override // tb.gtv
    public void a(Application application, gtx gtxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f9acddc", new Object[]{this, application, gtxVar});
            return;
        }
        h.b("TaoNGNextAppDelegate", "lifeCycle#bindApp");
        long uptimeMillis = SystemClock.uptimeMillis();
        Dispatchers.a("BindTime", String.valueOf(uptimeMillis));
        c.a(application, this);
        this.f13105a = application;
        this.b = gtxVar;
        BootstrapMode.a(application, 4096);
        this.e = n.b(application, gtxVar);
        ((m) this.e.second).b(application);
        com.taobao.monitor.adapter.b.a("ngNextApp", true);
        com.taobao.monitor.adapter.b.a("ngNextAppBind", Long.valueOf(uptimeMillis));
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.m
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.d;
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.m
    public gtx f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gtx) ipChange.ipc$dispatch("357d742e", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.m
    public void a(android.taobao.safemode.k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfc554c", new Object[]{this, kVar});
        } else {
            a(kVar, (xmf) null);
        }
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.m
    public void a(android.taobao.safemode.k kVar, xmf xmfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a49e0b", new Object[]{this, kVar, xmfVar});
            return;
        }
        this.d = true;
        h.b("TaoNGNextAppDelegate", "lifeCycle#launch");
        gvt.a("TaoNGNextAppDelegate#launch");
        long uptimeMillis = SystemClock.uptimeMillis();
        com.taobao.monitor.adapter.b.a("ngNextAppLaunch", Long.valueOf(uptimeMillis));
        Dispatchers.a("LaunchTime", String.valueOf(uptimeMillis));
        int d = BootstrapMode.d();
        android.taobao.safemode.k c = android.taobao.safemode.h.a().c();
        android.taobao.safemode.h.a().a(kVar);
        if (c == null && kVar != null) {
            BootstrapMode.a(this.f13105a, 16384);
        } else {
            BootstrapMode.a(this.f13105a);
        }
        this.c = f.a();
        if (this.e != null && (this.c instanceof com.taobao.android.launcher.bootstrap.tao.ability.l)) {
            h.b("TaoNGNextAppDelegate", "attach ng runtime");
            ((com.taobao.android.launcher.bootstrap.tao.ability.l) this.c).a((gtk) this.e.first, (m) this.e.second);
            BootstrapMode.a(d | 512);
        }
        this.c.a(this.f13105a, this.b);
        if (xmfVar != null && xmfVar.b()) {
            a(xmfVar);
        } else {
            this.c.a(this.f13105a);
            this.c.a();
            com.taobao.android.launcher.bootstrap.tao.ability.ipc.a.a();
            h.b("TaoNGNextAppDelegate", "lifeCycle#launched");
        }
        gvt.a();
    }

    private void a(xmf xmfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("789d927", new Object[]{this, xmfVar});
            return;
        }
        xmfVar.a(new xmh() { // from class: com.taobao.android.launcher.bootstrap.tao.p.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.xmh
            public String a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : "app#attachBaseContext";
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    p.b(p.this).a(p.a(p.this));
                }
            }
        });
        xmfVar.a(new xmh() { // from class: com.taobao.android.launcher.bootstrap.tao.p.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.xmh
            public String a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : "app#onCreate";
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                p.b(p.this).a();
                com.taobao.android.launcher.bootstrap.tao.ability.ipc.a.a();
                h.b("TaoNGNextAppDelegate", "lifeCycle#launched");
            }
        });
    }
}
