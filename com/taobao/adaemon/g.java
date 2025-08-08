package com.taobao.adaemon;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.AccsException;
import com.taobao.accs.IHeartBeat;
import com.taobao.accs.connection.state.TimeMeter;
import com.taobao.accs.connection.state.a;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.adaemon.ProcessController;
import com.taobao.adaemon.g;
import com.taobao.adaemon.k;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.aranger.exception.IPCException;
import com.taobao.artc.api.AConstants;
import com.taobao.tao.TBMainHost;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.eoe;
import tb.gvk;
import tb.kap;
import tb.kat;
import tb.kge;
import tb.lsk;
import tb.mto;
import tb.qgv;
import tb.qgw;
import tb.suq;

/* loaded from: classes.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean G;
    private static volatile boolean l;
    private static boolean r;
    private Integer A;
    public volatile Boolean B;
    private boolean C;
    private eoe D;
    public long E;
    private volatile String F;
    private volatile int H;
    private String I;
    private String J;
    private long K;
    private b L;

    /* renamed from: a */
    private String f8346a;
    private SharedPreferences b;
    private SharedPreferences.Editor c;
    private long d;
    private long e;
    private String f;
    private String g;
    private boolean h;
    private long i;
    private long j;
    private Context k;
    private final AtomicBoolean m;
    private final AtomicBoolean n;
    private final List<WeakReference<Activity>> o;
    private volatile h p;
    private boolean q;
    private final SceneIdentifier.a s;
    private final ComponentCallbacks2 t;
    private final IHeartBeat u;
    private final a.b v;
    private final Application.ActivityLifecycleCallbacks w;
    private final IRemoteProcessHandler x;
    private final BroadcastReceiver y;
    private final Runnable z;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public static final g f8357a;

        static {
            kge.a(1814249911);
            f8357a = new g(null);
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a */
        public int f8358a;
        public String b = "";
        public String c = "";
        public String d = "";
        public long e = 0;
        public long f = 0;
        public long g = 0;

        static {
            kge.a(-1164103492);
        }

        public b() {
            g.this = r3;
        }
    }

    public static /* synthetic */ void lambda$H6DeiOy0BAiDhie_1MuU2CU078o(g gVar, Context context) {
        gVar.k(context);
    }

    /* renamed from: lambda$IW46FAJW-RGyqZ499xGd9lRcGfs */
    public static /* synthetic */ void m814lambda$IW46FAJWRGyqZ499xGd9lRcGfs(g gVar, Boolean bool, String str, String str2) {
        gVar.a(bool, str, str2);
    }

    /* renamed from: lambda$NB5FF4qpUsXreg-MKmjBDr1136A */
    public static /* synthetic */ void m815lambda$NB5FF4qpUsXregMKmjBDr1136A(g gVar) {
        gVar.p();
    }

    public static /* synthetic */ void lambda$TW923bVuUrBThHr8x8vmTdti2vs(g gVar) {
        gVar.r();
    }

    /* renamed from: lambda$cVSIJ-CzSUK-Mw63y3Vm0acESLY */
    public static /* synthetic */ void m816lambda$cVSIJCzSUKMw63y3Vm0acESLY(g gVar) {
        gVar.u();
    }

    public static /* synthetic */ void lambda$v_dE1ZtlnjZRWVq89dDENvsiIBQ(g gVar, Context context) {
        gVar.e(context);
    }

    public static /* synthetic */ void lambda$w9B5dKijboMrDhn9eKizZbp4P9w(g gVar) {
        gVar.q();
    }

    public /* synthetic */ g(AnonymousClass1 anonymousClass1) {
        this();
    }

    public static /* synthetic */ int a(g gVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("99d7fd29", new Object[]{gVar, new Integer(i)})).intValue();
        }
        gVar.H = i;
        return i;
    }

    public static /* synthetic */ Context a(g gVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("3d8b4af3", new Object[]{gVar, context});
        }
        gVar.k = context;
        return context;
    }

    public static /* synthetic */ SharedPreferences.Editor a(g gVar, SharedPreferences.Editor editor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences.Editor) ipChange.ipc$dispatch("37d03fe9", new Object[]{gVar, editor});
        }
        gVar.c = editor;
        return editor;
    }

    public static /* synthetic */ String a(g gVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a0b9589", new Object[]{gVar, str});
        }
        gVar.g = str;
        return str;
    }

    public static /* synthetic */ eoe a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eoe) ipChange.ipc$dispatch("d5edc4de", new Object[]{gVar}) : gVar.D;
    }

    public static /* synthetic */ void a(g gVar, Activity activity, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e23abdee", new Object[]{gVar, activity, bool});
        } else {
            gVar.a(activity, bool);
        }
    }

    public static /* synthetic */ boolean a(g gVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99d83d0b", new Object[]{gVar, new Boolean(z)})).booleanValue();
        }
        gVar.h = z;
        return z;
    }

    public static /* synthetic */ SharedPreferences.Editor b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences.Editor) ipChange.ipc$dispatch("6c532c83", new Object[]{gVar}) : gVar.c;
    }

    public static /* synthetic */ String b(g gVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce4a0528", new Object[]{gVar, str});
        }
        gVar.F = str;
        return str;
    }

    public static /* synthetic */ boolean b(g gVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8aa9446a", new Object[]{gVar, new Boolean(z)})).booleanValue();
        }
        gVar.C = z;
        return z;
    }

    public static /* synthetic */ boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d6ac0f", new Object[]{new Boolean(z)})).booleanValue();
        }
        r = z;
        return z;
    }

    public static /* synthetic */ SharedPreferences c(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("5ab2ba03", new Object[]{gVar}) : gVar.b;
    }

    public static /* synthetic */ boolean c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8b84ae", new Object[]{new Boolean(z)})).booleanValue();
        }
        l = z;
        return z;
    }

    public static /* synthetic */ List d(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("9a49a697", new Object[]{gVar}) : gVar.o;
    }

    public static /* synthetic */ void e(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24092671", new Object[]{gVar});
        } else {
            gVar.j();
        }
    }

    public static /* synthetic */ void f(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d5a3732", new Object[]{gVar});
        } else {
            gVar.h();
        }
    }

    public static /* synthetic */ void g(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96ab47f3", new Object[]{gVar});
        } else {
            gVar.d();
        }
    }

    public static /* synthetic */ AtomicBoolean h(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("d347acf4", new Object[]{gVar}) : gVar.n;
    }

    public static /* synthetic */ String i(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ff803cb", new Object[]{gVar}) : gVar.f8346a;
    }

    public static /* synthetic */ String j(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d2e46d2a", new Object[]{gVar}) : gVar.g;
    }

    public static /* synthetic */ Context k(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("d31834ef", new Object[]{gVar}) : gVar.k;
    }

    public static /* synthetic */ String l(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("58bd3fe8", new Object[]{gVar}) : gVar.F;
    }

    public static /* synthetic */ int m(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ee91ac6c", new Object[]{gVar})).intValue() : gVar.H;
    }

    public static /* synthetic */ boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[0])).booleanValue() : l;
    }

    public static /* synthetic */ void n(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27e2bd3a", new Object[]{gVar});
        } else {
            gVar.g();
        }
    }

    public static /* synthetic */ void o(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6133cdfb", new Object[]{gVar});
        } else {
            gVar.n();
        }
    }

    public static /* synthetic */ long p(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9a84deb0", new Object[]{gVar})).longValue() : gVar.e;
    }

    public static /* synthetic */ boolean q(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d3d5ef81", new Object[]{gVar})).booleanValue() : gVar.e();
    }

    public static /* synthetic */ void r(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d27003e", new Object[]{gVar});
        } else {
            gVar.f();
        }
    }

    public static /* synthetic */ AtomicBoolean s(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("31c8d77f", new Object[]{gVar}) : gVar.m;
    }

    static {
        kge.a(241127193);
        l = false;
        r = false;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : l || r;
    }

    /* renamed from: com.taobao.adaemon.g$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements SceneIdentifier.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: lambda$EAt8kbshvkVDL-PNUaa2YjPxu0I */
        public static /* synthetic */ void m817lambda$EAt8kbshvkVDLPNUaa2YjPxu0I(AnonymousClass1 anonymousClass1) {
            anonymousClass1.d();
        }

        public static /* synthetic */ void lambda$i6Cx_BvyVq5pbX9PBzAHZvD3qnc(AnonymousClass1 anonymousClass1) {
            anonymousClass1.c();
        }

        public AnonymousClass1() {
            g.this = r1;
        }

        @Override // com.taobao.analysis.scene.SceneIdentifier.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            e.b("LocalProcM", "foreground()", new Object[0]);
            g.b(true);
            c.a(new Runnable() { // from class: com.taobao.adaemon.-$$Lambda$g$1$i6Cx_BvyVq5pbX9PBzAHZvD3qnc
                {
                    g.AnonymousClass1.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    g.AnonymousClass1.lambda$i6Cx_BvyVq5pbX9PBzAHZvD3qnc(g.AnonymousClass1.this);
                }
            });
            final eoe.c cVar = g.a(g.this).c;
            cVar.getClass();
            c.b(new Runnable() { // from class: com.taobao.adaemon.-$$Lambda$zi0AoGdIgB1kdWgigMNXFB4pK-g
                @Override // java.lang.Runnable
                public final void run() {
                    eoe.c.this.c();
                }
            });
        }

        public /* synthetic */ void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            g.e(g.this);
            g.a(g.this, false);
            g.f(g.this);
            g.g(g.this);
            if (!g.h(g.this).get()) {
                return;
            }
            ProcessController.b.a(g.i(g.this), false, null);
        }

        @Override // com.taobao.analysis.scene.SceneIdentifier.a
        public void b() {
            Activity activity;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            e.b("LocalProcM", "background()", new Object[0]);
            g.b(true);
            g.this.a(true);
            c.b(new Runnable() { // from class: com.taobao.adaemon.-$$Lambda$g$1$EAt8kbshvkVDL-PNUaa2YjPxu0I
                {
                    g.AnonymousClass1.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    g.AnonymousClass1.m817lambda$EAt8kbshvkVDLPNUaa2YjPxu0I(g.AnonymousClass1.this);
                }
            });
            if (g.b(g.this) == null) {
                g gVar = g.this;
                g.a(gVar, g.c(gVar).edit());
            }
            long currentTimeMillis = System.currentTimeMillis();
            List d = g.d(g.this);
            if (!d.isEmpty() && (activity = (Activity) ((WeakReference) d.get(d.size() - 1)).get()) != null) {
                g.b(g.this).putString("background_page", activity.getLocalClassName());
                if (activity.getIntent() != null) {
                    activity.getIntent().getDataString();
                }
            }
            g.b(g.this).putLong("background_time", currentTimeMillis);
            g.b(g.this).apply();
        }

        public /* synthetic */ void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
                return;
            }
            g.a(g.this).c.b();
            g.a(g.this).e.b();
        }
    }

    private SharedPreferences j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("e027200b", new Object[]{this, context});
        }
        if (this.b == null) {
            this.b = context.getSharedPreferences(l.a(context).replace(":", "_") + "_adaemon", 4);
        }
        return this.b;
    }

    public long h(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a2d615ad", new Object[]{this, context})).longValue() : j(context).getLong("background_time", 0L);
    }

    public String i(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("67970e48", new Object[]{this, context}) : j(context).getString("background_page", "");
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences == null) {
            e.b("LocalProcM", "recordForegroundDay empty mPreferences", new Object[0]);
            return;
        }
        if (this.c == null) {
            this.c = sharedPreferences.edit();
        }
        this.c.putInt("adaemon_foreground_day", Calendar.getInstance().get(6)).apply();
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            return sharedPreferences.getInt("adaemon_foreground_day", -1) == Calendar.getInstance().get(6);
        }
        e.b("LocalProcM", "hasBeenForeToday empty mPreferences", new Object[0]);
        return false;
    }

    public void a(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            c.a(new Runnable() { // from class: com.taobao.adaemon.g.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    g.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        g.e(g.this);
                        g.a(g.this, true);
                        Thread.sleep(500L);
                        g.a(g.this, SceneIdentifier.getBgType());
                        g.f(g.this);
                        e.b("LocalProcM", "doBackground", "coreProcessReady", Boolean.valueOf(g.h(g.this).get()), "needIPC", Boolean.valueOf(z));
                        if (!g.h(g.this).get() || !z) {
                            return;
                        }
                        ProcessController.b.a(g.i(g.this), true, g.j(g.this));
                    } catch (Throwable th) {
                        e.a("LocalProcM", "doBackground err", th, new Object[0]);
                    }
                }
            });
        }
    }

    public String s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("255e0466", new Object[]{this}) : this.F;
    }

    public int t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6782aee", new Object[]{this})).intValue() : this.H;
    }

    /* renamed from: com.taobao.adaemon.g$9 */
    /* loaded from: classes.dex */
    public class AnonymousClass9 implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String b = "com.taobao.tao.welcome.Welcome";
        private String c = lsk.BIZ_NAME;
        private int d;

        public static /* synthetic */ void lambda$5RcWGAbNuzrWBqHuhucNBdGfG7o(AnonymousClass9 anonymousClass9, Activity activity) {
            anonymousClass9.c(activity);
        }

        public static /* synthetic */ void lambda$MPNFYHkqpOSglk3FuzGN4N2UGUE(AnonymousClass9 anonymousClass9, Activity activity) {
            anonymousClass9.b(activity);
        }

        public static /* synthetic */ void lambda$cIRUl5DUnvYsAvhWg8rdv3ZR5PY(AnonymousClass9 anonymousClass9) {
            anonymousClass9.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        public AnonymousClass9() {
            g.this = r1;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(final Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                return;
            }
            if (!g.m()) {
                g.c(true);
                a(activity);
            }
            String localClassName = activity.getLocalClassName();
            e.b("LocalProcM", "onActivityCreated", "name", localClassName);
            c.a(new Runnable() { // from class: com.taobao.adaemon.-$$Lambda$g$9$5RcWGAbNuzrWBqHuhucNBdGfG7o
                {
                    g.AnonymousClass9.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    g.AnonymousClass9.lambda$5RcWGAbNuzrWBqHuhucNBdGfG7o(g.AnonymousClass9.this, activity);
                }
            });
            if (!a(localClassName)) {
                return;
            }
            qgv.a().a(activity);
        }

        public /* synthetic */ void c(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("792c473c", new Object[]{this, activity});
            } else {
                g.d(g.this).add(new WeakReference(activity));
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
                return;
            }
            String localClassName = activity.getLocalClassName();
            if (ADaemon.curTabIndex <= 0 && (this.b.equals(localClassName) || this.c.equals(localClassName))) {
                qgv.a().a(g.k(g.this), 10102);
            }
            int i = this.d;
            this.d = i + 1;
            if (i != 0) {
                return;
            }
            g.a(g.this, activity, (Boolean) true);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                return;
            }
            String localClassName = activity.getLocalClassName();
            g.b(g.this, localClassName);
            g.a(g.this, activity.hashCode());
            e.b("LocalProcM", "onActivityResumed", "name", g.l(g.this), "hash", Integer.valueOf(g.m(g.this)));
            if (!a(localClassName)) {
                return;
            }
            qgv.a().a(g.m(g.this), 1);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
                return;
            }
            String localClassName = activity.getLocalClassName();
            int hashCode = activity.hashCode();
            e.b("LocalProcM", "onActivityPaused", "name", localClassName, "hash", Integer.valueOf(hashCode));
            if (!a(localClassName)) {
                return;
            }
            qgv.a().b(hashCode, 1);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                return;
            }
            String localClassName = activity.getLocalClassName();
            if (this.b.equals(localClassName) || this.c.equals(localClassName)) {
                qgv.a().a(g.k(g.this), 0);
            }
            int i = this.d - 1;
            this.d = i;
            if (i != 0) {
                return;
            }
            g.a(g.this, activity, (Boolean) false);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(final Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
                return;
            }
            String localClassName = activity.getLocalClassName();
            e.b("LocalProcM", "onActivityDestroyed", "name", localClassName);
            c.a(new Runnable() { // from class: com.taobao.adaemon.-$$Lambda$g$9$MPNFYHkqpOSglk3FuzGN4N2UGUE
                {
                    g.AnonymousClass9.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    g.AnonymousClass9.lambda$MPNFYHkqpOSglk3FuzGN4N2UGUE(g.AnonymousClass9.this, activity);
                }
            });
            if (!a(localClassName)) {
                return;
            }
            qgv.a().b(activity.hashCode());
        }

        public /* synthetic */ void b(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3fdb367b", new Object[]{this, activity});
                return;
            }
            for (int i = 0; i < g.d(g.this).size(); i++) {
                WeakReference weakReference = (WeakReference) g.d(g.this).get(i);
                if (weakReference != null && weakReference.get() != null && weakReference.get() == activity) {
                    g.d(g.this).remove(weakReference);
                }
            }
        }

        private boolean a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
            }
            if (com.taobao.android.live.plugin.proxy.e.TAO_LIVE_VIDEO_ACTIVITY.equals(str)) {
                return o.b();
            }
            if (!"com.taobao.android.detail2.core.framework.NewDetailActivity".equals(str)) {
                return false;
            }
            return o.c();
        }

        private void a(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
                return;
            }
            Context applicationContext = activity.getApplicationContext();
            if (g.k(g.this) == null) {
                g.a(g.this, applicationContext);
            }
            c.a(new Runnable() { // from class: com.taobao.adaemon.-$$Lambda$g$9$cIRUl5DUnvYsAvhWg8rdv3ZR5PY
                {
                    g.AnonymousClass9.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    g.AnonymousClass9.lambda$cIRUl5DUnvYsAvhWg8rdv3ZR5PY(g.AnonymousClass9.this);
                }
            }, 10L, TimeUnit.SECONDS);
            g.o(g.this);
        }

        public /* synthetic */ void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            try {
                if (j.a().a(g.k(g.this), suq.REFRESH_BROWSER_BADGE_DATA_ARGS_TRIGGER_TYPE, 0) == 0) {
                    return;
                }
                j.a().a(g.k(g.this), 0);
                j.a().b(g.k(g.this), AConstants.ArtcErrorServerErrorDropByMobility);
            } catch (Exception e) {
                e.a("LocalProcM", "reset trigger type error", e, new Object[0]);
            }
        }
    }

    private void a(Activity activity, final Boolean bool) {
        final String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87e74b53", new Object[]{this, activity, bool});
            return;
        }
        final String str2 = "";
        if (activity != null) {
            String localClassName = activity.getLocalClassName();
            if (activity.getIntent() != null) {
                str2 = activity.getIntent().getDataString();
            }
            str = str2;
            str2 = localClassName;
        } else {
            str = str2;
        }
        c.c(new Runnable() { // from class: com.taobao.adaemon.-$$Lambda$g$IW46FAJW-RGyqZ499xGd9lRcGfs
            {
                g.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                g.m814lambda$IW46FAJWRGyqZ499xGd9lRcGfs(g.this, bool, str2, str);
            }
        });
    }

    public /* synthetic */ void a(Boolean bool, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39de079", new Object[]{this, bool, str, str2});
            return;
        }
        try {
            o();
            String o = l.o(l.e());
            long currentTimeMillis = System.currentTimeMillis();
            if (bool == null) {
                boolean a2 = a();
                e.b("LocalProcM", "adaemon start", "launched", Boolean.valueOf(a2), "afcId", o);
                if (a2) {
                    return;
                }
                j(l.e()).edit().putInt("dead_pid", Process.myPid()).putString("invoke_first_bg_info", o).putLong("app_launch_time", ADaemon.appLaunchTimeInMill).remove("fore_time_first").remove("background_time_first").remove("background_page_first").remove("background_page_url").commit();
            } else if (bool.booleanValue()) {
                if (!StringUtils.isEmpty(this.I) && this.I.equals(o)) {
                    return;
                }
                e.b("LocalProcM", "fore afcId changed", "afcId", o);
                this.K = currentTimeMillis;
                this.I = o;
            } else if (!StringUtils.isEmpty(this.J) && this.J.equals(o)) {
            } else {
                e.b("LocalProcM", "background afcId changed", "backPage", str, "pageUrl", str2, "afcId", o);
                j(l.e()).edit().putInt("dead_pid", Process.myPid()).putString("invoke_first_bg_info", o).putLong("app_launch_time", ADaemon.appLaunchTimeInMill).putLong("fore_time_first", this.K).putLong("background_time_first", currentTimeMillis).putString("background_page_first", str).putString("background_page_url", str2).commit();
                this.J = o;
            }
        } catch (Throwable th) {
            e.a("LocalProcM", "updateForeAndBgStat err", th, new Object[0]);
        }
    }

    public b o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("b758c9e7", new Object[]{this});
        }
        if (this.L == null) {
            this.L = new b();
            SharedPreferences j = j(l.e());
            this.L.f8358a = j.getInt("dead_pid", 0);
            this.L.b = j.getString("invoke_first_bg_info", "");
            this.L.g = j.getLong("app_launch_time", 0L);
            this.L.e = j.getLong("fore_time_first", 0L);
            this.L.f = j.getLong("background_time_first", 0L);
            this.L.c = j.getString("background_page_first", "");
            this.L.d = j.getString("background_page_url", "");
            j.edit().remove("dead_pid").remove("invoke_first_bg_info").remove("app_launch_time").remove("fore_time_first").remove("background_time_first").remove("background_page_first").remove("background_page_url").commit();
        }
        return this.L;
    }

    /* renamed from: com.taobao.adaemon.g$10 */
    /* loaded from: classes.dex */
    public class AnonymousClass10 implements IRemoteProcessHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Map<Integer, qgw.a> b = null;

        public static /* synthetic */ void lambda$1UcK3A1Cuo5XcyYxDQQXs6ZJNzI(List list) {
            a(list);
        }

        @Override // com.taobao.adaemon.IRemoteProcessHandler
        public boolean isProcessLive() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e648f47c", new Object[]{this})).booleanValue();
            }
            return true;
        }

        public AnonymousClass10() {
            g.this = r1;
        }

        @Override // com.taobao.adaemon.IRemoteProcessHandler
        public long getLiveTime() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5281a44a", new Object[]{this})).longValue();
            }
            g.n(g.this);
            return g.p(g.this);
        }

        @Override // com.taobao.adaemon.IRemoteProcessHandler
        public boolean clearActivityStack() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("26833df7", new Object[]{this})).booleanValue();
            }
            int size = g.d(g.this).size();
            e.b("LocalProcM", "clearActivityStack:" + size, new Object[0]);
            try {
                boolean q = g.q(g.this);
                final ArrayList arrayList = new ArrayList();
                arrayList.addAll(g.d(g.this));
                if (!j.a().p() || q) {
                    List<String> j = j.a().j();
                    if (!j.isEmpty() && !arrayList.isEmpty()) {
                        WeakReference weakReference = (WeakReference) arrayList.get(arrayList.size() - 1);
                        String name = weakReference.get() == null ? "" : ((Activity) weakReference.get()).getClass().getName();
                        if (j.contains(name)) {
                            e.b("LocalProcM", "clearActivityStack block", "topActivityName", name);
                            return false;
                        }
                    }
                    if (j.a().u()) {
                        a();
                    }
                }
                if (j.a().m()) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.adaemon.-$$Lambda$g$10$1UcK3A1Cuo5XcyYxDQQXs6ZJNzI
                        @Override // java.lang.Runnable
                        public final void run() {
                            g.AnonymousClass10.lambda$1UcK3A1Cuo5XcyYxDQQXs6ZJNzI(arrayList);
                        }
                    });
                } else {
                    for (int i = 0; i < arrayList.size(); i++) {
                        WeakReference weakReference2 = (WeakReference) arrayList.get(i);
                        if (weakReference2 == null) {
                            e.b("LocalProcM", "ref null:", new Object[0]);
                        } else {
                            Activity activity = (Activity) weakReference2.get();
                            String localClassName = activity.getLocalClassName();
                            if (!activity.isFinishing()) {
                                e.b("LocalProcM", "finish activity:" + localClassName, new Object[0]);
                                activity.finish();
                            }
                        }
                    }
                }
                g.d(g.this).clear();
                return true;
            } catch (Exception e) {
                e.a("LocalProcM", "[clearActivityStack]", null, e);
                return false;
            }
        }

        public static /* synthetic */ void a(List list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{list});
                return;
            }
            for (int i = 0; i < list.size(); i++) {
                WeakReference weakReference = (WeakReference) list.get(i);
                if (weakReference == null) {
                    e.b("LocalProcM", "ref null:", new Object[0]);
                } else {
                    Activity activity = (Activity) weakReference.get();
                    String localClassName = activity.getLocalClassName();
                    if (!activity.isFinishing()) {
                        e.b("LocalProcM", "finish activity:" + localClassName, new Object[0]);
                        activity.finish();
                    }
                }
            }
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            try {
                com.taobao.android.linkback.d.a().c();
            } catch (Throwable th) {
                e.a("LocalProcM", "clearLinkBack err", th, new Object[0]);
            }
        }

        @Override // com.taobao.adaemon.IRemoteProcessHandler
        public boolean isBgFromHomePage() throws IPCException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("27d30792", new Object[]{this})).booleanValue();
            }
            String A = j.a().A();
            String str = null;
            if (StringUtils.isEmpty(A) || g.d(g.this).size() != 1) {
                e.a("LocalProcM", "isBgFromHomePage:", null, "homepage", A, "size", Integer.valueOf(g.d(g.this).size()));
                return false;
            }
            WeakReference weakReference = (WeakReference) g.d(g.this).get(0);
            if (weakReference == null || weakReference.get() == null) {
                return false;
            }
            String localClassName = ((Activity) weakReference.get()).getLocalClassName();
            e.a("LocalProcM", "isBgFromHomePage activity:" + localClassName, new Object[0]);
            if (A.equals(localClassName)) {
                if ("com.taobao.taobao".equals(g.k(g.this).getPackageName())) {
                    try {
                        str = TBMainHost.a().getCurrentFragment().getClass().getName();
                    } catch (Throwable th) {
                        e.a("LocalProcM", "isBgFromHomePage:", null, th);
                    }
                    if ("com.taobao.tao.homepage.HomepageFragment".equals(str)) {
                        e.a("LocalProcM", "to bg from home fragment", new Object[0]);
                        return true;
                    }
                } else {
                    e.a("LocalProcM", "to bg from home page", new Object[0]);
                    return true;
                }
            }
            return false;
        }

        @Override // com.taobao.adaemon.IRemoteProcessHandler
        public boolean isTinyProcess() throws IPCException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("18d6b9d0", new Object[]{this})).booleanValue();
            }
            try {
                if (gvk.a(gvk.a()) == -2 || TriggerService.h) {
                    if (!g.a()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                e.a("LocalProcM", "isTinyProcess err", th, new Object[0]);
                return false;
            }
        }

        @Override // com.taobao.adaemon.IRemoteProcessHandler
        public String getMainProcCpuCost() throws IPCException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3462cd49", new Object[]{this});
            }
            Pair<Long, Long> h = l.h();
            if (h == null) {
                return null;
            }
            return h.first + "," + h.second;
        }

        @Override // com.taobao.adaemon.IRemoteProcessHandler
        public void tryDumpMainProc(long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fcfa0e5", new Object[]{this, new Long(j), new Long(j2)});
                return;
            }
            try {
                ((eoe.a) g.a(g.this).f27489a).a(j, j2);
            } catch (Throwable th) {
                e.a("LocalProcM", "tryDumpMainProc", th, new Object[0]);
            }
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        ProcessController.b.a(this.f8346a, this.x);
        ProcessController.b.a(this.f8346a, this.h, StringUtils.isEmpty(this.g) ? "init" : this.g);
        this.n.set(true);
    }

    private g() {
        this.f = "";
        this.h = false;
        this.i = 0L;
        this.m = new AtomicBoolean(false);
        this.n = new AtomicBoolean(false);
        this.o = new ArrayList();
        this.q = false;
        this.s = new AnonymousClass1();
        this.E = 0L;
        this.t = new ComponentCallbacks2() { // from class: com.taobao.adaemon.g.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration configuration) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
                }
            }

            {
                g.this = this;
            }

            @Override // android.content.ComponentCallbacks2
            public void onTrimMemory(final int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
                } else if (SystemClock.elapsedRealtime() - g.this.E < 300000) {
                } else {
                    e.b("LocalProcM", "onTrimMemory", "level", Integer.valueOf(i));
                    g.this.E = SystemClock.elapsedRealtime();
                    c.a(new Runnable() { // from class: com.taobao.adaemon.g.6.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        {
                            AnonymousClass6.this = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (!g.h(g.this).get()) {
                            } else {
                                ProcessController.b.a(g.i(g.this), i);
                            }
                        }
                    });
                }
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
                } else {
                    e.b("LocalProcM", "onLowMemory", new Object[0]);
                }
            }
        };
        this.u = new IHeartBeat() { // from class: com.taobao.adaemon.g.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                g.this = this;
            }

            @Override // com.taobao.accs.IHeartBeat
            public void onPingSuccess(String str) throws IPCException {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("290e2be3", new Object[]{this, str});
                    return;
                }
                g.this.a(0L, false);
                if (!j.a().H()) {
                    return;
                }
                g.b().c();
            }

            @Override // com.taobao.accs.IHeartBeat
            public void onPingTimeout(String str) throws IPCException {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b586bec1", new Object[]{this, str});
                    return;
                }
                g.this.a(0L, false);
                if (!j.a().H()) {
                    return;
                }
                g.b().c();
            }
        };
        this.v = new a.b() { // from class: com.taobao.adaemon.g.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                g.this = this;
            }

            @Override // com.taobao.accs.connection.state.a.b
            public void b(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
                    return;
                }
                e.b("LocalProcM", "onProcessLaunched", "process", str);
                if (!g.k(g.this).getPackageName().equals(str)) {
                    return;
                }
                g.b(g.this, true);
            }

            @Override // com.taobao.accs.connection.state.a.b
            public void a(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                e.b("LocalProcM", "onProcessDied", "process", str);
                if (!g.k(g.this).getPackageName().equals(str)) {
                    return;
                }
                g.this.a(0L, true);
                if (!j.a().H()) {
                    return;
                }
                g.this.l();
            }
        };
        this.w = new AnonymousClass9();
        this.x = new AnonymousClass10();
        this.y = new BroadcastReceiver() { // from class: com.taobao.adaemon.LocalProcessMonitor$8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                String action = intent.getAction();
                e.b("LocalProcM", "channelProcessReceiver", "action", action);
                if (!"com.taobao.adaemon.CORE_PROCESS_CREATED".equals(action)) {
                    return;
                }
                c.a(new Runnable() { // from class: com.taobao.adaemon.LocalProcessMonitor$8.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            g.r(g.this);
                        }
                    }
                });
            }
        };
        this.z = new Runnable() { // from class: com.taobao.adaemon.g.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                g.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!g.s(g.this).get()) {
                } else {
                    g.n(g.this);
                    g.f(g.this);
                    if (j.a().H()) {
                        g.b().c();
                    }
                    c.a(this, 300000L, TimeUnit.MILLISECONDS);
                }
            }
        };
        this.A = null;
        this.D = new eoe();
    }

    public static g b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("9260a0d2", new Object[0]) : a.f8357a;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this.w);
        }
    }

    public void b(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        try {
            if (!this.m.compareAndSet(false, true)) {
                return;
            }
            this.k = context;
            this.f8346a = l.a(context);
            this.d = SystemClock.elapsedRealtime();
            this.j = System.currentTimeMillis();
            this.b = context.getSharedPreferences(this.f8346a.replace(":", "_") + "_adaemon", 4);
            this.q = l.g(context);
            if (this.q && j.a().H()) {
                g(this.k);
                this.D.a(true);
            }
            a((Long) null);
            i();
            d(context);
            boolean e = l.e(context);
            if (this.q) {
                e.b("LocalProcM", "channel send", "action", "com.taobao.adaemon.CORE_PROCESS_CREATED");
                Intent intent = new Intent();
                intent.setPackage(context.getPackageName());
                intent.setAction("com.taobao.adaemon.CORE_PROCESS_CREATED");
                context.sendBroadcast(intent);
                this.n.set(true);
                try {
                    this.p = new h(this.k);
                    ACCSClient.getAccsClient().registerHeartBeatListener(this.u);
                    com.taobao.accs.connection.state.a.a().a(this.v);
                } catch (AccsException e2) {
                    e.b("LocalProcM", "initialize channel err", "", e2);
                }
                c.a(new Runnable() { // from class: com.taobao.adaemon.-$$Lambda$g$H6DeiOy0BAiDhie_1MuU2CU078o
                    {
                        g.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        g.lambda$H6DeiOy0BAiDhie_1MuU2CU078o(g.this, context);
                    }
                });
            } else {
                e.a("LocalProcM", "register broadcast", new Object[0]);
                if (j.a().G()) {
                    this.h = !e;
                }
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.taobao.adaemon.CORE_PROCESS_CREATED");
                context.registerReceiver(this.y, intentFilter);
                if (l.i(context)) {
                    f();
                }
                c.a(new Runnable() { // from class: com.taobao.adaemon.-$$Lambda$g$v_dE1ZtlnjZRWVq89dDENvsiIBQ
                    {
                        g.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        g.lambda$v_dE1ZtlnjZRWVq89dDENvsiIBQ(g.this, context);
                    }
                }, 15000L, TimeUnit.MILLISECONDS);
                a((Activity) null, (Boolean) null);
            }
            SceneIdentifier.registerLifecycleListener(this.s);
            if (UtilityImpl.isMainProcess(context) && !e) {
                a(false);
            }
            context.getApplicationContext().registerComponentCallbacks(this.t);
            this.E = 0L;
            c.a(this.z, 300000L, TimeUnit.MILLISECONDS);
            c.a(new Runnable() { // from class: com.taobao.adaemon.g.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    g.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        g.this.a(0, false);
                    }
                }
            }, 60000L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            e.b("LocalProcM", "initialize proc monitor error", "", th);
        }
    }

    public /* synthetic */ void k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4dc1896", new Object[]{this, context});
        } else {
            c(context);
        }
    }

    public /* synthetic */ void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d012dc", new Object[]{this, context});
        } else if (this.n.get() || !l.i(context)) {
        } else {
            f();
        }
    }

    private void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
        } else if (Build.VERSION.SDK_INT >= 23 && j.a().t()) {
            int i = Calendar.getInstance().get(6);
            if (this.b.getInt("app_collect_day", -1) == i) {
                e.b("LocalProcM", "collect freq", new Object[0]);
                return;
            }
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent();
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 131072);
            if (queryIntentActivities == null || queryIntentActivities.isEmpty()) {
                e.b("LocalProcM", "collecting, empty dev list", new Object[0]);
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null && activityInfo.applicationInfo != null && (activityInfo.applicationInfo.flags & 1) == 0) {
                    sb.append(resolveInfo.activityInfo.packageName);
                    sb.append(",");
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            String sb2 = sb.toString();
            kat.a(k.MODULE_NAME, k.e, sb2, mto.a.GEO_NOT_SUPPORT);
            if (this.c == null) {
                this.c = this.b.edit();
            }
            this.c.putInt("app_collect_day", i).apply();
            e.a("LocalProcM", "collect result", "result", sb2);
            e.b("LocalProcM", "collect finish", new Object[0]);
        }
    }

    private synchronized void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.e += elapsedRealtime - this.d;
        this.f += "|" + l.b();
        if (this.c == null) {
            this.c = this.b.edit();
        }
        this.c.putLong(this.f8346a + "_processLiveTime_v2", this.e);
        this.c.putString(this.f8346a + "_processMemTrace", this.f);
        this.c.putString(this.f8346a + "_sw", String.valueOf(j.a().b(this.k)));
        this.c.apply();
        this.d = elapsedRealtime;
        e.b("LocalProcM", "updateProcessLiveTime", "mProcessName", this.f8346a, "mLiveTime", Long.valueOf(this.e));
        int i = Calendar.getInstance().get(6);
        j a2 = j.a();
        if (this.A != null && this.A.intValue() != i) {
            e.b("LocalProcM", "DAY_OF_YEAR changed", "tmpDay", Integer.valueOf(i), "dayOfYear", this.A);
            a(Long.valueOf(this.e));
        }
        int v = a2.v();
        if (v >= 30 && (this.e / 300000) % v == 0) {
            e.b("LocalProcM", "recordUsedMemStat per 2hour", "liveTime", Long.valueOf(this.e));
            if (l.g(this.k) && j.a().y()) {
                try {
                    MemArt.a(this.k, 0L);
                } catch (Exception e) {
                    e.b("LocalProcM", e.getMessage(), new Object[0]);
                }
            } else {
                a(3, false);
            }
        }
        this.A = Integer.valueOf(i);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.j == 0) {
            this.j = currentTimeMillis;
            return;
        }
        k.a aVar = new k.a(this.f8346a);
        aVar.c = this.h;
        aVar.e = this.g;
        aVar.d = l.a();
        this.i += currentTimeMillis - this.j;
        aVar.f = this.i;
        if (this.c == null) {
            this.c = this.b.edit();
        }
        this.c.putString(this.f8346a + "_lifecycleLiveStat", aVar.b());
        this.c.apply();
        this.j = currentTimeMillis;
    }

    private void a(Long l2) {
        long longValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed6d4a7", new Object[]{this, l2});
            return;
        }
        if (l2 == null) {
            SharedPreferences sharedPreferences = this.b;
            longValue = sharedPreferences.getLong(this.f8346a + "_processLiveTime_v2", 0L);
        } else {
            longValue = l2.longValue();
        }
        if (longValue == 0) {
            return;
        }
        SharedPreferences sharedPreferences2 = this.b;
        String string = sharedPreferences2.getString(this.f8346a + "_processMemTrace", "");
        SharedPreferences sharedPreferences3 = this.b;
        String string2 = sharedPreferences3.getString(this.f8346a + "_sw", "");
        k.d dVar = new k.d(this.f8346a);
        dVar.c = longValue;
        dVar.d = string;
        dVar.e = l.a();
        dVar.f = string2;
        dVar.a();
        e.b("LocalProcM", "recordLastLiveTime", "mProcessName", this.f8346a, "lastLiveTime", Long.valueOf(longValue));
        this.e = 0L;
        this.f = "";
        if (this.c == null) {
            this.c = this.b.edit();
        }
        SharedPreferences.Editor editor = this.c;
        SharedPreferences.Editor remove = editor.remove(this.f8346a + "_processLiveTime");
        SharedPreferences.Editor remove2 = remove.remove(this.f8346a + "_processLiveTime_v2");
        SharedPreferences.Editor remove3 = remove2.remove(this.f8346a + "_processMemTrace");
        remove3.remove(this.f8346a + "_sw").apply();
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = this.b;
        String string = sharedPreferences.getString(this.f8346a + "_lifecycleLiveStat", null);
        if (StringUtils.isEmpty(string)) {
            return;
        }
        k.a aVar = new k.a(this.f8346a);
        aVar.a(string);
        if (aVar.f == 0) {
            return;
        }
        aVar.b = 1;
        aVar.a();
        SharedPreferences.Editor edit = this.b.edit();
        edit.remove(this.f8346a + "_lifecycleLiveStat").apply();
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.j == 0) {
            this.j = currentTimeMillis;
            return;
        }
        k.a aVar = new k.a(this.f8346a);
        aVar.c = this.h;
        aVar.e = this.g;
        aVar.d = l.a();
        this.i += currentTimeMillis - this.j;
        aVar.f = this.i;
        aVar.b = 0;
        aVar.a();
        this.i = 0L;
        this.j = currentTimeMillis;
    }

    private void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{this, context});
        } else if (Build.VERSION.SDK_INT < 30) {
        } else {
            try {
                String b2 = n.b(context, com.taobao.aranger.utils.c.a());
                if (!StringUtils.isEmpty(b2)) {
                    new k.b().a(b2);
                } else {
                    e.b("LocalProcM", "empty dead info", new Object[0]);
                }
            } catch (Throwable th) {
                e.b("LocalProcM", "recordProcessDeadInfo err", "", th);
            }
        }
    }

    public void a(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1206f8", new Object[]{this, new Long(j), new Boolean(z)});
        } else if (!this.m.get()) {
            e.b("LocalProcM", "startTargetProcess not init", new Object[0]);
        } else if (this.p == null) {
        } else {
            this.p.a(j, z);
        }
    }

    public void a(int i, boolean z) {
        Debug.MemoryInfo m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (!j.a().F() && !l.g(this.k)) {
        } else {
            try {
                if (z) {
                    m = l.h(this.k);
                } else {
                    m = l.m(this.k);
                }
                k.c cVar = new k.c(this.f8346a);
                cVar.b = i;
                cVar.d = l.a();
                cVar.e = l.b();
                cVar.f = m == null ? 0 : m.getTotalPss();
                cVar.g = m == null ? 0 : m.getTotalPrivateClean();
                cVar.h = m == null ? 0 : m.getTotalPrivateDirty();
                if (Build.VERSION.SDK_INT >= 23) {
                    cVar.i = m == null ? 0 : Integer.parseInt(m.getMemoryStat("summary.java-heap"));
                    cVar.j = m == null ? 0 : Integer.parseInt(m.getMemoryStat("summary.native-heap"));
                    cVar.l = m == null ? 0 : Integer.parseInt(m.getMemoryStat("summary.code"));
                    cVar.m = m == null ? 0 : Integer.parseInt(m.getMemoryStat("summary.stack"));
                    cVar.n = m == null ? 0 : Integer.parseInt(m.getMemoryStat("summary.private-other"));
                    cVar.o = m == null ? 0 : Integer.parseInt(m.getMemoryStat("summary.system"));
                }
                Runtime runtime = Runtime.getRuntime();
                cVar.k = ((float) (runtime.totalMemory() - runtime.freeMemory())) / ((float) runtime.maxMemory());
                cVar.c = this.g;
                cVar.a();
            } catch (Throwable th) {
                e.a("LocalProcM", "recordUsedMemStat error", null, th);
            }
        }
    }

    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
        } else {
            c.a(new Runnable() { // from class: com.taobao.adaemon.g.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    g.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (l.e(g.k(g.this))) {
                        e.b("LocalProcM", "mem stat, fg return", new Object[0]);
                    } else {
                        g.this.a(1, true);
                    }
                }
            }, j, TimeUnit.MILLISECONDS);
        }
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else if (G || !l.g()) {
        } else {
            m.a().a(this.k, 2);
            G = true;
            e.b("LocalProcM", "linkLaunchRecord", new Object[0]);
        }
    }

    public boolean g(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2296a1e", new Object[]{this, context})).booleanValue();
        }
        if (l.l(context)) {
            return this.h;
        }
        if (this.C) {
            this.B = null;
            this.C = false;
        }
        Boolean bool = this.B;
        if (bool == null) {
            if (com.taobao.accs.connection.state.a.a().a(context) && l.e(context)) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            this.B = valueOf;
            return valueOf.booleanValue();
        }
        return bool.booleanValue();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Context e = l.e();
        if (!g(e)) {
            return;
        }
        if (!kap.a()) {
            i = 10;
        }
        if (!TimeMeter.a("adaemon_wakeup", i * 60000)) {
            e.b("LocalProcM", "wakeup freq", new Object[0]);
        } else if (!l.g(e)) {
            c.b(new Runnable() { // from class: com.taobao.adaemon.-$$Lambda$g$TW923bVuUrBThHr8x8vmTdti2vs
                {
                    g.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    g.lambda$TW923bVuUrBThHr8x8vmTdti2vs(g.this);
                }
            });
        } else {
            c.b(new Runnable() { // from class: com.taobao.adaemon.-$$Lambda$g$cVSIJ-CzSUK-Mw63y3Vm0acESLY
                {
                    g.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    g.m816lambda$cVSIJCzSUKMw63y3Vm0acESLY(g.this);
                }
            });
        }
    }

    public /* synthetic */ void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        this.D.c.d();
        this.D.e.d();
    }

    public /* synthetic */ void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        e.b("LocalProcM", "wakeup", new Object[0]);
        this.D.f27489a.d();
        this.D.b.d();
        this.D.d.d();
        this.D.e.d();
        this.D.f.d();
        this.D.b();
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        e.b("LocalProcM", "onForeground", new Object[0]);
        this.B = false;
        c.b(new Runnable() { // from class: com.taobao.adaemon.-$$Lambda$g$w9B5dKijboMrDhn9eKizZbp4P9w
            {
                g.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                g.lambda$w9B5dKijboMrDhn9eKizZbp4P9w(g.this);
            }
        });
    }

    public /* synthetic */ void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        this.D.f27489a.c();
        this.D.b.c();
        this.D.d.c();
        this.D.e.d();
        this.D.f.d();
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        e.b("LocalProcM", "onBackground", "isBgInChannel", this.B);
        if (this.B == null) {
            kat.a(k.MODULE_NAME, k.f8365a, "bg_channel_null", mto.a.GEO_NOT_SUPPORT);
            return;
        }
        if (!this.B.booleanValue()) {
            c.b(new Runnable() { // from class: com.taobao.adaemon.-$$Lambda$g$NB5FF4qpUsXreg-MKmjBDr1136A
                {
                    g.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    g.m815lambda$NB5FF4qpUsXregMKmjBDr1136A(g.this);
                }
            });
        }
        this.B = true;
    }

    public /* synthetic */ void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        this.D.f27489a.b();
        this.D.b.b();
        this.D.d.b();
        this.D.e.b();
        this.D.f.b();
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.D.a(z);
        }
    }
}
