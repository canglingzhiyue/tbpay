package com.taobao.android.launcher.bootstrap.tao;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.LoginBroadcastRegister;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.android.launcher.bootstrap.tao.e;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.lifecycle.PanguApplication;
import java.util.HashMap;
import java.util.Map;
import tb.gtk;
import tb.gtv;
import tb.gtx;
import tb.gua;
import tb.gub;
import tb.gud;
import tb.gul;
import tb.gum;
import tb.gvt;
import tb.jzl;
import tb.xjp;

/* loaded from: classes.dex */
public class j implements gtv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private e f13089a;
    private LoginBroadcastRegister b;
    private gtk c;
    private Application d;
    private gtx e;
    private boolean f;

    public static /* synthetic */ gtk a(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gtk) ipChange.ipc$dispatch("b90ad3ef", new Object[]{jVar}) : jVar.c;
    }

    public static /* synthetic */ LoginBroadcastRegister b(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LoginBroadcastRegister) ipChange.ipc$dispatch("a4268cc8", new Object[]{jVar}) : jVar.b;
    }

    public static /* synthetic */ e c(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("4b3c63ad", new Object[]{jVar}) : jVar.f13089a;
    }

    public static /* synthetic */ boolean d(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ca90897a", new Object[]{jVar})).booleanValue() : jVar.f;
    }

    @Override // tb.gtu
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        f.b();
        com.taobao.android.launcher.biz.task.k.a(xjp.a("QoScheduleTask"));
        if (!TextUtils.equals(this.e.f28453a, this.e.b)) {
            Process.setThreadPriority(5);
        }
        Application application = this.d;
        if (!(application instanceof PanguApplication)) {
            return;
        }
        a((PanguApplication) application);
    }

    @Override // tb.gtu
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.c.f().a(LauncherRuntime.g);
        b();
        this.c.f().b(LauncherRuntime.g);
        if (!BootstrapMode.b(1024)) {
            return;
        }
        this.c.g().r();
    }

    @Override // tb.gtv
    public void a(Application application, gtx gtxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f9acddc", new Object[]{this, application, gtxVar});
            return;
        }
        this.d = application;
        this.e = gtxVar;
        gum gumVar = new gum();
        Pair<gub<String>, com.taobao.android.job.core.task.g<String, Void>> a2 = gud.a(application, gtxVar.b);
        gua a3 = new gua.a(gumVar, (com.taobao.android.job.core.task.g) a2.second, (gub) a2.first).a("default").a(new gul()).a(new jzl()).a();
        this.c = gtk.a(gtxVar.b, a3);
        g.a(application, gtxVar, this.c);
        LauncherRuntime.a(application, gtxVar);
        LauncherRuntime.i = this.c.f();
        LauncherRuntime.j = a3;
        this.f13089a = new e();
        this.b = new LoginBroadcastRegister(this.f13089a);
        com.taobao.android.tbuprofen.adapter.anr.i.a(new com.taobao.android.tbuprofen.adapter.anr.h() { // from class: com.taobao.android.launcher.bootstrap.tao.j.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.tbuprofen.adapter.anr.h
            public Map<String, Object> a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Map) ipChange2.ipc$dispatch("a014a89d", new Object[]{this});
                }
                HashMap hashMap = new HashMap();
                StringBuilder sb = new StringBuilder();
                j.a(j.this).u().b(sb);
                hashMap.put("schedulerSummary", sb);
                return hashMap;
            }
        });
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (LauncherRuntime.k == 0 || LauncherRuntime.k == 4) {
        } else {
            this.c.f().b((Activity) null);
            this.f = true;
        }
    }

    private void a(final PanguApplication panguApplication) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f54f63c", new Object[]{this, panguApplication});
            return;
        }
        this.f13089a.a(panguApplication, this.e, new e.a() { // from class: com.taobao.android.launcher.bootstrap.tao.j.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.launcher.bootstrap.tao.e.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                gvt.a("onLaunchCompleted");
                j.a(j.this).f().a();
                gvt.a();
            }

            @Override // com.taobao.android.launcher.bootstrap.tao.e.a
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                com.taobao.android.launcher.common.e g = j.a(j.this).g();
                if (g == null) {
                    return;
                }
                g.l();
            }
        });
        this.c.e();
        panguApplication.registerCrossActivityLifecycleCallback(new b() { // from class: com.taobao.android.launcher.bootstrap.tao.j.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.launcher.bootstrap.tao.b, com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
            public void onCreated(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5f00e362", new Object[]{this, activity});
                    return;
                }
                j.a(j.this).f().a(activity);
                j.b(j.this).a(true, panguApplication);
                j.c(j.this).dN_();
                if (!j.d(j.this) && !LauncherRuntime.a(activity.getIntent())) {
                    j.a(j.this).f().b(activity);
                }
                panguApplication.unregisterCrossActivityLifecycleCallback(this);
            }
        });
        panguApplication.registerCrossActivityLifecycleCallback(new b() { // from class: com.taobao.android.launcher.bootstrap.tao.j.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.launcher.bootstrap.tao.b, com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
            public void onStarted(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4b167bb", new Object[]{this, activity});
                } else {
                    j.a(j.this).f().c(activity);
                }
            }

            @Override // com.taobao.android.launcher.bootstrap.tao.b, com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
            public void onStopped(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("82d37207", new Object[]{this, activity});
                } else {
                    j.a(j.this).f().d(activity);
                }
            }
        });
        this.b.f13062a = new LoginBroadcastRegister.a() { // from class: com.taobao.android.launcher.bootstrap.tao.j.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.launcher.bootstrap.tao.LoginBroadcastRegister.a
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                } else if (i == 1) {
                    j.a(j.this).f().b();
                } else if (i == 2) {
                    j.a(j.this).f().c();
                } else if (i != 3) {
                } else {
                    j.a(j.this).f().d();
                }
            }
        };
    }
}
