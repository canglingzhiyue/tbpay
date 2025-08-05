package com.taobao.android.launcher.bootstrap.tao;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.gtv;
import tb.gtx;
import tb.gty;
import tb.gvt;
import tb.xjp;
import tb.xmf;

/* loaded from: classes5.dex */
public class k extends a implements com.taobao.android.launcher.bootstrap.tao.ability.m, gtv, gty.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Application f13094a;
    private gtx b;
    private boolean c = false;
    private Pair<Activity, Bundle> d = null;
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final List<Application.ActivityLifecycleCallbacks> f = new ArrayList();

    public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.gtu
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // tb.gtu
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        com.taobao.android.launcher.biz.task.k.a(xjp.a("QoScheduleTask"));
        String str = this.b.f28453a;
        android.taobao.safemode.h.a().a(android.taobao.safemode.k.a(str, str, true, null, this.f13094a.getPackageManager().getLaunchIntentForPackage(str), false, null));
        BootstrapMode.a(this.f13094a, 1024);
        this.f13094a.registerActivityLifecycleCallbacks(this);
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        } else {
            this.d = Pair.create(activity, bundle);
        }
    }

    @Override // tb.gtv
    public void a(Application application, gtx gtxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f9acddc", new Object[]{this, application, gtxVar});
            return;
        }
        this.f13094a = application;
        this.b = gtxVar;
        LauncherRuntime.a(application, gtxVar);
        gty.a(application, this);
        d.a(application, gtxVar);
    }

    @Override // tb.gty.b
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.e.compareAndSet(false, true)) {
        } else {
            a((android.taobao.safemode.k) null, (xmf) null);
        }
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.m
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.c;
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
        this.c = true;
        gvt.a("TaoNGAppPrivacyDelegate#launch");
        gtv a2 = f.a();
        d();
        a2.a(this.f13094a, this.b);
        a2.a(this.f13094a);
        a2.a();
        e();
        gvt.a();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.f13094a.unregisterActivityLifecycleCallbacks(this);
        List<Application.ActivityLifecycleCallbacks> a2 = l.a(this.f13094a);
        synchronized (a2) {
            this.f.addAll(a2);
            a2.clear();
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        Pair<Activity, Bundle> pair = this.d;
        if (pair == null) {
            return;
        }
        Activity activity = (Activity) pair.first;
        if (activity == null) {
            throw new IllegalStateException("something went wrong, activity is null");
        }
        l.b(activity);
        l.a(this.f13094a, "dispatchActivityCreated", new Class[]{Activity.class, Bundle.class}, new Object[]{activity, this.d.second});
        l.a(this.f13094a, "dispatchActivityStarted", new Class[]{Activity.class}, new Object[]{activity});
        l.a(this.f13094a, "dispatchActivityResumed", new Class[]{Activity.class}, new Object[]{activity});
        l.c(activity);
        List<Application.ActivityLifecycleCallbacks> a2 = l.a(this.f13094a);
        synchronized (a2) {
            a2.addAll(0, this.f);
        }
        this.f.clear();
        this.d = null;
    }
}
