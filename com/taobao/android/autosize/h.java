package com.taobao.android.autosize;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.Choreographer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.config.a;
import com.taobao.android.autosize.orientation.ConfigChangeProvider;
import com.taobao.android.autosize.orientation.FoldPosture;
import com.taobao.application.common.IApmEventListener;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.huo;
import tb.hup;
import tb.lsk;
import tb.ruw;

/* loaded from: classes4.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile h f9101a;
    private static ArrayList<String> j;
    private static final List<String> r = new ArrayList();
    private int b;
    private float c;
    private int d;
    private int e;
    private Application g;
    private volatile int h;
    private volatile int i;
    private hup m;
    private int f = 375;
    private final List<OnScreenChangedListener> n = new CopyOnWriteArrayList();
    private final Set<OnScreenChangedListener> o = new CopyOnWriteArraySet();
    private final Set<OnScreenChangedListener> v = new CopyOnWriteArraySet();
    private final Handler p = new Handler(Looper.getMainLooper());
    private volatile boolean k = false;
    private volatile int q = 1;
    private volatile boolean s = false;
    private volatile boolean t = false;
    private volatile boolean u = true;

    public static /* synthetic */ int a(h hVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("12bc32d9", new Object[]{hVar, new Integer(i)})).intValue();
        }
        hVar.h = i;
        return i;
    }

    public static /* synthetic */ void a(h hVar, Configuration configuration, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daf2f825", new Object[]{hVar, configuration, activity});
        } else {
            hVar.a(configuration, activity);
        }
    }

    public static /* synthetic */ void a(h hVar, String str, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae2bc459", new Object[]{hVar, str, activity});
        } else {
            hVar.a(str, activity);
        }
    }

    public static /* synthetic */ boolean a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("42ab37c1", new Object[]{hVar})).booleanValue() : hVar.s;
    }

    public static /* synthetic */ boolean a(h hVar, Context context, Configuration configuration) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e294af69", new Object[]{hVar, context, configuration})).booleanValue() : hVar.a(context, configuration);
    }

    public static /* synthetic */ boolean a(h hVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12bc72bb", new Object[]{hVar, new Boolean(z)})).booleanValue();
        }
        hVar.s = z;
        return z;
    }

    public static /* synthetic */ int b(h hVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2664065a", new Object[]{hVar, new Integer(i)})).intValue();
        }
        hVar.i = i;
        return i;
    }

    public static /* synthetic */ Application b(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("137d1feb", new Object[]{hVar}) : hVar.g;
    }

    public static /* synthetic */ boolean b(h hVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2664463c", new Object[]{hVar, new Boolean(z)})).booleanValue();
        }
        hVar.u = z;
        return z;
    }

    public static /* synthetic */ int c(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2b29a86e", new Object[]{hVar})).intValue() : hVar.q;
    }

    public static /* synthetic */ int c(h hVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a0bd9db", new Object[]{hVar, new Integer(i)})).intValue();
        }
        hVar.q = i;
        return i;
    }

    public static /* synthetic */ List i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("9f84bbd7", new Object[0]) : r;
    }

    public static h a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("bba37c3d", new Object[0]);
        }
        if (f9101a == null) {
            synchronized (h.class) {
                if (f9101a == null) {
                    f9101a = new h();
                }
            }
        }
        return f9101a;
    }

    private h() {
        if (j == null) {
            j = new ArrayList<>();
        }
        j.add(lsk.BIZ_NAME);
        j.add("com.taobao.android.trade.cart.CartActivity");
        j.add("com.taobao.order.detail.ui.OrderDetailActivity");
        j.add("com.taobao.message.category.MsgCenterCategoryTabActivity");
        j.add("com.taobao.message.category.MsgCenterCategoryListActivity");
        j.add("com.taobao.message.category.MsgCenterCategoryActivity");
        j.add("com.taobao.order.list.OrderListActivity");
        j.add("com.taobao.android.purchase.TBPurchaseActivity");
        j.add("com.taobao.android.detail.wrapper.activity.DetailActivity");
        r.add("com.taobao.tao.welcome.Welcome");
        r.add(lsk.BIZ_NAME);
    }

    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
        } else if (this.k) {
            TLog.loge("TBAutoSize.ConfigInterface", "initialized, return");
        } else {
            this.k = true;
            this.g = application;
            final Configuration configuration = application.getResources().getConfiguration();
            this.b = configuration.densityDpi;
            this.c = application.getResources().getDisplayMetrics().density;
            int i = configuration.screenWidthDp;
            this.d = i;
            this.h = i;
            int i2 = configuration.screenHeightDp;
            this.e = i2;
            this.i = i2;
            this.f = application.getResources().getInteger(R.integer.designWidth);
            this.u = a((Context) application, configuration);
            TLog.loge("TBAutoSize.ConfigInterface", "init configuration done, new dpi = " + this.b + ", new widthDP = " + this.d + ", new heightDP = " + this.e);
            this.g.registerComponentCallbacks(new ComponentCallbacks() { // from class: com.taobao.android.autosize.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4bbd23dd", new Object[]{this});
                    }
                }

                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("eb2f300c", new Object[]{this, configuration2});
                        return;
                    }
                    h.a(h.this, configuration.screenWidthDp);
                    h.b(h.this, configuration.screenHeightDp);
                }
            });
            d(application);
            if (!a.a().l()) {
                j();
            }
            c(application);
            e(application);
            b(application);
            this.m = new hup();
            application.registerActivityLifecycleCallbacks(this.m);
        }
    }

    private void d(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77cb7254", new Object[]{this, application});
        } else {
            ConfigChangeProvider.a().a(new ruw<Activity, Configuration, Void>() { // from class: com.taobao.android.autosize.h.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Void, java.lang.Object] */
                @Override // tb.ruw
                /* renamed from: invoke */
                public /* synthetic */ Void mo2423invoke(Activity activity, Configuration configuration) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("77c951db", new Object[]{this, activity, configuration}) : a(activity, configuration);
                }

                public Void a(Activity activity, Configuration configuration) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("238b5c47", new Object[]{this, activity, configuration});
                    }
                    h.this.a(activity, configuration);
                    return null;
                }
            });
        }
    }

    public void a(final Activity activity, final Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fecf89f6", new Object[]{this, activity, configuration});
        } else {
            this.p.post(new Runnable() { // from class: com.taobao.android.autosize.h.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.taobao.android.autosize.h.3.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.view.Choreographer.FrameCallback
                            public void doFrame(long j2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j2)});
                                    return;
                                }
                                TLog.loge("TBAutoSize.ConfigInterface", "delayNotifyConfigurationChanged: activity=" + activity);
                                h.a(h.this, configuration, activity);
                            }
                        });
                    }
                }
            });
        }
    }

    private void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76721b16", new Object[]{this, application});
        } else {
            FoldPosture.a(application, new FoldPosture.a() { // from class: com.taobao.android.autosize.h.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.autosize.orientation.FoldPosture.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (a.a().l()) {
                        h.a(h.this, "checkByFoldPostureV2", (Activity) null);
                    } else if (!h.a(h.this)) {
                    } else {
                        h.a(h.this, "checkByFoldPosture", (Activity) null);
                        h.a(h.this, false);
                    }
                }

                @Override // com.taobao.android.autosize.orientation.FoldPosture.a
                public /* synthetic */ void a(String str) {
                    FoldPosture.a.CC.$default$a(this, str);
                }
            });
        }
    }

    @Deprecated
    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            com.taobao.application.common.c.a(new IApmEventListener() { // from class: com.taobao.android.autosize.h.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.application.common.IApmEventListener
                public void onEvent(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                    } else if (2 != i) {
                    } else {
                        h.a(h.this, "checkOnBgFg", (Activity) null);
                    }
                }
            });
        }
    }

    private void c(final Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("771ec6b5", new Object[]{this, application});
        } else {
            application.registerActivityLifecycleCallbacks(new huo() { // from class: com.taobao.android.autosize.h.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
                public /* synthetic */ void onActivityDestroyed(Activity activity) {
                    huo.CC.$default$onActivityDestroyed(this, activity);
                }

                @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
                public /* synthetic */ void onActivityPaused(Activity activity) {
                    huo.CC.$default$onActivityPaused(this, activity);
                }

                @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
                public /* synthetic */ void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    huo.CC.$default$onActivitySaveInstanceState(this, activity, bundle);
                }

                @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
                public /* synthetic */ void onActivityStarted(Activity activity) {
                    huo.CC.$default$onActivityStarted(this, activity);
                }

                @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
                public /* synthetic */ void onActivityStopped(Activity activity) {
                    huo.CC.$default$onActivityStopped(this, activity);
                }

                @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(final Activity activity, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                        return;
                    }
                    if (h.i().contains(activity.getClass().getName())) {
                        h.a(h.this, "checkOnActivityCreatedLifecycle", activity);
                    }
                    h hVar = h.this;
                    Application application2 = application;
                    h.b(hVar, h.a(hVar, application2, application2.getResources().getConfiguration()));
                    f.a(activity, true);
                    if (!(activity instanceof FragmentActivity)) {
                        return;
                    }
                    ((FragmentActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks() { // from class: com.taobao.android.autosize.h.7.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                            if (str.hashCode() == 632639987) {
                                super.onFragmentCreated((FragmentManager) objArr[0], (Fragment) objArr[1], (Bundle) objArr[2]);
                                return null;
                            }
                            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                        }

                        @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
                        public void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle2) {
                            IpChange ipChange3 = $ipChange;
                            boolean z = true;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("25b551f3", new Object[]{this, fragmentManager, fragment, bundle2});
                                return;
                            }
                            super.onFragmentCreated(fragmentManager, fragment, bundle2);
                            if (f.c(activity, false) == f.c(activity, true)) {
                                z = false;
                            }
                            if (!z) {
                                return;
                            }
                            h hVar2 = h.this;
                            Activity activity2 = activity;
                            hVar2.a(activity2, activity2.getResources().getConfiguration());
                        }
                    }, true);
                }

                @Override // tb.huo, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    boolean z = false;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                        return;
                    }
                    f.a(activity, true);
                    if (f.c(activity, false) != f.c(activity, true)) {
                        z = true;
                    }
                    if (z) {
                        h.this.a(activity, activity.getResources().getConfiguration());
                    } else if (!a.a().h(activity)) {
                    } else {
                        h.a(h.this, "checkOnActivityResumedLifecycle", activity);
                    }
                }
            });
        }
    }

    private void a(final String str, final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a5b204", new Object[]{this, str, activity});
        } else {
            this.p.post(new Runnable() { // from class: com.taobao.android.autosize.h.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    int i = 1;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    h hVar = h.this;
                    if (!h.a(hVar, h.b(hVar), h.b(h.this).getResources().getConfiguration())) {
                        i = 2;
                    }
                    if (i == h.c(h.this)) {
                        return;
                    }
                    h.c(h.this, i);
                    TLog.loge("TBAutoSize.ConfigInterface", "newType != nowScreenChangeType, recall onScreenChanged, type=" + str);
                    h hVar2 = h.this;
                    h.a(hVar2, h.b(hVar2).getResources().getConfiguration(), activity);
                }
            });
        }
    }

    private void a(Configuration configuration, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1262b5da", new Object[]{this, configuration, activity});
            return;
        }
        f.a(activity == null ? h() : activity, true);
        f.c(activity == null ? h() : activity, true);
        k.a(activity == null ? h() : activity, true);
        if (a.a().w()) {
            this.h = configuration.screenWidthDp;
            this.i = configuration.screenHeightDp;
        } else {
            Configuration configuration2 = this.g.getResources().getConfiguration();
            this.h = configuration2.screenWidthDp;
            this.i = configuration2.screenHeightDp;
        }
        TLog.loge("TBAutoSize.ConfigInterface", "notifyConfigurationChanged: activity=" + activity + ", configuration=" + configuration);
        if (a((!a.a().m() || activity == null) ? this.g : activity, configuration)) {
            a(activity, 1, configuration);
        } else {
            a(activity, 2, configuration);
        }
    }

    private void a(Activity activity, int i, Configuration configuration) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ea080c7", new Object[]{this, activity, new Integer(i), configuration});
            return;
        }
        for (OnScreenChangedListener onScreenChangedListener : this.n) {
            TLog.loge("TBAutoSize.ConfigInterface", "notifyConfigurationChanged:" + onScreenChangedListener);
            a(onScreenChangedListener, activity, i, configuration);
        }
        for (OnScreenChangedListener onScreenChangedListener2 : this.o) {
            TLog.loge("TBAutoSize.ConfigInterface", "notifyConfigurationChanged:" + onScreenChangedListener2);
            a(onScreenChangedListener2, activity, i, configuration);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("notifyConfigurationChanged:isPortraitLayout = ");
        if (i == 1) {
            z = true;
        }
        sb.append(z);
        sb.append(", new dpi = ");
        sb.append(configuration.densityDpi);
        sb.append(", new widthDP = ");
        sb.append(configuration.screenWidthDp);
        sb.append(", new heightDP = ");
        sb.append(configuration.screenHeightDp);
        TLog.loge("TBAutoSize.ConfigInterface", sb.toString());
    }

    private void a(OnScreenChangedListener onScreenChangedListener, Activity activity, int i, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a05f7fe7", new Object[]{this, onScreenChangedListener, activity, new Integer(i), configuration});
            return;
        }
        onScreenChangedListener.onScreenChanged(i, configuration);
        if (activity == null) {
            return;
        }
        onScreenChangedListener.onActivityChanged(activity, i, configuration);
    }

    private void e(Application application) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78781df3", new Object[]{this, application});
            return;
        }
        if (!a((Context) application, application.getResources().getConfiguration())) {
            i = 2;
        }
        this.q = i;
        b(new OnScreenChangedListener() { // from class: com.taobao.android.autosize.h.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public /* synthetic */ void onActivityChanged(Activity activity, int i2, Configuration configuration) {
                OnScreenChangedListener.CC.$default$onActivityChanged(this, activity, i2, configuration);
            }

            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public void onScreenChanged(int i2, Configuration configuration) {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i2), configuration});
                    return;
                }
                h hVar = h.this;
                if (h.c(hVar) != i2) {
                    z = false;
                }
                h.a(hVar, z);
                h.c(h.this, i2);
            }
        });
    }

    private boolean a(Context context, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17021994", new Object[]{this, context, configuration})).booleanValue();
        }
        if (a.a().l()) {
            this.u = c(context, configuration);
        } else {
            this.u = b(context, configuration);
        }
        return this.u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (com.taobao.android.autosize.l.b(r0) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (com.taobao.android.autosize.l.b(h()) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean b(android.content.Context r12, android.content.res.Configuration r13) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.autosize.h.b(android.content.Context, android.content.res.Configuration):boolean");
    }

    private boolean c(Context context, Configuration configuration) {
        boolean b;
        boolean a2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2810996", new Object[]{this, context, configuration})).booleanValue();
        }
        if (!l.b(context) && !l.d(context)) {
            return true;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            b = l.b(activity);
            a2 = l.a(activity);
        } else {
            b = l.b(h());
            a2 = l.a(h());
        }
        if (b) {
            TLog.loge("TBAutoSize.ConfigInterface", "isPortraitLayoutV2=true isEasyGoOpen=true context=" + context);
            return true;
        } else if (a2) {
            ScreenType d = d(context);
            if (d == ScreenType.MIN || d == ScreenType.SMALL) {
                z = true;
            }
            TLog.loge("TBAutoSize.ConfigInterface", "isInMultiWindowMode=true isPortraitLayoutRealV2=" + z + ", screenType=" + d);
            return z;
        } else {
            ScreenType d2 = d(context);
            if (d2 == ScreenType.MIN || d2 == ScreenType.SMALL) {
                TLog.loge("TBAutoSize.ConfigInterface", "isPortraitLayoutRealV2=true, screenType=" + d2);
                return true;
            }
            if ((configuration.screenWidthDp * 1.0d) / configuration.screenHeightDp < 0.88d) {
                z = true;
            }
            TLog.loge("TBAutoSize.ConfigInterface", "isPortraitLayoutRealV2=" + z + " widthHeightRate=" + ((configuration.screenWidthDp * 1.0d) / configuration.screenHeightDp) + " width=" + configuration.screenWidthDp + " height=" + configuration.screenHeightDp);
            return z;
        }
    }

    public boolean b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue() : this.u;
    }

    public float a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68a25aa", new Object[]{this, activity})).floatValue();
        }
        Rect a2 = i.a(activity);
        float f = activity.getResources().getDisplayMetrics().density;
        float f2 = 1.0f;
        if (a2.width() > 0) {
            float f3 = f * 375.0f;
            if (a2.width() < f3) {
                f2 = a2.width() / f3;
            }
        }
        TLog.loge("TBAutoSize.ConfigInterface", "getScalingRatio=" + f2);
        return f2;
    }

    public int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb91", new Object[]{this, context})).intValue();
        }
        int a2 = a(context);
        StringBuilder sb = new StringBuilder();
        sb.append("getSplitWindowWidthPx=");
        int i = a2 / 2;
        sb.append(i);
        TLog.loge("TBAutoSize.ConfigInterface", sb.toString());
        return i;
    }

    public static int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{context, new Float(f)})).intValue() : (int) ((context.getResources().getDisplayMetrics().density * f) + 0.5f);
    }

    public static int b(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3a785794", new Object[]{context, new Float(f)})).intValue() : (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public WindowType a(int i) {
        WindowType windowType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowType) ipChange.ipc$dispatch("d5786754", new Object[]{this, new Integer(i)});
        }
        if (i < 300) {
            windowType = WindowType.MIN;
        } else if (i <= 500) {
            windowType = WindowType.SMALL;
        } else if (i <= 960) {
            windowType = WindowType.MEDIUM;
        } else if (i <= 1050) {
            windowType = WindowType.LARGE;
        } else {
            windowType = WindowType.MAX;
        }
        TLog.loge("TBAutoSize.ConfigInterface", "getWindowType=" + windowType);
        return windowType;
    }

    public WindowType b(Activity activity) {
        WindowType windowType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowType) ipChange.ipc$dispatch("9c3f4874", new Object[]{this, activity});
        }
        int b = b(activity, i.a(activity).width());
        if (b < 300) {
            windowType = WindowType.MIN;
        } else if (b <= 500) {
            windowType = WindowType.SMALL;
        } else if (b <= 960) {
            windowType = WindowType.MEDIUM;
        } else if (b <= 1050) {
            windowType = WindowType.LARGE;
        } else {
            windowType = WindowType.MAX;
        }
        TLog.loge("TBAutoSize.ConfigInterface", "getWindowType=" + windowType);
        return windowType;
    }

    @Deprecated
    public ScreenType d(Context context) {
        ScreenType screenType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScreenType) ipChange.ipc$dispatch("281f2a76", new Object[]{this, context});
        }
        int b = b(context, a(context));
        if (b < 300) {
            screenType = ScreenType.MIN;
        } else if (b <= 500) {
            screenType = ScreenType.SMALL;
        } else if (b <= 960) {
            screenType = ScreenType.MEDIUM;
        } else if (b <= 1050) {
            screenType = ScreenType.LARGE;
        } else {
            screenType = ScreenType.MAX;
        }
        TLog.loge("TBAutoSize.ConfigInterface", "getScreenType=" + screenType);
        return screenType;
    }

    public void b(OnScreenChangedListener onScreenChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc2daaa7", new Object[]{this, onScreenChangedListener});
        } else {
            this.n.add(onScreenChangedListener);
        }
    }

    public void c(OnScreenChangedListener onScreenChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("891ac1c6", new Object[]{this, onScreenChangedListener});
        } else {
            this.o.add(onScreenChangedListener);
        }
    }

    public boolean d(OnScreenChangedListener onScreenChangedListener) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1607d8e9", new Object[]{this, onScreenChangedListener})).booleanValue() : this.o.remove(onScreenChangedListener) || this.n.remove(onScreenChangedListener);
    }

    public int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{this, context})).intValue();
        }
        int a2 = a(context, this.h);
        TLog.loge("TBAutoSize.ConfigInterface", "getScreenWidth: " + a2);
        return a2 > 0 ? a2 : m.a(context)[0];
    }

    public int e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0d012cf", new Object[]{this, context})).intValue();
        }
        int a2 = a(context, this.i);
        return a2 > 0 ? a2 : m.a(context)[1];
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.f;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.b;
    }

    public float d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2db", new Object[]{this})).floatValue() : this.c;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.d;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.e;
    }

    public ArrayList<String> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("c42eda48", new Object[]{this}) : j;
    }

    public void a(Application application, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7743f19", new Object[]{this, application, configuration});
            return;
        }
        this.b = configuration.densityDpi;
        this.c = configuration.densityDpi / 160.0f;
        this.d = configuration.screenWidthDp;
        this.e = configuration.screenHeightDp;
        TLog.loge("TBAutoSize.ConfigInterface", "reset configuration done, new dpi = " + this.b + ", new widthDP = " + this.d + ", new heightDP = " + this.e);
    }

    public Activity h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("2e540519", new Object[]{this});
        }
        hup hupVar = this.m;
        if (hupVar != null) {
            return hupVar.a();
        }
        return null;
    }

    public boolean f(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a17cbe7f", new Object[]{this, context})).booleanValue() : m.b(context);
    }

    public boolean c(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("792c4740", new Object[]{this, activity})).booleanValue() : m.a(activity);
    }
}
