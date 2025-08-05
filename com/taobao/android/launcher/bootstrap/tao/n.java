package com.taobao.android.launcher.bootstrap.tao;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
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

/* loaded from: classes5.dex */
public class n implements com.taobao.android.launcher.bootstrap.tao.ability.l, com.taobao.android.launcher.bootstrap.tao.ability.n, gtv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private m f13100a;
    private LoginBroadcastRegister b;
    private gtk c;
    private Application d;
    private gtx e;

    public static /* synthetic */ gtk a(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gtk) ipChange.ipc$dispatch("c9d9ef3", new Object[]{nVar}) : nVar.c;
    }

    public static /* synthetic */ LoginBroadcastRegister b(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LoginBroadcastRegister) ipChange.ipc$dispatch("696ccacc", new Object[]{nVar}) : nVar.b;
    }

    public static /* synthetic */ m c(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("3266ec21", new Object[]{nVar}) : nVar.f13100a;
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
        if (!TextUtils.isEmpty(this.e.b) && this.e.b.endsWith(":channel")) {
            Process.setThreadPriority(5);
        }
        Application application = this.d;
        if (!(application instanceof PanguApplication)) {
            return;
        }
        a((PanguApplication) application);
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.n
    public boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue();
        }
        m mVar = this.f13100a;
        if (mVar == null) {
            return false;
        }
        return mVar.b(context);
    }

    @Override // tb.gtu
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (BootstrapMode.b(1024)) {
            this.c.g().r();
        }
        if (!BootstrapMode.b()) {
            return;
        }
        this.c.g().q();
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.l
    public void a(gtk gtkVar, m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ba044e4", new Object[]{this, gtkVar, mVar});
            return;
        }
        this.c = gtkVar;
        this.f13100a = mVar;
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
        b();
        if (this.c == null || this.f13100a == null) {
            Pair<gtk, m> b = b(application, gtxVar);
            this.c = (gtk) b.first;
            this.f13100a = (m) b.second;
        }
        g.a(application, gtxVar, this.c);
        g.a(this.f13100a);
        com.taobao.android.launcher.bootstrap.tao.biz.nav.a.a(this.f13100a);
        this.b = new LoginBroadcastRegister(this.f13100a);
        com.taobao.android.tbuprofen.adapter.anr.i.a(new com.taobao.android.tbuprofen.adapter.anr.h() { // from class: com.taobao.android.launcher.bootstrap.tao.n.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.tbuprofen.adapter.anr.h
            public Map<String, Object> a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Map) ipChange2.ipc$dispatch("a014a89d", new Object[]{this});
                }
                HashMap hashMap = new HashMap();
                StringBuilder sb = new StringBuilder();
                n.a(n.this).u().b(sb);
                hashMap.put("schedulerSummary", sb);
                return hashMap;
            }
        });
    }

    public static Pair<gtk, m> b(Application application, gtx gtxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("1971d405", new Object[]{application, gtxVar});
        }
        gum gumVar = new gum();
        Pair<gub<String>, com.taobao.android.job.core.task.g<String, Void>> a2 = gud.a(application, gtxVar.b);
        gul gulVar = new gul();
        jzl jzlVar = new jzl();
        jzlVar.a(xjp.a("NGAppDelegateQoSchedule"));
        gua a3 = new gua.a(gumVar, (com.taobao.android.job.core.task.g) a2.second, (gub) a2.first).a("default").a(gulVar).a(jzlVar).a();
        gtk a4 = gtk.a(gtxVar.b, a3);
        m mVar = new m(a4);
        LauncherRuntime.i = a4.f();
        LauncherRuntime.j = a3;
        LauncherRuntime.a(application, gtxVar);
        return Pair.create(a4, mVar);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.d.registerActivityLifecycleCallbacks(new a() { // from class: com.taobao.android.launcher.bootstrap.tao.n.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.launcher.bootstrap.tao.a, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                        return;
                    }
                    h.b("TaoNGAppDelegate", "onActivityCreated, activity: " + activity.getLocalClassName());
                }

                @Override // com.taobao.android.launcher.bootstrap.tao.a, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5e01616c", new Object[]{this, activity});
                        return;
                    }
                    h.b("TaoNGAppDelegate", "onActivityStarted, activity: " + activity.getLocalClassName());
                }

                @Override // com.taobao.android.launcher.bootstrap.tao.a, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                        return;
                    }
                    h.b("TaoNGAppDelegate", "onActivityResumed, activity: " + activity.getLocalClassName());
                }

                @Override // com.taobao.android.launcher.bootstrap.tao.a, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a4658a75", new Object[]{this, activity});
                        return;
                    }
                    h.b("TaoNGAppDelegate", "onActivityPaused, activity: " + activity.getLocalClassName());
                }

                @Override // com.taobao.android.launcher.bootstrap.tao.a, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                        return;
                    }
                    h.b("TaoNGAppDelegate", "onActivityStopped, activity: " + activity.getLocalClassName());
                }

                @Override // com.taobao.android.launcher.bootstrap.tao.a, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4148cc84", new Object[]{this, activity});
                        return;
                    }
                    h.b("TaoNGAppDelegate", "onActivityDestroyed, activity: " + activity.getLocalClassName());
                }
            });
        }
    }

    private void a(final PanguApplication panguApplication) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f54f63c", new Object[]{this, panguApplication});
            return;
        }
        this.f13100a.a(panguApplication, this.e, new e.a() { // from class: com.taobao.android.launcher.bootstrap.tao.n.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.launcher.bootstrap.tao.e.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                gvt.a("onLaunchCompleted");
                n.a(n.this).f().a();
                gvt.a();
            }

            @Override // com.taobao.android.launcher.bootstrap.tao.e.a
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                com.taobao.android.launcher.common.e g = n.a(n.this).g();
                if (g == null) {
                    return;
                }
                g.l();
            }
        });
        panguApplication.registerCrossActivityLifecycleCallback(new b() { // from class: com.taobao.android.launcher.bootstrap.tao.n.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.launcher.bootstrap.tao.b, com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
            public void onCreated(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5f00e362", new Object[]{this, activity});
                    return;
                }
                n.b(n.this).a(true, panguApplication);
                n.c(n.this).dN_();
                panguApplication.unregisterCrossActivityLifecycleCallback(this);
            }
        });
        this.b.f13062a = new LoginBroadcastRegister.a() { // from class: com.taobao.android.launcher.bootstrap.tao.n.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.launcher.bootstrap.tao.LoginBroadcastRegister.a
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                } else if (i == 1) {
                    n.a(n.this).f().b();
                } else if (i == 2) {
                    n.a(n.this).f().c();
                } else if (i != 3) {
                } else {
                    n.a(n.this).f().d();
                }
            }
        };
    }
}
