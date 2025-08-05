package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;
import com.taobao.android.job.core.j;
import com.taobao.android.knife.perf.PerfKnife;
import com.taobao.android.launcher.bootstrap.tao.ScheduleComposer;
import com.taobao.android.launcher.bootstrap.tao.a;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;
import com.taobao.android.launcher.bootstrap.tao.ability.n;
import com.taobao.android.launcher.bootstrap.tao.b;
import com.taobao.android.launcher.bootstrap.tao.h;
import com.taobao.android.launcher.bootstrap.tao.l;
import com.taobao.android.launcher.bootstrap.tao.o;
import com.taobao.android.launcher.common.e;
import com.taobao.android.launcher.common.g;
import com.taobao.android.lifecycle.PanguApplication;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public class nsl extends a implements ScheduleComposer, n, Runnable, sxs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Object g = new Object();
    private final gtk b;
    private Application c;
    private o n;
    private int d = -1;
    private int e = -1;
    private boolean f = false;
    private final AtomicInteger h = new AtomicInteger(0);
    private final AtomicBoolean i = new AtomicBoolean(false);
    private Pair<Activity, Bundle> j = null;
    private Pair<Activity, Bundle> o = null;
    private final List<Application.ActivityLifecycleCallbacks> l = new ArrayList();
    private final List<FragmentManager.FragmentLifecycleCallbacks> m = new ArrayList();
    private int k = 0;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f31727a = new Handler(Looper.getMainLooper());

    public static /* synthetic */ Object ipc$super(nsl nslVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(nsl nslVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6d0aa31", new Object[]{nslVar});
        } else {
            nslVar.e();
        }
    }

    public static /* synthetic */ void a(nsl nslVar, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2763f6c3", new Object[]{nslVar, activity});
        } else {
            nslVar.a(activity);
        }
    }

    public static /* synthetic */ boolean a(nsl nslVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e3450ef6", new Object[]{nslVar, new Integer(i)})).booleanValue() : nslVar.a(i);
    }

    public static /* synthetic */ int b(nsl nslVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c522d884", new Object[]{nslVar, new Integer(i)})).intValue();
        }
        nslVar.e = i;
        return i;
    }

    public static /* synthetic */ void b(nsl nslVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e553b0b2", new Object[]{nslVar});
        } else {
            nslVar.c();
        }
    }

    public static /* synthetic */ int c(nsl nslVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a700a223", new Object[]{nslVar, new Integer(i)})).intValue();
        }
        nslVar.d = i;
        return i;
    }

    public static /* synthetic */ void c(nsl nslVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3d6b733", new Object[]{nslVar});
        } else {
            nslVar.m();
        }
    }

    public static /* synthetic */ void d(nsl nslVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c259bdb4", new Object[]{nslVar});
        } else {
            nslVar.l();
        }
    }

    public static /* synthetic */ Handler e(nsl nslVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("6b19cc71", new Object[]{nslVar}) : nslVar.f31727a;
    }

    public static /* synthetic */ Application f(nsl nslVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("ad12cc85", new Object[]{nslVar}) : nslVar.c;
    }

    public static /* synthetic */ gtk g(nsl nslVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gtk) ipChange.ipc$dispatch("2a699c11", new Object[]{nslVar}) : nslVar.b;
    }

    public static /* synthetic */ Object k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("fe6d5200", new Object[0]) : g;
    }

    public nsl(gtk gtkVar) {
        this.b = gtkVar;
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ScheduleComposer
    public void a(Application application, o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6870645", new Object[]{this, application, oVar});
            return;
        }
        this.c = application;
        this.n = oVar;
        this.k = BootstrapMode.d();
        application.registerActivityLifecycleCallbacks(this);
        a((Context) application, false);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        while (!this.f) {
            try {
                g.wait();
            } catch (Throwable th) {
                h.a("NGNextScheduleComposer", "awaitLoadedLocked with exception", th);
            }
        }
    }

    private boolean a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("258fda78", new Object[]{this, context, new Boolean(z)})).booleanValue();
        }
        h.b("NGNextScheduleComposer", "preloadInternal, expected:" + z);
        if (a(context) != z) {
            return false;
        }
        h.b("NGNextScheduleComposer", "preload");
        PerfKnife.a();
        d();
        return true;
    }

    private boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue() : BootstrapMode.b(4096) && (ADaemon.optProviderPreload(context) || guc.a(this.c, "enableNGPreloadV2"));
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.n
    public boolean b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue() : a(context, true);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        synchronized (g) {
            this.f = false;
        }
        new Thread(new Runnable() { // from class: tb.nsl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    nsl.a(nsl.this);
                }
            }
        }, "minKernelAsync").start();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        synchronized (g) {
            if (this.f) {
                return;
            }
            tpl.a(this.c, this.b).a();
            this.f = true;
            g.notifyAll();
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        e g2 = this.b.g();
        if (!(g2 instanceof g)) {
            return;
        }
        ((g) g2).a("APM", new g.a<String>() { // from class: tb.nsl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.launcher.common.g.a
            public void a(j<String> jVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("707ae49a", new Object[]{this, jVar});
                } else if (nsl.a(nsl.this, 64)) {
                    jVar.a("InitAPMMin", "InitBehaviX");
                } else {
                    jVar.c("InitAPMMin");
                }
            }
        });
    }

    private boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue() : BootstrapMode.a(this.k, i);
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        } else if (l.a(activity)) {
            h.b("NGNextScheduleComposer", "onActivityCreated, isLifeCycleCompact, ignore it");
            this.o = Pair.create(activity, bundle);
        } else if (this.d == -1) {
            this.j = Pair.create(activity, bundle);
            r();
            this.d = 1;
        } else {
            nso.a(activity.getClass().getName(), "onActivityCreated", this.d);
        }
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        } else if (l.a(activity)) {
            h.b("NGNextScheduleComposer", "onActivityStarted, isLifeCycleCompact, ignore it");
        } else if (this.d == 1) {
            this.d = 2;
        } else {
            nso.a(activity.getClass().getName(), "onActivityStarted", this.d);
        }
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        } else if (l.a(activity)) {
            h.b("NGNextScheduleComposer", "onActivityResumed, isLifeCycleCompact, ignore it");
        } else {
            Application application = this.c;
            if (application == null) {
                throw new IllegalStateException("application is null");
            }
            application.unregisterActivityLifecycleCallbacks(this);
            if (this.d == 2) {
                sxr.a(this).a();
                this.d = 3;
                return;
            }
            nso.a(activity.getClass().getName(), "onActivityResumed", this.d);
        }
    }

    @Override // tb.sxs
    public Runnable b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("91a75f0b", new Object[]{this}) : new Runnable() { // from class: tb.nsl.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                synchronized (nsl.k()) {
                    nsl.b(nsl.this);
                }
            }
        };
    }

    @Override // tb.sxs
    public Runnable h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("79b0b845", new Object[]{this}) : new Runnable() { // from class: tb.nsl.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                h.b("NGNextScheduleComposer", "reached first frame");
                gvt.a("LAUNCH_POST_SYNC_BARRIER");
                nsl.d(nsl.this);
                nsl.c(nsl.this);
                nsl.b(nsl.this, nso.b());
                nsl.c(nsl.this, 4);
                nsl.e(nsl.this).postAtFrontOfQueue(nsl.this);
                gvt.a();
            }
        };
    }

    @Override // tb.sxs
    public Context i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c0133768", new Object[]{this}) : this.c;
    }

    @Override // tb.sxs
    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            this.f31727a.post(runnable);
        }
    }

    @Override // tb.sxs
    public void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{this, runnable});
        } else {
            this.f31727a.postAtFrontOfQueue(runnable);
        }
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        Application application = this.c;
        if (application == null) {
            return;
        }
        List<Application.ActivityLifecycleCallbacks> a2 = l.a(application);
        synchronized (a2) {
            this.l.addAll(a2);
            a2.clear();
        }
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        Pair<Activity, Bundle> pair = this.j;
        if (pair == null) {
            return;
        }
        Activity activity = (Activity) pair.first;
        if (!(activity instanceof FragmentActivity)) {
            return;
        }
        this.m.addAll(l.a(((FragmentActivity) activity).getSupportFragmentManager()));
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        int i = this.d;
        if (i == 10) {
            h.b("NGNextScheduleComposer", "interrupted before, do nothing here");
        } else if (i == 4) {
            h.b("NGNextScheduleComposer", "reached second message loop");
            this.b.e();
            this.d = 6;
            this.f31727a.postAtFrontOfQueue(this);
        } else if (i == 6) {
            h.b("NGNextScheduleComposer", "reached third message loop");
            this.b.f().a(this.c);
            this.d = 7;
            this.f31727a.postAtFrontOfQueue(this);
        } else if (i == 7) {
            h.b("NGNextScheduleComposer", "reached fourth message loop");
            this.b.f().b(this.c);
            this.d = 8;
            this.f31727a.postAtFrontOfQueue(this);
        } else if (i != 8) {
        } else {
            h.b("NGNextScheduleComposer", "reached fifth message loop");
            a(Arrays.asList(this.o, this.j));
            s();
            nso.a(this.e);
            this.d = 9;
            o();
        }
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        synchronized (g) {
            c();
        }
        if (this.d < 4) {
            this.b.e();
        }
        if (this.d < 6) {
            this.b.f().a(this.c);
        }
        if (this.d < 7) {
            this.b.f().b(this.c);
        }
        a(Arrays.asList(this.o, this.j));
        s();
        int i = this.e;
        if (i < 0) {
            return;
        }
        nso.a(i);
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ScheduleComposer
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        h.b("NGNextScheduleComposer", "onActivityArrived, className=" + str + ", currentState=" + this.d);
        if (this.i.get()) {
            h.b("NGNextScheduleComposer", "already done, no need to worry about it");
        } else if (this.h.getAndIncrement() <= 0) {
            g();
        } else {
            nso.a(str, "onActivityArrived", this.d);
            h.b("NGNextScheduleComposer", "now we should interrupt current process and ensure everything is ok");
            Application application = this.c;
            if (application == null) {
                return;
            }
            int i = this.d;
            if (i == 1) {
                application.unregisterActivityLifecycleCallbacks(this);
                b("STATE_ACTIVITY_CREATED");
            } else if (i == 2) {
                application.unregisterActivityLifecycleCallbacks(this);
                b("STATE_ACTIVITY_STARTED");
            } else if (i == 3) {
                application.unregisterActivityLifecycleCallbacks(this);
                b("STATE_ACTIVITY_RESUMED");
            }
            this.d = 10;
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        h.b("NGNextScheduleComposer", "continueComposed due to " + str);
        l();
        m();
        n();
        o();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks, com.taobao.android.launcher.bootstrap.tao.ScheduleComposer
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ebc4708", new Object[]{this, activity, bundle});
        } else if (this.i.get()) {
            h.b("NGNextScheduleComposer", "already done, no need to worry about the state");
        } else if (bundle == null) {
        } else {
            h.b("NGNextScheduleComposer", "onActivityPreCreated, className=" + activity.getClass().getName() + ", currentState=" + this.d);
            if (this.h.get() > 1) {
                return;
            }
            h.b("NGNextScheduleComposer", "onActivityPreCreated, handle the saved instance state before");
            bundle.clear();
            bundle.putBoolean(ScheduleComposer.PARCEL_KEY_STATE_REWROTE, true);
            BootstrapMode.a(128);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks, com.taobao.android.launcher.bootstrap.tao.ScheduleComposer
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1cb46a1", new Object[]{this, activity, bundle});
        } else if (this.i.get()) {
            h.b("NGNextScheduleComposer", "already done, no need to worry about the state");
        } else if (bundle == null) {
        } else {
            h.b("NGNextScheduleComposer", "onActivityPostCreated, className=" + activity.getClass().getName() + ", currentState=" + this.d);
            if (this.h.get() > 1) {
                return;
            }
            h.b("NGNextScheduleComposer", "onActivityPostCreated, re-handle the saved instance state before");
            bundle.remove(ScheduleComposer.PARCEL_KEY_STATE_REWROTE);
        }
    }

    private void o() {
        o oVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else if (!this.i.compareAndSet(false, true) || (oVar = this.n) == null) {
        } else {
            oVar.c();
        }
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ScheduleComposer
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.i.get();
    }

    @Override // tb.sxs
    public int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : this.d;
    }

    private void a(int i, Pair<Activity, Bundle> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9694095f", new Object[]{this, new Integer(i), pair});
            return;
        }
        Activity activity = (Activity) pair.first;
        if (activity == null) {
            throw new IllegalStateException("something went wrong, activity is null");
        }
        if (this.d > 0) {
            h.b("NGNextScheduleComposer", "dispatchActivityCreated");
            l.a(this.c, "dispatchActivityCreated", new Class[]{Activity.class, Bundle.class}, new Object[]{activity, pair.second});
            if (i == 0) {
                this.b.f().a(activity);
            }
        }
        if (this.d >= 2) {
            h.b("NGNextScheduleComposer", "dispatchActivityStarted");
            l.a(this.c, "dispatchActivityStarted", new Class[]{Activity.class}, new Object[]{activity});
        }
        if (this.d < 3) {
            return;
        }
        h.b("NGNextScheduleComposer", "dispatchActivityResumed");
        l.a(this.c, "dispatchActivityResumed", new Class[]{Activity.class}, new Object[]{activity});
    }

    private void a(List<Pair<Activity, Bundle>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (this.c == null) {
            throw new IllegalStateException("something went wrong, application is null");
        } else {
            if (this.j == null) {
                nso.a("NONE", "onRecoverComponentState", this.d);
                return;
            }
            if (!this.l.isEmpty()) {
                int i = 0;
                for (Pair<Activity, Bundle> pair : list) {
                    if (pair != null) {
                        a(i, pair);
                        i++;
                    }
                }
                List<Application.ActivityLifecycleCallbacks> a2 = l.a(this.c);
                synchronized (a2) {
                    a2.addAll(0, this.l);
                }
                this.l.clear();
                q();
                this.m.clear();
            } else if (!this.m.isEmpty()) {
                q();
                this.m.clear();
            }
            l.a();
            t();
            this.j = null;
        }
    }

    private void q() {
        Pair<Activity, Bundle> pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        } else if (this.d < 3 || (pair = this.j) == null) {
        } else {
            Activity activity = (Activity) pair.first;
            if (!(activity instanceof FragmentActivity)) {
                return;
            }
            FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
            h.b("NGNextScheduleComposer", "onFragmentResumed");
            l.a(supportFragmentManager, "onFragmentResumed", this.m);
        }
    }

    private void r() {
        Application application;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        e g2 = this.b.g();
        if (!(g2 instanceof g)) {
            return;
        }
        final boolean a2 = a(64);
        final boolean a3 = a(32);
        if (a2 || a3) {
            ((g) g2).a("m-min-kernel", new g.a<String>() { // from class: tb.nsl.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.launcher.common.g.a
                public void a(j<String> jVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("707ae49a", new Object[]{this, jVar});
                        return;
                    }
                    if (a2) {
                        jVar.c("InitPopMin");
                    }
                    if (!a3) {
                        return;
                    }
                    jVar.c("InitBootImage");
                }
            });
        }
        if (!a2 || (application = this.c) == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new a() { // from class: tb.nsl.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.launcher.bootstrap.tao.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                    return;
                }
                nsl.a(nsl.this, activity);
                nsl.f(nsl.this).unregisterActivityLifecycleCallbacks(this);
            }
        });
    }

    private void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        Intent intent = activity.getIntent();
        if (intent == null || !intent.getBooleanExtra(ScheduleComposer.PARCEL_KEY_BOOT_IMAGE_AD, false)) {
            return;
        }
        BootstrapMode.a(256);
        h.b("NGNextScheduleComposer", "awaitLoadedLocked for boot image");
        synchronized (g) {
            c();
        }
        h.b("NGNextScheduleComposer", "awaitLoadedLocked for boot image finished");
        e g2 = this.b.g();
        if (!(g2 instanceof g)) {
            return;
        }
        ((g) g2).a("m-boot-image-extra", new g.a<String>() { // from class: tb.nsl.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.launcher.common.g.a
            public void a(j<String> jVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("707ae49a", new Object[]{this, jVar});
                } else {
                    jVar.c("InitPopConfigLoadTask");
                }
            }
        });
    }

    private void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else {
            this.b.g().s();
        }
    }

    private void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        Application application = this.c;
        if (!(application instanceof PanguApplication)) {
            return;
        }
        ((PanguApplication) application).registerCrossActivityLifecycleCallback(new b() { // from class: tb.nsl.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.launcher.bootstrap.tao.b, com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
            public void onStarted(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4b167bb", new Object[]{this, activity});
                } else {
                    nsl.g(nsl.this).f().c(activity);
                }
            }

            @Override // com.taobao.android.launcher.bootstrap.tao.b, com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
            public void onStopped(Activity activity) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("82d37207", new Object[]{this, activity});
                } else {
                    nsl.g(nsl.this).f().d(activity);
                }
            }
        });
    }
}
